package test.multipleinheritance

import test.multipleinheritance.base.Factory
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

import static extension test.multipleinheritance.base.AAspect.*

class TestMultiInheritance {
	@Test def void testVisitA() {
		val a = Factory::newA
		assertEquals("Visiting VisitorAspect with AImpl, Visiting BAspect with AImpl, Visiting VisitorAspect with AImpl, Visiting CAspect with AImpl, Visiting AAspect with AImpl", a.visit.toString)
	}

	@Test def void testAccessInheritedField1() {
		val a = Factory::newA
		a.fooAttr = 20
		assertEquals(20, a.fooAttr)
	}

	@Test def void testAccessInheritedField2() {
		val a = Factory::newA
		a.foobar = false
		assertFalse(a.foobar)
		a.foobar = true
		assertTrue(a.foobar)
	}
}