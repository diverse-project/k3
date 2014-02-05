/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ExpArithmtxtResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource(uri);
	}
	
}
