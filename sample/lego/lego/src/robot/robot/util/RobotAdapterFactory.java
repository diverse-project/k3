/**
 */
package robot.robot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robot.FlotCtrl.BoolExp;
import robot.FlotCtrl.Expression;

import robot.robot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robot.robot.RobotPackage
 * @generated
 */
public class RobotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotSwitch<Adapter> modelSwitch =
		new RobotSwitch<Adapter>() {
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseMoveCmd(MoveCmd object) {
				return createMoveCmdAdapter();
			}
			@Override
			public Adapter caseObstacleCmd(ObstacleCmd object) {
				return createObstacleCmdAdapter();
			}
			@Override
			public Adapter caseBip(Bip object) {
				return createBipAdapter();
			}
			@Override
			public Adapter caseSetTurnAngleCmd(SetTurnAngleCmd object) {
				return createSetTurnAngleCmdAdapter();
			}
			@Override
			public Adapter caseHasTurnedCmd(HasTurnedCmd object) {
				return createHasTurnedCmdAdapter();
			}
			@Override
			public Adapter caseTurnCmd(TurnCmd object) {
				return createTurnCmdAdapter();
			}
			@Override
			public Adapter caseStopEngineCmd(StopEngineCmd object) {
				return createStopEngineCmdAdapter();
			}
			@Override
			public Adapter caseStopProgramCmd(StopProgramCmd object) {
				return createStopProgramCmdAdapter();
			}
			@Override
			public Adapter casePrintCmd(PrintCmd object) {
				return createPrintCmdAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBoolExp(BoolExp object) {
				return createBoolExpAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.MoveCmd <em>Move Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.MoveCmd
	 * @generated
	 */
	public Adapter createMoveCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.ObstacleCmd <em>Obstacle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.ObstacleCmd
	 * @generated
	 */
	public Adapter createObstacleCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.Bip <em>Bip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.Bip
	 * @generated
	 */
	public Adapter createBipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.SetTurnAngleCmd <em>Set Turn Angle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.SetTurnAngleCmd
	 * @generated
	 */
	public Adapter createSetTurnAngleCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.HasTurnedCmd <em>Has Turned Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.HasTurnedCmd
	 * @generated
	 */
	public Adapter createHasTurnedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.TurnCmd <em>Turn Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.TurnCmd
	 * @generated
	 */
	public Adapter createTurnCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.StopEngineCmd <em>Stop Engine Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.StopEngineCmd
	 * @generated
	 */
	public Adapter createStopEngineCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.StopProgramCmd <em>Stop Program Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.StopProgramCmd
	 * @generated
	 */
	public Adapter createStopProgramCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.robot.PrintCmd <em>Print Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.robot.PrintCmd
	 * @generated
	 */
	public Adapter createPrintCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.FlotCtrl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.FlotCtrl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.FlotCtrl.BoolExp <em>Bool Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.FlotCtrl.BoolExp
	 * @generated
	 */
	public Adapter createBoolExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotAdapterFactory
