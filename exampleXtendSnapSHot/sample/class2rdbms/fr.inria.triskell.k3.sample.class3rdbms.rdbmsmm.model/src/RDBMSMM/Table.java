/**
 */
package RDBMSMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RDBMSMM.Table#getName <em>Name</em>}</li>
 *   <li>{@link RDBMSMM.Table#getCols <em>Cols</em>}</li>
 *   <li>{@link RDBMSMM.Table#getPkey <em>Pkey</em>}</li>
 *   <li>{@link RDBMSMM.Table#getFkeys <em>Fkeys</em>}</li>
 * </ul>
 * </p>
 *
 * @see RDBMSMM.RDBMSMMPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RDBMSMM.RDBMSMMPackage#getTable_Name()
	 * @model dataType="RDBMSMM.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RDBMSMM.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
	 * The list contents are of type {@link RDBMSMM.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' containment reference list.
	 * @see RDBMSMM.RDBMSMMPackage#getTable_Cols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getCols();

	/**
	 * Returns the value of the '<em><b>Pkey</b></em>' reference list.
	 * The list contents are of type {@link RDBMSMM.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkey</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkey</em>' reference list.
	 * @see RDBMSMM.RDBMSMMPackage#getTable_Pkey()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getPkey();

	/**
	 * Returns the value of the '<em><b>Fkeys</b></em>' containment reference list.
	 * The list contents are of type {@link RDBMSMM.FKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fkeys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fkeys</em>' containment reference list.
	 * @see RDBMSMM.RDBMSMMPackage#getTable_Fkeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<FKey> getFkeys();

} // Table
