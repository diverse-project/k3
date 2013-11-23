/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotParseResult implements robot.resource.robot.IRobotParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>> commands = new java.util.ArrayList<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>>();
	
	public RobotParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
