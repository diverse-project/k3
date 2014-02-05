/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A representation for a range in a document where a terminal (i.e., a
 * placeholder or a keyword) is expected. The range is expressed using two
 * integers denoting the start of the range including hidden tokens (e.g.,
 * whitespace) and excluding those token (i.e., the part of the document
 * containing the relevant characters).
 */
public class ExpArithmtxtExpectedTerminal {
	
	/**
	 * Run the attachment code to create a model the reflects the state that would be
	 * reached if the completion was executed. This is required, because different
	 * completions can yield different models.
	 */
	private Runnable attachmentCode;
	
	private int followSetID;
	private org.eclipse.emf.ecore.EObject container;
	private expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement terminal;
	private int startIncludingHiddenTokens;
	private int startExcludingHiddenTokens;
	private String prefix;
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace containmentTrace;
	
	public ExpArithmtxtExpectedTerminal(org.eclipse.emf.ecore.EObject container, expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement terminal, int followSetID, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace containmentTrace) {
		super();
		this.container = container;
		this.terminal = terminal;
		this.followSetID = followSetID;
		this.containmentTrace = containmentTrace;
	}
	
	public Runnable getAttachmentCode() {
		return attachmentCode;
	}
	
	public void setAttachmentCode(Runnable attachmentCode) {
		this.attachmentCode = attachmentCode;
	}
	
	public int getFollowSetID() {
		return followSetID;
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement getTerminal() {
		return terminal;
	}
	
	public String toString() {
		return terminal == null ? "null" : terminal.toString() + " at " + startIncludingHiddenTokens + "/" + startExcludingHiddenTokens;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		ExpArithmtxtExpectedTerminal otherExpectedTerminal = (ExpArithmtxtExpectedTerminal) o;
		if (this.container == null && otherExpectedTerminal.container != null) {
			return false;
		}
		boolean containersBothNull = this.container == null && otherExpectedTerminal.container == null;
		return this.terminal.equals((otherExpectedTerminal).terminal) && (containersBothNull || this.container.equals(otherExpectedTerminal.container));
	}
	
	@Override	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((container == null) ? 0 : container.hashCode());
		result = prime * result + ((terminal == null) ? 0 : terminal.hashCode());
		return result;
	}
	
	public void setPosition(int startIncludingHiddenTokens, int startExcludingHiddenTokens) {
		assert this.startExcludingHiddenTokens <= startExcludingHiddenTokens;
		assert this.startIncludingHiddenTokens <= startExcludingHiddenTokens;
		this.startIncludingHiddenTokens = startIncludingHiddenTokens;
		this.startExcludingHiddenTokens = startExcludingHiddenTokens;
	}
	
	public int getStartIncludingHiddenTokens() {
		return startIncludingHiddenTokens;
	}
	
	public int getStartExcludingHiddenTokens() {
		return startExcludingHiddenTokens;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace getContainmentTrace() {
		return containmentTrace;
	}
	
	public org.eclipse.emf.ecore.EObject getContainer() {
		return container;
	}
	
	/**
	 * This method creates a model that reflects the state that would be obtained if
	 * this proposal was accepted. This model can differ from the current model,
	 * because different proposals can result in different models. The code that is
	 * passed as argument is executed once the (changed) model was created. After
	 * executing the given code, all changes are reverted.
	 */
	public void materialize(Runnable code) {
		org.eclipse.emf.ecore.EObject root = org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(getContainer());
		if (root == null) {
			code.run();
			return;
		}
		org.eclipse.emf.ecore.change.util.ChangeRecorder recorder = new org.eclipse.emf.ecore.change.util.ChangeRecorder();
		recorder.beginRecording(java.util.Collections.singleton(root));
		
		// attach proposal model fragment to main model
		Runnable attachmentCode = getAttachmentCode();
		if (attachmentCode != null) {
			// Applying attachment code
			attachmentCode.run();
		}
		
		org.eclipse.emf.ecore.change.ChangeDescription changes = recorder.endRecording();
		code.run();
		// revert changes
		changes.apply();
	}
	
}
