/**
 */
package robot.FlotCtrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neg Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.FlotCtrl.NegExp#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.FlotCtrl.FlotCtrlPackage#getNegExp()
 * @model
 * @generated
 */
public interface NegExp extends BoolExp {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(BoolExp)
	 * @see robot.FlotCtrl.FlotCtrlPackage#getNegExp_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExp getExp();

	/**
	 * Sets the value of the '{@link robot.FlotCtrl.NegExp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(BoolExp value);

} // NegExp
