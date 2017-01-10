/**
 */
package vmlogo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vmlogo.Point;
import vmlogo.Segment;
import vmlogo.Turtle;
import vmlogo.VmlogoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.impl.TurtleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link vmlogo.impl.TurtleImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link vmlogo.impl.TurtleImpl#isPenUp <em>Pen Up</em>}</li>
 *   <li>{@link vmlogo.impl.TurtleImpl#getDrawings <em>Drawings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurtleImpl extends MinimalEObjectImpl.Container implements Turtle {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected double heading = HEADING_EDEFAULT;

	/**
	 * The default value of the '{@link #isPenUp() <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenUp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEN_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPenUp() <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenUp()
	 * @generated
	 * @ordered
	 */
	protected boolean penUp = PEN_UP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDrawings() <em>Drawings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawings()
	 * @generated
	 * @ordered
	 */
	protected Segment drawings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlogoPackage.Literals.TURTLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Point newPosition, NotificationChain msgs) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.TURTLE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.TURTLE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(double newHeading) {
		double oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__HEADING, oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPenUp() {
		return penUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenUp(boolean newPenUp) {
		boolean oldPenUp = penUp;
		penUp = newPenUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__PEN_UP, oldPenUp, penUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment getDrawings() {
		return drawings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrawings(Segment newDrawings, NotificationChain msgs) {
		Segment oldDrawings = drawings;
		drawings = newDrawings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__DRAWINGS, oldDrawings, newDrawings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawings(Segment newDrawings) {
		if (newDrawings != drawings) {
			NotificationChain msgs = null;
			if (drawings != null)
				msgs = ((InternalEObject)drawings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.TURTLE__DRAWINGS, null, msgs);
			if (newDrawings != null)
				msgs = ((InternalEObject)newDrawings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.TURTLE__DRAWINGS, null, msgs);
			msgs = basicSetDrawings(newDrawings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.TURTLE__DRAWINGS, newDrawings, newDrawings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmlogoPackage.TURTLE__POSITION:
				return basicSetPosition(null, msgs);
			case VmlogoPackage.TURTLE__DRAWINGS:
				return basicSetDrawings(null, msgs);
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
			case VmlogoPackage.TURTLE__POSITION:
				return getPosition();
			case VmlogoPackage.TURTLE__HEADING:
				return getHeading();
			case VmlogoPackage.TURTLE__PEN_UP:
				return isPenUp();
			case VmlogoPackage.TURTLE__DRAWINGS:
				return getDrawings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmlogoPackage.TURTLE__POSITION:
				setPosition((Point)newValue);
				return;
			case VmlogoPackage.TURTLE__HEADING:
				setHeading((Double)newValue);
				return;
			case VmlogoPackage.TURTLE__PEN_UP:
				setPenUp((Boolean)newValue);
				return;
			case VmlogoPackage.TURTLE__DRAWINGS:
				setDrawings((Segment)newValue);
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
			case VmlogoPackage.TURTLE__POSITION:
				setPosition((Point)null);
				return;
			case VmlogoPackage.TURTLE__HEADING:
				setHeading(HEADING_EDEFAULT);
				return;
			case VmlogoPackage.TURTLE__PEN_UP:
				setPenUp(PEN_UP_EDEFAULT);
				return;
			case VmlogoPackage.TURTLE__DRAWINGS:
				setDrawings((Segment)null);
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
			case VmlogoPackage.TURTLE__POSITION:
				return position != null;
			case VmlogoPackage.TURTLE__HEADING:
				return heading != HEADING_EDEFAULT;
			case VmlogoPackage.TURTLE__PEN_UP:
				return penUp != PEN_UP_EDEFAULT;
			case VmlogoPackage.TURTLE__DRAWINGS:
				return drawings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (heading: ");
		result.append(heading);
		result.append(", penUp: ");
		result.append(penUp);
		result.append(')');
		return result.toString();
	}

} //TurtleImpl
