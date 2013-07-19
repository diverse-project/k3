package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility
import javax.sound.sampled.BooleanControl.Type

@Target(ElementType::METHOD)
@Active(typeof(PreProcessor))
annotation Pre {}

class PreProcessor extends AbstractMethodProcessor {


	override doTransform(MutableMethodDeclaration annotatedMethod, extension TransformationContext context) {
		if (annotatedMethod.parameters.size > 0)
			annotatedMethod.addError("Precondition must not have a parameter")
		if (annotatedMethod.returnType != newTypeReference("boolean"))
			annotatedMethod.addError("Precondition must return a boolean")
		if (!annotatedMethod.simpleName.startsWith("pre"))
			annotatedMethod.addError("Precondition must be nammed pre... (convention)")
		if (annotatedMethod.declaringType.declaredMethods.filter[m|m.simpleName == annotatedMethod.simpleName.substring(3)  ].size ==0)
			annotatedMethod.addError("Precondition must be have the name preX where X is an existing method")
		
		val m = annotatedMethod.declaringType.declaredMethods.filter[m|m.simpleName == annotatedMethod.simpleName.substring(3)  ].get(0)
		val clazz = annotatedMethod.declaringType
		annotatedMethod.declaringType.addMethod("prepriv"+ m.simpleName,[
						visibility = Visibility::PRIVATE
						static = m.static
						final = m.final
						returnType = m.returnType
						body = m.body	
						 for (p : m.parameters) {
           					 addParameter(p.simpleName, p.type)
         				 }					
					])
					var s="";
					for (p:m.parameters)
				 	{ s=s+p.simpleName + "," }
					if (s.length>0)
						s= s.substring(0, s.length-1)
					val s1 =s
					var ret = ""
					if (m.returnType != newTypeReference("void"))
						ret = "return"
					val retu = ret
					m.body = [
						'''
						if (pre«m.simpleName»())
						    «retu» prepriv«m.simpleName»(«s1»);					    
						else
							throw new  fr.inria.triskell.k3.PreConditionViolationException();
					    ''']
					
		


	}
}