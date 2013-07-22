package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import java.util.HashMap
import java.util.Map
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Target(ElementType::TYPE)
@Active(typeof(ContractedProcessor))
annotation Contracted {
}

@Target(ElementType::METHOD)
//@Active(typeof(PreProcessor))
annotation Pre {
}

@Target(ElementType::METHOD)
//@Active(typeof(PostProcessor))
annotation Post {
}

class ContractedProcessor extends AbstractClassProcessor {

	override doTransform(MutableClassDeclaration annotateClass, extension TransformationContext context) {

		val Map<MutableMethodDeclaration,String> bodies = new HashMap<MutableMethodDeclaration,String>()

		for (annotatedMethod : annotateClass.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration.simpleName == "Pre"]]) {

			if (annotatedMethod.parameters.size > 0)
				annotatedMethod.addError("Precondition must not have a parameter")
			if (annotatedMethod.returnType != newTypeReference("boolean"))
				annotatedMethod.addError("Precondition must return a boolean")
			if (!annotatedMethod.simpleName.startsWith("pre"))
				annotatedMethod.addError("Precondition must be nammed pre... (convention)")
			if (annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(3)].size == 0)
				annotatedMethod.addError("Precondition must be have the name preX where X is an existing method")

			val m = annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(3)].get(0)
			val clazz = annotatedMethod.declaringType
			annotatedMethod.declaringType.addMethod("prepriv" + m.simpleName,
				[
					visibility = Visibility::PRIVATE
					static = m.static
					final = m.final
					returnType = m.returnType
					if (m.body ==null)
						body = [bodies.get(m)]
					else 
						body = m.body
					for (p : m.parameters) {
						addParameter(p.simpleName, p.type)
					}
				])
			var s = "";
			for (p : m.parameters) {
				s = s + p.simpleName + ","
			}
			if (s.length > 0)
				s = s.substring(0, s.length - 1)
			val s1 = s
			var ret = ""
			if (m.returnType != newTypeReference("void"))
				ret = "return"
			val retu = ret
			val bodyt ='''
					if (pre«m.simpleName»())
					    «retu» prepriv«m.simpleName»(«s1»);					    
					else
						throw new  fr.inria.triskell.k3.PreConditionViolationException();
					  ''' 
			m.body = [bodyt]
			bodies.put(m,bodyt)

		}

		for (annotatedMethod : annotateClass.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration.simpleName == "Post"]]) {
			if (annotatedMethod.parameters.size > 0)
				annotatedMethod.addError("Postcondition must not have a parameter")
			if (annotatedMethod.returnType != newTypeReference("boolean"))
				annotatedMethod.addError("Postcondition must return a boolean")
			if (!annotatedMethod.simpleName.startsWith("post"))
				annotatedMethod.addError("Postcondition must be nammed post... (convention)")
			if (annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(4)].size == 0)
				annotatedMethod.addError("Postcondition must be have the name postX where X is an existing method")

			val m = annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(4)].get(0)
			val clazz = annotatedMethod.declaringType

			//if (!clazz.declaredMethods.exists[m1 | m1.simpleName == "pre" + m.simpleName ]){
			annotatedMethod.declaringType.addMethod("postpriv" + m.simpleName,
				[
					visibility = Visibility::PRIVATE
					static = m.static
					final = m.final
					returnType = m.returnType
					if (m.body ==null)
						body = [bodies.get(m)]
					else 
						body = m.body
					for (p : m.parameters) {
						addParameter(p.simpleName, p.type)
					}
				])
			var s = "";
			for (p : m.parameters) {
				s = s + p.simpleName + ","
			}
			if (s.length > 0)
				s = s.substring(0, s.length - 1)
			val s1 = s
			var ret = ""
			var ret1 = ""
			if (m.returnType != newTypeReference("void")) {
				ret = m.returnType.name + " __ret = "
				ret1 = "return __ret;"
			}
			val retu = ret
			val retu1 = ret1
			m.body = [
				'''						
					«retu»postpriv«m.simpleName»(«s1»);
					if (!post«m.simpleName»())
						throw new  fr.inria.triskell.k3.PostConditionViolationException();
					«retu1»	
				   ''']

		}
	}
}

