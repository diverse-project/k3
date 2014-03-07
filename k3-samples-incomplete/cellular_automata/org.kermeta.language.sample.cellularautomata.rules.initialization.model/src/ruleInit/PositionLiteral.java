/**
 */
package ruleInit;

import core.IntegerExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.PositionLiteral#getDimensionIndex <em>Dimension Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getPositionLiteral()
 * @model
 * @generated
 */
public interface PositionLiteral extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Dimension Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Index</em>' attribute.
	 * @see #setDimensionIndex(int)
	 * @see ruleInit.InitPackage#getPositionLiteral_DimensionIndex()
	 * @model required="true"
	 * @generated
	 */
	int getDimensionIndex();

	/**
	 * Sets the value of the '{@link ruleInit.PositionLiteral#getDimensionIndex <em>Dimension Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Index</em>' attribute.
	 * @see #getDimensionIndex()
	 * @generated
	 */
	void setDimensionIndex(int value);

} // PositionLiteral
