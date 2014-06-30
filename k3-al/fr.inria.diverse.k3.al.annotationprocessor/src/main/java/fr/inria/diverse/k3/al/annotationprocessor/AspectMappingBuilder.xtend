package fr.inria.diverse.k3.al.annotationprocessor

import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.macro.file.Path
import java.util.Properties

/**
 * This class is in charge of building and updating the property file that list all the Aspect classes for a given Class
 * It mus tbe called within the doGenerateCode() of the ClassProcessor
 * This builder will do nothing if called without annotated element 
 */
class AspectMappingBuilder {
	
	val List<? extends ClassDeclaration> annotatedSourceElements
	
	val extension CodeGenerationContext context
	
	var Path targetFilePath
	
	/** internal map */
	private val Map<String, List<String>> mapping = newHashMap
	
	new(List<? extends ClassDeclaration> annotatedSourceElements, extension CodeGenerationContext context) {
		this.annotatedSourceElements = annotatedSourceElements
		this.context = context
		if (annotatedSourceElements.size > 0) {
			val filePath = annotatedSourceElements.head.compilationUnit.filePath
			targetFilePath = filePath.projectFolder.append('''/META-INF/xtend-gen/«filePath.projectFolder.lastSegment».k3_aspect_mapping.properties''')
		}	
			
	}
	
	/** Rebuild mapping from existing property file*/
	public def void readCurrentMapping(){
		if (annotatedSourceElements.size > 0) {
			val Properties properties = new Properties();
			if(targetFilePath.exists){
				properties.load(targetFilePath.contentsAsStream)
				properties.forEach[propKey, commaSeparatedPropvalues|
					val propValues = (commaSeparatedPropvalues as String).split(",").map[s | s.trim]
					propValues.forEach[propValue | addMapping(propKey as String, propValue)]
				]			
			}
		}
	}
	
	/** try to clean unused mappings */
	public def void cleanUnusedMapping(){
		if (annotatedSourceElements.size > 0) {
			
		}
	}
	
	public def void addMappingForAnnotatedSourceElements(){
		for (annotatedSourceElement : annotatedSourceElements) {
			val aspectizedClassType = Helper::getAnnotationAspectType(annotatedSourceElement)

			if (aspectizedClassType !== null) {
				addMapping(aspectizedClassType.name, annotatedSourceElement.qualifiedName)
			}
		}
		
	}
	
	public def void writePropertyFile(){
		if (annotatedSourceElements.size > 0) {
			var buf = ''''''
			for (entrySet : mapping.entrySet) {
				buf = '''«buf.toString»
«entrySet.key» = «FOR aString : entrySet.value SEPARATOR ', '»«aString»«ENDFOR»'''
			}

			targetFilePath.contents = '''# List of the Java classes that have been aspectized and name of the aspect classes separated by comma
«buf.toString»'''

		}
	}
	
	private def void addMapping(String aspectizedClassName, String aspectClassName){
		var existingListForAspectizedElement = mapping.get(aspectizedClassName)

		if (existingListForAspectizedElement === null) {
			existingListForAspectizedElement = newArrayList
			mapping.put(aspectizedClassName, existingListForAspectizedElement)
		}
		if(!existingListForAspectizedElement.contains(aspectClassName)){
			existingListForAspectizedElement.add(aspectClassName)		
		}
	}
	
}