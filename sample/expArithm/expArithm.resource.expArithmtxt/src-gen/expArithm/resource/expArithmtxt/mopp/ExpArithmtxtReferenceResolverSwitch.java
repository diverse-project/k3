/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtReferenceResolverSwitch implements expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(expArithm.resource.expArithmtxt.IExpArithmtxtOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new expArithm.resource.expArithmtxt.util.ExpArithmtxtRuntimeUtil().logWarning("Found value with invalid type for option " + expArithm.resource.expArithmtxt.IExpArithmtxtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver) {
			expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver replacingResolver = (expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver) resolverValue;
			if (replacingResolver instanceof expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof expArithm.resource.expArithmtxt.IExpArithmtxtReferenceCache) {
					expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver nextResolver = (expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolver) next;
					if (nextResolver instanceof expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new expArithm.resource.expArithmtxt.util.ExpArithmtxtRuntimeUtil().logWarning("Found value with invalid type in value map for option " + expArithm.resource.expArithmtxt.IExpArithmtxtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new expArithm.resource.expArithmtxt.util.ExpArithmtxtRuntimeUtil().logWarning("Found value with invalid type in value map for option " + expArithm.resource.expArithmtxt.IExpArithmtxtOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + expArithm.resource.expArithmtxt.IExpArithmtxtDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
