/**
 */
package robot.robot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robot.FlotCtrl.FlotCtrlPackage;

import robot.FlotCtrl.impl.FlotCtrlPackageImpl;

import robot.robot.Bip;
import robot.robot.Command;
import robot.robot.HasTurnedCmd;
import robot.robot.MoveCmd;
import robot.robot.ObstacleCmd;
import robot.robot.PrintCmd;
import robot.robot.RobotFactory;
import robot.robot.RobotPackage;
import robot.robot.SetTurnAngleCmd;
import robot.robot.StopEngineCmd;
import robot.robot.StopProgramCmd;
import robot.robot.TurnCmd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotPackageImpl extends EPackageImpl implements RobotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTurnAngleCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasTurnedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEngineCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopProgramCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printCmdEClass = null;

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
	 * @see robot.robot.RobotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotPackageImpl() {
		super(eNS_URI, RobotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RobotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotPackage init() {
		if (isInited) return (RobotPackage)EPackage.Registry.INSTANCE.getEPackage(RobotPackage.eNS_URI);

		// Obtain or create and register package
		RobotPackageImpl theRobotPackage = (RobotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RobotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RobotPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		robot.impl.RobotPackageImpl theRobotPackage_1 = (robot.impl.RobotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(robot.RobotPackage.eNS_URI) instanceof robot.impl.RobotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(robot.RobotPackage.eNS_URI) : robot.RobotPackage.eINSTANCE);
		FlotCtrlPackageImpl theFlotCtrlPackage = (FlotCtrlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlotCtrlPackage.eNS_URI) instanceof FlotCtrlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlotCtrlPackage.eNS_URI) : FlotCtrlPackage.eINSTANCE);

		// Create package meta-data objects
		theRobotPackage.createPackageContents();
		theRobotPackage_1.createPackageContents();
		theFlotCtrlPackage.createPackageContents();

		// Initialize created meta-data
		theRobotPackage.initializePackageContents();
		theRobotPackage_1.initializePackageContents();
		theFlotCtrlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotPackage.eNS_URI, theRobotPackage);
		return theRobotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveCmd() {
		return moveCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveCmd_Power() {
		return (EAttribute)moveCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacleCmd() {
		return obstacleCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObstacleCmd_Distance() {
		return (EAttribute)obstacleCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBip() {
		return bipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBip_Duration() {
		return (EAttribute)bipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBip_Power() {
		return (EAttribute)bipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBip_Repet() {
		return (EAttribute)bipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTurnAngleCmd() {
		return setTurnAngleCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetTurnAngleCmd_Angle() {
		return (EAttribute)setTurnAngleCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasTurnedCmd() {
		return hasTurnedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasTurnedCmd_Angle() {
		return (EAttribute)hasTurnedCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnCmd() {
		return turnCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnCmd_Power() {
		return (EAttribute)turnCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnCmd_Angle() {
		return (EAttribute)turnCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopEngineCmd() {
		return stopEngineCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopProgramCmd() {
		return stopProgramCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintCmd() {
		return printCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintCmd_Msg() {
		return (EAttribute)printCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintCmd_Duration() {
		return (EAttribute)printCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintCmd_Line() {
		return (EAttribute)printCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintCmd_Col() {
		return (EAttribute)printCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotFactory getRobotFactory() {
		return (RobotFactory)getEFactoryInstance();
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
		commandEClass = createEClass(COMMAND);

		moveCmdEClass = createEClass(MOVE_CMD);
		createEAttribute(moveCmdEClass, MOVE_CMD__POWER);

		obstacleCmdEClass = createEClass(OBSTACLE_CMD);
		createEAttribute(obstacleCmdEClass, OBSTACLE_CMD__DISTANCE);

		bipEClass = createEClass(BIP);
		createEAttribute(bipEClass, BIP__DURATION);
		createEAttribute(bipEClass, BIP__POWER);
		createEAttribute(bipEClass, BIP__REPET);

		setTurnAngleCmdEClass = createEClass(SET_TURN_ANGLE_CMD);
		createEAttribute(setTurnAngleCmdEClass, SET_TURN_ANGLE_CMD__ANGLE);

		hasTurnedCmdEClass = createEClass(HAS_TURNED_CMD);
		createEAttribute(hasTurnedCmdEClass, HAS_TURNED_CMD__ANGLE);

		turnCmdEClass = createEClass(TURN_CMD);
		createEAttribute(turnCmdEClass, TURN_CMD__POWER);
		createEAttribute(turnCmdEClass, TURN_CMD__ANGLE);

		stopEngineCmdEClass = createEClass(STOP_ENGINE_CMD);

		stopProgramCmdEClass = createEClass(STOP_PROGRAM_CMD);

		printCmdEClass = createEClass(PRINT_CMD);
		createEAttribute(printCmdEClass, PRINT_CMD__MSG);
		createEAttribute(printCmdEClass, PRINT_CMD__DURATION);
		createEAttribute(printCmdEClass, PRINT_CMD__LINE);
		createEAttribute(printCmdEClass, PRINT_CMD__COL);
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

		// Obtain other dependent packages
		FlotCtrlPackage theFlotCtrlPackage = (FlotCtrlPackage)EPackage.Registry.INSTANCE.getEPackage(FlotCtrlPackage.eNS_URI);
		robot.RobotPackage theRobotPackage_1 = (robot.RobotPackage)EPackage.Registry.INSTANCE.getEPackage(robot.RobotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandEClass.getESuperTypes().add(theFlotCtrlPackage.getExpression());
		moveCmdEClass.getESuperTypes().add(this.getCommand());
		obstacleCmdEClass.getESuperTypes().add(theFlotCtrlPackage.getBoolExp());
		obstacleCmdEClass.getESuperTypes().add(this.getCommand());
		bipEClass.getESuperTypes().add(this.getCommand());
		setTurnAngleCmdEClass.getESuperTypes().add(this.getCommand());
		hasTurnedCmdEClass.getESuperTypes().add(theFlotCtrlPackage.getBoolExp());
		hasTurnedCmdEClass.getESuperTypes().add(this.getCommand());
		turnCmdEClass.getESuperTypes().add(this.getCommand());
		stopEngineCmdEClass.getESuperTypes().add(this.getCommand());
		stopProgramCmdEClass.getESuperTypes().add(this.getCommand());
		printCmdEClass.getESuperTypes().add(this.getCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveCmdEClass, MoveCmd.class, "MoveCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveCmd_Power(), theRobotPackage_1.getDouble(), "power", null, 1, 1, MoveCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstacleCmdEClass, ObstacleCmd.class, "ObstacleCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObstacleCmd_Distance(), theRobotPackage_1.getDouble(), "distance", null, 1, 1, ObstacleCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bipEClass, Bip.class, "Bip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBip_Duration(), theRobotPackage_1.getInt(), "duration", null, 1, 1, Bip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBip_Power(), theRobotPackage_1.getDouble(), "power", null, 1, 1, Bip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBip_Repet(), theRobotPackage_1.getBool(), "repet", null, 1, 1, Bip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTurnAngleCmdEClass, SetTurnAngleCmd.class, "SetTurnAngleCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetTurnAngleCmd_Angle(), theRobotPackage_1.getDouble(), "angle", null, 1, 1, SetTurnAngleCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasTurnedCmdEClass, HasTurnedCmd.class, "HasTurnedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasTurnedCmd_Angle(), theRobotPackage_1.getDouble(), "angle", null, 1, 1, HasTurnedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnCmdEClass, TurnCmd.class, "TurnCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnCmd_Power(), theRobotPackage_1.getDouble(), "power", null, 1, 1, TurnCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnCmd_Angle(), theRobotPackage_1.getDouble(), "angle", null, 1, 1, TurnCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEngineCmdEClass, StopEngineCmd.class, "StopEngineCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopProgramCmdEClass, StopProgramCmd.class, "StopProgramCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printCmdEClass, PrintCmd.class, "PrintCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintCmd_Msg(), theRobotPackage_1.getString(), "msg", null, 1, 1, PrintCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrintCmd_Duration(), theRobotPackage_1.getInt(), "duration", null, 1, 1, PrintCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrintCmd_Line(), theRobotPackage_1.getInt(), "line", null, 1, 1, PrintCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrintCmd_Col(), theRobotPackage_1.getInt(), "col", null, 1, 1, PrintCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RobotPackageImpl
