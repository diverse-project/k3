/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot;

public interface IRobotProblem {
	public String getMessage();
	public robot.resource.robot.RobotEProblemSeverity getSeverity();
	public robot.resource.robot.RobotEProblemType getType();
	public java.util.Collection<robot.resource.robot.IRobotQuickFix> getQuickFixes();
}
