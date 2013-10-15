/**
 * Opposite annotation
 * 
 * Example:
 * class A { @Opposite("a") public B b }
 * class B { @Opposite("b") public A a }
 * 
 * @author Arnaud Blouin / Thomas Degueule
 */
package fr.inria.triskell.k3

import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.Active
import java.lang.annotation.Retention
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.Visibility
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
	protected MutableTypeDeclaration  containingType
	protected MutableFieldDeclaration field
	protected MutableTypeDeclaration  oppositeType
	protected MutableFieldDeclaration oppositeField
	protected TransformationContext   context
	
	/**
	 * Weaves opposite behavior
	 */	
	override void doTransform(MutableFieldDeclaration field, TransformationContext ctx)
	{
		context = ctx
		
		val oppositeRefName = field.annotations.findFirst[a | a.annotationTypeDeclaration.qualifiedName.equals(Opposite.name)].getValue("value")
		
		if (isCollection(field.type)) {
			if (field.type.actualTypeArguments.size != 1) {
				this.context.addError(field, "Only collections with 1 type parameter are supported")
				return
			}
			
			this.oppositeType = context.findClass(field.type.actualTypeArguments.head.name)
		} else {
			this.oppositeType = context.findClass(field.type.name)
		}
		
		this.field          = field
		this.containingType = field.declaringType
		this.oppositeField  = oppositeType.declaredFields.findFirst[f | f.simpleName.equals(oppositeRefName)]
		
		if (check())
		{
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
	
	protected def void generateInitializer()
	{
		if (isCollection(field.type))
		{
			val t = field.type.actualTypeArguments.head.simpleName
			
			field.initializer = ['''new java.util.ArrayList<«t»>()''']
		} else {
			field.initializer = ['''null''']
		}
	}
	
	/**
	 * Generates a simple getter method
	 */
	protected def void generateGetterMethod()
	{
		val f = field.simpleName
		
		if (isCollection(field.type))
		{
			containingType.addMethod(f)[
				visibility = Visibility.PUBLIC
				returnType = context.newTypeReference(ImmutableList, field.type.actualTypeArguments.head)
				body = ['''return com.google.common.collect.ImmutableList.copyOf(«f») ;''']
			]
		} else {
			containingType.addMethod(f)[
				visibility = Visibility.PUBLIC
				returnType = field.type
				body = ['''return «f» ;''']
			]
		}
	}
	
	/**
	 * Generates a proxy setter for the annotated
	 * field in order to inject the opposite behavior
	 */
	protected def void generateSetterProxyMethod()
	{
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type
		
		if (isCollection(field.type))
		{
			containingType.addMethod("add" + field.simpleName.toFirstUpper)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = ['''
					if (!«f».contains(obj))
					{
						if (obj != null)
							«IF isCollection(t)»
								obj.__K3_«o»_set(this) ;
							«ELSE»
								obj.__K3_«o»_set(this) ;
							«ENDIF»
						
						«f».add(obj) ;
					}
				''']
			]
		} else {
			containingType.addMethod(field.simpleName)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type)
				body = ['''
					if (obj != «f»)
					{
						if («f» != null)
							«IF isCollection(t)»
								«f».__K3_«o»_reset(this) ;
							«ELSE»
								«f».__K3_«o»_reset() ;
							«ENDIF»
						if (obj != null)
							obj.__K3_«o»_set(this) ;
						
						«f» = obj ;
					}
				''']
			]
		}
	}
	
	/**
	 * Reset annotated field value
	 */
	protected def void generateResetMethod()
	{
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type
		
		if (isCollection(field.type))
		{
			containingType.addMethod("__K3_" + field.simpleName + "_reset")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = ['''
					if («f».contains(obj))
						«f».remove(obj) ;
				''']
			]
			
			containingType.addMethod("remove" + field.simpleName.toFirstUpper)[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = ['''
					if (obj != null)
						«IF isCollection(t)»
							obj.__K3_«o»_reset(this) ;
						«ELSE»
							obj.__K3_«o»_reset() ;
						«ENDIF»
						
					«f».remove(obj) ;
				''']
			]
		} else {
			containingType.addMethod("__K3_" + f + "_reset")[
				visibility = Visibility.PUBLIC
				body = ['''«f» = null ;''']
			]
		}
	}
	
	/**
	 * Set field value 
	 */
	protected def void generateSetMethod()
	{
		val f = field.simpleName
		val o = oppositeField.simpleName
		val t = oppositeField.type
		
		if (isCollection(field.type))
		{
			containingType.addMethod("__K3_" + f + "_set")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type.actualTypeArguments.head)
				body = ['''
					«f».add(obj) ;
					''']
				]
		} else {
			containingType.addMethod("__K3_" + f + "_set")[
				visibility = Visibility.PUBLIC
				addParameter("obj", field.type)
				body = ['''
					if («f» != null)
						«IF isCollection(t)»
							«f».__K3_«o»_reset(this) ;
						«ELSE»
							«f».__K3_«o»_reset() ;
						«ENDIF»
					
					«f» = obj ;
					''']
				]
		}
	}
	
	/**
	 * Checks whether the opposite references
	 * are properly defined
	 */
	protected def check()
	{
		// No primitive types
		if (field.type.primitive) {
			context.addError(field, "Can't declare a primitive type " + field.type.simpleName + " as opposite")
			return false
		}
		
		// Opposite field exists
		if (oppositeField == null) {
			context.addError(field, "Referenced opposite attribute doesn't exist")
			return false
		}
		
		// Types match
		// TODO Kill the one who dares comparing types based on their simpleName
		if (isCollection(field.type)) {
			if (!isCollection(oppositeField.type) && !oppositeField.type.simpleName.equals(containingType.simpleName)) {
				context.addError(field, "The opposite attribute type (" + oppositeField.type.simpleName + ") doesn't match")
				return false
			} else if (isCollection(oppositeField.type) && !oppositeField.type.actualTypeArguments.head.simpleName.equals(containingType.simpleName)) {
				context.addError(field, "The opposite attribute type (" + oppositeField.type.simpleName + ") doesn't match")
				return false
			}
		} else {
			if (!isCollection(oppositeField.type) && !oppositeField.type.simpleName.equals(containingType.simpleName)) {
				context.addError(field, "The opposite attribute type (" + oppositeField.type.simpleName + ") doesn't match")
				return false
			}
			else if (isCollection(oppositeField.type) && !oppositeField.type.actualTypeArguments.head.simpleName.equals(containingType.simpleName)) {
				context.addError(field, "The opposite attribute type (" + oppositeField.type.simpleName + ") doesn't match")
				return false
			}
		}
		
		// No double-containment
		if (
			field.annotations.exists[a | a.annotationTypeDeclaration.qualifiedName.equals(Composition.name)] &&
			oppositeField.annotations.exists[a | a.annotationTypeDeclaration.qualifiedName.equals(Composition.name)]
		) {
			context.addError(field, "Can't declare as opposites two composition references")
			return false
		}
		
		// Opposite field also declares the right opposite
		if (!oppositeField.annotations.exists[
			a | a.annotationTypeDeclaration.qualifiedName.equals(Opposite.name) &&
				a.getValue("value").equals(field.simpleName)]
		) {
			context.addError(field, "The opposite attribute must be marked as opposite of this attribute")
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
	protected def isCollection(TypeReference type)
	{
		context.newTypeReference(Collection, context.newWildcardTypeReference).isAssignableFrom(type)
	}
}