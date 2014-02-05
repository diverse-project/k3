/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IExpArithmtxtResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public expArithm.resource.expArithmtxt.IExpArithmtxtResourcePostProcessor getResourcePostProcessor();
	
}
