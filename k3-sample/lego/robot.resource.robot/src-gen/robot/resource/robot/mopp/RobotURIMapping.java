/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

/**
 * A basic implementation of the robot.resource.robot.IRobotURIMapping interface
 * that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * robot.resource.robot.IRobotURIMapping.
 */
public class RobotURIMapping<ReferenceType> implements robot.resource.robot.IRobotURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public RobotURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
