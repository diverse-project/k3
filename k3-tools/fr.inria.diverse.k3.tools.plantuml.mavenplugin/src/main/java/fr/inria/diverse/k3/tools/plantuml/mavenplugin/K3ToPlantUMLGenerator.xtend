package fr.inria.diverse.k3.tools.plantuml.mavenplugin

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.core.XtendStandaloneSetup
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile
import com.google.common.io.Files
import java.io.File
import com.google.inject.Inject
import com.google.common.base.Charsets
import java.util.List
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.xtend.core.xtend.XtendFunction
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration
import org.eclipse.xtext.xbase.XbaseQualifiedNameConverter
import org.eclipse.xtend.core.xtend.XtendInterface
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtext.xbase.XListLiteral
import org.eclipse.xtext.xbase.XTypeLiteral

/**
 * Current limitations: use simpleName instead of identity, this means that in case of several classes with the same name but in different packages will produce a correct output
 */

class K3ToPlantUMLGenerator {
	
	
	
	public static final String ASPECT_ANNOTATION_FQN =	"fr.inria.diverse.k3.al.annotationprocessor.Aspect"
	public static final String ASPECT_ANNOTATION_PARAMETER = "className"
	public static final String ASPECT_ANNOTATION_WITH_PARAMETER = "with"
	
	protected HashMap<String, List<String>> packagesTypes = new HashMap<String, List<String>>()
	protected List<String> links = new ArrayList<String>()
	
	
	public def void generatePlantUMLForFile(String inputFilePath, String plantUmlFilePath){
		generatePlantUMLForFile(inputFilePath, "", plantUmlFilePath)
	}
	
	public def void generatePlantUMLForFile(String inputFilePath, String basePackage, String plantUmlFilePath){
		generateForFile(inputFilePath, basePackage)
		writeResultToPlantUMlFile(plantUmlFilePath)
	}
	
	public def void generatePlantUMLForFolder(String inputFolderPath, String basePackage, String plantUmlFilePath){
		generateForFolder(inputFolderPath, basePackage)
		writeResultToPlantUMlFile(plantUmlFilePath)
	}
	
	public def void generateForFolder(String inputFolderPath, String basePackage){
		val folderFile = new File(inputFolderPath)
		folderFile.listFiles.forEach[folderContent |
			println(folderContent.path) 
			switch folderContent{
					
				case folderContent.isFile() && folderContent.name.endsWith(".xtend"):{
					generateForFile(folderContent.path, basePackage)
				}
				case folderContent.isDirectory():{
					generateForFolder(folderContent.path, basePackage)
					
				}
			}
		]
	}
	
	public def void generateForFile(String inputFilePath, String basePackage){
		XtendStandaloneSetup::doSetup
		val rs = new ResourceSetImpl
		val fileUri = URI::createFileURI(inputFilePath)
		val res = rs.getResource(fileUri, true)
		val ast = res.contents.head as XtendFile
		
		val currentPackageName = if(ast.package.startsWith(basePackage)){
			ast.package.replaceFirst(basePackage, "")
		} else ast.package
		val packageTypes = new ArrayList<String>
		packagesTypes.put(currentPackageName,packageTypes)

		ast.xtendTypes.forEach[	t|
			
			println(t.name)	
			val typeKind = switch t {
				XtendInterface:
					"interface"
				XtendClass case t.modifiers.contains("abstract"):{
					"abstract"
				}
				XtendClass:{
					"class"
				}
			}
			
		//	<< (@,#FF7700) Aspect >>
				
			val typePlantUMlString = '''«typeKind»	«t.name» «IF t.isK3Aspect»<< (@,#FF7700) Aspect >> «ENDIF»{
	«FOR member : t.members.filter(XtendField)»
		«member.name» : «member.type.type.simpleName»
	«ENDFOR»
	«FOR func : t.members.filter(XtendFunction)»
		«IF func.returnType != null»«func.returnType.type.simpleName»«ENDIF» «func.name»(«FOR param : func.parameters 
			SEPARATOR ', '»«param.name» : «IF param.parameterType != null»«param.parameterType.type.simpleName»«ENDIF»«ENDFOR»)
	«ENDFOR»				
}'''
			packagesTypes.get(currentPackageName).add(typePlantUMlString)	
			
			
			// java inheritance
			switch t {
				XtendInterface: {
					t.extends.forEach[ extendedInterface |
						links.add('''«extendedInterface.simpleName» <|-- «t.name»''')	
					]
				}
				XtendClass:{
					if(t.extends != null){
						links.add('''«t.extends.simpleName» <|-- «t.name»''')
					}
					t.implements.forEach[ extendedInterface |
						links.add('''«extendedInterface.simpleName» <|.. «t.name»''')	
					]	
				}
			}
			
			// Aspects
			if(t.isK3Aspect){
				links.add('''«t.extractAspectAnnotationClassName.lastSegment» .. «t.name» : <''')	
				// aspect inheritance
				t.extractAspectAnnotationWith.forEach[ w | 
					links.add('''«w.lastSegment» <|.. «t.name»''')
				]			
			}
		

			
		]
			
		
		
	}
	
