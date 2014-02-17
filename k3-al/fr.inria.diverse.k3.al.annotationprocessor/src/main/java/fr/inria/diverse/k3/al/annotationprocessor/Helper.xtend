package fr.inria.diverse.k3.al.annotationprocessor

import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import org.eclipse.xtend.lib.macro.TransformationContext
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
		val List<MutableClassDeclaration> listTmp = new ArrayList
		var MutableClassDeclaration tmp;
		classes.toArray(list)
		
		while(!stable) {
			stable = true
			val start = Math::max(0, firstPosModif)
			firstPosModif = -1
			for(i : start..<size-1){
				listTmp.clear
				getSuperClasses(list.get(i+1), listTmp, ctx)
				if(listTmp.contains(list.get(i))) {
					stable = false
					tmp = list.get(i)
					list.set(i, list.get(i+1))
					list.set(i+1, tmp)
					if(firstPosModif>i-1 || firstPosModif==-1) firstPosModif = Math::max(0, i-1)
				}
				else {
					listTmp.clear
					getSuperClasses(list.get(i), listTmp, ctx)
					if(!listTmp.contains(list.get(i+1))) {
						var sortedOnce = false
						var j = i-1
						listTmp.clear
						getSuperClasses(list.get(i+1), listTmp, ctx)
					
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
		
		classes.clear
		classes.addAll(list.toList)
	}
	
	
	/**
	 * Completes the list 'res' with all the super types of the given class 'clazz'.
	 */
	static def void getSuperClasses(MutableClassDeclaration clazz, List<MutableClassDeclaration> res, extension TransformationContext ctx) {
		if(res.contains(clazz)) return;
		res.add(clazz)
		val l = findClass(clazz.extendedClass.name)
		if(l!=null)
			getSuperClasses(l,res,ctx)
		getWithClassNames(clazz, ctx).map[n | findClass(n)].forEach[cl| if(cl!=null) getSuperClasses(cl, res, ctx)]
	}
	
	
	static def List<MutableClassDeclaration> sortByClassInheritance(MutableClassDeclaration clazz, List<? extends MutableClassDeclaration> classes, extension TransformationContext context) {
		val List<MutableClassDeclaration> listTmp = new ArrayList
		val List<MutableClassDeclaration> listRes = new ArrayList
		
		getSuperClasses(clazz, listRes, context)
		
		classes.forEach[c | if (!listRes.contains(c)){ 
			listTmp.clear
			getSuperClasses(c, listTmp, context)
			if (listTmp.contains(clazz))
				listRes.add(c)
		} ]

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
	static def List<String> getWithClassNames(MutableTypeDeclaration clazz, extension TransformationContext context) {
		val types = getAnnotationWithType(clazz)
		if(types==null)
			return Collections.emptyList	
		types.map[name]
	}
	
	
	/**
	 * Getting the classes identified by the parameter 'with'
	 */
	static def List<TypeReference> getAnnotationWithType(TypeDeclaration cl) {
		if(cl==null || cl.annotations==null) return null;
		try{
			val annot = cl.annotations.findFirst[getClassArrayValue(annotationWith) != null]
			if(annot==null) return null
			new ArrayList(annot.getClassArrayValue(annotationWith))
		}catch(NullPointerException ex){ return null }
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
	static def String getAspectedClassName(MutableTypeDeclaration clazz, extension TransformationContext context) {
		val type = getAnnotationAspectType(clazz)
		if(type==null)
			return ""	
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
			if (l != null) {
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
	static def MutableMethodDeclaration findMethod(MutableClassDeclaration clazz,
		MutableMethodDeclaration methodName, extension TransformationContext context) {
		//FIXME: take care about number of parameters ? 
		var m = clazz.declaredMethods.findFirst[m2|m2.simpleName == methodName.simpleName]
		if (m == null) {
			if (clazz.extendedClass == null)
				return null
			else if (findClass(clazz.extendedClass.name) == null)
				return null
			else
				return findMethod(findClass(clazz.extendedClass.name), methodName, context)
		} else
			return m
	}
}
