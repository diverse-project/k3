/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

public interface IExpArithmtxtHoverTextProvider {
	
	/**
	 * Returns the hoves text that is shown when the mouse pointer rests over the
	 * given object. The hover text can contain HTML.
	 */
	public String getHoverText(org.eclipse.emf.ecore.EObject object);
	
	/**
	 * Returns the hoves text that is shown when the mouse pointer rests over a
	 * reference to the given object. The hover text can contain HTML.
	 */
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject);
	
}
