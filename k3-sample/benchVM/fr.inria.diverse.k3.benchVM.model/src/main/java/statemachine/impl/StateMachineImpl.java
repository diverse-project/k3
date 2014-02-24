/**
 */
package statemachine.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
import statemachine.util.TransformationsToolBox;

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
	// Allows acces to transitions of this automaton
	// starting from a given state and labelled by
	// a given object. The keys of this map are instances
	// of class Key and
	// values are sets of transitions.
	private Map<Key, Set<Transition>> transitions = new HashMap<>();
	
	// Allows acces to transitions of this automaton
	// arriving to a given state and labelled by
	// a given object. The keys of this map are instances
	// of class Key and
	// values are sets of transitions.
	private Map<Key, Set<Transition>> reverse = new HashMap<>();
	
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
	 */
	public Set<State> terminals() {
		Set<State> term = new HashSet<>();
		for(State s: states) if(s.isTerminal()) term.add(s);
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> accessibleStates() {
		return access(initials(), transitions);
	}
	
	protected Set<State> access(Set<State> start, Map<Key, Set<Transition>> map) {
		Set<State> current = start;
		Set<State> old;
		do {
			old = current;
			current = new HashSet<State>();
			Iterator<State> i = old.iterator();
			while (i.hasNext()) {
				State e = (State) i.next();
				current.add(e);
				Iterator<String> j = alphabet().iterator();
				while (j.hasNext()) {
					Iterator<Transition> k = find(map, e, j.next()).iterator();
					while (k.hasNext()) {
						current.add(((Transition) k.next()).getEnd());
					}
				}
			}
		} while (current.size() != old.size());
		return current;
	}
	
	// Computes and return the set of all transitions, starting
	// from a given state and labelled by a given label
	// contained in a given Map
	protected Set<Transition> find(Map<Key, Set<Transition>> m, State e, Object l) {
		Key n = new Key(e, l);
		if (!m.containsKey(n))
			return new HashSet<>();
		return m.get(n);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> accessibleStates(Set<State> states) {
		return access(states, transitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> coAccessibleStates(Set<State> states) {
		return access(states, reverse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> coAccessibleStates() {
		return access(terminals(), reverse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> accessibleAndCoAccessibleStates() {
		Set<State> ac = accessibleStates();
		ac.retainAll(coAccessibleStates());
		return ac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> deltaFrom(State from, State to) {
		Set<Transition> t = delta(from);
		for (Iterator<Transition> i = t.iterator(); i.hasNext();) {
			Transition tr = (Transition) i.next();
			if (!to.equals(tr.getEnd()))
				i.remove();
		}
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> deltaMinusOne(State state, Object label) {
		return find(reverse, state, label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addTransition(Transition transition) {
		add(transitions, transition);
		Transition trans = StatemachineFactory.eINSTANCE.createTransition();
		trans.setLabel(transition.getLabel());
		trans.setEnd(transition.getEnd());
		trans.setStart(transition.getStart());
		add(reverse, trans);
	}

	// add a given transition in a given Map
	protected void add(Map<Key, Set<Transition>> m, Transition t) {
		Key n = new Key(t.getStart(), t.getLabel());
		Set<Transition> s;
		if (!m.containsKey(n)) {
			s = new HashSet<Transition>();
			m.put(n, s);
		} else
			s = m.get(n);
		s.add(t);
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> accessibleStates(State st) {
		Set<State> s = new HashSet<>();
		s.add(st);
		return access(s, transitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean accept(EList<String> word) {
		Set<State> s = TransformationsToolBox.epsilonClosure(steps(word),this);
		s.retainAll(terminals());
		return !s.isEmpty();
	}
	
	
	public Set<State> steps(List<String> word) {
		Set<State> s = TransformationsToolBox.epsilonClosure(initials(), this);
		return steps(s, new BasicEList<>(word));
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<String> alphabet() {
		Set<String> alpha = new HashSet<>();
		for(Transition t : delta) if(t.getLabel() instanceof String) alpha.add((String)t.getLabel());
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> delta(State state, Object label) {
		return find(transitions, state, label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> delta(State state) {
		Set<Transition> s = new HashSet<>();
		Iterator<String> alphit = alphabet().iterator();
		while (alphit.hasNext()) {
			s.addAll(delta(state, alphit.next()));
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> delta(Set<State> s) {
		Set<Transition> ds = new HashSet<>();
		Iterator<State> i = s.iterator();
		while (i.hasNext()) {
			ds.addAll(delta((State) i.next()));
		}
		return ds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> steps(Set<State> s, EList<String> word) {
		Iterator<String> it = word.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			s = step(s, o);
			if (s.isEmpty())
				return s;
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> steps(State st, EList<String> word) {
		Set<State> s = new HashSet<>();
		s.add(st);
		Iterator<String> it = word.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			s = step(s, o);
			if (s.isEmpty())
				return s;
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> step(Set<State> s, Object o) {
		Set<State> ns = new HashSet<>();
		Set<State> ec = TransformationsToolBox.epsilonClosure(s, this);
		Iterator<State> it = ec.iterator();
		while (it.hasNext()) {
			State st = (State) it.next();
			Iterator<Transition> it2 = delta(st).iterator();
			while (it2.hasNext()) {
				Transition tr = (Transition) it2.next();
				if (tr.getLabel() != null && tr.getLabel().equals(o))
					ns.add(tr.getEnd());
			}
		}
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<State> initials() {
		Set<State> term = new HashSet<>();
		for(State s: states) if(s.isInitial()) term.add(s);
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<Transition> deltaMinusOne(State st) {
		Set<Transition> s = new HashSet<Transition>();
		Iterator<String> alphit = alphabet().iterator();
		while (alphit.hasNext()) {
			s.addAll(deltaMinusOne(st, alphit.next()));
		}
		return s;
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

	
	private class Key {
		private State s;

		private Object l;

		protected Key(State s, Object l) {
			this.s = s;
			this.l = l;
		}

		public boolean equals(Object o) {
			if (o == null)
				return false;
			try {
				Key t = (Key) o;
				boolean ret = (l == null ? t.l == null : l.equals(t.l))
						&& (s == null ? t.s == null : s.equals(t.s));
				return ret;
			} catch (ClassCastException x) {
				return false;
			}
		}

		public int hashCode() {
			int x, y;
			if (s == null)
				x = 0;
			else
				x = s.hashCode();
			if (l == null)
				y = 0;
			else
				y = l.hashCode();
			return y << 16 | x;
			//            return new java.awt.Point(x, y).hashCode();
		}
	}
} //StateMachineImpl
