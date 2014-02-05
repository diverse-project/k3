/**
 */
package robot.robot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.robot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotFactoryImpl extends EFactoryImpl implements RobotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotFactory init() {
		try {
			RobotFactory theRobotFactory = (RobotFactory)EPackage.Registry.INSTANCE.getEFactory(RobotPackage.eNS_URI);
			if (theRobotFactory != null) {
				return theRobotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotPackage.MOVE_CMD: return createMoveCmd();
			case RobotPackage.OBSTACLE_CMD: return createObstacleCmd();
			case RobotPackage.BIP: return createBip();
			case RobotPackage.SET_TURN_ANGLE_CMD: return createSetTurnAngleCmd();
			case RobotPackage.HAS_TURNED_CMD: return createHasTurnedCmd();
			case RobotPackage.TURN_CMD: return createTurnCmd();
			case RobotPackage.STOP_ENGINE_CMD: return createStopEngineCmd();
			case RobotPackage.STOP_PROGRAM_CMD: return createStopProgramCmd();
			case RobotPackage.PRINT_CMD: return createPrintCmd();
			case RobotPackage.PROGRAM_UNIT: return createProgramUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveCmd createMoveCmd() {
		MoveCmdImpl moveCmd = new MoveCmdImpl();
		return moveCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstacleCmd createObstacleCmd() {
		ObstacleCmdImpl obstacleCmd = new ObstacleCmdImpl();
		return obstacleCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bip createBip() {
		BipImpl bip = new BipImpl();
		return bip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTurnAngleCmd createSetTurnAngleCmd() {
		SetTurnAngleCmdImpl setTurnAngleCmd = new SetTurnAngleCmdImpl();
		return setTurnAngleCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasTurnedCmd createHasTurnedCmd() {
		HasTurnedCmdImpl hasTurnedCmd = new HasTurnedCmdImpl();
		return hasTurnedCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnCmd createTurnCmd() {
		TurnCmdImpl turnCmd = new TurnCmdImpl();
		return turnCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopEngineCmd createStopEngineCmd() {
		StopEngineCmdImpl stopEngineCmd = new StopEngineCmdImpl();
		return stopEngineCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopProgramCmd createStopProgramCmd() {
		StopProgramCmdImpl stopProgramCmd = new StopProgramCmdImpl();
		return stopProgramCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintCmd createPrintCmd() {
		PrintCmdImpl printCmd = new PrintCmdImpl();
		return printCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramUnit createProgramUnit() {
		ProgramUnitImpl programUnit = new ProgramUnitImpl();
		return programUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotPackage getRobotPackage() {
		return (RobotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotPackage getPackage() {
		return RobotPackage.eINSTANCE;
	}

} //RobotFactoryImpl
