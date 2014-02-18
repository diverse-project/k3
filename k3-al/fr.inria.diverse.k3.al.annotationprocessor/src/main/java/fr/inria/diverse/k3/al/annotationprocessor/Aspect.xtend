package fr.inria.diverse.k3.al.annotationprocessor

import java.util.ArrayList
import java.util.Comparator
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.CodeGenerationParticipant
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Active(typeof(AspectProcessor)) 
public annotation Aspect {
	Class<?> className;
	Class<?>[] with = #[];
}

public annotation OverrideAspectMethod {}

public annotation NotAspectProperty {}

public annotation ReplaceAspectMethod {}


public class AspectProcessor extends AbstractClassProcessor implements CodeGenerationParticipant<ClassDeclaration>{
	val Map<MutableClassDeclaration,List<MutableClassDeclaration>> listResMap = new HashMap


	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {
		val type = Helper::getAnnotationAspectType(annotatedClass)
		if(type!=null) {
			val className = type.simpleName
			context.registerClass(annotatedClass.qualifiedName + className + "AspectProperties")
			context.registerClass(annotatedClass.qualifiedName + className + "AspectContext")
		}
	}


	override def doTransform(List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
		//Method name_parameterlengths, 
		val Map<MutableClassDeclaration, List<MutableClassDeclaration>> superclass = new HashMap
		val Map<MutableMethodDeclaration, Set<MutableMethodDeclaration>> dispatchmethod = new HashMap
		init_superclass(classes, context, superclass)
		init_dispatchmethod(superclass, dispatchmethod, context)
		
		for (clazz : classes) {
			val List<MutableClassDeclaration> listRes = Helper::sortByClassInheritance(clazz, classes, context)
			val List<String> inheritList = listRes.map[simpleName]
			listResMap.put(clazz,listRes)
			val typeRef = Helper::getAnnotationAspectType(clazz)
			if(typeRef==null)
				clazz.addError("The aspectised class cannot be resolved.")
			else {
				val className = typeRef.simpleName
				val identifier = typeRef.name
				val Map<MutableMethodDeclaration, String> bodies = new HashMap
	
				//MOVE non static fields
				fields_processing(context, clazz, className, identifier, bodies)
	
				//Transform method to static
				methods_processing(clazz, context, identifier, bodies, dispatchmethod, inheritList, className)
				aspectContextMaker(context, clazz, className, identifier)
			}
		}
	}


