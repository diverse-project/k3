package lego

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import robot.FlotCtrl.AndExp
import robot.FlotCtrl.Expression
import robot.FlotCtrl.IfBlock
import robot.FlotCtrl.NegExp
import robot.robot.ProgramUnit
import robot.FlotCtrl.WhileLoop
import robot.robot.Bip
import robot.robot.HasTurnedCmd
import robot.robot.MoveCmd
import robot.robot.ObstacleCmd
import robot.robot.PrintCmd
import robot.robot.SetTurnAngleCmd
import robot.robot.StopEngineCmd
import robot.robot.StopProgramCmd
import robot.robot.TurnCmd

//	aspect class ObstacleCmd {
//		inv ObstacleDistanceGreaterThanZero is do
//			distance>=0
//		end
//	}
//	
//	aspect class PrintCmd {
//		inv PrintLineMustBeGreaterOrEqualThanZero is do
//			line>=0
//		end
//		inv PrintColMustBeGreaterOrEqualThanZero is do
//			col>=0
//		end
//		inv PrintDurationMustBeGreaterThanZero is do
//			duration>0
//		end
//	}

class ContextNCX {
	@Property val StringBuilder header = new StringBuilder
	@Property var boolean initUSCreated = false
	@Property var boolean angleVarCreated = false
}

@Aspect(className=typeof(Object))
abstract class NXCCodeGenerator {
	def StringBuilder generateCode(ContextNCX ctx)
}


@Aspect(className=typeof(Expression))
abstract class ExpressionAspect extends NXCCodeGenerator{}


@Aspect(className=typeof(MoveCmd))
class MoveCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("OnFwdSync(OUT_BC, ").append(_self.power.intValue).append(", 0);\n")		
	}
}


@Aspect(className=typeof(ProgramUnit))
class ProgramUnitAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		ctx.header.append("#include \"NXCDefs.h\"\n\ntask main(){\n")
		new StringBuilder("while(1){\n").append(_self.block.map[generateCode(ctx)].join).append("}\n}\n")
	}
}


@Aspect(className=typeof(ObstacleCmd))
class ObstacleCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		if(!ctx.initUSCreated) {
			ctx.initUSCreated = true
			ctx.header.append("SetSensorLowspeed(S4);\n")
		}
		code.append("SensorUS(S4)<").append(_self.distance.intValue)
	}
}


@Aspect(className=typeof(Bip))
class BipAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("PlayToneEx(100, ").append(_self.duration).append(", ").
			append(_self.power.intValue).append(", ").append(_self.repet).append(");\n")
	}
}


@Aspect(className=typeof(SetTurnAngleCmd))
class SetTurnAngleCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		if(!ctx.angleVarCreated) {
			ctx.angleVarCreated = true
			ctx.header.append("int angle;\n")
		}
		code.append("angle=").append(_self.angle.intValue).append(";\n")
	}
}


@Aspect(className=typeof(HasTurnedCmd))
class HasTurnedCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		if(!ctx.angleVarCreated) {
			ctx.angleVarCreated = true
			ctx.header.append("int angle=0;\n")
		}
		code.append("angle>=360")
	}
}

@Aspect(className=typeof(TurnCmd))
class TurnCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		if(!ctx.angleVarCreated){
			ctx.angleVarCreated = true
			ctx.header.append("int angle=0;\n")
		}
		code.append("OnFwdSync(OUT_B, ").append(_self.power.intValue).append(", ").append((_self.angle*-33).intValue).append(");\n").
			append("angle += ").append(_self.angle.intValue).append(";\n").append("Wait(20);\n")
	}
}


@Aspect(className=typeof(StopEngineCmd))
class StopEngineCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("Off(OUT_BC);\n")
	}
}


@Aspect(className=typeof(StopProgramCmd))
class StopProgramCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("Stop(true);\n")
	}
}


@Aspect(className=typeof(PrintCmd))
class PrintCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("TextOut(").append(_self.col).append(", ").append("LCD_LINE").append(_self.line).append(", \"").
			append(_self.msg).append("\");\nWait(").append(_self.duration).append(");\n")
	}
}


@Aspect(className=typeof(WhileLoop))
class WhileLoopAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("while(").append(_self.loopCond.generateCode(ctx)).append(") {\n").
			append(_self.block.map[generateCode(ctx)].join).append("}\n")
	}
}


@Aspect(className=typeof(NegExp))
class NegExpAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		new StringBuilder("!(").append(_self.exp.generateCode(ctx)).append(')')
	}
}


@Aspect(className=typeof(AndExp))
class AndExpAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		 new StringBuilder(_self.leftExp.generateCode(ctx)).append(" && ").append(_self.rightExp.generateCode(ctx))
	}
}


@Aspect(className=typeof(IfBlock))
class IfBlockAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder("if(").append(_self.condition.generateCode(ctx)).append(") {\n").
			append(_self.thenBlock.map[generateCode(ctx)].join).append("}\n")
		if(_self.elseBlock!=null)
			code.append("else {\n").append(_self.elseBlock.map[generateCode(ctx)].join).append("}\n")
		code
	}
}
