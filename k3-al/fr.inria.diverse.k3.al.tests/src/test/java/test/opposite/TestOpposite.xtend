package test.opposite

import fr.inria.diverse.k3.al.annotationprocessor.Opposite
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

/*
 * +-----------+
 * |     C     |
 * |-----------|
 * |           |
 * |           |
 * +-----------+
 *     c | 1
 *       |
 *       |
 *     a | 1
 * +-----------+ a       b +-------+
 * |     A     |-----------|   B   |
 * |-----------| 1       1 |-------|
 * |           |           |       |
 * |           | aa     bb |       |
 * |           |-----------|       |
 * +-----------+ 1       1 +-------+
 *      /\                     /\
 *      ||                     ||
 * +-----------+ d1        +-------+
 * |     D     |------     |   E   |
 * |-----------| 1   |     |-------|
 * |           |     |     |       |
 * |           |     |     +-------+
 * |           | d2  |
 * |           |------
 * |           | 1
 * +-----------+
 *
 */

class OpA
{
	@Opposite("a")
	OpB b

	@Opposite("aa")
	OpB bb

	@Opposite("a")
	OpC c
}

class OpB
{
	@Opposite("b")
	OpA a

	@Opposite("bb")
	OpA aa
}

class OpC
{
	@Opposite("c")
	OpA a
}

class OpD extends OpA
{
	@Opposite("d2")
	OpD d1

	@Opposite("d1")
	OpD d2
}

class OpE extends OpB
{}

class TestOpposite {
	OpA a1
	OpA a2
	OpB b1
	OpB b2
	OpC c1
	OpD d1
	OpD d2
	OpE e1

	@Before
	def void setUp()
	{
		a1 = new OpA
		a2 = new OpA
		b1 = new OpB
		b2 = new OpB
		c1 = new OpC
		d1 = new OpD
		d2 = new OpD
		e1 = new OpE
	}

	@Test
	def void testOneToOneInitialization()
	{
		assertNull(a1.b)
		assertNull(a1.bb)
		assertNull(a1.c)
		assertNull(b1.a)
		assertNull(b1.aa)
		assertNull(c1.a)
	}

	@Test
	def void testOneToOneSimple()
	{
		a1.b = b1

		assertEquals(a1.b, b1)
		assertEquals(b1.a, a1)
	}

	@Test
	def void testOneToOneOnSelf1()
	{
		d1.d1 = d1

		assertEquals(d1.d1, d1)
		assertEquals(d1.d2, d1)
	}

	@Test
	def void testOneToOneOnSelf2()
	{
		d1.d1 = d2
		d2.d1 = d1

		assertEquals(d1.d1, d2)
		assertEquals(d1.d2, d2)
		assertEquals(d2.d2, d1)
		assertEquals(d2.d1, d1)
	}

	@Test
	def void testOneToOneSelf3()
	{
		d1.d1 = d2
		d2.d1 = d2

		assertNull(d1.d1)
		assertNull(d1.d2)
		assertEquals(d2.d1, d2)
		assertEquals(d2.d2, d2)
	}

	@Test
	def void testOneToOneNullify1()
	{
		a1.b = b1
		a1.b = null

		assertNull(a1.b)
		assertNull(b1.a)
	}

	@Test
	def void testOneToOneNullify2()
	{
		a1.b = b1
		b1.a = null

		assertNull(a1.b)
		assertNull(b1.a)
	}

	@Test
	def void testOneToOneUpdate1()
	{
		a1.b = b1
		a1.b = b2

		assertEquals(a1.b, b2)
		assertNull(b1.a)
		assertEquals(b2.a, a1)
	}

	@Test
	def void testOneToOneUpdate2()
	{
		a1.b = b1
		b1.a = a2

		assertNull(a1.b)
		assertEquals(b1.a, a2)
		assertEquals(a2.b, b1)
	}

	@Test
	def void testOneToOneUpdate3()
	{
		a1.b = b1
		b2.a = a2
		a1.b = b2

		assertEquals(a1.b, b2)
		assertNull(a2.b)
		assertNull(b1.a)
		assertEquals(b2.a, a1)
	}

	@Test
	def void testOneToOneMultiple()
	{
		a1.b = b1
		c1.a = a1

		assertEquals(a1.b, b1)
		assertEquals(a1.c, c1)
		assertEquals(b1.a, a1)
		assertEquals(c1.a, a1)
	}

	@Test
	def void testOneToOneMultipleSameClass()
	{
		a1.b = b1
		b1.aa = a1

		assertEquals(a1.b, b1)
		assertEquals(a1.bb, b1)
		assertEquals(b1.a, a1)
		assertEquals(b1.aa, a1)
	}

	@Test
	def void testOneToOneMultipleNullify()
	{
		a1.b = b1
		b1.aa = a1
		a1.b = null
		b1.aa = null

		assertNull(a1.b)
		assertNull(a1.bb)
		assertNull(b1.a)
		assertNull(b1.aa)
	}

	@Test
	def void testOneToOneInheritance()
	{
		d1.b = b1

		assertEquals(b1.a, d1)
		assertEquals(d1.b, b1)
	}

	@Test
	def void testOneToOneMultipleInheritance()
	{
		d1.b = e1
		e1.aa = d1

		assertEquals(d1.b, e1)
		assertEquals(d1.bb, e1)
		assertEquals(e1.a, d1)
		assertEquals(e1.aa, d1)
	}
}
