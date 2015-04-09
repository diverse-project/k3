package code

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

interface A extends B, C {
	def int getA()
}

interface B {
	def boolean getB()
}

interface C {
	def String getC()
}

@Aspect(className = Object)
abstract class VisitorAspect {
	public Boolean foobar

	def void testBugOverride() {}

	def StringBuilder visit() {
		return new StringBuilder("Visiting VisitorAspect with " + _self.class.simpleName)
	}
}

@Aspect(className = A, with = #[CAspect])
class AAspect extends BAspect {
	@OverrideAspectMethod
	def StringBuilder visit() {
		return _self.super_B_visit.append(", ").append(_self.super_C_visit).append(", Visiting AAspect with " + _self.class.simpleName)
	}

	def void fooA() {
		_self.foobar = false
		_self.fooAttr = 11
	}

	def void fooA2() {
		_self.foobar = true
		_self.fooAttr = 20
	}
}

@Aspect(className = B)
class BAspect extends VisitorAspect {
	@OverrideAspectMethod
	def StringBuilder visit() {
		return _self.super_visit.append(", Visiting BAspect with " + _self.class.simpleName)
	}

	def void fooBMethod() {
		println("fooB")
	}
}

@Aspect(className = C)
class CAspect extends VisitorAspect {
	public int fooAttr

	@OverrideAspectMethod
	def StringBuilder visit(){
		return _self.super_visit.append(", Visiting CAspect with " + _self.class.simpleName)
	}

	def void fooCMethod() {
		println("fooC : " + _self.fooAttr)
	}
}

class AImpl extends BImpl implements A {
	private C _c = new CImpl

	override getA() { return 12 }
	override getC() { return _c.getC }
}

class BImpl implements B {
	override getB() { return true }
}

class CImpl implements C {
	override getC() { return "foo" }
}

class Factory {
	static def A newA() { return new AImpl }
	static def B newB() { return new BImpl }
	static def C newC() { return new CImpl }
}
