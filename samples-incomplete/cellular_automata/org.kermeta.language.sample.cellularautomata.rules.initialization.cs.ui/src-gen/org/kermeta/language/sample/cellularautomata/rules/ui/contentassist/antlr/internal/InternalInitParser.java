package org.kermeta.language.sample.cellularautomata.rules.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.kermeta.language.sample.cellularautomata.rules.services.InitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInitParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'where'", "'initValue'", "'='", "'{'", "'}'", "'x'", "'['", "','", "']'", "'('", "')'", "'positionOn'", "'regularGeometry'", "'if'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInitParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g"; }


     
     	private InitGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InitGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:60:1: entryRuleCellularAutomataInitialization : ruleCellularAutomataInitialization EOF ;
    public final void entryRuleCellularAutomataInitialization() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:61:1: ( ruleCellularAutomataInitialization EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:62:1: ruleCellularAutomataInitialization EOF
            {
             before(grammarAccess.getCellularAutomataInitializationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization61);
            ruleCellularAutomataInitialization();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomataInitialization68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellularAutomataInitialization"


    // $ANTLR start "ruleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:69:1: ruleCellularAutomataInitialization : ( ( rule__CellularAutomataInitialization__Group__0 ) ) ;
    public final void ruleCellularAutomataInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:73:2: ( ( ( rule__CellularAutomataInitialization__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:74:1: ( ( rule__CellularAutomataInitialization__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:74:1: ( ( rule__CellularAutomataInitialization__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:75:1: ( rule__CellularAutomataInitialization__Group__0 )
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:76:1: ( rule__CellularAutomataInitialization__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:76:2: rule__CellularAutomataInitialization__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__0_in_ruleCellularAutomataInitialization94);
            rule__CellularAutomataInitialization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellularAutomataInitialization"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:89:1: ( ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule121);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:104:1: ( rule__Rule__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:104:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule154);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleGlobalPosition"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:116:1: entryRuleGlobalPosition : ruleGlobalPosition EOF ;
    public final void entryRuleGlobalPosition() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:117:1: ( ruleGlobalPosition EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:118:1: ruleGlobalPosition EOF
            {
             before(grammarAccess.getGlobalPositionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGlobalPosition_in_entryRuleGlobalPosition181);
            ruleGlobalPosition();

            state._fsp--;

             after(grammarAccess.getGlobalPositionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGlobalPosition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalPosition"


    // $ANTLR start "ruleGlobalPosition"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:125:1: ruleGlobalPosition : ( ( rule__GlobalPosition__Group__0 ) ) ;
    public final void ruleGlobalPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:129:2: ( ( ( rule__GlobalPosition__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:130:1: ( ( rule__GlobalPosition__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:130:1: ( ( rule__GlobalPosition__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:131:1: ( rule__GlobalPosition__Group__0 )
            {
             before(grammarAccess.getGlobalPositionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:132:1: ( rule__GlobalPosition__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:132:2: rule__GlobalPosition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__0_in_ruleGlobalPosition214);
            rule__GlobalPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalPosition"


    // $ANTLR start "entryRuleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:144:1: entryRuleCoordinateRange : ruleCoordinateRange EOF ;
    public final void entryRuleCoordinateRange() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:145:1: ( ruleCoordinateRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:146:1: ruleCoordinateRange EOF
            {
             before(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange241);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRange248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:153:1: ruleCoordinateRange : ( ( rule__CoordinateRange__Group__0 ) ) ;
    public final void ruleCoordinateRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:157:2: ( ( ( rule__CoordinateRange__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:158:1: ( ( rule__CoordinateRange__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:158:1: ( ( rule__CoordinateRange__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:159:1: ( rule__CoordinateRange__Group__0 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:160:1: ( rule__CoordinateRange__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:160:2: rule__CoordinateRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__0_in_ruleCoordinateRange274);
            rule__CoordinateRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinateRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:172:1: entryRuleLiteralsExpression : ruleLiteralsExpression EOF ;
    public final void entryRuleLiteralsExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:173:1: ( ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:174:1: ruleLiteralsExpression EOF
            {
             before(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression301);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:181:1: ruleLiteralsExpression : ( ( rule__LiteralsExpression__Alternatives ) ) ;
    public final void ruleLiteralsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:185:2: ( ( ( rule__LiteralsExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:186:1: ( ( rule__LiteralsExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:186:1: ( ( rule__LiteralsExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:187:1: ( rule__LiteralsExpression__Alternatives )
            {
             before(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:188:1: ( rule__LiteralsExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:188:2: rule__LiteralsExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression334);
            rule__LiteralsExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:200:1: entryRulePositionLiteral : rulePositionLiteral EOF ;
    public final void entryRulePositionLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:201:1: ( rulePositionLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:202:1: rulePositionLiteral EOF
            {
             before(grammarAccess.getPositionLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral361);
            rulePositionLiteral();

            state._fsp--;

             after(grammarAccess.getPositionLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionLiteral368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositionLiteral"


    // $ANTLR start "rulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:209:1: rulePositionLiteral : ( ( rule__PositionLiteral__Group__0 ) ) ;
    public final void rulePositionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:213:2: ( ( ( rule__PositionLiteral__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:214:1: ( ( rule__PositionLiteral__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:214:1: ( ( rule__PositionLiteral__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:215:1: ( rule__PositionLiteral__Group__0 )
            {
             before(grammarAccess.getPositionLiteralAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:216:1: ( rule__PositionLiteral__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:216:2: rule__PositionLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__0_in_rulePositionLiteral394);
            rule__PositionLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionLiteral"


    // $ANTLR start "entryRuleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:228:1: entryRuleRegularGeometry : ruleRegularGeometry EOF ;
    public final void entryRuleRegularGeometry() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:229:1: ( ruleRegularGeometry EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:230:1: ruleRegularGeometry EOF
            {
             before(grammarAccess.getRegularGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry421);
            ruleRegularGeometry();

            state._fsp--;

             after(grammarAccess.getRegularGeometryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegularGeometry428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularGeometry"


    // $ANTLR start "ruleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:237:1: ruleRegularGeometry : ( ( rule__RegularGeometry__Group__0 ) ) ;
    public final void ruleRegularGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:241:2: ( ( ( rule__RegularGeometry__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:242:1: ( ( rule__RegularGeometry__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:242:1: ( ( rule__RegularGeometry__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:243:1: ( rule__RegularGeometry__Group__0 )
            {
             before(grammarAccess.getRegularGeometryAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:244:1: ( rule__RegularGeometry__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:244:2: rule__RegularGeometry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__0_in_ruleRegularGeometry454);
            rule__RegularGeometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularGeometry"


    // $ANTLR start "entryRuleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:256:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:257:1: ( ruleDimension EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:258:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_entryRuleDimension481);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimension488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:265:1: ruleDimension : ( ( rule__Dimension__Alternatives ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:269:2: ( ( ( rule__Dimension__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:270:1: ( ( rule__Dimension__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:270:1: ( ( rule__Dimension__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:271:1: ( rule__Dimension__Alternatives )
            {
             before(grammarAccess.getDimensionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:272:1: ( rule__Dimension__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:272:2: rule__Dimension__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Alternatives_in_ruleDimension514);
            rule__Dimension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:284:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:285:1: ( ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:286:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional541);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:293:1: ruleConditional : ( ( rule__Conditional__Alternatives ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:297:2: ( ( ( rule__Conditional__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:298:1: ( ( rule__Conditional__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:298:1: ( ( rule__Conditional__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:299:1: ( rule__Conditional__Alternatives )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:300:1: ( rule__Conditional__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:300:2: rule__Conditional__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Alternatives_in_ruleConditional574);
            rule__Conditional__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:312:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:313:1: ( ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:314:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression601);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:321:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:325:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:326:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:326:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:327:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:328:1: ( rule__OrExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:328:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression634);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:340:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:341:1: ( ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:342:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression661);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:349:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:353:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:354:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:354:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:355:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:356:1: ( rule__AndExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:356:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression694);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:368:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:369:1: ( ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:370:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression721);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:377:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:381:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:382:1: ( ( rule__EqualExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:382:1: ( ( rule__EqualExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:383:1: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:384:1: ( rule__EqualExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:384:2: rule__EqualExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression754);
            rule__EqualExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:396:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:397:1: ( ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:398:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression781);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:405:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:409:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:410:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:410:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:411:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:412:1: ( rule__ComparisonExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:412:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression814);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:424:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:425:1: ( ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:426:1: ruleAddExpression EOF
            {
             before(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression841);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:433:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:437:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:438:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:438:1: ( ( rule__AddExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:439:1: ( rule__AddExpression__Group__0 )
            {
             before(grammarAccess.getAddExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:440:1: ( rule__AddExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:440:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression874);
            rule__AddExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:452:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:453:1: ( ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:454:1: ruleMultExpression EOF
            {
             before(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression901);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:461:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:465:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:466:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:466:1: ( ( rule__MultExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:467:1: ( rule__MultExpression__Group__0 )
            {
             before(grammarAccess.getMultExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:468:1: ( rule__MultExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:468:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression934);
            rule__MultExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:480:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:481:1: ( ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:482:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression961);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:489:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:493:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:494:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:494:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:495:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:496:1: ( rule__UnaryExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:496:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression994);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:508:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:509:1: ( ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:510:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1021);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:517:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:521:2: ( ( ( rule__IntegerLiteral__ValAssignment ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:522:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:522:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:523:1: ( rule__IntegerLiteral__ValAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:524:1: ( rule__IntegerLiteral__ValAssignment )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:524:2: rule__IntegerLiteral__ValAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1054);
            rule__IntegerLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:536:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:537:1: ( ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:538:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1081);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:545:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:549:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:550:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:550:1: ( ( rule__EInt__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:551:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:552:1: ( rule__EInt__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:552:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1114);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__LiteralsExpression__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:564:1: rule__LiteralsExpression__Alternatives : ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( rulePositionLiteral ) | ( ruleIntegerLiteral ) );
    public final void rule__LiteralsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:568:1: ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( rulePositionLiteral ) | ( ruleIntegerLiteral ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:569:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:569:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:570:1: ( rule__LiteralsExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:571:1: ( rule__LiteralsExpression__Group_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:571:2: rule__LiteralsExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1150);
                    rule__LiteralsExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:575:6: ( rulePositionLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:575:6: ( rulePositionLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:576:1: rulePositionLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_rule__LiteralsExpression__Alternatives1168);
                    rulePositionLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:581:6: ( ruleIntegerLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:581:6: ( ruleIntegerLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:582:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1185);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Alternatives"


    // $ANTLR start "rule__Dimension__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:592:1: rule__Dimension__Alternatives : ( ( ( rule__Dimension__Group_0__0 ) ) | ( ( rule__Dimension__Group_1__0 ) ) );
    public final void rule__Dimension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:596:1: ( ( ( rule__Dimension__Group_0__0 ) ) | ( ( rule__Dimension__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:597:1: ( ( rule__Dimension__Group_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:597:1: ( ( rule__Dimension__Group_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:598:1: ( rule__Dimension__Group_0__0 )
                    {
                     before(grammarAccess.getDimensionAccess().getGroup_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:599:1: ( rule__Dimension__Group_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:599:2: rule__Dimension__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_0__0_in_rule__Dimension__Alternatives1217);
                    rule__Dimension__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDimensionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:603:6: ( ( rule__Dimension__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:603:6: ( ( rule__Dimension__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:604:1: ( rule__Dimension__Group_1__0 )
                    {
                     before(grammarAccess.getDimensionAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:605:1: ( rule__Dimension__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:605:2: rule__Dimension__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__0_in_rule__Dimension__Alternatives1235);
                    rule__Dimension__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDimensionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Alternatives"


    // $ANTLR start "rule__Conditional__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:614:1: rule__Conditional__Alternatives : ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:618:1: ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==20||LA3_0==22||LA3_0==32||LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:619:1: ( ruleOrExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:619:1: ( ruleOrExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:620:1: ruleOrExpression
                    {
                     before(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1268);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:625:6: ( ( rule__Conditional__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:625:6: ( ( rule__Conditional__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:626:1: ( rule__Conditional__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:627:1: ( rule__Conditional__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:627:2: rule__Conditional__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1285);
                    rule__Conditional__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Alternatives"


    // $ANTLR start "rule__ComparisonExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:636:1: rule__ComparisonExpression__Alternatives_1_0 : ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) );
    public final void rule__ComparisonExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:640:1: ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:641:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:641:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:642:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:643:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:643:2: rule__ComparisonExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01318);
                    rule__ComparisonExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:647:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:647:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:648:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:649:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:649:2: rule__ComparisonExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01336);
                    rule__ComparisonExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Alternatives_1_0"


    // $ANTLR start "rule__AddExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:658:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:662:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:663:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:663:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:664:1: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:665:1: ( rule__AddExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:665:2: rule__AddExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01369);
                    rule__AddExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:669:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:669:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:670:1: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:671:1: ( rule__AddExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:671:2: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01387);
                    rule__AddExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Alternatives_1_0"


    // $ANTLR start "rule__MultExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:680:1: rule__MultExpression__Alternatives_1_0 : ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) );
    public final void rule__MultExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:684:1: ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:685:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:685:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:686:1: ( rule__MultExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:687:1: ( rule__MultExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:687:2: rule__MultExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01420);
                    rule__MultExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:691:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:691:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:692:1: ( rule__MultExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:693:1: ( rule__MultExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:693:2: rule__MultExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01438);
                    rule__MultExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:697:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:697:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:698:1: ( rule__MultExpression__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:699:1: ( rule__MultExpression__Group_1_0_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:699:2: rule__MultExpression__Group_1_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01456);
                    rule__MultExpression__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Alternatives_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:708:1: rule__UnaryExpression__Alternatives : ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:712:1: ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 20:
            case 22:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_INT) ) {
                    alt7=1;
                }
                else if ( (LA7_2==20||LA7_2==22||LA7_2==32) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:713:1: ( ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:713:1: ( ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:714:1: ruleLiteralsExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1489);
                    ruleLiteralsExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:719:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:719:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:720:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:721:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:721:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1506);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:725:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:725:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:726:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:727:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:727:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1524);
                    rule__UnaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:738:1: rule__CellularAutomataInitialization__Group__0 : rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1 ;
    public final void rule__CellularAutomataInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:742:1: ( rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:743:2: rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__0__Impl_in_rule__CellularAutomataInitialization__Group__01555);
            rule__CellularAutomataInitialization__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__1_in_rule__CellularAutomataInitialization__Group__01558);
            rule__CellularAutomataInitialization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__0"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:750:1: rule__CellularAutomataInitialization__Group__0__Impl : ( () ) ;
    public final void rule__CellularAutomataInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:754:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:755:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:755:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:756:1: ()
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomatatInitializationAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:757:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:759:1: 
            {
            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomatatInitializationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__0__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:769:1: rule__CellularAutomataInitialization__Group__1 : rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2 ;
    public final void rule__CellularAutomataInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:773:1: ( rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:774:2: rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__1__Impl_in_rule__CellularAutomataInitialization__Group__11616);
            rule__CellularAutomataInitialization__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__2_in_rule__CellularAutomataInitialization__Group__11619);
            rule__CellularAutomataInitialization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__1"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:781:1: rule__CellularAutomataInitialization__Group__1__Impl : ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? ) ;
    public final void rule__CellularAutomataInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:785:1: ( ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:786:1: ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:786:1: ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:787:1: ( rule__CellularAutomataInitialization__GeometryAssignment_1 )?
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGeometryAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:788:1: ( rule__CellularAutomataInitialization__GeometryAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:788:2: rule__CellularAutomataInitialization__GeometryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__GeometryAssignment_1_in_rule__CellularAutomataInitialization__Group__1__Impl1646);
                    rule__CellularAutomataInitialization__GeometryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getGeometryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__1__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:798:1: rule__CellularAutomataInitialization__Group__2 : rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3 ;
    public final void rule__CellularAutomataInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:802:1: ( rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:803:2: rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__2__Impl_in_rule__CellularAutomataInitialization__Group__21677);
            rule__CellularAutomataInitialization__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__3_in_rule__CellularAutomataInitialization__Group__21680);
            rule__CellularAutomataInitialization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__2"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:810:1: rule__CellularAutomataInitialization__Group__2__Impl : ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) ) ;
    public final void rule__CellularAutomataInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:814:1: ( ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:815:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:815:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:816:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 )
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:817:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:817:2: rule__CellularAutomataInitialization__SeedRulesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_2_in_rule__CellularAutomataInitialization__Group__2__Impl1707);
            rule__CellularAutomataInitialization__SeedRulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__2__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:827:1: rule__CellularAutomataInitialization__Group__3 : rule__CellularAutomataInitialization__Group__3__Impl ;
    public final void rule__CellularAutomataInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:831:1: ( rule__CellularAutomataInitialization__Group__3__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:832:2: rule__CellularAutomataInitialization__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__3__Impl_in_rule__CellularAutomataInitialization__Group__31737);
            rule__CellularAutomataInitialization__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__3"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:838:1: rule__CellularAutomataInitialization__Group__3__Impl : ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* ) ;
    public final void rule__CellularAutomataInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:842:1: ( ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:843:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:843:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:844:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )*
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:845:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:845:2: rule__CellularAutomataInitialization__SeedRulesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_3_in_rule__CellularAutomataInitialization__Group__3__Impl1764);
            	    rule__CellularAutomataInitialization__SeedRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:863:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:867:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:868:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01803);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01806);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:875:1: rule__Rule__Group__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:879:1: ( ( 'where' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:880:1: ( 'where' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:880:1: ( 'where' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:881:1: 'where'
            {
             before(grammarAccess.getRuleAccess().getWhereKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Rule__Group__0__Impl1834); 
             after(grammarAccess.getRuleAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:894:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:898:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:899:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11865);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11868);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:906:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__FilterAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:910:1: ( ( ( rule__Rule__FilterAssignment_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:911:1: ( ( rule__Rule__FilterAssignment_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:911:1: ( ( rule__Rule__FilterAssignment_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:912:1: ( rule__Rule__FilterAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:913:1: ( rule__Rule__FilterAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:913:2: rule__Rule__FilterAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1895);
                    rule__Rule__FilterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getFilterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:923:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:927:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:928:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21926);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21929);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:935:1: rule__Rule__Group__2__Impl : ( 'initValue' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:939:1: ( ( 'initValue' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:940:1: ( 'initValue' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:940:1: ( 'initValue' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:941:1: 'initValue'
            {
             before(grammarAccess.getRuleAccess().getInitValueKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Rule__Group__2__Impl1957); 
             after(grammarAccess.getRuleAccess().getInitValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:954:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:958:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:959:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31988);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31991);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:966:1: rule__Rule__Group__3__Impl : ( '=' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:970:1: ( ( '=' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:971:1: ( '=' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:971:1: ( '=' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:972:1: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Rule__Group__3__Impl2019); 
             after(grammarAccess.getRuleAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:985:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:989:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:990:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42050);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42053);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:997:1: rule__Rule__Group__4__Impl : ( '{' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1001:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1002:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1002:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1003:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rule__Group__4__Impl2081); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1016:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1020:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1021:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52112);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52115);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1028:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__EvaluatedValAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1032:1: ( ( ( rule__Rule__EvaluatedValAssignment_5 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1033:1: ( ( rule__Rule__EvaluatedValAssignment_5 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1033:1: ( ( rule__Rule__EvaluatedValAssignment_5 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1034:1: ( rule__Rule__EvaluatedValAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValAssignment_5()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1035:1: ( rule__Rule__EvaluatedValAssignment_5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1035:2: rule__Rule__EvaluatedValAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__EvaluatedValAssignment_5_in_rule__Rule__Group__5__Impl2142);
            rule__Rule__EvaluatedValAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEvaluatedValAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1045:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1049:1: ( rule__Rule__Group__6__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1050:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62172);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1056:1: rule__Rule__Group__6__Impl : ( '}' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1060:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1061:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1061:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1062:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Rule__Group__6__Impl2200); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__GlobalPosition__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1089:1: rule__GlobalPosition__Group__0 : rule__GlobalPosition__Group__0__Impl rule__GlobalPosition__Group__1 ;
    public final void rule__GlobalPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1093:1: ( rule__GlobalPosition__Group__0__Impl rule__GlobalPosition__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1094:2: rule__GlobalPosition__Group__0__Impl rule__GlobalPosition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__0__Impl_in_rule__GlobalPosition__Group__02245);
            rule__GlobalPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__1_in_rule__GlobalPosition__Group__02248);
            rule__GlobalPosition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__0"


    // $ANTLR start "rule__GlobalPosition__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1101:1: rule__GlobalPosition__Group__0__Impl : ( () ) ;
    public final void rule__GlobalPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1105:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1106:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1106:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1107:1: ()
            {
             before(grammarAccess.getGlobalPositionAccess().getGlobalPositionAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1108:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1110:1: 
            {
            }

             after(grammarAccess.getGlobalPositionAccess().getGlobalPositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__0__Impl"


    // $ANTLR start "rule__GlobalPosition__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1120:1: rule__GlobalPosition__Group__1 : rule__GlobalPosition__Group__1__Impl rule__GlobalPosition__Group__2 ;
    public final void rule__GlobalPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1124:1: ( rule__GlobalPosition__Group__1__Impl rule__GlobalPosition__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1125:2: rule__GlobalPosition__Group__1__Impl rule__GlobalPosition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__1__Impl_in_rule__GlobalPosition__Group__12306);
            rule__GlobalPosition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__2_in_rule__GlobalPosition__Group__12309);
            rule__GlobalPosition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__1"


    // $ANTLR start "rule__GlobalPosition__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1132:1: rule__GlobalPosition__Group__1__Impl : ( '{' ) ;
    public final void rule__GlobalPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1136:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1137:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1137:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1138:1: '{'
            {
             before(grammarAccess.getGlobalPositionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GlobalPosition__Group__1__Impl2337); 
             after(grammarAccess.getGlobalPositionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__1__Impl"


    // $ANTLR start "rule__GlobalPosition__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1151:1: rule__GlobalPosition__Group__2 : rule__GlobalPosition__Group__2__Impl rule__GlobalPosition__Group__3 ;
    public final void rule__GlobalPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1155:1: ( rule__GlobalPosition__Group__2__Impl rule__GlobalPosition__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1156:2: rule__GlobalPosition__Group__2__Impl rule__GlobalPosition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__2__Impl_in_rule__GlobalPosition__Group__22368);
            rule__GlobalPosition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__3_in_rule__GlobalPosition__Group__22371);
            rule__GlobalPosition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__2"


    // $ANTLR start "rule__GlobalPosition__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1163:1: rule__GlobalPosition__Group__2__Impl : ( ( rule__GlobalPosition__CoordinateRangesAssignment_2 ) ) ;
    public final void rule__GlobalPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1167:1: ( ( ( rule__GlobalPosition__CoordinateRangesAssignment_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1168:1: ( ( rule__GlobalPosition__CoordinateRangesAssignment_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1168:1: ( ( rule__GlobalPosition__CoordinateRangesAssignment_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1169:1: ( rule__GlobalPosition__CoordinateRangesAssignment_2 )
            {
             before(grammarAccess.getGlobalPositionAccess().getCoordinateRangesAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1170:1: ( rule__GlobalPosition__CoordinateRangesAssignment_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1170:2: rule__GlobalPosition__CoordinateRangesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__CoordinateRangesAssignment_2_in_rule__GlobalPosition__Group__2__Impl2398);
            rule__GlobalPosition__CoordinateRangesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalPositionAccess().getCoordinateRangesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__2__Impl"


    // $ANTLR start "rule__GlobalPosition__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1180:1: rule__GlobalPosition__Group__3 : rule__GlobalPosition__Group__3__Impl rule__GlobalPosition__Group__4 ;
    public final void rule__GlobalPosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1184:1: ( rule__GlobalPosition__Group__3__Impl rule__GlobalPosition__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1185:2: rule__GlobalPosition__Group__3__Impl rule__GlobalPosition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__3__Impl_in_rule__GlobalPosition__Group__32428);
            rule__GlobalPosition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__4_in_rule__GlobalPosition__Group__32431);
            rule__GlobalPosition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__3"


    // $ANTLR start "rule__GlobalPosition__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1192:1: rule__GlobalPosition__Group__3__Impl : ( ( rule__GlobalPosition__Group_3__0 )* ) ;
    public final void rule__GlobalPosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1196:1: ( ( ( rule__GlobalPosition__Group_3__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1197:1: ( ( rule__GlobalPosition__Group_3__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1197:1: ( ( rule__GlobalPosition__Group_3__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1198:1: ( rule__GlobalPosition__Group_3__0 )*
            {
             before(grammarAccess.getGlobalPositionAccess().getGroup_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1199:1: ( rule__GlobalPosition__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1199:2: rule__GlobalPosition__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group_3__0_in_rule__GlobalPosition__Group__3__Impl2458);
            	    rule__GlobalPosition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGlobalPositionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__3__Impl"


    // $ANTLR start "rule__GlobalPosition__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1209:1: rule__GlobalPosition__Group__4 : rule__GlobalPosition__Group__4__Impl ;
    public final void rule__GlobalPosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1213:1: ( rule__GlobalPosition__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1214:2: rule__GlobalPosition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group__4__Impl_in_rule__GlobalPosition__Group__42489);
            rule__GlobalPosition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__4"


    // $ANTLR start "rule__GlobalPosition__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1220:1: rule__GlobalPosition__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalPosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1224:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1225:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1225:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1226:1: '}'
            {
             before(grammarAccess.getGlobalPositionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GlobalPosition__Group__4__Impl2517); 
             after(grammarAccess.getGlobalPositionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group__4__Impl"


    // $ANTLR start "rule__GlobalPosition__Group_3__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1249:1: rule__GlobalPosition__Group_3__0 : rule__GlobalPosition__Group_3__0__Impl rule__GlobalPosition__Group_3__1 ;
    public final void rule__GlobalPosition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1253:1: ( rule__GlobalPosition__Group_3__0__Impl rule__GlobalPosition__Group_3__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1254:2: rule__GlobalPosition__Group_3__0__Impl rule__GlobalPosition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group_3__0__Impl_in_rule__GlobalPosition__Group_3__02558);
            rule__GlobalPosition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group_3__1_in_rule__GlobalPosition__Group_3__02561);
            rule__GlobalPosition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group_3__0"


    // $ANTLR start "rule__GlobalPosition__Group_3__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1261:1: rule__GlobalPosition__Group_3__0__Impl : ( 'x' ) ;
    public final void rule__GlobalPosition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1265:1: ( ( 'x' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1266:1: ( 'x' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1266:1: ( 'x' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1267:1: 'x'
            {
             before(grammarAccess.getGlobalPositionAccess().getXKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__GlobalPosition__Group_3__0__Impl2589); 
             after(grammarAccess.getGlobalPositionAccess().getXKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group_3__0__Impl"


    // $ANTLR start "rule__GlobalPosition__Group_3__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1280:1: rule__GlobalPosition__Group_3__1 : rule__GlobalPosition__Group_3__1__Impl ;
    public final void rule__GlobalPosition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1284:1: ( rule__GlobalPosition__Group_3__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1285:2: rule__GlobalPosition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__Group_3__1__Impl_in_rule__GlobalPosition__Group_3__12620);
            rule__GlobalPosition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group_3__1"


    // $ANTLR start "rule__GlobalPosition__Group_3__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1291:1: rule__GlobalPosition__Group_3__1__Impl : ( ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )? ) ;
    public final void rule__GlobalPosition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1295:1: ( ( ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1296:1: ( ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1296:1: ( ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1297:1: ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )?
            {
             before(grammarAccess.getGlobalPositionAccess().getCoordinateRangesAssignment_3_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1298:1: ( rule__GlobalPosition__CoordinateRangesAssignment_3_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1298:2: rule__GlobalPosition__CoordinateRangesAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GlobalPosition__CoordinateRangesAssignment_3_1_in_rule__GlobalPosition__Group_3__1__Impl2647);
                    rule__GlobalPosition__CoordinateRangesAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalPositionAccess().getCoordinateRangesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__Group_3__1__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1312:1: rule__CoordinateRange__Group__0 : rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 ;
    public final void rule__CoordinateRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1316:1: ( rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1317:2: rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__0__Impl_in_rule__CoordinateRange__Group__02682);
            rule__CoordinateRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__1_in_rule__CoordinateRange__Group__02685);
            rule__CoordinateRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0"


    // $ANTLR start "rule__CoordinateRange__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1324:1: rule__CoordinateRange__Group__0__Impl : ( '[' ) ;
    public final void rule__CoordinateRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1328:1: ( ( '[' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1329:1: ( '[' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1329:1: ( '[' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1330:1: '['
            {
             before(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CoordinateRange__Group__0__Impl2713); 
             after(grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1343:1: rule__CoordinateRange__Group__1 : rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 ;
    public final void rule__CoordinateRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1347:1: ( rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1348:2: rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__1__Impl_in_rule__CoordinateRange__Group__12744);
            rule__CoordinateRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__2_in_rule__CoordinateRange__Group__12747);
            rule__CoordinateRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1"


    // $ANTLR start "rule__CoordinateRange__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1355:1: rule__CoordinateRange__Group__1__Impl : ( ( rule__CoordinateRange__LowerCoordinateAssignment_1 ) ) ;
    public final void rule__CoordinateRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1359:1: ( ( ( rule__CoordinateRange__LowerCoordinateAssignment_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1360:1: ( ( rule__CoordinateRange__LowerCoordinateAssignment_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1360:1: ( ( rule__CoordinateRange__LowerCoordinateAssignment_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1361:1: ( rule__CoordinateRange__LowerCoordinateAssignment_1 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getLowerCoordinateAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1362:1: ( rule__CoordinateRange__LowerCoordinateAssignment_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1362:2: rule__CoordinateRange__LowerCoordinateAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__LowerCoordinateAssignment_1_in_rule__CoordinateRange__Group__1__Impl2774);
            rule__CoordinateRange__LowerCoordinateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getLowerCoordinateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1372:1: rule__CoordinateRange__Group__2 : rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 ;
    public final void rule__CoordinateRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1376:1: ( rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1377:2: rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__2__Impl_in_rule__CoordinateRange__Group__22804);
            rule__CoordinateRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__3_in_rule__CoordinateRange__Group__22807);
            rule__CoordinateRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2"


    // $ANTLR start "rule__CoordinateRange__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1384:1: rule__CoordinateRange__Group__2__Impl : ( ',' ) ;
    public final void rule__CoordinateRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1388:1: ( ( ',' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1389:1: ( ',' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1389:1: ( ',' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1390:1: ','
            {
             before(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CoordinateRange__Group__2__Impl2835); 
             after(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1403:1: rule__CoordinateRange__Group__3 : rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 ;
    public final void rule__CoordinateRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1407:1: ( rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1408:2: rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__3__Impl_in_rule__CoordinateRange__Group__32866);
            rule__CoordinateRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__4_in_rule__CoordinateRange__Group__32869);
            rule__CoordinateRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3"


    // $ANTLR start "rule__CoordinateRange__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1415:1: rule__CoordinateRange__Group__3__Impl : ( ( rule__CoordinateRange__UpperCoordinateAssignment_3 ) ) ;
    public final void rule__CoordinateRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1419:1: ( ( ( rule__CoordinateRange__UpperCoordinateAssignment_3 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1420:1: ( ( rule__CoordinateRange__UpperCoordinateAssignment_3 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1420:1: ( ( rule__CoordinateRange__UpperCoordinateAssignment_3 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1421:1: ( rule__CoordinateRange__UpperCoordinateAssignment_3 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getUpperCoordinateAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1422:1: ( rule__CoordinateRange__UpperCoordinateAssignment_3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1422:2: rule__CoordinateRange__UpperCoordinateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__UpperCoordinateAssignment_3_in_rule__CoordinateRange__Group__3__Impl2896);
            rule__CoordinateRange__UpperCoordinateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getUpperCoordinateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1432:1: rule__CoordinateRange__Group__4 : rule__CoordinateRange__Group__4__Impl ;
    public final void rule__CoordinateRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1436:1: ( rule__CoordinateRange__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1437:2: rule__CoordinateRange__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__4__Impl_in_rule__CoordinateRange__Group__42926);
            rule__CoordinateRange__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4"


    // $ANTLR start "rule__CoordinateRange__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1443:1: rule__CoordinateRange__Group__4__Impl : ( ']' ) ;
    public final void rule__CoordinateRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1447:1: ( ( ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1448:1: ( ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1448:1: ( ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1449:1: ']'
            {
             before(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__CoordinateRange__Group__4__Impl2954); 
             after(grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1472:1: rule__LiteralsExpression__Group_0__0 : rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 ;
    public final void rule__LiteralsExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1476:1: ( rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1477:2: rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__02995);
            rule__LiteralsExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__02998);
            rule__LiteralsExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__0"


    // $ANTLR start "rule__LiteralsExpression__Group_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1484:1: rule__LiteralsExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LiteralsExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1488:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1489:1: ( '(' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1489:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1490:1: '('
            {
             before(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__LiteralsExpression__Group_0__0__Impl3026); 
             after(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1503:1: rule__LiteralsExpression__Group_0__1 : rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 ;
    public final void rule__LiteralsExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1507:1: ( rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1508:2: rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__13057);
            rule__LiteralsExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__13060);
            rule__LiteralsExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__1"


    // $ANTLR start "rule__LiteralsExpression__Group_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1515:1: rule__LiteralsExpression__Group_0__1__Impl : ( ruleConditional ) ;
    public final void rule__LiteralsExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1519:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1520:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1520:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1521:1: ruleConditional
            {
             before(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl3087);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1532:1: rule__LiteralsExpression__Group_0__2 : rule__LiteralsExpression__Group_0__2__Impl ;
    public final void rule__LiteralsExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1536:1: ( rule__LiteralsExpression__Group_0__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1537:2: rule__LiteralsExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__23116);
            rule__LiteralsExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__2"


    // $ANTLR start "rule__LiteralsExpression__Group_0__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1543:1: rule__LiteralsExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__LiteralsExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1547:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1548:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1548:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1549:1: ')'
            {
             before(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralsExpression__Group_0__2__Impl3144); 
             after(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1568:1: rule__PositionLiteral__Group__0 : rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1 ;
    public final void rule__PositionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1572:1: ( rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1573:2: rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__0__Impl_in_rule__PositionLiteral__Group__03181);
            rule__PositionLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__1_in_rule__PositionLiteral__Group__03184);
            rule__PositionLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__0"


    // $ANTLR start "rule__PositionLiteral__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1580:1: rule__PositionLiteral__Group__0__Impl : ( () ) ;
    public final void rule__PositionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1584:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1585:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1585:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1586:1: ()
            {
             before(grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1587:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1589:1: 
            {
            }

             after(grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__0__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1599:1: rule__PositionLiteral__Group__1 : rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2 ;
    public final void rule__PositionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1603:1: ( rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1604:2: rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__1__Impl_in_rule__PositionLiteral__Group__13242);
            rule__PositionLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__2_in_rule__PositionLiteral__Group__13245);
            rule__PositionLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__1"


    // $ANTLR start "rule__PositionLiteral__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1611:1: rule__PositionLiteral__Group__1__Impl : ( 'positionOn' ) ;
    public final void rule__PositionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1615:1: ( ( 'positionOn' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1616:1: ( 'positionOn' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1616:1: ( 'positionOn' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1617:1: 'positionOn'
            {
             before(grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PositionLiteral__Group__1__Impl3273); 
             after(grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__1__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1630:1: rule__PositionLiteral__Group__2 : rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3 ;
    public final void rule__PositionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1634:1: ( rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1635:2: rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__2__Impl_in_rule__PositionLiteral__Group__23304);
            rule__PositionLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__3_in_rule__PositionLiteral__Group__23307);
            rule__PositionLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__2"


    // $ANTLR start "rule__PositionLiteral__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1642:1: rule__PositionLiteral__Group__2__Impl : ( '[' ) ;
    public final void rule__PositionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1646:1: ( ( '[' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1647:1: ( '[' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1647:1: ( '[' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1648:1: '['
            {
             before(grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PositionLiteral__Group__2__Impl3335); 
             after(grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__2__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1661:1: rule__PositionLiteral__Group__3 : rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4 ;
    public final void rule__PositionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1665:1: ( rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1666:2: rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__3__Impl_in_rule__PositionLiteral__Group__33366);
            rule__PositionLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__4_in_rule__PositionLiteral__Group__33369);
            rule__PositionLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__3"


    // $ANTLR start "rule__PositionLiteral__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1673:1: rule__PositionLiteral__Group__3__Impl : ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) ) ;
    public final void rule__PositionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1677:1: ( ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1678:1: ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1678:1: ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1679:1: ( rule__PositionLiteral__DimensionIndexAssignment_3 )
            {
             before(grammarAccess.getPositionLiteralAccess().getDimensionIndexAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1680:1: ( rule__PositionLiteral__DimensionIndexAssignment_3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1680:2: rule__PositionLiteral__DimensionIndexAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__DimensionIndexAssignment_3_in_rule__PositionLiteral__Group__3__Impl3396);
            rule__PositionLiteral__DimensionIndexAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionLiteralAccess().getDimensionIndexAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__3__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1690:1: rule__PositionLiteral__Group__4 : rule__PositionLiteral__Group__4__Impl ;
    public final void rule__PositionLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1694:1: ( rule__PositionLiteral__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1695:2: rule__PositionLiteral__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__4__Impl_in_rule__PositionLiteral__Group__43426);
            rule__PositionLiteral__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__4"


    // $ANTLR start "rule__PositionLiteral__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1701:1: rule__PositionLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__PositionLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1705:1: ( ( ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1706:1: ( ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1706:1: ( ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1707:1: ']'
            {
             before(grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PositionLiteral__Group__4__Impl3454); 
             after(grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__4__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1730:1: rule__RegularGeometry__Group__0 : rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1 ;
    public final void rule__RegularGeometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1734:1: ( rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1735:2: rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__0__Impl_in_rule__RegularGeometry__Group__03495);
            rule__RegularGeometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__1_in_rule__RegularGeometry__Group__03498);
            rule__RegularGeometry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__0"


    // $ANTLR start "rule__RegularGeometry__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1742:1: rule__RegularGeometry__Group__0__Impl : ( () ) ;
    public final void rule__RegularGeometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1746:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1747:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1747:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1748:1: ()
            {
             before(grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1749:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1751:1: 
            {
            }

             after(grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__0__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1761:1: rule__RegularGeometry__Group__1 : rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2 ;
    public final void rule__RegularGeometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1765:1: ( rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1766:2: rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__1__Impl_in_rule__RegularGeometry__Group__13556);
            rule__RegularGeometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__2_in_rule__RegularGeometry__Group__13559);
            rule__RegularGeometry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__1"


    // $ANTLR start "rule__RegularGeometry__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1773:1: rule__RegularGeometry__Group__1__Impl : ( 'regularGeometry' ) ;
    public final void rule__RegularGeometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1777:1: ( ( 'regularGeometry' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1778:1: ( 'regularGeometry' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1778:1: ( 'regularGeometry' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1779:1: 'regularGeometry'
            {
             before(grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RegularGeometry__Group__1__Impl3587); 
             after(grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__1__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1792:1: rule__RegularGeometry__Group__2 : rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3 ;
    public final void rule__RegularGeometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1796:1: ( rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1797:2: rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__2__Impl_in_rule__RegularGeometry__Group__23618);
            rule__RegularGeometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__3_in_rule__RegularGeometry__Group__23621);
            rule__RegularGeometry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__2"


    // $ANTLR start "rule__RegularGeometry__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1804:1: rule__RegularGeometry__Group__2__Impl : ( ( rule__RegularGeometry__NeighborsNumberAssignment_2 ) ) ;
    public final void rule__RegularGeometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1808:1: ( ( ( rule__RegularGeometry__NeighborsNumberAssignment_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1809:1: ( ( rule__RegularGeometry__NeighborsNumberAssignment_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1809:1: ( ( rule__RegularGeometry__NeighborsNumberAssignment_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1810:1: ( rule__RegularGeometry__NeighborsNumberAssignment_2 )
            {
             before(grammarAccess.getRegularGeometryAccess().getNeighborsNumberAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1811:1: ( rule__RegularGeometry__NeighborsNumberAssignment_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1811:2: rule__RegularGeometry__NeighborsNumberAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__NeighborsNumberAssignment_2_in_rule__RegularGeometry__Group__2__Impl3648);
            rule__RegularGeometry__NeighborsNumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getNeighborsNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__2__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1821:1: rule__RegularGeometry__Group__3 : rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4 ;
    public final void rule__RegularGeometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1825:1: ( rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1826:2: rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__3__Impl_in_rule__RegularGeometry__Group__33678);
            rule__RegularGeometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__4_in_rule__RegularGeometry__Group__33681);
            rule__RegularGeometry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__3"


    // $ANTLR start "rule__RegularGeometry__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1833:1: rule__RegularGeometry__Group__3__Impl : ( '{' ) ;
    public final void rule__RegularGeometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1837:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1838:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1838:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1839:1: '{'
            {
             before(grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RegularGeometry__Group__3__Impl3709); 
             after(grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__3__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1852:1: rule__RegularGeometry__Group__4 : rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5 ;
    public final void rule__RegularGeometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1856:1: ( rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1857:2: rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__4__Impl_in_rule__RegularGeometry__Group__43740);
            rule__RegularGeometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__5_in_rule__RegularGeometry__Group__43743);
            rule__RegularGeometry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__4"


    // $ANTLR start "rule__RegularGeometry__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1864:1: rule__RegularGeometry__Group__4__Impl : ( ( rule__RegularGeometry__DimensionsAssignment_4 ) ) ;
    public final void rule__RegularGeometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1868:1: ( ( ( rule__RegularGeometry__DimensionsAssignment_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1869:1: ( ( rule__RegularGeometry__DimensionsAssignment_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1869:1: ( ( rule__RegularGeometry__DimensionsAssignment_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1870:1: ( rule__RegularGeometry__DimensionsAssignment_4 )
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1871:1: ( rule__RegularGeometry__DimensionsAssignment_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1871:2: rule__RegularGeometry__DimensionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__DimensionsAssignment_4_in_rule__RegularGeometry__Group__4__Impl3770);
            rule__RegularGeometry__DimensionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__4__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1881:1: rule__RegularGeometry__Group__5 : rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6 ;
    public final void rule__RegularGeometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1885:1: ( rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1886:2: rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__5__Impl_in_rule__RegularGeometry__Group__53800);
            rule__RegularGeometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__6_in_rule__RegularGeometry__Group__53803);
            rule__RegularGeometry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__5"


    // $ANTLR start "rule__RegularGeometry__Group__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1893:1: rule__RegularGeometry__Group__5__Impl : ( ( rule__RegularGeometry__Group_5__0 )* ) ;
    public final void rule__RegularGeometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1897:1: ( ( ( rule__RegularGeometry__Group_5__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1898:1: ( ( rule__RegularGeometry__Group_5__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1898:1: ( ( rule__RegularGeometry__Group_5__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1899:1: ( rule__RegularGeometry__Group_5__0 )*
            {
             before(grammarAccess.getRegularGeometryAccess().getGroup_5()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1900:1: ( rule__RegularGeometry__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1900:2: rule__RegularGeometry__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__0_in_rule__RegularGeometry__Group__5__Impl3830);
            	    rule__RegularGeometry__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRegularGeometryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__5__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__6"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1910:1: rule__RegularGeometry__Group__6 : rule__RegularGeometry__Group__6__Impl ;
    public final void rule__RegularGeometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1914:1: ( rule__RegularGeometry__Group__6__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1915:2: rule__RegularGeometry__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__6__Impl_in_rule__RegularGeometry__Group__63861);
            rule__RegularGeometry__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__6"


    // $ANTLR start "rule__RegularGeometry__Group__6__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1921:1: rule__RegularGeometry__Group__6__Impl : ( '}' ) ;
    public final void rule__RegularGeometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1925:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1926:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1926:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1927:1: '}'
            {
             before(grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RegularGeometry__Group__6__Impl3889); 
             after(grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__6__Impl"


    // $ANTLR start "rule__RegularGeometry__Group_5__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1954:1: rule__RegularGeometry__Group_5__0 : rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1 ;
    public final void rule__RegularGeometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1958:1: ( rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1959:2: rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__0__Impl_in_rule__RegularGeometry__Group_5__03934);
            rule__RegularGeometry__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__1_in_rule__RegularGeometry__Group_5__03937);
            rule__RegularGeometry__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__0"


    // $ANTLR start "rule__RegularGeometry__Group_5__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1966:1: rule__RegularGeometry__Group_5__0__Impl : ( 'x' ) ;
    public final void rule__RegularGeometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1970:1: ( ( 'x' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1971:1: ( 'x' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1971:1: ( 'x' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1972:1: 'x'
            {
             before(grammarAccess.getRegularGeometryAccess().getXKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RegularGeometry__Group_5__0__Impl3965); 
             after(grammarAccess.getRegularGeometryAccess().getXKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__0__Impl"


    // $ANTLR start "rule__RegularGeometry__Group_5__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1985:1: rule__RegularGeometry__Group_5__1 : rule__RegularGeometry__Group_5__1__Impl ;
    public final void rule__RegularGeometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1989:1: ( rule__RegularGeometry__Group_5__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1990:2: rule__RegularGeometry__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__1__Impl_in_rule__RegularGeometry__Group_5__13996);
            rule__RegularGeometry__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__1"


    // $ANTLR start "rule__RegularGeometry__Group_5__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1996:1: rule__RegularGeometry__Group_5__1__Impl : ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) ) ;
    public final void rule__RegularGeometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2000:1: ( ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2001:1: ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2001:1: ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2002:1: ( rule__RegularGeometry__DimensionsAssignment_5_1 )
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_5_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2003:1: ( rule__RegularGeometry__DimensionsAssignment_5_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2003:2: rule__RegularGeometry__DimensionsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__DimensionsAssignment_5_1_in_rule__RegularGeometry__Group_5__1__Impl4023);
            rule__RegularGeometry__DimensionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__1__Impl"


    // $ANTLR start "rule__Dimension__Group_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2017:1: rule__Dimension__Group_0__0 : rule__Dimension__Group_0__0__Impl rule__Dimension__Group_0__1 ;
    public final void rule__Dimension__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2021:1: ( rule__Dimension__Group_0__0__Impl rule__Dimension__Group_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2022:2: rule__Dimension__Group_0__0__Impl rule__Dimension__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_0__0__Impl_in_rule__Dimension__Group_0__04057);
            rule__Dimension__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_0__1_in_rule__Dimension__Group_0__04060);
            rule__Dimension__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_0__0"


    // $ANTLR start "rule__Dimension__Group_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2029:1: rule__Dimension__Group_0__0__Impl : ( () ) ;
    public final void rule__Dimension__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2033:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2034:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2034:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2035:1: ()
            {
             before(grammarAccess.getDimensionAccess().getDimensionAction_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2036:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2038:1: 
            {
            }

             after(grammarAccess.getDimensionAccess().getDimensionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_0__0__Impl"


    // $ANTLR start "rule__Dimension__Group_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2048:1: rule__Dimension__Group_0__1 : rule__Dimension__Group_0__1__Impl ;
    public final void rule__Dimension__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2052:1: ( rule__Dimension__Group_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2053:2: rule__Dimension__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_0__1__Impl_in_rule__Dimension__Group_0__14118);
            rule__Dimension__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_0__1"


    // $ANTLR start "rule__Dimension__Group_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2059:1: rule__Dimension__Group_0__1__Impl : ( ( rule__Dimension__SizeAssignment_0_1 ) ) ;
    public final void rule__Dimension__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2063:1: ( ( ( rule__Dimension__SizeAssignment_0_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2064:1: ( ( rule__Dimension__SizeAssignment_0_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2064:1: ( ( rule__Dimension__SizeAssignment_0_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2065:1: ( rule__Dimension__SizeAssignment_0_1 )
            {
             before(grammarAccess.getDimensionAccess().getSizeAssignment_0_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2066:1: ( rule__Dimension__SizeAssignment_0_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2066:2: rule__Dimension__SizeAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__SizeAssignment_0_1_in_rule__Dimension__Group_0__1__Impl4145);
            rule__Dimension__SizeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getSizeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_0__1__Impl"


    // $ANTLR start "rule__Dimension__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2080:1: rule__Dimension__Group_1__0 : rule__Dimension__Group_1__0__Impl rule__Dimension__Group_1__1 ;
    public final void rule__Dimension__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2084:1: ( rule__Dimension__Group_1__0__Impl rule__Dimension__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2085:2: rule__Dimension__Group_1__0__Impl rule__Dimension__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__0__Impl_in_rule__Dimension__Group_1__04179);
            rule__Dimension__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__1_in_rule__Dimension__Group_1__04182);
            rule__Dimension__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__0"


    // $ANTLR start "rule__Dimension__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2092:1: rule__Dimension__Group_1__0__Impl : ( ( rule__Dimension__IsCircularAssignment_1_0 ) ) ;
    public final void rule__Dimension__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2096:1: ( ( ( rule__Dimension__IsCircularAssignment_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2097:1: ( ( rule__Dimension__IsCircularAssignment_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2097:1: ( ( rule__Dimension__IsCircularAssignment_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2098:1: ( rule__Dimension__IsCircularAssignment_1_0 )
            {
             before(grammarAccess.getDimensionAccess().getIsCircularAssignment_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2099:1: ( rule__Dimension__IsCircularAssignment_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2099:2: rule__Dimension__IsCircularAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__IsCircularAssignment_1_0_in_rule__Dimension__Group_1__0__Impl4209);
            rule__Dimension__IsCircularAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getIsCircularAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__0__Impl"


    // $ANTLR start "rule__Dimension__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2109:1: rule__Dimension__Group_1__1 : rule__Dimension__Group_1__1__Impl rule__Dimension__Group_1__2 ;
    public final void rule__Dimension__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2113:1: ( rule__Dimension__Group_1__1__Impl rule__Dimension__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2114:2: rule__Dimension__Group_1__1__Impl rule__Dimension__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__1__Impl_in_rule__Dimension__Group_1__14239);
            rule__Dimension__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__2_in_rule__Dimension__Group_1__14242);
            rule__Dimension__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__1"


    // $ANTLR start "rule__Dimension__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2121:1: rule__Dimension__Group_1__1__Impl : ( ( rule__Dimension__SizeAssignment_1_1 ) ) ;
    public final void rule__Dimension__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2125:1: ( ( ( rule__Dimension__SizeAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2126:1: ( ( rule__Dimension__SizeAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2126:1: ( ( rule__Dimension__SizeAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2127:1: ( rule__Dimension__SizeAssignment_1_1 )
            {
             before(grammarAccess.getDimensionAccess().getSizeAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2128:1: ( rule__Dimension__SizeAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2128:2: rule__Dimension__SizeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__SizeAssignment_1_1_in_rule__Dimension__Group_1__1__Impl4269);
            rule__Dimension__SizeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getSizeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__1__Impl"


    // $ANTLR start "rule__Dimension__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2138:1: rule__Dimension__Group_1__2 : rule__Dimension__Group_1__2__Impl ;
    public final void rule__Dimension__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2142:1: ( rule__Dimension__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2143:2: rule__Dimension__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group_1__2__Impl_in_rule__Dimension__Group_1__24299);
            rule__Dimension__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__2"


    // $ANTLR start "rule__Dimension__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2149:1: rule__Dimension__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Dimension__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2153:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2154:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2154:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2155:1: ')'
            {
             before(grammarAccess.getDimensionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Dimension__Group_1__2__Impl4327); 
             after(grammarAccess.getDimensionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_1__2__Impl"


    // $ANTLR start "rule__Conditional__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2174:1: rule__Conditional__Group_1__0 : rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 ;
    public final void rule__Conditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2178:1: ( rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2179:2: rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__04364);
            rule__Conditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__04367);
            rule__Conditional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0"


    // $ANTLR start "rule__Conditional__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2186:1: rule__Conditional__Group_1__0__Impl : ( () ) ;
    public final void rule__Conditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2190:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2191:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2191:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2192:1: ()
            {
             before(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2193:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2195:1: 
            {
            }

             after(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0__Impl"


    // $ANTLR start "rule__Conditional__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2205:1: rule__Conditional__Group_1__1 : rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 ;
    public final void rule__Conditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2209:1: ( rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2210:2: rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__14425);
            rule__Conditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__14428);
            rule__Conditional__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1"


    // $ANTLR start "rule__Conditional__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2217:1: rule__Conditional__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2221:1: ( ( 'if' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2222:1: ( 'if' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2222:1: ( 'if' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2223:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Conditional__Group_1__1__Impl4456); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1__Impl"


    // $ANTLR start "rule__Conditional__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2236:1: rule__Conditional__Group_1__2 : rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 ;
    public final void rule__Conditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2240:1: ( rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2241:2: rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__24487);
            rule__Conditional__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__24490);
            rule__Conditional__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2"


    // $ANTLR start "rule__Conditional__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2248:1: rule__Conditional__Group_1__2__Impl : ( ( rule__Conditional__ConditionAssignment_1_2 ) ) ;
    public final void rule__Conditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2252:1: ( ( ( rule__Conditional__ConditionAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2253:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2253:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2254:1: ( rule__Conditional__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2255:1: ( rule__Conditional__ConditionAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2255:2: rule__Conditional__ConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl4517);
            rule__Conditional__ConditionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2__Impl"


    // $ANTLR start "rule__Conditional__Group_1__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2265:1: rule__Conditional__Group_1__3 : rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 ;
    public final void rule__Conditional__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2269:1: ( rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2270:2: rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__34547);
            rule__Conditional__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__34550);
            rule__Conditional__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3"


    // $ANTLR start "rule__Conditional__Group_1__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2277:1: rule__Conditional__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2281:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2282:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2282:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2283:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Conditional__Group_1__3__Impl4578); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3__Impl"


    // $ANTLR start "rule__Conditional__Group_1__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2296:1: rule__Conditional__Group_1__4 : rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 ;
    public final void rule__Conditional__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2300:1: ( rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2301:2: rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__44609);
            rule__Conditional__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__44612);
            rule__Conditional__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4"


    // $ANTLR start "rule__Conditional__Group_1__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2308:1: rule__Conditional__Group_1__4__Impl : ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) ;
    public final void rule__Conditional__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2312:1: ( ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2313:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2313:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2314:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2315:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2315:2: rule__Conditional__IfTrueExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl4639);
            rule__Conditional__IfTrueExpressionAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4__Impl"


    // $ANTLR start "rule__Conditional__Group_1__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2325:1: rule__Conditional__Group_1__5 : rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 ;
    public final void rule__Conditional__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2329:1: ( rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2330:2: rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54669);
            rule__Conditional__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54672);
            rule__Conditional__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__5"


    // $ANTLR start "rule__Conditional__Group_1__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2337:1: rule__Conditional__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2341:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2342:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2342:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2343:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__5__Impl4700); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__5__Impl"


    // $ANTLR start "rule__Conditional__Group_1__6"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2356:1: rule__Conditional__Group_1__6 : rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 ;
    public final void rule__Conditional__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2360:1: ( rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2361:2: rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64731);
            rule__Conditional__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64734);
            rule__Conditional__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__6"


    // $ANTLR start "rule__Conditional__Group_1__6__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2368:1: rule__Conditional__Group_1__6__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2372:1: ( ( 'else' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2373:1: ( 'else' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2373:1: ( 'else' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2374:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Conditional__Group_1__6__Impl4762); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__6__Impl"


    // $ANTLR start "rule__Conditional__Group_1__7"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2387:1: rule__Conditional__Group_1__7 : rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 ;
    public final void rule__Conditional__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2391:1: ( rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2392:2: rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74793);
            rule__Conditional__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74796);
            rule__Conditional__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__7"


    // $ANTLR start "rule__Conditional__Group_1__7__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2399:1: rule__Conditional__Group_1__7__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2403:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2404:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2404:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2405:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Conditional__Group_1__7__Impl4824); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__7__Impl"


    // $ANTLR start "rule__Conditional__Group_1__8"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2418:1: rule__Conditional__Group_1__8 : rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 ;
    public final void rule__Conditional__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2422:1: ( rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2423:2: rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84855);
            rule__Conditional__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84858);
            rule__Conditional__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__8"


    // $ANTLR start "rule__Conditional__Group_1__8__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2430:1: rule__Conditional__Group_1__8__Impl : ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) ;
    public final void rule__Conditional__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2434:1: ( ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2435:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2435:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2436:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2437:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2437:2: rule__Conditional__IfFalseExpressionAssignment_1_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4885);
            rule__Conditional__IfFalseExpressionAssignment_1_8();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__8__Impl"


    // $ANTLR start "rule__Conditional__Group_1__9"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2447:1: rule__Conditional__Group_1__9 : rule__Conditional__Group_1__9__Impl ;
    public final void rule__Conditional__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2451:1: ( rule__Conditional__Group_1__9__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2452:2: rule__Conditional__Group_1__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94915);
            rule__Conditional__Group_1__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__9"


    // $ANTLR start "rule__Conditional__Group_1__9__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2458:1: rule__Conditional__Group_1__9__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2462:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2463:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2463:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2464:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__9__Impl4943); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__9__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2497:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2501:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2502:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04994);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04997);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2509:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2513:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2514:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2514:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2515:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl5024);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2526:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2530:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2531:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__15053);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2537:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2541:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2542:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2542:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2543:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2544:1: ( rule__OrExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2544:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl5080);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2558:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2562:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2563:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__05115);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__05118);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2570:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2574:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2575:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2575:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2576:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2577:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2579:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2589:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2593:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2594:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__15176);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__15179);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2601:1: rule__OrExpression__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2605:1: ( ( '|' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2606:1: ( '|' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2606:1: ( '|' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2607:1: '|'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrExpression__Group_1__1__Impl5207); 
             after(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2620:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2624:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2625:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25238);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2631:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2635:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2636:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2636:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2637:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2638:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2638:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5265);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2654:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2658:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2659:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05301);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05304);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2666:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2670:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2671:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2671:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2672:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl5331);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2683:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2687:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2688:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15360);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2694:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2698:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2699:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2699:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2700:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2701:1: ( rule__AndExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2701:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5387);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2715:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2719:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2720:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05422);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05425);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2727:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2731:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2732:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2732:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2733:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2734:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2736:1: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2746:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2750:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2751:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15483);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15486);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2758:1: rule__AndExpression__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2762:1: ( ( '&' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2763:1: ( '&' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2763:1: ( '&' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2764:1: '&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AndExpression__Group_1__1__Impl5514); 
             after(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2777:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2781:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2782:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25545);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2788:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2792:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2793:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2793:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2794:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2795:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2795:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5572);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2811:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2815:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2816:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05608);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05611);
            rule__EqualExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0"


    // $ANTLR start "rule__EqualExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2823:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2827:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2828:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2828:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2829:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5638);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2840:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2844:1: ( rule__EqualExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2845:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15667);
            rule__EqualExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1"


    // $ANTLR start "rule__EqualExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2851:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2855:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2856:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2856:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2857:1: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2858:1: ( rule__EqualExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2858:2: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5694);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEqualExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2872:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2876:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2877:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05729);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05732);
            rule__EqualExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0"


    // $ANTLR start "rule__EqualExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2884:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2888:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2889:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2889:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2890:1: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2891:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2893:1: 
            {
            }

             after(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2903:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2907:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2908:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15790);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15793);
            rule__EqualExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1"


    // $ANTLR start "rule__EqualExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2915:1: rule__EqualExpression__Group_1__1__Impl : ( '==' ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2919:1: ( ( '==' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2920:1: ( '==' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2920:1: ( '==' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2921:1: '=='
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EqualExpression__Group_1__1__Impl5821); 
             after(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2934:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2938:1: ( rule__EqualExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2939:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25852);
            rule__EqualExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2"


    // $ANTLR start "rule__EqualExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2945:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2949:1: ( ( ( rule__EqualExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2950:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2950:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2951:1: ( rule__EqualExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2952:1: ( rule__EqualExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2952:2: rule__EqualExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5879);
            rule__EqualExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2968:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2972:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2973:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05915);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05918);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2980:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2984:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2985:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2985:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2986:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5945);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2997:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3001:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3002:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15974);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3008:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3012:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3013:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3013:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3014:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3015:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3015:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6001);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3029:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3033:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3034:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06036);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06039);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3041:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3045:1: ( ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3046:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3046:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3047:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3048:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3048:2: rule__ComparisonExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6066);
            rule__ComparisonExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3058:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3062:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3063:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16096);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3069:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3073:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3074:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3074:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3075:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3076:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3076:2: rule__ComparisonExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6123);
            rule__ComparisonExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3090:1: rule__ComparisonExpression__Group_1_0_0__0 : rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3094:1: ( rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3095:2: rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06157);
            rule__ComparisonExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06160);
            rule__ComparisonExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3102:1: rule__ComparisonExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3106:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3107:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3107:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3108:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3109:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3111:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3121:1: rule__ComparisonExpression__Group_1_0_0__1 : rule__ComparisonExpression__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3125:1: ( rule__ComparisonExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3126:2: rule__ComparisonExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16218);
            rule__ComparisonExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3132:1: rule__ComparisonExpression__Group_1_0_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3136:1: ( ( '>' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3137:1: ( '>' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3137:1: ( '>' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3138:1: '>'
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6246); 
             after(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3155:1: rule__ComparisonExpression__Group_1_0_1__0 : rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 ;
    public final void rule__ComparisonExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3159:1: ( rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3160:2: rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06281);
            rule__ComparisonExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06284);
            rule__ComparisonExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3167:1: rule__ComparisonExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3171:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3172:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3172:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3173:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3174:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3176:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3186:1: rule__ComparisonExpression__Group_1_0_1__1 : rule__ComparisonExpression__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3190:1: ( rule__ComparisonExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3191:2: rule__ComparisonExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16342);
            rule__ComparisonExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3197:1: rule__ComparisonExpression__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3201:1: ( ( '<' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3202:1: ( '<' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3202:1: ( '<' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3203:1: '<'
            {
             before(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6370); 
             after(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3220:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3224:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3225:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06405);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06408);
            rule__AddExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3232:1: rule__AddExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3236:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3237:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3237:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3238:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6435);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3249:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3253:1: ( rule__AddExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3254:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16464);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3260:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3264:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3265:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3265:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3266:1: ( rule__AddExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3267:1: ( rule__AddExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3267:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6491);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAddExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3281:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3285:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3286:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06526);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06529);
            rule__AddExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0"


    // $ANTLR start "rule__AddExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3293:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3297:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3298:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3298:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3299:1: ( rule__AddExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3300:1: ( rule__AddExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3300:2: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6556);
            rule__AddExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3310:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3314:1: ( rule__AddExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3315:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16586);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1"


    // $ANTLR start "rule__AddExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3321:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3325:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3326:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3326:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3327:1: ( rule__AddExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3328:1: ( rule__AddExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3328:2: rule__AddExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6613);
            rule__AddExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3342:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3346:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3347:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06647);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06650);
            rule__AddExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3354:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3358:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3359:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3359:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3360:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3361:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3363:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3373:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3377:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3378:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16708);
            rule__AddExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3384:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3388:1: ( ( '+' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3389:1: ( '+' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3389:1: ( '+' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3390:1: '+'
            {
             before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AddExpression__Group_1_0_0__1__Impl6736); 
             after(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3407:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3411:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3412:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06771);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06774);
            rule__AddExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3419:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3423:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3424:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3424:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3425:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3426:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3428:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3438:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3442:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3443:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16832);
            rule__AddExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3449:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3453:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3454:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3454:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3455:1: '-'
            {
             before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AddExpression__Group_1_0_1__1__Impl6860); 
             after(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3472:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3476:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3477:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06895);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06898);
            rule__MultExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0"


    // $ANTLR start "rule__MultExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3484:1: rule__MultExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3488:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3489:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3489:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3490:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6925);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0__Impl"


    // $ANTLR start "rule__MultExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3501:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3505:1: ( rule__MultExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3506:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16954);
            rule__MultExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1"


    // $ANTLR start "rule__MultExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3512:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3516:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3517:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3517:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3518:1: ( rule__MultExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3519:1: ( rule__MultExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=35)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3519:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6981);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMultExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3533:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3537:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3538:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07016);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07019);
            rule__MultExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0"


    // $ANTLR start "rule__MultExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3545:1: rule__MultExpression__Group_1__0__Impl : ( ( rule__MultExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3549:1: ( ( ( rule__MultExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3550:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3550:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3551:1: ( rule__MultExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3552:1: ( rule__MultExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3552:2: rule__MultExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7046);
            rule__MultExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3562:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3566:1: ( rule__MultExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3567:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17076);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1"


    // $ANTLR start "rule__MultExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3573:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3577:1: ( ( ( rule__MultExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3578:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3578:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3579:1: ( rule__MultExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3580:1: ( rule__MultExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3580:2: rule__MultExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7103);
            rule__MultExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3594:1: rule__MultExpression__Group_1_0_0__0 : rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 ;
    public final void rule__MultExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3598:1: ( rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3599:2: rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07137);
            rule__MultExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07140);
            rule__MultExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3606:1: rule__MultExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3610:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3611:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3611:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3612:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3613:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3615:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3625:1: rule__MultExpression__Group_1_0_0__1 : rule__MultExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3629:1: ( rule__MultExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3630:2: rule__MultExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17198);
            rule__MultExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3636:1: rule__MultExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3640:1: ( ( '*' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3641:1: ( '*' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3641:1: ( '*' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3642:1: '*'
            {
             before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MultExpression__Group_1_0_0__1__Impl7226); 
             after(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3659:1: rule__MultExpression__Group_1_0_1__0 : rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 ;
    public final void rule__MultExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3663:1: ( rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3664:2: rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07261);
            rule__MultExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07264);
            rule__MultExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3671:1: rule__MultExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3675:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3676:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3676:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3677:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3678:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3680:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3690:1: rule__MultExpression__Group_1_0_1__1 : rule__MultExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3694:1: ( rule__MultExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3695:2: rule__MultExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17322);
            rule__MultExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3701:1: rule__MultExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3705:1: ( ( '/' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3706:1: ( '/' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3706:1: ( '/' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3707:1: '/'
            {
             before(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MultExpression__Group_1_0_1__1__Impl7350); 
             after(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3724:1: rule__MultExpression__Group_1_0_2__0 : rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 ;
    public final void rule__MultExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3728:1: ( rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3729:2: rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__07385);
            rule__MultExpression__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__07388);
            rule__MultExpression__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3736:1: rule__MultExpression__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3740:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3741:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3741:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3742:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3743:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3745:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3755:1: rule__MultExpression__Group_1_0_2__1 : rule__MultExpression__Group_1_0_2__1__Impl ;
    public final void rule__MultExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3759:1: ( rule__MultExpression__Group_1_0_2__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3760:2: rule__MultExpression__Group_1_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__17446);
            rule__MultExpression__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3766:1: rule__MultExpression__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__MultExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3770:1: ( ( '%' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3771:1: ( '%' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3771:1: ( '%' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3772:1: '%'
            {
             before(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MultExpression__Group_1_0_2__1__Impl7474); 
             after(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3789:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3793:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3794:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__07509);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__07512);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3801:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3805:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3806:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3806:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3807:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3808:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3810:1: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3820:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3824:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3825:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__17570);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__17573);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3832:1: rule__UnaryExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3836:1: ( ( '!' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3837:1: ( '!' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3837:1: ( '!' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3838:1: '!'
            {
             before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__UnaryExpression__Group_1__1__Impl7601); 
             after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3851:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3855:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3856:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__27632);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3862:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3866:1: ( ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3867:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3867:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3868:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3869:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3869:2: rule__UnaryExpression__TargetAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl7659);
            rule__UnaryExpression__TargetAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3885:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3889:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3890:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07695);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07698);
            rule__UnaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0"


    // $ANTLR start "rule__UnaryExpression__Group_2__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3897:1: rule__UnaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3901:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3902:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3902:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3903:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3904:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3906:1: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3916:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3920:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3921:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17756);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17759);
            rule__UnaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__1"


    // $ANTLR start "rule__UnaryExpression__Group_2__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3928:1: rule__UnaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3932:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3933:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3933:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3934:1: '-'
            {
             before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__UnaryExpression__Group_2__1__Impl7787); 
             after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3947:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3951:1: ( rule__UnaryExpression__Group_2__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3952:2: rule__UnaryExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27818);
            rule__UnaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__2"


    // $ANTLR start "rule__UnaryExpression__Group_2__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3958:1: rule__UnaryExpression__Group_2__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3962:1: ( ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3963:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3963:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3964:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3965:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3965:2: rule__UnaryExpression__TargetAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7845);
            rule__UnaryExpression__TargetAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3981:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3985:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3986:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07881);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07884);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3993:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3997:1: ( ( ( '-' )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3998:1: ( ( '-' )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3998:1: ( ( '-' )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3999:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4000:1: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4001:2: '-'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__EInt__Group__0__Impl7913); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4012:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4016:1: ( rule__EInt__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4017:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17946);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4023:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4027:1: ( ( RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4028:1: ( RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4028:1: ( RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4029:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7973); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__GeometryAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4045:1: rule__CellularAutomataInitialization__GeometryAssignment_1 : ( ruleRegularGeometry ) ;
    public final void rule__CellularAutomataInitialization__GeometryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4049:1: ( ( ruleRegularGeometry ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4050:1: ( ruleRegularGeometry )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4050:1: ( ruleRegularGeometry )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4051:1: ruleRegularGeometry
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_rule__CellularAutomataInitialization__GeometryAssignment_18011);
            ruleRegularGeometry();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__GeometryAssignment_1"


    // $ANTLR start "rule__CellularAutomataInitialization__SeedRulesAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4060:1: rule__CellularAutomataInitialization__SeedRulesAssignment_2 : ( ruleRule ) ;
    public final void rule__CellularAutomataInitialization__SeedRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4064:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4065:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4065:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4066:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_28042);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__SeedRulesAssignment_2"


    // $ANTLR start "rule__CellularAutomataInitialization__SeedRulesAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4075:1: rule__CellularAutomataInitialization__SeedRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__CellularAutomataInitialization__SeedRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4079:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4080:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4080:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4081:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_38073);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__SeedRulesAssignment_3"


    // $ANTLR start "rule__Rule__FilterAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4090:1: rule__Rule__FilterAssignment_1 : ( ruleGlobalPosition ) ;
    public final void rule__Rule__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4094:1: ( ( ruleGlobalPosition ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4095:1: ( ruleGlobalPosition )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4095:1: ( ruleGlobalPosition )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4096:1: ruleGlobalPosition
            {
             before(grammarAccess.getRuleAccess().getFilterGlobalPositionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGlobalPosition_in_rule__Rule__FilterAssignment_18104);
            ruleGlobalPosition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterGlobalPositionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FilterAssignment_1"


    // $ANTLR start "rule__Rule__EvaluatedValAssignment_5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4105:1: rule__Rule__EvaluatedValAssignment_5 : ( ruleConditional ) ;
    public final void rule__Rule__EvaluatedValAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4109:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4110:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4110:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4111:1: ruleConditional
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_58135);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EvaluatedValAssignment_5"


    // $ANTLR start "rule__GlobalPosition__CoordinateRangesAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4120:1: rule__GlobalPosition__CoordinateRangesAssignment_2 : ( ruleCoordinateRange ) ;
    public final void rule__GlobalPosition__CoordinateRangesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4124:1: ( ( ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4125:1: ( ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4125:1: ( ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4126:1: ruleCoordinateRange
            {
             before(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_rule__GlobalPosition__CoordinateRangesAssignment_28166);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__CoordinateRangesAssignment_2"


    // $ANTLR start "rule__GlobalPosition__CoordinateRangesAssignment_3_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4135:1: rule__GlobalPosition__CoordinateRangesAssignment_3_1 : ( ruleCoordinateRange ) ;
    public final void rule__GlobalPosition__CoordinateRangesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4139:1: ( ( ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4140:1: ( ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4140:1: ( ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4141:1: ruleCoordinateRange
            {
             before(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_rule__GlobalPosition__CoordinateRangesAssignment_3_18197);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalPosition__CoordinateRangesAssignment_3_1"


    // $ANTLR start "rule__CoordinateRange__LowerCoordinateAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4150:1: rule__CoordinateRange__LowerCoordinateAssignment_1 : ( ruleEInt ) ;
    public final void rule__CoordinateRange__LowerCoordinateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4154:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4155:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4155:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4156:1: ruleEInt
            {
             before(grammarAccess.getCoordinateRangeAccess().getLowerCoordinateEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__CoordinateRange__LowerCoordinateAssignment_18228);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeAccess().getLowerCoordinateEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__LowerCoordinateAssignment_1"


    // $ANTLR start "rule__CoordinateRange__UpperCoordinateAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4165:1: rule__CoordinateRange__UpperCoordinateAssignment_3 : ( ruleEInt ) ;
    public final void rule__CoordinateRange__UpperCoordinateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4169:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4170:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4170:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4171:1: ruleEInt
            {
             before(grammarAccess.getCoordinateRangeAccess().getUpperCoordinateEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__CoordinateRange__UpperCoordinateAssignment_38259);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeAccess().getUpperCoordinateEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__UpperCoordinateAssignment_3"


    // $ANTLR start "rule__PositionLiteral__DimensionIndexAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4180:1: rule__PositionLiteral__DimensionIndexAssignment_3 : ( ruleEInt ) ;
    public final void rule__PositionLiteral__DimensionIndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4184:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4185:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4185:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4186:1: ruleEInt
            {
             before(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PositionLiteral__DimensionIndexAssignment_38290);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__DimensionIndexAssignment_3"


    // $ANTLR start "rule__RegularGeometry__NeighborsNumberAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4195:1: rule__RegularGeometry__NeighborsNumberAssignment_2 : ( ruleEInt ) ;
    public final void rule__RegularGeometry__NeighborsNumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4199:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4200:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4200:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4201:1: ruleEInt
            {
             before(grammarAccess.getRegularGeometryAccess().getNeighborsNumberEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RegularGeometry__NeighborsNumberAssignment_28321);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getNeighborsNumberEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__NeighborsNumberAssignment_2"


    // $ANTLR start "rule__RegularGeometry__DimensionsAssignment_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4210:1: rule__RegularGeometry__DimensionsAssignment_4 : ( ruleDimension ) ;
    public final void rule__RegularGeometry__DimensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4214:1: ( ( ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4215:1: ( ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4215:1: ( ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4216:1: ruleDimension
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_48352);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__DimensionsAssignment_4"


    // $ANTLR start "rule__RegularGeometry__DimensionsAssignment_5_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4225:1: rule__RegularGeometry__DimensionsAssignment_5_1 : ( ruleDimension ) ;
    public final void rule__RegularGeometry__DimensionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4229:1: ( ( ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4230:1: ( ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4230:1: ( ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4231:1: ruleDimension
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_5_18383);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__DimensionsAssignment_5_1"


    // $ANTLR start "rule__Dimension__SizeAssignment_0_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4240:1: rule__Dimension__SizeAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__Dimension__SizeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4244:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4245:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4245:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4246:1: ruleEInt
            {
             before(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Dimension__SizeAssignment_0_18414);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__SizeAssignment_0_1"


    // $ANTLR start "rule__Dimension__IsCircularAssignment_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4255:1: rule__Dimension__IsCircularAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__Dimension__IsCircularAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4259:1: ( ( ( '(' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4260:1: ( ( '(' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4260:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4261:1: ( '(' )
            {
             before(grammarAccess.getDimensionAccess().getIsCircularLeftParenthesisKeyword_1_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4262:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4263:1: '('
            {
             before(grammarAccess.getDimensionAccess().getIsCircularLeftParenthesisKeyword_1_0_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Dimension__IsCircularAssignment_1_08450); 
             after(grammarAccess.getDimensionAccess().getIsCircularLeftParenthesisKeyword_1_0_0()); 

            }

             after(grammarAccess.getDimensionAccess().getIsCircularLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__IsCircularAssignment_1_0"


    // $ANTLR start "rule__Dimension__SizeAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4278:1: rule__Dimension__SizeAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Dimension__SizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4282:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4283:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4283:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4284:1: ruleEInt
            {
             before(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Dimension__SizeAssignment_1_18489);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__SizeAssignment_1_1"


    // $ANTLR start "rule__Conditional__ConditionAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4293:1: rule__Conditional__ConditionAssignment_1_2 : ( ruleConditional ) ;
    public final void rule__Conditional__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4297:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4298:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4298:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4299:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_28520);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_1_2"


    // $ANTLR start "rule__Conditional__IfTrueExpressionAssignment_1_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4308:1: rule__Conditional__IfTrueExpressionAssignment_1_4 : ( ruleConditional ) ;
    public final void rule__Conditional__IfTrueExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4312:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4313:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4313:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4314:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_48551);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IfTrueExpressionAssignment_1_4"


    // $ANTLR start "rule__Conditional__IfFalseExpressionAssignment_1_8"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4323:1: rule__Conditional__IfFalseExpressionAssignment_1_8 : ( ruleConditional ) ;
    public final void rule__Conditional__IfFalseExpressionAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4327:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4328:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4328:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4329:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_88582);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IfFalseExpressionAssignment_1_8"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4338:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4342:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4343:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4343:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4344:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_28613);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4353:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4357:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4358:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4358:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4359:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_28644);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4368:1: rule__EqualExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4372:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4373:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4373:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4374:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_28675);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4383:1: rule__ComparisonExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4387:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4388:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4388:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4389:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_18706);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AddExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4398:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4402:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4403:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4403:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4404:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_18737);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4413:1: rule__MultExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4417:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4418:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4418:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4419:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_18768);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__TargetAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4428:1: rule__UnaryExpression__TargetAssignment_1_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4432:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4433:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4433:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4434:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_28799);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__TargetAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__TargetAssignment_2_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4443:1: rule__UnaryExpression__TargetAssignment_2_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4447:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4448:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4448:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4449:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_28830);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__TargetAssignment_2_2"


    // $ANTLR start "rule__IntegerLiteral__ValAssignment"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4458:1: rule__IntegerLiteral__ValAssignment : ( ruleEInt ) ;
    public final void rule__IntegerLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4462:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4463:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4463:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4464:1: ruleEInt
            {
             before(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment8861);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomataInitialization68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__0_in_ruleCellularAutomataInitialization94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGlobalPosition_in_entryRuleGlobalPosition181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGlobalPosition188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__0_in_ruleGlobalPosition214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRange248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__0_in_ruleCoordinateRange274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionLiteral368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__0_in_rulePositionLiteral394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegularGeometry428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__0_in_ruleRegularGeometry454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimension488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Alternatives_in_ruleDimension514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Alternatives_in_ruleConditional574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_rule__LiteralsExpression__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_0__0_in_rule__Dimension__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__0_in_rule__Dimension__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__0__Impl_in_rule__CellularAutomataInitialization__Group__01555 = new BitSet(new long[]{0x0000000000800800L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__1_in_rule__CellularAutomataInitialization__Group__01558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__1__Impl_in_rule__CellularAutomataInitialization__Group__11616 = new BitSet(new long[]{0x0000000000800800L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__2_in_rule__CellularAutomataInitialization__Group__11619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__GeometryAssignment_1_in_rule__CellularAutomataInitialization__Group__1__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__2__Impl_in_rule__CellularAutomataInitialization__Group__21677 = new BitSet(new long[]{0x0000000000800800L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__3_in_rule__CellularAutomataInitialization__Group__21680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_2_in_rule__CellularAutomataInitialization__Group__2__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__3__Impl_in_rule__CellularAutomataInitialization__Group__31737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_3_in_rule__CellularAutomataInitialization__Group__3__Impl1764 = new BitSet(new long[]{0x0000000000800802L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01803 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Rule__Group__0__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11865 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21926 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Rule__Group__2__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31988 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Rule__Group__3__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42050 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rule__Group__4__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52112 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__EvaluatedValAssignment_5_in_rule__Rule__Group__5__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Rule__Group__6__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__0__Impl_in_rule__GlobalPosition__Group__02245 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__1_in_rule__GlobalPosition__Group__02248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__1__Impl_in_rule__GlobalPosition__Group__12306 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__2_in_rule__GlobalPosition__Group__12309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GlobalPosition__Group__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__2__Impl_in_rule__GlobalPosition__Group__22368 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__3_in_rule__GlobalPosition__Group__22371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__CoordinateRangesAssignment_2_in_rule__GlobalPosition__Group__2__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__3__Impl_in_rule__GlobalPosition__Group__32428 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__4_in_rule__GlobalPosition__Group__32431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group_3__0_in_rule__GlobalPosition__Group__3__Impl2458 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group__4__Impl_in_rule__GlobalPosition__Group__42489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GlobalPosition__Group__4__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group_3__0__Impl_in_rule__GlobalPosition__Group_3__02558 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group_3__1_in_rule__GlobalPosition__Group_3__02561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__GlobalPosition__Group_3__0__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__Group_3__1__Impl_in_rule__GlobalPosition__Group_3__12620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GlobalPosition__CoordinateRangesAssignment_3_1_in_rule__GlobalPosition__Group_3__1__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__0__Impl_in_rule__CoordinateRange__Group__02682 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__1_in_rule__CoordinateRange__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CoordinateRange__Group__0__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__1__Impl_in_rule__CoordinateRange__Group__12744 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__2_in_rule__CoordinateRange__Group__12747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__LowerCoordinateAssignment_1_in_rule__CoordinateRange__Group__1__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__2__Impl_in_rule__CoordinateRange__Group__22804 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__3_in_rule__CoordinateRange__Group__22807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CoordinateRange__Group__2__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__3__Impl_in_rule__CoordinateRange__Group__32866 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__4_in_rule__CoordinateRange__Group__32869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__UpperCoordinateAssignment_3_in_rule__CoordinateRange__Group__3__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__4__Impl_in_rule__CoordinateRange__Group__42926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CoordinateRange__Group__4__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__02995 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__02998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LiteralsExpression__Group_0__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__13057 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__13060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__23116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralsExpression__Group_0__2__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__0__Impl_in_rule__PositionLiteral__Group__03181 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__1_in_rule__PositionLiteral__Group__03184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__1__Impl_in_rule__PositionLiteral__Group__13242 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__2_in_rule__PositionLiteral__Group__13245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PositionLiteral__Group__1__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__2__Impl_in_rule__PositionLiteral__Group__23304 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__3_in_rule__PositionLiteral__Group__23307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PositionLiteral__Group__2__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__3__Impl_in_rule__PositionLiteral__Group__33366 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__4_in_rule__PositionLiteral__Group__33369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__DimensionIndexAssignment_3_in_rule__PositionLiteral__Group__3__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__4__Impl_in_rule__PositionLiteral__Group__43426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PositionLiteral__Group__4__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__0__Impl_in_rule__RegularGeometry__Group__03495 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__1_in_rule__RegularGeometry__Group__03498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__1__Impl_in_rule__RegularGeometry__Group__13556 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__2_in_rule__RegularGeometry__Group__13559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RegularGeometry__Group__1__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__2__Impl_in_rule__RegularGeometry__Group__23618 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__3_in_rule__RegularGeometry__Group__23621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__NeighborsNumberAssignment_2_in_rule__RegularGeometry__Group__2__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__3__Impl_in_rule__RegularGeometry__Group__33678 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__4_in_rule__RegularGeometry__Group__33681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RegularGeometry__Group__3__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__4__Impl_in_rule__RegularGeometry__Group__43740 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__5_in_rule__RegularGeometry__Group__43743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__DimensionsAssignment_4_in_rule__RegularGeometry__Group__4__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__5__Impl_in_rule__RegularGeometry__Group__53800 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__6_in_rule__RegularGeometry__Group__53803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__0_in_rule__RegularGeometry__Group__5__Impl3830 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__6__Impl_in_rule__RegularGeometry__Group__63861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RegularGeometry__Group__6__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__0__Impl_in_rule__RegularGeometry__Group_5__03934 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__1_in_rule__RegularGeometry__Group_5__03937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RegularGeometry__Group_5__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__1__Impl_in_rule__RegularGeometry__Group_5__13996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__DimensionsAssignment_5_1_in_rule__RegularGeometry__Group_5__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_0__0__Impl_in_rule__Dimension__Group_0__04057 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__Dimension__Group_0__1_in_rule__Dimension__Group_0__04060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_0__1__Impl_in_rule__Dimension__Group_0__14118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__SizeAssignment_0_1_in_rule__Dimension__Group_0__1__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__0__Impl_in_rule__Dimension__Group_1__04179 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__1_in_rule__Dimension__Group_1__04182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__IsCircularAssignment_1_0_in_rule__Dimension__Group_1__0__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__1__Impl_in_rule__Dimension__Group_1__14239 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__2_in_rule__Dimension__Group_1__14242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__SizeAssignment_1_1_in_rule__Dimension__Group_1__1__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group_1__2__Impl_in_rule__Dimension__Group_1__24299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Dimension__Group_1__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__04364 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__04367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__14425 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__14428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Conditional__Group_1__1__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__24487 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__24490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__34547 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__34550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Conditional__Group_1__3__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__44609 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__44612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54669 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__5__Impl4700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64731 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Conditional__Group_1__6__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74793 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Conditional__Group_1__7__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84855 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__9__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04994 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__15053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl5080 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__05115 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__05118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__15176 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__15179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrExpression__Group_1__1__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05301 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5387 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05422 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15483 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AndExpression__Group_1__1__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05608 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5694 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05729 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15790 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EqualExpression__Group_1__1__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05915 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6001 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06036 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06157 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06281 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06405 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6491 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06526 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06647 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AddExpression__Group_1_0_0__1__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06771 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AddExpression__Group_1_0_1__1__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06895 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6981 = new BitSet(new long[]{0x0000000E00000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07016 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07137 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MultExpression__Group_1_0_0__1__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07261 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MultExpression__Group_1_0_1__1__Impl7350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__07385 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__07388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__17446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MultExpression__Group_1_0_2__1__Impl7474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__07509 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__07512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__17570 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__17573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__UnaryExpression__Group_1__1__Impl7601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__27632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07695 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17756 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__UnaryExpression__Group_2__1__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07881 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__EInt__Group__0__Impl7913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_rule__CellularAutomataInitialization__GeometryAssignment_18011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_28042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_38073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGlobalPosition_in_rule__Rule__FilterAssignment_18104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_58135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_rule__GlobalPosition__CoordinateRangesAssignment_28166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_rule__GlobalPosition__CoordinateRangesAssignment_3_18197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__CoordinateRange__LowerCoordinateAssignment_18228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__CoordinateRange__UpperCoordinateAssignment_38259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PositionLiteral__DimensionIndexAssignment_38290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RegularGeometry__NeighborsNumberAssignment_28321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_48352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_5_18383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Dimension__SizeAssignment_0_18414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Dimension__IsCircularAssignment_1_08450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Dimension__SizeAssignment_1_18489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_28520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_48551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_88582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_28613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_28644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_28675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_18706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_18737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_18768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_28799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_28830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment8861 = new BitSet(new long[]{0x0000000000000002L});
    }


}