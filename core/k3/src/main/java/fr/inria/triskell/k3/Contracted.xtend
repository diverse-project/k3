package fr.inria.triskell.k3

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Random
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

@Target(ElementType::TYPE)
@Active(typeof(ContractedProcessor))
annotation Contracted {
}
 
@Target(ElementType::METHOD)
annotation Pre {
}

@Target(ElementType::METHOD)
annotation Post {
}

@Target(ElementType::METHOD)
annotation Inv {
}

class ContractedProcessor extends AbstractClassProcessor {

	private def void getAllInvs(MutableClassDeclaration cl, List<MutableMethodDeclaration> invs,
		extension TransformationContext context) {
		invs.addAll(cl.declaredMethods.filter[annotations.exists[annotationTypeDeclaration.simpleName == "Inv"]])
		if (cl.extendedClass != null) {
			val parent = findClass(cl.extendedClass.name)
			if (parent != null)
				getAllInvs(parent, invs, context)
		}
	}

	private def void getAllPre(MutableClassDeclaration cl, List<MutableMethodDeclaration> pres, String MsimpleName,
		extension TransformationContext context) {
		pres.addAll(cl.declaredMethods.filter[m1|m1.simpleName == "pre" + MsimpleName])
		if (cl.extendedClass != null) {
			val parent = findClass(cl.extendedClass.name)
			if (parent != null)
				getAllPre(parent, pres, MsimpleName, context)
		}
	}

	private def void getAllPost(MutableClassDeclaration cl, List<MutableMethodDeclaration> posts, String simpleName,
		extension TransformationContext context) {
		posts.addAll(cl.declaredMethods.filter[m1|m1.simpleName == "post" + simpleName])
		if (cl.extendedClass != null) {
			val parent = findClass(cl.extendedClass.name)
			if (parent != null)
				getAllPost(parent, posts, simpleName, context)
		}
	}

