package test.dynamic_dispatch_multifile

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import test.dynamic_dispatch_multifile.Parent
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

// due to bug ??? base classes must be either in the same file !? or in a completely different project ...
class Parent {
	public String name 
	new(String name){
		this.name = name
	}
} 
 
class ChildA   extends Parent{
	new(String name){
		super(name)
	}
}

@Aspect(className=typeof(Parent)) 
class ParentAspect {
	public def String myOperation() {
		"myOperation ParentAspect("+_self.name+")"
	} 
	
	public def String myOperationInParentAndAOnly() {
		"myOperationInParentAndAOnly ParentAspect("+_self.name+")"
	} 
	
	public def String myOperationInParentAndBOnly() {
		"myOperationInParentAndBOnly ParentAspect("+_self.name+")"
	}
	
	public def String myOperation2() {
		"myOperation2 ParentAspect("+_self.name+")"
	}
	
	public def String myOperation3() {
		"myOperation3 ParentAspect("+_self.name+")"
	}
	
	public def String myOperation4() {
		"myOperation4 ParentAspect("+_self.name+")"
	}
	
	public def String myOperation5() {
		"myOperation5 ParentAspect("+_self.name+")"
	}
} 
 

@Aspect(className=typeof(ChildA)) 
class ChildAAspect   extends ParentAspect{
	public def String myOperation() {
		"myOperation ChildAAspect("+_self.name+")"
	}
	
	public def String myOperationInParentAndAOnly() {
		"myOperationInParentAndAOnly ChildAAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation2() {
		"myOperation2 ChildAAspect("+_self.name+") "+_self.super_myOperation2
	}
	
	@OverrideAspectMethod
	public def String myOperation3() {
		"myOperation3 ChildAAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation4() {
		"myOperation4 ChildAAspect("+_self.name+")"
	} 
}
    
  
@Aspect(className=typeof(ChildA)) 
class ChildASubAspect   extends ChildAAspect{
	override String myOperation3() {
		"myOperation3 ChildASubAspect("+_self.name+")"
	}
}

@Aspect(className=typeof(ChildA)) 
class ChildASubSubAspect   extends ChildASubAspect{
	override String myOperation4() {
		"myOperation4 ChildASubSubAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation5() {
		"myOperation5 ChildASubSubAspect("+_self.name+")"
	}
}



