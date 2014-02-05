/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.Cell#getNeighbors <em>Neighbors</em>}</li>
 *   <li>{@link vm.Cell#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Neighbors</b></em>' reference list.
	 * The list contents are of type {@link vm.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors</em>' reference list.
	 * @see vm.VmPackage#getCell_Neighbors()
	 * @model
	 * @generated
	 */
	EList<Cell> getNeighbors();

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see vm.VmPackage#getCell_Val()
	 * @model required="true"
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link vm.Cell#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // Cell
