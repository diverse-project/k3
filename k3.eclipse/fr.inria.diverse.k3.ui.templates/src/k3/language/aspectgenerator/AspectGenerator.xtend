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
 package k3.language.aspectgenerator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension k3.language.aspectgenerator.EPackageAspect.*
import static extension k3.language.aspectgenerator.EClassAspect.*
import java.util.ArrayList
import java.util.List
import java.io.File

class AspectGenerator{


	public def static void main(String[] args) {
		//println('Hello Kermeta on top of Xtend!')
		println(System.getProperty("user.dir") + "/target/");
		val String projectPath = System.getProperty("user.dir") + "/target/"
		val String projectName = "aspectKermeta"
		val File dir =  new File(projectPath+projectName+"/src");
		dir.mkdirs
		val String operationName = "eval"
		val List<String> listNewClass = new ArrayList<String>()
		val List<String> operationParams = new ArrayList<String>()
		listNewClass.add("Context")
		listNewClass.add("Essai")
		operationParams.add("Context context")
		operationParams.add("Essai test")
		
		aspectGenerate( projectPath, projectName, "ASMLogo.ecore", "", "testbase", ".aspects", operationName, operationParams,  listNewClass)

	}
	
	public def static Context aspectGenerate( String projectPath, String projectName,  String ecoreURI, String ecoreBasePackage, String aspectBasePackage, String aspectPackPostFix, String operationName, List<String> operationParams, List<String> listNewClass) {
		val Context context = new Context( projectPath, projectName,  ecoreBasePackage, aspectBasePackage, aspectPackPostFix, operationName, listNewClass, operationParams)
		
		//Load Ecore Model
		val fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
		
		val rs = new ResourceSetImpl()
		val uri = URI.createURI(ecoreURI)
		val res = rs.getResource(uri, true)

		val EPackage p = res.contents.get(0) as EPackage
		p.generateAspect(context)
		generateClass(context)
		return context
	}
	
	private static def void generateClass(Context context) {
		
		// initialization of the content of file "Context.xtend"
		val StringBuffer content = new StringBuffer
		
		
		for(c : context.listNewClass) {
			content.append("package " + context.projectName + "\n\n")
			content.append("class "+ c +" {\n\n")
			content.append("\tnew (){\n\n\t}")
			content.append("\n\n}\n")
			println(context.projectPath)
			println(context.projectPath)
			FileManager.writeFile(context.projectPath, c, context.projectName, content.toString)
			content.delete(0, content.length)
		}
	}
}

@Aspect(className=typeof(EPackage)) 
class EPackageAspect { 
	
	public def void generateAspect(Context context) {		
		
		for (p : _self.ESubpackages){
			 p.generateAspect(context)
		}
		
		if (_self.EClassifiers.exists[elt | elt instanceof EClass]) {
			
			context.createdPackages.add(_self.getAspectPackageQualifiedName(context))			
			for(c : _self.EClassifiers){
				if(c instanceof EClass) {
					(c as EClass).generateAspect(context)
				}
			}
			_self.manageImport(context)
			println(" _self.getAspectPackageQualifiedName(context)="+ _self.getAspectPackageQualifiedName(context))
			FileManager.writeFile(context.projectPath, _self.name+"Aspects", _self.getAspectPackageQualifiedName(context), context.kmtContent.toString)
			context.classCollection = new ArrayList<String>
			context.classAspectCollection = new ArrayList<String>
			context.kmtContent = new StringBuffer
			
		}

	}
	
	/** 
	 * returns the qualified name for the package containing the aspect for this EPackage
	 */
	def public String getAspectPackageQualifiedName(Context context){
		if(context.aspectBasePackage.isEmpty)
			return _self.getEPackageQualifiedName(context) + context.aspectPackagePostFix
		else
			return context.aspectBasePackage+"."+_self.getEPackageQualifiedName(context) + context.aspectPackagePostFix
	}
	def public String getEcoreBasePackageQualifiedName(Context context){
		if(context.ecoreBasePackage.isEmpty)
			return _self.getEPackageQualifiedName(context) 
		else
			return context.ecoreBasePackage+"."+_self.getEPackageQualifiedName(context) 
	}
	
	def public String getEPackageQualifiedName(Context context){
		if(_self.ESuperPackage !== null){
			return _self.ESuperPackage.getEPackageQualifiedName(context)+"."+_self.name
		}
		else {
			return _self.name
		}
	}
	
	def private void manageImport(Context context) {
		var String aspectPackQualifiedName = _self.getAspectPackageQualifiedName(context)
		var StringBuffer aspect = new StringBuffer
		
		aspect.append("package " + aspectPackQualifiedName + "\n\n")			
		aspect.append("import fr.inria.diverse.k3.al.annotationprocessor.Aspect\n")
		
		if(context.isOverride) {
			aspect.append("import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod\n")			
		}
		
		for (c : context.listNewClass)
		{
			aspect.append("import " + context.projectName + "." + c + "\n")
		}
		
		for (cl : context.classCollection){
			aspect.append("import " + _self.getEcoreBasePackageQualifiedName(context) + "." + cl + "\n")
		}
		
		aspect.append("\n")
		
		for (cl : context.classAspectCollection){
			aspect.append("import static extension " + aspectPackQualifiedName + "." + cl + ".*\n")
		}
		
		aspect.append("\n")
		context.kmtContent.insert(0, aspect.toString)
		context.kmtContent.append("\n\n")
	}
}

@Aspect(className=typeof(EClass)) 
class EClassAspect {
	
		def public void generateAspect(Context context) {
			
			_self.writeOpenClass(context)
			if(context.nameOperation !== null) {
				_self.writeOperation(context)
			}
			_self.writeCloseClass(context)
			
		}
		
		def private void writeOpenClass (Context context) {
			var String scriptNewClass = ""
			
			_self.addClass (context)
			
			scriptNewClass = scriptNewClass + "@Aspect(className=" + _self.name + ")\n"
						
			if (_self.abstract) {
				scriptNewClass = scriptNewClass + "abstract class "
			} else {
				scriptNewClass = scriptNewClass + "class "
			}
			scriptNewClass = scriptNewClass + _self.name + "Aspect" 
			if (!_self.ESuperTypes.empty) {
				scriptNewClass = scriptNewClass + " extends " + _self.ESuperTypes.get(0).name + "Aspect"
			}
			scriptNewClass = scriptNewClass + " {\n"
			if(_self.ESuperTypes.length > 1){
				scriptNewClass = scriptNewClass + context.comment_ForMultiInheritence
			}
			
			context.kmtContent.append(scriptNewClass)
		}
		
	def private void writeCloseClass (Context context) {
		context.kmtContent.append("\n}\n\n")
	}
		
	def private void addClass (Context context) {
		context.classCollection.add(_self.name)
		context.classAspectCollection.add(_self.name + "Aspect")
	}
	
	def private void writeOperation (Context context) {
		var StringBuffer operation = new StringBuffer
		
		operation.append("\tdef public void " + context.nameOperation + " (")
		
		for(op : context.operationParams) {
			operation.append(op)
			if(op != context.operationParams.last) {
				operation.append(", ")
			}
		}
		operation.append(")")
		
		if (!_self.ESuperTypes.empty) {
			context.kmtContent.append("\t@OverrideAspectMethod\n")
			context.kmtContent.append(operation)
			context.isOverride = true
		} else {
			context.kmtContent.append(operation)
		}
		context.kmtContent.append(" { \n\n\t}")
			
	}
	
}


