package test.simple

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.junit.Test

import static org.junit.Assert.*

import static extension test.simple.AspectB.*

class TestSimple {
	@Test
	def void testStaticAndNotStaticAttribute() {
		val l = new B
		val l1 = new B
	 	l.incI
		l.incJ
		l1.incI
		l1.incJ
		assertEquals(l.i, 5)
		assertEquals(l1.i, 5)
		assertEquals(l.j, 4)
		assertEquals(l1.j, 4)
	}
}
 
class B  {

}  
  
 

@Aspect(className=typeof(B))
class AspectB  {
	static int i = 3
	int j = 3
 
	def void incI() {

		_self.i = _self.i + 1
	}

	def void incJ() {
		_self.j = _self.j + 1

	}

}





