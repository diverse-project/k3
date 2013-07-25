/**
 */
package RDBMSMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FKey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RDBMSMM.FKey#getReferences <em>References</em>}</li>
 *   <li>{@link RDBMSMM.FKey#getCols <em>Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see RDBMSMM.RDBMSMMPackage#getFKey()
 * @model
 * @generated
 */
public interface FKey extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Table)
	 * @see RDBMSMM.RDBMSMMPackage#getFKey_References()
	 * @model required="true"
	 * @generated
	 */
	Table getReferences();

	/**
	 * Sets the value of the '{@link RDBMSMM.FKey#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Table value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' reference list.
	 * The list contents are of type {@link RDBMSMM.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' reference list.
	 * @see RDBMSMM.RDBMSMMPackage#getFKey_Cols()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getCols();

} // FKey
