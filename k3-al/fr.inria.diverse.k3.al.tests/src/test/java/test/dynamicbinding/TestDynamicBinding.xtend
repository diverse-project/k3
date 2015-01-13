package test.dynamicbinding

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.junit.Test

import static org.junit.Assert.*

import static extension test.dynamicbinding.RootAspect.*

class TestDynamicBinding {
	
	public final String PACKAGE_NAME = "test.dynamicbinding"
	
	@Test def void testX1_as_XExpression() {
		val XExpression x = new X1()
		assertEquals('''«PACKAGE_NAME».X1 X1 «PACKAGE_NAME».X1 XExp «PACKAGE_NAME».X1 Root'''.toString, x.visit)
	}

	@Test def void testX1_as_XSubExp1() {
		val XSubExp1 x = new X1()
		assertEquals('''«PACKAGE_NAME».X1 X1 «PACKAGE_NAME».X1 XExp «PACKAGE_NAME».X1 Root'''.toString, x.visit)
	}

	@Test def void testX1_as_X1() {
		val x = new X1()
		assertEquals('''«PACKAGE_NAME».X1 X1 «PACKAGE_NAME».X1 XExp «PACKAGE_NAME».X1 Root'''.toString, x.visit)
	}


	@Test def void testX2_as_XExpression() {
		val XExpression x = new X2()
		assertEquals('''«PACKAGE_NAME».X2 X2 «PACKAGE_NAME».X2 XExp «PACKAGE_NAME».X2 Root'''.toString, x.visit)
	}

	@Test def void testX2_as_XSubExp2() {
		val XSubExp2 x = new X2()
		assertEquals('''«PACKAGE_NAME».X2 X2 «PACKAGE_NAME».X2 XExp «PACKAGE_NAME».X2 Root'''.toString, x.visit)
	}

	@Test def void testX2_as_X2() {
		val x = new X2()
		assertEquals('''«PACKAGE_NAME».X2 X2 «PACKAGE_NAME».X2 XExp «PACKAGE_NAME».X2 Root'''.toString, x.visit)
	}


	@Test def void testX3_as_XExpression() {
		val XExpression x = new X3
		assertEquals('''«PACKAGE_NAME».X3 X3 «PACKAGE_NAME».X3 XExp «PACKAGE_NAME».X3 Root'''.toString, x.visit)
	}

	@Test def void testX3_as_XSubExp3() {
		val XSubExp3 x = new X3
		assertEquals('''«PACKAGE_NAME».X3 X3 «PACKAGE_NAME».X3 XExp «PACKAGE_NAME».X3 Root'''.toString, x.visit)
	}

	@Test def void testX3_as_X3() {
		val x = new X3
		assertEquals('''«PACKAGE_NAME».X3 X3 «PACKAGE_NAME».X3 XExp «PACKAGE_NAME».X3 Root'''.toString, x.visit)
	}



	@Test def void testX4_as_XExpression() {
		val XExpression x = new X4
		assertEquals('''«PACKAGE_NAME».X4 X4 «PACKAGE_NAME».X4 XExp «PACKAGE_NAME».X4 Root'''.toString, x.visit)
	}

	@Test def void testX4_as_XSubExp4() {
		val XSubExp4 x = new X4
		assertEquals('''«PACKAGE_NAME».X4 X4 «PACKAGE_NAME».X4 XExp «PACKAGE_NAME».X4 Root'''.toString, x.visit)
	}

	@Test def void testX4_as_X4() {
		val x = new X4
		assertEquals('''«PACKAGE_NAME».X4 X4 «PACKAGE_NAME».X4 XExp «PACKAGE_NAME».X4 Root'''.toString, x.visit)
	}




	@Test def void testX5_as_XExpression() {
		val XExpression x = new X5
		assertEquals('''«PACKAGE_NAME».X5 X5 «PACKAGE_NAME».X5 X2 «PACKAGE_NAME».X5 XExp «PACKAGE_NAME».X5 Root'''.toString, x.visit)
	}

	@Test def void testX5_as_XSubExp2() {
		val XSubExp2 x = new X5
		assertEquals('''«PACKAGE_NAME».X5 X5 «PACKAGE_NAME».X5 X2 «PACKAGE_NAME».X5 XExp «PACKAGE_NAME».X5 Root'''.toString, x.visit)
	}

	@Test def void testX5_as_X5() {
		val x = new X5
		assertEquals('''«PACKAGE_NAME».X5 X5 «PACKAGE_NAME».X5 X2 «PACKAGE_NAME».X5 XExp «PACKAGE_NAME».X5 Root'''.toString, x.visit)
	}



