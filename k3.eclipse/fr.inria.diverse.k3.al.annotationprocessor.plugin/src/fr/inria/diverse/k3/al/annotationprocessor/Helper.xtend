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

import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableTypeDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import org.eclipse.xtend.lib.macro.services.TypeLookup
import org.eclipse.xtend.lib.macro.services.GlobalTypeLookup
import org.eclipse.xtend.lib.macro.file.Path
import org.eclipse.xtend.lib.macro.CodeGenerationContext

/**
 * A tool class containing helper operations for k3.
 */
abstract class Helper {
	/** The name of the parameter 'with' of the annotation aspect. */
	public static val String annotationWith = "with"

	/** The name of the parameter 'className' of the annotation aspect. */
	public static val String annotationName = "className"

	/** The name of the parameter 'transactionSupport' of the annotation aspect. */
	public static val String annotationTransactionSupportName = "transactionSupport"

	/**
	 * Sorts the given classes following the inheritance order. Top classes are sorted at the end and
	 * down classes are sorted the beginning.
	 * 
	 * @param classes classes
	 * @param ctx transformation context
	 */
	static def void sortClasses(List<MutableClassDeclaration> classes, TypeLookup ctx) {
		if(classes===null || classes.size<2) return;
		val size = classes.size
		var firstPosModif = -1
		var stable = false
		val MutableClassDeclaration[] list = newArrayOfSize(size)
		val map = new HashMap<MutableClassDeclaration, HashSet<MutableClassDeclaration>>
		var Set<MutableClassDeclaration> listTmp
		var MutableClassDeclaration tmp;
		classes.toArray(list)

		classes.forEach[cl |
			val st = new HashSet<MutableClassDeclaration>
			getSuperClasses(cl, st, ctx)
			map.put(cl, st)
		]

		while(!stable) {
			stable = true
			val start = Math::max(0, firstPosModif)
			firstPosModif = -1
			for(i : start..<size-1){
				listTmp = map.get(list.get(i+1))
				if(listTmp.contains(list.get(i))) {
					stable = false
					tmp = list.get(i)
					list.set(i, list.get(i+1))
					list.set(i+1, tmp)
					if(firstPosModif>i-1 || firstPosModif==-1) firstPosModif = Math::max(0, i-1)
				}
				else {
					listTmp = map.get(list.get(i))
					if(!listTmp.contains(list.get(i+1))) {
						var sortedOnce = false
						var j = i-1
						listTmp = map.get(list.get(i+1))

						while(j>=0 && !sortedOnce)
							if(listTmp.contains(list.get(j))) {
								tmp = list.get(j)
								list.set(j, list.get(i+1))
								list.set(i+1, tmp)
								stable = false
								sortedOnce = true
								if(start>j-1 || firstPosModif==-1) firstPosModif = Math::max(0, j-1)
							}
							else j=j-1
					}
				}
			}
		}

		map.clear
		classes.clear
		classes.addAll(list.toList)
	}


	/**
	 * 
	 * On an aspect class, find its direct "super" aspect classes following either the traditional "extends"
	 * or following the "with" attribute of the aspect annotation
	 * 
	 * It works by looking for types in the compilation unit classpath 
	 * 
	 * primary extends, comes first, then the secondary "with" in order of appearance in the declaration
	 * 
	 * @param clazz class declaration
	 * @param ctx transformation context (used for type lookup)
	 * @return a set of class declarations that are either 
	 */
	static def List<ClassDeclaration> getDirectPrimaryAndSecondarySuperClasses(ClassDeclaration clazz, GlobalTypeLookup ctx) {
		val List<ClassDeclaration> res = newArrayList
		if(clazz.extendedClass!==null) {
			val l = ctx.findTypeGlobally(clazz.extendedClass.name) as ClassDeclaration

			//var JvmClassDeclarationImpl a=null;

			//ctx.addError(clazz,(ctx.findTypeGlobally(clazz.extendedClass.name).toString) + l)

			if(l!==null) res.add(l)
		}
		res.addAll(getWithClassNames(clazz).map[n | ctx.findTypeGlobally(n) as ClassDeclaration].filterNull)
		return res
	}

	/**
	 * Fill superClasses with all super classes of classDecl 
	 * Applied on a normal class, will return full hierarchy of java extends only
	 * Applied on an aspect class, it returns the hierarchy following both the java extends, and the <i>with</i> 
	 * attribute of the @aspect annotation
	 */
	static def void getAllPrimaryAndSecondarySuperClasses(List<ClassDeclaration> superClasses,
		ClassDeclaration classDecl, extension GlobalTypeLookup context) {
			
		val List<ClassDeclaration> directSuperClasses = getDirectPrimaryAndSecondarySuperClasses(classDecl, context)
									.filter[directsuperclass | !superClasses.contains(directsuperclass)].toList
		superClasses.addAll(directSuperClasses)
		directSuperClasses.forEach[directsuperclass | 
			getAllPrimaryAndSecondarySuperClasses(superClasses, directsuperclass, context)
		]
	}

