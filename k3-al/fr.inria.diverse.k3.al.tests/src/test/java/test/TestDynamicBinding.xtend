package test

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.RootAspect.*

class TestDynamicBinding {
	@Test def void testX1_as_XExpression() {
		val XExpression x = new X1()
		assertEquals("test.X1 X1 test.X1 XExp test.X1 Root", x.visit)
	}

	@Test def void testX1_as_XSubExp1() {
		val XSubExp1 x = new X1()
		assertEquals("test.X1 X1 test.X1 XExp test.X1 Root", x.visit)
	}

	@Test def void testX1_as_X1() {
		val x = new X1()
		assertEquals("test.X1 X1 test.X1 XExp test.X1 Root", x.visit)
	}


	@Test def void testX2_as_XExpression() {
		val XExpression x = new X2()
		assertEquals("test.X2 X2 test.X2 XExp test.X2 Root", x.visit)
	}

	@Test def void testX2_as_XSubExp2() {
		val XSubExp2 x = new X2()
		assertEquals("test.X2 X2 test.X2 XExp test.X2 Root", x.visit)
	}

	@Test def void testX2_as_X2() {
		val x = new X2()
		assertEquals("test.X2 X2 test.X2 XExp test.X2 Root", x.visit)
	}


	@Test def void testX3_as_XExpression() {
		val XExpression x = new X3
		assertEquals("test.X3 X3 test.X3 XExp test.X3 Root", x.visit)
	}

	@Test def void testX3_as_XSubExp3() {
		val XSubExp3 x = new X3
		assertEquals("test.X3 X3 test.X3 XExp test.X3 Root", x.visit)
	}

	@Test def void testX3_as_X3() {
		val x = new X3
		assertEquals("test.X3 X3 test.X3 XExp test.X3 Root", x.visit)
	}



	@Test def void testX4_as_XExpression() {
		val XExpression x = new X4
		assertEquals("test.X4 X4 test.X4 XExp test.X4 Root", x.visit)
	}

	@Test def void testX4_as_XSubExp4() {
		val XSubExp4 x = new X4
		assertEquals("test.X4 X4 test.X4 XExp test.X4 Root", x.visit)
	}

	@Test def void testX4_as_X4() {
		val x = new X4
		assertEquals("test.X4 X4 test.X4 XExp test.X4 Root", x.visit)
	}




	@Test def void testX5_as_XExpression() {
		val XExpression x = new X5
		assertEquals("test.X5 X5 test.X5 X2 test.X5 XExp test.X5 Root", x.visit)
	}

	@Test def void testX5_as_XSubExp2() {
		val XSubExp2 x = new X5
		assertEquals("test.X5 X5 test.X5 X2 test.X5 XExp test.X5 Root", x.visit)
	}

	@Test def void testX5_as_X5() {
		val x = new X5
		assertEquals("test.X5 X5 test.X5 X2 test.X5 XExp test.X5 Root", x.visit)
	}



	@Test def void testX6_as_XExpression() {
		val XExpression x = new X6
		assertEquals("test.X6 X6 test.X6 X1 test.X6 XExp test.X6 Root", x.visit)
	}

	@Test def void testX6_as_XSubExp1() {
		val XSubExp1 x = new X6
		assertEquals("test.X6 X6 test.X6 X1 test.X6 XExp test.X6 Root", x.visit)
	}

	@Test def void testX6_as_X6() {
		val x = new X6
		assertEquals("test.X6 X6 test.X6 X1 test.X6 XExp test.X6 Root", x.visit)
	}



	@Test def void testX7_as_XExpression() {
		val XExpression x = new X7
		assertEquals("test.X7 X7 test.X7 X4 test.X7 XExp test.X7 Root", x.visit)
	}

	@Test def void testX7_as_XSubExp1() {
		val XSubExp4 x = new X7
		assertEquals("test.X7 X7 test.X7 X4 test.X7 XExp test.X7 Root", x.visit)
	}

	@Test def void testX7_as_X7() {
		val x = new X7
		assertEquals("test.X7 X7 test.X7 X4 test.X7 XExp test.X7 Root", x.visit)
	}




	@Test def void testX8_as_XExpression() {
		val XExpression x = new X8
		assertEquals("test.X8 X8 test.X8 X2 test.X8 XExp test.X8 Root", x.visit)
	}

	@Test def void testX8_as_XSubExp2() {
		val XSubExp2 x = new X8
		assertEquals("test.X8 X8 test.X8 X2 test.X8 XExp test.X8 Root", x.visit)
	}

	@Test def void testX8_as_X8() {
		val x = new X8
		assertEquals("test.X8 X8 test.X8 X2 test.X8 XExp test.X8 Root", x.visit)
	}
}

interface XExpression {}
interface XSubExp1 extends XExpression{}
interface XSubExp2 extends XExpression{}
interface XSubExp3 extends XExpression{}
interface XSubExp4 extends XExpression{}
class X1 implements XSubExp1{}
class X8 implements XExpression, XSubExp2{}
class X7 extends X4{}
class X2 implements XSubExp2{}
class X5 extends X2{}
class X3 implements XSubExp3{}
class X6 extends X1{}
class X4 implements XSubExp4{}

@Aspect(className=typeof(Object))
abstract class RootAspect {
	def String visit() {
		_self.class.name + " Root"
	}
}


@Aspect(className=typeof(X8))
class X8Aspect extends X2Aspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X8" + " " + _self.super_visit
	}
}

@Aspect(className=typeof(XSubExp1))
class X1Aspect extends XExpressionAspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X1" + " " + _self.super_visit
	}
}

@Aspect(className=typeof(X6))
class X6Aspect extends X1Aspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X6" + " " + _self.super_visit
	}
}

@Aspect(className=typeof(XExpression))
abstract class XExpressionAspect extends RootAspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " XExp" + " " + _self.super_visit
	}
}

@Aspect(className=typeof(X7))
class X7Aspect extends X4Aspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X7" + " " + _self.super_visit
	}
}

@Aspect(className=typeof(X5))
class X5Aspect extends X2Aspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X5" + " " + _self.super_visit
	}
}


@Aspect(className=typeof(XSubExp2))
class X2Aspect extends XExpressionAspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X2" + " " + _self.super_visit
	}
}


@Aspect(className=typeof(XSubExp3))
class X3Aspect extends XExpressionAspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X3" + " " + _self.super_visit
	}
}


@Aspect(className=typeof(XSubExp4))
class X4Aspect extends XExpressionAspect{
	@OverrideAspectMethod
	def String visit() {
		_self.class.name + " X4" + " " + _self.super_visit
	}
}

