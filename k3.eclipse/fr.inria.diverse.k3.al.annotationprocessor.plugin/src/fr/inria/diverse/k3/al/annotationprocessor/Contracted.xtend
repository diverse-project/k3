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

import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

import java.lang.annotation.ElementType
import java.lang.annotation.Target

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Random

@Target(ElementType::TYPE)
@Active(typeof(ContractedProcessor))
annotation Contracted {}

@Target(ElementType::METHOD)
annotation Pre {}

@Target(ElementType::METHOD)
annotation Post {}

@Target(ElementType::METHOD)
annotation Inv {}

class ContractedProcessor extends AbstractClassProcessor
{
	private List<MutableMethodDeclaration> invariants     = newArrayList
	private List<MutableMethodDeclaration> preConditions  = newArrayList
	private List<MutableMethodDeclaration> postConditions = newArrayList
	private extension TransformationContext context

	override doTransform(MutableClassDeclaration annotatedCls, extension TransformationContext ctx) {
		context = ctx
		val Map<MutableMethodDeclaration, String> bodies = new HashMap<MutableMethodDeclaration, String>()

		getAllInvs(annotatedCls, invariants)

		preConditions.addAll(annotatedCls.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration == Pre.newTypeReference.type]])

		postConditions.addAll(annotatedCls.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration == Post.newTypeReference.type]])

		if (!check()) {
			return
		}

		if (invariants.size > 0) {
			annotatedCls.declaredMethods
			.filter[
				!^static
				&& !annotations.exists[
					#[Pre.newTypeReference.type, Post.newTypeReference.type, Inv.newTypeReference.type]
					.contains(annotationTypeDeclaration)
				]
			]
			.forEach[m |
				annotatedCls.addMethod(PREPRIV_PREFIX + m.simpleName.toFirstUpper)[
					visibility = Visibility::PRIVATE
					static     = m.static
					final      = m.final
					returnType = m.returnType

					m.parameters.forEach[p | addParameter(p.simpleName, p.type)]

					if (m.body === null)
						body = [bodies.get(m)]
					else
						body = m.body
				]

				val isVoid = m.returnType.simpleName == "void"
				val preConditionsMethods = new ArrayList<MutableMethodDeclaration>
				getAllPre(annotatedCls, preConditionsMethods, m.simpleName)

				preConditionsMethods
				.filter[preConditionMethod |
					!annotatedCls.declaredMethods.exists[m_ | m_ == preConditionMethod]
				]
				.forEach[preConditionMethod |
					val randomIndex = new Random().nextInt(1000000)
					val mName = preConditionMethod.simpleName
					val mNameWithIndex = mName + randomIndex

					preConditionMethod.setSimpleName(mNameWithIndex)

					preConditionMethod.declaringType.addMethod(mName)[
						returnType = preConditionMethod.returnType
						^static = false
						^final = false
						visibility = Visibility::PROTECTED

						body = '''
							return this.«mNameWithIndex»() ;
						'''

						addAnnotation(newAnnotationReference(Pre.newTypeReference.type))
					]
				]

				val preConditionsExpr =
					if (preConditions.empty) "true"
					else preConditionsMethods.map[simpleName + "()"].join(" || ")
				val invariantsExpr =
					if (invariants.empty) "true"
					else invariants.map[simpleName + "()"].join(" && ")

				val wrappedBody = '''
					if («preConditionsExpr» && «invariantsExpr»)
					    «IF !isVoid»return «ENDIF»«PREPRIV_PREFIX»«m.simpleName.toFirstUpper»(«m.parameters.map[simpleName].join(", ")»);
					else
						throw new fr.inria.diverse.k3.al.annotationprocessor.PreConditionViolationException();
					 '''

				m.body = [wrappedBody]
				bodies.put(m, wrappedBody)

				annotatedCls.addMethod(POSTPRIV_PREFIX + m.simpleName.toFirstUpper)[
					visibility = Visibility::PRIVATE
					^static = m.static
					^final = m.final
					^returnType = m.returnType

					if (m.body === null)
						body = [bodies.get(m)]
					else
						body = m.body

					m.parameters.forEach[p | addParameter(p.simpleName, p.type)]
				]

				val postConditionsMethods = new ArrayList<MutableMethodDeclaration>
				getAllPost(annotatedCls, postConditionsMethods, m.simpleName)

				postConditionsMethods
				.filter[postConditionMethod |
					!annotatedCls.declaredMethods.exists[m_ | m_ == postConditionMethod]
				]
				.forEach[postConditionMethod |
					val randomIndex = new Random().nextInt(1000000)
					val mName = postConditionMethod.simpleName
					val mNameWithIndex = mName + randomIndex

					postConditionMethod.setSimpleName(mNameWithIndex)

					postConditionMethod.declaringType.addMethod(mName)[
						returnType = postConditionMethod.returnType
						^static = false
						^final = false
						visibility = Visibility::PROTECTED

						body = '''
							return this.«mNameWithIndex»() ;
						'''

						addAnnotation(newAnnotationReference(Post.newTypeReference.type))
					]
				]

				val postConditionsExpr =
					if (postConditionsMethods.empty) "true"
					else postConditionsMethods.map[simpleName + "()"].join(" && ")

				m.body = '''
					«IF !isVoid»«m.returnType.name» __ret = «ENDIF»«POSTPRIV_PREFIX»«m.simpleName.toFirstUpper»(«m.parameters.map[simpleName].join(", ")»);
					if (!(«postConditionsExpr» && «invariantsExpr»))
						throw new fr.inria.diverse.k3.al.annotationprocessor.PostConditionViolationException();
					«IF !isVoid»return __ret;«ENDIF»
				'''
			]
		} else {
			preConditions.forEach[annotatedMethod |
				val m = annotatedMethod.declaringType.declaredMethods.findFirst[simpleName == annotatedMethod.simpleName.substring(3).toFirstLower]

				annotatedMethod.declaringType.addMethod(PREPRIV_PREFIX + m.simpleName.toFirstUpper)[
					visibility = Visibility::PRIVATE
					^static = m.static
					^final = m.final
					returnType = m.returnType

					if (m.body === null)
						body = [bodies.get(m)]
					else
						body = m.body

					m.parameters.forEach[p | addParameter(p.simpleName, p.type)]
				]

				val isVoid = m.returnType.simpleName == "void"

				val wrappedBody = '''
					if («PRE_PREFIX»«m.simpleName.toFirstUpper»())
						«IF !isVoid»return «ENDIF»«PREPRIV_PREFIX»«m.simpleName.toFirstUpper»(«m.parameters.map[simpleName].join(", ")»);
					else
						throw new fr.inria.diverse.k3.al.annotationprocessor.PreConditionViolationException();
				'''

				m.body = [wrappedBody]
				bodies.put(m, wrappedBody)
			]

			postConditions.forEach[annotatedMethod |
				val m = annotatedMethod.declaringType.declaredMethods.findFirst[simpleName == annotatedMethod.simpleName.substring(4).toFirstLower]

				annotatedMethod.declaringType.addMethod(POSTPRIV_PREFIX + m.simpleName.toFirstUpper)[
					visibility = Visibility::PRIVATE
					^static = m.static
					^final = m.final
					returnType = m.returnType

					if (m.body === null)
						body = [bodies.get(m)]
					else
						body = m.body

					m.parameters.forEach[p | addParameter(p.simpleName, p.type)]
				]

				val isVoid = m.returnType.simpleName == "void"

				m.body = '''
					«IF !isVoid»«m.returnType.name» __ret = «ENDIF»«POSTPRIV_PREFIX»«m.simpleName.toFirstUpper»(«m.parameters.map[simpleName].join(", ")»);
					if (!«POST_PREFIX»«m.simpleName.toFirstUpper»())
						throw new fr.inria.diverse.k3.al.annotationprocessor.PostConditionViolationException();
					«IF !isVoid»return __ret;«ENDIF»
				'''
			]
		}

		invariants.clear
		preConditions.clear
		postConditions.clear
	}

	def boolean check() {
		for (annotatedMethod : invariants) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Invariant methods cannot declare any parameter")
				return false
			}

			if (annotatedMethod.returnType.simpleName != "boolean") {
				annotatedMethod.addError("Invariant methods must return a boolean value")
				return false
			}
		}

		for (annotatedMethod : preConditions) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Precondition methods cannot declare any parameter")
				return false
			}

			if (annotatedMethod.returnType != newTypeReference("boolean")) {
				annotatedMethod.addError("Precondition methods must return a boolean value")
				return false
			}

			if (!annotatedMethod.simpleName.startsWith(PRE_PREFIX) || !Character.isUpperCase(annotatedMethod.simpleName.charAt(3))) {
				annotatedMethod.addError("Precondition methods must be prefixed with " + PRE_PREFIX)
				return false
			}

			if (!annotatedMethod.declaringType.declaredMethods.exists[
				simpleName == annotatedMethod.simpleName.substring(3).toFirstLower
			]) {
				annotatedMethod.addError('''Cannot find referenced contracted method «annotatedMethod.simpleName.substring(3).toFirstLower»''')
				return false
			}
		}


		for (annotatedMethod : postConditions) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Postcondition methods cannot declare any parameter")
				return false
			}

			if (annotatedMethod.returnType != newTypeReference("boolean")) {
				annotatedMethod.addError("Postcondition methods must return a boolean value")
				return false
			}

			if (!annotatedMethod.simpleName.startsWith(POST_PREFIX) || !Character.isUpperCase(annotatedMethod.simpleName.charAt(4))) {
				annotatedMethod.addError("Postcondition methods must be prefixed with " + POST_PREFIX)
				return false
			}

			if (!annotatedMethod.declaringType.declaredMethods.exists[
				simpleName == annotatedMethod.simpleName.substring(4).toFirstLower
			]) {
				annotatedMethod.addError('''Cannot find referenced contracted method «annotatedMethod.simpleName.substring(4).toFirstLower»''')
				return false
			}
		}

		return true
	}

	private def void getAllInvs(MutableClassDeclaration cls, List<MutableMethodDeclaration> invs) {
		invs.addAll(cls.declaredMethods.filter[annotations.exists[annotationTypeDeclaration == Inv.newTypeReference.type]])

		if (cls.extendedClass !== null) {
			val parent = findClass(cls.extendedClass.name)

			if (parent !== null)
				getAllInvs(parent, invs)
		}
	}

	private def void getAllPre(MutableClassDeclaration cls, List<MutableMethodDeclaration> pres, String methodName) {
		pres.addAll(cls.declaredMethods.filter[simpleName == PRE_PREFIX + methodName.toFirstUpper])

		if (cls.extendedClass !== null) {
			val parent = findClass(cls.extendedClass.name)

			if (parent !== null)
				getAllPre(parent, pres, methodName)
		}
	}

	private def void getAllPost(MutableClassDeclaration cls, List<MutableMethodDeclaration> posts, String methodName) {
		posts.addAll(cls.declaredMethods.filter[simpleName == POST_PREFIX + methodName.toFirstUpper])

		if (cls.extendedClass !== null) {
			val parent = findClass(cls.extendedClass.name)

			if (parent !== null)
				getAllPost(parent, posts, methodName)
		}
	}

	private static final String PRE_PREFIX      = "pre"
	private static final String POST_PREFIX     = "post"
	private static final String PREPRIV_PREFIX  = "prepriv"
	private static final String POSTPRIV_PREFIX = "postpriv"
}
