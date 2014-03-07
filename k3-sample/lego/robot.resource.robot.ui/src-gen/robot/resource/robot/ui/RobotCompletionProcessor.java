/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui;

public class RobotCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private robot.resource.robot.IRobotResourceProvider resourceProvider;
	private robot.resource.robot.ui.IRobotBracketHandlerProvider bracketHandlerProvider;
	
	public RobotCompletionProcessor(robot.resource.robot.IRobotResourceProvider resourceProvider, robot.resource.robot.ui.IRobotBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		robot.resource.robot.IRobotTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		robot.resource.robot.ui.RobotCodeCompletionHelper helper = new robot.resource.robot.ui.RobotCodeCompletionHelper();
		robot.resource.robot.ui.RobotCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		robot.resource.robot.ui.RobotProposalPostProcessor proposalPostProcessor = new robot.resource.robot.ui.RobotProposalPostProcessor();
		java.util.List<robot.resource.robot.ui.RobotCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<robot.resource.robot.ui.RobotCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<robot.resource.robot.ui.RobotCompletionProposal> finalProposalList = new java.util.ArrayList<robot.resource.robot.ui.RobotCompletionProposal>();
		for (robot.resource.robot.ui.RobotCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (robot.resource.robot.ui.RobotCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			robot.resource.robot.ui.IRobotBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
