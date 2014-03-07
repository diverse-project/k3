/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IRobotParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>> getPostParseCommands();
	
}
