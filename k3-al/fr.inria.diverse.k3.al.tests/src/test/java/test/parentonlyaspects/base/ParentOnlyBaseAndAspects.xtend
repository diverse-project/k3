package test.parentonlyaspects.base 

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import static extension test.parentonlyaspects.base.Middle1Aspect.*
import static extension test.parentonlyaspects.base.Middle2Aspect.*

interface Top1{
//	def String doTop1()
}

interface Top2 {
//	def String doTop1()
}

interface Top3 {
//	def String doTop1()
}

interface Top4 {
//	def String doTop1()
}

interface Middle1 extends Top1, Top2 {
//	def String doMiddle1()
}

interface Middle2 extends Top3, Top4 {
//	def String doMiddle2()
}

interface Bottom1 extends Middle1, Middle2{
//	def String doBottom1()
}

interface Bottom2 extends Middle1{
//	def String doBottom2()
}


class Top1Impl implements Top1{
}

class Top2Impl implements Top2{
}

class Top3Impl implements Top3{
}

class Top4Impl implements Top4{
}

class Middle1Impl implements Middle1{
}

class Middle2Impl implements Middle2{
}

class Bottom1Impl implements Bottom1{
}

//class Bottom2Impl implements Bottom2{}

@Aspect(className = Top1)
class Top1Aspect{
	public def String doTop1Aspect(){ return "Top1Aspect"}
}

@Aspect(className=Top2)
class Top2Aspect{
	public def String doTop2Aspect(){ return "Top2Aspect"}
}

@Aspect(className=Top3)
class Top3Aspect{
	public def String doTop3Aspect(){ return "Top3Aspect"}
}

@Aspect(className=Top4)
class Top4Aspect{
	public def String doTop4Aspect(){ return "Top4Aspect"}
}

@Aspect(className=Middle1, with=#[Top2Aspect])
class Middle1Aspect extends Top1Aspect{
	public def String doMiddle1Aspect(){ return "Middle1Aspect"}
}

@Aspect(className=Middle2, with=#[Top4Aspect])
class Middle2Aspect extends Top3Aspect{
	public def String doMiddle2Aspect(){ return "Middle2Aspect"}
}

@Aspect(className=Bottom1, with=#[Middle2Aspect])
class Bottom1Aspect extends Middle1Aspect{
	
	public def String callParentLevel1Aspects(){
		return _self.doMiddle1Aspect + _self.doMiddle2Aspect
	}
	public def String callParentLevel2Aspects(){
		return _self.doTop1Aspect + _self.doTop2Aspect + _self.doTop3Aspect + _self.doTop4Aspect
	}
}

//@Aspect(className=Bottom2)
//class Bottom2Aspect extends Middle1Aspect{
//}
