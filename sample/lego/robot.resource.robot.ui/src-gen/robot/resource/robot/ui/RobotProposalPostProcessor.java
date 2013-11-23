/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class RobotProposalPostProcessor {
	
	public java.util.List<robot.resource.robot.ui.RobotCompletionProposal> process(java.util.List<robot.resource.robot.ui.RobotCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
