/**
 */
package statemachine;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link statemachine.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link statemachine.StateMachine#getDelta <em>Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @see statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Delta</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getStateMachine_Delta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getDelta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State addState(boolean initial, boolean terminal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> terminals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> accessibleStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>" statesType="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> accessibleStates(Set<State> states);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>" statesType="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> coAccessibleStates(Set<State> states);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> coAccessibleStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> accessibleAndCoAccessibleStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.Transition>"
	 * @generated
	 */
	Set<Transition> deltaFrom(State from, State to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.Transition>"
	 * @generated
	 */
	Set<Transition> deltaMinusOne(State state, Object label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTransition(Transition transition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> accessibleStates(State st);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wordMany="true"
	 * @generated
	 */
	boolean accept(EList<String> word);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Set<String> alphabet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.Transition>"
	 * @generated
	 */
	Set<Transition> delta(State state, Object label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.Transition>"
	 * @generated
	 */
	Set<Transition> delta(State state);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.Transition>" sType="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<Transition> delta(Set<State> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>" sType="statemachine.Set<statemachine.State>" wordMany="true"
	 * @generated
	 */
	Set<State> steps(Set<State> s, EList<String> word);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>" wordMany="true"
	 * @generated
	 */
	Set<State> steps(State st, EList<String> word);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>" sType="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> step(Set<State> s, Object o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> initials();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="statemachine.Set<statemachine.State>"
	 * @generated
	 */
	Set<State> deltaMinusOne(State st);

} // StateMachine
