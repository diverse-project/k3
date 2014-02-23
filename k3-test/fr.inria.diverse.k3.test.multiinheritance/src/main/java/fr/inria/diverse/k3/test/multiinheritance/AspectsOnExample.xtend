package fr.inria.diverse.k3.test.multiinheritance

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

interface A extends B, C{
	def int getA()
}
       
interface B{
	def boolean getB()
} 
 
interface C{
	def String getC()
}
       
  
@Aspect(className=typeof(Object))
abstract class VisitorAspect {
	var Boolean foobar
	
	def StringBuilder visit(){
		new StringBuilder("Visiting VisitorAspect with " + _self.class.simpleName)
	} 
}          
            
  
@Aspect(className=typeof(A), with=#[typeof(CAspect)])
class AAspect extends BAspect {
	@OverrideAspectMethod def StringBuilder visit(){
		println('visitA!')
		_self.fooCMethod
		_self.super_visit.append(", Visiting AAspect with " + _self.class.simpleName)
	}
}
         
   
@Aspect(className=typeof(B))
class BAspect extends VisitorAspect {
	@OverrideAspectMethod def StringBuilder visit(){
		println('visitB!')
		_self.super_visit.append(", Visiting BAspect with " + _self.class.simpleName)
	}
	
	def void fooBMethod() {
		println("fooB")
	}
}         
              
  
@Aspect(className=typeof(C))
class CAspect extends VisitorAspect {
	var int fooAttr = 10 
	
	@OverrideAspectMethod def StringBuilder visit(){
		println('visitC!')
		_self.super_visit.append(", Visiting CAspect with " + _self.class.simpleName)
	}    
           
	def void fooCMethod() {
		println("fooC : " + _self.fooAttr)
	}
}


class AImpl extends BImpl implements A {
	private val _c = new CImpl
	
	override getA() { 12 }
	
	override getC() { _c.getC }
}

class BImpl implements B {
	override getB() { true }
}

class CImpl implements C {
	override getC() { "foo" }
}

class Factory {
	static def A newA() { return new AImpl }
	static def B newB() { return new BImpl }
	static def C newC() { return new CImpl }
}

