/**
 */
package robot.FlotCtrl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robot.FlotCtrl.AndExp;
import robot.FlotCtrl.BoolExp;
import robot.FlotCtrl.Expression;
import robot.FlotCtrl.FlotCtrlFactory;
import robot.FlotCtrl.FlotCtrlPackage;
import robot.FlotCtrl.IfBlock;
import robot.FlotCtrl.NegExp;
import robot.FlotCtrl.WhileLoop;

import robot.RobotPackage;

import robot.impl.RobotPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlotCtrlPackageImpl extends EPackageImpl implements FlotCtrlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifBlockEClass = null;

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
	 * @see robot.FlotCtrl.FlotCtrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlotCtrlPackageImpl() {
		super(eNS_URI, FlotCtrlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlotCtrlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlotCtrlPackage init() {
		if (isInited) return (FlotCtrlPackage)EPackage.Registry.INSTANCE.getEPackage(FlotCtrlPackage.eNS_URI);

		// Obtain or create and register package
		FlotCtrlPackageImpl theFlotCtrlPackage = (FlotCtrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlotCtrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlotCtrlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RobotPackageImpl theRobotPackage = (RobotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) instanceof RobotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI) : RobotPackage.eINSTANCE);
		robot.robot.impl.RobotPackageImpl theRobotPackage_1 = (robot.robot.impl.RobotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(robot.robot.RobotPackage.eNS_URI) instanceof robot.robot.impl.RobotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(robot.robot.RobotPackage.eNS_URI) : robot.robot.RobotPackage.eINSTANCE);

		// Create package meta-data objects
		theFlotCtrlPackage.createPackageContents();
		theRobotPackage.createPackageContents();
		theRobotPackage_1.createPackageContents();

		// Initialize created meta-data
		theFlotCtrlPackage.initializePackageContents();
		theRobotPackage.initializePackageContents();
		theRobotPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlotCtrlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlotCtrlPackage.eNS_URI, theFlotCtrlPackage);
		return theFlotCtrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_LoopCond() {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_Block() {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegExp() {
		return negExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegExp_Exp() {
		return (EReference)negExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolExp() {
		return boolExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExp() {
		return andExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExp_LeftExp() {
		return (EReference)andExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExp_RightExp() {
		return (EReference)andExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfBlock() {
		return ifBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlock_Condition() {
		return (EReference)ifBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlock_ThenBlock() {
		return (EReference)ifBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlock_ElseBlock() {
		return (EReference)ifBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotCtrlFactory getFlotCtrlFactory() {
		return (FlotCtrlFactory)getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);

		whileLoopEClass = createEClass(WHILE_LOOP);
		createEReference(whileLoopEClass, WHILE_LOOP__LOOP_COND);
		createEReference(whileLoopEClass, WHILE_LOOP__BLOCK);

		negExpEClass = createEClass(NEG_EXP);
		createEReference(negExpEClass, NEG_EXP__EXP);

		boolExpEClass = createEClass(BOOL_EXP);

		andExpEClass = createEClass(AND_EXP);
		createEReference(andExpEClass, AND_EXP__LEFT_EXP);
		createEReference(andExpEClass, AND_EXP__RIGHT_EXP);

		ifBlockEClass = createEClass(IF_BLOCK);
		createEReference(ifBlockEClass, IF_BLOCK__CONDITION);
		createEReference(ifBlockEClass, IF_BLOCK__THEN_BLOCK);
		createEReference(ifBlockEClass, IF_BLOCK__ELSE_BLOCK);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		whileLoopEClass.getESuperTypes().add(this.getExpression());
		negExpEClass.getESuperTypes().add(this.getBoolExp());
		boolExpEClass.getESuperTypes().add(this.getExpression());
		andExpEClass.getESuperTypes().add(this.getBoolExp());
		ifBlockEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoop_LoopCond(), this.getBoolExp(), null, "loopCond", null, 1, 1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileLoop_Block(), this.getExpression(), null, "block", null, 0, -1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negExpEClass, NegExp.class, "NegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegExp_Exp(), this.getBoolExp(), null, "exp", null, 1, 1, NegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolExpEClass, BoolExp.class, "BoolExp", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpEClass, AndExp.class, "AndExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExp_LeftExp(), this.getBoolExp(), null, "leftExp", null, 1, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndExp_RightExp(), this.getBoolExp(), null, "rightExp", null, 1, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifBlockEClass, IfBlock.class, "IfBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfBlock_Condition(), this.getBoolExp(), null, "condition", null, 1, 1, IfBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlock_ThenBlock(), this.getExpression(), null, "thenBlock", null, 1, -1, IfBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlock_ElseBlock(), this.getExpression(), null, "elseBlock", null, 0, -1, IfBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FlotCtrlPackageImpl
