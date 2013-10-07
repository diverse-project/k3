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
import org.kermeta.language.sample.cellularautomata.rules.services.CoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoreParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'value'", "'='", "';'", "'if'", "'{'", "'}'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'"
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCoreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoreParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g"; }


     
     	private CoreGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CoreGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:60:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:61:1: ( ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:62:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule61);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule68); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:69:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:73:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:74:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:74:1: ( ( rule__Rule__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:75:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:76:1: ( rule__Rule__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:76:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule94);
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


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:88:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:89:1: ( ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:90:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional121);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional128); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:97:1: ruleConditional : ( ( rule__Conditional__Alternatives ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:101:2: ( ( ( rule__Conditional__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:102:1: ( ( rule__Conditional__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:102:1: ( ( rule__Conditional__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:103:1: ( rule__Conditional__Alternatives )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:104:1: ( rule__Conditional__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:104:2: rule__Conditional__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Alternatives_in_ruleConditional154);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:116:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:117:1: ( ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:118:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression181);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression188); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:125:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:129:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:130:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:130:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:131:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:132:1: ( rule__OrExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:132:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression214);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:144:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:145:1: ( ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:146:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression241);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression248); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:153:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:157:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:158:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:158:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:159:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:160:1: ( rule__AndExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:160:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression274);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:172:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:173:1: ( ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:174:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression301);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression308); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:181:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:185:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:186:1: ( ( rule__EqualExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:186:1: ( ( rule__EqualExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:187:1: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:188:1: ( rule__EqualExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:188:2: rule__EqualExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression334);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:200:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:201:1: ( ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:202:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression361);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression368); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:209:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:213:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:214:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:214:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:215:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:216:1: ( rule__ComparisonExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:216:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression394);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:228:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:229:1: ( ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:230:1: ruleAddExpression EOF
            {
             before(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression421);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression428); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:237:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:241:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:242:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:242:1: ( ( rule__AddExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:243:1: ( rule__AddExpression__Group__0 )
            {
             before(grammarAccess.getAddExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:244:1: ( rule__AddExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:244:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression454);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:256:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:257:1: ( ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:258:1: ruleMultExpression EOF
            {
             before(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression481);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression488); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:265:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:269:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:270:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:270:1: ( ( rule__MultExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:271:1: ( rule__MultExpression__Group__0 )
            {
             before(grammarAccess.getMultExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:272:1: ( rule__MultExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:272:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression514);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:284:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:285:1: ( ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:286:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression541);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression548); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:293:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:297:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:298:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:298:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:299:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:300:1: ( rule__UnaryExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:300:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression574);
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


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:312:1: entryRuleLiteralsExpression : ruleLiteralsExpression EOF ;
    public final void entryRuleLiteralsExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:313:1: ( ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:314:1: ruleLiteralsExpression EOF
            {
             before(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression601);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression608); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:321:1: ruleLiteralsExpression : ( ( rule__LiteralsExpression__Alternatives ) ) ;
    public final void ruleLiteralsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:325:2: ( ( ( rule__LiteralsExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:326:1: ( ( rule__LiteralsExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:326:1: ( ( rule__LiteralsExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:327:1: ( rule__LiteralsExpression__Alternatives )
            {
             before(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:328:1: ( rule__LiteralsExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:328:2: rule__LiteralsExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression634);
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:340:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:341:1: ( ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:342:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral661);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral668); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:349:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:353:2: ( ( ( rule__IntegerLiteral__ValAssignment ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:354:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:354:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:355:1: ( rule__IntegerLiteral__ValAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:356:1: ( rule__IntegerLiteral__ValAssignment )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:356:2: rule__IntegerLiteral__ValAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral694);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:368:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:369:1: ( ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:370:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt721);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt728); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:377:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:381:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:382:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:382:1: ( ( rule__EInt__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:383:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:384:1: ( rule__EInt__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:384:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt754);
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


    // $ANTLR start "rule__Conditional__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:396:1: rule__Conditional__Alternatives : ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:400:1: ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||LA1_0==25||(LA1_0>=29 && LA1_0<=30)) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:401:1: ( ruleOrExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:401:1: ( ruleOrExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:402:1: ruleOrExpression
                    {
                     before(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives790);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:407:6: ( ( rule__Conditional__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:407:6: ( ( rule__Conditional__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:408:1: ( rule__Conditional__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:409:1: ( rule__Conditional__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:409:2: rule__Conditional__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives807);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:418:1: rule__ComparisonExpression__Alternatives_1_0 : ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) );
    public final void rule__ComparisonExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:422:1: ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:423:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:423:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:424:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:425:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:425:2: rule__ComparisonExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_0840);
                    rule__ComparisonExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:429:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:429:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:430:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:431:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:431:2: rule__ComparisonExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_0858);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:440:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:444:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:445:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:445:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:446:1: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:447:1: ( rule__AddExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:447:2: rule__AddExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_0891);
                    rule__AddExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:451:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:451:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:452:1: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:453:1: ( rule__AddExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:453:2: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_0909);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:462:1: rule__MultExpression__Alternatives_1_0 : ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) );
    public final void rule__MultExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:466:1: ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:467:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:467:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:468:1: ( rule__MultExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:469:1: ( rule__MultExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:469:2: rule__MultExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_0942);
                    rule__MultExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:473:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:473:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:474:1: ( rule__MultExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:475:1: ( rule__MultExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:475:2: rule__MultExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_0960);
                    rule__MultExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:479:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:479:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:480:1: ( rule__MultExpression__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:481:1: ( rule__MultExpression__Group_1_0_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:481:2: rule__MultExpression__Group_1_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_0978);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:490:1: rule__UnaryExpression__Alternatives : ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:494:1: ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 30:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==25||LA5_2==30) ) {
                    alt5=3;
                }
                else if ( (LA5_2==RULE_INT) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:495:1: ( ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:495:1: ( ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:496:1: ruleLiteralsExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1011);
                    ruleLiteralsExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:501:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:501:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:502:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:503:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:503:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1028);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:507:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:507:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:508:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:509:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:509:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1046);
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


    // $ANTLR start "rule__LiteralsExpression__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:518:1: rule__LiteralsExpression__Alternatives : ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( ruleIntegerLiteral ) );
    public final void rule__LiteralsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:522:1: ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( ruleIntegerLiteral ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:523:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:523:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:524:1: ( rule__LiteralsExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:525:1: ( rule__LiteralsExpression__Group_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:525:2: rule__LiteralsExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1079);
                    rule__LiteralsExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:529:6: ( ruleIntegerLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:529:6: ( ruleIntegerLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:530:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1097);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_1()); 

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


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:542:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:546:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:547:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01127);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01130);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:554:1: rule__Rule__Group__0__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:558:1: ( ( 'when' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:559:1: ( 'when' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:559:1: ( 'when' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:560:1: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Rule__Group__0__Impl1158); 
             after(grammarAccess.getRuleAccess().getWhenKeyword_0()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:573:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:577:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:578:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11189);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11192);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:585:1: rule__Rule__Group__1__Impl : ( 'value' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:589:1: ( ( 'value' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:590:1: ( 'value' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:590:1: ( 'value' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:591:1: 'value'
            {
             before(grammarAccess.getRuleAccess().getValueKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Rule__Group__1__Impl1220); 
             after(grammarAccess.getRuleAccess().getValueKeyword_1()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:604:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:608:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:609:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21251);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21254);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:616:1: rule__Rule__Group__2__Impl : ( '=' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:620:1: ( ( '=' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:621:1: ( '=' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:621:1: ( '=' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:622:1: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Rule__Group__2__Impl1282); 
             after(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:635:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:639:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:640:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31313);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31316);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:647:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EvaluatedValAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:651:1: ( ( ( rule__Rule__EvaluatedValAssignment_3 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:652:1: ( ( rule__Rule__EvaluatedValAssignment_3 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:652:1: ( ( rule__Rule__EvaluatedValAssignment_3 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:653:1: ( rule__Rule__EvaluatedValAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:654:1: ( rule__Rule__EvaluatedValAssignment_3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:654:2: rule__Rule__EvaluatedValAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__EvaluatedValAssignment_3_in_rule__Rule__Group__3__Impl1343);
            rule__Rule__EvaluatedValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEvaluatedValAssignment_3()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:664:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:668:1: ( rule__Rule__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:669:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41373);
            rule__Rule__Group__4__Impl();

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:675:1: rule__Rule__Group__4__Impl : ( ';' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:679:1: ( ( ';' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:680:1: ( ';' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:680:1: ( ';' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:681:1: ';'
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rule__Group__4__Impl1401); 
             after(grammarAccess.getRuleAccess().getSemicolonKeyword_4()); 

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


    // $ANTLR start "rule__Conditional__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:704:1: rule__Conditional__Group_1__0 : rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 ;
    public final void rule__Conditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:708:1: ( rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:709:2: rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__01442);
            rule__Conditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__01445);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:716:1: rule__Conditional__Group_1__0__Impl : ( () ) ;
    public final void rule__Conditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:720:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:721:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:721:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:722:1: ()
            {
             before(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:723:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:725:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:735:1: rule__Conditional__Group_1__1 : rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 ;
    public final void rule__Conditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:739:1: ( rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:740:2: rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__11503);
            rule__Conditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__11506);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:747:1: rule__Conditional__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:751:1: ( ( 'if' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:752:1: ( 'if' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:752:1: ( 'if' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:753:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__1__Impl1534); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:766:1: rule__Conditional__Group_1__2 : rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 ;
    public final void rule__Conditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:770:1: ( rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:771:2: rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__21565);
            rule__Conditional__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__21568);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:778:1: rule__Conditional__Group_1__2__Impl : ( ( rule__Conditional__ConditionAssignment_1_2 ) ) ;
    public final void rule__Conditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:782:1: ( ( ( rule__Conditional__ConditionAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:783:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:783:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:784:1: ( rule__Conditional__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:785:1: ( rule__Conditional__ConditionAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:785:2: rule__Conditional__ConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl1595);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:795:1: rule__Conditional__Group_1__3 : rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 ;
    public final void rule__Conditional__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:799:1: ( rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:800:2: rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__31625);
            rule__Conditional__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__31628);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:807:1: rule__Conditional__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:811:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:812:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:812:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:813:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Conditional__Group_1__3__Impl1656); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:826:1: rule__Conditional__Group_1__4 : rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 ;
    public final void rule__Conditional__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:830:1: ( rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:831:2: rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__41687);
            rule__Conditional__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__41690);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:838:1: rule__Conditional__Group_1__4__Impl : ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) ;
    public final void rule__Conditional__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:842:1: ( ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:843:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:843:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:844:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:845:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:845:2: rule__Conditional__IfTrueExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl1717);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:855:1: rule__Conditional__Group_1__5 : rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 ;
    public final void rule__Conditional__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:859:1: ( rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:860:2: rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__51747);
            rule__Conditional__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__51750);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:867:1: rule__Conditional__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:871:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:872:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:872:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:873:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Conditional__Group_1__5__Impl1778); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:886:1: rule__Conditional__Group_1__6 : rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 ;
    public final void rule__Conditional__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:890:1: ( rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:891:2: rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__61809);
            rule__Conditional__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__61812);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:898:1: rule__Conditional__Group_1__6__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:902:1: ( ( 'else' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:903:1: ( 'else' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:903:1: ( 'else' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:904:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Conditional__Group_1__6__Impl1840); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:917:1: rule__Conditional__Group_1__7 : rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 ;
    public final void rule__Conditional__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:921:1: ( rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:922:2: rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__71871);
            rule__Conditional__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__71874);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:929:1: rule__Conditional__Group_1__7__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:933:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:934:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:934:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:935:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Conditional__Group_1__7__Impl1902); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:948:1: rule__Conditional__Group_1__8 : rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 ;
    public final void rule__Conditional__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:952:1: ( rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:953:2: rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__81933);
            rule__Conditional__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__81936);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:960:1: rule__Conditional__Group_1__8__Impl : ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) ;
    public final void rule__Conditional__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:964:1: ( ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:965:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:965:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:966:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:967:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:967:2: rule__Conditional__IfFalseExpressionAssignment_1_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl1963);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:977:1: rule__Conditional__Group_1__9 : rule__Conditional__Group_1__9__Impl ;
    public final void rule__Conditional__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:981:1: ( rule__Conditional__Group_1__9__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:982:2: rule__Conditional__Group_1__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__91993);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:988:1: rule__Conditional__Group_1__9__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:992:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:993:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:993:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:994:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Conditional__Group_1__9__Impl2021); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1027:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1031:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1032:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02072);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02075);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1039:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1043:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1044:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1044:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1045:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2102);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1056:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1060:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1061:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12131);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1067:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1071:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1072:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1072:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1073:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1074:1: ( rule__OrExpression__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1074:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2158);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1088:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1092:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1093:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02193);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02196);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1100:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1104:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1105:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1105:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1106:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1107:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1109:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1119:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1123:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1124:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12254);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12257);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1131:1: rule__OrExpression__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1135:1: ( ( '|' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1136:1: ( '|' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1136:1: ( '|' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1137:1: '|'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrExpression__Group_1__1__Impl2285); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1150:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1154:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1155:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22316);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1161:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1165:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1166:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1166:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1167:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1168:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1168:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2343);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1184:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1188:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1189:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02379);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02382);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1196:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1200:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1201:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1201:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1202:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl2409);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1213:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1217:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1218:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12438);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1224:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1228:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1229:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1229:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1230:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1231:1: ( rule__AndExpression__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1231:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2465);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1245:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1249:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1250:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02500);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02503);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1257:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1261:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1262:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1262:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1263:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1264:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1266:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1276:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1280:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1281:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12561);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12564);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1288:1: rule__AndExpression__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1292:1: ( ( '&' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1293:1: ( '&' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1293:1: ( '&' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1294:1: '&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__AndExpression__Group_1__1__Impl2592); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1307:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1311:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1312:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22623);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1318:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1322:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1323:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1323:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1324:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1325:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1325:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2650);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1341:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1345:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1346:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__02686);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__02689);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1353:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1357:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1358:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1358:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1359:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl2716);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1370:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1374:1: ( rule__EqualExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1375:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__12745);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1381:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1385:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1386:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1386:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1387:1: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1388:1: ( rule__EqualExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1388:2: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl2772);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1402:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1406:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1407:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__02807);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__02810);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1414:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1418:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1419:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1419:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1420:1: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1421:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1423:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1433:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1437:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1438:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__12868);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__12871);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1445:1: rule__EqualExpression__Group_1__1__Impl : ( '==' ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1449:1: ( ( '==' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1450:1: ( '==' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1450:1: ( '==' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1451:1: '=='
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EqualExpression__Group_1__1__Impl2899); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1464:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1468:1: ( rule__EqualExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1469:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__22930);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1475:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1479:1: ( ( ( rule__EqualExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1480:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1480:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1481:1: ( rule__EqualExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1482:1: ( rule__EqualExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1482:2: rule__EqualExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl2957);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1498:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1502:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1503:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__02993);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__02996);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1510:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1514:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1515:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1515:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1516:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl3023);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1527:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1531:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1532:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__13052);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1538:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1542:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1543:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1543:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1544:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1545:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1545:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl3079);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1559:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1563:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1564:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__03114);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__03117);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1571:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1575:1: ( ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1576:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1576:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1577:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1578:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1578:2: rule__ComparisonExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl3144);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1588:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1592:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1593:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__13174);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1599:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1603:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1604:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1604:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1605:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1606:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1606:2: rule__ComparisonExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl3201);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1620:1: rule__ComparisonExpression__Group_1_0_0__0 : rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1624:1: ( rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1625:2: rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__03235);
            rule__ComparisonExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__03238);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1632:1: rule__ComparisonExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1636:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1637:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1637:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1638:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1639:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1641:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1651:1: rule__ComparisonExpression__Group_1_0_0__1 : rule__ComparisonExpression__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1655:1: ( rule__ComparisonExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1656:2: rule__ComparisonExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__13296);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1662:1: rule__ComparisonExpression__Group_1_0_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1666:1: ( ( '>' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1667:1: ( '>' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1667:1: ( '>' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1668:1: '>'
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ComparisonExpression__Group_1_0_0__1__Impl3324); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1685:1: rule__ComparisonExpression__Group_1_0_1__0 : rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 ;
    public final void rule__ComparisonExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1689:1: ( rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1690:2: rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__03359);
            rule__ComparisonExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__03362);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1697:1: rule__ComparisonExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1701:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1702:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1702:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1703:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1704:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1706:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1716:1: rule__ComparisonExpression__Group_1_0_1__1 : rule__ComparisonExpression__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1720:1: ( rule__ComparisonExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1721:2: rule__ComparisonExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__13420);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1727:1: rule__ComparisonExpression__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1731:1: ( ( '<' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1732:1: ( '<' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1732:1: ( '<' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1733:1: '<'
            {
             before(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ComparisonExpression__Group_1_0_1__1__Impl3448); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1750:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1754:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1755:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03483);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03486);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1762:1: rule__AddExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1766:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1767:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1767:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1768:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl3513);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1779:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1783:1: ( rule__AddExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1784:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13542);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1790:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1794:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1795:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1795:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1796:1: ( rule__AddExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1797:1: ( rule__AddExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=24 && LA11_0<=25)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1797:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3569);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1811:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1815:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1816:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03604);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03607);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1823:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1827:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1828:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1828:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1829:1: ( rule__AddExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1830:1: ( rule__AddExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1830:2: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl3634);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1840:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1844:1: ( rule__AddExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1845:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13664);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1851:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1855:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1856:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1856:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1857:1: ( rule__AddExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1858:1: ( rule__AddExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1858:2: rule__AddExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3691);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1872:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1876:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1877:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__03725);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__03728);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1884:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1888:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1889:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1889:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1890:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1891:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1893:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1903:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1907:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1908:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__13786);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1914:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1918:1: ( ( '+' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1919:1: ( '+' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1919:1: ( '+' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1920:1: '+'
            {
             before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__AddExpression__Group_1_0_0__1__Impl3814); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1937:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1941:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1942:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__03849);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__03852);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1949:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1953:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1954:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1954:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1955:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1956:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1958:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1968:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1972:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1973:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__13910);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1979:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1983:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1984:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1984:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:1985:1: '-'
            {
             before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AddExpression__Group_1_0_1__1__Impl3938); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2002:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2006:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2007:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__03973);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__03976);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2014:1: rule__MultExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2018:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2019:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2019:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2020:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl4003);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2031:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2035:1: ( rule__MultExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2036:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__14032);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2042:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2046:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2047:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2047:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2048:1: ( rule__MultExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2049:1: ( rule__MultExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2049:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl4059);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2063:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2067:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2068:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04094);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04097);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2075:1: rule__MultExpression__Group_1__0__Impl : ( ( rule__MultExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2079:1: ( ( ( rule__MultExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2080:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2080:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2081:1: ( rule__MultExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2082:1: ( rule__MultExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2082:2: rule__MultExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl4124);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2092:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2096:1: ( rule__MultExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2097:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14154);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2103:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2107:1: ( ( ( rule__MultExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2108:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2108:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2109:1: ( rule__MultExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2110:1: ( rule__MultExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2110:2: rule__MultExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4181);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2124:1: rule__MultExpression__Group_1_0_0__0 : rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 ;
    public final void rule__MultExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2128:1: ( rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2129:2: rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__04215);
            rule__MultExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__04218);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2136:1: rule__MultExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2140:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2141:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2141:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2142:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2143:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2145:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2155:1: rule__MultExpression__Group_1_0_0__1 : rule__MultExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2159:1: ( rule__MultExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2160:2: rule__MultExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__14276);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2166:1: rule__MultExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2170:1: ( ( '*' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2171:1: ( '*' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2171:1: ( '*' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2172:1: '*'
            {
             before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MultExpression__Group_1_0_0__1__Impl4304); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2189:1: rule__MultExpression__Group_1_0_1__0 : rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 ;
    public final void rule__MultExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2193:1: ( rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2194:2: rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__04339);
            rule__MultExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__04342);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2201:1: rule__MultExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2205:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2206:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2206:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2207:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2208:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2210:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2220:1: rule__MultExpression__Group_1_0_1__1 : rule__MultExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2224:1: ( rule__MultExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2225:2: rule__MultExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__14400);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2231:1: rule__MultExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2235:1: ( ( '/' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2236:1: ( '/' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2236:1: ( '/' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2237:1: '/'
            {
             before(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MultExpression__Group_1_0_1__1__Impl4428); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2254:1: rule__MultExpression__Group_1_0_2__0 : rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 ;
    public final void rule__MultExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2258:1: ( rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2259:2: rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__04463);
            rule__MultExpression__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__04466);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2266:1: rule__MultExpression__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2270:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2271:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2271:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2272:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2273:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2275:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2285:1: rule__MultExpression__Group_1_0_2__1 : rule__MultExpression__Group_1_0_2__1__Impl ;
    public final void rule__MultExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2289:1: ( rule__MultExpression__Group_1_0_2__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2290:2: rule__MultExpression__Group_1_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__14524);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2296:1: rule__MultExpression__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__MultExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2300:1: ( ( '%' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2301:1: ( '%' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2301:1: ( '%' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2302:1: '%'
            {
             before(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MultExpression__Group_1_0_2__1__Impl4552); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2319:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2323:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2324:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__04587);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__04590);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2331:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2335:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2336:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2336:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2337:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2338:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2340:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2350:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2354:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2355:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__14648);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__14651);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2362:1: rule__UnaryExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2366:1: ( ( '!' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2367:1: ( '!' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2367:1: ( '!' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2368:1: '!'
            {
             before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__UnaryExpression__Group_1__1__Impl4679); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2381:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2385:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2386:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__24710);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2392:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2396:1: ( ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2397:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2397:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2398:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2399:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2399:2: rule__UnaryExpression__TargetAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl4737);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2415:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2419:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2420:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__04773);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__04776);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2427:1: rule__UnaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2431:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2432:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2432:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2433:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2434:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2436:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2446:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2450:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2451:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__14834);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__14837);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2458:1: rule__UnaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2462:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2463:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2463:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2464:1: '-'
            {
             before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__UnaryExpression__Group_2__1__Impl4865); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2477:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2481:1: ( rule__UnaryExpression__Group_2__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2482:2: rule__UnaryExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__24896);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2488:1: rule__UnaryExpression__Group_2__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2492:1: ( ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2493:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2493:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2494:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2495:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2495:2: rule__UnaryExpression__TargetAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl4923);
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


    // $ANTLR start "rule__LiteralsExpression__Group_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2511:1: rule__LiteralsExpression__Group_0__0 : rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 ;
    public final void rule__LiteralsExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2515:1: ( rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2516:2: rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__04959);
            rule__LiteralsExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__04962);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2523:1: rule__LiteralsExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LiteralsExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2527:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2528:1: ( '(' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2528:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2529:1: '('
            {
             before(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__LiteralsExpression__Group_0__0__Impl4990); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2542:1: rule__LiteralsExpression__Group_0__1 : rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 ;
    public final void rule__LiteralsExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2546:1: ( rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2547:2: rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__15021);
            rule__LiteralsExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__15024);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2554:1: rule__LiteralsExpression__Group_0__1__Impl : ( ruleConditional ) ;
    public final void rule__LiteralsExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2558:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2559:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2559:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2560:1: ruleConditional
            {
             before(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl5051);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2571:1: rule__LiteralsExpression__Group_0__2 : rule__LiteralsExpression__Group_0__2__Impl ;
    public final void rule__LiteralsExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2575:1: ( rule__LiteralsExpression__Group_0__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2576:2: rule__LiteralsExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__25080);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2582:1: rule__LiteralsExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__LiteralsExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2586:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2587:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2587:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2588:1: ')'
            {
             before(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__LiteralsExpression__Group_0__2__Impl5108); 
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


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2607:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2611:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2612:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05145);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05148);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2619:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2623:1: ( ( ( '-' )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2624:1: ( ( '-' )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2624:1: ( ( '-' )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2625:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2626:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2627:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EInt__Group__0__Impl5177); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2638:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2642:1: ( rule__EInt__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2643:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15210);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2649:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2653:1: ( ( RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2654:1: ( RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2654:1: ( RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2655:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5237); 
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


    // $ANTLR start "rule__Rule__EvaluatedValAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2671:1: rule__Rule__EvaluatedValAssignment_3 : ( ruleConditional ) ;
    public final void rule__Rule__EvaluatedValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2675:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2676:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2676:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2677:1: ruleConditional
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_35275);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__EvaluatedValAssignment_3"


    // $ANTLR start "rule__Conditional__ConditionAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2686:1: rule__Conditional__ConditionAssignment_1_2 : ( ruleConditional ) ;
    public final void rule__Conditional__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2690:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2691:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2691:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2692:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_25306);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2701:1: rule__Conditional__IfTrueExpressionAssignment_1_4 : ( ruleConditional ) ;
    public final void rule__Conditional__IfTrueExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2705:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2706:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2706:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2707:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_45337);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2716:1: rule__Conditional__IfFalseExpressionAssignment_1_8 : ( ruleConditional ) ;
    public final void rule__Conditional__IfFalseExpressionAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2720:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2721:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2721:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2722:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_85368);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2731:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2735:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2736:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2736:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2737:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25399);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2746:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2750:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2751:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2751:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2752:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_25430);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2761:1: rule__EqualExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2765:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2766:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2766:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2767:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_25461);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2776:1: rule__ComparisonExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2780:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2781:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2781:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2782:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_15492);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2791:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2795:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2796:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2796:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2797:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_15523);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2806:1: rule__MultExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2810:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2811:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2811:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2812:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_15554);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2821:1: rule__UnaryExpression__TargetAssignment_1_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2825:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2826:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2826:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2827:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_25585);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2836:1: rule__UnaryExpression__TargetAssignment_2_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2840:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2841:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2841:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2842:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_25616);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2851:1: rule__IntegerLiteral__ValAssignment : ( ruleEInt ) ;
    public final void rule__IntegerLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2855:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2856:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2856:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalCore.g:2857:1: ruleEInt
            {
             before(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment5647);
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
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Alternatives_in_ruleConditional154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_0840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_0858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_0891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_0909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_0942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_0960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_0978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01127 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Rule__Group__0__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11189 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Rule__Group__1__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21251 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Rule__Group__2__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31313 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__EvaluatedValAssignment_3_in_rule__Rule__Group__3__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rule__Group__4__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__01442 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__01445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__11503 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__11506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__1__Impl1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__21565 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__21568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__31625 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__31628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Conditional__Group_1__3__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__41687 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__41690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__51747 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__51750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Conditional__Group_1__5__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__61809 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__61812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Conditional__Group_1__6__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__71871 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__71874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Conditional__Group_1__7__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__81933 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__81936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__91993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Conditional__Group_1__9__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02072 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2158 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02193 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12254 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrExpression__Group_1__1__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02379 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2465 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02500 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12561 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__AndExpression__Group_1__1__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__02686 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__02689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__12745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl2772 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__02807 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__02810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__12868 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__12871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EqualExpression__Group_1__1__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__22930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__02993 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__02996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__13052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl3079 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__03114 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__03117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__13174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__03235 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__03238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__13296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ComparisonExpression__Group_1_0_0__1__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__03359 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__03362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__13420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ComparisonExpression__Group_1_0_1__1__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03483 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3569 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03604 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__03725 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__03728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__13786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AddExpression__Group_1_0_0__1__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__03849 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__03852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__13910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AddExpression__Group_1_0_1__1__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__03973 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__03976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__14032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl4059 = new BitSet(new long[]{0x000000001C000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04094 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__04215 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__04218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__14276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultExpression__Group_1_0_0__1__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__04339 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__04342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__14400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MultExpression__Group_1_0_1__1__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__04463 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__04466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__14524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MultExpression__Group_1_0_2__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__04587 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__04590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__14648 = new BitSet(new long[]{0x0000000042000010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__14651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__UnaryExpression__Group_1__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__24710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__04773 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__04776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__14834 = new BitSet(new long[]{0x0000000042000010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__14837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Group_2__1__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__24896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__04959 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__04962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__LiteralsExpression__Group_0__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__15021 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__15024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__25080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__LiteralsExpression__Group_0__2__Impl5108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05145 = new BitSet(new long[]{0x0000000042000010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EInt__Group__0__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_35275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_25306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_45337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_85368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_25430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_25461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_15492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_15523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_15554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_25585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_25616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment5647 = new BitSet(new long[]{0x0000000000000002L});
    }


}