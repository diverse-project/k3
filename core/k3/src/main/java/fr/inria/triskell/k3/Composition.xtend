package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Target(ElementType::FIELD)
@Active(typeof(CompositionProcessor))
public annotation Composition {}

class CompositionProcessor extends AbstractFieldProcessor {
	private val static String NAME_CONTAINER = "__k3Container__" 
	
	
	def String getObservabilityInterfaceName(FieldDeclaration field) {
		return field.type.name + "_" + field.simpleName + "__K3__Observer4Composition"
	}
	
	def String getObservabilityOperationName(String typeName) {
		return "remove__K3__Observer4Composition_" + typeName 
	}
	
	override void doRegisterGlobals(FieldDeclaration field, RegisterGlobalsContext context) {
		context.registerInterface(getObservabilityInterfaceName(field))
	}

	override void doTransform(MutableFieldDeclaration field, TransformationContext context) {
    	val ty = field.getType
    	val clazz = field.declaringType
    			
	    if(ty.primitive)
      		context.addError(field, "Primitive attributes cannot be composite.")

		if(!clazz.declaredFields.exists[fi | fi.simpleName.equals(NAME_CONTAINER)]) {
			val name = getObservabilityInterfaceName(field)
			clazz.addField(NAME_CONTAINER)[
				visibility = Visibility.PRIVATE
				type = context.newTypeReference(name)
			]
			val foo = context.findInterface(name)
			foo.visibility = Visibility::PRIVATE
			foo.addMethod(getObservabilityOperationName(field.type.simpleName))[
//				abstract = true
//				returnType = newTypeReference("void")
				addParameter("object", context.newTypeReference(field.type.name))
			]
		}
	}
}
