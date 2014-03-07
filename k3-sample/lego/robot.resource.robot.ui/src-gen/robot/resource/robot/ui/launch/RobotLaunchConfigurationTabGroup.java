/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui.launch;

/**
 * A class that provides the tabs for the launch configuration.
 */
public class RobotLaunchConfigurationTabGroup extends org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog dialog, String mode) {
		// Set the overrideLaunchConfigurationTabGroup option to false to implement this
		// method.
		setTabs(new org.eclipse.debug.ui.ILaunchConfigurationTab[] {new robot.resource.robot.ui.launch.RobotLaunchConfigurationMainTab()});
	}
	
}
