/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IExpArithmtxtParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>> getPostParseCommands();
	
}
