
package test.abstractoperation

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.abstractoperation.AAspect_A.*

class TestA {
	@Test
	def void test_ABC_Inheritance() {
		val c = new C_A
		var  A_A a  = c
		assertEquals(a.foooo, "CAspect")
	}
}




class A_A { }

class B_A extends A_A { }
class C_A extends B_A {	}

class D_A extends A_A {	}
class E_A extends D_A {	}



@Aspect(className=typeof(A_A))
class AAspect_A {
	def String foooo() {}
}



@Aspect(className=typeof(B_A))
class BAspect_A extends AAspect_A {
	@OverrideAspectMethod
	def String foooo() {
		return "BAspect"
	}
}

@Aspect(className=typeof(C_A))
class CAspect_A extends BAspect_A {
	@OverrideAspectMethod
	def String foooo() {
		return "CAspect"
	}
}



@Aspect(className=typeof(D_A))
abstract class DAspect_A extends AAspect_A {
}

@Aspect(className=typeof(E_A))
class EAspect_A extends DAspect_A {
	@OverrideAspectMethod
	def String foooo() {
		return "EAspect"
	}
}
