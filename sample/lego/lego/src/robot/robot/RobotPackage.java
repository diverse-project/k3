/**
 */
package robot.robot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import robot.FlotCtrl.FlotCtrlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.robot.RobotFactory
 * @model kind="package"
 * @generated
 */
public interface RobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://TPIDMINSA/robot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot.robot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotPackage eINSTANCE = robot.robot.impl.RobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.robot.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.Command
	 * @see robot.robot.impl.RobotPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = FlotCtrlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = FlotCtrlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.MoveCmdImpl <em>Move Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.MoveCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getMoveCmd()
	 * @generated
	 */
	int MOVE_CMD = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD__POWER = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.ObstacleCmdImpl <em>Obstacle Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.ObstacleCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getObstacleCmd()
	 * @generated
	 */
	int OBSTACLE_CMD = 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD__DISTANCE = FlotCtrlPackage.BOOL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obstacle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD_FEATURE_COUNT = FlotCtrlPackage.BOOL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obstacle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_CMD_OPERATION_COUNT = FlotCtrlPackage.BOOL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.BipImpl <em>Bip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.BipImpl
	 * @see robot.robot.impl.RobotPackageImpl#getBip()
	 * @generated
	 */
	int BIP = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP__DURATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP__POWER = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP__REPET = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIP_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.SetTurnAngleCmdImpl <em>Set Turn Angle Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.SetTurnAngleCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getSetTurnAngleCmd()
	 * @generated
	 */
	int SET_TURN_ANGLE_CMD = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD__ANGLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Turn Angle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Turn Angle Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TURN_ANGLE_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.HasTurnedCmdImpl <em>Has Turned Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.HasTurnedCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getHasTurnedCmd()
	 * @generated
	 */
	int HAS_TURNED_CMD = 5;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD__ANGLE = FlotCtrlPackage.BOOL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Turned Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD_FEATURE_COUNT = FlotCtrlPackage.BOOL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Has Turned Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_TURNED_CMD_OPERATION_COUNT = FlotCtrlPackage.BOOL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.TurnCmdImpl <em>Turn Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.TurnCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getTurnCmd()
	 * @generated
	 */
	int TURN_CMD = 6;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD__POWER = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD__ANGLE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turn Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turn Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.StopEngineCmdImpl <em>Stop Engine Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.StopEngineCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getStopEngineCmd()
	 * @generated
	 */
	int STOP_ENGINE_CMD = 7;

	/**
	 * The number of structural features of the '<em>Stop Engine Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ENGINE_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Engine Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ENGINE_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.StopProgramCmdImpl <em>Stop Program Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.StopProgramCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getStopProgramCmd()
	 * @generated
	 */
	int STOP_PROGRAM_CMD = 8;

	/**
	 * The number of structural features of the '<em>Stop Program Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PROGRAM_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Program Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PROGRAM_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.robot.impl.PrintCmdImpl <em>Print Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.robot.impl.PrintCmdImpl
	 * @see robot.robot.impl.RobotPackageImpl#getPrintCmd()
	 * @generated
	 */
	int PRINT_CMD = 9;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD__MSG = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD__DURATION = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD__LINE = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD__COL = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Print Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Print Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robot.robot.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see robot.robot.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link robot.robot.MoveCmd <em>Move Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Cmd</em>'.
	 * @see robot.robot.MoveCmd
	 * @generated
	 */
	EClass getMoveCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.MoveCmd#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.robot.MoveCmd#getPower()
	 * @see #getMoveCmd()
	 * @generated
	 */
	EAttribute getMoveCmd_Power();

	/**
	 * Returns the meta object for class '{@link robot.robot.ObstacleCmd <em>Obstacle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle Cmd</em>'.
	 * @see robot.robot.ObstacleCmd
	 * @generated
	 */
	EClass getObstacleCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.ObstacleCmd#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see robot.robot.ObstacleCmd#getDistance()
	 * @see #getObstacleCmd()
	 * @generated
	 */
	EAttribute getObstacleCmd_Distance();

	/**
	 * Returns the meta object for class '{@link robot.robot.Bip <em>Bip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bip</em>'.
	 * @see robot.robot.Bip
	 * @generated
	 */
	EClass getBip();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.Bip#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see robot.robot.Bip#getDuration()
	 * @see #getBip()
	 * @generated
	 */
	EAttribute getBip_Duration();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.Bip#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.robot.Bip#getPower()
	 * @see #getBip()
	 * @generated
	 */
	EAttribute getBip_Power();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.Bip#getRepet <em>Repet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repet</em>'.
	 * @see robot.robot.Bip#getRepet()
	 * @see #getBip()
	 * @generated
	 */
	EAttribute getBip_Repet();

	/**
	 * Returns the meta object for class '{@link robot.robot.SetTurnAngleCmd <em>Set Turn Angle Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Turn Angle Cmd</em>'.
	 * @see robot.robot.SetTurnAngleCmd
	 * @generated
	 */
	EClass getSetTurnAngleCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.SetTurnAngleCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.robot.SetTurnAngleCmd#getAngle()
	 * @see #getSetTurnAngleCmd()
	 * @generated
	 */
	EAttribute getSetTurnAngleCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.robot.HasTurnedCmd <em>Has Turned Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Turned Cmd</em>'.
	 * @see robot.robot.HasTurnedCmd
	 * @generated
	 */
	EClass getHasTurnedCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.HasTurnedCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.robot.HasTurnedCmd#getAngle()
	 * @see #getHasTurnedCmd()
	 * @generated
	 */
	EAttribute getHasTurnedCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.robot.TurnCmd <em>Turn Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Cmd</em>'.
	 * @see robot.robot.TurnCmd
	 * @generated
	 */
	EClass getTurnCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.TurnCmd#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see robot.robot.TurnCmd#getPower()
	 * @see #getTurnCmd()
	 * @generated
	 */
	EAttribute getTurnCmd_Power();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.TurnCmd#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robot.robot.TurnCmd#getAngle()
	 * @see #getTurnCmd()
	 * @generated
	 */
	EAttribute getTurnCmd_Angle();

	/**
	 * Returns the meta object for class '{@link robot.robot.StopEngineCmd <em>Stop Engine Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Engine Cmd</em>'.
	 * @see robot.robot.StopEngineCmd
	 * @generated
	 */
	EClass getStopEngineCmd();

	/**
	 * Returns the meta object for class '{@link robot.robot.StopProgramCmd <em>Stop Program Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Program Cmd</em>'.
	 * @see robot.robot.StopProgramCmd
	 * @generated
	 */
	EClass getStopProgramCmd();

	/**
	 * Returns the meta object for class '{@link robot.robot.PrintCmd <em>Print Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Cmd</em>'.
	 * @see robot.robot.PrintCmd
	 * @generated
	 */
	EClass getPrintCmd();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.PrintCmd#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see robot.robot.PrintCmd#getMsg()
	 * @see #getPrintCmd()
	 * @generated
	 */
	EAttribute getPrintCmd_Msg();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.PrintCmd#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see robot.robot.PrintCmd#getDuration()
	 * @see #getPrintCmd()
	 * @generated
	 */
	EAttribute getPrintCmd_Duration();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.PrintCmd#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see robot.robot.PrintCmd#getLine()
	 * @see #getPrintCmd()
	 * @generated
	 */
	EAttribute getPrintCmd_Line();

	/**
	 * Returns the meta object for the attribute '{@link robot.robot.PrintCmd#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see robot.robot.PrintCmd#getCol()
	 * @see #getPrintCmd()
	 * @generated
	 */
	EAttribute getPrintCmd_Col();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotFactory getRobotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.robot.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.Command
		 * @see robot.robot.impl.RobotPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.MoveCmdImpl <em>Move Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.MoveCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getMoveCmd()
		 * @generated
		 */
		EClass MOVE_CMD = eINSTANCE.getMoveCmd();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_CMD__POWER = eINSTANCE.getMoveCmd_Power();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.ObstacleCmdImpl <em>Obstacle Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.ObstacleCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getObstacleCmd()
		 * @generated
		 */
		EClass OBSTACLE_CMD = eINSTANCE.getObstacleCmd();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE_CMD__DISTANCE = eINSTANCE.getObstacleCmd_Distance();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.BipImpl <em>Bip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.BipImpl
		 * @see robot.robot.impl.RobotPackageImpl#getBip()
		 * @generated
		 */
		EClass BIP = eINSTANCE.getBip();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP__DURATION = eINSTANCE.getBip_Duration();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP__POWER = eINSTANCE.getBip_Power();

		/**
		 * The meta object literal for the '<em><b>Repet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIP__REPET = eINSTANCE.getBip_Repet();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.SetTurnAngleCmdImpl <em>Set Turn Angle Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.SetTurnAngleCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getSetTurnAngleCmd()
		 * @generated
		 */
		EClass SET_TURN_ANGLE_CMD = eINSTANCE.getSetTurnAngleCmd();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TURN_ANGLE_CMD__ANGLE = eINSTANCE.getSetTurnAngleCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.HasTurnedCmdImpl <em>Has Turned Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.HasTurnedCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getHasTurnedCmd()
		 * @generated
		 */
		EClass HAS_TURNED_CMD = eINSTANCE.getHasTurnedCmd();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_TURNED_CMD__ANGLE = eINSTANCE.getHasTurnedCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.TurnCmdImpl <em>Turn Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.TurnCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getTurnCmd()
		 * @generated
		 */
		EClass TURN_CMD = eINSTANCE.getTurnCmd();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_CMD__POWER = eINSTANCE.getTurnCmd_Power();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_CMD__ANGLE = eINSTANCE.getTurnCmd_Angle();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.StopEngineCmdImpl <em>Stop Engine Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.StopEngineCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getStopEngineCmd()
		 * @generated
		 */
		EClass STOP_ENGINE_CMD = eINSTANCE.getStopEngineCmd();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.StopProgramCmdImpl <em>Stop Program Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.StopProgramCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getStopProgramCmd()
		 * @generated
		 */
		EClass STOP_PROGRAM_CMD = eINSTANCE.getStopProgramCmd();

		/**
		 * The meta object literal for the '{@link robot.robot.impl.PrintCmdImpl <em>Print Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.robot.impl.PrintCmdImpl
		 * @see robot.robot.impl.RobotPackageImpl#getPrintCmd()
		 * @generated
		 */
		EClass PRINT_CMD = eINSTANCE.getPrintCmd();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_CMD__MSG = eINSTANCE.getPrintCmd_Msg();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_CMD__DURATION = eINSTANCE.getPrintCmd_Duration();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_CMD__LINE = eINSTANCE.getPrintCmd_Line();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_CMD__COL = eINSTANCE.getPrintCmd_Col();

	}

} //RobotPackage
