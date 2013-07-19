package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration

@Target(ElementType::METHOD)
@Active(typeof(PreProcessor))
annotation Pre {}

class PreProcessor extends AbstractMethodProcessor {


	override doTransform(MutableMethodDeclaration annotatedMethod, extension TransformationContext context) {

	}
}