	private def methods_processing(MutableClassDeclaration clazz, extension TransformationContext context, String identifier, 
		Map<MutableMethodDeclaration,String> bodies, Map<MutableMethodDeclaration,Set<MutableMethodDeclaration>> dispatchmethod, 
		List<String> inheritList, String className) {
		for (m : clazz.declaredMethods) {
			//clazz.addError(m.simpleName)
			//In not visited method, add _self as first parameter and set it static
			if (m.parameters.size == 0 || (m.parameters.size > 0 && m.parameters.get(0).simpleName != '_self')) {
				val l = new ArrayList<Pair<String, TypeReference>>()
				for (p1 : m.parameters)
					l.add(new Pair(p1.simpleName, p1.type))
				
				m.parameters.toList.clear				
				m.addParameter("_self", newTypeReference(identifier))

				for (param : l)
					m.addParameter(param.key, param.value)
				//m.parameters.add(1,m.parameters.remove(m.parameters.size-1))
			}

				/*/						clazz.addError("Each method must have at least one parameter")
				if ()
					clazz.addError("First parameter must be nammed self")*/
				//if (m.parameters.size > 0 && m.parameters.get(0).type.simpleName != className)
				//	clazz.addError("First parameter must be typed by the aspect "  + m.parameters.get(0).type.simpleName) //MOVE non static fields
				if (!m.static)
					m.setStatic(true)

				//Add a method "super_methodName" which call first method in the
				//super class hierarchy with the same name.
				if (clazz.extendedClass != null && m.annotations.findFirst[a|
					a.annotationTypeDeclaration.simpleName == "OverrideAspectMethod"] != null) {
					clazz.addMethod("super_" + m.simpleName,
						[
							//visibility = Visibility::PRIVATE
							visibility = Visibility::PRIVATE
							static = true
							returnType = m.returnType
							for (p : m.parameters)
								//if (p.simpleName != "self")
								addParameter(p.simpleName, p.type)
							var s = "";
							for (p : m.parameters)
								s = s + p.simpleName + ","
							if (s.length > 0)
								s = s.substring(0, s.length - 1)
							val s1 = s
							
							//clazz.addError(clazz.simpleName)
							//clazz.addError(clazz.extendedClass.name)
							val superClass = findClass(clazz.extendedClass.name)
							if (superClass == null)
								clazz.addError("class " + clazz.simpleName + " has no super class")
							else
							{val m3 = Helper::findMethod(superClass, m, context)
							if (m3 == null)
								m.addError("No super method found")
							//TODO find super method
							//val ret = m3.returnType.name
							body = [''' «IF (m3.returnType.name != "void")»return «ENDIF» «m3.declaringType.newTypeReference.name».priv«m.simpleName»(«s1»);  ''']
								
							}
						])
				}

				//Add "_hidden_" at the beginning of the replaced method name
				if (m.annotations.findFirst[a|a.annotationTypeDeclaration.simpleName == "ReplaceAspectMethod"] != null) {
					val cl = findClass(identifier)
					if (cl != null) {
						val m2 = cl.declaredMethods.findFirst[m2|
							m2.simpleName == m.simpleName && m2.parameters.size == m.parameters.size - 1]
						m2.setSimpleName("_hidden_" + m.simpleName)
					}
					//TODO Le faire pour toutes les classes montantes et descendantes
				}

				//Make "priv"+methodName as a copy of the method
				clazz.addMethod("priv" + m.simpleName,
					[
						visibility = Visibility::PROTECTED
						static = true
						abstract = false
						returnType = m.returnType
						if (m.abstract)
							body = ['''throw new java.lang.RuntimeException("Not implemented");''']
						else {
							if (m.body == null) {
								body = [bodies.get(m)] //getters & setters
								//addError(bodies.get(m))
							} else
									body = m.body
						}
						for (p : m.parameters)
							addParameter(p.simpleName, p.type)
					])

				//Change the body of the method to call the closest 
				//method "priv"+methodName in the aspect hierarchy
				var s = "";
				for (p : m.parameters)
					s = s + p.simpleName + ","
				if (s.length > 0)
					s = s.substring(0, s.length - 1)
				val s1 = s
				var ret = ""
				if (m.returnType != newTypeReference("void"))
					ret = "return"
				val retu = ret
				var callt = ""

				if(dispatchmethod.get(m) != null) {
					val listmethod = Helper::sortByMethodInheritance(dispatchmethod.get(m), inheritList)
					val declTypes = listmethod.map[declaringType]
					
					// A time-consuming check to be used for debugging only.
					// Looks for any problem in the order of the classes.
//					val declTypes = new ArrayList(listmethod.map[declaringType])
//					val size = declTypes.size
//					var i=1
//
//					for(type : declTypes) {
//						for(pos : i..<size)
//							if(type.isAssignableFrom(declTypes.get(pos)))
//								addError(clazz, "The generated factory does not have a correct hierarchy: " + type.simpleName + ", " + declTypes.get(pos).simpleName)
//						i=i+1
//					}

					val ifst = '''«FOR dt : declTypes» if (_self instanceof «Helper::getAspectedClassName(dt)»){
	«retu» «dt.newTypeReference.name».priv«m.simpleName»(«s1.replaceFirst("_self",
						"(" + Helper::getAspectedClassName(dt) + ")_self")»);
	} else«ENDFOR»'''
					callt = ifst + ''' { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }'''
				}
				else callt = '''«retu» priv«m.simpleName»(«s1»); ''' //for getters & setters

				val call = callt
				m.abstract = false
				m.body = [
					'''«clazz.qualifiedName + className»AspectContext _instance = «clazz.qualifiedName +
						className»AspectContext.getInstance();
				    java.util.Map<«identifier + Helper::mkstring(newTypeReference(identifier).actualTypeArguments,",","<",">")»,«clazz.qualifiedName + className»AspectProperties> selfProp = _instance.getMap();
					boolean _containsKey = selfProp.containsKey(_self);
				    boolean _not = (!_containsKey);
				    if (_not) {
  						«clazz.qualifiedName + className»AspectProperties prop = new «clazz.qualifiedName + className»AspectProperties();
				   selfProp.put(_self, prop);
			    }
			     _self_ = selfProp.get(_self);
			     «call»
			    ''']
				}
	}