	/**
	 * Completes the list 'res' with all the super types of the given class 'clazz'.
	 * 
	 * Will look only in types in the current Compilation Unit
	 * 
	 * @param clazz class declaration
	 * @param res returned list of super types of clazz
	 * @param ctx transformation context
	 */
	static def void getSuperClasses(MutableClassDeclaration clazz, Set<MutableClassDeclaration> res, extension TypeLookup ctx) {
		if(res.contains(clazz)) return;
		res.add(clazz)
		if(clazz.extendedClass!==null) {
			val l = findClass(clazz.extendedClass.name)
			if(l!==null)
				getSuperClasses(l,res,ctx)
			getWithClassNames(clazz).map[n | findClass(n)].forEach[cl| if(cl!==null) getSuperClasses(cl, res, ctx)]
		}
	}


	static def List<MutableClassDeclaration> sortByClassInheritance(MutableClassDeclaration clazz, List<? extends MutableClassDeclaration> classes,
								extension TypeLookup context) {
		val Set<MutableClassDeclaration> listTmp = new HashSet
		val Set<MutableClassDeclaration> listRes = new HashSet

		getSuperClasses(clazz, listRes, context)

		classes.forEach[c | if (!listRes.contains(c)){
			listTmp.clear
			getSuperClasses(c, listTmp, context)
			if (listTmp.contains(clazz))
				listRes.add(c)
		}]

		val list = listRes.toList

		Helper::sortClasses(list, context)
//		Collections.sort(list, [a, b |
//			var int value
//			listTmp.clear
//			getSuperClasses(a, listTmp, context)
//
//			if (listTmp.contains(b)) value = -1
//			else {
//				listTmp.clear
//				getSuperClasses(b, listTmp, context)
//				listTmp.remove(b)
//				if(listTmp.contains(a)) value = 1
//				else value = 0
//			}
//			value
//		])
		return list
	}


	/** Computes the names of the classes provided by the parameter 'with' of the annotation 'aspect'. 
	 * @param clazz aspect class
	 * @return a list of names
	 * */
	static def List<String> getWithClassNames(TypeDeclaration clazz) {
		return getAnnotationWithType(clazz).map[name]
	}


	/**
	 * Getting the classes identified by the parameter 'with'.
	 * The returned list is never null but can be empty.
	 * @param cl type declaration
	 * @return list of type reference
	 */
	static def List<TypeReference> getAnnotationWithType(TypeDeclaration cl) {
		if(cl===null || cl.annotations===null) return Collections.emptyList
		try{
			val annot = cl.annotations.findFirst[getClassArrayValue(annotationWith) !== null]
			if(annot===null) return Collections.emptyList
			return new ArrayList(annot.getClassArrayValue(annotationWith))
		}catch(NullPointerException ex){ return Collections.emptyList }
	}


	static def TypeReference getAnnotationAspectType(TypeDeclaration cl) {
		if(cl===null || cl.annotations===null) return null;
		try{
			val annot = cl.annotations.findFirst[getClassValue(annotationName) !== null]
			if(annot===null) return null
			return annot.getClassValue(annotationName)
		}catch(NullPointerException ex){ return null }
	}

	/** Computes the name of the class to aspectize identified by the annotation 'aspect'. 
	 * 
	 * @param clazz type declaration
	 * @return the name of the aspectized class
	 */
	static def String getAspectedClassName(TypeDeclaration clazz) {
		val type = getAnnotationAspectType(clazz)
		if(type===null)return ""
		return type.name
	}


	static def List<MethodDeclaration> sortByMethodInheritance(Set<MethodDeclaration> methods, List<String> inheritOrder) {
		return inheritOrder.map[classe | methods.filter[declaringType.simpleName == classe]].flatten.toList
	}


	/**
	 * Fill s with super classes of c, ordered by hierarchy
	 * (the first element is the direct super type of c)
	 
	 * @param s list of class declarations
	 
	 * @param c class declaration
	 * @param context transformation context
	 */
	static def void getSuperClass(List<ClassDeclaration> s, ClassDeclaration c, extension TypeLookup context) {
		if (c.extendedClass !== null) {


			val l = findTypeGlobally(c.extendedClass.name) as ClassDeclaration
			if(l==c) {
				//context.addError(c, "Its super class is itself?! " + c.extendedClass.name)
				return;
			}
			if(l!==null) {
				s.add(l)
				getSuperClass(s, l, context)
			}
		}
	}
	



