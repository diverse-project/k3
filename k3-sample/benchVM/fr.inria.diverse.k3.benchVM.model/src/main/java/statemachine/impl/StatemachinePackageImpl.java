/**
 */
package statemachine.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import statemachine.State;
import statemachine.StateMachine;
import statemachine.StatemachineFactory;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinePackageImpl extends EPackageImpl implements StatemachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see statemachine.StatemachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinePackageImpl() {
		super(eNS_URI, StatemachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatemachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinePackage init() {
		if (isInited) return (StatemachinePackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinePackage.eNS_URI);

		// Obtain or create and register package
		StatemachinePackageImpl theStatemachinePackage = (StatemachinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatemachinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatemachinePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStatemachinePackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinePackage.eNS_URI, theStatemachinePackage);
		return theStatemachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Initial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Terminal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_States() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Delta() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AddState__boolean_boolean() {
		return stateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Terminals() {
		return stateMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AccessibleStates() {
		return stateMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AccessibleStates__Set() {
		return stateMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__CoAccessibleStates__Set() {
		return stateMachineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__CoAccessibleStates() {
		return stateMachineEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AccessibleAndCoAccessibleStates() {
		return stateMachineEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__DeltaFrom__State_State() {
		return stateMachineEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__DeltaMinusOne__State_Object() {
		return stateMachineEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AddTransition__Transition() {
		return stateMachineEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__AccessibleStates__State() {
		return stateMachineEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Accept__EList() {
		return stateMachineEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Alphabet() {
		return stateMachineEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Delta__State_Object() {
		return stateMachineEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Delta__State() {
		return stateMachineEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Delta__Set() {
		return stateMachineEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Steps__Set_EList() {
		return stateMachineEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Steps__State_EList() {
		return stateMachineEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Step__Set_Object() {
		return stateMachineEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Initials() {
		return stateMachineEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__DeltaMinusOne__State() {
		return stateMachineEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Start() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_End() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Label() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachineFactory getStatemachineFactory() {
		return (StatemachineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__INITIAL);
		createEAttribute(stateEClass, STATE__TERMINAL);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATES);
		createEReference(stateMachineEClass, STATE_MACHINE__DELTA);
		createEOperation(stateMachineEClass, STATE_MACHINE___ADD_STATE__BOOLEAN_BOOLEAN);
		createEOperation(stateMachineEClass, STATE_MACHINE___TERMINALS);
		createEOperation(stateMachineEClass, STATE_MACHINE___ACCESSIBLE_STATES);
		createEOperation(stateMachineEClass, STATE_MACHINE___ACCESSIBLE_STATES__SET);
		createEOperation(stateMachineEClass, STATE_MACHINE___CO_ACCESSIBLE_STATES__SET);
		createEOperation(stateMachineEClass, STATE_MACHINE___CO_ACCESSIBLE_STATES);
		createEOperation(stateMachineEClass, STATE_MACHINE___ACCESSIBLE_AND_CO_ACCESSIBLE_STATES);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA_FROM__STATE_STATE);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA_MINUS_ONE__STATE_OBJECT);
		createEOperation(stateMachineEClass, STATE_MACHINE___ADD_TRANSITION__TRANSITION);
		createEOperation(stateMachineEClass, STATE_MACHINE___ACCESSIBLE_STATES__STATE);
		createEOperation(stateMachineEClass, STATE_MACHINE___ACCEPT__ELIST);
		createEOperation(stateMachineEClass, STATE_MACHINE___ALPHABET);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA__STATE_OBJECT);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA__STATE);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA__SET);
		createEOperation(stateMachineEClass, STATE_MACHINE___STEPS__SET_ELIST);
		createEOperation(stateMachineEClass, STATE_MACHINE___STEPS__STATE_ELIST);
		createEOperation(stateMachineEClass, STATE_MACHINE___STEP__SET_OBJECT);
		createEOperation(stateMachineEClass, STATE_MACHINE___INITIALS);
		createEOperation(stateMachineEClass, STATE_MACHINE___DELTA_MINUS_ONE__STATE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__START);
		createEReference(transitionEClass, TRANSITION__END);
		createEAttribute(transitionEClass, TRANSITION__LABEL);

		setEClass = createEClass(SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(setEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Terminal(), ecorePackage.getEBoolean(), "terminal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Delta(), this.getTransition(), null, "delta", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getStateMachine__AddState__boolean_boolean(), this.getState(), "addState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "terminal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__Terminals(), null, "terminals", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getSet());
		EGenericType g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__AccessibleStates(), null, "accessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__AccessibleStates__Set(), null, "accessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "states", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__CoAccessibleStates__Set(), null, "coAccessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "states", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__CoAccessibleStates(), null, "coAccessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__AccessibleAndCoAccessibleStates(), null, "accessibleAndCoAccessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__DeltaFrom__State_State(), null, "deltaFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__DeltaMinusOne__State_Object(), null, "deltaMinusOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__AddTransition__Transition(), null, "addTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "transition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__AccessibleStates__State(), null, "accessibleStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "st", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Accept__EList(), ecorePackage.getEBoolean(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "word", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__Alphabet(), null, "alphabet", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Delta__State_Object(), null, "delta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Delta__State(), null, "delta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Delta__Set(), null, "delta", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getTransition());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Steps__Set_EList(), null, "steps", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "word", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Steps__State_EList(), null, "steps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "st", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "word", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Step__Set_Object(), null, "step", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "o", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__Initials(), null, "initials", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getStateMachine__DeltaMinusOne__State(), null, "deltaMinusOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "st", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(this.getState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Start(), this.getState(), null, "start", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_End(), this.getState(), null, "end", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Label(), ecorePackage.getEJavaObject(), "label", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StatemachinePackageImpl
