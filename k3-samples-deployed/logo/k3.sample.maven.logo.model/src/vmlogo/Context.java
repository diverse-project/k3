/**
 */
package vmlogo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.Context#getTurtle <em>Turtle</em>}</li>
 *   <li>{@link vmlogo.Context#getCallStack <em>Call Stack</em>}</li>
 * </ul>
 *
 * @see vmlogo.VmlogoPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Turtle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turtle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turtle</em>' containment reference.
	 * @see #setTurtle(Turtle)
	 * @see vmlogo.VmlogoPackage#getContext_Turtle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Turtle getTurtle();

	/**
	 * Sets the value of the '{@link vmlogo.Context#getTurtle <em>Turtle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turtle</em>' containment reference.
	 * @see #getTurtle()
	 * @generated
	 */
	void setTurtle(Turtle value);

	/**
	 * Returns the value of the '<em><b>Call Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Stack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Stack</em>' containment reference.
	 * @see #setCallStack(CallStack)
	 * @see vmlogo.VmlogoPackage#getContext_CallStack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CallStack getCallStack();

	/**
	 * Sets the value of the '{@link vmlogo.Context#getCallStack <em>Call Stack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Stack</em>' containment reference.
	 * @see #getCallStack()
	 * @generated
	 */
	void setCallStack(CallStack value);

} // Context
