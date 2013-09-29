/**
 */
package RDBMSMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RDBMSMM.RDBMSModel#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see RDBMSMM.RDBMSMMPackage#getRDBMSModel()
 * @model
 * @generated
 */
public interface RDBMSModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link RDBMSMM.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see RDBMSMM.RDBMSMMPackage#getRDBMSModel_Table()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Table> getTable();

} // RDBMSModel
