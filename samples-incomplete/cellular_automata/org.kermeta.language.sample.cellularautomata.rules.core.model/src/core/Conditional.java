/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.Conditional#getIfTrueExpression <em>If True Expression</em>}</li>
 *   <li>{@link core.Conditional#getIfFalseExpression <em>If False Expression</em>}</li>
 *   <li>{@link core.Conditional#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>If True Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If True Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True Expression</em>' containment reference.
	 * @see #setIfTrueExpression(IntegerExpression)
	 * @see core.CorePackage#getConditional_IfTrueExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getIfTrueExpression();

	/**
	 * Sets the value of the '{@link core.Conditional#getIfTrueExpression <em>If True Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True Expression</em>' containment reference.
	 * @see #getIfTrueExpression()
	 * @generated
	 */
	void setIfTrueExpression(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>If False Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If False Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False Expression</em>' containment reference.
	 * @see #setIfFalseExpression(IntegerExpression)
	 * @see core.CorePackage#getConditional_IfFalseExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getIfFalseExpression();

	/**
	 * Sets the value of the '{@link core.Conditional#getIfFalseExpression <em>If False Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False Expression</em>' containment reference.
	 * @see #getIfFalseExpression()
	 * @generated
	 */
	void setIfFalseExpression(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(IntegerExpression)
	 * @see core.CorePackage#getConditional_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getCondition();

	/**
	 * Sets the value of the '{@link core.Conditional#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(IntegerExpression value);

} // Conditional
