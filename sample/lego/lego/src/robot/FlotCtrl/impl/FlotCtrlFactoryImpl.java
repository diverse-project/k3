/**
 */
package robot.FlotCtrl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robot.FlotCtrl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlotCtrlFactoryImpl extends EFactoryImpl implements FlotCtrlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlotCtrlFactory init() {
		try {
			FlotCtrlFactory theFlotCtrlFactory = (FlotCtrlFactory)EPackage.Registry.INSTANCE.getEFactory(FlotCtrlPackage.eNS_URI);
			if (theFlotCtrlFactory != null) {
				return theFlotCtrlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlotCtrlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotCtrlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FlotCtrlPackage.WHILE_LOOP: return createWhileLoop();
			case FlotCtrlPackage.NEG_EXP: return createNegExp();
			case FlotCtrlPackage.AND_EXP: return createAndExp();
			case FlotCtrlPackage.IF_BLOCK: return createIfBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegExp createNegExp() {
		NegExpImpl negExp = new NegExpImpl();
		return negExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExp createAndExp() {
		AndExpImpl andExp = new AndExpImpl();
		return andExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBlock createIfBlock() {
		IfBlockImpl ifBlock = new IfBlockImpl();
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotCtrlPackage getFlotCtrlPackage() {
		return (FlotCtrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlotCtrlPackage getPackage() {
		return FlotCtrlPackage.eINSTANCE;
	}

} //FlotCtrlFactoryImpl
