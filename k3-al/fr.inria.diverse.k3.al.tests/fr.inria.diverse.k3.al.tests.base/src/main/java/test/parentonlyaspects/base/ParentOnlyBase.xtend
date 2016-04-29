package test.parentonlyaspects.base 

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
