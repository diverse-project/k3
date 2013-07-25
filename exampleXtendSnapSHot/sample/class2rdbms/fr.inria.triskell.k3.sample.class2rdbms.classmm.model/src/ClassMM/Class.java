/**
 */
package ClassMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassMM.Class#getIs_persistent <em>Is persistent</em>}</li>
 *   <li>{@link ClassMM.Class#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link ClassMM.Class#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassMM.ClassMMPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is persistent</em>' attribute.
	 * @see #setIs_persistent(Boolean)
	 * @see ClassMM.ClassMMPackage#getClass_Is_persistent()
	 * @model default="false" dataType="ClassMM.Boolean"
	 * @generated
	 */
	Boolean getIs_persistent();

	/**
	 * Sets the value of the '{@link ClassMM.Class#getIs_persistent <em>Is persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is persistent</em>' attribute.
	 * @see #getIs_persistent()
	 * @generated
	 */
	void setIs_persistent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
	 * The list contents are of type {@link ClassMM.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attrs</em>' containment reference list.
	 * @see ClassMM.ClassMMPackage#getClass_Attrs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttrs();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Class)
	 * @see ClassMM.ClassMMPackage#getClass_Parent()
	 * @model
	 * @generated
	 */
	Class getParent();

	/**
	 * Sets the value of the '{@link ClassMM.Class#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Class value);

} // Class
