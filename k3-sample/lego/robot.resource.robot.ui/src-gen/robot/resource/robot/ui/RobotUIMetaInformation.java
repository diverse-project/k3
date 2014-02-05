/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui;

public class RobotUIMetaInformation extends robot.resource.robot.mopp.RobotMetaInformation {
	
	public robot.resource.robot.IRobotHoverTextProvider getHoverTextProvider() {
		return new robot.resource.robot.ui.RobotHoverTextProvider();
	}
	
	public robot.resource.robot.ui.RobotImageProvider getImageProvider() {
		return robot.resource.robot.ui.RobotImageProvider.INSTANCE;
	}
	
	public robot.resource.robot.ui.RobotColorManager createColorManager() {
		return new robot.resource.robot.ui.RobotColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(robot.resource.robot.IRobotTextResource,
	 * robot.resource.robot.ui.RobotColorManager) instead.
	 */
	public robot.resource.robot.ui.RobotTokenScanner createTokenScanner(robot.resource.robot.ui.RobotColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public robot.resource.robot.ui.RobotTokenScanner createTokenScanner(robot.resource.robot.IRobotTextResource resource, robot.resource.robot.ui.RobotColorManager colorManager) {
		return new robot.resource.robot.ui.RobotTokenScanner(resource, colorManager);
	}
	
	public robot.resource.robot.ui.RobotCodeCompletionHelper createCodeCompletionHelper() {
		return new robot.resource.robot.ui.RobotCodeCompletionHelper();
	}
	
}
