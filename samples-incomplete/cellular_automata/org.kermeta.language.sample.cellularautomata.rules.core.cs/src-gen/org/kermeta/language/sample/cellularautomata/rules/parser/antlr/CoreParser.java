/*
* generated by Xtext
*/
package org.kermeta.language.sample.cellularautomata.rules.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.kermeta.language.sample.cellularautomata.rules.services.CoreGrammarAccess;

public class CoreParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CoreGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal.InternalCoreParser createParser(XtextTokenStream stream) {
		return new org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal.InternalCoreParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Rule";
	}
	
	public CoreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CoreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
