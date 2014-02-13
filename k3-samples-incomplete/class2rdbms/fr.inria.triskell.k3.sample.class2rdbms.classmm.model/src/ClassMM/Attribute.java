/**
 */
package ClassMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassMM.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link ClassMM.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link ClassMM.Attribute#getIs_primary <em>Is primary</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassMM.ClassMMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see ClassMM.ClassMMPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link ClassMM.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

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
	 * @see ClassMM.ClassMMPackage#getAttribute_Name()
	 * @model dataType="ClassMM.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassMM.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is primary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is primary</em>' attribute.
	 * @see #setIs_primary(Boolean)
	 * @see ClassMM.ClassMMPackage#getAttribute_Is_primary()
	 * @model default="false" dataType="ClassMM.Boolean"
	 * @generated
	 */
	Boolean getIs_primary();

	/**
	 * Sets the value of the '{@link ClassMM.Attribute#getIs_primary <em>Is primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is primary</em>' attribute.
	 * @see #getIs_primary()
	 * @generated
	 */
	void setIs_primary(Boolean value);

} // Attribute
