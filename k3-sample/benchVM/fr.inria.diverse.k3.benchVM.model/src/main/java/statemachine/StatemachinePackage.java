/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///statemachine.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statemachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinePackage eINSTANCE = statemachine.impl.StatemachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link statemachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.StateImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TERMINAL = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.StateMachineImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__DELTA = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ADD_STATE__BOOLEAN_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Terminals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___TERMINALS = 1;

	/**
	 * The operation id for the '<em>Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ACCESSIBLE_STATES = 2;

	/**
	 * The operation id for the '<em>Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ACCESSIBLE_STATES__SET = 3;

	/**
	 * The operation id for the '<em>Co Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___CO_ACCESSIBLE_STATES__SET = 4;

	/**
	 * The operation id for the '<em>Co Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___CO_ACCESSIBLE_STATES = 5;

	/**
	 * The operation id for the '<em>Accessible And Co Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ACCESSIBLE_AND_CO_ACCESSIBLE_STATES = 6;

	/**
	 * The operation id for the '<em>Delta From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA_FROM__STATE_STATE = 7;

	/**
	 * The operation id for the '<em>Delta Minus One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA_MINUS_ONE__STATE_OBJECT = 8;

	/**
	 * The operation id for the '<em>Add Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ADD_TRANSITION__TRANSITION = 9;

	/**
	 * The operation id for the '<em>Accessible States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ACCESSIBLE_STATES__STATE = 10;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ACCEPT__ELIST = 11;

	/**
	 * The operation id for the '<em>Alphabet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALPHABET = 12;

	/**
	 * The operation id for the '<em>Delta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA__STATE_OBJECT = 13;

	/**
	 * The operation id for the '<em>Delta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA__STATE = 14;

	/**
	 * The operation id for the '<em>Delta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA__SET = 15;

	/**
	 * The operation id for the '<em>Steps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___STEPS__SET_ELIST = 16;

	/**
	 * The operation id for the '<em>Steps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___STEPS__STATE_ELIST = 17;

	/**
	 * The operation id for the '<em>Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___STEP__SET_OBJECT = 18;

	/**
	 * The operation id for the '<em>Initials</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___INITIALS = 19;

	/**
	 * The operation id for the '<em>Delta Minus One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DELTA_MINUS_ONE__STATE = 20;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 21;

	/**
	 * The meta object id for the '{@link statemachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.TransitionImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___START = 0;

	/**
	 * The operation id for the '<em>Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___LABEL = 1;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___END = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link java.util.Set <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see statemachine.impl.StatemachinePackageImpl#getSet()
	 * @generated
	 */
	int SET = 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see statemachine.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#isTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal</em>'.
	 * @see statemachine.State#isTerminal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Terminal();

	/**
	 * Returns the meta object for class '{@link statemachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see statemachine.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.StateMachine#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta</em>'.
	 * @see statemachine.StateMachine#getDelta()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Delta();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#addState(boolean, boolean) <em>Add State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add State</em>' operation.
	 * @see statemachine.StateMachine#addState(boolean, boolean)
	 * @generated
	 */
	EOperation getStateMachine__AddState__boolean_boolean();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#terminals() <em>Terminals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminals</em>' operation.
	 * @see statemachine.StateMachine#terminals()
	 * @generated
	 */
	EOperation getStateMachine__Terminals();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#accessibleStates() <em>Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accessible States</em>' operation.
	 * @see statemachine.StateMachine#accessibleStates()
	 * @generated
	 */
	EOperation getStateMachine__AccessibleStates();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#accessibleStates(java.util.Set) <em>Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accessible States</em>' operation.
	 * @see statemachine.StateMachine#accessibleStates(java.util.Set)
	 * @generated
	 */
	EOperation getStateMachine__AccessibleStates__Set();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#coAccessibleStates(java.util.Set) <em>Co Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Co Accessible States</em>' operation.
	 * @see statemachine.StateMachine#coAccessibleStates(java.util.Set)
	 * @generated
	 */
	EOperation getStateMachine__CoAccessibleStates__Set();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#coAccessibleStates() <em>Co Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Co Accessible States</em>' operation.
	 * @see statemachine.StateMachine#coAccessibleStates()
	 * @generated
	 */
	EOperation getStateMachine__CoAccessibleStates();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#accessibleAndCoAccessibleStates() <em>Accessible And Co Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accessible And Co Accessible States</em>' operation.
	 * @see statemachine.StateMachine#accessibleAndCoAccessibleStates()
	 * @generated
	 */
	EOperation getStateMachine__AccessibleAndCoAccessibleStates();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#deltaFrom(statemachine.State, statemachine.State) <em>Delta From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta From</em>' operation.
	 * @see statemachine.StateMachine#deltaFrom(statemachine.State, statemachine.State)
	 * @generated
	 */
	EOperation getStateMachine__DeltaFrom__State_State();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#deltaMinusOne(statemachine.State, java.lang.Object) <em>Delta Minus One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta Minus One</em>' operation.
	 * @see statemachine.StateMachine#deltaMinusOne(statemachine.State, java.lang.Object)
	 * @generated
	 */
	EOperation getStateMachine__DeltaMinusOne__State_Object();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#addTransition(statemachine.Transition) <em>Add Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Transition</em>' operation.
	 * @see statemachine.StateMachine#addTransition(statemachine.Transition)
	 * @generated
	 */
	EOperation getStateMachine__AddTransition__Transition();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#accessibleStates(statemachine.State) <em>Accessible States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accessible States</em>' operation.
	 * @see statemachine.StateMachine#accessibleStates(statemachine.State)
	 * @generated
	 */
	EOperation getStateMachine__AccessibleStates__State();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#accept(org.eclipse.emf.common.util.EList) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see statemachine.StateMachine#accept(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStateMachine__Accept__EList();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#alphabet() <em>Alphabet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Alphabet</em>' operation.
	 * @see statemachine.StateMachine#alphabet()
	 * @generated
	 */
	EOperation getStateMachine__Alphabet();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#delta(statemachine.State, java.lang.Object) <em>Delta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta</em>' operation.
	 * @see statemachine.StateMachine#delta(statemachine.State, java.lang.Object)
	 * @generated
	 */
	EOperation getStateMachine__Delta__State_Object();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#delta(statemachine.State) <em>Delta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta</em>' operation.
	 * @see statemachine.StateMachine#delta(statemachine.State)
	 * @generated
	 */
	EOperation getStateMachine__Delta__State();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#delta(java.util.Set) <em>Delta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta</em>' operation.
	 * @see statemachine.StateMachine#delta(java.util.Set)
	 * @generated
	 */
	EOperation getStateMachine__Delta__Set();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#steps(java.util.Set, org.eclipse.emf.common.util.EList) <em>Steps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Steps</em>' operation.
	 * @see statemachine.StateMachine#steps(java.util.Set, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStateMachine__Steps__Set_EList();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#steps(statemachine.State, org.eclipse.emf.common.util.EList) <em>Steps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Steps</em>' operation.
	 * @see statemachine.StateMachine#steps(statemachine.State, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStateMachine__Steps__State_EList();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#step(java.util.Set, java.lang.Object) <em>Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step</em>' operation.
	 * @see statemachine.StateMachine#step(java.util.Set, java.lang.Object)
	 * @generated
	 */
	EOperation getStateMachine__Step__Set_Object();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#initials() <em>Initials</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initials</em>' operation.
	 * @see statemachine.StateMachine#initials()
	 * @generated
	 */
	EOperation getStateMachine__Initials();

	/**
	 * Returns the meta object for the '{@link statemachine.StateMachine#deltaMinusOne(statemachine.State) <em>Delta Minus One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delta Minus One</em>' operation.
	 * @see statemachine.StateMachine#deltaMinusOne(statemachine.State)
	 * @generated
	 */
	EOperation getStateMachine__DeltaMinusOne__State();

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the '{@link statemachine.Transition#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see statemachine.Transition#start()
	 * @generated
	 */
	EOperation getTransition__Start();

	/**
	 * Returns the meta object for the '{@link statemachine.Transition#label() <em>Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Label</em>' operation.
	 * @see statemachine.Transition#label()
	 * @generated
	 */
	EOperation getTransition__Label();

	/**
	 * Returns the meta object for the '{@link statemachine.Transition#end() <em>End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End</em>' operation.
	 * @see statemachine.Transition#end()
	 * @generated
	 */
	EOperation getTransition__End();

	/**
	 * Returns the meta object for class '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatemachineFactory getStatemachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link statemachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.StateImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TERMINAL = eINSTANCE.getState_Terminal();

		/**
		 * The meta object literal for the '{@link statemachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.StateMachineImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__DELTA = eINSTANCE.getStateMachine_Delta();

		/**
		 * The meta object literal for the '<em><b>Add State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ADD_STATE__BOOLEAN_BOOLEAN = eINSTANCE.getStateMachine__AddState__boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___TERMINALS = eINSTANCE.getStateMachine__Terminals();

		/**
		 * The meta object literal for the '<em><b>Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ACCESSIBLE_STATES = eINSTANCE.getStateMachine__AccessibleStates();

		/**
		 * The meta object literal for the '<em><b>Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ACCESSIBLE_STATES__SET = eINSTANCE.getStateMachine__AccessibleStates__Set();

		/**
		 * The meta object literal for the '<em><b>Co Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___CO_ACCESSIBLE_STATES__SET = eINSTANCE.getStateMachine__CoAccessibleStates__Set();

		/**
		 * The meta object literal for the '<em><b>Co Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___CO_ACCESSIBLE_STATES = eINSTANCE.getStateMachine__CoAccessibleStates();

		/**
		 * The meta object literal for the '<em><b>Accessible And Co Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ACCESSIBLE_AND_CO_ACCESSIBLE_STATES = eINSTANCE.getStateMachine__AccessibleAndCoAccessibleStates();

		/**
		 * The meta object literal for the '<em><b>Delta From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA_FROM__STATE_STATE = eINSTANCE.getStateMachine__DeltaFrom__State_State();

		/**
		 * The meta object literal for the '<em><b>Delta Minus One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA_MINUS_ONE__STATE_OBJECT = eINSTANCE.getStateMachine__DeltaMinusOne__State_Object();

		/**
		 * The meta object literal for the '<em><b>Add Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ADD_TRANSITION__TRANSITION = eINSTANCE.getStateMachine__AddTransition__Transition();

		/**
		 * The meta object literal for the '<em><b>Accessible States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ACCESSIBLE_STATES__STATE = eINSTANCE.getStateMachine__AccessibleStates__State();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ACCEPT__ELIST = eINSTANCE.getStateMachine__Accept__EList();

		/**
		 * The meta object literal for the '<em><b>Alphabet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ALPHABET = eINSTANCE.getStateMachine__Alphabet();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA__STATE_OBJECT = eINSTANCE.getStateMachine__Delta__State_Object();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA__STATE = eINSTANCE.getStateMachine__Delta__State();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA__SET = eINSTANCE.getStateMachine__Delta__Set();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___STEPS__SET_ELIST = eINSTANCE.getStateMachine__Steps__Set_EList();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___STEPS__STATE_ELIST = eINSTANCE.getStateMachine__Steps__State_EList();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___STEP__SET_OBJECT = eINSTANCE.getStateMachine__Step__Set_Object();

		/**
		 * The meta object literal for the '<em><b>Initials</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___INITIALS = eINSTANCE.getStateMachine__Initials();

		/**
		 * The meta object literal for the '<em><b>Delta Minus One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___DELTA_MINUS_ONE__STATE = eINSTANCE.getStateMachine__DeltaMinusOne__State();

		/**
		 * The meta object literal for the '{@link statemachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.TransitionImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___START = eINSTANCE.getTransition__Start();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___LABEL = eINSTANCE.getTransition__Label();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___END = eINSTANCE.getTransition__End();

		/**
		 * The meta object literal for the '{@link java.util.Set <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see statemachine.impl.StatemachinePackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

	}

} //StatemachinePackage
