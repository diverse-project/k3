package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import static org.junit.Assert.*; 
import static extension test.AspectC.*;
import fr.inria.triskell.k3.ReplaceAspectMethod

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
class AspectA{
	
	def String foo(){
		 return "A"
	}
}
 
@Aspect(className=typeof(B))
class AspectB extends AspectA{
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