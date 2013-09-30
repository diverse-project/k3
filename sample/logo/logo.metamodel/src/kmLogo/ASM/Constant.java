/**
 */
package kmLogo.ASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kmLogo.ASM.Constant#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kmLogo.ASM.ASMPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Expression {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(int)
	 * @see kmLogo.ASM.ASMPackage#getConstant_IntegerValue()
	 * @model dataType="kmLogo.Integer"
	 * @generated
	 */
	int getIntegerValue();

	/**
	 * Sets the value of the '{@link kmLogo.ASM.Constant#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(int value);

} // Constant
