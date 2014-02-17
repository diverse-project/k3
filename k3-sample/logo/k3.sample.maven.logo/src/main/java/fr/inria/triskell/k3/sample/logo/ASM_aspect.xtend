package fr.inria.triskell.k3.sample.logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import kmLogo.ASM.Back
import kmLogo.ASM.Block
import kmLogo.ASM.Clear
import kmLogo.ASM.Constant
import kmLogo.ASM.Div
import kmLogo.ASM.Equals
import kmLogo.ASM.Expression
import kmLogo.ASM.Forward
import kmLogo.ASM.Greater
import kmLogo.ASM.If
import kmLogo.ASM.Instruction
import kmLogo.ASM.Left
import kmLogo.ASM.LogoProgram
import kmLogo.ASM.Lower
import kmLogo.ASM.Minus
import kmLogo.ASM.Mult
import kmLogo.ASM.Parameter
import kmLogo.ASM.ParameterCall
import kmLogo.ASM.PenDown
import kmLogo.ASM.PenUp
import kmLogo.ASM.Plus
import kmLogo.ASM.Primitive
import kmLogo.ASM.ProcCall
import kmLogo.ASM.Repeat
import kmLogo.ASM.Right
import kmLogo.ASM.While
import kmLogo.ASM.ControlStructure
import kmLogo.ASM.BinaryExp

import static extension fr.inria.triskell.k3.sample.logo.InstructionAspect.*
import static extension fr.inria.triskell.k3.sample.logo.BackAspect.*
import static extension fr.inria.triskell.k3.sample.logo.BlockAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ClearAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ConstantAspect.*
import static extension fr.inria.triskell.k3.sample.logo.DivAspect.*
import static extension fr.inria.triskell.k3.sample.logo.EqualsAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ExpressionAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ForwardAspect.*
import static extension fr.inria.triskell.k3.sample.logo.GreaterAspect.*
import static extension fr.inria.triskell.k3.sample.logo.IfAspect.*
import static extension fr.inria.triskell.k3.sample.logo.InstructionAspect.*
import static extension fr.inria.triskell.k3.sample.logo.LeftAspect.*
import static extension fr.inria.triskell.k3.sample.logo.LogoProgramAspect.*
import static extension fr.inria.triskell.k3.sample.logo.LowerAspect.*
import static extension fr.inria.triskell.k3.sample.logo.MinusAspect.*
import static extension fr.inria.triskell.k3.sample.logo.MultAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ParameterAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ParameterCallAspect.*
import static extension fr.inria.triskell.k3.sample.logo.PenDownAspect.*
import static extension fr.inria.triskell.k3.sample.logo.PenUpAspect.*
import static extension fr.inria.triskell.k3.sample.logo.PlusAspect.*
import static extension fr.inria.triskell.k3.sample.logo.PrimitiveAspect.*
import static extension fr.inria.triskell.k3.sample.logo.ProcCallAspect.*
import static extension fr.inria.triskell.k3.sample.logo.RepeatAspect.*
import static extension fr.inria.triskell.k3.sample.logo.RightAspect.*
import static extension fr.inria.triskell.k3.sample.logo.WhileAspect.*
import  static extension fr.inria.triskell.k3.sample.logo.ControlStructureAspect.*
import  static extension fr.inria.triskell.k3.sample.logo.BinaryExpAspect.*

@Aspect(className=typeof(Instruction)) 
class InstructionAspect {

	def public int eval (Context context ) {
		return 0
	}  

}

@Aspect(className=typeof(Primitive)) 
public class PrimitiveAspect extends InstructionAspect{  

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}

} 

@Aspect(className=typeof(Back))
public class BackAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = -1*  _self.steps.eval(context)
		println("BACK "+ param)
		context.turtle.forward(param)
		return 0
	}

}

@Aspect(className=typeof(Forward))
public class ForwardAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.steps.eval(context)
		println("FORWARD " + param)
		context.turtle.forward(param)
		return 0
	}

}
 
@Aspect(className=typeof(Left))
public class LeftAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = (-1)  *_self.angle.eval(context)
		println("LEFT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=typeof(Right))
public class RightAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.angle.eval(context)
		println("RIGHT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=typeof(PenDown))
public class PenDownAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENDOWN")
		context.turtle.setPenUp(false)
		return 0
	}

}

@Aspect(className=typeof(PenUp))
public class PenUpAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENUP")
		context.turtle.setPenUp(true)
		return 0
	}

}

@Aspect(className=typeof(Clear))
public class ClearAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Context context) {
		println("CLEAR")
		context.turtle.reset
		return 0
	}

}

@Aspect(className=typeof(Expression))
public class ExpressionAspect extends InstructionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0 
	}

}

@Aspect(className=typeof(Constant))
public class ConstantAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.integerValue
	}

}

@Aspect(className=typeof(ProcCall))
public class ProcCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("Calling of : " + _self.declaration.name)
		var Hashtable<String,Integer> params = new Hashtable<String,Integer>()
		
		var int i = 0
		for (Expression exp : _self.actualArgs){
			var int currentArg = exp.eval(context)
			params.put(_self.declaration.args.get(i).name,currentArg)
			i= i+1
		}
		
		context.push(params)
		
		 _self.res = 0
		_self.declaration.instructions.forEach[instr | _self.res = instr.eval(context)]
		
		context.pop
		return _self.res
	}

	 int res = 0
}

@Aspect(className=typeof(Block))
public class BlockAspect extends ExpressionAspect{

	int res = 0
	@OverrideAspectMethod
	def int eval (Context context) {
		_self.instructions.forEach[instruction | _self.res = instruction.eval(context)]
		return _self.res
	}
	
}

@Aspect(className=typeof(ControlStructure))
public class ControlStructureAspect extends InstructionAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=typeof(If))
public class IfAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if (_self.condition.eval(context) != 0) {
			return _self.thenPart.eval(context)
		}
		else{
			return _self.elsePart.eval(context)
		}
	}

}

@Aspect(className=typeof(Repeat))
public class RepeatAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int time =  _self.condition.eval(context)
		while( time > 0){
			_self.block.eval(context)
			time = time - 1
		}
		return 0
	}

}

@Aspect(className=typeof(While))
public class WhileAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		while(_self.condition.eval(context) > 0){
			_self.block.eval(context)
		}
		return 0
	}

}

@Aspect(className=typeof(Parameter))
public class ParameterAspect {

	def int eval (Context context) {
		return context.peek.get(_self.name)
	}

}

@Aspect(className=typeof(ParameterCall))
public class ParameterCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.parameter.eval(context)
	}

}

@Aspect(className=typeof(BinaryExp))
public class BinaryExpAspect extends ExpressionAspect{
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=typeof(Plus))
public class PlusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) + _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Minus))
public class MinusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) - _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Mult))
public class MultAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) * _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Div))
public class DivAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.rhs.eval(context) != 0) {
			return _self.lhs.eval(context) / _self.rhs.eval(context)
		}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Equals))
public class EqualsAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) == _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Greater))
public class GreaterAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) > _self.rhs.eval(context)) {
			return 1
		}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Lower))
public class LowerAspect extends BinaryExpAspect{

	def int eval (Context context) {
		if(_self.lhs.eval(context) < _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(LogoProgram))
public class LogoProgramAspect {

	def int eval (Context context) {
		println("LogoProgram eval !")
		_self.instructions.forEach[instr  | instr.eval(context)]
		return 0
	}

}

