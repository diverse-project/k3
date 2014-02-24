/**
 */
package statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statemachine.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link statemachine.State#isTerminal <em>Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see statemachine.StatemachinePackage#getState_Initial()
	 * @model
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link statemachine.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' attribute.
	 * @see #setTerminal(boolean)
	 * @see statemachine.StatemachinePackage#getState_Terminal()
	 * @model
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * Sets the value of the '{@link statemachine.State#isTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #isTerminal()
	 * @generated
	 */
	void setTerminal(boolean value);

} // State
