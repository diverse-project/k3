package $packageName$;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EcoreFactory

import static extension $packageName$.EPackage$aspectClassPostfix$.*
import static extension $packageName$.EClass$aspectClassPostfix$.*
import static extension $packageName$.EClassifier$aspectClassPostfix$.*
import static extension $packageName$.EModelElement$aspectClassPostfix$.*

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=EPackage)
class EPackage$aspectClassPostfix$ extends EModelElement$aspectClassPostfix${
	
	public def void annotate(){
		// traverse the model to annotate all classes
		_self.ESubpackages.forEach[subPackage | subPackage.annotate]
		_self.EClassifiers.forEach[EClassifier classifier | classifier.annotate ] 
	}
}

@Aspect(className=EClassifier)
class EClassifier$aspectClassPostfix$ extends EModelElement$aspectClassPostfix${
	public def void annotate(){
		// do nothing in the general case
	}
}

@Aspect(className=EClass)
class EClass$aspectClassPostfix$ extends EClassifier$aspectClassPostfix${
	
	@OverrideAspectMethod
	public def void annotate(){
		// compute the string for the annotation and add it to the class
		_self.addAnnotation("http://www.eclipse.org/emf/2002/GenModel", "documentation", _self.flat(""))
	}
	
/** Build a String with all superclasses of this class */
	public def String flat(String tabStr){
		// use a template String
val returnedString = '''«tabStr»class «_self.name» : «FOR eSuperClass : _self.ESuperTypes»«eSuperClass.flat( tabStr + "\t")»«ENDFOR»'''
				return returnedString.toString
	}
}


@Aspect(className=EModelElement)
class EModelElement$aspectClassPostfix${
	public def EAnnotation addAnnotation(String source, String detailKey, String detailValue) {
    	// create annotation on the model element only if not already there
		var EAnnotation theAnnotation =	_self.EAnnotations.findFirst[annot | annot.source.equals(source)]
		if (theAnnotation == null){
			theAnnotation = EcoreFactory.eINSTANCE.createEAnnotation
			theAnnotation.source = source
			_self.EAnnotations.add(theAnnotation)
		}
		
		theAnnotation.details.put(detailKey, detailValue)
		return theAnnotation
    }
}