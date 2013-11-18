/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class ExpArithmtxtContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements expArithm.resource.expArithmtxt.IExpArithmtxtContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public ExpArithmtxtContextDependentURIFragmentFactory(expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
