/**
 */
package expArithm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Arithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expArithm.ExpressionArithm#getRacine <em>Racine</em>}</li>
 * </ul>
 * </p>
 *
 * @see expArithm.ExpArithmPackage#getExpressionArithm()
 * @model
 * @generated
 */
public interface ExpressionArithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Racine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Racine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Racine</em>' containment reference.
	 * @see #setRacine(EltExp)
	 * @see expArithm.ExpArithmPackage#getExpressionArithm_Racine()
	 * @model containment="true"
	 * @generated
	 */
	EltExp getRacine();

	/**
	 * Sets the value of the '{@link expArithm.ExpressionArithm#getRacine <em>Racine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Racine</em>' containment reference.
	 * @see #getRacine()
	 * @generated
	 */
	void setRacine(EltExp value);

} // ExpressionArithm
