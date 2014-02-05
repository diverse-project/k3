/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class ExpArithmtxtDebugMessage {
	
	private static final char DELIMITER = ':';
	private expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes messageType;
	private String[] arguments;
	
	public ExpArithmtxtDebugMessage(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public ExpArithmtxtDebugMessage(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes getMessageType() {
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
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.encode(DELIMITER, parts);
	}
	
	public static ExpArithmtxtDebugMessage deserialize(String response) {
		java.util.List<String> parts = expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes type = expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.valueOf(messageType);
		ExpArithmtxtDebugMessage message = new ExpArithmtxtDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.explode(arguments, ", ") + "]";
	}
	
}
