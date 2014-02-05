/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IRobotExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public robot.resource.robot.grammar.RobotSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(robot.resource.robot.IRobotExpectedElement follower, robot.resource.robot.mopp.RobotContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>> getFollowers();
	
}
