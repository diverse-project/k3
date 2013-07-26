package test

import fr.inria.triskell.k3.Contracted
import fr.inria.triskell.k3.Inv
import fr.inria.triskell.k3.Post
import fr.inria.triskell.k3.PostConditionViolationException
import fr.inria.triskell.k3.Pre
import fr.inria.triskell.k3.PreConditionViolationException
import org.junit.Test

import static org.junit.Assert.*

class TestCase{
	@Test
	def void testPre(){
		val l = new TestDbC()
		try{
			l.foo					
		}catch(PreConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}

	@Test
	def void testInv(){
		val l = new TestDbC1()
		try{
			l.foo					
		}catch(PreConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}

	@Test
	def void testPost(){
		val l = new TestDbC2()
		try{
			l.foo					
		}catch(PostConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}
	@Test
	def void testPreInheritance(){
		val l = new BDbc()
		try{
			l.foo					
		}catch(PreConditionViolationException e) {
			fail("Should not occur")
		}
	}
	@Test
	def void testPreInheritance1(){
		val l = new BDbc()
		try{
			l.bar					
		}catch(PreConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}


	@Test
	def void testInvInheritance(){
		val l = new BDbc1()
		try{
			l.foo					
		}catch(PreConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}

	@Test
	def void testPostInheritance(){
		val l = new BDbc2()
		try{
			l.bar					
		}catch(PostConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}
	@Test
	def void testPostInheritance1(){
		val l = new BDbc2()
		try{
			l.bar					
		}catch(PostConditionViolationException e) {
			return 
		}
		fail("Should not occur")
	}
	
}


@Contracted
class TestDbC {

 
	def void foo() {
		println("ok")
	} 

	//TODO does not work together.
	//It must be managed by the same processor
	@Pre
	def boolean prefoo() {
		return false
	}


}

@Contracted
class TestDbC1 {

	@Inv
	def boolean inv1() {
		return false 
	}
 
	def void foo() {
		println("ok")
	} 

}


@Contracted
class TestDbC2 {

 
	def void foo() {
		println("ok")
	} 


	@Post
	def boolean postfoo() {
		return false
	}

}


@Contracted
abstract class ADbc {
	String name

	@Pre
	def boolean prefoo() {
		return false;
	}

	abstract def void foo() ;

	@Pre
	def boolean prebar() {
		return true;
	}

	abstract def void bar() ;

}

@Contracted
class BDbc extends ADbc {
	String name


	override def void foo() {
	}


	@Pre
	override def boolean prefoo() {
		return true;
	}
	
		@Pre
	override def boolean prebar() {
		return false;
	}

	override  def void bar() {}
	

 
}

@Contracted
abstract class ADbc1 {
	String name

	@Inv
	def boolean inv1() {
		return true
	}


	abstract def void foo() ;

}

@Contracted
class BDbc1 extends ADbc1 {
	String name

	@Inv
	def boolean inv2() {
		return false
	}


	override def void foo() {
	}
 
}

@Contracted
abstract class ADbc2 {
	String name



	def void bar() {
		println("ok")
	}

	@Post
	def boolean postbar() {
		return true;
	}


	def void foo() {
		println("ok")
	}

	@Post
	def boolean postfoo() {
		return false;
	}

}

@Contracted
class BDbc2 extends ADbc2 {
	String name


	override def void bar() {
		println("ok")
	}


	@Post
	override def boolean postbar() {
		return false;
	}

	override def void foo() {
		println("ok")
	}

	@Post
	override def boolean postfoo() {
		return false;
	}

 
}





