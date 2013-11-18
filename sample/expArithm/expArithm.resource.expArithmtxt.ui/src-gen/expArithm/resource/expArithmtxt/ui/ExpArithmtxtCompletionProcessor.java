/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private expArithm.resource.expArithmtxt.IExpArithmtxtResourceProvider resourceProvider;
	private expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandlerProvider bracketHandlerProvider;
	
	public ExpArithmtxtCompletionProcessor(expArithm.resource.expArithmtxt.IExpArithmtxtResourceProvider resourceProvider, expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		expArithm.resource.expArithmtxt.IExpArithmtxtTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeCompletionHelper helper = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeCompletionHelper();
		expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		expArithm.resource.expArithmtxt.ui.ExpArithmtxtProposalPostProcessor proposalPostProcessor = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtProposalPostProcessor();
		java.util.List<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal> finalProposalList = new java.util.ArrayList<expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal>();
		for (expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (expArithm.resource.expArithmtxt.ui.ExpArithmtxtCompletionProposal proposal : finalProposalList) {
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
			expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
