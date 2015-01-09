package test.constructor

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.AspectInitializerMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.constructor.AspectA.*
import static extension test.constructor.AspectB.*
import static extension test.constructor.AspectC.*
import static extension test.constructor.AspectD.*
import static extension test.constructor.AspectE.*
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

class AA {

	public var String name = "AA"
	
}

class BB extends AA {

}

class CC extends AA {

	
}

class DD extends AA {

	
}
class EE extends AA {

	
}

@Aspect(className=typeof(AA)) 
class AspectA { 
 	 
 	 public var String qualifiedName  
	
	 
	@AspectInitializerMethod
	def void initializer(){ 
		println("initializer of AspectA on AA")
		_self.qualifiedName = _self.name +" with AspectA.initializer" 
	}
	
	public def void foo_method(){ 
		println("foo_method() from AspectA") 
	}

}

@Aspect(className=typeof(BB))
class AspectB extends AspectA {
	@AspectInitializerMethod
	@OverrideAspectMethod
	def void initializer(){ 
		println("initializer of AspectB on AA "+_self)
		_self.qualifiedName = _self.name +" with AspectB.initializer" 
	}
	
	@OverrideAspectMethod
	public def void foo_method(){ 
		println("foo_method() from AspectB")  
	}
}

@Aspect(className=typeof(CC))
class AspectC extends AspectA {
	@AspectInitializerMethod
	@OverrideAspectMethod
	def void initializer(){ 
		println("initializer of AspectC on AA")
		super_initializer(_self)
		_self.qualifiedName = _self.qualifiedName +" with AspectC.initializer" 
	}
	
	@OverrideAspectMethod
	public def void foo_method(){ 
		println("foo_method() from AspectC")  
	}
}

@Aspect(className=typeof(DD))
class AspectD extends AspectA {
	
}

@Aspect(className=typeof(EE))
class AspectE extends AspectA {
	public var String qualifiedName2
	
	@AspectInitializerMethod
	@OverrideAspectMethod
	def void initializer(){ 
		println("initializer of AspectE on AA")
		super_initializer(_self)
		_self.qualifiedName = _self.qualifiedName +" with AspectE.initializer1" 
	}
	
	@AspectInitializerMethod
	def void initializer2(){ 
		println("initializer2 of AspectE on AA")
		_self.qualifiedName2 = _self.name +" with AspectE.initializer2" 
	}
	
	
}

class TestAspect {


	@Test
	def void testSimpleAspectInitializer() {
		println("\nBEGIN testSimpleAspectInitializer")
		val AA a = new AA
		assertTrue(a.name.equals("AA"))
		a.foo_method()
		assertTrue(a.qualifiedName.equals("AA with AspectA.initializer"))
		println("END testSimpleAspectInitializer")
	}

	
	@Test
	def void testAspectInitializerWithSuper() {
		println("\nBEGIN testAspectInitializerWithSuper")
		val c = new CC
		assertTrue(c.name.equals("AA"))
		c.foo_method()
		println("c.qualifiedName="+c.qualifiedName)
		assertTrue(c.qualifiedName.equals("AA with AspectA.initializer with AspectC.initializer"))
		println("END testAspectInitializerWithSuper")
	}


	@Test
	def void testAspectInitializerWithoutSuper() {
		println("\nBEGIN testAspectInitializerWithoutSuper")
		val b = new BB
		assertTrue(b.name.equals("AA"))
		b.foo_method()
		println("b.qualifiedName="+b.qualifiedName)
		assertTrue(b.qualifiedName.equals("AA with AspectB.initializer"))
		println("END testAspectInitializerWithoutSuper")
	}
	
	@Test
	def void testWithInheritedAspectInitializer() {
		println("\nBEGIN testWithInheritedAspectInitializer")
		val d = new DD
		assertTrue(d.name.equals("AA"))
		d.foo_method()
		println("d.qualifiedName="+d.qualifiedName)
		assertTrue(d.qualifiedName.equals("AA with AspectA.initializer with AspectC.initializer"))
		println("END testWithInheritedAspectInitializer")		
	}
	@Test
	def void testWithMultipleAspectInitializer() {
		println("\nBEGIN testWithMultipleAspectInitializer")
		val e = new EE
		assertTrue(e.name.equals("AA"))
		e.foo_method()
		println("e.qualifiedName="+e.qualifiedName)
		println("e.qualifiedName2="+e.qualifiedName2)
		assertTrue(e.qualifiedName.contains("with AspectA.initializer"))
		assertTrue(e.qualifiedName.contains("with AspectE.initializer1"))
		assertTrue(e.qualifiedName2.contains("with AspectE.initializer2"))
		println("END testWithMultipleAspectInitializer")		
	}
}
