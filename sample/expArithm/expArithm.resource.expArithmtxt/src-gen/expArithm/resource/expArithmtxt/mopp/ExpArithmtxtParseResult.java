/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtParseResult implements expArithm.resource.expArithmtxt.IExpArithmtxtParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>> commands = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>>();
	
	public ExpArithmtxtParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
