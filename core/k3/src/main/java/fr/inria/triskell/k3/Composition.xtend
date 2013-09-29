package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import java.util.Collection
import java.util.HashSet
import java.util.Set
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.declaration.Visibility

/**
 * The Composition annotation.
 * @author Arnaud Blouin
 */
@Target(ElementType::FIELD)
@Active(typeof(CompositionProcessor))
@Retention(RetentionPolicy.SOURCE)
public annotation Composition {}

/**
 * The processor for the Composition annotation.
 * TODO: does not support collection yet.
 * @author Arnaud Blouin
 */
public class CompositionProcessor extends AbstractFieldProcessor {
	// The name of the container attribute
	protected val static String NAME_CONTAINER = "_kContainer" 
	// Used to know the types which interface has been already generated.
	protected val Set<TypeReference> interfaceObsGenerated = new HashSet<TypeReference>()
	
	// Returns the name of the generated interface
	protected def String getObservabilityInterfaceName(TypeReference type) {
		return type.name + "__K3__Observer4Composition"
	}
	
	// Returns the name of the operation of the generated interface
	protected def String getObservabilityOperationName(String typeName) {
		return "__remove__K3__Observer4Composition_" + typeName 
	}
	
	
	protected def TypeReference getFieldType(FieldDeclaration field, TransformationContext ctx) {
		// TODO Support array
		//TODO check wildcard
		val type = field.type
		
		if(ctx!=null)
			if(type.isAssignableFrom(ctx.newTypeReference(Collection))) {
				ctx.addError(field, "Collections not supported yet.")
				return null
				
//				val generics = type.actualTypeArguments
//				
//				if(generics.size!=1) {
//					ctx.addError(field, "Collections must define a unique generic type for the moment.")
//					return null
//				}
//
//				return generics.get(0)
			}
		return type
	}
	
	
	
	override void doRegisterGlobals(FieldDeclaration field, RegisterGlobalsContext ctx) {
		val type = getFieldType(field, null)
		// Have to check that the interface of the corresponding type has not been generated yet.
		if(type!=null && !interfaceObsGenerated.contains(type)) {
			// Generating the interface used by the contained object to remove it from its container.
			try {
				ctx.registerInterface(getObservabilityInterfaceName(type))
				interfaceObsGenerated.add(type)
			}catch(IllegalArgumentException ex) {
				//TODO
			}
		}
	}

	override void doTransform(MutableFieldDeclaration field, TransformationContext ctx) {
		val fieldType = getFieldType(field, ctx)
		
		if(fieldType==null) return;
		
    	val clazzTypeField = ctx.findClass(fieldType.name)
    	
	    if(clazzTypeField==null) {
      		ctx.addError(field, "Cannot find the class " + field.type.name)
      		return
  		}
  		
    	val clazzContainField = field.declaringType as MutableClassDeclaration
		val interfObsName = getObservabilityInterfaceName(fieldType)
    	val typeRefContainer = ctx.newTypeReference(interfObsName)
    	val interfaceObs = ctx.findInterface(interfObsName)
    	val obsMethodName = getObservabilityOperationName(fieldType.simpleName)
		val oldFieldVisibility = field.visibility
		//TODO ANYTYPE
		// Primitive types cannot be contained.
	    if(fieldType.primitive)
      		ctx.addError(field, "Primitive attributes cannot be composite.")

		// The annotated field is now private in order to force the use of the generated getter/setter
		// used as proxies for supporting the composition.		
		field.visibility = Visibility.PRIVATE

		if(!clazzTypeField.declaredFields.exists[fi | fi.simpleName.equals(NAME_CONTAINER)]) {
			// Adding the container attribute to the type of the annotated field
			clazzTypeField.addField(NAME_CONTAINER)[
				visibility = Visibility.PRIVATE
				type = typeRefContainer
			]
			
			// Adding a setter for the container.
			clazzTypeField.addMethod(NAME_CONTAINER) [
				addParameter("obj", typeRefContainer)
				// If a container already exists, it must be notified through the generated interface that
				// it does not contain the object anymore
				body = ['''
					if(«NAME_CONTAINER»!=null) «NAME_CONTAINER».«obsMethodName»(this);
					«NAME_CONTAINER» = obj;
				''']
			]
			
			// Adding a getter for accessing the container.
			clazzTypeField.addMethod(NAME_CONTAINER) [
				returnType = ctx.newTypeReference("java.lang.Object")
				body = ['''return «NAME_CONTAINER»;''']
			]
		}

		if(!interfaceObs.declaredMethods.exists[meth | meth.simpleName.equals(obsMethodName)])
			// Adding a notification method in the generated interface
			ctx.findInterface(interfObsName).addMethod(obsMethodName)[
				addParameter("object", ctx.newTypeReference(fieldType.name))
			]
			
		if(!clazzContainField.implementedInterfaces.exists[interf | interf.simpleName.equals(interfObsName)])
			// The class containing the annotated field now implements the generated interface to be notified
			// when it does not contain the object
			clazzContainField.implementedInterfaces = #[typeRefContainer]
			
		if(!clazzContainField.declaredMethods.exists[meth | meth.simpleName.equals(obsMethodName)]) {
			// Have to implement the interface method in the class that contains the annotated field.
			// Getting the fields of this class of the same type that the annotated field and being composed as well
			val listFieldComposit = clazzContainField.declaredFields.filter[fi |
				fi.type.equals(fieldType) && fi.annotations.exists[ann| ann.annotationTypeDeclaration.qualifiedName.equals(Composition.name)]]
			
			// Implementing the method of the interface	
			clazzContainField.addMethod(obsMethodName) [
				addParameter("obj", ctx.newTypeReference(fieldType.name))
				// For each collected fields, checking whether the object given as parameter is the value of the field.
				// If it is the case, setting the value to null of the field.
				body = ['''
					«FOR fi : listFieldComposit» 
						if(this.«fi.simpleName»==obj) {
							this.«fi.simpleName» = null;
							return ;
						}
					«ENDFOR»
				''']
			]
		}
		
		// Adding a setter for the annotated field.
		clazzContainField.addMethod(field.simpleName)[
			visibility = oldFieldVisibility
			addParameter("obj", fieldType)
			// This setter is a proxy to do jobs related to composition.
			// The visibility of the setter is the same that the original annotated field.
			body = ['''
				if(obj!=null) obj.«NAME_CONTAINER»(this);
				if(«field.simpleName»!=null) «field.simpleName».«NAME_CONTAINER»(null);
				«field.simpleName» = obj;
			''']
		]
		
		// Adding a getter to access the annotated field.
		clazzContainField.addMethod(field.simpleName)[
			// The visibility of the getter is the same that the original annotated field.
			visibility = oldFieldVisibility
			returnType = field.type
			body = ['''return  «field.simpleName»;''']
		]
	}
}
