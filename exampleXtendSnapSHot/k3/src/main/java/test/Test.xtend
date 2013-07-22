package test

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.Contracted
import fr.inria.triskell.k3.Post
import fr.inria.triskell.k3.Pre
import fr.inria.triskell.k3.Inv

@Contracted
class Test {
	def static void main(String[] args) {
		
		
		//We can catch the exception or ignore it
		try{
			new Test().foo()	
		}catch(Exception e ){
			println("nok\n")
		}
		
		//We can catch the exception ignore it
		new Test().foo()	
		
	} 
	
	@Inv 
	def boolean inv1(){
		return true
	}
	
	
	def void bar(){
		
	}
	
	
	def void foo(){
		println("ok")
	}
	
	//TODO does not work together.
	//It must be managed by the same processor
	@Pre
	def boolean prefoo(){
		return true
	}	 
	@Post
	def boolean postfoo(){
		return false
	}	
	
}


class A{
	String name
	
	def void foo(){
		
	}
	
}

/*
@Aspect(className=typeof(A))
@Contracted
class AAspect{
	
	@Pre	
	def boolean prefoo(){ 
		return true	
	}
	
} */
