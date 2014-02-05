/**
 */
package robot.FlotCtrl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.FlotCtrl.AndExp#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link robot.FlotCtrl.AndExp#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.FlotCtrl.FlotCtrlPackage#getAndExp()
 * @model
 * @generated
 */
public interface AndExp extends BoolExp {
	/**
	 * Returns the value of the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Exp</em>' containment reference.
	 * @see #setLeftExp(BoolExp)
	 * @see robot.FlotCtrl.FlotCtrlPackage#getAndExp_LeftExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExp getLeftExp();

	/**
	 * Sets the value of the '{@link robot.FlotCtrl.AndExp#getLeftExp <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Exp</em>' containment reference.
	 * @see #getLeftExp()
	 * @generated
	 */
	void setLeftExp(BoolExp value);

	/**
	 * Returns the value of the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Exp</em>' containment reference.
	 * @see #setRightExp(BoolExp)
	 * @see robot.FlotCtrl.FlotCtrlPackage#getAndExp_RightExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExp getRightExp();

	/**
	 * Sets the value of the '{@link robot.FlotCtrl.AndExp#getRightExp <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Exp</em>' containment reference.
	 * @see #getRightExp()
	 * @generated
	 */
	void setRightExp(BoolExp value);

} // AndExp
