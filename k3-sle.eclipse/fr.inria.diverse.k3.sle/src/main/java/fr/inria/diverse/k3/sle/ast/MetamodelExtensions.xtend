package fr.inria.diverse.k3.sle.ast

import fr.inria.diverse.k3.sle.lib.MatchingHelper

import fr.inria.diverse.k3.sle.metamodel.k3sle.AspectImport
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.io.IOException

import java.util.List
import java.util.Collections

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path

import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil

import org.eclipse.emf.common.util.BasicMonitor

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.naming.QualifiedName

import static extension fr.inria.diverse.k3.sle.ast.ModelTypeExtensions.*
import static extension fr.inria.diverse.k3.sle.ast.NamingHelper.*
import static extension fr.inria.diverse.k3.sle.lib.EcoreExtensions.*

class MetamodelExtensions
{
	static def List<AspectImport> allAspects(Metamodel mm) {
		val ret = newArrayList

		ret += mm.aspects

		if (mm.hasSuperMetamodel)
			ret += mm.inheritanceRelation.superMetamodel.allAspects

		return ret
	}

	// FIXME: More than one pkg bro
	static def typedBy(Metamodel mm, ModelType mt) {
		MatchingHelper.instance.match(mm.exactType.pkgs.head, mt.pkgs.head)
	}

	static def hasSuperMetamodel(Metamodel mm) {
		mm.inheritanceRelation?.superMetamodel !== null
	}

	static def getAspectAnnotationValue(AspectImport asp) {
		// TODO: Remove hard-stringed dependency
		val aspAnn = (asp.aspectRef.type as JvmDeclaredType)?.annotations.findFirst[annotation?.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"]
		val aspClassName = aspAnn?.values?.findFirst[valueName == "className"]
		val aspVal = switch aspClassName {
			JvmTypeAnnotationValue: aspClassName.values?.head?.simpleName
			JvmCustomAnnotationValue: aspClassName.values?.head?.toString
		}

		if (aspVal !== null && aspVal.contains("."))
			return aspVal.substring(aspVal.lastIndexOf(".") + 1, aspVal.length)

		return aspVal
	}

	static def findClass(Metamodel mm, String clsName) {
		mm.allClasses.filter(EClass).findFirst[name == clsName]
	}

	static def findClassifier(Metamodel mm, String clsName) {
		mm.allClassifiers.filter(EClassifier).findFirst[name == clsName]
	}

	static def findClassifierFor(Metamodel mm, String clsName) {
		val cls = mm.findClass(clsName)
		if (cls !== null)
			return cls

		val dt = EcorePackage.eINSTANCE.findClassifier("E" + clsName.toFirstUpper)
		if (dt !== null)
			return dt
	}

	static def getFqnFor(Metamodel mm, EClassifier cls) {
		val qnRet = new StringBuilder
		val pkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]

		mm.genmodels.forEach[gm |
			val allGp = newArrayList
			getAllGenPkgs(gm, allGp)

			allGp.forEach[gp |
				if (gp.getEcorePackage.nsPrefix == pkg.nsPrefix)
					if (gp?.basePackage !== null)
						qnRet.append(QualifiedName.create(gp.basePackage, gp.prefix, cls.name).normalize.toString)
					else
						qnRet.append(QualifiedName.create(gp.prefix, cls.name).normalize.toString)
			]
		]

		return qnRet.toString
	}

	static def getAllSubPkgs(Metamodel mm) {
		val allSubPkgs = newArrayList
		mm.pkgs.head.getAllSubPkgs(allSubPkgs)

		return allSubPkgs
	}

	static def getPackageFqn(Metamodel mm) {
		// TODO: Multiple genmodels
		val genPkg = mm.genmodels.head.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Package").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Package").normalize.toString
	}

	static def getFactoryFqn(Metamodel mm) {
		// TODO: Multiple genmodels
		val genPkg = mm.genmodels.head.genPackages.head

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
	}

	static def getFactoryFqnFor(Metamodel mm, EPackage pkg) {
		val allGp = newArrayList
		getAllGenPkgs(mm.genmodels.head, allGp)

		val genPkg = allGp.findFirst[gp | gp.getEcorePackage.nsURI == pkg.nsURI]

		return if (genPkg.basePackage !== null)
				QualifiedName.create(genPkg.basePackage, genPkg.prefix, genPkg.prefix + "Factory").normalize.toString
			else
				QualifiedName.create(genPkg.prefix, genPkg.prefix + "Factory").normalize.toString

	}

	static def hasAdapterFor(Metamodel mm, ModelType mt, EClassifier cls) {
		mm.hasAdapterFor(mt, cls.name)
	}

	static def hasAdapterFor(Metamodel mm, ModelType mt, String find) {
		   mm.^implements.exists[name == mt.name]
		&& mm.allClasses.exists[name == find]
		&& mt.allClasses.exists[name == find]
	}

	static def getAllClassifiers(Metamodel mm) {
		mm.pkgs.map[EClassifiers].flatten
	}

	static def getAllClasses(Metamodel mm) {
		mm.allClassifiers.filter(EClass)
	}

	static def isUml(Metamodel mm, EClassifier cls) {
		val pkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]
		return pkg.name == "uml"
	}

	static def createEcore(EPackage pkg, String uri) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(uri))
    	res.contents.add(pkg)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def createEcore(Metamodel mm) {
		val resSet = new ResourceSetImpl
    	val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(mm.generationFolder + mm.name + ".ecore"))
    	res.contents.add(mm.pkgs.head.copy)

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation, String modelDirectory) {
		val genModelFact = GenModelFactory.eINSTANCE
		val genModel = genModelFact.createGenModel

		genModel.complianceLevel = GenJDKLevel.JDK70_LITERAL
		//genModel.modelDirectory = '''/«mm.project.name»/src-gen/'''
		genModel.modelDirectory = modelDirectory
		genModel.foreignModel.add(ecoreLocation)
		genModel.modelName = mm.name
		//val usedPkg = ModelUtils.loadGenmodel(mm.inheritanceRelation?.superMetamodel?.ecore.genmodelUris.head)
		//genModel.usedGenPackages += mm.inheritanceRelation?.superMetamodel?.genmodels.head.genPackages
		//genModel.usedGenPackages += usedPkg.genPackages
		genModel.usedGenPackages += mm.inheritanceRelation?.superMetamodel?.genmodels.head.genPackages
		genModel.initialize(Collections.singleton(pkg))

		val genPackage = genModel.genPackages.head
		genPackage.prefix = mm.name.toLowerCase.toFirstUpper
		//genPackage.basePackage = mm.name.toLowerCase

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(genModelLocation))
		res.contents.add(genModel)

		try {
			res.save(null)
			genModel.generateCode
		} catch (IOException e) {
			e.printStackTrace
		}
	}

	static def createGenModel(EPackage pkg, Metamodel mm, String ecoreLocation, String genModelLocation) {
		createGenModel(pkg, mm, ecoreLocation, genModelLocation, '''/«mm.name»Generated/src/''')
	}

	static def generateCode(GenModel genModel) {
		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val generator = GenModelUtil.createGenerator(genModel)
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
			new BasicMonitor$Printing(System.out)
		)
	}

	static def getGenerationFolder(Metamodel mm) {
		//return '''platform:/resource/«mm.project.name»/generated/«mm.name»/'''
		return '''platform:/resource/«mm.name»Generated/model/«mm.name»/'''
	}

	static def getProject(Metamodel mm) {
		val platformString = mm.eResource.URI.toPlatformString(true)
		return ResourcesPlugin.workspace.root.getFile(new Path(platformString)).project
	}
}
