/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class RobotDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private robot.resource.robot.debug.RobotDebugTarget debugTarget;
	
	private robot.resource.robot.debug.RobotDebugCommunicationHelper communicationHelper = new robot.resource.robot.debug.RobotDebugCommunicationHelper();
	
	public RobotDebugProxy(robot.resource.robot.debug.RobotDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes.EXIT);
	}
	
	public robot.resource.robot.debug.RobotDebugMessage getStack() {
		return sendCommandAndRead(robot.resource.robot.debug.ERobotDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		robot.resource.robot.debug.RobotDebugMessage message = new robot.resource.robot.debug.RobotDebugMessage(robot.resource.robot.debug.ERobotDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		robot.resource.robot.debug.RobotDebugMessage message = new robot.resource.robot.debug.RobotDebugMessage(robot.resource.robot.debug.ERobotDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		robot.resource.robot.debug.RobotDebugMessage response = sendCommandAndRead(robot.resource.robot.debug.ERobotDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		robot.resource.robot.debug.RobotDebugMessage response = sendCommandAndRead(robot.resource.robot.debug.ERobotDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		robot.resource.robot.debug.RobotDebugVariable[] variables  = new robot.resource.robot.debug.RobotDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = robot.resource.robot.util.RobotStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new robot.resource.robot.debug.RobotDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			robot.resource.robot.debug.RobotDebugVariable variable = new robot.resource.robot.debug.RobotDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(robot.resource.robot.debug.ERobotDebugMessageTypes command, String... parameters) {
		robot.resource.robot.debug.RobotDebugMessage message = new robot.resource.robot.debug.RobotDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private robot.resource.robot.debug.RobotDebugMessage sendCommandAndRead(robot.resource.robot.debug.ERobotDebugMessageTypes command, String... parameters) {
		robot.resource.robot.debug.RobotDebugMessage message = new robot.resource.robot.debug.RobotDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
