/**
 */
package robot.robot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robot.robot.RobotPackage
 * @generated
 */
public interface RobotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotFactory eINSTANCE = robot.robot.impl.RobotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Move Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Cmd</em>'.
	 * @generated
	 */
	MoveCmd createMoveCmd();

	/**
	 * Returns a new object of class '<em>Obstacle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle Cmd</em>'.
	 * @generated
	 */
	ObstacleCmd createObstacleCmd();

	/**
	 * Returns a new object of class '<em>Bip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bip</em>'.
	 * @generated
	 */
	Bip createBip();

	/**
	 * Returns a new object of class '<em>Set Turn Angle Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Turn Angle Cmd</em>'.
	 * @generated
	 */
	SetTurnAngleCmd createSetTurnAngleCmd();

	/**
	 * Returns a new object of class '<em>Has Turned Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Turned Cmd</em>'.
	 * @generated
	 */
	HasTurnedCmd createHasTurnedCmd();

	/**
	 * Returns a new object of class '<em>Turn Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Cmd</em>'.
	 * @generated
	 */
	TurnCmd createTurnCmd();

	/**
	 * Returns a new object of class '<em>Stop Engine Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Engine Cmd</em>'.
	 * @generated
	 */
	StopEngineCmd createStopEngineCmd();

	/**
	 * Returns a new object of class '<em>Stop Program Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Program Cmd</em>'.
	 * @generated
	 */
	StopProgramCmd createStopProgramCmd();

	/**
	 * Returns a new object of class '<em>Print Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Cmd</em>'.
	 * @generated
	 */
	PrintCmd createPrintCmd();

	/**
	 * Returns a new object of class '<em>Program Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Unit</em>'.
	 * @generated
	 */
	ProgramUnit createProgramUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotPackage getRobotPackage();

} //RobotFactory
