package test.simple

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.junit.Test

import static org.junit.Assert.*

import static extension test.simple.AspectB.*

class TestSimple {
	@Test
	def void testStaticAndNotStaticAttribute() {
		val l = new Foo
		val l1 = new Foo
	 	l.incI
		l.incJ
		l1.incI
		l1.incJ
		assertEquals(AspectFoo::i, 5)
		assertEquals(AspectFoo::i, 5)
		assertEquals(l.j, 4)
		assertEquals(l1.j, 4)
	}
}
 
class Foo  {

}  
  
 

@Aspect(className=Foo)
class AspectFoo  {
	public static int i = 3
	public int j = 3
 
	def void incI() {
		i = i + 1
	}

	def void incJ() {
		_self.j = _self.j + 1
	}

}





