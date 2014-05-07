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

/**
 * A tool class containing helper operations for k3.
 */
abstract class Helper {
	/** The name of the parameter 'with' of the annotation aspect. */
	public static val annotationWith = "with"
	
	/** The name of the parameter 'className' of the annotation aspect. */
	public static val annotationName = "className"
	
	/**
	 * Sorts the given classes following the inheritance order. Top classes are sorted at the end and
	 * down classes are sorted the beginning.
	 */
	static def void sortClasses(List<MutableClassDeclaration> classes, TransformationContext ctx) {
		if(classes==null || classes.size<2) return;
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
	 * Completes the list 'res' with all the super types of the given class 'clazz'.
	 */
	static def Set<ClassDeclaration> getDirectSuperClasses(ClassDeclaration clazz, TransformationContext ctx) {
		val Set<ClassDeclaration> res = newHashSet
		if(clazz.extendedClass!=null) {
			val l = ctx.findTypeGlobally(clazz.extendedClass.name) as ClassDeclaration
			
			//var JvmClassDeclarationImpl a=null;
			
			//ctx.addError(clazz,(ctx.findTypeGlobally(clazz.extendedClass.name).toString) + l)
			
			if(l!=null) res.add(l)
		}
		res.addAll(getWithClassNames(clazz, ctx).map[n | ctx.findTypeGlobally(n) as ClassDeclaration].filterNull)
		res 
	}
	
	
	/**
	 * Completes the list 'res' with all the super types of the given class 'clazz'.
	 */
	static def void getSuperClasses(MutableClassDeclaration clazz, Set<MutableClassDeclaration> res, extension TransformationContext ctx) {
		if(res.contains(clazz)) return;
		res.add(clazz)
		if(clazz.extendedClass!=null) {
			val l = findClass(clazz.extendedClass.name)
			if(l!=null)
				getSuperClasses(l,res,ctx)
			getWithClassNames(clazz, ctx).map[n | findClass(n)].forEach[cl| if(cl!=null) getSuperClasses(cl, res, ctx)]
		}
	}
	
	
	static def List<MutableClassDeclaration> sortByClassInheritance(MutableClassDeclaration clazz, List<? extends MutableClassDeclaration> classes, 
								extension TransformationContext context) {
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
	
	
		/** Computes the names of the classes provided by the parameter 'with' of the annotation 'aspect'. */
	static def List<String> getWithClassNames(TypeDeclaration clazz, extension TransformationContext context) {
		getAnnotationWithType(clazz).map[name]
	}
	
	
	/**
	 * Getting the classes identified by the parameter 'with'.
	 * The returned list is never null but can be empty.
	 */
	static def List<TypeReference> getAnnotationWithType(TypeDeclaration cl) {
		if(cl==null || cl.annotations==null) return Collections.emptyList
		try{
			val annot = cl.annotations.findFirst[getClassArrayValue(annotationWith) != null]
			if(annot==null) return Collections.emptyList
			new ArrayList(annot.getClassArrayValue(annotationWith))
		}catch(NullPointerException ex){ return Collections.emptyList }
	}
	
	
	static def TypeReference getAnnotationAspectType(TypeDeclaration cl) {
		if(cl==null || cl.annotations==null) return null;
		try{
			val annot = cl.annotations.findFirst[getClassValue(annotationName) != null]
			if(annot==null) return null
			annot.getClassValue(annotationName)
		}catch(NullPointerException ex){ return null }
	}
	

	/** Computes the name of the class to aspectize identified by the annotation 'aspect'. */
	static def String getAspectedClassName(TypeDeclaration clazz) {
		val type = getAnnotationAspectType(clazz)
		if(type==null)return ""	
		type.name
	}
	
	
	static def List<MutableMethodDeclaration> sortByMethodInheritance(Set<MutableMethodDeclaration> methods, List<String> inheritOrder) {
		inheritOrder.map[classe | methods.filter[declaringType.simpleName == classe]].flatten.toList
	}
	
	
	/**
	 * Fill s with super classes of c, ordered by hierarchy
	 * (the first element is the direct super type of c)
	 */
	static def void getSuperClass(List<MutableClassDeclaration> s, MutableClassDeclaration c, extension TransformationContext context) {
		if (c.extendedClass != null) {
			val l = findClass(c.extendedClass.name)
			if(l==c) {
				context.addError(c, "Its super class is itself?! " + c.extendedClass.name)
				return;
			}
			if(l!=null) {
				s.add(l)
				getSuperClass(s, l, context)
			}
		}
	}
	
	
	static def String mkstring(List<TypeReference> list, String delimiter, String before, String after ){
		if (list.size==0)
			return ""
		val s = new StringBuffer
		if (before!= null)
			s.append(before)
		list.forEach[e| s.append(delimiter+"?") ]
		
		if (after != null)
			s.append(after)
		return s.toString().replace(before+delimiter, before)
	}
	
	
	/**
	 * Find first method with the same name in super classes hierarchy
	 * @clazz This class and super classes are the search area
	 * @methodName Method to find
	 */
	static def MethodDeclaration findMethod(ClassDeclaration clazz,
		MutableMethodDeclaration methodName, extension TransformationContext context) {
		//FIXME take care about number of parameters and their type
		//context.addError(clazz, clazz.toString)	
		var m = clazz.declaredMethods.findFirst[simpleName == methodName.simpleName]
		if (m == null) {
			if (clazz.extendedClass == null)
				return null
			else if (findClass(clazz.extendedClass.name) == null)
				return null
			else
				return findMethod(context.findTypeGlobally(clazz.extendedClass.name) as ClassDeclaration, methodName, context)
		} else
			return m
//			return null
	}


	/**
	 * Compare the prototype of the two given methods.
	 * @param alsoCheckFirstArgSelf If true, it checks that m2 equals m1 (respec. m1 equals m2) after being transformed for k3. More precisely, it checks
	 * whether the first argument of m2 (respec. m1) is _self to then compare the two prototypes.
	 */
	static def boolean isSamePrototype(MutableMethodDeclaration m1, MutableMethodDeclaration m2, boolean alsoCheckFirstArgSelf) {
		val nameOk = m1!=null && m2!=null && m1.simpleName==m2.simpleName
		val ok = nameOk && m1.parameters.size==m2.parameters.size && isSameType(m1.returnType, m2.returnType)
		//TODO parameters and return type
		if(nameOk && !ok && alsoCheckFirstArgSelf)
			return (m1.parameters.size==m2.parameters.size+1 && m1.parameters.head.simpleName==AspectProcessor::SELF_VAR_NAME) ||
					(m1.parameters.size+1==m2.parameters.size && m2.parameters.head.simpleName==AspectProcessor::SELF_VAR_NAME)
		return ok 
	}
	
	
	static def boolean isSameType(TypeReference tr1, TypeReference tr2) {
		tr1==tr2 || (tr1!=null && tr2!=null && tr1.simpleName==tr2.simpleName)
	}
	
	/**
	 * Returns the adapter standing between a metaclass in a sub-metamodel
	 * and its corresponding metaclass in a super-metamodel
	 */
	static def getAdapterClassName(MutableTypeDeclaration cls, extension TransformationContext ctx) {
		val ann = cls.annotations.findFirst[getValue("adapter") !== null]
		
		return if (ann !== null) ann.getValue("adapter") as String else ""
	}
}
