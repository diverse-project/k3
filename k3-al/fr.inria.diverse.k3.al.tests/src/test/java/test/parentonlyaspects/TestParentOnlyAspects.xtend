package test.parentonlyaspects

import test.parentonlyaspects.base.Middle1Impl
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

import static extension test.parentonlyaspects.aspects.Top1Aspect.*
//import static extension test.parentonlyaspects.aspects.Top2Aspect.*
import static extension test.parentonlyaspects.aspects.Bottom1Aspect.*
import test.parentonlyaspects.base.Middle1
import test.parentonlyaspects.base.Bottom1Impl
import test.parentonlyaspects.base.Bottom1

class TestParentOnlyAspects {
	@Test def void testCallFirstParentAspects() {
		val Middle1 middle1 = new Middle1Impl
		assertEquals("Top1Aspect", middle1.doTop1Aspect)
	}
	
	@Test def void testCallSecondParentAspects() {
		val Middle1 middle1 = new Middle1Impl
		assertEquals("Top2Aspect", middle1.doTop2Aspect)
	}
	
	@Test def void testCallLevel2FirstParentAspects() {
		val Bottom1 bottom1 = new Bottom1Impl
		assertEquals("Top1Aspect", bottom1.doTop1Aspect)
	}
	
	@Test def void testCallLevel2SecondParentAspects() {
		val Bottom1 bottom1 = new Bottom1Impl
		assertEquals("Top2Aspect", bottom1.doTop2Aspect)
	}
	
	@Test def void testCallParentLevel1Aspects(){
		val Bottom1 bottom1 = new Bottom1Impl
		assertEquals("Middle1AspectMiddle2Aspect", bottom1.callParentLevel1Aspects)
	}
	
	@Test def void testCallParentLevel2Aspects(){
		val Bottom1 bottom1 = new Bottom1Impl
		assertEquals("Top1AspectTop2AspectTop3AspectTop4Aspect", bottom1.callParentLevel2Aspects)
	}

}