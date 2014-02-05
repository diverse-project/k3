/**
 */
package robot.robot;

import robot.FlotCtrl.BoolExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.ObstacleCmd#getDistance <em>Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getObstacleCmd()
 * @model
 * @generated
 */
public interface ObstacleCmd extends BoolExp, Command {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Double)
	 * @see robot.robot.RobotPackage#getObstacleCmd_Distance()
	 * @model dataType="robot.Double" required="true"
	 * @generated
	 */
	Double getDistance();

	/**
	 * Sets the value of the '{@link robot.robot.ObstacleCmd#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Double value);

} // ObstacleCmd
