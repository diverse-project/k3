/**
 */
package ruleInit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * coordinates should be greater or equal to MININT (-2147483647) and lower or equal to MAXINT (2147483647)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.CoordinateRange#getLowerCoordinate <em>Lower Coordinate</em>}</li>
 *   <li>{@link ruleInit.CoordinateRange#getUpperCoordinate <em>Upper Coordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getCoordinateRange()
 * @model
 * @generated
 */
public interface CoordinateRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Coordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Coordinate</em>' attribute.
	 * @see #setLowerCoordinate(int)
	 * @see ruleInit.InitPackage#getCoordinateRange_LowerCoordinate()
	 * @model
	 * @generated
	 */
	int getLowerCoordinate();

	/**
	 * Sets the value of the '{@link ruleInit.CoordinateRange#getLowerCoordinate <em>Lower Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Coordinate</em>' attribute.
	 * @see #getLowerCoordinate()
	 * @generated
	 */
	void setLowerCoordinate(int value);

	/**
	 * Returns the value of the '<em><b>Upper Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Coordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Coordinate</em>' attribute.
	 * @see #setUpperCoordinate(int)
	 * @see ruleInit.InitPackage#getCoordinateRange_UpperCoordinate()
	 * @model
	 * @generated
	 */
	int getUpperCoordinate();

	/**
	 * Sets the value of the '{@link ruleInit.CoordinateRange#getUpperCoordinate <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Coordinate</em>' attribute.
	 * @see #getUpperCoordinate()
	 * @generated
	 */
	void setUpperCoordinate(int value);

} // CoordinateRange
