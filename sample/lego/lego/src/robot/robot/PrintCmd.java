/**
 */
package robot.robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.robot.PrintCmd#getMsg <em>Msg</em>}</li>
 *   <li>{@link robot.robot.PrintCmd#getDuration <em>Duration</em>}</li>
 *   <li>{@link robot.robot.PrintCmd#getLine <em>Line</em>}</li>
 *   <li>{@link robot.robot.PrintCmd#getCol <em>Col</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.robot.RobotPackage#getPrintCmd()
 * @model
 * @generated
 */
public interface PrintCmd extends Command {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see robot.robot.RobotPackage#getPrintCmd_Msg()
	 * @model dataType="robot.String" required="true"
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link robot.robot.PrintCmd#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see robot.robot.RobotPackage#getPrintCmd_Duration()
	 * @model dataType="robot.Int" required="true"
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link robot.robot.PrintCmd#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(Integer)
	 * @see robot.robot.RobotPackage#getPrintCmd_Line()
	 * @model dataType="robot.Int" required="true"
	 * @generated
	 */
	Integer getLine();

	/**
	 * Sets the value of the '{@link robot.robot.PrintCmd#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Integer value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(Integer)
	 * @see robot.robot.RobotPackage#getPrintCmd_Col()
	 * @model dataType="robot.Int" required="true"
	 * @generated
	 */
	Integer getCol();

	/**
	 * Sets the value of the '{@link robot.robot.PrintCmd#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(Integer value);

} // PrintCmd
