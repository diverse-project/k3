package test

import fr.inria.triskell.k3.Opposite

import org.junit.Test
import org.junit.Before
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
 
class A
{
	@Opposite("a")
	B b
	
	@Opposite("aa")
	B bb
	
	@Opposite("a")
	C c
}

class B
{
	@Opposite("b")
	A a
	
	@Opposite("bb")
	A aa
}

class C
{
	@Opposite("c")
	A a
}

class D extends A
{
	@Opposite("d2")
	D d1
	
	@Opposite("d1")
	D d2
}

class E extends B
{}

class TestOpposite {
	A a1
	A a2
	B b1
	B b2
	C c1
	D d1
	D d2
	E e1
	
	@Before
	def void setUp()
	{
		a1 = new A
		a2 = new A
		b1 = new B
		b2 = new B
		c1 = new C
		d1 = new D
		d2 = new D
		e1 = new E
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
