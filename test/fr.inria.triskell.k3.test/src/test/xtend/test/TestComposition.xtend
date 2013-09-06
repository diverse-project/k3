package test

import fr.inria.triskell.k3.Composition
import org.junit.Test

import static org.junit.Assert.*

class TestComposition {
	@Composition
	var Compose attr  = null

	@Test
	def testComposition() {
		val testCompo = new TestComposition
		val compo = new Composer2
		val compose = new Compose
		
		testCompo.attr = compose
		assertEquals(compose, testCompo.attr)
		compo.attr = testCompo.attr
		assertEquals(compose, compo.attr)
		assertNull(testCompo.attr)
	}	
}

class Composer2 {
	@Composition
	public var Compose attr  = null
}


class Compose {
	
}

