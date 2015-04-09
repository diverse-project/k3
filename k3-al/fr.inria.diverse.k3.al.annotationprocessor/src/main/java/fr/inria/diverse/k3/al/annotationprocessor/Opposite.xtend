/**
 * Opposite annotation
 *
 * Example:
 * class A { @Opposite("a") public B b }
 * class B { @Opposite("b") public A a }
 *
 * @author Arnaud Blouin / Thomas Degueule
 */
package fr.inria.diverse.k3.al.annotationprocessor

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.Target

import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.Visibility
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableTypeDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference

import java.util.Collection

import com.google.common.collect.ImmutableList

/**
 * Opposite annotation declaration
 */
@Target(ElementType::FIELD)
@Active(OppositeProcessor)
@Retention(RetentionPolicy.SOURCE)
public annotation Opposite
{
	String value /* Name of the opposite reference */
}

/**
 * Opposite annotation processing
 */
class OppositeProcessor extends AbstractFieldProcessor
{
	protected MutableTypeDeclaration          containingType
	protected MutableFieldDeclaration         field
	protected MutableTypeDeclaration          oppositeType
	protected MutableFieldDeclaration         oppositeField
	protected extension TransformationContext context

	protected static final String GENERATED_PREFIX = "__K3_"

	/**
	 * Weaves opposite behavior
	 */
	override void doTransform(MutableFieldDeclaration field, TransformationContext ctx) {
		context = ctx

		val oppositeRefName = field.annotations.findFirst[annotationTypeDeclaration == Opposite.newTypeReference.type].getValue("value")

		if (field.type.isCollection) {
			if (field.type.actualTypeArguments.size != 1) {
				field.addError("Only collections with 1 type parameter are supported")
				return
			}

			this.oppositeType = findClass(field.type.actualTypeArguments.head.name)
		} else {
			this.oppositeType = findClass(field.type.name)
		}

		this.field          = field
		this.containingType = field.declaringType
		this.oppositeField  = oppositeType.declaredFields.findFirst[f | f.simpleName.equals(oppositeRefName)]

		if (check()) {
			// Annotated field needs to be private
			// since the opposite behavior is defined
			// by the generated setter
			this.field.visibility = Visibility.PRIVATE

			generateInitializer()
			generateGetterMethod()
			generateSetterProxyMethod()
			generateResetMethod()
			generateSetMethod()
		}
	}

	protected def void generateInitializer() {
		if (field.type.isCollection) {
			val t = field.type.actualTypeArguments.head.simpleName

			field.initializer = '''new java.util.ArrayList<«t»>()'''
		} else {
			field.initializer = '''null'''
		}
	}

	/**
	 * Generates a simple getter method
	 */
	protected def void generateGetterMethod() {
		val f = field.simpleName

		if (field.type.isCollection) {
			containingType.addMethod(field.getterName)[
				visibility = Visibility.PUBLIC
				returnType = newTypeReference(ImmutableList, field.type.actualTypeArguments.head)
				body = '''return com.google.common.collect.ImmutableList.copyOf(«f») ;'''
			]
		} else {
			containingType.addMethod(field.getterName)[
				visibility = Visibility.PUBLIC
				returnType = field.type
				body = '''return «f» ;'''
			]
		}
	}

	/**
	 * Generates a proxy setter for the annotated
	 * field in order to inject the opposite behavior
	 */
	protected def void generateSetterProxyMethod() {
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type

		if (field.type.isCollection) {
			containingType.addMethod("add" + field.simpleName.toFirstUpper)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = '''
					if (!«f».contains(obj)) {
						if (obj != null)
							obj.«GENERATED_PREFIX»«o»_set(this) ;

						«f».add(obj) ;
					}
				'''
			]
		} else {
			containingType.addMethod(field.setterName)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type)
				body = '''
					if (obj != «f») {
						if («f» != null)
							«f».«GENERATED_PREFIX»«o»_reset(«IF t.isCollection»this«ENDIF») ;
						if (obj != null)
							obj.«GENERATED_PREFIX»«o»_set(this) ;

						«f» = obj ;
					}
				'''
			]
		}
	}

	/**
	 * Reset annotated field value
	 */
	protected def void generateResetMethod() {
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type

		if (field.type.isCollection) {
			containingType.addMethod(GENERATED_PREFIX + field.simpleName + "_reset")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = '''
					if («f».contains(obj))
						«f».remove(obj) ;
				'''
			]

			containingType.addMethod("remove" + field.simpleName.toFirstUpper)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = '''
					if (obj != null)
						obj.«GENERATED_PREFIX»«o»_reset(«IF t.isCollection»this«ENDIF») ;

					«f».remove(obj) ;
				'''
			]
		} else {
			containingType.addMethod(GENERATED_PREFIX + f + "_reset")[
				visibility = Visibility.PUBLIC
				body = '''«f» = null ;'''
			]
		}
	}

	/**
	 * Set field value
	 */
	protected def void generateSetMethod() {
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type

		if (field.type.isCollection) {
			containingType.addMethod(GENERATED_PREFIX + f + "_set")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = '''
					«f».add(obj) ;
					'''
				]
		} else {
			containingType.addMethod(GENERATED_PREFIX + f + "_set")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type)
				body = '''
					if («f» != null)
						«f».«GENERATED_PREFIX»«o»_reset(«IF t.isCollection»this«ENDIF») ;

					«f» = obj ;
					'''
				]
		}
	}

	/**
	 * Checks whether the opposite references
	 * are properly defined
	 */
	protected def boolean check() {
		// No primitive types
		if (field.type.primitive || field.type.wrapper) {
			field.addError("Can't declare a primitive type " + field.type.simpleName + " as opposite")
			return false
		}

		// Opposite field exists
		if (oppositeField === null) {
			field.addError("Referenced opposite attribute doesn't exist")
			return false
		}

		// Types match
		if (
			(!oppositeField.type.isCollection && oppositeField.type != containingType.newTypeReference) ||
			(oppositeField.type.isCollection && oppositeField.type.actualTypeArguments.head != containingType.newTypeReference)
		) {
			field.addError("The opposite attribute type (" + oppositeField.type.simpleName + ") doesn't match")
			return false
		}

		// No double-containment
		if (
			field.annotations.exists[annotationTypeDeclaration == Composition.newTypeReference.type] &&
			oppositeField.annotations.exists[annotationTypeDeclaration == Composition.newTypeReference.type]
		) {
			field.addError("Can't declare as opposites two composition references")
			return false
		}

		// Opposite field also declares the right opposite
		if (
			!oppositeField.annotations.exists[
				annotationTypeDeclaration == Opposite.newTypeReference.type &&
				getValue("value").equals(field.simpleName)
			]
		) {
			field.addError("The opposite attribute must be marked as opposite of this attribute")
			return false
		}

		// TODO
		// In the case of auto-reference,
		// need to check both references
		// are not the same
		// (ex: class A { @Opposite("a2") A a1 @Opposite("a1") A a2 })

		return true
	}

	/**
	 * Checks whether the specified TypeReference refers
	 * to a collection
	 */
	protected def boolean isCollection(TypeReference type)
	{
		return Collection.newTypeReference(newWildcardTypeReference).isAssignableFrom(type)
	}

	protected def String getGetterName(MutableFieldDeclaration f) {
		return '''get«f.simpleName.toFirstUpper»'''
	}

	protected def String getSetterName(MutableFieldDeclaration f) {
		return '''set«f.simpleName.toFirstUpper»'''
	}
}