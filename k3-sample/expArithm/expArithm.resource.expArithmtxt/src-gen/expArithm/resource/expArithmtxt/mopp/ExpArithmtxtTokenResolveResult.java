/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class ExpArithmtxtTokenResolveResult implements expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public ExpArithmtxtTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
