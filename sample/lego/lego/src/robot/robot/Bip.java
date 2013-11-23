/**
 */
package robot.robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.Bip#getDuration <em>Duration</em>}</li>
 *   <li>{@link robot.robot.Bip#getPower <em>Power</em>}</li>
 *   <li>{@link robot.robot.Bip#getRepet <em>Repet</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getBip()
 * @model
 * @generated
 */
public interface Bip extends Command {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see robot.robot.RobotPackage#getBip_Duration()
	 * @model dataType="robot.Int" required="true"
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link robot.robot.Bip#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

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
	 * @see robot.robot.RobotPackage#getBip_Power()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getPower();

	/**
	 * Sets the value of the '{@link robot.robot.Bip#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Double value);

	/**
	 * Returns the value of the '<em><b>Repet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repet</em>' attribute.
	 * @see #setRepet(Boolean)
	 * @see robot.robot.RobotPackage#getBip_Repet()
	 * @model dataType="robot.Bool" required="true"
	 * @generated
	 */
	Boolean getRepet();

	/**
	 * Sets the value of the '{@link robot.robot.Bip#getRepet <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repet</em>' attribute.
	 * @see #getRepet()
	 * @generated
	 */
	void setRepet(Boolean value);

} // Bip
