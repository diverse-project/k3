package test.methodoveride_methodreplace

import org.junit.Test

import static org.junit.Assert.*

import test.methodoveride_methodreplace.MOMR_C

//import static extension test.methodoveride_methodreplace.AspectB.*
import static extension test.methodoveride_methodreplace.AspectC.*

class TestMethodOverrideMethodReplace {
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
		val l = new MOMR_C
		assertTrue(l.testReplacement)
	}

	@Test
	def void testAspectReplaceAspectMethod() {
		val l = new MOMR_C
		
		// since it is replaced, the normal method is hidden and "import static extension test.methodoveride_methodreplace.AspectC.*" is required to see it again
		assertTrue(l.testReplaceAspectMethod())
		
		assertTrue(l.testNotReplacedMethod)
	}

	@Test
	def void testAbstractMethodOnAspect() {
		val l = new MOMR_C
		l.foofoo
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

