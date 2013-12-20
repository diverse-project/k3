/**
 */
package robot.robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.MoveCmd#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getMoveCmd()
 * @model
 * @generated
 */
public interface MoveCmd extends Command {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(Double)
	 * @see robot.robot.RobotPackage#getMoveCmd_Power()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getPower();

	/**
	 * Sets the value of the '{@link robot.robot.MoveCmd#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Double value);

} // MoveCmd
