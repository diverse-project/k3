package test.designbycontract

import fr.inria.diverse.k3.al.annotationprocessor.Contracted

import fr.inria.diverse.k3.al.annotationprocessor.Inv
import fr.inria.diverse.k3.al.annotationprocessor.Pre
import fr.inria.diverse.k3.al.annotationprocessor.Post

import fr.inria.diverse.k3.al.annotationprocessor.ContractViolationException
import fr.inria.diverse.k3.al.annotationprocessor.PreConditionViolationException
import fr.inria.diverse.k3.al.annotationprocessor.PostConditionViolationException

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

class TestDbC
{
	@Test
	def void testOkInv() {
		try {
			new SimpleOKInv().foo
		} catch (ContractViolationException e) {
			fail("Should not occur")
		}
	}

	// Should actually throw an InvariantViolationException, see issue #18
	@Test
	def void testNOKInv() {
		assertThrows(PreConditionViolationException, [
			new SimpleNOKInv().foo
		]) 
	}

	@Test
	def void testOKPrePost() {
		try {
			new SimpleOKPrePost().foo
		} catch (ContractViolationException e) {
			fail("Should not occur")
		}
	}

	@Test
	def void testOKAll() {
		try {
			new SimpleOKAll().foo
		} catch (ContractViolationException e) {
			fail("Should not occur")
		}
	}

	@Test
	def void testNOKPreCond() {
		assertThrows(PreConditionViolationException, [
			new SimpleNOKPreCond().foo
		])
	}

	@Test
	def void testNOKPostCondition() {
		assertThrows(PostConditionViolationException, [
			new SimpleNOKPostCond().foo
		])
	}

	@Test
	def void testOKInvNOKPre () {
		assertThrows(PreConditionViolationException, [
			new SimpleOKInvNOKPre().foo
		])
	}

	@Test
	def void testOKInvNOKPost () {
		assertThrows(PostConditionViolationException, [
			new SimpleOKInvNOKPost().foo
		])
	}

	// Should actually throw an InvariantViolationException, see issue #18
	@Test
	def void testNOKInvOKPre() {
		assertThrows(PreConditionViolationException, [
			new SimpleNOKInvOKPre().foo])
	}

	// Should actually throw an InvariantViolationException, see issue #18
	@Test
	def void testNOKInvOKPost() {
		assertThrows(PreConditionViolationException, [
			new SimpleNOKInvOKPost().foo])
	}

	// Should actually throw an InvariantViolationException, see issue #18
	@Test
	def void testInvBrokenByFoo() {
		assertThrows(PostConditionViolationException, [
			new SimpleInvBrokenByFoo().foo])
	}
}

@Contracted
class SimpleOKInv {
	@Inv def boolean inv() { true }

	def void foo() {}
}

@Contracted
class SimpleNOKInv {
	@Inv def boolean inv() { false }

	def void foo() {}
}

@Contracted
class SimpleOKPrePost {
	@Pre  def boolean preFoo() { true }
	@Post def boolean postFoo() { true }

	def void foo() {}
}

@Contracted
class SimpleOKAll {
	@Inv def boolean inv() { true }
	@Pre  def boolean preFoo() { true}
	@Post def boolean postFoo() { true }

	def void foo() {}
}

@Contracted
class SimpleNOKPreCond {
	@Pre def boolean preFoo() { false }

	def void foo() {}
}

@Contracted
class SimpleNOKPostCond {
	@Post def boolean postFoo() { false }

	def void foo() {}
}

@Contracted
class SimpleOKInvNOKPre {
	@Inv def boolean inv() { true }
	@Pre def boolean preFoo() { false }

	def void foo() {}
}

@Contracted
class SimpleOKInvNOKPost {
	@Inv def boolean inv() { true }
	@Post def boolean postFoo() { false }

	def void foo() {}
}

@Contracted
class SimpleNOKInvOKPre {
	@Inv def boolean inv() { false }
	@Pre def boolean preFoo() { true }

	def void foo() {}
}

@Contracted
class SimpleNOKInvOKPost {
	@Inv def boolean inv() { false }
	@Post def boolean postFoo() { true }

	def void foo() {}
}

@Contracted
class SimpleInvBrokenByFoo {
	public int i = 0
	@Inv def boolean inv() { i == 0 }

	def void foo() { i = 1 }
}
