/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IRobotResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public robot.resource.robot.IRobotTextResource getResource();
	
}
