/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtBuilder implements expArithm.resource.expArithmtxt.IExpArithmtxtBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		// change this to return true to enable building of all resources
		return false;
	}
	
	public org.eclipse.core.runtime.IStatus build(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// set option overrideBuilder to 'false' and then perform build here
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
	/**
	 * Handles the deletion of the given resource.
	 */
	public org.eclipse.core.runtime.IStatus handleDeletion(org.eclipse.emf.common.util.URI uri, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// by default nothing is done when a resource is deleted
		return org.eclipse.core.runtime.Status.OK_STATUS;
	}
	
}
