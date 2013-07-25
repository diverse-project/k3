/**
 */
package ClassMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassMM.ClassModel#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link ClassMM.ClassModel#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassMM.ClassMMPackage#getClassModel()
 * @model
 * @generated
 */
public interface ClassModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link ClassMM.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see ClassMM.ClassMMPackage#getClassModel_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link ClassMM.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see ClassMM.ClassMMPackage#getClassModel_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociation();

} // ClassModel
