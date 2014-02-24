/**
 */
package statemachine.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.State;
import statemachine.StateMachine;
import statemachine.StatemachineFactory;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link statemachine.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link statemachine.impl.StateMachineImpl#getDelta <em>Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getDelta() <em>Delta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> delta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, StatemachinePackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getDelta() {
		if (delta == null) {
			delta = new EObjectContainmentEList<Transition>(Transition.class, this, StatemachinePackage.STATE_MACHINE__DELTA);
		}
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public State addState(boolean initial, boolean terminal) {
		State s = StatemachineFactory.eINSTANCE.createState();
		s.setInitial(initial);
		s.setTerminal(terminal);
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> terminals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> accessibleStates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> accessibleStates(Set<State> states) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> coAccessibleStates(Set<State> states) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> coAccessibleStates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> accessibleAndCoAccessibleStates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Transition> deltaFrom(State from, State to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Transition> deltaMinusOne(State state, Object label) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTransition(Transition transition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> accessibleStates(State st) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean accept(EList<String> word) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<String> alphabet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Transition> delta(State state, Object label) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Transition> delta(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Transition> delta(Set<State> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> steps(Set<State> s, EList<String> word) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> steps(State st, EList<String> word) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> step(Set<State> s, Object o) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> initials() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<State> deltaMinusOne(State st) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__DELTA:
				return ((InternalEList<?>)getDelta()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				return getStates();
			case StatemachinePackage.STATE_MACHINE__DELTA:
				return getDelta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__DELTA:
				getDelta().clear();
				getDelta().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__DELTA:
				getDelta().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatemachinePackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case StatemachinePackage.STATE_MACHINE__DELTA:
				return delta != null && !delta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StatemachinePackage.STATE_MACHINE___ADD_STATE__BOOLEAN_BOOLEAN:
				return addState((Boolean)arguments.get(0), (Boolean)arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___TERMINALS:
				return terminals();
			case StatemachinePackage.STATE_MACHINE___ACCESSIBLE_STATES:
				return accessibleStates();
			case StatemachinePackage.STATE_MACHINE___ACCESSIBLE_STATES__SET:
				return accessibleStates((Set<State>)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___CO_ACCESSIBLE_STATES__SET:
				return coAccessibleStates((Set<State>)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___CO_ACCESSIBLE_STATES:
				return coAccessibleStates();
			case StatemachinePackage.STATE_MACHINE___ACCESSIBLE_AND_CO_ACCESSIBLE_STATES:
				return accessibleAndCoAccessibleStates();
			case StatemachinePackage.STATE_MACHINE___DELTA_FROM__STATE_STATE:
				return deltaFrom((State)arguments.get(0), (State)arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___DELTA_MINUS_ONE__STATE_OBJECT:
				return deltaMinusOne((State)arguments.get(0), arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___ADD_TRANSITION__TRANSITION:
				addTransition((Transition)arguments.get(0));
				return null;
			case StatemachinePackage.STATE_MACHINE___ACCESSIBLE_STATES__STATE:
				return accessibleStates((State)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___ACCEPT__ELIST:
				return accept((EList<String>)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___ALPHABET:
				return alphabet();
			case StatemachinePackage.STATE_MACHINE___DELTA__STATE_OBJECT:
				return delta((State)arguments.get(0), arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___DELTA__STATE:
				return delta((State)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___DELTA__SET:
				return delta((Set<State>)arguments.get(0));
			case StatemachinePackage.STATE_MACHINE___STEPS__SET_ELIST:
				return steps((Set<State>)arguments.get(0), (EList<String>)arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___STEPS__STATE_ELIST:
				return steps((State)arguments.get(0), (EList<String>)arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___STEP__SET_OBJECT:
				return step((Set<State>)arguments.get(0), arguments.get(1));
			case StatemachinePackage.STATE_MACHINE___INITIALS:
				return initials();
			case StatemachinePackage.STATE_MACHINE___DELTA_MINUS_ONE__STATE:
				return deltaMinusOne((State)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateMachineImpl
