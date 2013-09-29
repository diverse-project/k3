package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableTypeDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.declaration.Visibility

/**
 * The Opposite annotation.
 * @author Arnaud Blouin
 */
@Target(ElementType::FIELD)
@Active(typeof(OppositeProcessor))
@Retention(RetentionPolicy.SOURCE)
public annotation Opposite {
	String value;
}


/**
 * The processor for the Opposite annotation.
 * TODO: does not support collection yet.
 * @author Arnaud Blouin
 */
public class OppositeProcessor extends AbstractFieldProcessor {
	override void doTransform(MutableFieldDeclaration field, TransformationContext ctx) {
    	val clazzTypeField = ctx.findClass(field.type.name)
    	val clazzContainField = field.declaringType
    	val annotationAttrName = field.annotations.findFirst[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Opposite.name)].getValue("value")
    	val oppositeField = clazzTypeField.declaredFields.findFirst[fi| fi.simpleName.equals(annotationAttrName)]

		if(!check(field, ctx, clazzTypeField, oppositeField, annotationAttrName, clazzContainField))
			return;
		 
		// The annotated field is now private in order to force the use of the generated getter/setter
		// used as proxies for supporting the composition.		
		field.visibility = Visibility.PRIVATE
		
		generateSetterProxy(field, clazzContainField, oppositeField, ctx)
		//TODO
	}
	
	
	protected def void generateSetterProxy(MutableFieldDeclaration field, MutableTypeDeclaration clazzContainField,
		MutableFieldDeclaration oppositeField, TransformationContext ctx) {
		// Adding a setter for the annotated field.
		
//		if(isArray(field.type)) {
//      		ctx.addError(field, "Opposite on multiplicity * not supported yet." + field.type.name)
//		}else
		clazzContainField.addMethod(field.simpleName)[
			visibility = Visibility.PUBLIC // Have to be public since the opposite may not 
			addParameter("obj", field.type)
			// This setter is a proxy to do jobs related to composition.
			body = ['''
				«field.simpleName» = obj;
				if(obj.«oppositeField.simpleName»()!=this) obj.«oppositeField.simpleName»(this);
			''']
		]
		
		// Adding a getter to access the annotated field.
		clazzContainField.addMethod(field.simpleName)[
			returnType = field.type
			body = ['''return  «field.simpleName»;''']
		]
	}
	
	
	/**
	 * Checks the constraints to validate the opposite.
	 */
	protected def boolean check(MutableFieldDeclaration field, TransformationContext ctx, MutableClassDeclaration clazzTypeField,
		MutableFieldDeclaration oppositeField, Object annotationAttrName, MutableTypeDeclaration clazzContainField) {
    	// I do not know why but for instance with Object the context is not able to find it.
	    if(clazzTypeField==null) {
      		ctx.addError(field, "Cannot find the class " + field.type.name)
      		return false
  		}
  		
		// Primitive types cannot be opposites.
	    if(field.getType.primitive) {
      		ctx.addError(field, "Primitive attributes cannot be opposites")
      		return false
  		}
  		// Checking that the opposite attribute exists
    	if(oppositeField==null) {
    		ctx.addError(field, "Not attribute " + annotationAttrName + " in the class " + clazzTypeField.qualifiedName)
    		return false
		}
		// Checking that the types are ok
    	if(!oppositeField.type.equals(ctx.newTypeReference(clazzContainField.qualifiedName))) {
    		ctx.addError(field, "The types of the opposite attribute and of the class containing the annotated attribute must be the same")
    		return false
		}
		
		// Constraint from k1: the 2 concerned fields cannot be composite
		if(field.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Composition.name)] &&
			oppositeField.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Composition.name)]){
    		ctx.addError(field, "Double composition problem (container contained by its content)")
    		return false
		}
		
		// Checking that the other field has also an opposite annotation corresponding to this field
		if(!oppositeField.annotations.exists[ann | ann.annotationTypeDeclaration.qualifiedName.equals(Opposite.name) &&
			ann.getValue("value").equals(field.simpleName)]) {
    		ctx.addError(field, "The opposite attribute must have an opposite on this attribute.")
    		return false
		}
		return true
	}
}
