package fr.inria.triskell.k3.spoon

import fr.irisa.diversify.annotations.WhileTrueThread

class SpoonExample{

	def static void main(String[] args) {
		new A().foo
	}
	

}

public class A{
	
	@WhileTrueThread
	def void  foo(){
		
		var i = 0 ;
		while ((i=i+1) < 10) 
			println(i)

	}
	
}

