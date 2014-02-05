/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see expArithm.resource.expArithmtxt.IExpArithmtxtOptions
 */
public interface IExpArithmtxtDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
