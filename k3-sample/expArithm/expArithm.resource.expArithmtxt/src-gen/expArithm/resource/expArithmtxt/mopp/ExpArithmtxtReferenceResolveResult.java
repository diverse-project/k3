/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A basic implementation of the
 * expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class ExpArithmtxtReferenceResolveResult<ReferenceType> implements expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> quickFixes;
	
	public ExpArithmtxtReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
