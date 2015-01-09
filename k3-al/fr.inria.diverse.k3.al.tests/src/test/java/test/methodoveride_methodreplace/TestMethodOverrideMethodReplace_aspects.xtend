package test.methodoveride_methodreplace

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod


//import static extension test.methodoveride_methodreplace.AspectB.*
//import static extension test.AspectC.*

class MOMR_A {

	def public boolean testReplacement() {
		return false
	}
}

class MOMR_B extends MOMR_A {

	def public override boolean testReplacement() {
		return true
	}

}

class MOMR_C extends MOMR_B {

	def public boolean testReplaceAspectMethod () {
		return false
	}
	def public boolean testNotReplacedMethod () {
		return true
	}
}

@Aspect(className=typeof(MOMR_A))
abstract class AspectA {

	def String foo() {
		return "A"
	}

	abstract def String foofoo()

}

@Aspect(className=MOMR_B)
class AspectB extends AspectA {
	
	@OverrideAspectMethod
	def String foo() {
		return _self.super_foo + "B"

	}

	def String foofoo() {
		return "B"
	}

}

@Aspect(className=MOMR_C)
class AspectC extends AspectB {

	@ReplaceAspectMethod
	def boolean testReplaceAspectMethod () {
		return true
	}

	@OverrideAspectMethod
	def String foo() {
		return _self.super_foo + "C"

	}

	def String foofoo() {
		return "C"
	}

}
