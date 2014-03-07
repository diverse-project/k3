/**
 */
package robot.robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Turn Angle Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.SetTurnAngleCmd#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getSetTurnAngleCmd()
 * @model
 * @generated
 */
public interface SetTurnAngleCmd extends Command {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(Double)
	 * @see robot.robot.RobotPackage#getSetTurnAngleCmd_Angle()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getAngle();

	/**
	 * Sets the value of the '{@link robot.robot.SetTurnAngleCmd#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Double value);

} // SetTurnAngleCmd
