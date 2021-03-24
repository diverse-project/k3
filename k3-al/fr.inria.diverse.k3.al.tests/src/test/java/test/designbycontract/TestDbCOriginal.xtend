package test.designbycontract

import fr.inria.diverse.k3.al.annotationprocessor.Contracted

import fr.inria.diverse.k3.al.annotationprocessor.Inv
import fr.inria.diverse.k3.al.annotationprocessor.Pre
import fr.inria.diverse.k3.al.annotationprocessor.Post

import fr.inria.diverse.k3.al.annotationprocessor.PreConditionViolationException
import fr.inria.diverse.k3.al.annotationprocessor.PostConditionViolationException

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

class TestCase
{
	@Test
	def void testPre() {
		assertThrows(PreConditionViolationException, [
			val l = new RewriteMe
			l.foo
		])
	}

	@Test
	def void testInv() {
		assertThrows(PreConditionViolationException, [
			val l = new RewriteMe1
			l.foo
		])
	}

	@Test
	def void testPost() {
		assertThrows(PostConditionViolationException, [
			val l = new RewriteMe2
			l.foo
		])
	}

	@Test
	def void testPreInheritance() {
		try {
			val l = new BDbc
			l.foo
		} catch (Exception e) {
			fail("Should not occur")
		}
	}

	@Test
	def void testPreInheritance1() {
		assertThrows(PreConditionViolationException, [
			val l = new BDbc
			l.bar
		])
	}

	@Test
	def void testInvInheritance() {
		assertThrows(PreConditionViolationException, [
			val l = new BDbc1
			l.foo
		])
	}

	@Test
	def void testPostInheritance() {
		assertThrows(PostConditionViolationException, [
			val l = new BDbc2
			l.bar
		])
	}

	@Test
	def void testPostInheritance1() {
		assertThrows(PostConditionViolationException, [
			val l = new BDbc2
			l.bar
		])
	}
}

/* */@Contracted
class RewriteMe {


	def void foo() {}

	//TODO does not work together.
	//It must be managed by the same processor
	@Pre
	def boolean preFoo() {
		return false
	}


}

@Contracted
class RewriteMe1 {

	@Inv
	def boolean inv1() {
		return false
	}

	def void foo() {
		println("ok")
	}

}


@Contracted
class RewriteMe2 {


	def void foo() {
		println("ok")
	}


	@Post
	def boolean postFoo() {
		return false
	}

}

@Contracted
abstract class ADbc {
	String name

	@Pre
	def boolean preFoo() {
		return false;
	}

	abstract def void foo() ;

	@Pre
	def boolean preBar() {
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
	override def boolean preFoo() {
		return true;
	}

		@Pre
	override def boolean preBar() {
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
	def boolean postBar() {
		return true;
	}


	def void foo() {
		println("ok")
	}

	@Post
	def boolean postFoo() {
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
	override def boolean postBar() {
		return false;
	}

	override def void foo() {
		println("ok")
	}

	@Post
	override def boolean postFoo() {
		return false;
	}


}
