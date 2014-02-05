/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtAntlrScanner implements expArithm.resource.expArithmtxt.IExpArithmtxtTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public ExpArithmtxtAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		expArithm.resource.expArithmtxt.IExpArithmtxtTextToken result = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
