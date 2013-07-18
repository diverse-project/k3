package k3

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Active(typeof(AspectProcessor))
annotation Aspect {
	Class className;
} 

class AspectProcessor extends AbstractClassProcessor {

	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {

		var classNam = annotatedClass.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
		var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
		val className = classNam.eGet(simpleNameF) as String

		context.registerClass(annotatedClass.qualifiedName + className + "AspectProperties")

		context.registerClass(annotatedClass.qualifiedName + className + "AspectContext")

		}

		override doTransform(List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
			for (clazz : classes) {

				var classNam = clazz.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
				var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
				val className = classNam.eGet(simpleNameF) as String
				var identF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "identifier"]
				val identifier = classNam.eGet(identF) as String

				//clazz.addError(className)
				//MOVE non static fields
				var List<MutableFieldDeclaration> toRemove = new ArrayList<MutableFieldDeclaration>();
				for (f : clazz.declaredFields) {

					//MOVE non static fields
					if (!f.static && f.simpleName != "self") {
						toRemove.add(f)
						var c = findClass(clazz.qualifiedName + className + "AspectProperties")
						c.addField(f.simpleName) [
							visibility = Visibility::PUBLIC
							static = f.static
							final = f.final
							type = f.type
							if (f.initializer != null) {
								initializer = [
									'''«f.initializer» '''
								]
							}
						]

					}
					
					
					else if (!f.static && f.simpleName == "self") {
						f.type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
						f.static = true
					}
					

				}
				for (f : toRemove) {
					f.remove
				}

		

				//Transform method to static
				for (m : clazz.declaredMethods) {
					if (m.parameters.size == 0)
						clazz.addError("Each method must have at least one parameter")
					if (m.parameters.size > 0 && m.parameters.get(0).simpleName != '_self')
						clazz.addError("First parameter must be nammed self")
					if (m.parameters.size > 0 && m.parameters.get(0).type.simpleName != className)
						clazz.addError("First parameter must be typed by the aspect") //MOVE non static fields
					if (!m.static) {
						m.setStatic(true)
					}
					
					clazz.addMethod("priv"+ m.simpleName,[
						visibility = Visibility::PRIVATE
						static = true
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
					m.body = [
						'''«clazz.qualifiedName + className»AspectContext _instance = «clazz.qualifiedName + className»AspectContext.getInstance();
						    java.util.Map<«className»,«clazz.qualifiedName + className»AspectProperties> selfProp = _instance.getMap();
    						boolean _containsKey = selfProp.containsKey(_self);
						    boolean _not = (!_containsKey);
						    if (_not) {
      						«clazz.qualifiedName + className»AspectProperties prop = new «clazz.qualifiedName + className»AspectProperties();
   						   selfProp.put(_self, prop);
					    }
					     self = selfProp.get(_self);
					    priv«m.simpleName»(«s1»);					     
					    ''']

				}

				val holderClass = findClass(clazz.qualifiedName + className + "AspectContext")
				holderClass.visibility = Visibility::PUBLIC
				holderClass.addConstructor [
					visibility = Visibility::PRIVATE
				]

				holderClass.addField('INSTANCE') [
					visibility = Visibility::PUBLIC
					static = true
					final = true
					type = holderClass.newTypeReference
					initializer = [
						'''new «holderClass.simpleName»()'''
					]
				]

				holderClass.addMethod('getInstance') [
					visibility = Visibility::PUBLIC
					static = true
					returnType = holderClass.newTypeReference
					body = [
						'''return INSTANCE;'''
					]
				]

				holderClass.addField('map',
					[
						visibility = Visibility::PRIVATE
						static = false
						type = newTypeReference("java.util.Map",newTypeReference(identifier),newTypeReference(clazz.qualifiedName + className+"AspectProperties"))
						initializer = [
							'''new java.util.HashMap<«className», «clazz.qualifiedName + className»AspectProperties>()''']
					])

				holderClass.addMethod('getMap') [
					visibility = Visibility::PUBLIC
					static = false
					returnType = newTypeReference("java.util.Map",newTypeReference(identifier),newTypeReference(clazz.qualifiedName + className+"AspectProperties"))
					body = [
						'''return map;'''
					]
				]

			}

		}
	}
	