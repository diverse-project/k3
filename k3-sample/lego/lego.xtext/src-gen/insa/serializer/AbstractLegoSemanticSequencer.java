package insa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import insa.services.LegoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import robot.FlotCtrl.AndExp;
import robot.FlotCtrl.FlotCtrlPackage;
import robot.FlotCtrl.IfBlock;
import robot.FlotCtrl.NegExp;
import robot.FlotCtrl.WhileLoop;
import robot.robot.Bip;
import robot.robot.HasTurnedCmd;
import robot.robot.MoveCmd;
import robot.robot.ObstacleCmd;
import robot.robot.PrintCmd;
import robot.robot.ProgramUnit;
import robot.robot.RobotPackage;
import robot.robot.SetTurnAngleCmd;
import robot.robot.StopEngineCmd;
import robot.robot.StopProgramCmd;
import robot.robot.TurnCmd;

@SuppressWarnings("all")
public abstract class AbstractLegoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LegoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FlotCtrlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FlotCtrlPackage.AND_EXP:
				if(context == grammarAccess.getAndExpRule() ||
				   context == grammarAccess.getBoolExpRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_AndExp(context, (AndExp) semanticObject); 
					return; 
				}
				else break;
			case FlotCtrlPackage.IF_BLOCK:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfBlockRule()) {
					sequence_IfBlock(context, (IfBlock) semanticObject); 
					return; 
				}
				else break;
			case FlotCtrlPackage.NEG_EXP:
				if(context == grammarAccess.getBoolExpRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNegExpRule()) {
					sequence_NegExp(context, (NegExp) semanticObject); 
					return; 
				}
				else break;
			case FlotCtrlPackage.WHILE_LOOP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getWhileLoopRule()) {
					sequence_WhileLoop(context, (WhileLoop) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == RobotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RobotPackage.BIP:
				if(context == grammarAccess.getBipRule()) {
					sequence_Bip(context, (Bip) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.HAS_TURNED_CMD:
				if(context == grammarAccess.getBoolExpRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getHasTurnedCmdRule()) {
					sequence_HasTurnedCmd(context, (HasTurnedCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.MOVE_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMoveCmdRule()) {
					sequence_MoveCmd(context, (MoveCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.OBSTACLE_CMD:
				if(context == grammarAccess.getBoolExpRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getObstacleCmdRule()) {
					sequence_ObstacleCmd(context, (ObstacleCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.PRINT_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getPrintCmdRule()) {
					sequence_PrintCmd(context, (PrintCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.PROGRAM_UNIT:
				if(context == grammarAccess.getProgramUnitRule()) {
					sequence_ProgramUnit(context, (ProgramUnit) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.SET_TURN_ANGLE_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSetTurnAngleCmdRule()) {
					sequence_SetTurnAngleCmd(context, (SetTurnAngleCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.STOP_ENGINE_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStopEngineCmdRule()) {
					sequence_StopEngineCmd(context, (StopEngineCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.STOP_PROGRAM_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStopProgramCmdRule()) {
					sequence_StopProgramCmd(context, (StopProgramCmd) semanticObject); 
					return; 
				}
				else break;
			case RobotPackage.TURN_CMD:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTurnCmdRule()) {
					sequence_TurnCmd(context, (TurnCmd) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftExp=BoolExp rightExp=BoolExp)
	 */
	protected void sequence_AndExp(EObject context, AndExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlotCtrlPackage.Literals.AND_EXP__LEFT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlotCtrlPackage.Literals.AND_EXP__LEFT_EXP));
			if(transientValues.isValueTransient(semanticObject, FlotCtrlPackage.Literals.AND_EXP__RIGHT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlotCtrlPackage.Literals.AND_EXP__RIGHT_EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExpAccess().getLeftExpBoolExpParserRuleCall_1_0(), semanticObject.getLeftExp());
		feeder.accept(grammarAccess.getAndExpAccess().getRightExpBoolExpParserRuleCall_2_0(), semanticObject.getRightExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (duration=INT power=DOUBLE repet=BOOLEAN_LITERAL)
	 */
	protected void sequence_Bip(EObject context, Bip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.BIP__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.BIP__DURATION));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.BIP__POWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.BIP__POWER));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.BIP__REPET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.BIP__REPET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBipAccess().getDurationINTTerminalRuleCall_4_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getBipAccess().getPowerDOUBLETerminalRuleCall_8_0(), semanticObject.getPower());
		feeder.accept(grammarAccess.getBipAccess().getRepetBOOLEAN_LITERALParserRuleCall_12_0(), semanticObject.getRepet());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     angle=DOUBLE
	 */
	protected void sequence_HasTurnedCmd(EObject context, HasTurnedCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.HAS_TURNED_CMD__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.HAS_TURNED_CMD__ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHasTurnedCmdAccess().getAngleDOUBLETerminalRuleCall_4_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=BoolExp thenBlock+=Expression* elseBlock+=Expression*)
	 */
	protected void sequence_IfBlock(EObject context, IfBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     power=DOUBLE
	 */
	protected void sequence_MoveCmd(EObject context, MoveCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.MOVE_CMD__POWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.MOVE_CMD__POWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoveCmdAccess().getPowerDOUBLETerminalRuleCall_4_0(), semanticObject.getPower());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=BoolExp
	 */
	protected void sequence_NegExp(EObject context, NegExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlotCtrlPackage.Literals.NEG_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlotCtrlPackage.Literals.NEG_EXP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegExpAccess().getExpBoolExpParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_ObstacleCmd(EObject context, ObstacleCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.OBSTACLE_CMD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.OBSTACLE_CMD__DISTANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObstacleCmdAccess().getDistanceDOUBLETerminalRuleCall_4_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (msg=STRING duration=INT line=INT col=INT)
	 */
	protected void sequence_PrintCmd(EObject context, PrintCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.PRINT_CMD__MSG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.PRINT_CMD__MSG));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.PRINT_CMD__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.PRINT_CMD__DURATION));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.PRINT_CMD__LINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.PRINT_CMD__LINE));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.PRINT_CMD__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.PRINT_CMD__COL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrintCmdAccess().getMsgSTRINGTerminalRuleCall_4_0(), semanticObject.getMsg());
		feeder.accept(grammarAccess.getPrintCmdAccess().getDurationINTTerminalRuleCall_8_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getPrintCmdAccess().getLineINTTerminalRuleCall_12_0(), semanticObject.getLine());
		feeder.accept(grammarAccess.getPrintCmdAccess().getColINTTerminalRuleCall_16_0(), semanticObject.getCol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block+=Expression*
	 */
	protected void sequence_ProgramUnit(EObject context, ProgramUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     angle=DOUBLE
	 */
	protected void sequence_SetTurnAngleCmd(EObject context, SetTurnAngleCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.SET_TURN_ANGLE_CMD__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.SET_TURN_ANGLE_CMD__ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetTurnAngleCmdAccess().getAngleDOUBLETerminalRuleCall_4_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {StopEngineCmd}
	 */
	protected void sequence_StopEngineCmd(EObject context, StopEngineCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StopProgramCmd}
	 */
	protected void sequence_StopProgramCmd(EObject context, StopProgramCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (power=DOUBLE angle=DOUBLE)
	 */
	protected void sequence_TurnCmd(EObject context, TurnCmd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.TURN_CMD__POWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.TURN_CMD__POWER));
			if(transientValues.isValueTransient(semanticObject, RobotPackage.Literals.TURN_CMD__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotPackage.Literals.TURN_CMD__ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTurnCmdAccess().getPowerDOUBLETerminalRuleCall_4_0(), semanticObject.getPower());
		feeder.accept(grammarAccess.getTurnCmdAccess().getAngleDOUBLETerminalRuleCall_8_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (loopCond=BoolExp block+=Expression*)
	 */
	protected void sequence_WhileLoop(EObject context, WhileLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
