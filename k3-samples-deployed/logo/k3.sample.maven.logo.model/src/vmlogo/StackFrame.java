/**
 */
package vmlogo;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.StackFrame#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see vmlogo.VmlogoPackage#getStackFrame()
 * @model
 * @generated
 */
public interface StackFrame extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(Map)
	 * @see vmlogo.VmlogoPackage#getStackFrame_Variables()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Integer> getVariables();

	/**
	 * Sets the value of the '{@link vmlogo.StackFrame#getVariables <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Map<String, Integer> value);

} // StackFrame
