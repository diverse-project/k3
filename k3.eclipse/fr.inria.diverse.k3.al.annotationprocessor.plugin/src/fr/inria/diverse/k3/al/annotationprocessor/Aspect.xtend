/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
 package fr.inria.diverse.k3.al.annotationprocessor

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import java.util.ArrayList
import java.util.Comparator
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.declaration.Visibility
import org.eclipse.xtend.lib.macro.file.Path
import org.eclipse.xtend.lib.macro.services.TypeLookup

//import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * Indicates that this class is an aspect on top of another base class.
 * <br>
 * Minimal example: 
 * <pre>
 *{@literal @}Aspect(className=XYZ)
 * class XYZAspect {}
 * </pre>
 
 * The <i>with</i> attribute is used in in case of multiple inheritance in the base classes/aspect:
 * <pre>
 *{@literal @}Aspect(className=Child, with=#[ParentAspect2, ParentAspect3] ) 
 * class ChildAspect extends Parent1Aspect{ }
 * </pre>
 * @see <a href="http://diverse-project.github.io/k3/publish/user_documentation/html_single/user_documentation.html#_creating_an_aspect_on_a_class">Creating an aspect class section in the documentation</a>
 * @see <a href="http://diverse-project.github.io/k3/publish/user_documentation/html_single/user_documentation.html#_extending_an_aspect_multi_inheritance">Extending an aspect (multi inheritance) section in the documentation</a>
 */
@Retention(RetentionPolicy::RUNTIME)
@Active(typeof(AspectProcessor)) 
@Target(ElementType.TYPE)
public annotation Aspect { 
	Class<?> className;
	Class<?>[] with = #[];
}

/**
 * Allows to override a method when an aspect class inherits 
 * from another aspect class and on of its methods is refined.
 * <b>This is equivalent to the <i>override</i> keyword but to be used in aspect classes.
 */
public annotation OverrideAspectMethod {
}

public annotation NotAspectProperty {
}

/**
 * Allows to replace a method that is defined in the base class.
 * <br>Note: In some situations, this annotation implementation 
 * relies on AspectJ code for intercepting some calls.
 */
public annotation ReplaceAspectMethod {
}

/**
 * When a field exists both in the base class and in the 
 * aspect (same name and type), this annotation makes sure 
 * to synchronize their values when assigning one of the fields.
 * <br>Note: The field must be <i>public</i>
 * <br>Note: In some situations, this annotation implementation relies on AspectJ code for intercepting some calls.
 */
public annotation SynchroField {
}

/** Step annotation is used by GEMOC to produce StepCommands */
@Retention(RetentionPolicy::RUNTIME)
public annotation Step{
}

/** Main annotation is used by GEMOC to tag aspect methods to be the main entry point of a sequential model execution */
@Target(#[ElementType::METHOD])
@Retention(RetentionPolicy::RUNTIME)
public annotation Main{}

/** InitializeModel annotation is used by GEMOC to tag aspect methods to be an initialization method before a model execution */
@Target(#[ElementType::METHOD])
@Retention(RetentionPolicy::RUNTIME)
public annotation InitializeModel{}

/**
 * Used to tag a k3 operation as abstract as initially defined.
 * Used when generating super operations: must not generate super for abstract operations.
 */
@Target(#[ElementType::METHOD])
@Retention(RetentionPolicy::SOURCE)
annotation Abstract {
}

/**
 * AbstractClassProcessor that processes @Aspect annotation on classes.
 * 
 * <img src="doc-files/AspectProcessor_SD.png" width="500" alt="AspectProcessor Sequence Diagram">
 * 
 * <br>See <a href="https://www.eclipse.org/xtend/documentation/204_activeannotations.html">xtend annotation processor documentation</a>
 */
public class AspectProcessor extends AbstractClassProcessor {
	Map<MutableClassDeclaration, List<MutableClassDeclaration>> listResMap = newHashMap

	// builder for mapping.properties file
	var AspectMappingBuilder aspectMappingBuilder
	val projectStaticDispatchBuilder = new ProjectStaticDispatchBuilder()
	
	public static final String CTX_NAME = "AspectContext"
	public static final String PROP_NAME = "AspectProperties"
	public static final String OVERRIDE_METHOD = OverrideAspectMethod.simpleName
	public static final String STEP = Step.simpleName
	public static final String PROP_VAR_NAME = "_self_"
	public static final String SELF_VAR_NAME = "_self"
	public static final String PRIV_PREFIX = "_privk3_"
	public static final String PRIV_CONSTRUCTOR_POSTFIX = "_constructor_initializer"
	public static final String RESULT_VAR = "result"
	public static final String DISPATCH_POINTCUT_KEY = "#DispatchPointCut_before#"
	public static Boolean lock = false

	/**
	 * Phase 1: Register properties and context helpers
	 */
	override doRegisterGlobals(ClassDeclaration annotatedClass, RegisterGlobalsContext context) {
		// println(this +" doRegisterGlobals on "+annotatedClass.qualifiedName)
		val type = Helper::getAnnotationAspectType(annotatedClass)
		if (type !== null) {
			val className = type.simpleName
			context.registerClass(annotatedClass.qualifiedName + className + PROP_NAME)
			context.registerClass(annotatedClass.qualifiedName + className + CTX_NAME)
		}
	}

	List<? extends MutableClassDeclaration> mclasses = null
	

	/**
	 * Phase 2: Transform aspected class' fields and methods
	 */
	override def doTransform(List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
		// println(this +" doTransform on "+classes.map[qualifiedName].join(" "))
		mclasses = classes

		// context.addError(classes.get(0),"test"+classes.size + " " + classes.get(0).compilationUnit)

		for (clazz : classes) {
			
			val List<MutableClassDeclaration> listRes = Helper::sortByClassInheritance(clazz, classes, context)
			val List<String> inheritList = listRes.map[simpleName]
			listResMap.put(clazz, listRes)

			val typeRef = Helper::getAnnotationAspectType(clazz)

			if (typeRef === null)
				clazz.addError("The aspectized class cannot be resolved.")
			else {
				val className = typeRef.simpleName
				val identifier = typeRef.name
				val Map<MutableMethodDeclaration, String> bodies = newHashMap

				// Move non-static fields
				fieldsProcessing(context, clazz, className, identifier, bodies)

				// Transform methods to static
				methodsProcessing(clazz, context, identifier, bodies, inheritList, className)

				// constructor are currently not allowed, report error if there are some.
				constructorsProcessing(clazz, context, identifier, bodies, className)

				aspectContextMaker(context, clazz, className, identifier)
			}
			
		}

		// prepare an AspectMapping properties file
		// it is partly done in this context and partly done in the generate code context
		// (allows to get writing abilities and notification to Eclipse)
		
		aspectMappingBuilder = AspectMappingBuilder::getAspectMappingBuilder(classes.head.compilationUnit.filePath.projectFolder.toString)
		aspectMappingBuilder.readCurrentMapping(classes, context)
		aspectMappingBuilder.cleanUnusedMapping(context)
		
		aspectMappingBuilder.addMappingForAnnotatedSourceElements()
	}

	/**
	 * Phase 4: use an additional code generator to produce some additional files:
	 * - generates the .k3_aspect_mapping.properties file that can be used later by other tool to inspect aspects
	 * - generates the AspectJ file needed to bypass some limitations; 
	 */
	override doGenerateCode(List<? extends ClassDeclaration> annotatedSourceElements,
		extension CodeGenerationContext context) {

		// println(this +" doGenerateCode on "+annotatedSourceElements.map[qualifiedName].join(" "))
		// generate the .k3_aspect_mapping.properties file using information collected in the previous phases
	    aspectMappingBuilder.writePropertyFile(context)

		// generate aspectJ code if required
		for (classDecl : annotatedSourceElements) {
 			generateAspectJCodeForClass(classDecl, context)
		}

		// deal with dispatch methods of classes that are in the current project		
	 	for (classDecl : annotatedSourceElements) {
	 		injectDispatchInParentAspects(classDecl, context)
		} 
		
		
		annotatedSourceElements.map[classDecl | classDecl.compilationUnit].forEach[cu |
			// save dispatchStaticInjection into a file for proper reuse by other parallel or incremental jobs
			projectStaticDispatchBuilder.writeTempStaticDispatchFile(cu, context)
		]
	}

	/**
	 * Change the signature of the original method to makes it static
	 * -	add _self parameter
	 * -	makes it static
	 * -	deal with the @Abstract annotation 
	 */
	private def methodProcessingAddSelfStatic(MutableMethodDeclaration m, String identifier,
		extension TransformationContext cxt) {
		// In not visited method, add _self as first parameter and set it static
		// also add _self_ as second parameter
		if (m.parameters.empty || m.parameters.head.simpleName != SELF_VAR_NAME) {
			// save original list of parameters in l
			val l = new ArrayList<Pair<String, TypeReference>>
			for (p1 : m.parameters)
				l.add(new Pair(p1.simpleName, p1.type))

			m.parameters.toList.clear
			// reset parameters and add _self as first parameter
			m.addParameter(SELF_VAR_NAME, newTypeReference(identifier))

			for (param : l)
				m.addParameter(param.key, param.value)
				
			// If the initial operation is abstract, the new static one must be tagged as abstract to perform some computations afterward.
			if (m.abstract)
				m.addAnnotation(newAnnotationReference(typeof(Abstract).findTypeGlobally))
		}

		m.setStatic(true)
	}

	private def methodProcessingAddSuper(MutableMethodDeclaration m, MutableClassDeclaration clazz,
		String aspectizedClassName, extension TransformationContext cxt) {
		if (!m.annotations.exists[annotationTypeDeclaration.simpleName == OVERRIDE_METHOD])
			return

		// Add a method "super_methodName" which call first method in the
		// super class hierarchy with the same name.
		val superClasses = Helper::getAnnotationWithType(clazz).map[cl|findTypeGlobally(cl.name) as ClassDeclaration].
			filterNull.toSet
		val superCl = if(clazz.extendedClass === null) null else findTypeGlobally(
				clazz.extendedClass.name) as ClassDeclaration

		if (superCl !== null)
			superClasses.add(superCl)
		if (superClasses.empty)
			return

		// TODO findMethod does not support the annotation 'with' yet.
		val superMeths = superClasses.map[sc|Helper::findMethod(sc, m, cxt)].// The super operations must not be abstract.
		filterNull.filter[annotations.findFirst[annotationTypeDeclaration.simpleName == 'Abstract'] === null]
		val multiSuper = superMeths.size > 1

		superMeths.forEach [ sm |
			val superAspectedClassName = Helper::getAspectedClassName(sm.declaringType).split("\\.").last
			val superNamePrefix = if(multiSuper) "super_" + superAspectedClassName + "_" else "super_"

			clazz.addMethod(superNamePrefix + m.simpleName, [
				val paramsList = new StringBuilder
				visibility = Visibility::PRIVATE
				static = true
				returnType = m.returnType

				// inject the companion xxxAspectProperties as first parameter of the priv method
				// addParameter(PROP_VAR_NAME, findClass(clazz.qualifiedName+ aspectizedClassName  + PROP_NAME).newTypeReference)
				for (p : m.parameters)
					addParameter(p.simpleName, p.type)
				paramsList.append(m.parameters.map[simpleName].join(','))
				// TODO find super method
				body = [
					'''
						final «sm.declaringType.newTypeReference.name+ superAspectedClassName + PROP_NAME» «PROP_VAR_NAME» = «sm.declaringType.newTypeReference.name+ superAspectedClassName + CTX_NAME».getSelf(«SELF_VAR_NAME»);
						«IF (sm.returnType.name != "void")»return «ENDIF» «sm.declaringType.newTypeReference.name».«PRIV_PREFIX+m.simpleName»(«PROP_VAR_NAME», «paramsList»);
					'''
				]
				primarySourceElement = m
			])
		]
	}

	/**
	 * used annotations: ReplaceAspectMethod
	 * Add "_hidden_" at the beginning of the replaced method name
	 */
	private def methodProcessingAddHidden(MutableMethodDeclaration m, String identifier,
		extension TransformationContext cxt) {
		// Add "_hidden_" at the beginning of the replaced method name
		if (m.annotations.exists[annotationTypeDeclaration.simpleName == "ReplaceAspectMethod"]) {
			val cl = findClass(identifier)

			if (cl !== null) {
				val m2 = cl.declaredMethods.findFirst [m2|
					m2.simpleName == m.simpleName && m2.parameters.size == m.parameters.size - 1
				]
				m2.setSimpleName("_hidden_" + m.simpleName)
			}
		// TODO Do that for all super and lower classes
		}
	}


	/**
	 * Add the _privk3_ method with the original body computed by xtend
	 */
	private def void methodProcessingAddPriv(MutableMethodDeclaration m, MutableClassDeclaration clazz,
		String aspectizedClassName, Map<MutableMethodDeclaration, String> bodies, extension TransformationContext cxt) {

		// Make PRIV_PREFIX+methodName as a copy of the method
		clazz.addMethod(PRIV_PREFIX + m.simpleName, [
			primarySourceElement = m
			visibility = Visibility::PROTECTED
			static = true
			abstract = false
			returnType = m.returnType
			if (m.abstract)
				body = ['''throw new java.lang.RuntimeException("Not implemented");''']
			else if (m.body === null)
				body = [bodies.get(m)] // getters & setters
			else
				body = m.body
			// inject the companion xxxAspectProperties as first parameter of the priv method
			addParameter(PROP_VAR_NAME,
				findClass(clazz.qualifiedName + aspectizedClassName + PROP_NAME).newTypeReference)
			for (p : m.parameters)
				addParameter(p.simpleName, p.type)
		])
	}

	/**
	 * Change the body of the original method in order to call the appropriate _privk3_ methods.
	 * Ie. does a dispatch that search in the aspect hierarchy the method that need to be called 
	 */
	private def methodProcessingChangeBody(MutableMethodDeclaration m, MutableClassDeclaration clazz,
		extension TransformationContext cxt, /*Map<MethodDeclaration, Set<MethodDeclaration>> dispatchmethod,*/
		List<String> inheritList, String className) {
		// Change the body of the method to call the closest method PRIV_PREFIX+methodName in the aspect hierarchy
		
		val dt = m.declaringType
		var parametersString = m.parameters.map[simpleName].join(',')
		val boolean isStep = m.annotations.exists[annotationTypeDeclaration.simpleName == STEP]
		val returnInstruction = getReturnInstruction(m, cxt)
		val hasReturn = returnInstruction.contains("return")
		val callSB = new StringBuilder
		
		val resultVar = "result"

		// takes care of return 
		// takes care of @Step annotation
		var String privcall = '''«dt.newTypeReference.name».«PRIV_PREFIX+m.simpleName»(_self_, «parametersString.replaceFirst(SELF_VAR_NAME,
							"(" + Helper::getAspectedClassName(dt) + ")"+SELF_VAR_NAME)»)'''
		if (isStep) {
			val parametersWithoutSelf = if (parametersString.contains(',')) parametersString.substring(parametersString.indexOf(',') + 1) else "";
			privcall = surroundWithStepCommandExecution(className, m.simpleName, privcall, hasReturn, resultVar, parametersWithoutSelf)
		} else if (hasReturn)
			privcall = '''«resultVar» = «privcall»'''
		
		// add existing dispatch code for this method
		// this may occurs in case of incremental build		
		projectStaticDispatchBuilder.findExistingDispatchCalls(m, cxt).forEach[dpc|
			callSB.append('''«dpc»
			''')
		]
		
		// add call to private method
		// note: only this call will take care of the @Step annotation
		callSB.append('''// «DISPATCH_POINTCUT_KEY» «Helper::initialMethodSignature(m)»
if («SELF_VAR_NAME» instanceof «Helper::getAspectedClassName(dt)»){
	«privcall»;
}''')

		m.abstract = false

		m.body = [
			getBody(clazz, className, callSB.toString, returnInstruction)
		]
	}

	private def hasReturnType(MutableMethodDeclaration declaration, extension TransformationContext cxt) {
		return ( declaration.returnType != newTypeReference("void") )
	}

	private def getReturnInstruction(MutableMethodDeclaration declaration, extension TransformationContext cxt) {
		var ret = ""
		if (hasReturnType(declaration, cxt)) {
				if (! declaration.returnType.inferred) {
					ret = "return (" + declaration.returnType.name + ")result;"
				} else {
					cxt.addError(declaration,
						"Cannot infer return type. Please specify the return type of this method.")
					// TODO DVK. I think we can relax this restriction in this case by changing the generated code in order to directly assign the private method to the result without using an intermediate variable 
					// not inferred, so cannot call its name there
					ret = "return result;"
				}
		} else {
			ret = ""
		}
		return ret
	}
	
	private def String surroundWithStepCommandExecution(String className, String methodName, String code, boolean hasReturn, String resultVar, String parameters) {
		return '''
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
				@Override
				public void execute() {
					«IF hasReturn»
					addToResult(«code»);
					«ELSE»
					«code»;
					«ENDIF»
				}
			};
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
			if (stepManager != null) {
				stepManager.executeStep(_self, new Object[] {«parameters»}, command, "«className»", "«methodName»");
			} else {
				command.execute();
			}
			«IF hasReturn»
			«resultVar» = command.getResult().get();
			«ENDIF»
		'''
	}
		
	/**
	 * Creates the body for the method that is able to take of the <i>_self_</i> property.
	 * Ie call that is able to know about the companion object *AspectProperties.
	 * @param clazz type of the aspect (used to compute the name of AspectProperties class)
	 * @param className
	 * @param call
	 * 
	 */
	private def CharSequence getBody(MutableClassDeclaration clazz, String className,
		String call, String returnStatement) {

		return '''
		final «clazz.qualifiedName + className + PROP_NAME» «PROP_VAR_NAME» = «clazz.qualifiedName + className + CTX_NAME».getSelf(«SELF_VAR_NAME»);
		«IF returnStatement.contains("return")»
			Object result = null;
		«ENDIF»
		«call.toString»;
		«returnStatement»'''
	}

	/**
	 * In the case of multi-inheritance, operations of the aspects that cannot be classically extended must be added
	 * to the class.
	 */
	private def methodProcessingAddMultiInheritMeth(MutableClassDeclaration clazz, String identifier,
		extension TransformationContext cxt) {
		val superClasses = Helper::getAnnotationWithType(clazz).filter[cl|cl != clazz.extendedClass].map [cl |
			cxt.findClass(cl.name)
		].filterNull
		val Set<MutableClassDeclaration> scs = newHashSet
		superClasses.forEach[sc|Helper::getSuperClasses(sc, scs, cxt)]

		scs.forEach [ sc |
			// Only non-private methods which does not already exist in the aspect class are considered.
			sc.declaredMethods.filter [dm |
				dm.visibility != Visibility::PRIVATE && !dm.simpleName.startsWith(PRIV_PREFIX) &&
					!clazz.declaredMethods.exists[dm2|Helper::isSamePrototype(dm, dm2, true)]
			].forEach [ dm |
				// Adding a new proxy method in the aspect class.
				val me = clazz.addMethod(dm.simpleName) [
					primarySourceElement = dm
					visibility = dm.visibility
					static = true
					final = false
					abstract = false
					returnType = dm.returnType
					addParameter(SELF_VAR_NAME, cxt.newTypeReference(identifier))
					dm.parameters.drop(1).forEach[par|addParameter(par.simpleName, par.type)]
				]

				// This new method must be transformed like the other ones.
				methodProcessingAddSelfStatic(me, identifier, cxt)
				// The proxy consists of calling the corresponding operation in the targeted aspect class.
				val params = me.parameters.map[simpleName].join(',')
				me.body = [
					'''«IF me.returnType === null || me.returnType.simpleName == 'void'»«ELSE»return «ENDIF»«sc.simpleName».«dm.simpleName»(«params»);'''
				]
			]

			sc.declaredFields.filter[simpleName != PROP_VAR_NAME].forEach [ fi |
				val clName = fi.declaringType.simpleName

				clazz.addMethod(fi.simpleName) [
					primarySourceElement = fi
					static = true
					returnType = fi.type
					addParameter(SELF_VAR_NAME, cxt.newTypeReference(identifier))
					body = ['''return «clName».«fi.simpleName»(«SELF_VAR_NAME»);''']
				]

				if (!fi.final)
					clazz.addMethod(fi.simpleName) [
						primarySourceElement = fi
						static = true
						returnType = cxt.newTypeReference("void")
						addParameter(SELF_VAR_NAME, cxt.newTypeReference(identifier))
						addParameter(fi.simpleName, fi.type)
						body = ['''«clName».«fi.simpleName»(«SELF_VAR_NAME», «fi.simpleName»);''']
					]
			]
		]
	}

	private def methodsProcessing(MutableClassDeclaration clazz, TransformationContext cxt, String identifier,
		Map<MutableMethodDeclaration, String> bodies,
		List<String> inheritList,
		String aspectizedClassName) {
		
		for (m : clazz.declaredMethods) {
			
			if (checkAnnotationprocessorCorrect(m, clazz, cxt)) {
				
				m.removeAnnotation(m.annotations.findFirst[an | an.annotationTypeDeclaration.qualifiedName=="java.lang.Override"])
				
				methodProcessingAddSelfStatic(m, identifier, cxt)
				methodProcessingAddSuper(m, clazz, aspectizedClassName, cxt)
				methodProcessingAddHidden(m, identifier, cxt)
				methodProcessingAddPriv(m, clazz, aspectizedClassName, bodies, cxt)
				methodProcessingChangeBody(m, clazz, cxt, inheritList, aspectizedClassName)
			} else
				cxt.addError(m, "Cannot find a super method in the aspect hierarchy.")
		}
		
		methodProcessingAddMultiInheritMeth(clazz, identifier, cxt)
	}

	/** Checks that the given method of the given class is correctly tagged with the annotation OverrideAspectMethod, i.e.
	 * checks that a super method exists in its hierarchy. */
	private def boolean checkAnnotationprocessorCorrect(MutableMethodDeclaration m,
		MutableClassDeclaration clazz, TransformationContext cxt) {
		if (!m.annotations.exists[annotationTypeDeclaration.simpleName == OVERRIDE_METHOD]) {
			return true
		}
		val supers = Helper::getDirectPrimaryAndSecondarySuperClasses(clazz, cxt)
		if (supers.empty) {
			cxt.addError(clazz, "passe par la")
			return false
		}

		return supers.exists[superCl|Helper::findMethod(superCl, m, cxt) !== null]
	}

	private def constructorsProcessing(MutableClassDeclaration clazz, TransformationContext cxt,
		String identifier, Map<MutableMethodDeclaration, String> bodies,
		String className) {

		for (c : clazz.declaredConstructors) {
			if (c.body !== null) {
				cxt.addError(c,
					"Constructors not supported in aspect. Please consider using the @AspectInitializer annotation instead."
				)
			}
		}
	}

	/**
	 * Create the class which links classes with their aspects
	 */
	private def aspectContextMaker(extension TransformationContext context, MutableClassDeclaration clazz,
		String className, String identifier) {
		val holderClass = findClass(clazz.qualifiedName + className + CTX_NAME)

		if (holderClass === null)
			return;

		holderClass.primarySourceElement = clazz
		holderClass.visibility = Visibility::PUBLIC
		holderClass.addConstructor [
			visibility = Visibility::PRIVATE
			primarySourceElement = clazz
		]

		holderClass.addField('INSTANCE') [
			visibility = Visibility::PUBLIC
			static = true
			final = true
			type = holderClass.newTypeReference
			initializer = ['''new «holderClass.simpleName»()''']
			primarySourceElement = clazz
		]

		holderClass.addMethod('getSelf') [
			visibility = Visibility::PUBLIC
			static = true
			addParameter("_self", newTypeReference(identifier))
			returnType = findClass(clazz.qualifiedName + className + PROP_NAME).newTypeReference
			body = [
						'''		if (!INSTANCE.map.containsKey(_self))
			INSTANCE.map.put(_self, new «clazz.qualifiedName + className + PROP_NAME»());
		return INSTANCE.map.get(_self);'''
			]
			primarySourceElement = clazz
		]

		holderClass.addField('map') [
			visibility = Visibility::PRIVATE
			static = false
			type = newTypeReference("java.util.Map", newTypeReference(identifier),
				findClass(clazz.qualifiedName + className + PROP_NAME).newTypeReference)
			initializer = [
				'''new java.util.WeakHashMap<«identifier + Helper::mkstring(newTypeReference(identifier).actualTypeArguments,",","<",">")», «clazz.qualifiedName + className + PROP_NAME»>()'''
			]
			primarySourceElement = clazz
		]

		holderClass.addMethod('getMap') [
			visibility = Visibility::PUBLIC
			static = false
			returnType = newTypeReference("java.util.Map", newTypeReference(identifier),
				findClass(clazz.qualifiedName + className + PROP_NAME).newTypeReference)
			body = ['''return map;''']
			primarySourceElement = clazz
		]
	}

	/** Move non static fields */
	private def fieldProcessingMoveField(MutableClassDeclaration clazz, 
			List<MutableFieldDeclaration> toRemove,
			List<MutableFieldDeclaration> propertyAspect, 
			String className,
			extension TransformationContext context) {
		val c = findClass(clazz.qualifiedName + className + PROP_NAME)
		if (c === null)
			addError(clazz,
				"Cannot resolve the class to aspectise. Check that the classes to aspectise are not in the same project that your aspects."
			)
		else {
			for (f : clazz.declaredFields) {
				if (!f.static) {
					if (f.simpleName != PROP_VAR_NAME) {
						toRemove.add(f)
						

						if (!f.annotations.exists[annotationTypeDeclaration.simpleName == "NotAspectProperty"])
							propertyAspect.add(f)

						val newField = c.addField(f.simpleName) [
							visibility = Visibility::PUBLIC
							static = f.static
							final = f.final
							type = f.type
							if(f.initializer !== null) initializer = f.initializer
							primarySourceElement = f
						]
						f.annotations.forEach[an | newField.addAnnotation(an)]
					} else {
						f.type = findClass(clazz.qualifiedName + className + PROP_NAME).newTypeReference
						f.static = true
					}
				}
			}
		}
	}

	private def fieldProcessingAddGetterSetter(MutableClassDeclaration clazz,
		List<MutableFieldDeclaration> propertyAspect, String identifier,
		Map<MutableMethodDeclaration, String> bodies, extension TransformationContext context) {
		for (f : propertyAspect) {
			var get = clazz.addMethod(f.simpleName) [
				returnType = f.type
				addParameter(SELF_VAR_NAME, newTypeReference(identifier))
				primarySourceElement = f
				visibility = f.visibility
				f.annotations.forEach[ann | addAnnotation(ann)]
			]

			val gemocHackGetter = '''
				try {
					for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
						if (m.getName().equals("«IF f.type.simpleName == "boolean" || f.type.simpleName == "Boolean"»is«ELSE»get«ENDIF»«f.simpleName.substring(0,1).toUpperCase() + f.simpleName.substring(1)»") &&
							m.getParameterTypes().length == 0) {
								Object ret = m.invoke(_self);
								if (ret != null) {
									return («f.type.type.qualifiedName») ret;
								}«IF !f.type.primitive» else {
									return null;
								}
								«ENDIF»
						}
					}
				} catch (Exception e) {
					// Chut !
				}
				return «PROP_VAR_NAME».«f.simpleName»;
			'''

			bodies.put(get, '''«gemocHackGetter»''')

			val gemocHackSetter = '''
				try {
					for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
						if (m.getName().equals("set«f.simpleName.substring(0,1).toUpperCase() + f.simpleName.substring(1)»")
								&& m.getParameterTypes().length == 1) {
							m.invoke(_self, «f.simpleName»);
							setterCalled = true;
						}
					}
				} catch (Exception e) {
					// Chut !
				}
			'''

			if (!f.final) {
				var set = clazz.addMethod(f.simpleName) [
					returnType = newTypeReference("void")
					addParameter(SELF_VAR_NAME, newTypeReference(identifier))
					addParameter(f.simpleName, f.type)
					visibility = f.visibility
					primarySourceElement = f
					f.annotations.forEach[ann | addAnnotation(ann)]
				]

				bodies.put(set, '''
					boolean setterCalled = false;
					«gemocHackSetter»
					if (!setterCalled) {
						«PROP_VAR_NAME».«f.simpleName» = «f.simpleName»;
					}
					''')
			}
		}
	}

	/**
	 * Move fields of the aspect to the AspectProperties class
	 */
	private def fieldsProcessing(extension TransformationContext context, MutableClassDeclaration clazz,
		String className, String identifier, Map<MutableMethodDeclaration, String> bodies) {
		val List<MutableFieldDeclaration> toRemove = newArrayList
		val List<MutableFieldDeclaration> propertyAspect = newArrayList

		fieldProcessingMoveField(clazz, toRemove, propertyAspect, className, context)
		// DVK changing _self_ into a local variable fieldProcessingAddField(clazz, className, context)
		fieldProcessingAddGetterSetter(clazz, propertyAspect, identifier, bodies, context)

//targetToSourceMap.

		//context.
		for (f : toRemove) {
			val	field = f as MutableFieldDeclaration
			//EcoreUtil.remove(f)
			//val t = f.type
			//val cUnit = f.compilationUnit as CompilationUnitImpl
			//cUnit.jvmModelAssociator.removeAllAssociation(f)
			field.remove
			
		}
	}
				
	/**
	 * Generate the code and file for a ClassDeclaration
	 * Ie. if the ClassDeclaration contains at least one Method 
	 * with  ReplaceAspectMethod annotation or one field with SynchroField annotation
	 */
	private def generateAspectJCodeForClass(ClassDeclaration classDecl, extension CodeGenerationContext context) {
		val typeRef = Helper::getAnnotationAspectType(classDecl)
		val stAspectJ = new StringBuilder
		var doGenerate=false
		stAspectJ.append("package " + typeRef.name.subSequence(0, typeRef.name.lastIndexOf(".")) + ";\n")
		stAspectJ.append("public aspect AspectJ" + typeRef.simpleName + "{\n")
		for (m : classDecl.declaredMethods) {
			if (m.annotations.exists[annotationTypeDeclaration.simpleName == "ReplaceAspectMethod"]) {
				doGenerate=true
				stAspectJ.append(
					m.returnType.simpleName + " around (" + typeRef.name +
						" self)  :target (self) && (call ( " + m.returnType.name + " " + typeRef.name +
						"." + m.simpleName + "( ");
				m.parameters.forEach [p|
					stAspectJ.append(p.type.name)
					if(!m.parameters.last.equals(p)) stAspectJ.append(",")
				]
				stAspectJ.append(" ) ) ) { ");
				if (!"void".equals(m.returnType.name))
					stAspectJ.append("return ")
				stAspectJ.append( classDecl.qualifiedName + "." + m.simpleName + "(self");
				for (var i = 0; i < m.parameters.size; i++) {
					stAspectJ.append(","+
						"(" + m.parameters.get(i).type.name + ")thisJoinPoint.getArgs()[" + i + "]")
				}
				stAspectJ.append(" );}\n")
			} 

		}

		for (a : classDecl.declaredFields) {
			if (a.annotations.exists[annotationTypeDeclaration.simpleName == "SynchroField"]) {
				doGenerate=true
				stAspectJ.append("void around ("+ typeRef.name+" self)  :target (self) &&  call ( void "+ typeRef.simpleName+".");
				stAspectJ.append("set"+a.simpleName.toFirstUpper + "("+ a.type.name + ")){")
				stAspectJ.append(classDecl.qualifiedName+"."+ a.simpleName +"(self, (" + a.type.name +")thisJoinPoint.getArgs()[0]);");
				stAspectJ.append("proceed(self);\n}\n")		
				stAspectJ.append("void around ("+ typeRef.name+" self)  :target (self) &&  call ( void "+ classDecl.qualifiedName+".");
				stAspectJ.append(a.simpleName + "("+typeRef.name +"," +a.type.name + ")){")
				stAspectJ.append("self.set"+ a.simpleName.toFirstUpper +"( (" + a.type.name +")thisJoinPoint.getArgs()[0]);");
				stAspectJ.append("proceed(self);\n}\n")		
			}
		} 
		stAspectJ.append("\n}\n")
		val filePath = classDecl.compilationUnit.filePath
		var Path targetFilePath = filePath.targetFolder.append(
			typeRef.name.subSequence(0, typeRef.name.lastIndexOf(".")).toString.replace(".",/*File.separatorChar.toString*/"/" ) + "/AspectJ" + typeRef.simpleName + ".aj")
			
		val contents = '''// AspectJ classes that have been aspectized and name
«stAspectJ.toString»'''
		if (doGenerate) {
			Helper::writeContentsIfNew(targetFilePath, contents, context)
		}
	}
	
	/**
	 * Change the generated java code of parent aspects of this class (only in the same project) in order
	 * to inject the dispatch code to this child classDecl 
	 */
	private def injectDispatchInParentAspects(ClassDeclaration classDecl, extension CodeGenerationContext context) {
		// deal with dispatch methods of parent classes that are in the current project

		val List<ClassDeclaration> allSuperClasses = newArrayList 
		Helper.getAllPrimaryAndSecondarySuperClasses(allSuperClasses, classDecl, context)

		// for all methods declared in the class, look for the same method in the superclasses and inject dispatch code
		//val Set<String> dispatchStaticInjection = newHashSet
 		 
		for (m : classDecl.declaredMethods) {
			val methodSignature = Helper::initialMethodSignature(m) 
			for(superclass : allSuperClasses) {
				// staticdispatch works only in a hierarchy of classes with @Aspect annotation
				if( superclass.annotations.exists[annotationTypeDeclaration.simpleName == Aspect.simpleName] &&
					superclass.declaredMethods.exists[supermethod |  methodSignature == Helper::initialMethodSignature(supermethod)]
				) {
										
					// search the Pointcut for this method and add a call to the child aspect
					// superclass.compilationUnit.filePath may return a path to the current compilation unit instead of the real java file
					// uses aspectMappingBuilder to make sure to process only classes in the current project 
					val isSuperClassInProject = this.aspectMappingBuilder.allDeclaredAspects.contains(superclass.qualifiedName)
					if(isSuperClassInProject) {
						val superclassfilePath = superclass.compilationUnit.filePath					
						val Path superclasstargetFolder =
						if ((superclassfilePath.sourceFolder.relativize(superclassfilePath.projectFolder).segments.length > 1) &&
							superclassfilePath.targetFolder.relativize(superclassfilePath.projectFolder).segments.length == 1
							) {
								// suspicious target folder due to bug in xtend superclassfilePath.targetFolder
							// in case of /src/main/java it returns /xtend-gen instead of /src/main/xtend-gen as it is configured in eclipse 
							// when using xtend-gen as output without specifying "allow output directory per source folder" (actually, I'm not sure this behavior is correct) 
							// applying workaround
							superclassfilePath.sourceFolder.parent.append(
									superclassfilePath.targetFolder.relativize(superclassfilePath.projectFolder).toString)
						} else {
							superclassfilePath.targetFolder
						}
						var superclassjavafile = superclasstargetFolder.append(superclass.qualifiedName.replace('.', '/') + ".java")
						// due to parallel jobs, the file may not exist yet
						// or may be currently being written
						if(!waitForFileContent(superclassjavafile, context)){
							// timeout occured
							println('''[«this»] Timeout occured while processing «classDecl.qualifiedName».«m.simpleName». Aspect processor is waiting for «superclassjavafile» ''')
						} else synchronized(lock){						
						 	
							val hasReturn = m.returnType.name != "void"
							// call the public helper for this type (this ensures correct dispatch)
							val parametersString = if(m.parameters.empty) '''«"(" + Helper::getAspectedClassName(classDecl) + ")"+SELF_VAR_NAME»'''
								else '''(«Helper::getAspectedClassName(classDecl)»)«SELF_VAR_NAME»,«m.parameters.map[simpleName].join(',')»'''
							var call = '''«classDecl.qualifiedName».«m.simpleName»(«parametersString»);'''
							if (hasReturn) 
								call = '''«RESULT_VAR» = «call»'''
							
							val String 	dispatchInjectKey = '''// BeginInjectInto «superclass.qualifiedName»#«Helper::methodSignature(m)» from «classDecl.qualifiedName»'''					
							val String dispatchInjectCodeForParent = '''	«dispatchInjectKey»
		if («SELF_VAR_NAME» instanceof «Helper::getAspectedClassName(classDecl)»){
			«call»
		} else
		// EndInjectInto «superclass.qualifiedName»#«Helper::methodSignature(m)» from «classDecl.qualifiedName»'''
						 	projectStaticDispatchBuilder.add(dispatchInjectCodeForParent)
							
				 			//waitForFileContent(superclassjavafile, context)	
							val aspectJavaFileContent = readFileContents(superclassjavafile, context) //superclassjavafile.contents.toString
							
				 			if(!aspectJavaFileContent.contains(dispatchInjectKey)){
								// the parent does not already has this dispatch
								// add it above the pointcut 
							
								val pointcutString = "// "+DISPATCH_POINTCUT_KEY+" "+Helper::initialMethodSignature(m)
								val pointcutReplacement ='''
			«dispatchInjectCodeForParent»
			// «DISPATCH_POINTCUT_KEY» «Helper::methodSignature(m)»'''
								
								// println("----- Contributing dispatch for "+pointcutString+" in "+superclassjavafile +" found="+aspectJavaFileContent.contains(pointcutString))
								val newContent = aspectJavaFileContent.replace(pointcutString, pointcutReplacement)
								superclassjavafile.contents = newContent
								// wait for complete writing before releasing lock, due to the async writing of xtend
				 				var timeout = 40
		    					do {
		        					Thread.sleep(100);
		        					timeout--
		    					} while (superclassjavafile.contents.toString != newContent && timeout > 0)
							}
						}
					}
				}
			}		
		}
		
		projectStaticDispatchBuilder.cleanDeprecatedDispatchFiles(classDecl.compilationUnit, context)
	
	}
	
	/**
	 * wait a little for content 
	 * timeout after 2 seconds
	 * does NOT use org.eclipse.xtend.lib.macro.file.Path.getContents() because it seems to trigger events that reschedules some build phase 
	 * @return true if content has been retreived or false if timeout occured
	 */
	private def boolean waitForFileContent(Path file, extension CodeGenerationContext context){
		var timeout = 20		// due to parallel jobs, the file may not exist yet 
		val File f = new File (file.toURI.path)	// do not use xtend Path.getContents because it seems to trigger additional build phases		
		while(!f.exists && timeout > 0){
			Thread.sleep(100)
			timeout--
		}
		timeout = 20
		while(f.length === 0 && timeout > 0){
			Thread.sleep(100)
			timeout--
		}
		return (timeout !== 0)
	}
	/**
	* read the content of the given file
	* does NOT use org.eclipse.xtend.lib.macro.file.Path.getContents() because it seems to trigger events that reschedules some build phase
	* -> do it using plain java so it doesn't trigger eclipse event
	*/	
	private def String readFileContents(Path file, extension CodeGenerationContext context){
		val BufferedReader br = new BufferedReader(new FileReader(file.toURI.path))	// do not use xtend Path.getContents because it seems to trigger additional build phases		
		val sb = new StringBuilder
		var String line = br.readLine();
	    while (line !== null) {
	        sb.append(line);
	        sb.append(System.lineSeparator());
	        line = br.readLine();
	    }
		return sb.toString
	}
}

/**
 * Comparator for MethodDeclaration
 */
class SortMethod implements Comparator<MethodDeclaration> {
	TypeLookup context

	new(TypeLookup context) {
		this.context = context
	}

	def override int compare(MethodDeclaration arg0, MethodDeclaration arg2) {
		val ext = new ArrayList<ClassDeclaration>
		val ext1 = new ArrayList<ClassDeclaration>

		Helper::getSuperClass(ext1, arg2.declaringType as ClassDeclaration, context)
		Helper::getSuperClass(ext, arg0.declaringType as ClassDeclaration, context)
		//val buf = new StringBuffer
		//ext1.forEach[e|buf.append(e.simpleName +" ")]
		//val buf1 = new StringBuffer
		//ext.forEach[e|buf1.append(e.simpleName +" ")]
		//context.addWarning(arg2,arg2.declaringType.simpleName + buf)
		
		
		if (ext.contains(arg2.declaringType)) {
			// context.addError(arg0.declaringType,arg0.declaringType.simpleName + " > " + arg2.declaringType.simpleName+" " +ext.size)
			return -1
		} else if (ext1.contains(arg0.declaringType)) {
			// context.addError(arg0.declaringType,arg0.declaringType.simpleName + " < " + arg2.declaringType.simpleName + " " +ext1.size)
			return 1
		} else {
			// context.addError(arg0.declaringType,arg0.declaringType.simpleName + " = " + arg2.declaringType.simpleName)
			return 0
		}
	}
}
