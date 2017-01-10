/**
 */
package vmlogo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see vmlogo.VmlogoFactory
 * @model kind="package"
 * @generated
 */
public interface VmlogoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmlogo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://vmlogo/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vmlogo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmlogoPackage eINSTANCE = vmlogo.impl.VmlogoPackageImpl.init();

	/**
	 * The meta object id for the '{@link vmlogo.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.ContextImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Turtle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TURTLE = 0;

	/**
	 * The feature id for the '<em><b>Call Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CALL_STACK = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vmlogo.impl.TurtleImpl <em>Turtle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.TurtleImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getTurtle()
	 * @generated
	 */
	int TURTLE = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__HEADING = 1;

	/**
	 * The feature id for the '<em><b>Pen Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__PEN_UP = 2;

	/**
	 * The feature id for the '<em><b>Drawings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__DRAWINGS = 3;

	/**
	 * The number of structural features of the '<em>Turtle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Turtle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vmlogo.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.PointImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vmlogo.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.SegmentImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__END = 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vmlogo.impl.CallStackImpl <em>Call Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.CallStackImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getCallStack()
	 * @generated
	 */
	int CALL_STACK = 4;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STACK__FRAMES = 0;

	/**
	 * The number of structural features of the '<em>Call Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Call Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vmlogo.impl.StackFrameImpl <em>Stack Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmlogo.impl.StackFrameImpl
	 * @see vmlogo.impl.VmlogoPackageImpl#getStackFrame()
	 * @generated
	 */
	int STACK_FRAME = 5;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FRAME__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Stack Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FRAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stack Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FRAME_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link vmlogo.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see vmlogo.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Context#getTurtle <em>Turtle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Turtle</em>'.
	 * @see vmlogo.Context#getTurtle()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Turtle();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Context#getCallStack <em>Call Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Stack</em>'.
	 * @see vmlogo.Context#getCallStack()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_CallStack();

	/**
	 * Returns the meta object for class '{@link vmlogo.Turtle <em>Turtle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtle</em>'.
	 * @see vmlogo.Turtle
	 * @generated
	 */
	EClass getTurtle();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Turtle#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see vmlogo.Turtle#getPosition()
	 * @see #getTurtle()
	 * @generated
	 */
	EReference getTurtle_Position();

	/**
	 * Returns the meta object for the attribute '{@link vmlogo.Turtle#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see vmlogo.Turtle#getHeading()
	 * @see #getTurtle()
	 * @generated
	 */
	EAttribute getTurtle_Heading();

	/**
	 * Returns the meta object for the attribute '{@link vmlogo.Turtle#isPenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pen Up</em>'.
	 * @see vmlogo.Turtle#isPenUp()
	 * @see #getTurtle()
	 * @generated
	 */
	EAttribute getTurtle_PenUp();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Turtle#getDrawings <em>Drawings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawings</em>'.
	 * @see vmlogo.Turtle#getDrawings()
	 * @see #getTurtle()
	 * @generated
	 */
	EReference getTurtle_Drawings();

	/**
	 * Returns the meta object for class '{@link vmlogo.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see vmlogo.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link vmlogo.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see vmlogo.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link vmlogo.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see vmlogo.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link vmlogo.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see vmlogo.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Segment#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see vmlogo.Segment#getBegin()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.Segment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see vmlogo.Segment#getEnd()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_End();

	/**
	 * Returns the meta object for class '{@link vmlogo.CallStack <em>Call Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Stack</em>'.
	 * @see vmlogo.CallStack
	 * @generated
	 */
	EClass getCallStack();

	/**
	 * Returns the meta object for the containment reference '{@link vmlogo.CallStack#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frames</em>'.
	 * @see vmlogo.CallStack#getFrames()
	 * @see #getCallStack()
	 * @generated
	 */
	EReference getCallStack_Frames();

	/**
	 * Returns the meta object for class '{@link vmlogo.StackFrame <em>Stack Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Frame</em>'.
	 * @see vmlogo.StackFrame
	 * @generated
	 */
	EClass getStackFrame();

	/**
	 * Returns the meta object for the attribute '{@link vmlogo.StackFrame#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables</em>'.
	 * @see vmlogo.StackFrame#getVariables()
	 * @see #getStackFrame()
	 * @generated
	 */
	EAttribute getStackFrame_Variables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmlogoFactory getVmlogoFactory();

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
		 * The meta object literal for the '{@link vmlogo.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.ContextImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Turtle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TURTLE = eINSTANCE.getContext_Turtle();

		/**
		 * The meta object literal for the '<em><b>Call Stack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CALL_STACK = eINSTANCE.getContext_CallStack();

		/**
		 * The meta object literal for the '{@link vmlogo.impl.TurtleImpl <em>Turtle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.TurtleImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getTurtle()
		 * @generated
		 */
		EClass TURTLE = eINSTANCE.getTurtle();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE__POSITION = eINSTANCE.getTurtle_Position();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLE__HEADING = eINSTANCE.getTurtle_Heading();

		/**
		 * The meta object literal for the '<em><b>Pen Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLE__PEN_UP = eINSTANCE.getTurtle_PenUp();

		/**
		 * The meta object literal for the '<em><b>Drawings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE__DRAWINGS = eINSTANCE.getTurtle_Drawings();

		/**
		 * The meta object literal for the '{@link vmlogo.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.PointImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link vmlogo.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.SegmentImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__BEGIN = eINSTANCE.getSegment_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__END = eINSTANCE.getSegment_End();

		/**
		 * The meta object literal for the '{@link vmlogo.impl.CallStackImpl <em>Call Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.CallStackImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getCallStack()
		 * @generated
		 */
		EClass CALL_STACK = eINSTANCE.getCallStack();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_STACK__FRAMES = eINSTANCE.getCallStack_Frames();

		/**
		 * The meta object literal for the '{@link vmlogo.impl.StackFrameImpl <em>Stack Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmlogo.impl.StackFrameImpl
		 * @see vmlogo.impl.VmlogoPackageImpl#getStackFrame()
		 * @generated
		 */
		EClass STACK_FRAME = eINSTANCE.getStackFrame();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_FRAME__VARIABLES = eINSTANCE.getStackFrame_Variables();

	}

} //VmlogoPackage
