/**
 */
package expArithm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expArithm.Valeur#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @see expArithm.ExpArithmPackage#getValeur()
 * @model
 * @generated
 */
public interface Valeur extends EltExp {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(double)
	 * @see expArithm.ExpArithmPackage#getValeur_Valeur()
	 * @model required="true"
	 * @generated
	 */
	double getValeur();

	/**
	 * Sets the value of the '{@link expArithm.Valeur#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(double value);

} // Valeur
