package test

import fr.inria.triskell.k3.Contracted
import fr.inria.triskell.k3.Inv
import fr.inria.triskell.k3.Post
import fr.inria.triskell.k3.Pre

@Contracted
class Test {
	def static void main(String[] args) {

		//We can catch the exception or ignore it
		try {
			new Test().foo()
		} catch (Exception e) {
			println("nok\n")
		}

		//We can catch the exception ignore it
		new Test().foo()

	}

	@Inv
	def boolean inv1() {
		return true
	}
  

	def void foo() { 
		println("ok")
	}

	//TODO does not work together.
	//It must be managed by the same processor
	@Pre
	def boolean prefoo() {
		return false
	}

	@Post
	def boolean postfoo() {
		return false
	} 

}
@Contracted
class A {
	String name


	@Inv
	def boolean inv1(){
		return true
	}
	
	@Pre 
	def boolean prefoo(){
		return false;		
	} 
	  
	def void foo() {
	}



	def void bar() {
		println("ok")
	}
	@Post
	def boolean postbar(){
		return true;		
	}

}
 

@Contracted 
class B extends A { 
	String name 
 
   
	@Inv
	def boolean inv2(){
		return true
	}
	override def void bar() {
		println("ok")
	}
	override def void foo() {
		
	}
	@Post
	override def boolean postbar(){
		return false;		
	}
	
	@Pre
	override def boolean prefoo(){
		return true;		
	}
	 

	def static void main(String[] args) {
		new B().bar
	}
	

}


// && sur les post || sur les pre

/*
@Aspect(className=typeof(A))
@Contracted
class AAspect{
	
	@Pre	
	def boolean prefoo(){ 
		return true	
	}
	
} */
