/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class RobotDebugMessage {
	
	private static final char DELIMITER = ':';
	private robot.resource.robot.debug.ERobotDebugMessageTypes messageType;
	private String[] arguments;
	
	public RobotDebugMessage(robot.resource.robot.debug.ERobotDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public RobotDebugMessage(robot.resource.robot.debug.ERobotDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public robot.resource.robot.debug.ERobotDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return robot.resource.robot.util.RobotStringUtil.encode(DELIMITER, parts);
	}
	
	public static RobotDebugMessage deserialize(String response) {
		java.util.List<String> parts = robot.resource.robot.util.RobotStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		robot.resource.robot.debug.ERobotDebugMessageTypes type = robot.resource.robot.debug.ERobotDebugMessageTypes.valueOf(messageType);
		RobotDebugMessage message = new RobotDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(robot.resource.robot.debug.ERobotDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + robot.resource.robot.util.RobotStringUtil.explode(arguments, ", ") + "]";
	}
	
}
