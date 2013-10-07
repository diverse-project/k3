/**
 */
package geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.RegularGeometry#getNeighborsNumber <em>Neighbors Number</em>}</li>
 *   <li>{@link geometry.RegularGeometry#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getRegularGeometry()
 * @model
 * @generated
 */
public interface RegularGeometry extends Geometry {
	/**
	 * Returns the value of the '<em><b>Neighbors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors Number</em>' attribute.
	 * @see #setNeighborsNumber(int)
	 * @see geometry.GeometryPackage#getRegularGeometry_NeighborsNumber()
	 * @model required="true"
	 * @generated
	 */
	int getNeighborsNumber();

	/**
	 * Sets the value of the '{@link geometry.RegularGeometry#getNeighborsNumber <em>Neighbors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors Number</em>' attribute.
	 * @see #getNeighborsNumber()
	 * @generated
	 */
	void setNeighborsNumber(int value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see geometry.GeometryPackage#getRegularGeometry_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getDimensions();

} // RegularGeometry
