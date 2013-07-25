package singleton


import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Target(ElementType::TYPE)
@Active(typeof(SingletonProcessor))
annotation Singleton {}

class SingletonProcessor extends AbstractClassProcessor {

	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {
		context.registerClass(getHolderClassName(annotatedClass))
	}

	override doTransform(MutableClassDeclaration annotatedClass, extension TransformationContext context) {
		annotatedClass.final = true

		if (annotatedClass.declaredConstructors.size > 1)
			annotatedClass.addError("More then one constructor is defined")

		val constructor = annotatedClass.declaredConstructors.head
		if (constructor.parameters.size > 0)
			constructor.addError("Constructor has arguments")

		if (constructor.body == null) {

			// no constructor defined in the annotated class
			constructor.visibility = Visibility::PRIVATE
			constructor.body = ['''// singleton''']
		} else {
			if (constructor.visibility != Visibility::PRIVATE)
				constructor.addError("Constructor is not private")
		}

		val holderClass = findClass(getHolderClassName(annotatedClass))
		holderClass.visibility = Visibility::PRIVATE
		holderClass.addField('INSTANCE') [
			visibility = Visibility::PUBLIC
			static = true
			final = true
			type = annotatedClass.newTypeReference
			initializer = [
				'''new «annotatedClass.simpleName»()'''
			]
		]

		annotatedClass.addMethod('getInstance') [
			visibility = Visibility::PUBLIC
			static = true
			returnType = annotatedClass.newTypeReference
			body = [
				'''return Holder.INSTANCE;'''
			]
		]
	}

	def getHolderClassName(ClassDeclaration outerClass) {
		outerClass.qualifiedName + ".Holder"
	}
}