	private def boolean isK3Aspect(XtendTypeDeclaration typeDecl){
		return typeDecl.annotations.exists[ annot |
			annot.annotationType.qualifiedName == ASPECT_ANNOTATION_FQN]
	}
	
	/**
	 * Parses the given {@link XtendTypeDeclaration} {@code typeDecl} to extract the value
	 * of its {@code className} annotation parameter in the form of a
	 * {@link QualifiedName}
	 */
	private def QualifiedName extractAspectAnnotationClassName(XtendTypeDeclaration typeDecl) {
		val aspAnn = typeDecl.annotations.findFirst[ annot |
			annot.annotationType.qualifiedName == ASPECT_ANNOTATION_FQN]
		val aspClassName = aspAnn?.elementValuePairs.findFirst[elemValuePair | elemValuePair.element.simpleName.equals(ASPECT_ANNOTATION_PARAMETER)].value
		//	println(aspClassName)
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue:
				aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: {
				val feature = aspClassName.values?.head as XAbstractFeatureCall
				feature.feature.qualifiedName
			}
			XFeatureCall: 
				aspClassName.feature.qualifiedName
			XTypeLiteral:
				aspClassName.type.qualifiedName				
		}
		val qnConverter = new XbaseQualifiedNameConverter()
		return qnConverter.toQualifiedName(aspVal)
	}
	
	private def List<QualifiedName> extractAspectAnnotationWith(XtendTypeDeclaration typeDecl) {
		val result = new ArrayList<QualifiedName>()
		val aspAnn = typeDecl.annotations.findFirst[ annot |
			annot.annotationType.qualifiedName == ASPECT_ANNOTATION_FQN]
		val aspWithElemValue = aspAnn?.elementValuePairs.filter[elemValuePair | elemValuePair.element.simpleName.equals(ASPECT_ANNOTATION_WITH_PARAMETER)]

		val qnConverter = new XbaseQualifiedNameConverter()
		
		aspWithElemValue.forEach[ elemValue | 
			val aspWith = elemValue.value
		
			println(" -- "+aspWith)
			switch aspWith {
				XListLiteral:
					aspWith.elements.forEach[lit |
						result.add(qnConverter.toQualifiedName(lit.toString)) 
						//println(" +++ "+lit)
					]			
				XFeatureCall: 
					aspWith.feature.qualifiedName				
			}
						
		]		

		
		
		
		return result
	}
	
	/**
	 * Parses the given {@link JvmDeclaredType} {@code t} to extract the value
	 * of its {@code className} annotation parameter in the form of a
	 * {@link QualifiedName}
	 */
	private def QualifiedName extractAspectAnnotationValue(JvmDeclaredType t) {
		val aspAnn = t.annotations.findFirst[
			annotation?.qualifiedName == ASPECT_ANNOTATION_FQN]
		val aspClassName = aspAnn?.values?.findFirst[
			valueName == ASPECT_ANNOTATION_PARAMETER]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue:
				aspClassName.values?.head?.qualifiedName
			JvmCustomAnnotationValue: {
				val feature = aspClassName.values?.head as XAbstractFeatureCall
				feature.feature.qualifiedName
			}
		}
		
		val qnConverter = new XbaseQualifiedNameConverter()
		return qnConverter.toQualifiedName(aspVal)
	}
	
	
	protected def void writeResultToPlantUMlFile(String plantUmlFilePath){
		val plantUmlFile = new File(plantUmlFilePath)
		val content = '''@startuml

skinparam class {
	BackgroundColor White
	ArrowColor Black
	BorderColor Black
}
«FOR packag : packagesTypes.keySet»
«IF ! packag.empty»
package «packag» {
«ENDIF»  
	«FOR type : packagesTypes.get(packag)»
	«type»
	«ENDFOR»    
«IF ! packag.empty»
}
«ENDIF»      
«ENDFOR»
«FOR link : links»«link»      
«ENDFOR»
@enduml
'''
		Files.createParentDirs(plantUmlFile)
		Files.write(content, plantUmlFile,  Charsets.UTF_8)
	}
}