package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.GenericAdapter

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import fr.inria.diverse.k3.sle.utils.AspectToEcore

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class MetaclassAdapterInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore
	@Inject extension K3SLETypesBuilder

	def void generateAdapter(Metamodel mm, ModelType superType, EClass cls, IJvmDeclaredTypeAcceptor acceptor) {
		val mmCls = mm.allClasses.findFirst[name == cls.name]
		//val task = Stopwatches.forTask('''MetaclassAdapterInferrer.generateAdapter(«mm.name», «superType.name», «cls.name»''')
		//task.start

		acceptor.accept(mm.toClass(mm.adapterNameFor(superType, cls)))
		.initializeLater[jvmCls |
			cls.ETypeParameters.forEach[p |
				jvmCls.typeParameters += TypesFactory::eINSTANCE.createJvmTypeParameter => [name = p.name]
			]

			jvmCls.superTypes += mm.newTypeRef(GenericAdapter, mm.newTypeRef(mmCls, #[jvmCls]))
			jvmCls.superTypes += superType.newTypeRef(cls, #[jvmCls])

			// TODO: Generic super types
			cls.EGenericSuperTypes.forEach[sup |]

			// TODO: Type parameters
			cls.ETypeParameters.forEach[p |]

			jvmCls.members += mm.toField("adaptee",  mm.newTypeRef(mmCls, #[jvmCls]))
			jvmCls.members += mm.toGetter("adaptee", mm.newTypeRef(mmCls, #[jvmCls]))
			jvmCls.members += mm.toSetter("adaptee", mm.newTypeRef(mmCls, #[jvmCls]))

			jvmCls.members += mm.toField("adaptersFactory", mm.newTypeRef(mm.getAdaptersFactoryNameFor(superType)))[
				initializer = '''«mm.getAdaptersFactoryNameFor(superType)».getInstance()'''
			]

			cls.EAllAttributes.filter[!isAspectSpecific].forEach[attr |
				val attrType = superType.newTypeRef(attr, #[jvmCls])
				val getterName = if (!mm.isUml(attr.EContainingClass)) attr.getterName else attr.umlGetterName
				val setterName = attr.setterName

				jvmCls.members += attr.toMethod(getterName, attrType)[
					body = '''
						return adaptee.«getterName»() ;
					'''
				]

				if (attr.needsSetter) {
					jvmCls.members += attr.toMethod(setterName, attr.newTypeRef(Void.TYPE))[
						parameters += attr.toParameter("o", attrType)
						body = '''
							adaptee.«setterName»(o) ;
						'''
					]
				}

				if (attr.needsUnsetter)
					jvmCls.members += attr.toUnsetter(attr.name)

				if (attr.needsUnsetterChecker)
					jvmCls.members += attr.toUnsetterCheck(attr.name)
			]

			cls.EAllReferences.filter[!isAspectSpecific].forEach[ref |
				val mmRef = mmCls.EAllReferences.findFirst[name == ref.name]
				val refType = superType.newTypeRef(ref, #[jvmCls])
				val adapName = mm.adapterNameFor(superType, ref.EReferenceType)
				val getterName = if (!mm.isUml(ref.EContainingClass)) ref.getterName else ref.umlGetterName
				val setterName = ref.setterName

				if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
					jvmCls.members += ref.toMethod("getDetails", ref.newTypeRef(EMap, ref.newTypeRef(String), ref.newTypeRef(String)))[
						body = '''return adaptee.getDetails() ;'''
					]
				else
					jvmCls.members += ref.toMethod(getterName, refType)[
						body = '''
							«IF ref.many»
								return fr.inria.diverse.k3.sle.lib.ListAdapter.newInstance(adaptee.«getterName»(), «adapName».class) ;
							«ELSE»
								return adaptersFactory.create«mm.simpleAdapterNameFor(superType, ref.EReferenceType)»(adaptee.«getterName»()) ;
							«ENDIF»
						'''
					]

				if (ref.needsSetter) {
					jvmCls.members += ref.toMethod(setterName, ref.newTypeRef(Void.TYPE))[
						parameters += ref.toParameter("o", refType)

						body = '''
							adaptee.«setterName»(((«adapName») o).getAdaptee()) ;
						'''
					]
				}

				if (ref.needsUnsetter)
					jvmCls.members += ref.toUnsetter(ref.name)

				if (ref.needsUnsetterChecker)
					jvmCls.members += ref.toUnsetterCheck(ref.name)
			]

			cls.EAllOperations.sortByOverridingPriority.filter[!isAspectSpecific]
			.forEach[op |
				val opName = if (!mm.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName

				val newOp = op.toMethod(opName, null)[m |
					val paramsList = new StringBuilder

					op.ETypeParameters.forEach[t |
						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [tp |
							tp.name = t.name
						]
					]

					op.ETypeParameters.forEach[t |
						t.EBounds
						.forEach[b |
							val tp = m.typeParameters.findFirst[name == t.name]

							if (b.EClassifier !== null) {
								tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
									typeReference = superType.newTypeRef(b, #[m, jvmCls])
								]
							} else if (b.ETypeParameter !== null) {
								tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
									typeReference = createTypeParameterReference(#[m, jvmCls], b.ETypeParameter.name)
								]
							}
						]
					]

					op.EParameters.forEach[p, i |
						val pType = superType.newTypeRef(p, #[m, jvmCls])

						m.parameters += op.toParameter(p.name, pType)

						paramsList.append('''
							«IF i > 0», «ENDIF»
							«IF p.EType instanceof EClass && mm.hasAdapterFor(superType, p.EType)»
							((«mm.adapterNameFor(superType, p.EType as EClass)») «p.name»).getAdaptee()
							«ELSE»
							«p.name»
							«ENDIF»
						''')
					]

					// TODO: Manage exceptions
					op.EExceptions.forEach[e |
						m.exceptions += op.newTypeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
					]

					// TODO: Manage generic exceptions
					op.EGenericExceptions.forEach[e |]

					m.body = '''
						«IF op.EType instanceof EClass && mm.hasAdapterFor(superType, cls)»
							«IF op.many»
								return fr.inria.diverse.k3.sle.lib.ListAdapter.newInstance(adaptee.«opName»(«paramsList»), «mm.adapterNameFor(superType, op.EType as EClass)».class) ;
							«ELSE»
								return adaptersFactory.create«mm.simpleAdapterNameFor(superType, op.EType as EClass)»(adaptee.«opName»(«paramsList»)) ;
							«ENDIF»
						«ELSEIF op.EType !== null»
							return adaptee.«opName»(«paramsList») ;
						«ELSE»
							adaptee.«opName»(«paramsList») ;
						«ENDIF»
					'''
				]

				newOp.returnType = superType.newTypeRef(op, #[newOp, jvmCls])
				jvmCls.members += newOp
			]

			mm.allAspects.filter[aspectedClass.name == cls.name]
			.forEach[aspect |
				val asp = aspect.aspectTypeRef.type as JvmDeclaredType
				// FIXME: This should be checked in the recursive hierarchy
				val superMM = mm.inheritanceRelation?.superMetamodel
				val inherited = superMM !== null && superMM.aspects.exists[aspectTypeRef.type.qualifiedName == asp.qualifiedName]

				asp.declaredOperations
				.filter[op |
					   !op.simpleName.startsWith("_privk3")
					&& !op.simpleName.startsWith("super_")
					//&& op.parameters.head?.name == "_self"
					&& !jvmCls.members.exists[opp | opp.simpleName == op.simpleName] // FIXME
				]
				.forEach[op |
					val paramsList = new StringBuilder
					val featureName = asp.findFeatureNameFor(op)
					val mtCls = superType.findClassifier(op.returnType.simpleName)
					val retType =
						if (op.returnType.simpleName == "void")
							mm.newTypeRef(Void.TYPE)
						else if (mtCls !== null)
							superType.newTypeRef(mtCls, #[jvmCls])
						else
							mm.newTypeRef(op.returnType.qualifiedName)

					paramsList.append('''«IF inherited»clsAdaptee«ELSE»adaptee«ENDIF»''')
					op.parameters.drop(if (op.parameters.head?.simpleName == "_self") 1 else 0).forEach[p, i |
						paramsList.append('''
							«IF inherited && superMM.hasAdapterFor(superType, p.parameterType.simpleName)»
								, ((«superMM.adapterNameFor(superType, p.parameterType.simpleName)») «p.name»).getAdaptee()
							«ELSEIF mm.hasAdapterFor(superType, p.parameterType.simpleName)»
								, ((«mm.adapterNameFor(superType, p.parameterType.simpleName)») «p.name»).getAdaptee()
							«ELSE»
								, «p.name»
							«ENDIF»
						''')
					]

					if (featureName === null) {
						jvmCls.members += mm.toMethod(op.simpleName, retType)[
							op.parameters.drop(if (op.parameters.head?.simpleName == "_self") 1 else 0).forEach[p |
								val pCls = superType.findClassifier(p.parameterType.simpleName)
								val pType =
									if (pCls !== null)
										superType.newTypeRef(pCls, #[jvmCls])
									else
										mm.newTypeRef(p.parameterType.qualifiedName)

								parameters += mm.toParameter(p.name, pType)
							]

							body = '''
								«IF inherited»
									«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
									clsAdaptee.setAdaptee(adaptee) ;
									«IF retType.type.simpleName != "void" && retType.type.simpleName != "null"»
										return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								«ELSEIF mm.hasAdapterFor(superType, retType?.type?.simpleName)»
									return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
								«ELSEIF retType.type.simpleName != "void" && retType.type.simpleName != "null"»
									return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
								«ELSE»
									«asp.qualifiedName».«op.simpleName»(«paramsList») ;
								«ENDIF»
							'''
						]
					} else {
						val find = mm.findClass(retType.simpleName)
						val opName = if (op.parameters.size == 1) op.getterName else op.setterName

						if (find !== null) {
							jvmCls.members += mm.toMethod(opName, retType)[
								op.parameters.drop(1).forEach[p |
									val pCls = superType.findClassifier(p.parameterType.simpleName)
									val pType =
										if (pCls !== null)
											superType.newTypeRef(pCls, #[jvmCls])
										else
											mm.newTypeRef(p.parameterType.qualifiedName)

									parameters += mm.toParameter(p.name, pType)
								]
								body = '''
									«IF inherited»
										«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
										clsAdaptee.setAdaptee(adaptee) ;
										«IF retType.type.simpleName != "void"»
											return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
										«ENDIF»
									«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
										return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
									«ELSEIF retType.type.simpleName != "void"»
										return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								'''
							]
						} else {
							jvmCls.members += mm.toMethod(opName, retType)[
								op.parameters.drop(1).forEach[p |
									val pCls = superType.findClassifier(p.parameterType.simpleName)
									val pType =
										if (pCls !== null)
											superType.newTypeRef(pCls, #[jvmCls])
										else
											mm.newTypeRef(p.parameterType.qualifiedName)

									parameters += mm.toParameter(p.name, pType)
								]
								body = '''
									«IF inherited»
										«mm.adapterNameFor(superMM, cls)» clsAdaptee = new «mm.adapterNameFor(superMM, cls)»() ;
										clsAdaptee.setAdaptee(adaptee) ;
										«IF retType.type.simpleName != "void"»
											«IF mm.hasAdapterFor(superType, retType.type.simpleName)»
												return adaptersFactory.create«superMM.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
											«ELSE»
												return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
											«ENDIF»
										«ELSE»
											«asp.qualifiedName».«op.simpleName»(«paramsList») ;
										«ENDIF»
									«ELSEIF mm.hasAdapterFor(superType, retType.type.simpleName)»
										return adaptersFactory.create«mm.simpleAdapterNameFor(superType, retType.type.simpleName)»(«asp.qualifiedName».«op.simpleName»(«paramsList»)) ;
										«ELSEIF retType.type.simpleName != "void"»
											return «asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ELSE»
										«asp.qualifiedName».«op.simpleName»(«paramsList») ;
									«ENDIF»
								'''
							]
						}
					}
				]
			]
		]

		//task.stop
	}

	def boolean +=(EList<JvmMember> members, JvmOperation m) {
		if (!members.filter(JvmOperation).exists[overrides(m)])
			members += (m as JvmMember)

		return false
	}
}