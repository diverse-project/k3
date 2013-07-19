package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractMethodProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Target(ElementType::METHOD)
@Active(typeof(PostProcessor))
annotation Post {}

class PostProcessor extends AbstractMethodProcessor {


	override doTransform(MutableMethodDeclaration annotatedMethod, extension TransformationContext context) {
		if (annotatedMethod.parameters.size > 0)
			annotatedMethod.addError("Postcondition must not have a parameter")
		if (annotatedMethod.returnType != newTypeReference("boolean"))
			annotatedMethod.addError("Postcondition must return a boolean")
		if (!annotatedMethod.simpleName.startsWith("post"))
			annotatedMethod.addError("Postcondition must be nammed post... (convention)")
		if (annotatedMethod.declaringType.declaredMethods.filter[m|m.simpleName == annotatedMethod.simpleName.substring(4)  ].size ==0)
			annotatedMethod.addError("Postcondition must be have the name postX where X is an existing method")
		
		val m = annotatedMethod.declaringType.declaredMethods.filter[m|m.simpleName == annotatedMethod.simpleName.substring(4)  ].get(0)
		val clazz = annotatedMethod.declaringType
		//if (!clazz.declaredMethods.exists[m1 | m1.simpleName == "pre" + m.simpleName ]){
		annotatedMethod.declaringType.addMethod("postpriv"+ m.simpleName,[
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
					var ret1 = ""
					if (m.returnType != newTypeReference("void")){
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