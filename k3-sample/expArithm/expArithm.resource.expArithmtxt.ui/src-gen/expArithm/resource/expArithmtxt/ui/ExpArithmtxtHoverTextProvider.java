/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtHoverTextProvider implements expArithm.resource.expArithmtxt.IExpArithmtxtHoverTextProvider {
	
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtDefaultHoverTextProvider defaultProvider = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
