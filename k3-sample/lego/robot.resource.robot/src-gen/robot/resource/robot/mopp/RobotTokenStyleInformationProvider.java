/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public robot.resource.robot.IRobotTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("STRING_LITERAL".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("do".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("end".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("while".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("and".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("not".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("bip".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("move".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("obstacle".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("hasTurned".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("turn".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("setTurnAngle".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("stopEngine".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("stopProgram".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("display".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("duration".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("power".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("repeat".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("angle".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("msg".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("col".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("line".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("distance".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x6D, 0x10, 0x50}, null, false, true, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new robot.resource.robot.mopp.RobotTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
