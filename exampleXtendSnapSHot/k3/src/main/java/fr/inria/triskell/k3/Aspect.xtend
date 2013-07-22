package fr.inria.triskell.k3

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility
import org.eclipse.xtend.lib.macro.declaration.MutableParameterDeclaration

@Active(typeof(AspectProcessor))
public annotation Aspect {
	Class className;
} 

public annotation OverrideAspectMethod {
} 

public annotation AspectProperty {
} 


public class AspectProcessor extends AbstractClassProcessor {

	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {
		var classNam = annotatedClass.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
		var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
		val className = classNam.eGet(simpleNameF) as String

		context.registerClass(annotatedClass.qualifiedName + className + "AspectProperties")

		context.registerClass(annotatedClass.qualifiedName + className + "AspectContext")

		}


		override def doTransform(List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
			for (clazz : classes) {
				
				var classNam = clazz.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
				var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
				val className = classNam.eGet(simpleNameF) as String
				var identF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "identifier"]
				val identifier = classNam.eGet(identF) as String
				val Map<MutableMethodDeclaration,String> bodies = new HashMap<MutableMethodDeclaration,String>()


				//clazz.addError(className)
				//MOVE non static fields
				var List<MutableFieldDeclaration> toRemove = new ArrayList<MutableFieldDeclaration>();
				var List<MutableFieldDeclaration> propertyAspect = new ArrayList<MutableFieldDeclaration>();

				var c = findClass(clazz.qualifiedName + className + "AspectProperties")
				for (f : clazz.declaredFields) {

					//MOVE non static fields
					if (!f.static && f.simpleName != "self") {
						toRemove.add(f)
						if (f.annotations.findFirst[a| a.annotationTypeDeclaration.simpleName=="AspectProperty"] !=null){
							propertyAspect.add(f)
						}
						
						c.addField(f.simpleName) [
							visibility = Visibility::PUBLIC
							static = f.static
							final = f.final
							type = f.type
							if (f.initializer != null) {
								initializer = f.initializer								
							}
						]

					}
					
					
					else if (!f.static && f.simpleName == "self") {
						f.type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
						f.static = true
					}
					

				}
				var self= clazz.declaredFields.findFirst[simpleName=="self"]
				if (self == null){
					clazz.addField("self", [
						type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
						static = true
						visibility = Visibility::PUBLIC
					])
				}
				
				
				for (f :propertyAspect){
				var get = clazz.addMethod(f.simpleName,[
								returnType = f.type
								addParameter("_self", newTypeReference(identifier))
							])
				bodies.put(get,''' return «clazz.qualifiedName».self.«f.simpleName»; ''')
							
							
				var set = 			clazz.addMethod(f.simpleName,[
								returnType =newTypeReference("void")
								addParameter("_self", newTypeReference(identifier))
								addParameter(f.simpleName, f.type)
							])
				bodies.put(set,'''«clazz.qualifiedName».self.«f.simpleName» = «f.simpleName»; ''')
				
				} 
				for (f : toRemove) {
					f.remove
				}

		

				//Transform method to static
				for (m : clazz.declaredMethods) {
					if (m.parameters.size == 0 || m.parameters.size > 0 && m.parameters.get(0).simpleName != '_self')
					{
						val l = new ArrayList<MutableParameterDeclaration>()
						for (p1 : m.parameters){
							l.add(p1)
						}
						
						m.parameters.clear
						
						m.addParameter("_self", newTypeReference(identifier))
						
						for (param : l){
							m.addParameter(param.simpleName, param.type)
						}
						
						//m.parameters.add(1,m.parameters.remove(m.parameters.size-1))
					}
/*/						clazz.addError("Each method must have at least one parameter")
					if ()
						clazz.addError("First parameter must be nammed self")*/
					if (m.parameters.size > 0 && m.parameters.get(0).type.simpleName != className)
						clazz.addError("First parameter must be typed by the aspect") //MOVE non static fields
					if (!m.static) {
						m.setStatic(true)
					}
					
					
					if (clazz.extendedClass!= null  && m.annotations.findFirst[a| a.annotationTypeDeclaration.simpleName == "OverrideAspectMethod"] !=null){
						clazz.addMethod("super_"+ m.simpleName,[
						//visibility = Visibility::PRIVATE
						visibility = Visibility::PRIVATE
						static = true
						returnType = m.returnType
						for (p : m.parameters) {
							//if (p.simpleName != "_self")
	           					 addParameter(p.simpleName, p.type)
         				 }		
         				 var s="";
						for (p:m.parameters)
				 		{ s=s+p.simpleName + "," }
						if (s.length>0)
							s= s.substring(0, s.length-1)
						val s1 =s
						
						val  m3 = findMethod(findClass(clazz.extendedClass.name),m,context)
						if (m3==null)
							m.addError("No super method found")							
										 			
						body = [''' «m3.declaringType.newTypeReference.name ».«m.simpleName»(«s1»);  ''']	
					])

							

					}
					
					
					clazz.addMethod("priv"+ m.simpleName,[
						visibility = Visibility::PRIVATE
						static = true
						returnType = m.returnType
						if (m.body == null){
							body = [bodies.get(m)]
							//addError(bodies.get(m))
							}
						else 								
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
						'''«clazz.qualifiedName + className»AspectContext _instance = «clazz.qualifiedName + className»AspectContext.getInstance();
						    java.util.Map<«className»,«clazz.qualifiedName + className»AspectProperties> selfProp = _instance.getMap();
    						boolean _containsKey = selfProp.containsKey(_self);
						    boolean _not = (!_containsKey);
						    if (_not) {
      						«clazz.qualifiedName + className»AspectProperties prop = new «clazz.qualifiedName + className»AspectProperties();
   						   selfProp.put(_self, prop);
					    }
					     self = selfProp.get(_self);
					    «retu» priv«m.simpleName»(«s1»);					     
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
		
		def MutableMethodDeclaration findMethod(MutableClassDeclaration clazz, MutableMethodDeclaration methodName ,extension TransformationContext context){
			
			var m = clazz.declaredMethods.findFirst[ m2| m2.simpleName == methodName.simpleName] 
			if (m== null){
				if (clazz.extendedClass == null)
					return null
				else if (findClass(clazz.extendedClass.name) ==null)
					return null
				else
					return findMethod(findClass(clazz.extendedClass.name),methodName,context)
							
				
			}else
				return m;
			
			
			
				
		
		
	}
	}