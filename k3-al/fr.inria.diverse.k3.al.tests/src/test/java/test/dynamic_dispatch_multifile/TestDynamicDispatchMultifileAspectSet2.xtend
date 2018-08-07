package test.dynamic_dispatch_multifile

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import test.dynamic_dispatch_multifile.Parent
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

// due to bug ??? base classes must be either in the same file !? or in a completely different project ...
 
 
class ChildB   extends Parent{
	new(String name){
		super(name)
	}
}

 

@Aspect(className=typeof(ChildB)) 
class ChildBAspect   extends ParentAspect{
	public def String myOperation() {
		"myOperation ChildBAspect("+_self.name+")"
	}
	
	public def String myOperationInParentAndBOnly() {
		"myOperationInParentAndBOnly ChildBAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation2() {
		"myOperation2 ChildBAspect("+_self.name+") "+_self.super_myOperation2
	}
	
	@OverrideAspectMethod
	public def String myOperation3() {
		"myOperation3 ChildBAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation4() {
		"myOperation4 ChildBAspect("+_self.name+")"
	}
}
    
  
@Aspect(className=typeof(ChildB)) 
class ChildBSubAspect   extends ChildBAspect{
	override String myOperation3() {
		"myOperation3 ChildBSubAspect("+_self.name+")"
	}
}


@Aspect(className=typeof(ChildB)) 
class ChildBSubSubAspect   extends ChildBSubAspect{
	override String myOperation4() {
		"myOperation4 ChildBSubSubAspect("+_self.name+")"
	}
	
	@OverrideAspectMethod
	public def String myOperation5() {
		"myOperation5 ChildBSubSubAspect("+_self.name+")"
	}
}




