/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotProblem implements robot.resource.robot.IRobotProblem {
	
	private String message;
	private robot.resource.robot.RobotEProblemType type;
	private robot.resource.robot.RobotEProblemSeverity severity;
	private java.util.Collection<robot.resource.robot.IRobotQuickFix> quickFixes;
	
	public RobotProblem(String message, robot.resource.robot.RobotEProblemType type, robot.resource.robot.RobotEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<robot.resource.robot.IRobotQuickFix>emptySet());
	}
	
	public RobotProblem(String message, robot.resource.robot.RobotEProblemType type, robot.resource.robot.RobotEProblemSeverity severity, robot.resource.robot.IRobotQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public RobotProblem(String message, robot.resource.robot.RobotEProblemType type, robot.resource.robot.RobotEProblemSeverity severity, java.util.Collection<robot.resource.robot.IRobotQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<robot.resource.robot.IRobotQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public robot.resource.robot.RobotEProblemType getType() {
		return type;
	}
	
	public robot.resource.robot.RobotEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<robot.resource.robot.IRobotQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
