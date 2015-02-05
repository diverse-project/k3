package test.dynamic_dispatch_multifile

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import test.dynamic_dispatch_multifile.Parent


// due to bug ??? base classes must be either in the same file !? or in a completly different project ...
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
		"ParentAspect("+_self.name+")"
	} 
} 
 

@Aspect(className=typeof(ChildA)) 
class ChildAAspect   extends ParentAspect{
	public def String myOperation() {
		"ChildAAspect("+_self.name+")"
	}
}
    
  





