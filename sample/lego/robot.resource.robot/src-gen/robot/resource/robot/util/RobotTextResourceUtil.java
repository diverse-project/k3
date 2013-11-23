/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.util;

/**
 * Class RobotTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * robot.resource.robot.util.RobotResourceUtil.
 */
public class RobotTextResourceUtil {
	
	/**
	 * Use robot.resource.robot.util.RobotResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static robot.resource.robot.mopp.RobotResource getResource(org.eclipse.core.resources.IFile file) {
		return new robot.resource.robot.util.RobotEclipseProxy().getResource(file);
	}
	
	/**
	 * Use robot.resource.robot.util.RobotResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static robot.resource.robot.mopp.RobotResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return robot.resource.robot.util.RobotResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use robot.resource.robot.util.RobotResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static robot.resource.robot.mopp.RobotResource getResource(org.eclipse.emf.common.util.URI uri) {
		return robot.resource.robot.util.RobotResourceUtil.getResource(uri);
	}
	
	/**
	 * Use robot.resource.robot.util.RobotResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static robot.resource.robot.mopp.RobotResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return robot.resource.robot.util.RobotResourceUtil.getResource(uri, options);
	}
	
}