	override doTransform(MutableClassDeclaration annotateClass, extension TransformationContext context) {

		val Map<MutableMethodDeclaration, String> bodies = new HashMap<MutableMethodDeclaration, String>()
		val invs = new ArrayList<MutableMethodDeclaration>();
		getAllInvs(annotateClass, invs, context)

		var pre = annotateClass.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration.simpleName == "Pre"]]

		var post = annotateClass.declaredMethods.filter[
			annotations.exists[annotationTypeDeclaration.simpleName == "Post"]]

		for (annotatedMethod : invs) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Invariants must not have a parameter")
				return;
			}
			if (annotatedMethod.returnType != newTypeReference("boolean")) {
				annotatedMethod.addError("Invariants must return a boolean")
				return;
			}
		}

		for (annotatedMethod : pre) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Precondition must not have a parameter")
				return;
			}
			if (annotatedMethod.returnType != newTypeReference("boolean")) {
				annotatedMethod.addError("Precondition must return a boolean")
				return;
			}
			if (!annotatedMethod.simpleName.startsWith("pre")) {
				annotatedMethod.addError("Precondition must be nammed pre... (convention)")
				return;
			}
			if (annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(3)].size == 0) {
				annotatedMethod.addError("Precondition must be have the name preX where X is an existing method")
				return;
			}
		}

		for (annotatedMethod : post) {
			if (annotatedMethod.parameters.size > 0) {
				annotatedMethod.addError("Postcondition must not have a parameter")
				return;
			}
			if (annotatedMethod.returnType != newTypeReference("boolean")) {
				annotatedMethod.addError("Postcondition must return a boolean")
				return;
			}
			if (!annotatedMethod.simpleName.startsWith("post")) {
				annotatedMethod.addError("Postcondition must be nammed post... (convention)")
				return;
			}
			if (annotatedMethod.declaringType.declaredMethods.filter[m|
				m.simpleName == annotatedMethod.simpleName.substring(4)].size == 0) {
				annotatedMethod.addError("Postcondition must be have the name postX where X is an existing method")
				return;
			}

		}

		if (invs.size > 0) {
			for (m : annotateClass.declaredMethods.filter[m|
				! (m.annotations.exists[a|
					a.annotationTypeDeclaration.simpleName == "Pre" || a.annotationTypeDeclaration.simpleName == "Post" ||
						a.annotationTypeDeclaration.simpleName == "Inv"] || m.static)]) {
				annotateClass.addMethod("prepriv" + m.simpleName,
					[
						visibility = Visibility::PRIVATE
						static = m.static
						final = m.final
						returnType = m.returnType
						if (m.body == null)
							body = [bodies.get(m)]
						else
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
				var invt = "true"
				val pres = new ArrayList<MutableMethodDeclaration>();
				getAllPre(annotateClass, pres, m.simpleName, context)
				var presconditionmethod_index = new Random().nextInt(1000000);
				for (presconditionmethod : pres) {
					if (!annotateClass.declaredMethods.exists[m3|m3 == presconditionmethod]) {
						val sname = presconditionmethod.simpleName
						val snameWithIndex = presconditionmethod.simpleName + presconditionmethod_index
						presconditionmethod.setSimpleName(snameWithIndex)

						presconditionmethod.declaringType.addMethod(sname,
							[
								returnType = presconditionmethod.returnType
								static = false
								final = false
								visibility = Visibility::PROTECTED
								for (annot : presconditionmethod.annotations)
									addAnnotation(typeof(Pre).findTypeGlobally)
								body = ['''return this.«snameWithIndex»();''']
							])

						/*annotateClass.addMethod(snameWithIndex,[
							returnType = presconditionmethod.returnType
							static = false
							final = false
							visibility = Visibility::PRIVATE
							body = ['''return super.«snameWithIndex»();''']
						]) */
						presconditionmethod_index = new Random().nextInt(1000000);
					}
				}

				if (pres.size() > 0) {
					invt = " ( false || "
					for (presconditionmethod : pres) {
						invt = invt + presconditionmethod.simpleName + "() ||"
					}
					invt = invt.substring(0, invt.length - 2) + ")"
				}
				for (in : invs)
					invt = invt + "&& " + in.simpleName + "() "
				val invt1 = invt
				val bodyt = '''
					if («invt1»)
					    «retu» prepriv«m.simpleName»(«s1»);					    
					else
						throw new  fr.inria.triskell.k3.PreConditionViolationException();
					 '''
				m.body = [bodyt]
				bodies.put(m, bodyt)

				annotateClass.addMethod("postpriv" + m.simpleName,
					[
						visibility = Visibility::PRIVATE
						static = m.static
						final = m.final
						returnType = m.returnType
						if (m.body == null)
							body = [bodies.get(m)]
						else
							body = m.body
						for (p : m.parameters) {
							addParameter(p.simpleName, p.type)
						}
					])
				s = "";
				for (p : m.parameters) {
					s = s + p.simpleName + ","
				}
				if (s.length > 0)
					s = s.substring(0, s.length - 1)
				ret = ""
				var ret1 = ""
				if (m.returnType != newTypeReference("void")) {
					ret = m.returnType.name + " __ret = "
					ret1 = "return __ret;"
				}

				invt = "true"
				val posts = new ArrayList<MutableMethodDeclaration>();
				getAllPost(annotateClass, posts, m.simpleName, context)
				var postsconditionmethod_index = new Random().nextInt(1000000);
				for (postsconditionmethod : posts) {
					if (!annotateClass.declaredMethods.exists[m3|m3 == postsconditionmethod]) {
						val sname = postsconditionmethod.simpleName
						val snameWithIndex = postsconditionmethod.simpleName + postsconditionmethod_index
						postsconditionmethod.setSimpleName(snameWithIndex)

						postsconditionmethod.declaringType.addMethod(sname,
							[
								returnType = postsconditionmethod.returnType
								static = false
								final = false
								visibility = Visibility::PROTECTED
								addAnnotation(typeof(Post).findTypeGlobally)
								
								body = ['''return this.«snameWithIndex»();''']
							])
						postsconditionmethod_index = new Random().nextInt(1000000);
					}
				}

				if (posts.size() > 0) {
					invt = " ( true && "
					for (postsconditionmethod : posts) {
						invt = invt + postsconditionmethod.simpleName + "() &&"
					}
					invt = invt.substring(0, invt.length - 2) + ")"
				}

				for (in : invs)
					invt = invt + "&& " + in.simpleName + "() "
				val invt2 = invt

				val retu2 = retu
				val retu3 = ret1
				val s2 = s
				m.body = [
					'''						
						«retu2»postpriv«m.simpleName»(«s2»);
						if (!(«invt2»))
							throw new  fr.inria.triskell.k3.PostConditionViolationException();
						«retu3»	
					  ''']

			}
		} else {
			for (annotatedMethod : pre) {
				val m = annotatedMethod.declaringType.declaredMethods.filter[m|
					m.simpleName == annotatedMethod.simpleName.substring(3)].get(0)
				annotatedMethod.declaringType.addMethod("prepriv" + m.simpleName,
					[
						visibility = Visibility::PRIVATE
						static = m.static
						final = m.final
						returnType = m.returnType
						if (m.body == null)
							body = [bodies.get(m)]
						else
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
				val bodyt = '''
					if (pre«m.simpleName»())
					    «retu» prepriv«m.simpleName»(«s1»);					    
					else
						throw new  fr.inria.triskell.k3.PreConditionViolationException();
					 '''
				m.body = [bodyt]
				bodies.put(m, bodyt)

			}

			for (annotatedMethod : post) {

				val m = annotatedMethod.declaringType.declaredMethods.filter[m|
					m.simpleName == annotatedMethod.simpleName.substring(4)].get(0)

				//if (!clazz.declaredMethods.exists[m1 | m1.simpleName == "pre" + m.simpleName ]){
				annotatedMethod.declaringType.addMethod("postpriv" + m.simpleName,
					[
						visibility = Visibility::PRIVATE
						static = m.static
						final = m.final
						returnType = m.returnType
						if (m.body == null)
							body = [bodies.get(m)]
						else
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
				var ret1 = ""
				if (m.returnType != newTypeReference("void")) {
					ret = m.returnType.name + " __ret = "
					ret1 = "return __ret;"
				}
				val retu = ret
				val retu1 = ret1
				m.body = [
					'''						
						«retu»postpriv«m.simpleName»(«s1»);
						if (!post«m.simpleName»())
							throw new  fr.inria.triskell.k3.PostConditionViolationException();
						«retu1»	
					  ''']

			}

		}
	}
}
