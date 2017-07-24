/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
 package fr.inria.diverse.k3.al.annotationprocessor

import java.io.IOException
import java.util.ArrayList
import java.util.List
import java.util.Map
import java.util.Properties
import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.file.Path

/**
 * This class is in charge of building and updating the property file that list all the Aspect classes for a given Class
 * It mus tbe called within the doGenerateCode() of the ClassProcessor
 * This builder will do nothing if called without annotated element
 */
class AspectMappingBuilder {

	// list of annotated classes
	var List<? extends MutableClassDeclaration> classes;

	// destination properties file
	var Path targetFilePath

	/** internal map */
	private val Map<String, List<String>> mapping = newHashMap


	/** Rebuild mapping from existing property file*/
	public def void readCurrentMapping(List<? extends MutableClassDeclaration> classes, extension TransformationContext context){
		this.classes = classes
		//this.context = context
		if (classes.size > 0) {
			val filePath = classes.head.compilationUnit.filePath
			targetFilePath = filePath.projectFolder.append('''/META-INF/xtend-gen/«filePath.projectFolder.lastSegment».k3_aspect_mapping.properties''')
		}
		if (classes.size > 0) {
			val Properties properties = new Properties();
			if(targetFilePath.exists){
				try {
					properties.load(targetFilePath.contentsAsStream)
					properties.forEach[propKey, commaSeparatedPropvalues|
						val propValues = (commaSeparatedPropvalues as String).split(",").map[s | s.trim]
						propValues.forEach[propValue | addMapping(propKey as String, propValue)]
					]
				} catch (IOException e) {
					// ...
				}
			}
		}
	}

	/** try to clean unused mappings */
	public def void cleanUnusedMapping(extension TransformationContext context){
		if (classes.size > 0) {

			val List<String> keytoRemove = new ArrayList<String>
			mapping.forEach[key, valueList|
				// recompute a value list that contains only types that are found in the classpath
				val List<String> newValueList = valueList.filter[value | findTypeGlobally(value)!==null].toList
				mapping.put(key, newValueList)
				if(newValueList.size == 0){
					keytoRemove.add(key)
				}
			]
			keytoRemove.forEach[key | mapping.remove(key)]
		}
	}

	public def void addMappingForAnnotatedSourceElements(){
		for (annotatedSourceElement : classes) {
			val aspectizedClassType = Helper::getAnnotationAspectType(annotatedSourceElement)

			if (aspectizedClassType !== null) {
				addMapping(aspectizedClassType.name, annotatedSourceElement.qualifiedName)
			}
		}

	}

	public def void writePropertyFile(extension CodeGenerationContext context){
		// classes can be null in case of syntax or compilation error in the file, the doTransform isn't processed but doGenerateCode will be called anyway 
		if (classes != null && classes.size > 0) {
			var buf = ''''''
			for (entrySet : mapping.entrySet) {
				buf = '''«buf.toString»
«entrySet.key» = «FOR aString : entrySet.value SEPARATOR ', '»«aString»«ENDFOR»'''
			}

			val contents = '''# List of the Java classes that have been aspectized and name of the aspect classes separated by comma
	«buf.toString»'''
			var write = false
			if (!targetFilePath.exists)
			{
				write = true
			}
			else if (targetFilePath.contents != contents) // compare new contents and old contents before file is written	
			{
				write = true	
			}
			if (write)
			{
				targetFilePath.contents = contents 	
			}
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