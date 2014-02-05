/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.debug;

public class ExpArithmtxtSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new expArithm.resource.expArithmtxt.debug.ExpArithmtxtSourceLookupParticipant()});
	}
	
}
