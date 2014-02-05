/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IRobotCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
