package test.oppositemany

import fr.inria.diverse.k3.al.annotationprocessor.Opposite
import java.util.List
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach

class AA
{
	@Opposite("aa")
	List<BB> bb

	@Opposite("aa")
	List<CC> cc
}

class BB
{
	@Opposite("bb")
	AA aa
}

class CC
{
	@Opposite("cc")
	List<AA> aa
}

class DD extends BB
{
	@Opposite("ddb")
	List<DD> dda

	@Opposite("dda")
	List<DD> ddb
}

class TestOppositeMany
{
	AA aa1
	AA aa2
	BB bb1
	BB bb2

	@BeforeEach
	def void setUp()
	{
		println('TestOppositeMany.setUp()')
		aa1 = new AA
		aa2 = new AA
		bb1 = new BB
		bb2 = new BB
	}

	@Test
	def void testInitialization()
	{
		assertTrue(aa1.bb.empty)
		assertNull(bb1.aa)
	}

	@Test
	def void testOneToManySimple()
	{
		bb1.aa = aa1

		assertEquals(bb1.aa, aa1)
		assertEquals(aa1.bb.size, 1)
		assertTrue(aa1.bb.contains(bb1))
	}

	@Test
	def void testManyToOneSimple()
	{
		aa1.addBb(bb1)

		assertEquals(bb1.aa, aa1)
		assertEquals(aa1.bb.size, 1)
		assertTrue(aa1.bb.contains(bb1))
	}

	@Test
	def void testManyToOneRemove()
	{
		aa1.addBb(bb1)
		aa1.addBb(bb2)
		aa1.removeBb(bb1)

		assertEquals(aa1.bb.size, 1)
		assertTrue(aa1.bb.contains(bb2))
		assertEquals(bb2.aa, aa1)
		assertNull(bb1.aa)
	}

	@Test
	def void testOneToManyRemove()
	{
		aa1.addBb(bb1)
		aa1.addBb(bb2)
		bb2.aa = null

		assertEquals(aa1.bb.size, 1)
		assertTrue(aa1.bb.contains(bb1))
		assertNull(bb2.aa)
		assertEquals(bb1.aa, aa1)
	}

	@Test
	def void testManyToManySimple()
	{
		val cc1 = new CC
		aa1.addCc(cc1)

		assertEquals(aa1.cc.size, 1)
		assertEquals(cc1.aa.size, 1)
		assertTrue(aa1.cc.contains(cc1))
		assertTrue(cc1.aa.contains(aa1))
	}

	@Test
	def void testManyToManyRemove()
	{
		val cc1 = new CC
		cc1.addAa(aa1)
		cc1.addAa(aa2)
		cc1.removeAa(aa1)

		assertEquals(aa1.cc.size, 0)
		assertEquals(aa2.cc.size, 1)
		assertEquals(cc1.aa.size, 1)
		assertTrue(cc1.aa.contains(aa2))
		assertTrue(aa2.cc.contains(cc1))
	}

	@Test
	def void testOneToManyInheritance()
	{
		val dd1 = new DD

		aa1.addBb(bb1)
		aa1.addBb(bb2)
		aa1.addBb(dd1)

		assertEquals(aa1.bb.size, 3)
		assertEquals(bb1.aa, aa1)
		assertEquals(bb2.aa, aa1)
		assertEquals(dd1.aa, aa1)

		dd1.aa = null

		assertEquals(aa1.bb.size, 2)
		assertNull(dd1.aa)
	}

	@Test
	def void testManyToManySameClass()
	{
		val dd1 = new DD
		val dd2 = new DD

		dd1.addDda(dd2)

		assertEquals(dd1.dda.size, 1)
		assertEquals(dd1.ddb.size, 0)
		assertEquals(dd2.ddb.size, 1)
		assertEquals(dd2.dda.size, 0)
		assertTrue(dd1.dda.contains(dd2))
		assertTrue(dd2.ddb.contains(dd1))
	}
}