	static def String mkstring(List<TypeReference> list, String delimiter, String before, String after ){
		if (list.size==0)
			return ""
		val s = new StringBuffer
		if (before!== null)
			s.append(before)
		list.forEach[e| s.append(delimiter+"?") ]

		if (after !== null)
			s.append(after)
		return s.toString().replace(before+delimiter, before)
	}


	/**
	 * Find first method with the same name in super classes hierarchy
	 * @param clazz This class and super classes are the search area
	 * @param methodName Method to find
	 * @param context transformation context
	 * @return first method declaration with the same name asmethodName in super classes hierarchy, or null if none found
	 */
	static def MethodDeclaration findMethod(ClassDeclaration clazz,
		MutableMethodDeclaration methodName, extension TransformationContext context) {
		//FIXME take care about number of parameters and their type
		//context.addError(clazz, clazz.toString)
		var m = clazz.declaredMethods.findFirst[simpleName == methodName.simpleName]
		if (m === null) {
			if (clazz.extendedClass === null)
				return null
			else if (context.findTypeGlobally(clazz.extendedClass.name) === null)
				return null				
			else
				return findMethod(context.findTypeGlobally(clazz.extendedClass.name) as ClassDeclaration, methodName, context)
		} else
			return m
	}


	/**
	 * Compare the prototype of the two given methods.
	 * @param m1 first method declaration
	 * @param m2 second method declaration
	 * @param alsoCheckFirstArgSelf If true, it checks that m2 equals m1 (respec. m1 equals m2) after being transformed for k3. More precisely, it checks
	 * whether the first argument of m2 (respec. m1) is _self to then compare the two prototypes.
	 * @return true if the 2 methods have similar signature
	 */
	static def boolean isSamePrototype(MutableMethodDeclaration m1, MutableMethodDeclaration m2, boolean alsoCheckFirstArgSelf) {
		val nameOk = m1!==null && m2!==null && m1.simpleName==m2.simpleName
		val ok = nameOk && m1.parameters.size==m2.parameters.size && isSameType(m1.returnType, m2.returnType)
		//TODO parameters and return type
		if(nameOk && !ok && alsoCheckFirstArgSelf)
			return (m1.parameters.size==m2.parameters.size+1 && m1.parameters.head.simpleName==AspectProcessor::SELF_VAR_NAME) ||
					(m1.parameters.size+1==m2.parameters.size && m2.parameters.head.simpleName==AspectProcessor::SELF_VAR_NAME)
		return ok
	}


	static def boolean isSameType(TypeReference tr1, TypeReference tr2) {
		return tr1==tr2 || (tr1!==null && tr2!==null && tr1.simpleName==tr2.simpleName)
	}

	/**
	 * 
	 * @param cls type declaration
	 * @param ctx transformation context
	 * 
	 * @return the adapter standing between a metaclass in a sub-metamodel 
	 * and its corresponding metaclass in a super-metamodel
	 */
	static def String getAdapterClassName(MutableTypeDeclaration cls, extension TransformationContext ctx) {
		val ann = cls.annotations.findFirst[getValue("adapter") !== null]

		return if (ann !== null) ann.getValue("adapter") as String else ""
	}
	
	/** simple method signature */
	static def String methodSignature(MethodDeclaration m) {
		return '''«m.returnType.simpleName» «m.simpleName»(«m.parameters.map[p|p.type.simpleName].join(',')»)'''
	}
	
	/**
	 * similar to methodSignature but makes sure to have the signature from the original xtend
	 * Ie. optionnaly removes the _self parameter introduced by {@link AspectProcessor#methodProcessingAddSelfStatic(MutableTypeDeclaration) }
	 * This can be useful when mixing method declaration from both java and currently processed compilation unit
	 */
	static def String initialMethodSignature(MethodDeclaration m) {
		if(m.parameters.empty || m.parameters.head.simpleName != AspectProcessor.SELF_VAR_NAME) {
			return '''«m.returnType.simpleName» «m.simpleName»(«m.parameters.map[p|p.type.simpleName].join(',')»)'''
		} else {
			val parameters = m.parameters.drop(1)
			return '''«m.returnType.simpleName» «m.simpleName»(«parameters.map[p|p.type.simpleName].join(',')»)'''
		}
	}
	static def void writeContentsIfNew(Path targetFilePath,String newContent, extension CodeGenerationContext context) {
		var write = false
		if (!targetFilePath.exists) {
			// println("will write "+targetFilePath + " due to not existing file")
			write = true
		}
		else if (targetFilePath.contents != newContent) {// compare new contents and old contents before file is written	
			// println("will write "+targetFilePath + " due to != contents")			
			write = true	
		}
		if (write) {
			// println("writing "+targetFilePath)
			targetFilePath.contents = newContent 	
		} /* else 
			println("not writing "+targetFilePath) */
	}
	
}
