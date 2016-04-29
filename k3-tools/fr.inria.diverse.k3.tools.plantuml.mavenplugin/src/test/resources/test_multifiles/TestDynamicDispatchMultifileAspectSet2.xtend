package test.dynamic_dispatch_multifile

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import test.dynamic_dispatch_multifile.Parent
import test.dynamic_dispatch_multifile.ParentAspect


// due to bug ??? base classes must be either in the same file !? or in a completly different project ...
 
 
class ChildB   extends Parent{
	new(String name){
		super(name)
	}
}

 

@Aspect(className=typeof(ChildB)) 
class ChildBAspect   extends ParentAspect{
	public def String myOperation() {
		"ChildBAspect("+_self.name+")"
	}
}
    
  





