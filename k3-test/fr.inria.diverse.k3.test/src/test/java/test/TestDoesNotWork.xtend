package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import static extension test.FooAbsClass.*

class TestDoesNotWork {
	
	def static void main(String[] args) {
		val l = new FooImpl 
		l.fooOp1  
	} 
	 
	
}
//------------------------
// Testing aspect on interface extending a class

interface FooInterface { 
	  def void fooOp();
	
	
}
 
class FooImpl implements FooInterface{
	 override def void fooOp() {
		println("foo")	
	}
	
} 
 @Aspect(className=typeof(Object))
abstract class FooAbsClass {
	public def void  fooOp1() {
		println("foo1")	
	}
} 

@Aspect(className=typeof(FooInterface))
public class FooAspect  extends FooAbsClass{ 
	@OverrideAspectMethod
	public def void  fooOp1() {  
		_self.super_fooOp1
		println("foo2")
	}
} 


