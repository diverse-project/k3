package fr.inria.triskell.k3

import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
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
import org.eclipse.xtend.lib.macro.declaration.MutableParameterDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableTypeDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Active(typeof(AspectProcessor))
public annotation Aspect {
	Class className;
}

public annotation OverrideAspectMethod {
}

public annotation NotAspectProperty {
}

public annotation ReplaceAspectMethod {
}

/*class sortClass implements Comparator<MutableClassDeclaration>{
	
	 TransformationContext context
	 
	
	new ( TransformationContext context){
		this.context = context
	}
	def override int compare(MutableClassDeclaration arg0, MutableClassDeclaration arg1) {
		val ext = 	new ArrayList<MutableClassDeclaration>()
		getSuperClass(ext,arg0,context)	
		if (ext.contains(arg1))
			return 1
		else return -1		
	}
	def void getSuperClass(List<MutableClassDeclaration> s, MutableClassDeclaration c,extension TransformationContext context){
		if (c.extendedClass!=null){
			val l =	findClass(c.extendedClass.name)
			if (l!=null){
				s.add(l)
				getSuperClass(s,l,context)
			}			
		}
	}
	
	
}*/



public class AspectProcessor extends AbstractClassProcessor {
def String getIdentifierOfAnAspectedClass(MutableTypeDeclaration clazz){
			var classNam = clazz.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
			var identF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "identifier"]
			return  classNam.eGet(identF) as String
			
}
	def void getSuperClass(List<MutableClassDeclaration> s, MutableClassDeclaration c,extension TransformationContext context){
		if (c.extendedClass!=null){
			val l =	findClass(c.extendedClass.name)
			if (l!=null){
				s.add(l)
				getSuperClass(s,l,context)
			}			
		}
	}

	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {
		var classNam = annotatedClass.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
		var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
		val className = classNam.eGet(simpleNameF) as String

		context.registerClass(annotatedClass.qualifiedName + className + "AspectProperties")

		context.registerClass(annotatedClass.qualifiedName + className + "AspectContext")

	}

	override def doTransform(List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
		//Method name_parameterlengths, 
		
		val Map<MutableClassDeclaration,List<MutableClassDeclaration>> superclass= new HashMap<MutableClassDeclaration,List<MutableClassDeclaration>>()
		val Map<MutableMethodDeclaration,List<MutableMethodDeclaration>> dispatchmethod= new HashMap<MutableMethodDeclaration,List<MutableMethodDeclaration>>()
		for (clazz : classes) {
			val ext = 	new ArrayList<MutableClassDeclaration>()
			getSuperClass(ext,clazz,context)	
			if (ext.size>0)
				superclass.put(clazz, ext)
		}
		
			val allparent = 	new HashSet<MutableClassDeclaration>()
			for(child : superclass.keySet)
			{
				allparent.addAll(superclass.get(child))
			}
			for (p:allparent)
			{
				superclass.remove(p)
			}
			
		for (cl : superclass.keySet){
			val clazzes = 	new ArrayList<MutableClassDeclaration>()
			clazzes.add(cl)
			clazzes.addAll(superclass.get(cl))
			val Map<String,List<MutableMethodDeclaration>> dispatchs= new HashMap<String,List<MutableMethodDeclaration>>()
			for (clazz : clazzes) {
				
				for (m:clazz.declaredMethods){
					val mname= m.simpleName + "__"+ m.parameters.size
					var v = dispatchs.get(mname)
					if (v==null){
						v= new ArrayList<MutableMethodDeclaration>()
						dispatchs.put(mname,v)						
					}
					v.add(m)				 
				}
			}
			for (key : dispatchs.keySet){
				val res= dispatchs.get(key)
				if (res.size>1){
					for (m : res){
						dispatchmethod.put(m,res)
					}
				}
			}
		}
		
		/*for (m : dispatchmethod.keySet){
			m.addError(dispatchmethod.get(m).size.toString )
		}*/
			
		
		
		
		
		
		
		for (clazz : classes) {

			var classNam = clazz.annotations.findFirst[getValue('className') != null].getValue('className') as EObject
			var simpleNameF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "simpleName"]
			val className = classNam.eGet(simpleNameF) as String
			var identF = classNam.eClass.EAllStructuralFeatures.findFirst[name == "identifier"]
			val identifier = classNam.eGet(identF) as String
			val Map<MutableMethodDeclaration, String> bodies = new HashMap<MutableMethodDeclaration, String>()

			//clazz.addError(className)
			//MOVE non static fields
			var List<MutableFieldDeclaration> toRemove = new ArrayList<MutableFieldDeclaration>();
			var List<MutableFieldDeclaration> propertyAspect = new ArrayList<MutableFieldDeclaration>();

			var c = findClass(clazz.qualifiedName + className + "AspectProperties")
			for (f : clazz.declaredFields) {

				//MOVE non static fields
				if (/*!f.static &&*/ f.simpleName != "_self") {
					toRemove.add(f)
					if (f.annotations.findFirst[a|a.annotationTypeDeclaration.simpleName == "NotAspectProperty"] == null) {
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

				} else if (!f.static && f.simpleName == "_self") {
					f.type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
					f.static = true
				}

			}
			var self = clazz.declaredFields.findFirst[simpleName == "_self"]
			if (self == null) {
				clazz.addField("_self",
					[
						type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
						static = true
						visibility = Visibility::PUBLIC
					])
			}

			for (f : propertyAspect) {
				var get = clazz.addMethod(f.simpleName,
					[
						returnType = f.type
						addParameter("self", newTypeReference(identifier))
					])
				bodies.put(get, ''' return «clazz.qualifiedName»._self.«f.simpleName»; ''')

				var set = clazz.addMethod(f.simpleName,
					[
						returnType = newTypeReference("void")
						addParameter("self", newTypeReference(identifier))
						addParameter(f.simpleName, f.type)
					])
				bodies.put(set, '''«clazz.qualifiedName»._self.«f.simpleName» = «f.simpleName»; ''')

			}
			for (f : toRemove) {
				f.remove
			}

			//Transform method to static
			for (m : clazz.declaredMethods) {
				if (m.parameters.size == 0 || m.parameters.size > 0 && m.parameters.get(0).simpleName != 'self') {
					val l = new ArrayList<MutableParameterDeclaration>()
					for (p1 : m.parameters) {
						l.add(p1)
					}

					m.parameters.clear

					m.addParameter("self", newTypeReference(identifier))

					for (param : l) {
						
						m.addParameter(param.simpleName, param.type)
					}

					//m.parameters.add(1,m.parameters.remove(m.parameters.size-1))
					}

					/*/						clazz.addError("Each method must have at least one parameter")
					if ()
						clazz.addError("First parameter must be nammed self")*/
					//if (m.parameters.size > 0 && m.parameters.get(0).type.simpleName != className)
					//	clazz.addError("First parameter must be typed by the aspect "  + m.parameters.get(0).type.simpleName) //MOVE non static fields
					if (!m.static) {
						m.setStatic(true)					
					}
				


					if (clazz.extendedClass != null &&
						m.annotations.findFirst[a|a.annotationTypeDeclaration.simpleName == "OverrideAspectMethod"] !=
							null) {
						clazz.addMethod("super_" + m.simpleName,
							[
								//visibility = Visibility::PRIVATE
								visibility = Visibility::PRIVATE
								static = true
								returnType = m.returnType
								for (p : m.parameters) {

									//if (p.simpleName != "self")
									addParameter(p.simpleName, p.type)
								}
								var s = "";
								for (p : m.parameters) {
									s = s + p.simpleName + ","
								}
								if (s.length > 0)
									s = s.substring(0, s.length - 1)
								val s1 = s
								val m3 = findMethod(findClass(clazz.extendedClass.name), m, context)
								if (m3 == null)
									m.addError("No super method found")
								body = [''' «m3.declaringType.newTypeReference.name».«m.simpleName»(«s1»);  ''']
							])
					}

					if (m.annotations.findFirst[a|a.annotationTypeDeclaration.simpleName == "ReplaceAspectMethod"] !=
							null) {
						val cl = findClass(identifier)
						if (cl!= null){
							val m2 = cl.declaredMethods.findFirst[m2| m2.simpleName == m.simpleName && m2.parameters.size == m.parameters.size-1]
							m2.setSimpleName("_hidden_" + m.simpleName)	
						}
						
					}


					

					clazz.addMethod("priv" + m.simpleName,
						[
							visibility = Visibility::PROTECTED
							static = true
							returnType = m.returnType
							if (m.body == null) {
								body = [bodies.get(m)]

								//addError(bodies.get(m))
								} else
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
						var callt = '''«retu» priv«m.simpleName»(«s1»); '''
						//m.addError(""+dispatchmethod.get(m)) 
						if (dispatchmethod.get(m)!=null){
							val listmethod = dispatchmethod.get(m)		
								//md.simpleName = "_dispatch_"+md.simpleName
								var ifst = '''«FOR md  : listmethod»   if (self instanceof «getIdentifierOfAnAspectedClass(md.declaringType)»){
									«retu» «md.declaringType.newTypeReference.name».priv«m.simpleName»(«s1.replaceFirst("self", "("+ getIdentifierOfAnAspectedClass(md.declaringType) + ")self" )»);
									} else «ENDFOR»
									'''
								callt = ifst + ''' {
      										throw new IllegalArgumentException("Unhandled parameter types: " +
									        java.util.Arrays.<Object>asList(self).toString());
							    } '''							
						}
						val call = callt

						m.body = [
							'''«clazz.qualifiedName + className»AspectContext _instance = «clazz.qualifiedName +
								className»AspectContext.getInstance();
						    java.util.Map<«className»,«clazz.qualifiedName + className»AspectProperties> selfProp = _instance.getMap();
    						boolean _containsKey = selfProp.containsKey(self);
						    boolean _not = (!_containsKey);
						    if (_not) {
      						«clazz.qualifiedName + className»AspectProperties prop = new «clazz.qualifiedName + className»AspectProperties();
   						   selfProp.put(self, prop);
					    }
					     _self = selfProp.get(self);
					     «call»
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
							type = newTypeReference("java.util.Map", newTypeReference(identifier),
								newTypeReference(clazz.qualifiedName + className + "AspectProperties"))
							initializer = [
								'''new java.util.HashMap<«className», «clazz.qualifiedName + className»AspectProperties>()''']
						])

					holderClass.addMethod('getMap') [
						visibility = Visibility::PUBLIC
						static = false
						returnType = newTypeReference("java.util.Map", newTypeReference(identifier),
							newTypeReference(clazz.qualifiedName + className + "AspectProperties"))
						body = [
							'''return map;'''
						]
					]

				}

			}

			def MutableMethodDeclaration findMethod(MutableClassDeclaration clazz, MutableMethodDeclaration methodName,
				extension TransformationContext context) {

				var m = clazz.declaredMethods.findFirst[m2|m2.simpleName == methodName.simpleName]
				if (m == null) {
					if (clazz.extendedClass == null)
						return null
					else if (findClass(clazz.extendedClass.name) == null)
						return null
					else
						return findMethod(findClass(clazz.extendedClass.name), methodName, context)

				} else
					return m;

			}
		}
		