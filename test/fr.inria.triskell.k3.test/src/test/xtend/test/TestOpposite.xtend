package test

import fr.inria.triskell.k3.Opposite
import org.junit.Test

import static org.junit.Assert.*

class TestOpposite {
	@Test
	def void testOpposite1() {
		val Opp1 = new Opposite1
		val Opp2 = new Opposite2
		
		Opp1.opp1 = Opp2
		assertEquals(Opp2, Opp1.opp1)
		assertEquals(Opp1, Opp2.opp2)
	}
}

class Opposite1 {
	@Opposite("opp2")
	public var Opposite2 opp1
}

class Opposite2 {
	@Opposite("opp1")
	public var Opposite1 opp2
}
