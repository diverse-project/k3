package test.static_non_static_attribute

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.junit.Test

import static org.junit.Assert.*

import static extension test.static_non_static_attribute.AspectB.*

class TestStaticNonStaticAttribute {
	@Test
	def void testStaticAndNotStaticAttribute() {
		val l = new B
		val l1 = new B
		l.incI
		l.incJ
		l1.incI
		l1.incJ
		assertEquals(AspectB::i, 5)
		assertEquals(AspectB::i, 5)
		assertEquals(l.j, 4)
		assertEquals(l1.j, 4)
	}
}

class A {

}

class B extends A {

}



@Aspect(className=typeof(A))
abstract class AspectA {
}

@Aspect(className=typeof(B))
class AspectB extends AspectA {
	public static int i = 3
	public int j = 3

	def void incI() {
		i = i + 1
	}

	def void incJ() {
		_self.j = _self.j + 1

	}

}





