package test

import fr.inria.triskell.k3.Aspect
import static extension test.FooGenericsAspect.*

public class TestGenerics{
	def static void main(String[] args) {
		val  l  = new AAAA()  
		l.foo
	}      
}



interface FooGenerics<T> {
	def T getget()
}

class AAAA implements FooGenerics{
	override getget() {
		return null
	}
} 

@Aspect(className=typeof(Object))
class FooFooGenerics2 {
	def void aa_FooFooGenerics2(){}
}

@Aspect(className=typeof(FooGenerics))
class FooGenericsAspect {
	def void testets(String obj){}
	
	def void foo(){
//		if(_self.getget!=null) {
//			_self.testets(_self.getget)
//		}
		println("ok")
	}
}

@Aspect(className=typeof(Object))
abstract class EcoreSlicerVisitor<T> {
	protected var T attr = null
}


