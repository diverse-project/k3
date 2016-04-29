package test.dynamic_dispatch_multifile

import org.junit.Test

import static org.junit.Assert.*

import static extension test.dynamic_dispatch_multifile.ParentAspect.*

class TestDynamicDispatchMultifile {
	@Test
	def void testDynamicDispatchWithAspectInSeveralFiles() {
		val a = new ChildA("A1")
		val b = new ChildB("B1")
		assertEquals("ChildAAspect(A1)", a.myOperation)
		assertEquals("ChildBAspect(B1)", b.myOperation) // ChildBAspect isn't in the same file as ParentAspect 
		
	}
}

   
  




