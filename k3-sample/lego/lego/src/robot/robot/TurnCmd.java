/**
 */
package robot.robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.TurnCmd#getPower <em>Power</em>}</li>
 *   <li>{@link robot.robot.TurnCmd#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getTurnCmd()
 * @model
 * @generated
 */
public interface TurnCmd extends Command {
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
	 * @see robot.robot.RobotPackage#getTurnCmd_Power()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getPower();

	/**
	 * Sets the value of the '{@link robot.robot.TurnCmd#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Double value);

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
	 * @see robot.robot.RobotPackage#getTurnCmd_Angle()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getAngle();

	/**
	 * Sets the value of the '{@link robot.robot.TurnCmd#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Double value);

} // TurnCmd
