/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.UnaryExpression#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(IntegerExpression)
	 * @see core.CorePackage#getUnaryExpression_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getTarget();

	/**
	 * Sets the value of the '{@link core.UnaryExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IntegerExpression value);

} // UnaryExpression
