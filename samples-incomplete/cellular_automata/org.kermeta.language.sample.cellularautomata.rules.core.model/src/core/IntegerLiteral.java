/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.IntegerLiteral#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see core.CorePackage#getIntegerLiteral_Val()
	 * @model required="true"
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link core.IntegerLiteral#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // IntegerLiteral
