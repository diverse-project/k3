package test.dynamicbinding_properties

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

import static extension test.dynamicbinding_properties.AspectX1.*
import static extension test.dynamicbinding_properties.AspectX2.*
import static extension test.dynamicbinding_properties.AspectX3.*

class TestDynamicBindingProperties {
	@Test
	def void testX1_i1() {
		val l = new X1
		assertEquals(l.i1, "i1_AspectX1_init")
	}
	@Test
	def void testX2_i1() {
		val l = new X2
		assertEquals(l.i1, "i1_AspectX1_init")
	}
	
	@Test
	def void testX3_i1() {
		val l = new X2
		assertEquals(l.i1, "i1_AspectX1_init")
	}
	
	@Test
	def void testX2_getI1FromX2() {
		val l = new X2
		assertEquals(l.getI1FromX2, "i1_AspectX1_init")
	}
	@Test
	def void testX3_getI1FromX2() {
		val l = new X3
		assertEquals(l.getI1FromX2, "i1_AspectX1_init")
	}
}

class X1 {} 
class X2 extends X1 {
}
class X3 extends X2 {}  
  
 

@Aspect(className=typeof(X1))
class AspectX1  {
	public String i1 = "i1_AspectX1_init"
	
	
}
@Aspect(className=typeof(X2))
class AspectX2 extends AspectX1  {
	String i2
	def String getI1FromX2(){
		return _self.i1;
	}
}
@Aspect(className=typeof(X3))
class AspectX3 extends AspectX2 {
	String i3
}





