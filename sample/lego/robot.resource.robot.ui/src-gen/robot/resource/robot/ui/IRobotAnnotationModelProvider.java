/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui;

/**
 * A provider for annotation models.
 */
public interface IRobotAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
