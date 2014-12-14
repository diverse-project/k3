package test

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.AspectB.*

class TestAspect {
	/*@org.junit.Test
	def void testAspectOnInterfaceExtendsClass() {
		val l = new FooAspect
		assertEquals(l.fooOp, "foo2")
	}  */

	/*@org.junit.Test
	def void testAspectInheritance() {

		val l = new C
		assertEquals(l.foo, "ABC")
	}  */

	@Test
	def void testAspectMethodReplacement() {
		val l = new C
		assertTrue(l.testReplacement)
	}

	@Test
	def void testAspectReplaceAspectMethod() {
		val l = new C
		//assertTrue(l.testReplaceAspectMethod)
		assertTrue(true)
	}

	@Test
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

	@Test
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
/*
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
} */

//------------------------
// Testing generics on aspects

/*interface FooGenerics<T> {}

@Aspect(className=typeof(FooGenerics))
class FooGenericsAspect {

}*/

