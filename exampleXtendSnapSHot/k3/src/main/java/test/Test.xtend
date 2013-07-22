package test

import fr.inria.triskell.k3.Post
import fr.inria.triskell.k3.Pre
import fr.inria.triskell.k3.Contracted

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