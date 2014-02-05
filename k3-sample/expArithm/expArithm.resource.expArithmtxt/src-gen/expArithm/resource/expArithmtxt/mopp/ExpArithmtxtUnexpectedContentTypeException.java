/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see expArithm.resource.expArithmtxt.IExpArithmtxtOptions.RESOURCE_CONTENT_TYPE
 */
public class ExpArithmtxtUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  ExpArithmtxtUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
