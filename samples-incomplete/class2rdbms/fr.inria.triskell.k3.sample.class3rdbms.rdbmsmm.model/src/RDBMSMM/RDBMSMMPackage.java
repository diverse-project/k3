/**
 */
package RDBMSMM;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RDBMSMM.RDBMSMMFactory
 * @model kind="package"
 * @generated
 */
public interface RDBMSMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RDBMSMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/fr.irisa.triskell.kermeta.samples/class2RDBMS/metamodels/RDBMSMM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RDBMSMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDBMSMMPackage eINSTANCE = RDBMSMM.impl.RDBMSMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link RDBMSMM.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBMSMM.impl.TableImpl
	 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLS = 1;

	/**
	 * The feature id for the '<em><b>Pkey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PKEY = 2;

	/**
	 * The feature id for the '<em><b>Fkeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FKEYS = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RDBMSMM.impl.FKeyImpl <em>FKey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBMSMM.impl.FKeyImpl
	 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getFKey()
	 * @generated
	 */
	int FKEY = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FKEY__REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FKEY__COLS = 1;

	/**
	 * The number of structural features of the '<em>FKey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FKEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FKey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FKEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RDBMSMM.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBMSMM.impl.ColumnImpl
	 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RDBMSMM.impl.RDBMSModelImpl <em>RDBMS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RDBMSMM.impl.RDBMSModelImpl
	 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getRDBMSModel()
	 * @generated
	 */
	int RDBMS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL__TABLE = 0;

	/**
	 * The number of structural features of the '<em>RDBMS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDBMS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getString()
	 * @generated
	 */
	int STRING = 4;


	/**
	 * Returns the meta object for class '{@link RDBMSMM.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see RDBMSMM.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link RDBMSMM.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RDBMSMM.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link RDBMSMM.Table#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cols</em>'.
	 * @see RDBMSMM.Table#getCols()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Cols();

	/**
	 * Returns the meta object for the reference list '{@link RDBMSMM.Table#getPkey <em>Pkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pkey</em>'.
	 * @see RDBMSMM.Table#getPkey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Pkey();

	/**
	 * Returns the meta object for the containment reference list '{@link RDBMSMM.Table#getFkeys <em>Fkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fkeys</em>'.
	 * @see RDBMSMM.Table#getFkeys()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Fkeys();

	/**
	 * Returns the meta object for class '{@link RDBMSMM.FKey <em>FKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FKey</em>'.
	 * @see RDBMSMM.FKey
	 * @generated
	 */
	EClass getFKey();

	/**
	 * Returns the meta object for the reference '{@link RDBMSMM.FKey#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see RDBMSMM.FKey#getReferences()
	 * @see #getFKey()
	 * @generated
	 */
	EReference getFKey_References();

	/**
	 * Returns the meta object for the reference list '{@link RDBMSMM.FKey#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cols</em>'.
	 * @see RDBMSMM.FKey#getCols()
	 * @see #getFKey()
	 * @generated
	 */
	EReference getFKey_Cols();

	/**
	 * Returns the meta object for class '{@link RDBMSMM.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see RDBMSMM.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link RDBMSMM.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RDBMSMM.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link RDBMSMM.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RDBMSMM.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link RDBMSMM.RDBMSModel <em>RDBMS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDBMS Model</em>'.
	 * @see RDBMSMM.RDBMSModel
	 * @generated
	 */
	EClass getRDBMSModel();

	/**
	 * Returns the meta object for the containment reference list '{@link RDBMSMM.RDBMSModel#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see RDBMSMM.RDBMSModel#getTable()
	 * @see #getRDBMSModel()
	 * @generated
	 */
	EReference getRDBMSModel_Table();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDBMSMMFactory getRDBMSMMFactory();

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
		 * The meta object literal for the '{@link RDBMSMM.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBMSMM.impl.TableImpl
		 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLS = eINSTANCE.getTable_Cols();

		/**
		 * The meta object literal for the '<em><b>Pkey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PKEY = eINSTANCE.getTable_Pkey();

		/**
		 * The meta object literal for the '<em><b>Fkeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FKEYS = eINSTANCE.getTable_Fkeys();

		/**
		 * The meta object literal for the '{@link RDBMSMM.impl.FKeyImpl <em>FKey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBMSMM.impl.FKeyImpl
		 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getFKey()
		 * @generated
		 */
		EClass FKEY = eINSTANCE.getFKey();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FKEY__REFERENCES = eINSTANCE.getFKey_References();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FKEY__COLS = eINSTANCE.getFKey_Cols();

		/**
		 * The meta object literal for the '{@link RDBMSMM.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBMSMM.impl.ColumnImpl
		 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link RDBMSMM.impl.RDBMSModelImpl <em>RDBMS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RDBMSMM.impl.RDBMSModelImpl
		 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getRDBMSModel()
		 * @generated
		 */
		EClass RDBMS_MODEL = eINSTANCE.getRDBMSModel();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_MODEL__TABLE = eINSTANCE.getRDBMSModel_Table();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see RDBMSMM.impl.RDBMSMMPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //RDBMSMMPackage
