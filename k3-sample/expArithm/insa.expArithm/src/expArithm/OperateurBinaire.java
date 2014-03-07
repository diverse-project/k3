/**
 */
package expArithm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operateur Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expArithm.OperateurBinaire#getEltGauche <em>Elt Gauche</em>}</li>
 *   <li>{@link expArithm.OperateurBinaire#getEltDroit <em>Elt Droit</em>}</li>
 * </ul>
 * </p>
 *
 * @see expArithm.ExpArithmPackage#getOperateurBinaire()
 * @model abstract="true"
 * @generated
 */
public interface OperateurBinaire extends EltExp {
	/**
	 * Returns the value of the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elt Gauche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elt Gauche</em>' containment reference.
	 * @see #setEltGauche(EltExp)
	 * @see expArithm.ExpArithmPackage#getOperateurBinaire_EltGauche()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EltExp getEltGauche();

	/**
	 * Sets the value of the '{@link expArithm.OperateurBinaire#getEltGauche <em>Elt Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elt Gauche</em>' containment reference.
	 * @see #getEltGauche()
	 * @generated
	 */
	void setEltGauche(EltExp value);

	/**
	 * Returns the value of the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elt Droit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elt Droit</em>' containment reference.
	 * @see #setEltDroit(EltExp)
	 * @see expArithm.ExpArithmPackage#getOperateurBinaire_EltDroit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EltExp getEltDroit();

	/**
	 * Sets the value of the '{@link expArithm.OperateurBinaire#getEltDroit <em>Elt Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elt Droit</em>' containment reference.
	 * @see #getEltDroit()
	 * @generated
	 */
	void setEltDroit(EltExp value);

} // OperateurBinaire
