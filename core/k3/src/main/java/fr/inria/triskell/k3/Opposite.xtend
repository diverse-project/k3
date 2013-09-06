package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration

/**
 * The Composition annotation.
 * @author Arnaud Blouin
 */
@Target(ElementType::FIELD)
@Active(typeof(OppositeProcessor))
public annotation Opposite {
	String value;
}


/**
 * The processor for the Opposite annotation.
 * @author Arnaud Blouin
 */
public class OppositeProcessor extends AbstractFieldProcessor {
	override void doTransform(MutableFieldDeclaration field, TransformationContext ctx) {
    	val clazzTypeField = ctx.findClass(field.type.name)
    	
    	// I do not know why but for instance with Object the context is not able to find it.
	    if(clazzTypeField==null) {
      		ctx.addError(field, "Cannot find the class " + field.type.name)
      		return
  		}
    	
    	val clazzContainField = field.declaringType
    	val annotationAttrName = field.annotations.findFirst[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Opposite.name)].getValue("value")
    	val oppositeField = clazzTypeField.declaredFields.findFirst[fi| fi.simpleName.equals(annotationAttrName)]
    	
		// Primitive types cannot be opposites.
	    if(field.getType.primitive) {
      		ctx.addError(field, "Primitive attributes cannot be opposites")
      		return
  		}
  		// Checking that the opposite attribute exists
    	if(oppositeField==null) {
    		ctx.addError(field, "Not attribute " + annotationAttrName + " in the class " + clazzTypeField.qualifiedName)
    		return
		}
		// Checking that the types are ok
    	if(!oppositeField.type.equals(ctx.newTypeReference(clazzContainField.qualifiedName))) {
    		ctx.addError(field, "The types of the opposite attribute and of the class containing the annotated attribute must be the same")
    		return
		}
		
		// Constraint from k1: the 2 concerned fields cannot be composite
		if(field.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Composition.name)] &&
			oppositeField.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Composition.name)]){
    		ctx.addError(field, "Double composition problem (container contained by its content)")
    		return
		}
		
		// Checking that the other field has also an opposite annotation corresponding to this field
		if(!oppositeField.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Opposite.name) &&
			ann.getValue("value").equals(field.simpleName)]) {
    		ctx.addError(field, "The opposite attribute must have an opposite on this attribute.")
    		return
		}
		
		//TODO
	}
}
