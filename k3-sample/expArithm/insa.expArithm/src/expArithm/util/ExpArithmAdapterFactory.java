/**
 */
package expArithm.util;

import expArithm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see expArithm.ExpArithmPackage
 * @generated
 */
public class ExpArithmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpArithmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpArithmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpArithmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpArithmSwitch<Adapter> modelSwitch =
		new ExpArithmSwitch<Adapter>() {
			@Override
			public Adapter caseExpressionArithm(ExpressionArithm object) {
				return createExpressionArithmAdapter();
			}
			@Override
			public Adapter caseEltExp(EltExp object) {
				return createEltExpAdapter();
			}
			@Override
			public Adapter caseOperateurBinaire(OperateurBinaire object) {
				return createOperateurBinaireAdapter();
			}
			@Override
			public Adapter caseValeur(Valeur object) {
				return createValeurAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseMoins(Moins object) {
				return createMoinsAdapter();
			}
			@Override
			public Adapter caseMult(Mult object) {
				return createMultAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link expArithm.ExpressionArithm <em>Expression Arithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.ExpressionArithm
	 * @generated
	 */
	public Adapter createExpressionArithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.EltExp <em>Elt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.EltExp
	 * @generated
	 */
	public Adapter createEltExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.OperateurBinaire <em>Operateur Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.OperateurBinaire
	 * @generated
	 */
	public Adapter createOperateurBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.Valeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.Valeur
	 * @generated
	 */
	public Adapter createValeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.Moins <em>Moins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.Moins
	 * @generated
	 */
	public Adapter createMoinsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.Mult
	 * @generated
	 */
	public Adapter createMultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link expArithm.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see expArithm.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExpArithmAdapterFactory
