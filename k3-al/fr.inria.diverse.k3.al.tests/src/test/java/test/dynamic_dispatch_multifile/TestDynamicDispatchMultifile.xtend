package test.dynamic_dispatch_multifile

import org.junit.Test

import static org.junit.Assert.*

import static extension test.dynamic_dispatch_multifile.ParentAspect.*


/**
 * verifies that dispatch works even if spreads in several files in the same project 
 */
class TestDynamicDispatchMultifile {
	
	/**
	 * verifies that a simple inheritance dispatch 
	 */
	@Test
	def void testDynamicDispatch_myOperation_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperation ChildAAspect(A1)", a.myOperation) 
	}
	@Test
	def void testDynamicDispatch_myOperation_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperation ChildBAspect(B1)", b.myOperation) // ChildBAspect isn't in the same file as ParentAspect 
	}
	
	/**
	 * checks code gen for methods in some child only
	 */
	@Test
	def void testDynamicDispatch_myOperationInParentAndAOnly_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperationInParentAndAOnly ChildAAspect(A1)", a.myOperationInParentAndAOnly) 	
	}
	/**
	 * checks code gen for methods in some child only
	 */
	@Test
	def void testDynamicDispatch_myOperationInParentAndAOnly_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperationInParentAndAOnly ParentAspect(B1)", b.myOperationInParentAndAOnly) // ChildBAspect isn't in the same file as ParentAspect 	
	}
	
	/**
	 * checks code gen for methods in some child only
	 */
	@Test
	def void testDynamicDispatch_myOperationInParentAndBOnly_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperationInParentAndBOnly ParentAspect(A1)", a.myOperationInParentAndBOnly) 	
	}
	/**
	 * checks code gen for methods in some child only
	 */
	@Test
	def void testDynamicDispatch_myOperationInParentAndBOnly_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperationInParentAndBOnly ChildBAspect(B1)", b.myOperationInParentAndBOnly) // ChildBAspect isn't in the same file as ParentAspect 	
	}

	/**
	 * checks with @OverrideAspectMethod and call to super
	 */
	@Test
	def void testDynamicDispatch_myOperation2_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperation2 ChildAAspect(A1) myOperation2 ParentAspect(A1)", 
			a.myOperation2
		)
	}
	
	/**
	 * checks with @OverrideAspectMethod and call to super
	 */
	@Test
	def void testDynamicDispatch_myOperation2_WithAspectInSeveralFiles() {		
		val b = new ChildB("B1")
		assertEquals("myOperation2 ChildBAspect(B1) myOperation2 ParentAspect(B1)", 
			b.myOperation2
		) // ChildBAspect isn't in the same file as ParentAspect 	
	}
	
	
	/**
	 * checks with a SubAspect of the ChildAspect (not related to a new sub class in the base model
	 */
	@Test
	def void testDynamicDispatch_myOperation3_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperation3 ChildASubAspect(A1)", a.myOperation3) 	
	}
	/**
	 * checks with a SubAspect of the ChildAspect (not related to a new sub class in the base model
	 */
	@Test
	def void testDynamicDispatch_myOperation3_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperation3 ChildBSubAspect(B1)", b.myOperation3) // ChildBAspect isn't in the same file as ParentAspect 	
	}
	
	/**
	 * checks with a SubSubAspect of the ChildAspect (not related to a new sub class in the base model)
	 * using override modifier (because exist in ParentAspect and in ChildAspect)
	 */
	@Test
	def void testDynamicDispatch_myOperation4_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperation4 ChildASubAspect(A1)", a.myOperation4) 	
	}
	/**
	 * checks with a SubSubAspect of the ChildAspect (not related to a new sub class in the base model)
	 * using override modifier (because exist in ParentAspect and in ChildAspect)
	 */
	@Test
	def void testDynamicDispatch_myOperation4_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperation4 ChildBSubSubAspect(B1)", b.myOperation4) // ChildBAspect isn't in the same file as ParentAspect 	
	}
	
	/**
	 * checks with a SubSubAspect of the ChildAspect (not related to a new sub class in the base model)
	 * using @OverrideAspectMethod (because exist in ParentAspect only)
	 */
	@Test
	def void testDynamicDispatch_myOperation5_WithAspectInSingleFile() {
		val a = new ChildA("A1")
		assertEquals("myOperation5 ChildASubAspect(A1)", a.myOperation5) 	
	}
	/**
	 * checks with a SubSubAspect of the ChildAspect (not related to a new sub class in the base model)
	 * using @OverrideAspectMethod (because exist in ParentAspect only)
	 */
	@Test
	def void testDynamicDispatch_myOperation5_WithAspectInSeveralFiles() {
		val b = new ChildB("B1")
		assertEquals("myOperation5 ChildBSubSubAspect(B1)", b.myOperation5) // ChildBAspect isn't in the same file as ParentAspect 	
	}
	
}

   
  




