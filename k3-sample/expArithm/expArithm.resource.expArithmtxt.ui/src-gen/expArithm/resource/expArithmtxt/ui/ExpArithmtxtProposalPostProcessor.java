/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ExpArithmtxtProposalPostProcessor {
	
	public java.util.List<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal> process(java.util.List<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
