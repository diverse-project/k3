package fr.inria.diverse.k3.al.annotationprocessor

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Scanner
import java.util.Set
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.CompilationUnit
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.file.Path

/**
 * Provides methods for managing the generation of the static dispatch in the current project
 */
class ProjectStaticDispatchBuilder {
	
	public static final String STATICDISPATCH_GENFOLDER= "staticdispatch-gen"
	public static final String INCREMENTALSTATICDISPATCH_FILEEXT = "isdp"
	
	val Set<String> dispatchStaticInjection = newHashSet
	
	/**
	 * @param context code generation context
	 * 
	 */
	public def void writeTempStaticDispatchFile(CompilationUnit compilationUnit, extension CodeGenerationContext context){
		val fileRelativePath = compilationUnit.filePath.relativize(compilationUnit.filePath.sourceFolder)
		val destFileName = fileRelativePath.toString.replaceAll("/",".")
		var Path targetFilePath = compilationUnit.filePath.projectFolder.append(
			"/"+STATICDISPATCH_GENFOLDER+"/"+
			destFileName 
			+ "."+ INCREMENTALSTATICDISPATCH_FILEEXT)
		if(!dispatchStaticInjection.empty) {
			val contents = dispatchStaticInjection.join("\n")
			Helper::writeContentsIfNew(targetFilePath, contents, context)	
		} else if(targetFilePath.exists) {
			targetFilePath.delete
		}
	}
	
	/**
	 * remove dispatch file that looks to be irrelevant for the build due to missing equivalent xtend files
	 */
	public def void cleanDeprecatedDispatchFiles(CompilationUnit compilationUnit, extension CodeGenerationContext context){
		// check that the files have their xtend equivalent in the src folder
			// if not delete them
			var Path folderPath = compilationUnit.filePath.projectFolder.append("/"+STATICDISPATCH_GENFOLDER)
			
			 val childWithCorrectExtension = folderPath.children.filter[f | f.fileExtension !== null && f.fileExtension == INCREMENTALSTATICDISPATCH_FILEEXT]
			
			val sourceFolders = compilationUnit.compilationUnit.filePath.projectSourceFolders
			childWithCorrectExtension.forEach[f| 
				val intermediate = f.lastSegment.toString.replaceAll("\\.","/")
				if(intermediate.endsWith("/xtend/"+INCREMENTALSTATICDISPATCH_FILEEXT)){
					val srcXtendFile = intermediate.substring(0, intermediate.lastIndexOf("/xtend/"+INCREMENTALSTATICDISPATCH_FILEEXT)) + ".xtend"
					//sourceFolders.forEach[sfolder | println("looking for " +sfolder.append(srcXtendFile)+ " "+sfolder.append(srcXtendFile).exists)]
					if( !sourceFolders.exists[ sfolder | sfolder.append(srcXtendFile).exists] ) {
						// delete the file 
						f.delete
					}
				}
			]
	}
	
	def add(String dispatchInjectCodeForParent) {
		dispatchStaticInjection.add(dispatchInjectCodeForParent)
	}
	
	/**
	 * retrieves a list of applicable method dispatch for the parent method
	 * Looks into the current project resources for stored files with dispatch to inject
	 */
	def List<String> findExistingDispatchCalls(MutableMethodDeclaration methodDecl, extension TransformationContext context) {
		
		val targetClassQName =  methodDecl.declaringType.qualifiedName
		if(dispatchCodeForClass.empty){
			// create an entry and fill it from data in saved files
			var Path folderPath = methodDecl.compilationUnit.filePath.projectFolder.append("/"+STATICDISPATCH_GENFOLDER)
			val validChild = folderPath.children.filter[f | f.fileExtension !== null && f.fileExtension == INCREMENTALSTATICDISPATCH_FILEEXT]
			
			// use the rest as input for dispatch injection
			validChild.forEach[f|
					//println("reading "+f.lastSegment + " for "+targetClassQName + " by "+ this)
					parseAndCacheDispatchStaticInjection(f.contents.toString)
				]
		} /* else {
			println("not reading files for "+targetClassQName)
		}*/
		if(dispatchCodeForClass.get(targetClassQName) === null){
			return #[]
		}
		val result = dispatchCodeForClass.get(targetClassQName).get(Helper.initialMethodSignature(methodDecl))
		if(result !== null) return result
		else return #[]
	}
	
	private def void addDispatchCodeInCache(String targetClass, String targetMethod, String dispatchCode){
		if(dispatchCodeForClass.get(targetClass) === null){
			dispatchCodeForClass.put(targetClass, new HashMap<String, List<String>>)
		}
		val targetClassEntry = dispatchCodeForClass.get(targetClass)
		if(targetClassEntry.get(targetMethod) === null){
			targetClassEntry.put(targetMethod, new ArrayList<String>)
		}
		targetClassEntry.get(targetMethod).add(dispatchCode)
	}
	
	/**
	 * cache to avoid reading file content too often
	 * first key : target class qualified name
	 * second key : target method
	 * value : list of code to inject
	 */
	val HashMap<String, HashMap<String, List<String>>> dispatchCodeForClass = new HashMap<String, HashMap<String, List<String>>>()
	
	/**
	 * scan string content for method dispatch that apply to the targetAspectClass
	 * the result is sorted in the cache
	 */
	public def void  parseAndCacheDispatchStaticInjection(String content) {
		val Scanner scanner = new Scanner(content);
		var StringBuilder sb = new StringBuilder
		var String currentTargetMethod = ""
		var String currentTargetClass = ""
		val Pattern regexTargetAspectClass = Pattern.compile("// BeginInjectInto ([^#]+)*#");
		val Pattern regexTargetMethod = Pattern.compile("#([^#].+\\))");
		while (scanner.hasNextLine()) {
			val String currentLine = scanner.nextLine();			
			if (currentLine.contains("// BeginInjectInto")) {
				val Matcher tclassmatcher = regexTargetAspectClass.matcher(currentLine);
				if(tclassmatcher.find) {
					currentTargetClass = tclassmatcher.group(1)
					val Matcher tmethodmatcher = regexTargetMethod.matcher(currentLine);
					if(tmethodmatcher.find) {
						currentTargetMethod=tmethodmatcher.group(1)							
					}
				}
				sb.append(currentLine);
				sb.append("\n")
			} else if (currentLine.contains("// EndInjectInto")) {
				sb.append(currentLine);
				sb.append("\n")
				addDispatchCodeInCache(currentTargetClass, currentTargetMethod, sb.toString)
				sb = new StringBuilder
			} else {
				sb.append(currentLine);
				sb.append("\n")
			}
		}
	}
	
}
