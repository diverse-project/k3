/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.debug;

public class RobotSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new robot.resource.robot.debug.RobotSourceLookupParticipant()});
	}
	
}
