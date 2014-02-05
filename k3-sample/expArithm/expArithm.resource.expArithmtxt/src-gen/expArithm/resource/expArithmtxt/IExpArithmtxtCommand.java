/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IExpArithmtxtCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
