/**
 */
package expArithm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see expArithm.ExpArithmFactory
 * @model kind="package"
 * @generated
 */
public interface ExpArithmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expArithm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://expArithm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expArithm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpArithmPackage eINSTANCE = expArithm.impl.ExpArithmPackageImpl.init();

	/**
	 * The meta object id for the '{@link expArithm.impl.ExpressionArithmImpl <em>Expression Arithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.ExpressionArithmImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getExpressionArithm()
	 * @generated
	 */
	int EXPRESSION_ARITHM = 0;

	/**
	 * The feature id for the '<em><b>Racine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ARITHM__RACINE = 0;

	/**
	 * The number of structural features of the '<em>Expression Arithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ARITHM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link expArithm.impl.EltExpImpl <em>Elt Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.EltExpImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getEltExp()
	 * @generated
	 */
	int ELT_EXP = 1;

	/**
	 * The number of structural features of the '<em>Elt Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELT_EXP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link expArithm.impl.OperateurBinaireImpl <em>Operateur Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.OperateurBinaireImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getOperateurBinaire()
	 * @generated
	 */
	int OPERATEUR_BINAIRE = 2;

	/**
	 * The feature id for the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE__ELT_GAUCHE = ELT_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE__ELT_DROIT = ELT_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operateur Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE_FEATURE_COUNT = ELT_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link expArithm.impl.ValeurImpl <em>Valeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.ValeurImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getValeur()
	 * @generated
	 */
	int VALEUR = 3;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEUR__VALEUR = ELT_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEUR_FEATURE_COUNT = ELT_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link expArithm.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.PlusImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 4;

	/**
	 * The feature id for the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__ELT_GAUCHE = OPERATEUR_BINAIRE__ELT_GAUCHE;

	/**
	 * The feature id for the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__ELT_DROIT = OPERATEUR_BINAIRE__ELT_DROIT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link expArithm.impl.MoinsImpl <em>Moins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.MoinsImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getMoins()
	 * @generated
	 */
	int MOINS = 5;

	/**
	 * The feature id for the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOINS__ELT_GAUCHE = OPERATEUR_BINAIRE__ELT_GAUCHE;

	/**
	 * The feature id for the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOINS__ELT_DROIT = OPERATEUR_BINAIRE__ELT_DROIT;

	/**
	 * The number of structural features of the '<em>Moins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOINS_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link expArithm.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.MultImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 6;

	/**
	 * The feature id for the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__ELT_GAUCHE = OPERATEUR_BINAIRE__ELT_GAUCHE;

	/**
	 * The feature id for the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__ELT_DROIT = OPERATEUR_BINAIRE__ELT_DROIT;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link expArithm.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see expArithm.impl.DivisionImpl
	 * @see expArithm.impl.ExpArithmPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 7;

	/**
	 * The feature id for the '<em><b>Elt Gauche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ELT_GAUCHE = OPERATEUR_BINAIRE__ELT_GAUCHE;

	/**
	 * The feature id for the '<em><b>Elt Droit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ELT_DROIT = OPERATEUR_BINAIRE__ELT_DROIT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see expArithm.impl.ExpArithmPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 8;


	/**
	 * Returns the meta object for class '{@link expArithm.ExpressionArithm <em>Expression Arithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Arithm</em>'.
	 * @see expArithm.ExpressionArithm
	 * @generated
	 */
	EClass getExpressionArithm();

	/**
	 * Returns the meta object for the containment reference '{@link expArithm.ExpressionArithm#getRacine <em>Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Racine</em>'.
	 * @see expArithm.ExpressionArithm#getRacine()
	 * @see #getExpressionArithm()
	 * @generated
	 */
	EReference getExpressionArithm_Racine();

	/**
	 * Returns the meta object for class '{@link expArithm.EltExp <em>Elt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elt Exp</em>'.
	 * @see expArithm.EltExp
	 * @generated
	 */
	EClass getEltExp();

	/**
	 * Returns the meta object for class '{@link expArithm.OperateurBinaire <em>Operateur Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Binaire</em>'.
	 * @see expArithm.OperateurBinaire
	 * @generated
	 */
	EClass getOperateurBinaire();

	/**
	 * Returns the meta object for the containment reference '{@link expArithm.OperateurBinaire#getEltGauche <em>Elt Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elt Gauche</em>'.
	 * @see expArithm.OperateurBinaire#getEltGauche()
	 * @see #getOperateurBinaire()
	 * @generated
	 */
	EReference getOperateurBinaire_EltGauche();

	/**
	 * Returns the meta object for the containment reference '{@link expArithm.OperateurBinaire#getEltDroit <em>Elt Droit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elt Droit</em>'.
	 * @see expArithm.OperateurBinaire#getEltDroit()
	 * @see #getOperateurBinaire()
	 * @generated
	 */
	EReference getOperateurBinaire_EltDroit();

	/**
	 * Returns the meta object for class '{@link expArithm.Valeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valeur</em>'.
	 * @see expArithm.Valeur
	 * @generated
	 */
	EClass getValeur();

	/**
	 * Returns the meta object for the attribute '{@link expArithm.Valeur#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see expArithm.Valeur#getValeur()
	 * @see #getValeur()
	 * @generated
	 */
	EAttribute getValeur_Valeur();

	/**
	 * Returns the meta object for class '{@link expArithm.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see expArithm.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link expArithm.Moins <em>Moins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moins</em>'.
	 * @see expArithm.Moins
	 * @generated
	 */
	EClass getMoins();

	/**
	 * Returns the meta object for class '{@link expArithm.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see expArithm.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link expArithm.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see expArithm.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpArithmFactory getExpArithmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link expArithm.impl.ExpressionArithmImpl <em>Expression Arithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.ExpressionArithmImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getExpressionArithm()
		 * @generated
		 */
		EClass EXPRESSION_ARITHM = eINSTANCE.getExpressionArithm();

		/**
		 * The meta object literal for the '<em><b>Racine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ARITHM__RACINE = eINSTANCE.getExpressionArithm_Racine();

		/**
		 * The meta object literal for the '{@link expArithm.impl.EltExpImpl <em>Elt Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.EltExpImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getEltExp()
		 * @generated
		 */
		EClass ELT_EXP = eINSTANCE.getEltExp();

		/**
		 * The meta object literal for the '{@link expArithm.impl.OperateurBinaireImpl <em>Operateur Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.OperateurBinaireImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getOperateurBinaire()
		 * @generated
		 */
		EClass OPERATEUR_BINAIRE = eINSTANCE.getOperateurBinaire();

		/**
		 * The meta object literal for the '<em><b>Elt Gauche</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATEUR_BINAIRE__ELT_GAUCHE = eINSTANCE.getOperateurBinaire_EltGauche();

		/**
		 * The meta object literal for the '<em><b>Elt Droit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATEUR_BINAIRE__ELT_DROIT = eINSTANCE.getOperateurBinaire_EltDroit();

		/**
		 * The meta object literal for the '{@link expArithm.impl.ValeurImpl <em>Valeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.ValeurImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getValeur()
		 * @generated
		 */
		EClass VALEUR = eINSTANCE.getValeur();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALEUR__VALEUR = eINSTANCE.getValeur_Valeur();

		/**
		 * The meta object literal for the '{@link expArithm.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.PlusImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link expArithm.impl.MoinsImpl <em>Moins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.MoinsImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getMoins()
		 * @generated
		 */
		EClass MOINS = eINSTANCE.getMoins();

		/**
		 * The meta object literal for the '{@link expArithm.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.MultImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link expArithm.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see expArithm.impl.DivisionImpl
		 * @see expArithm.impl.ExpArithmPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see expArithm.impl.ExpArithmPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

	}

} //ExpArithmPackage