	/**
	 * Create the class which link classes with their aspects 
	 */
	private def aspectContextMaker(extension TransformationContext context, MutableClassDeclaration clazz, String className, String identifier) {
		val holderClass = findClass(clazz.qualifiedName + className + "AspectContext")
		if(holderClass==null) return;
		
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
					'''new java.util.HashMap<«identifier + Helper::mkstring(newTypeReference(identifier).actualTypeArguments,",","<",">")», «clazz.qualifiedName + className»AspectProperties>()''']
			])
 
		holderClass.addMethod('getMap') [
			visibility = Visibility::PUBLIC
			static = false
			returnType = newTypeReference("java.util.Map", newTypeReference(identifier),
				newTypeReference(clazz.qualifiedName + className + "AspectProperties"))
			body = ['''return map;''']
		]
	}

	/**
	 * Move fields of the aspect to the AspectProperties class
	 */
	private def fields_processing(extension TransformationContext context, MutableClassDeclaration clazz, String className, String identifier, Map<MutableMethodDeclaration,String> bodies) {
		val List<MutableFieldDeclaration> toRemove = new ArrayList
		val List<MutableFieldDeclaration> propertyAspect = new ArrayList
		val c = findClass(clazz.qualifiedName + className + "AspectProperties")
		
		for (f : clazz.declaredFields) {
			//MOVE non static fields
			if (/*!f.static &&*/f.simpleName != "_self_") {
				toRemove.add(f)
				if (f.annotations.findFirst[a|a.annotationTypeDeclaration.simpleName == "NotAspectProperty"] == null)
					propertyAspect.add(f)

				c.addField(f.simpleName) [
					visibility = Visibility::PUBLIC
					static = f.static
					final = f.final
					type = f.type
					if (f.initializer != null) {
						initializer = f.initializer
					}
				]

			} else if (!f.static && f.simpleName == "_self_") {
				f.type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
				f.static = true
			}

		}
		var selfVar = clazz.declaredFields.findFirst[simpleName == "_self_"]
		if (selfVar == null) {
			val clazzProp = findClass(clazz.qualifiedName + className + "AspectProperties")
			if(clazzProp==null)
				addError(clazz, "Cannot resolve the class to aspectise.")
			else
				clazz.addField("_self_",
					[
						type = findClass(clazz.qualifiedName + className + "AspectProperties").newTypeReference()
						static = true
						visibility = Visibility::PUBLIC
					])
		}

		//Create getters and setters
		for (f : propertyAspect) {
			var get = clazz.addMethod(f.simpleName,
				[
					returnType = f.type
					addParameter("_self", newTypeReference(identifier))
				])
			bodies.put(get, ''' return «clazz.qualifiedName»._self_.«f.simpleName»; ''')

			if(!f.final) {
				var set = clazz.addMethod(f.simpleName,
					[
						returnType = newTypeReference("void")
						addParameter("_self", newTypeReference(identifier))
						addParameter(f.simpleName, f.type)
					])
				bodies.put(set, '''«clazz.qualifiedName»._self_.«f.simpleName» = «f.simpleName»; ''')
			}

		}
		for (f : toRemove)
			f.remove
	}

	/**
	 * Each aspect method is associatated with the lists of all methods with the
	 * same signature (name + number of args) of parents classes and children classes.
	 * 
	 * @superclass All aspects associated with their superclasses
	 * @dispatchmethod Associations computed
	 * @context
	 */
	private def init_dispatchmethod(Map<MutableClassDeclaration,List<MutableClassDeclaration>> superclass, Map<MutableMethodDeclaration,Set<MutableMethodDeclaration>> dispatchmethod, TransformationContext context) {
		var i =0
		for (cl : superclass.keySet) {
			//Regroup methods of the class hierarchy by name+number of parameters
			val clazzes = new ArrayList<MutableClassDeclaration>()
			clazzes.add(cl)
			clazzes.addAll(superclass.get(cl))
			val Map<String, Set<MutableMethodDeclaration>> dispatchs = new HashMap
			for (clazz : clazzes) {
				for (m : clazz.declaredMethods) {
					val mname = m.simpleName + "__" + m.parameters.size
					var v = dispatchs.get(mname)
					if (v == null) {
						v = new LinkedHashSet<MutableMethodDeclaration>()
						dispatchs.put(mname, v)
					}
					v.add(m)
				}
			}
			
			for (key : dispatchs.keySet) {
				val res = dispatchs.get(key)
				if (res.size > 1) {
					i=i+res.size
					for (m : res) {
						if (dispatchmethod.get(m) == null)
							dispatchmethod.put(m, res)
						else
							dispatchmethod.get(m).addAll(res)
					}
				}
			}
		}

		//Sort Dispatchmethod entries values by hierarchy of their containing classes
		for (m : dispatchmethod.keySet) {
			val l = dispatchmethod.get(m).sort(new SortMethod(context))
			dispatchmethod.get(m).clear
			dispatchmethod.get(m).addAll(l)
			//m.addError(dispatchmethod.get(m).size.toString)
		}
	}
	
	/**
	 * For each annotated class store his super classes hierarchy.
	 * An annotated class which is a parent of an other annotated
	 * class is not in the final result.
	 * 
	 * @annotedClasses All aspects
	 * @superclass Mapping computed between class and list of his super classes
	 * @context
	 */
	private def init_superclass(List<? extends MutableClassDeclaration> annotedClasses, TransformationContext context, Map<MutableClassDeclaration,List<MutableClassDeclaration>> superclass) {
		//Add super classes for all annotated classes
		for (clazz : annotedClasses) {
			val ext = new ArrayList<MutableClassDeclaration>()
			Helper::getSuperClass(ext, clazz, context)
			if (ext.size > 0)
				superclass.put(clazz, ext)
		}
		//Get all super classes
		val allparent = new LinkedHashSet<MutableClassDeclaration>()
		for (child : superclass.keySet) {
			allparent.addAll(superclass.get(child))
		}
		//Remove super classes which are annotated
		for (p : allparent)
			superclass.remove(p)
	}

	
	/**
	 * use an additional code generator to produce the .k3_aspect_mapping.properties file
	 */
	override doGenerateCode(List<? extends ClassDeclaration> annotatedSourceElements, extension CodeGenerationContext context) {
		// clean up previous version
		if(annotatedSourceElements.size > 0){
			val filePath = annotatedSourceElements.get(0).compilationUnit.filePath
			filePath.projectFolder.lastSegment
			val file = filePath.projectFolder.append("/META-INF/xtend-gen/"+filePath.projectFolder.lastSegment + ".k3_aspect_mapping.properties")
			file.delete
		}
		// add aspectizedClass = aspectClass mapping
		for (clazz : annotatedSourceElements) {
			
			val filePath = clazz.compilationUnit.filePath
			filePath.projectFolder.lastSegment
			val file = filePath.projectFolder.append("/META-INF/xtend-gen/"+filePath.projectFolder.lastSegment + ".k3_aspect_mapping.properties")
			val aspectizedclassNam = Helper::getAnnotationAspectType(clazz)

			if(aspectizedclassNam!=null) {
				val aspectizedclassName = aspectizedclassNam.class.getMethod("getQualifiedName").invoke(aspectizedclassNam) as String
					
				if(file.exists){
					file.contents = '''«file.contents»
	«aspectizedclassName» = «clazz.qualifiedName»
				'''
				}
				else{
				file.contents = '''
	«aspectizedclassName» = «clazz.qualifiedName»
				'''
				}
			}
		}
	}
}


class SortMethod implements Comparator<MutableMethodDeclaration> {
	TransformationContext context

	new(TransformationContext context) {
		this.context = context
	}

	def override int compare(MutableMethodDeclaration arg0, MutableMethodDeclaration arg2) {
		val ext = new ArrayList<MutableClassDeclaration>()
		Helper::getSuperClass(ext, arg0.declaringType as MutableClassDeclaration, context)
		val ext1 = new ArrayList<MutableClassDeclaration>()
		Helper::getSuperClass(ext1, arg2.declaringType as MutableClassDeclaration, context)

		if (ext.contains(arg2.declaringType)) {
			//context.addError(arg0.declaringType,arg0.declaringType.simpleName + " > " + arg2.declaringType.simpleName+" " +ext.size)
			return -1
		} else if (ext1.contains(arg0.declaringType)) {
			//context.addError(arg0.declaringType,arg0.declaringType.simpleName + " < " + arg2.declaringType.simpleName + " " +ext1.size)
			return 1
		} else {
			//context.addError(arg0.declaringType,arg0.declaringType.simpleName + " = " + arg2.declaringType.simpleName)
			return 0
		}
	}
}
