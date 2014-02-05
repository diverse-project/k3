/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.debug;

public class RobotSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof robot.resource.robot.debug.RobotStackFrame) {
			robot.resource.robot.debug.RobotStackFrame frame = (robot.resource.robot.debug.RobotStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
