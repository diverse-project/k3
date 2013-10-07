/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.Rule#getEvaluatedVal <em>Evaluated Val</em>}</li>
 *   <li>{@link core.Rule#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluated Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluated Val</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated Val</em>' containment reference.
	 * @see #setEvaluatedVal(IntegerExpression)
	 * @see core.CorePackage#getRule_EvaluatedVal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getEvaluatedVal();

	/**
	 * Sets the value of the '{@link core.Rule#getEvaluatedVal <em>Evaluated Val</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluated Val</em>' containment reference.
	 * @see #getEvaluatedVal()
	 * @generated
	 */
	void setEvaluatedVal(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Filter)
	 * @see core.CorePackage#getRule_Filter()
	 * @model containment="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link core.Rule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

} // Rule
