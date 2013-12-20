/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class RobotAbstractExpectedElement implements robot.resource.robot.IRobotExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>> followers = new java.util.LinkedHashSet<robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>>();
	
	public RobotAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(robot.resource.robot.IRobotExpectedElement follower, robot.resource.robot.mopp.RobotContainedFeature[] path) {
		followers.add(new robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
