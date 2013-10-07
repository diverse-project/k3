/**
 */
package evol;

import core.Rule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cellular Automata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link evol.CellularAutomata#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see evol.EvolPackage#getCellularAutomata()
 * @model
 * @generated
 */
public interface CellularAutomata extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link core.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see evol.EvolPackage#getCellularAutomata_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // CellularAutomata
