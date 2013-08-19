                                             
package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.CAspect_AbstractOperationAspect.*
 

class TestAbstractOperationAspect {
	@Test
	def void test_ABC_Inheritance() {
		val c = new C_AbstractOperationAspect
		assertEquals(c.foooo, "CAspect")
	}
}




class A_AbstractOperationAspect { }

class B_AbstractOperationAspect extends A_AbstractOperationAspect { }
class C_AbstractOperationAspect extends B_AbstractOperationAspect {	}

class D_AbstractOperationAspect extends A_AbstractOperationAspect {	}
class E_AbstractOperationAspect extends D_AbstractOperationAspect {	}



@Aspect(className=typeof(A_AbstractOperationAspect))
class AAspect_AbstractOperationAspect {
	def String foooo() {}
}



@Aspect(className=typeof(B_AbstractOperationAspect))
class BAspect_AbstractOperationAspect extends AAspect_AbstractOperationAspect {
	@OverrideAspectMethod
	def String foooo() {
		return "BAspect"
	}
}

@Aspect(className=typeof(C_AbstractOperationAspect))
class CAspect_AbstractOperationAspect extends BAspect_AbstractOperationAspect {
	@OverrideAspectMethod
	def String foooo() {
		return "CAspect"
	}
}



@Aspect(className=typeof(D_AbstractOperationAspect))
abstract class DAspect_AbstractOperationAspect extends AAspect_AbstractOperationAspect {
}

@Aspect(className=typeof(E_AbstractOperationAspect))
class EAspect_AbstractOperationAspect extends DAspect_AbstractOperationAspect {
	@OverrideAspectMethod
	def String foooo() {
		return "EAspect"
	}
}
