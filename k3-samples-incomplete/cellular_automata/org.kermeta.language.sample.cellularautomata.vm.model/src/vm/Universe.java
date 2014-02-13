/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.Universe#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getUniverse()
 * @model
 * @generated
 */
public interface Universe extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link vm.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see vm.VmPackage#getUniverse_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // Universe
