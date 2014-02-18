package fr.inria.diverse.k3.test.multiinheritance

import expected.AAspect
import expected.Factory
import org.junit.Test

import static org.junit.Assert.*

class TestMultiInheritance {
	@Test def void testVisitA() {
		val a = Factory::newA
		println(AAspect::visit(a).toString.replaceAll(",", "\n"))
		assertEquals("Visiting VisitorAspect with AImpl, Visiting BAspect with AImpl, Visiting AAspect with AImpl", AAspect::visit(a).toString)
	}
	
//	@Test def void testVisitA() {
//		val A a = Factory::newA
//		println(a.visit.toString.replaceAll(",", "\n"))
//		assertEquals("Visiting VisitorAspect with AImpl, Visiting BAspect with AImpl, Visiting AAspect with AImpl", a.visit.toString)
//	}
}