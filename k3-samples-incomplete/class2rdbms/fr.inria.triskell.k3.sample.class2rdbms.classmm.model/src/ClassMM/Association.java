/**
 */
package ClassMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassMM.Association#getName <em>Name</em>}</li>
 *   <li>{@link ClassMM.Association#getSrc <em>Src</em>}</li>
 *   <li>{@link ClassMM.Association#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassMM.ClassMMPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
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
	 * @see ClassMM.ClassMMPackage#getAssociation_Name()
	 * @model dataType="ClassMM.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassMM.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(ClassMM.Class)
	 * @see ClassMM.ClassMMPackage#getAssociation_Src()
	 * @model required="true"
	 * @generated
	 */
	ClassMM.Class getSrc();

	/**
	 * Sets the value of the '{@link ClassMM.Association#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(ClassMM.Class value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(ClassMM.Class)
	 * @see ClassMM.ClassMMPackage#getAssociation_Dest()
	 * @model required="true"
	 * @generated
	 */
	ClassMM.Class getDest();

	/**
	 * Sets the value of the '{@link ClassMM.Association#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(ClassMM.Class value);

} // Association
