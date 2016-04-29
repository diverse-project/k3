package test.parentonlyaspects.aspects 

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import test.parentonlyaspects.base.Top1
import test.parentonlyaspects.base.Top2
import test.parentonlyaspects.base.Top3
import test.parentonlyaspects.base.Top4
import test.parentonlyaspects.base.Middle1
import test.parentonlyaspects.base.Middle2
import test.parentonlyaspects.base.Bottom1


//import static extension test.parentonlyaspects.aspects.Middle1Aspect.*
//import static extension test.parentonlyaspects.aspects.Middle2Aspect.*

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