	@Test def void testX6_as_XExpression() {
		val XExpression x = new X6
		assertEquals('''«PACKAGE_NAME».X6 X6 «PACKAGE_NAME».X6 X1 «PACKAGE_NAME».X6 XExp «PACKAGE_NAME».X6 Root'''.toString, x.visit)
	}

	@Test def void testX6_as_XSubExp1() {
		val XSubExp1 x = new X6
		assertEquals('''«PACKAGE_NAME».X6 X6 «PACKAGE_NAME».X6 X1 «PACKAGE_NAME».X6 XExp «PACKAGE_NAME».X6 Root'''.toString, x.visit)
	}

	@Test def void testX6_as_X6() {
		val x = new X6
		assertEquals('''«PACKAGE_NAME».X6 X6 «PACKAGE_NAME».X6 X1 «PACKAGE_NAME».X6 XExp «PACKAGE_NAME».X6 Root'''.toString, x.visit)
	}



	@Test def void testX7_as_XExpression() {
		val XExpression x = new X7
		assertEquals('''«PACKAGE_NAME».X7 X7 «PACKAGE_NAME».X7 X4 «PACKAGE_NAME».X7 XExp «PACKAGE_NAME».X7 Root'''.toString, x.visit)
	}

	@Test def void testX7_as_XSubExp1() {
		val XSubExp4 x = new X7
		assertEquals('''«PACKAGE_NAME».X7 X7 «PACKAGE_NAME».X7 X4 «PACKAGE_NAME».X7 XExp «PACKAGE_NAME».X7 Root'''.toString, x.visit)
	}

	@Test def void testX7_as_X7() {
		val x = new X7
		assertEquals('''«PACKAGE_NAME».X7 X7 «PACKAGE_NAME».X7 X4 «PACKAGE_NAME».X7 XExp «PACKAGE_NAME».X7 Root'''.toString, x.visit)
	}




	@Test def void testX8_as_XExpression() {
		val XExpression x = new X8
		assertEquals('''«PACKAGE_NAME».X8 X8 «PACKAGE_NAME».X8 X2 «PACKAGE_NAME».X8 XExp «PACKAGE_NAME».X8 Root'''.toString, x.visit)
	}

	@Test def void testX8_as_XSubExp2() {
		val XSubExp2 x = new X8
		assertEquals('''«PACKAGE_NAME».X8 X8 «PACKAGE_NAME».X8 X2 «PACKAGE_NAME».X8 XExp «PACKAGE_NAME».X8 Root'''.toString, x.visit)
	}

	@Test def void testX8_as_X8() {
		val x = new X8
		assertEquals('''«PACKAGE_NAME».X8 X8 «PACKAGE_NAME».X8 X2 «PACKAGE_NAME».X8 XExp «PACKAGE_NAME».X8 Root'''.toString, x.visit)
	}
}

/*
  copy paste into http://uml.me to draw the diagram
 [<<XExpression>>]^--[<<XSubExp1>>]
[<<XExpression>>]^--[<<XSubExp2>>]
[<<XExpression>>]^--[<<XSubExp3>>]
[<<XExpression>>]^--[<<XSubExp4>>]
[<<XSubExp1>>]^--[X1]
[<<XExpression>>]^--[X8]
[<<XSubExp2>>]^--[X8]
[X4]^--[X7]
[<<XSubExp2>>]^--[X2]
[X2]^--[X5]
[<<XSubExp3>>]^--[X3]
[X1]^--[X6]
[<<XSubExp4>>]^--[X4]

 // Aspect part
  [RootAspect]aspect -.->[Object]
  [X8Aspect]aspect -.->[X8]
  [X2Aspect]^--[X8Aspect]
  
  [X1Aspect]aspect -.->[<<XSubExp1>>]
  [XExpressionAspect]^--[X1Aspect]
  [X6Aspect]aspect -.->[X6]
  [X1Aspect]^--[X6Aspect]
  
  [XExpressionAspect]aspect -.->[<<XExpression>>]
  [RootAspect]^--[XExpressionAspect] 
  
  [X7Aspect]aspect -.->[X7]
  [X4Aspect]^--[X7Aspect]
 	
  [X5Aspect]aspect -.->[X5]
  [X2Aspect]^--[X5Aspect]


  [X2Aspect]aspect -.->[<<XSubExp2>>]
  [XExpressionAspect]^--[X2Aspect]

  [X3Aspect]aspect -.->[<<XSubExp3>>]
  [XExpressionAspect]^--[X3Aspect]


  [X4Aspect]aspect -.->[<<XSubExp4>>]
  [XExpressionAspect]^--[X4Aspect]


  */

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

