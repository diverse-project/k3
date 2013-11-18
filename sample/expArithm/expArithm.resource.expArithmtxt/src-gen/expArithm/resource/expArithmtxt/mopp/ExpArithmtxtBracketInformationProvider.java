/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtBracketInformationProvider {
	
	public class BracketPair implements expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair {
		
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
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair> getBracketPairs() {
		java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair> result = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair>();
		return result;
	}
	
}
