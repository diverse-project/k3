/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotReferenceResolverSwitch implements robot.resource.robot.IRobotReferenceResolverSwitch {
	
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
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, robot.resource.robot.IRobotReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public robot.resource.robot.IRobotReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> robot.resource.robot.IRobotReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, robot.resource.robot.IRobotReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(robot.resource.robot.IRobotOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new robot.resource.robot.util.RobotRuntimeUtil().logWarning("Found value with invalid type for option " + robot.resource.robot.IRobotOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof robot.resource.robot.IRobotReferenceResolver) {
			robot.resource.robot.IRobotReferenceResolver replacingResolver = (robot.resource.robot.IRobotReferenceResolver) resolverValue;
			if (replacingResolver instanceof robot.resource.robot.IRobotDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((robot.resource.robot.IRobotDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			robot.resource.robot.IRobotReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof robot.resource.robot.IRobotReferenceCache) {
					robot.resource.robot.IRobotReferenceResolver nextResolver = (robot.resource.robot.IRobotReferenceResolver) next;
					if (nextResolver instanceof robot.resource.robot.IRobotDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((robot.resource.robot.IRobotDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new robot.resource.robot.util.RobotRuntimeUtil().logWarning("Found value with invalid type in value map for option " + robot.resource.robot.IRobotOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + robot.resource.robot.IRobotDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new robot.resource.robot.util.RobotRuntimeUtil().logWarning("Found value with invalid type in value map for option " + robot.resource.robot.IRobotOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + robot.resource.robot.IRobotDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
