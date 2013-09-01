package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import fr.inria.triskell.k3.ReplaceAspectMethod

import static org.junit.Assert.*;
import static extension test.AspectC.*;

class TestAspect {
 
	@org.junit.Test
	def void testAspectOnInterfaceExtendsClass() {
		val l = new FooAspect
		assertEquals(l.fooOp, "foo2") 
	} 
 
	@org.junit.Test
	def void testAspectInheritance() {

		val l = new C
		assertEquals(l.foo, "ABC") 
	} 
 
	@org.junit.Test
	def void testAspectMethodReplacement() {
		val l = new C
		assertTrue(l.testReplacement)
	} 
	 
	@org.junit.Test 
	def void testAspectReplaceAspectMethod() {
		val l = new C
		assertTrue(l.testReplaceAspectMethod)
	}

	@org.junit.Test
	def void testStaticAndNotStaticAttribute() {  
		val l = new C
		val l1 = new C  
		l.incI
		l.incJ
		l1.incI
		l1.incJ
		assertEquals(l.i, 5)
		assertEquals(l1.i, 5)
		assertEquals(l.j, 4)
		assertEquals(l1.j, 4)

	}

	@org.junit.Test
	def void testAbstractMethodOnAspect() {
		val l = new C
		l.foofoo 
	} 

}

class A {

	def boolean testReplacement() {
		return false
	}
}

class B extends A {
	@ReplaceAspectMethod
	def override boolean testReplacement() {
		return true
	}

}

class C extends B {
	
	def boolean testReplaceAspectMethod () {
		return false
	}
}

@Aspect(className=typeof(A))
abstract class AspectA {

	def String foo() {
		return "A"
	}

	abstract def String foofoo()
 
}

@Aspect(className=typeof(B))
class AspectB extends AspectA {
	static int i = 3
	int j = 3

	def void incI() {

		_self.i = _self.i + 1
	}

	def void incJ() {
		_self.j = _self.j + 1

	}

	@OverrideAspectMethod
	def String foo() {
		return _self.super_foo + "B"

	}

	def String foofoo() {
		return "B"
	}

}

@Aspect(className=typeof(C))
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

//------------------------
// Testing aspect on interface extending a class

interface FooInterface { }

abstract class FooAbsClass {
	def fooOp() {
		println("foo1")	
	}
}

@Aspect(className=typeof(FooInterface))
class FooAspect extends FooAbsClass{
	@OverrideAspectMethod
	def fooOp() {
		println("foo2")
	}
}
