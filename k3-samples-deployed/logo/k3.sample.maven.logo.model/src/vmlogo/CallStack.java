/**
 */
package vmlogo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.CallStack#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see vmlogo.VmlogoPackage#getCallStack()
 * @model
 * @generated
 */
public interface CallStack extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(StackFrame)
	 * @see vmlogo.VmlogoPackage#getCallStack_Frames()
	 * @model containment="true"
	 * @generated
	 */
	StackFrame getFrames();

	/**
	 * Sets the value of the '{@link vmlogo.CallStack#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(StackFrame value);

} // CallStack
