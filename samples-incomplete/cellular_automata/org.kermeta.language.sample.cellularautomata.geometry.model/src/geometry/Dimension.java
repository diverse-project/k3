/**
 */
package geometry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.Dimension#getSize <em>Size</em>}</li>
 *   <li>{@link geometry.Dimension#isIsCircular <em>Is Circular</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see geometry.GeometryPackage#getDimension_Size()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link geometry.Dimension#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Is Circular</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Circular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Circular</em>' attribute.
	 * @see #setIsCircular(boolean)
	 * @see geometry.GeometryPackage#getDimension_IsCircular()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsCircular();

	/**
	 * Sets the value of the '{@link geometry.Dimension#isIsCircular <em>Is Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Circular</em>' attribute.
	 * @see #isIsCircular()
	 * @generated
	 */
	void setIsCircular(boolean value);

} // Dimension
