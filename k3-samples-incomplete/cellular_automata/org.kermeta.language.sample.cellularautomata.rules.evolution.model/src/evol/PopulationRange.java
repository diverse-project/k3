/**
 */
package evol;

import core.Filter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link evol.PopulationRange#getLowerRange <em>Lower Range</em>}</li>
 *   <li>{@link evol.PopulationRange#getUpperRange <em>Upper Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see evol.EvolPackage#getPopulationRange()
 * @model
 * @generated
 */
public interface PopulationRange extends Filter {
	/**
	 * Returns the value of the '<em><b>Lower Range</b></em>' attribute.
	 * The default value is <code>"-2147483648"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Range</em>' attribute.
	 * @see #setLowerRange(Integer)
	 * @see evol.EvolPackage#getPopulationRange_LowerRange()
	 * @model default="-2147483648"
	 * @generated
	 */
	Integer getLowerRange();

	/**
	 * Sets the value of the '{@link evol.PopulationRange#getLowerRange <em>Lower Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Range</em>' attribute.
	 * @see #getLowerRange()
	 * @generated
	 */
	void setLowerRange(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper Range</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Range</em>' attribute.
	 * @see #setUpperRange(Integer)
	 * @see evol.EvolPackage#getPopulationRange_UpperRange()
	 * @model default="2147483647"
	 * @generated
	 */
	Integer getUpperRange();

	/**
	 * Sets the value of the '{@link evol.PopulationRange#getUpperRange <em>Upper Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Range</em>' attribute.
	 * @see #getUpperRange()
	 * @generated
	 */
	void setUpperRange(Integer value);

} // PopulationRange
