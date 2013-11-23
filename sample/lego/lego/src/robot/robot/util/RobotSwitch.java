/**
 */
package robot.robot.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robot.FlotCtrl.BoolExp;
import robot.FlotCtrl.Expression;

import robot.robot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robot.robot.RobotPackage
 * @generated
 */
public class RobotSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotSwitch() {
		if (modelPackage == null) {
			modelPackage = RobotPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RobotPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = caseExpression(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.MOVE_CMD: {
				MoveCmd moveCmd = (MoveCmd)theEObject;
				T result = caseMoveCmd(moveCmd);
				if (result == null) result = caseCommand(moveCmd);
				if (result == null) result = caseExpression(moveCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.OBSTACLE_CMD: {
				ObstacleCmd obstacleCmd = (ObstacleCmd)theEObject;
				T result = caseObstacleCmd(obstacleCmd);
				if (result == null) result = caseBoolExp(obstacleCmd);
				if (result == null) result = caseCommand(obstacleCmd);
				if (result == null) result = caseExpression(obstacleCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.BIP: {
				Bip bip = (Bip)theEObject;
				T result = caseBip(bip);
				if (result == null) result = caseCommand(bip);
				if (result == null) result = caseExpression(bip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.SET_TURN_ANGLE_CMD: {
				SetTurnAngleCmd setTurnAngleCmd = (SetTurnAngleCmd)theEObject;
				T result = caseSetTurnAngleCmd(setTurnAngleCmd);
				if (result == null) result = caseCommand(setTurnAngleCmd);
				if (result == null) result = caseExpression(setTurnAngleCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.HAS_TURNED_CMD: {
				HasTurnedCmd hasTurnedCmd = (HasTurnedCmd)theEObject;
				T result = caseHasTurnedCmd(hasTurnedCmd);
				if (result == null) result = caseBoolExp(hasTurnedCmd);
				if (result == null) result = caseCommand(hasTurnedCmd);
				if (result == null) result = caseExpression(hasTurnedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.TURN_CMD: {
				TurnCmd turnCmd = (TurnCmd)theEObject;
				T result = caseTurnCmd(turnCmd);
				if (result == null) result = caseCommand(turnCmd);
				if (result == null) result = caseExpression(turnCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.STOP_ENGINE_CMD: {
				StopEngineCmd stopEngineCmd = (StopEngineCmd)theEObject;
				T result = caseStopEngineCmd(stopEngineCmd);
				if (result == null) result = caseCommand(stopEngineCmd);
				if (result == null) result = caseExpression(stopEngineCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.STOP_PROGRAM_CMD: {
				StopProgramCmd stopProgramCmd = (StopProgramCmd)theEObject;
				T result = caseStopProgramCmd(stopProgramCmd);
				if (result == null) result = caseCommand(stopProgramCmd);
				if (result == null) result = caseExpression(stopProgramCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RobotPackage.PRINT_CMD: {
				PrintCmd printCmd = (PrintCmd)theEObject;
				T result = casePrintCmd(printCmd);
				if (result == null) result = caseCommand(printCmd);
				if (result == null) result = caseExpression(printCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveCmd(MoveCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacleCmd(ObstacleCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBip(Bip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Turn Angle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Turn Angle Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTurnAngleCmd(SetTurnAngleCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Turned Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Turned Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasTurnedCmd(HasTurnedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnCmd(TurnCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Engine Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Engine Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopEngineCmd(StopEngineCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Program Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Program Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopProgramCmd(StopProgramCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintCmd(PrintCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolExp(BoolExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobotSwitch
