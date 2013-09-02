package test

import fr.inria.triskell.k3.Aspect
import static extension test.FooGenericsAspect.*


public class TestGenerics{
	def static void main(String[] args) {
		val  l  = new AAAA()  
		l.foo
	}      

}
 
interface FooGenerics<T> {}

class AAAA implements FooGenerics{

} 

@Aspect(className=typeof(FooGenerics))
class FooGenericsAspect {
	public def void foo(){
		println("ok")
	}
	
 	
}