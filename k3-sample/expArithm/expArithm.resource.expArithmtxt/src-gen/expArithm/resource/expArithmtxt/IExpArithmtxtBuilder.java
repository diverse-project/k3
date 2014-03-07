/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * An interface for builders that can be used to perform operations when resources
 * are changed and saved. This is an abstraction over the Eclipse builder API that
 * is specifically designed for building resources that contain EMF models.
 */
public interface IExpArithmtxtBuilder {
	
	/**
	 * Check whether building the resource with the given URI is needed.This method
	 * allows to excluded resource from the build process before these are actually
	 * loaded. If this method returns false, the build() method will not be invoked
	 * for the resource located at the given URI.
	 */
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	/**
	 * Builds the given resource.
	 */
	public org.eclipse.core.runtime.IStatus build(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
	
	/**
	 * Handles the deletion of the given resource.
	 */
	public org.eclipse.core.runtime.IStatus handleDeletion(org.eclipse.emf.common.util.URI uri, org.eclipse.core.runtime.IProgressMonitor monitor);
	
}
