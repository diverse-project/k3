/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class ExpArithmtxtDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugTarget debugTarget;
	
	private expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugCommunicationHelper communicationHelper = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugCommunicationHelper();
	
	public ExpArithmtxtDebugProxy(expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.EXIT);
	}
	
	public expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage getStack() {
		return sendCommandAndRead(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage message = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage message = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage response = sendCommandAndRead(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage response = sendCommandAndRead(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugVariable[] variables  = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugVariable variable = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes command, String... parameters) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage message = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage sendCommandAndRead(expArithm.resource.expArithmtxt.debug.EExpArithmtxtDebugMessageTypes command, String... parameters) {
		expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage message = new expArithm.resource.expArithmtxt.debug.ExpArithmtxtDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
