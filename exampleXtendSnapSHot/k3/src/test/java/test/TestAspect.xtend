package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import static org.junit.Assert.*; 
import static extension test.AspectC.*;
import fr.inria.triskell.k3.ReplaceAspectMethod
import static extension test.TestAbstractAspect.*;


class TestAspect { 
	
	@org.junit.Test
	def void testAspectInheritance() {
		 
		val l = new C 
		assertEquals(l.foo,"ABC")
	}
	@org.junit.Test 
	def void testAspectMethodReplacement() {
		val l = new C
		assertTrue(l.testReplacement) 
	}
	
	@org.junit.Test
	def void testStaticAndNotStaticAttribute() {
		val l = new C 
		val l1 = new C
		l.incI
		l.incJ
		l1.incI
		l1.incJ
		assertEquals(l.i,5)
		assertEquals(l1.i,5)
		assertEquals(l.j,4)
		assertEquals(l1.j,4)
		
	}
	
	  
}
 

class A{
	
	def boolean testReplacement(){
		return false
	}
}

class B extends A{
	@ReplaceAspectMethod
	def override boolean testReplacement(){
		return true
	}
	
}

class C extends B{} 

 
 
@Aspect(className=typeof(A))
abstract class TestAbstractAspect{
//	static TestAbstractAspect _self_
	
	abstract def void foofoo()
} 
  
 

@Aspect(className=typeof(A))
abstract class AspectA{
	
	
	def String foo(){
		 return "A"
	}
}
 
@Aspect(className=typeof(B))
class AspectB extends AspectA{
	static int i = 3
	int j = 3	
	def  void incI(){

		_self.i = _self.i+1
	}

	def  void incJ(){
		_self.j = _self.j+1


	}

	@OverrideAspectMethod 
		def  String foo(){
		return _self.super_foo + "B"
		
	}
	
	
}

@Aspect(className=typeof(C))
class AspectC extends AspectB{
	
	@OverrideAspectMethod 
		def String foo(){
		return _self.super_foo + "C"
			
		
	}
	
	
}