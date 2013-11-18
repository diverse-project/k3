/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.debug;

public class ExpArithmtxtSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof expArithm.resource.expArithmtxt.debug.ExpArithmtxtStackFrame) {
			expArithm.resource.expArithmtxt.debug.ExpArithmtxtStackFrame frame = (expArithm.resource.expArithmtxt.debug.ExpArithmtxtStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
