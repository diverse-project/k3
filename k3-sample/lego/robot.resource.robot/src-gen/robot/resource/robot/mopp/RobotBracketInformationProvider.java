/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotBracketInformationProvider {
	
	public class BracketPair implements robot.resource.robot.IRobotBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<robot.resource.robot.IRobotBracketPair> getBracketPairs() {
		java.util.Collection<robot.resource.robot.IRobotBracketPair> result = new java.util.ArrayList<robot.resource.robot.IRobotBracketPair>();
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
