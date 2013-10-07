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
import org.kermeta.language.sample.cellularautomata.rules.services.EvolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'nextValue'", "'='", "'{'", "'}'", "'['", "','", "']'", "'('", "')'", "'neighborsMax'", "'neighborsMin'", "'neighborsSum'", "'neighborsSize'", "'CurrentValue'", "'if'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'"
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEvolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvolParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g"; }


     
     	private EvolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EvolGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:60:1: entryRuleCellularAutomata : ruleCellularAutomata EOF ;
    public final void entryRuleCellularAutomata() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:61:1: ( ruleCellularAutomata EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:62:1: ruleCellularAutomata EOF
            {
             before(grammarAccess.getCellularAutomataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata61);
            ruleCellularAutomata();

            state._fsp--;

             after(grammarAccess.getCellularAutomataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomata68); 

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
    // $ANTLR end "entryRuleCellularAutomata"


    // $ANTLR start "ruleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:69:1: ruleCellularAutomata : ( ( rule__CellularAutomata__Group__0 ) ) ;
    public final void ruleCellularAutomata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:73:2: ( ( ( rule__CellularAutomata__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:74:1: ( ( rule__CellularAutomata__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:74:1: ( ( rule__CellularAutomata__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:75:1: ( rule__CellularAutomata__Group__0 )
            {
             before(grammarAccess.getCellularAutomataAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:76:1: ( rule__CellularAutomata__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:76:2: rule__CellularAutomata__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__0_in_ruleCellularAutomata94);
            rule__CellularAutomata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataAccess().getGroup()); 

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
    // $ANTLR end "ruleCellularAutomata"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:89:1: ( ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:90:1: ruleRule EOF
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:104:1: ( rule__Rule__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:104:2: rule__Rule__Group__0
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


    // $ANTLR start "entryRulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:116:1: entryRulePopulationRange : rulePopulationRange EOF ;
    public final void entryRulePopulationRange() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:117:1: ( rulePopulationRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:118:1: rulePopulationRange EOF
            {
             before(grammarAccess.getPopulationRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_entryRulePopulationRange181);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getPopulationRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePopulationRange188); 

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
    // $ANTLR end "entryRulePopulationRange"


    // $ANTLR start "rulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:125:1: rulePopulationRange : ( ( rule__PopulationRange__Group__0 ) ) ;
    public final void rulePopulationRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:129:2: ( ( ( rule__PopulationRange__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:130:1: ( ( rule__PopulationRange__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:130:1: ( ( rule__PopulationRange__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:131:1: ( rule__PopulationRange__Group__0 )
            {
             before(grammarAccess.getPopulationRangeAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:132:1: ( rule__PopulationRange__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:132:2: rule__PopulationRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__0_in_rulePopulationRange214);
            rule__PopulationRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPopulationRangeAccess().getGroup()); 

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
    // $ANTLR end "rulePopulationRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:144:1: entryRuleLiteralsExpression : ruleLiteralsExpression EOF ;
    public final void entryRuleLiteralsExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:145:1: ( ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:146:1: ruleLiteralsExpression EOF
            {
             before(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression241);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression248); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:153:1: ruleLiteralsExpression : ( ( rule__LiteralsExpression__Alternatives ) ) ;
    public final void ruleLiteralsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:157:2: ( ( ( rule__LiteralsExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:158:1: ( ( rule__LiteralsExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:158:1: ( ( rule__LiteralsExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:159:1: ( rule__LiteralsExpression__Alternatives )
            {
             before(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:160:1: ( rule__LiteralsExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:160:2: rule__LiteralsExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression274);
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


    // $ANTLR start "entryRuleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:172:1: entryRuleMax : ruleMax EOF ;
    public final void entryRuleMax() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:173:1: ( ruleMax EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:174:1: ruleMax EOF
            {
             before(grammarAccess.getMaxRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMax_in_entryRuleMax301);
            ruleMax();

            state._fsp--;

             after(grammarAccess.getMaxRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMax308); 

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
    // $ANTLR end "entryRuleMax"


    // $ANTLR start "ruleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:181:1: ruleMax : ( ( rule__Max__Group__0 ) ) ;
    public final void ruleMax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:185:2: ( ( ( rule__Max__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:186:1: ( ( rule__Max__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:186:1: ( ( rule__Max__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:187:1: ( rule__Max__Group__0 )
            {
             before(grammarAccess.getMaxAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:188:1: ( rule__Max__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:188:2: rule__Max__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__0_in_ruleMax334);
            rule__Max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxAccess().getGroup()); 

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
    // $ANTLR end "ruleMax"


    // $ANTLR start "entryRuleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:200:1: entryRuleMin : ruleMin EOF ;
    public final void entryRuleMin() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:201:1: ( ruleMin EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:202:1: ruleMin EOF
            {
             before(grammarAccess.getMinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMin_in_entryRuleMin361);
            ruleMin();

            state._fsp--;

             after(grammarAccess.getMinRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMin368); 

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
    // $ANTLR end "entryRuleMin"


    // $ANTLR start "ruleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:209:1: ruleMin : ( ( rule__Min__Group__0 ) ) ;
    public final void ruleMin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:213:2: ( ( ( rule__Min__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:214:1: ( ( rule__Min__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:214:1: ( ( rule__Min__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:215:1: ( rule__Min__Group__0 )
            {
             before(grammarAccess.getMinAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:216:1: ( rule__Min__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:216:2: rule__Min__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__0_in_ruleMin394);
            rule__Min__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinAccess().getGroup()); 

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
    // $ANTLR end "ruleMin"


    // $ANTLR start "entryRuleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:228:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:229:1: ( ruleSum EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:230:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSum_in_entryRuleSum421);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSum428); 

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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:237:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:241:2: ( ( ( rule__Sum__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:242:1: ( ( rule__Sum__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:242:1: ( ( rule__Sum__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:243:1: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:244:1: ( rule__Sum__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:244:2: rule__Sum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__0_in_ruleSum454);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:256:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:257:1: ( ruleSize EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:258:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSize_in_entryRuleSize481);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSize488); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:265:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:269:2: ( ( ( rule__Size__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:270:1: ( ( rule__Size__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:270:1: ( ( rule__Size__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:271:1: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:272:1: ( rule__Size__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:272:2: rule__Size__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__0_in_ruleSize514);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:284:1: entryRuleCurrentCellPopulation : ruleCurrentCellPopulation EOF ;
    public final void entryRuleCurrentCellPopulation() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:285:1: ( ruleCurrentCellPopulation EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:286:1: ruleCurrentCellPopulation EOF
            {
             before(grammarAccess.getCurrentCellPopulationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation541);
            ruleCurrentCellPopulation();

            state._fsp--;

             after(grammarAccess.getCurrentCellPopulationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurrentCellPopulation548); 

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
    // $ANTLR end "entryRuleCurrentCellPopulation"


    // $ANTLR start "ruleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:293:1: ruleCurrentCellPopulation : ( ( rule__CurrentCellPopulation__Group__0 ) ) ;
    public final void ruleCurrentCellPopulation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:297:2: ( ( ( rule__CurrentCellPopulation__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:298:1: ( ( rule__CurrentCellPopulation__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:298:1: ( ( rule__CurrentCellPopulation__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:299:1: ( rule__CurrentCellPopulation__Group__0 )
            {
             before(grammarAccess.getCurrentCellPopulationAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:300:1: ( rule__CurrentCellPopulation__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:300:2: rule__CurrentCellPopulation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CurrentCellPopulation__Group__0_in_ruleCurrentCellPopulation574);
            rule__CurrentCellPopulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurrentCellPopulationAccess().getGroup()); 

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
    // $ANTLR end "ruleCurrentCellPopulation"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:312:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:313:1: ( ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:314:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional601);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional608); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:321:1: ruleConditional : ( ( rule__Conditional__Alternatives ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:325:2: ( ( ( rule__Conditional__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:326:1: ( ( rule__Conditional__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:326:1: ( ( rule__Conditional__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:327:1: ( rule__Conditional__Alternatives )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:328:1: ( rule__Conditional__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:328:2: rule__Conditional__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Alternatives_in_ruleConditional634);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:340:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:341:1: ( ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:342:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression661);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression668); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:349:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:353:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:355:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:356:1: ( rule__OrExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:356:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression694);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:368:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:369:1: ( ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:370:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression721);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression728); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:377:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:381:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:383:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:384:1: ( rule__AndExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:384:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression754);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:396:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:397:1: ( ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:398:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression781);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression788); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:405:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:409:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:410:1: ( ( rule__EqualExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:410:1: ( ( rule__EqualExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:411:1: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:412:1: ( rule__EqualExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:412:2: rule__EqualExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression814);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:424:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:425:1: ( ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:426:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression841);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression848); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:433:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:437:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:438:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:438:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:439:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:440:1: ( rule__ComparisonExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:440:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression874);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:452:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:453:1: ( ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:454:1: ruleAddExpression EOF
            {
             before(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression901);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression908); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:461:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:465:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:466:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:466:1: ( ( rule__AddExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:467:1: ( rule__AddExpression__Group__0 )
            {
             before(grammarAccess.getAddExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:468:1: ( rule__AddExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:468:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression934);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:480:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:481:1: ( ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:482:1: ruleMultExpression EOF
            {
             before(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression961);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression968); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:489:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:493:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:494:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:494:1: ( ( rule__MultExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:495:1: ( rule__MultExpression__Group__0 )
            {
             before(grammarAccess.getMultExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:496:1: ( rule__MultExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:496:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression994);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:508:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:509:1: ( ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:510:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1021);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression1028); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:517:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:521:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:522:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:522:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:523:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:524:1: ( rule__UnaryExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:524:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1054);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:536:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:537:1: ( ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:538:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1081);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral1088); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:545:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:549:2: ( ( ( rule__IntegerLiteral__ValAssignment ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:550:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:550:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:551:1: ( rule__IntegerLiteral__ValAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:552:1: ( rule__IntegerLiteral__ValAssignment )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:552:2: rule__IntegerLiteral__ValAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1114);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:564:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:565:1: ( ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:566:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1141);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1148); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:573:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:577:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:578:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:578:1: ( ( rule__EInt__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:579:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:580:1: ( rule__EInt__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:580:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1174);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:592:1: rule__LiteralsExpression__Alternatives : ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( ruleMax ) | ( ruleMin ) | ( ruleSum ) | ( ruleSize ) | ( ruleCurrentCellPopulation ) | ( ruleIntegerLiteral ) );
    public final void rule__LiteralsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:596:1: ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( ruleMax ) | ( ruleMin ) | ( ruleSum ) | ( ruleSize ) | ( ruleCurrentCellPopulation ) | ( ruleIntegerLiteral ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
                }
                break;
            case 25:
                {
                alt1=6;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:597:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:597:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:598:1: ( rule__LiteralsExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:599:1: ( rule__LiteralsExpression__Group_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:599:2: rule__LiteralsExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1210);
                    rule__LiteralsExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:603:6: ( ruleMax )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:603:6: ( ruleMax )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:604:1: ruleMax
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getMaxParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMax_in_rule__LiteralsExpression__Alternatives1228);
                    ruleMax();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getMaxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:609:6: ( ruleMin )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:609:6: ( ruleMin )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:610:1: ruleMin
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getMinParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMin_in_rule__LiteralsExpression__Alternatives1245);
                    ruleMin();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getMinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:615:6: ( ruleSum )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:615:6: ( ruleSum )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:616:1: ruleSum
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getSumParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSum_in_rule__LiteralsExpression__Alternatives1262);
                    ruleSum();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getSumParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:621:6: ( ruleSize )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:621:6: ( ruleSize )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:622:1: ruleSize
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getSizeParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSize_in_rule__LiteralsExpression__Alternatives1279);
                    ruleSize();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getSizeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:627:6: ( ruleCurrentCellPopulation )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:627:6: ( ruleCurrentCellPopulation )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:628:1: ruleCurrentCellPopulation
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getCurrentCellPopulationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_rule__LiteralsExpression__Alternatives1296);
                    ruleCurrentCellPopulation();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getCurrentCellPopulationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:633:6: ( ruleIntegerLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:633:6: ( ruleIntegerLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:634:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1313);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_6()); 

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


    // $ANTLR start "rule__Conditional__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:644:1: rule__Conditional__Alternatives : ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:648:1: ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==19||(LA2_0>=21 && LA2_0<=25)||LA2_0==34||LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:649:1: ( ruleOrExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:649:1: ( ruleOrExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:650:1: ruleOrExpression
                    {
                     before(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1345);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:655:6: ( ( rule__Conditional__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:655:6: ( ( rule__Conditional__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:656:1: ( rule__Conditional__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:657:1: ( rule__Conditional__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:657:2: rule__Conditional__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1362);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:666:1: rule__ComparisonExpression__Alternatives_1_0 : ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) );
    public final void rule__ComparisonExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:670:1: ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:671:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:671:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:672:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:673:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:673:2: rule__ComparisonExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01395);
                    rule__ComparisonExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:677:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:677:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:678:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:679:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:679:2: rule__ComparisonExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01413);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:688:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:692:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:693:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:693:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:694:1: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:695:1: ( rule__AddExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:695:2: rule__AddExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01446);
                    rule__AddExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:699:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:699:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:700:1: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:701:1: ( rule__AddExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:701:2: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01464);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:710:1: rule__MultExpression__Alternatives_1_0 : ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) );
    public final void rule__MultExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:714:1: ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:715:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:715:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:716:1: ( rule__MultExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:717:1: ( rule__MultExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:717:2: rule__MultExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01497);
                    rule__MultExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:721:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:721:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:722:1: ( rule__MultExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:723:1: ( rule__MultExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:723:2: rule__MultExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01515);
                    rule__MultExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:727:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:727:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:728:1: ( rule__MultExpression__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:729:1: ( rule__MultExpression__Group_1_0_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:729:2: rule__MultExpression__Group_1_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01533);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:738:1: rule__UnaryExpression__Alternatives : ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:742:1: ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==19||(LA6_2>=21 && LA6_2<=25)||LA6_2==34) ) {
                    alt6=3;
                }
                else if ( (LA6_2==RULE_INT) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:743:1: ( ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:743:1: ( ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:744:1: ruleLiteralsExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1566);
                    ruleLiteralsExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:749:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:749:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:750:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:751:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:751:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1583);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:755:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:755:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:756:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:757:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:757:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1601);
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


    // $ANTLR start "rule__CellularAutomata__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:768:1: rule__CellularAutomata__Group__0 : rule__CellularAutomata__Group__0__Impl rule__CellularAutomata__Group__1 ;
    public final void rule__CellularAutomata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:772:1: ( rule__CellularAutomata__Group__0__Impl rule__CellularAutomata__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:773:2: rule__CellularAutomata__Group__0__Impl rule__CellularAutomata__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__0__Impl_in_rule__CellularAutomata__Group__01632);
            rule__CellularAutomata__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__1_in_rule__CellularAutomata__Group__01635);
            rule__CellularAutomata__Group__1();

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
    // $ANTLR end "rule__CellularAutomata__Group__0"


    // $ANTLR start "rule__CellularAutomata__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:780:1: rule__CellularAutomata__Group__0__Impl : ( () ) ;
    public final void rule__CellularAutomata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:784:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:785:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:785:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:786:1: ()
            {
             before(grammarAccess.getCellularAutomataAccess().getCellularAutomataAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:787:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:789:1: 
            {
            }

             after(grammarAccess.getCellularAutomataAccess().getCellularAutomataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomata__Group__0__Impl"


    // $ANTLR start "rule__CellularAutomata__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:799:1: rule__CellularAutomata__Group__1 : rule__CellularAutomata__Group__1__Impl rule__CellularAutomata__Group__2 ;
    public final void rule__CellularAutomata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:803:1: ( rule__CellularAutomata__Group__1__Impl rule__CellularAutomata__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:804:2: rule__CellularAutomata__Group__1__Impl rule__CellularAutomata__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__1__Impl_in_rule__CellularAutomata__Group__11693);
            rule__CellularAutomata__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__2_in_rule__CellularAutomata__Group__11696);
            rule__CellularAutomata__Group__2();

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
    // $ANTLR end "rule__CellularAutomata__Group__1"


    // $ANTLR start "rule__CellularAutomata__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:811:1: rule__CellularAutomata__Group__1__Impl : ( ( rule__CellularAutomata__RulesAssignment_1 ) ) ;
    public final void rule__CellularAutomata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:815:1: ( ( ( rule__CellularAutomata__RulesAssignment_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:816:1: ( ( rule__CellularAutomata__RulesAssignment_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:816:1: ( ( rule__CellularAutomata__RulesAssignment_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:817:1: ( rule__CellularAutomata__RulesAssignment_1 )
            {
             before(grammarAccess.getCellularAutomataAccess().getRulesAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:818:1: ( rule__CellularAutomata__RulesAssignment_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:818:2: rule__CellularAutomata__RulesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__RulesAssignment_1_in_rule__CellularAutomata__Group__1__Impl1723);
            rule__CellularAutomata__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataAccess().getRulesAssignment_1()); 

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
    // $ANTLR end "rule__CellularAutomata__Group__1__Impl"


    // $ANTLR start "rule__CellularAutomata__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:828:1: rule__CellularAutomata__Group__2 : rule__CellularAutomata__Group__2__Impl ;
    public final void rule__CellularAutomata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:832:1: ( rule__CellularAutomata__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:833:2: rule__CellularAutomata__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__Group__2__Impl_in_rule__CellularAutomata__Group__21753);
            rule__CellularAutomata__Group__2__Impl();

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
    // $ANTLR end "rule__CellularAutomata__Group__2"


    // $ANTLR start "rule__CellularAutomata__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:839:1: rule__CellularAutomata__Group__2__Impl : ( ( rule__CellularAutomata__RulesAssignment_2 )* ) ;
    public final void rule__CellularAutomata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:843:1: ( ( ( rule__CellularAutomata__RulesAssignment_2 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:844:1: ( ( rule__CellularAutomata__RulesAssignment_2 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:844:1: ( ( rule__CellularAutomata__RulesAssignment_2 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:845:1: ( rule__CellularAutomata__RulesAssignment_2 )*
            {
             before(grammarAccess.getCellularAutomataAccess().getRulesAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:846:1: ( rule__CellularAutomata__RulesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:846:2: rule__CellularAutomata__RulesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CellularAutomata__RulesAssignment_2_in_rule__CellularAutomata__Group__2__Impl1780);
            	    rule__CellularAutomata__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCellularAutomataAccess().getRulesAssignment_2()); 

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
    // $ANTLR end "rule__CellularAutomata__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:862:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:866:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:867:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01817);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01820);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:874:1: rule__Rule__Group__0__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:878:1: ( ( 'when' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:879:1: ( 'when' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:879:1: ( 'when' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:880:1: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Rule__Group__0__Impl1848); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:893:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:897:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:898:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11879);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11882);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:905:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__FilterAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:909:1: ( ( ( rule__Rule__FilterAssignment_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:910:1: ( ( rule__Rule__FilterAssignment_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:910:1: ( ( rule__Rule__FilterAssignment_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:911:1: ( rule__Rule__FilterAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:912:1: ( rule__Rule__FilterAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:912:2: rule__Rule__FilterAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1909);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:922:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:926:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:927:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21940);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21943);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:934:1: rule__Rule__Group__2__Impl : ( 'nextValue' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:938:1: ( ( 'nextValue' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:939:1: ( 'nextValue' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:939:1: ( 'nextValue' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:940:1: 'nextValue'
            {
             before(grammarAccess.getRuleAccess().getNextValueKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Rule__Group__2__Impl1971); 
             after(grammarAccess.getRuleAccess().getNextValueKeyword_2()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:953:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:957:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:958:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32002);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32005);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:965:1: rule__Rule__Group__3__Impl : ( '=' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:969:1: ( ( '=' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:970:1: ( '=' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:970:1: ( '=' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:971:1: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Rule__Group__3__Impl2033); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:984:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:988:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:989:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42064);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42067);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:996:1: rule__Rule__Group__4__Impl : ( '{' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1000:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1001:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1001:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1002:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rule__Group__4__Impl2095); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1015:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1019:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1020:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52126);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52129);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1027:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__EvaluatedValAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1031:1: ( ( ( rule__Rule__EvaluatedValAssignment_5 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1032:1: ( ( rule__Rule__EvaluatedValAssignment_5 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1032:1: ( ( rule__Rule__EvaluatedValAssignment_5 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1033:1: ( rule__Rule__EvaluatedValAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValAssignment_5()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1034:1: ( rule__Rule__EvaluatedValAssignment_5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1034:2: rule__Rule__EvaluatedValAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__EvaluatedValAssignment_5_in_rule__Rule__Group__5__Impl2156);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1044:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1048:1: ( rule__Rule__Group__6__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1049:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62186);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1055:1: rule__Rule__Group__6__Impl : ( '}' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1059:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1060:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1060:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1061:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Rule__Group__6__Impl2214); 
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


    // $ANTLR start "rule__PopulationRange__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1088:1: rule__PopulationRange__Group__0 : rule__PopulationRange__Group__0__Impl rule__PopulationRange__Group__1 ;
    public final void rule__PopulationRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1092:1: ( rule__PopulationRange__Group__0__Impl rule__PopulationRange__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1093:2: rule__PopulationRange__Group__0__Impl rule__PopulationRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__0__Impl_in_rule__PopulationRange__Group__02259);
            rule__PopulationRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__1_in_rule__PopulationRange__Group__02262);
            rule__PopulationRange__Group__1();

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
    // $ANTLR end "rule__PopulationRange__Group__0"


    // $ANTLR start "rule__PopulationRange__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1100:1: rule__PopulationRange__Group__0__Impl : ( () ) ;
    public final void rule__PopulationRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1104:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1105:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1105:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1106:1: ()
            {
             before(grammarAccess.getPopulationRangeAccess().getPopulationRangeAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1107:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1109:1: 
            {
            }

             after(grammarAccess.getPopulationRangeAccess().getPopulationRangeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulationRange__Group__0__Impl"


    // $ANTLR start "rule__PopulationRange__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1119:1: rule__PopulationRange__Group__1 : rule__PopulationRange__Group__1__Impl rule__PopulationRange__Group__2 ;
    public final void rule__PopulationRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1123:1: ( rule__PopulationRange__Group__1__Impl rule__PopulationRange__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1124:2: rule__PopulationRange__Group__1__Impl rule__PopulationRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__1__Impl_in_rule__PopulationRange__Group__12320);
            rule__PopulationRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__2_in_rule__PopulationRange__Group__12323);
            rule__PopulationRange__Group__2();

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
    // $ANTLR end "rule__PopulationRange__Group__1"


    // $ANTLR start "rule__PopulationRange__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1131:1: rule__PopulationRange__Group__1__Impl : ( '[' ) ;
    public final void rule__PopulationRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1135:1: ( ( '[' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1136:1: ( '[' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1136:1: ( '[' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1137:1: '['
            {
             before(grammarAccess.getPopulationRangeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PopulationRange__Group__1__Impl2351); 
             after(grammarAccess.getPopulationRangeAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__PopulationRange__Group__1__Impl"


    // $ANTLR start "rule__PopulationRange__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1150:1: rule__PopulationRange__Group__2 : rule__PopulationRange__Group__2__Impl rule__PopulationRange__Group__3 ;
    public final void rule__PopulationRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1154:1: ( rule__PopulationRange__Group__2__Impl rule__PopulationRange__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1155:2: rule__PopulationRange__Group__2__Impl rule__PopulationRange__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__2__Impl_in_rule__PopulationRange__Group__22382);
            rule__PopulationRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__3_in_rule__PopulationRange__Group__22385);
            rule__PopulationRange__Group__3();

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
    // $ANTLR end "rule__PopulationRange__Group__2"


    // $ANTLR start "rule__PopulationRange__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1162:1: rule__PopulationRange__Group__2__Impl : ( ( rule__PopulationRange__LowerRangeAssignment_2 )? ) ;
    public final void rule__PopulationRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1166:1: ( ( ( rule__PopulationRange__LowerRangeAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1167:1: ( ( rule__PopulationRange__LowerRangeAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1167:1: ( ( rule__PopulationRange__LowerRangeAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1168:1: ( rule__PopulationRange__LowerRangeAssignment_2 )?
            {
             before(grammarAccess.getPopulationRangeAccess().getLowerRangeAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1169:1: ( rule__PopulationRange__LowerRangeAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1169:2: rule__PopulationRange__LowerRangeAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__LowerRangeAssignment_2_in_rule__PopulationRange__Group__2__Impl2412);
                    rule__PopulationRange__LowerRangeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPopulationRangeAccess().getLowerRangeAssignment_2()); 

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
    // $ANTLR end "rule__PopulationRange__Group__2__Impl"


    // $ANTLR start "rule__PopulationRange__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1179:1: rule__PopulationRange__Group__3 : rule__PopulationRange__Group__3__Impl rule__PopulationRange__Group__4 ;
    public final void rule__PopulationRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1183:1: ( rule__PopulationRange__Group__3__Impl rule__PopulationRange__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1184:2: rule__PopulationRange__Group__3__Impl rule__PopulationRange__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__3__Impl_in_rule__PopulationRange__Group__32443);
            rule__PopulationRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__4_in_rule__PopulationRange__Group__32446);
            rule__PopulationRange__Group__4();

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
    // $ANTLR end "rule__PopulationRange__Group__3"


    // $ANTLR start "rule__PopulationRange__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1191:1: rule__PopulationRange__Group__3__Impl : ( ',' ) ;
    public final void rule__PopulationRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1195:1: ( ( ',' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1196:1: ( ',' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1196:1: ( ',' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1197:1: ','
            {
             before(grammarAccess.getPopulationRangeAccess().getCommaKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PopulationRange__Group__3__Impl2474); 
             after(grammarAccess.getPopulationRangeAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__PopulationRange__Group__3__Impl"


    // $ANTLR start "rule__PopulationRange__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1210:1: rule__PopulationRange__Group__4 : rule__PopulationRange__Group__4__Impl rule__PopulationRange__Group__5 ;
    public final void rule__PopulationRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1214:1: ( rule__PopulationRange__Group__4__Impl rule__PopulationRange__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1215:2: rule__PopulationRange__Group__4__Impl rule__PopulationRange__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__4__Impl_in_rule__PopulationRange__Group__42505);
            rule__PopulationRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__5_in_rule__PopulationRange__Group__42508);
            rule__PopulationRange__Group__5();

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
    // $ANTLR end "rule__PopulationRange__Group__4"


    // $ANTLR start "rule__PopulationRange__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1222:1: rule__PopulationRange__Group__4__Impl : ( ( rule__PopulationRange__UpperRangeAssignment_4 )? ) ;
    public final void rule__PopulationRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1226:1: ( ( ( rule__PopulationRange__UpperRangeAssignment_4 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1227:1: ( ( rule__PopulationRange__UpperRangeAssignment_4 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1227:1: ( ( rule__PopulationRange__UpperRangeAssignment_4 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1228:1: ( rule__PopulationRange__UpperRangeAssignment_4 )?
            {
             before(grammarAccess.getPopulationRangeAccess().getUpperRangeAssignment_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1229:1: ( rule__PopulationRange__UpperRangeAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1229:2: rule__PopulationRange__UpperRangeAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__UpperRangeAssignment_4_in_rule__PopulationRange__Group__4__Impl2535);
                    rule__PopulationRange__UpperRangeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPopulationRangeAccess().getUpperRangeAssignment_4()); 

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
    // $ANTLR end "rule__PopulationRange__Group__4__Impl"


    // $ANTLR start "rule__PopulationRange__Group__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1239:1: rule__PopulationRange__Group__5 : rule__PopulationRange__Group__5__Impl ;
    public final void rule__PopulationRange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1243:1: ( rule__PopulationRange__Group__5__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1244:2: rule__PopulationRange__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PopulationRange__Group__5__Impl_in_rule__PopulationRange__Group__52566);
            rule__PopulationRange__Group__5__Impl();

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
    // $ANTLR end "rule__PopulationRange__Group__5"


    // $ANTLR start "rule__PopulationRange__Group__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1250:1: rule__PopulationRange__Group__5__Impl : ( ']' ) ;
    public final void rule__PopulationRange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1254:1: ( ( ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1255:1: ( ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1255:1: ( ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1256:1: ']'
            {
             before(grammarAccess.getPopulationRangeAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PopulationRange__Group__5__Impl2594); 
             after(grammarAccess.getPopulationRangeAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__PopulationRange__Group__5__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1281:1: rule__LiteralsExpression__Group_0__0 : rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 ;
    public final void rule__LiteralsExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1285:1: ( rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1286:2: rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__02637);
            rule__LiteralsExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__02640);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1293:1: rule__LiteralsExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LiteralsExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1297:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1298:1: ( '(' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1298:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1299:1: '('
            {
             before(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LiteralsExpression__Group_0__0__Impl2668); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1312:1: rule__LiteralsExpression__Group_0__1 : rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 ;
    public final void rule__LiteralsExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1316:1: ( rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1317:2: rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__12699);
            rule__LiteralsExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__12702);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1324:1: rule__LiteralsExpression__Group_0__1__Impl : ( ruleConditional ) ;
    public final void rule__LiteralsExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1328:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1329:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1329:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1330:1: ruleConditional
            {
             before(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl2729);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1341:1: rule__LiteralsExpression__Group_0__2 : rule__LiteralsExpression__Group_0__2__Impl ;
    public final void rule__LiteralsExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1345:1: ( rule__LiteralsExpression__Group_0__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1346:2: rule__LiteralsExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__22758);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1352:1: rule__LiteralsExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__LiteralsExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1356:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1357:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1357:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1358:1: ')'
            {
             before(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__LiteralsExpression__Group_0__2__Impl2786); 
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


    // $ANTLR start "rule__Max__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1377:1: rule__Max__Group__0 : rule__Max__Group__0__Impl rule__Max__Group__1 ;
    public final void rule__Max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1381:1: ( rule__Max__Group__0__Impl rule__Max__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1382:2: rule__Max__Group__0__Impl rule__Max__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__0__Impl_in_rule__Max__Group__02823);
            rule__Max__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__1_in_rule__Max__Group__02826);
            rule__Max__Group__1();

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
    // $ANTLR end "rule__Max__Group__0"


    // $ANTLR start "rule__Max__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1389:1: rule__Max__Group__0__Impl : ( () ) ;
    public final void rule__Max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1393:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1394:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1394:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1395:1: ()
            {
             before(grammarAccess.getMaxAccess().getMaxAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1396:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1398:1: 
            {
            }

             after(grammarAccess.getMaxAccess().getMaxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Max__Group__0__Impl"


    // $ANTLR start "rule__Max__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1408:1: rule__Max__Group__1 : rule__Max__Group__1__Impl rule__Max__Group__2 ;
    public final void rule__Max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1412:1: ( rule__Max__Group__1__Impl rule__Max__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1413:2: rule__Max__Group__1__Impl rule__Max__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__1__Impl_in_rule__Max__Group__12884);
            rule__Max__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__2_in_rule__Max__Group__12887);
            rule__Max__Group__2();

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
    // $ANTLR end "rule__Max__Group__1"


    // $ANTLR start "rule__Max__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1420:1: rule__Max__Group__1__Impl : ( 'neighborsMax' ) ;
    public final void rule__Max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1424:1: ( ( 'neighborsMax' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1425:1: ( 'neighborsMax' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1425:1: ( 'neighborsMax' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1426:1: 'neighborsMax'
            {
             before(grammarAccess.getMaxAccess().getNeighborsMaxKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Max__Group__1__Impl2915); 
             after(grammarAccess.getMaxAccess().getNeighborsMaxKeyword_1()); 

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
    // $ANTLR end "rule__Max__Group__1__Impl"


    // $ANTLR start "rule__Max__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1439:1: rule__Max__Group__2 : rule__Max__Group__2__Impl ;
    public final void rule__Max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1443:1: ( rule__Max__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1444:2: rule__Max__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Max__Group__2__Impl_in_rule__Max__Group__22946);
            rule__Max__Group__2__Impl();

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
    // $ANTLR end "rule__Max__Group__2"


    // $ANTLR start "rule__Max__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1450:1: rule__Max__Group__2__Impl : ( ( rule__Max__NeighborsFilterAssignment_2 )? ) ;
    public final void rule__Max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1454:1: ( ( ( rule__Max__NeighborsFilterAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1455:1: ( ( rule__Max__NeighborsFilterAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1455:1: ( ( rule__Max__NeighborsFilterAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1456:1: ( rule__Max__NeighborsFilterAssignment_2 )?
            {
             before(grammarAccess.getMaxAccess().getNeighborsFilterAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1457:1: ( rule__Max__NeighborsFilterAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1457:2: rule__Max__NeighborsFilterAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Max__NeighborsFilterAssignment_2_in_rule__Max__Group__2__Impl2973);
                    rule__Max__NeighborsFilterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxAccess().getNeighborsFilterAssignment_2()); 

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
    // $ANTLR end "rule__Max__Group__2__Impl"


    // $ANTLR start "rule__Min__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1473:1: rule__Min__Group__0 : rule__Min__Group__0__Impl rule__Min__Group__1 ;
    public final void rule__Min__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1477:1: ( rule__Min__Group__0__Impl rule__Min__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1478:2: rule__Min__Group__0__Impl rule__Min__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__0__Impl_in_rule__Min__Group__03010);
            rule__Min__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__1_in_rule__Min__Group__03013);
            rule__Min__Group__1();

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
    // $ANTLR end "rule__Min__Group__0"


    // $ANTLR start "rule__Min__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1485:1: rule__Min__Group__0__Impl : ( () ) ;
    public final void rule__Min__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1489:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1490:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1490:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1491:1: ()
            {
             before(grammarAccess.getMinAccess().getMinAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1492:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1494:1: 
            {
            }

             after(grammarAccess.getMinAccess().getMinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Min__Group__0__Impl"


    // $ANTLR start "rule__Min__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1504:1: rule__Min__Group__1 : rule__Min__Group__1__Impl rule__Min__Group__2 ;
    public final void rule__Min__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1508:1: ( rule__Min__Group__1__Impl rule__Min__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1509:2: rule__Min__Group__1__Impl rule__Min__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__1__Impl_in_rule__Min__Group__13071);
            rule__Min__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__2_in_rule__Min__Group__13074);
            rule__Min__Group__2();

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
    // $ANTLR end "rule__Min__Group__1"


    // $ANTLR start "rule__Min__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1516:1: rule__Min__Group__1__Impl : ( 'neighborsMin' ) ;
    public final void rule__Min__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1520:1: ( ( 'neighborsMin' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1521:1: ( 'neighborsMin' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1521:1: ( 'neighborsMin' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1522:1: 'neighborsMin'
            {
             before(grammarAccess.getMinAccess().getNeighborsMinKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Min__Group__1__Impl3102); 
             after(grammarAccess.getMinAccess().getNeighborsMinKeyword_1()); 

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
    // $ANTLR end "rule__Min__Group__1__Impl"


    // $ANTLR start "rule__Min__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1535:1: rule__Min__Group__2 : rule__Min__Group__2__Impl ;
    public final void rule__Min__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1539:1: ( rule__Min__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1540:2: rule__Min__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Min__Group__2__Impl_in_rule__Min__Group__23133);
            rule__Min__Group__2__Impl();

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
    // $ANTLR end "rule__Min__Group__2"


    // $ANTLR start "rule__Min__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1546:1: rule__Min__Group__2__Impl : ( ( rule__Min__NeighborsFilterAssignment_2 )? ) ;
    public final void rule__Min__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1550:1: ( ( ( rule__Min__NeighborsFilterAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1551:1: ( ( rule__Min__NeighborsFilterAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1551:1: ( ( rule__Min__NeighborsFilterAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1552:1: ( rule__Min__NeighborsFilterAssignment_2 )?
            {
             before(grammarAccess.getMinAccess().getNeighborsFilterAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1553:1: ( rule__Min__NeighborsFilterAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1553:2: rule__Min__NeighborsFilterAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Min__NeighborsFilterAssignment_2_in_rule__Min__Group__2__Impl3160);
                    rule__Min__NeighborsFilterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMinAccess().getNeighborsFilterAssignment_2()); 

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
    // $ANTLR end "rule__Min__Group__2__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1569:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1573:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1574:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__03197);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__03200);
            rule__Sum__Group__1();

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
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1581:1: rule__Sum__Group__0__Impl : ( () ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1585:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1586:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1586:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1587:1: ()
            {
             before(grammarAccess.getSumAccess().getSumAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1588:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1590:1: 
            {
            }

             after(grammarAccess.getSumAccess().getSumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1600:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl rule__Sum__Group__2 ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1604:1: ( rule__Sum__Group__1__Impl rule__Sum__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1605:2: rule__Sum__Group__1__Impl rule__Sum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__13258);
            rule__Sum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__2_in_rule__Sum__Group__13261);
            rule__Sum__Group__2();

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
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1612:1: rule__Sum__Group__1__Impl : ( 'neighborsSum' ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1616:1: ( ( 'neighborsSum' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1617:1: ( 'neighborsSum' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1617:1: ( 'neighborsSum' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1618:1: 'neighborsSum'
            {
             before(grammarAccess.getSumAccess().getNeighborsSumKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Sum__Group__1__Impl3289); 
             after(grammarAccess.getSumAccess().getNeighborsSumKeyword_1()); 

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
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1631:1: rule__Sum__Group__2 : rule__Sum__Group__2__Impl ;
    public final void rule__Sum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1635:1: ( rule__Sum__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1636:2: rule__Sum__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sum__Group__2__Impl_in_rule__Sum__Group__23320);
            rule__Sum__Group__2__Impl();

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
    // $ANTLR end "rule__Sum__Group__2"


    // $ANTLR start "rule__Sum__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1642:1: rule__Sum__Group__2__Impl : ( ( rule__Sum__NeighborsFilterAssignment_2 )? ) ;
    public final void rule__Sum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1646:1: ( ( ( rule__Sum__NeighborsFilterAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1647:1: ( ( rule__Sum__NeighborsFilterAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1647:1: ( ( rule__Sum__NeighborsFilterAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1648:1: ( rule__Sum__NeighborsFilterAssignment_2 )?
            {
             before(grammarAccess.getSumAccess().getNeighborsFilterAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1649:1: ( rule__Sum__NeighborsFilterAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1649:2: rule__Sum__NeighborsFilterAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sum__NeighborsFilterAssignment_2_in_rule__Sum__Group__2__Impl3347);
                    rule__Sum__NeighborsFilterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSumAccess().getNeighborsFilterAssignment_2()); 

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
    // $ANTLR end "rule__Sum__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1665:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1669:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1670:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__03384);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__1_in_rule__Size__Group__03387);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1677:1: rule__Size__Group__0__Impl : ( () ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1681:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1682:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1682:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1683:1: ()
            {
             before(grammarAccess.getSizeAccess().getSizeAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1684:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1686:1: 
            {
            }

             after(grammarAccess.getSizeAccess().getSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1696:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1700:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1701:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__13445);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__2_in_rule__Size__Group__13448);
            rule__Size__Group__2();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1708:1: rule__Size__Group__1__Impl : ( 'neighborsSize' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1712:1: ( ( 'neighborsSize' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1713:1: ( 'neighborsSize' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1713:1: ( 'neighborsSize' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1714:1: 'neighborsSize'
            {
             before(grammarAccess.getSizeAccess().getNeighborsSizeKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Size__Group__1__Impl3476); 
             after(grammarAccess.getSizeAccess().getNeighborsSizeKeyword_1()); 

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
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1727:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1731:1: ( rule__Size__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1732:2: rule__Size__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__23507);
            rule__Size__Group__2__Impl();

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1738:1: rule__Size__Group__2__Impl : ( ( rule__Size__NeighborsFilterAssignment_2 )? ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1742:1: ( ( ( rule__Size__NeighborsFilterAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1743:1: ( ( rule__Size__NeighborsFilterAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1743:1: ( ( rule__Size__NeighborsFilterAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1744:1: ( rule__Size__NeighborsFilterAssignment_2 )?
            {
             before(grammarAccess.getSizeAccess().getNeighborsFilterAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1745:1: ( rule__Size__NeighborsFilterAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1745:2: rule__Size__NeighborsFilterAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Size__NeighborsFilterAssignment_2_in_rule__Size__Group__2__Impl3534);
                    rule__Size__NeighborsFilterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSizeAccess().getNeighborsFilterAssignment_2()); 

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
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__CurrentCellPopulation__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1761:1: rule__CurrentCellPopulation__Group__0 : rule__CurrentCellPopulation__Group__0__Impl rule__CurrentCellPopulation__Group__1 ;
    public final void rule__CurrentCellPopulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1765:1: ( rule__CurrentCellPopulation__Group__0__Impl rule__CurrentCellPopulation__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1766:2: rule__CurrentCellPopulation__Group__0__Impl rule__CurrentCellPopulation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CurrentCellPopulation__Group__0__Impl_in_rule__CurrentCellPopulation__Group__03571);
            rule__CurrentCellPopulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CurrentCellPopulation__Group__1_in_rule__CurrentCellPopulation__Group__03574);
            rule__CurrentCellPopulation__Group__1();

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
    // $ANTLR end "rule__CurrentCellPopulation__Group__0"


    // $ANTLR start "rule__CurrentCellPopulation__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1773:1: rule__CurrentCellPopulation__Group__0__Impl : ( () ) ;
    public final void rule__CurrentCellPopulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1777:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1778:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1778:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1779:1: ()
            {
             before(grammarAccess.getCurrentCellPopulationAccess().getCurrentCellPopulationAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1780:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1782:1: 
            {
            }

             after(grammarAccess.getCurrentCellPopulationAccess().getCurrentCellPopulationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurrentCellPopulation__Group__0__Impl"


    // $ANTLR start "rule__CurrentCellPopulation__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1792:1: rule__CurrentCellPopulation__Group__1 : rule__CurrentCellPopulation__Group__1__Impl ;
    public final void rule__CurrentCellPopulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1796:1: ( rule__CurrentCellPopulation__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1797:2: rule__CurrentCellPopulation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CurrentCellPopulation__Group__1__Impl_in_rule__CurrentCellPopulation__Group__13632);
            rule__CurrentCellPopulation__Group__1__Impl();

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
    // $ANTLR end "rule__CurrentCellPopulation__Group__1"


    // $ANTLR start "rule__CurrentCellPopulation__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1803:1: rule__CurrentCellPopulation__Group__1__Impl : ( 'CurrentValue' ) ;
    public final void rule__CurrentCellPopulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1807:1: ( ( 'CurrentValue' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1808:1: ( 'CurrentValue' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1808:1: ( 'CurrentValue' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1809:1: 'CurrentValue'
            {
             before(grammarAccess.getCurrentCellPopulationAccess().getCurrentValueKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__CurrentCellPopulation__Group__1__Impl3660); 
             after(grammarAccess.getCurrentCellPopulationAccess().getCurrentValueKeyword_1()); 

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
    // $ANTLR end "rule__CurrentCellPopulation__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1826:1: rule__Conditional__Group_1__0 : rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 ;
    public final void rule__Conditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1830:1: ( rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1831:2: rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__03695);
            rule__Conditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__03698);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1838:1: rule__Conditional__Group_1__0__Impl : ( () ) ;
    public final void rule__Conditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1842:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1843:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1843:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1844:1: ()
            {
             before(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1845:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1847:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1857:1: rule__Conditional__Group_1__1 : rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 ;
    public final void rule__Conditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1861:1: ( rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1862:2: rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__13756);
            rule__Conditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__13759);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1869:1: rule__Conditional__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1873:1: ( ( 'if' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1874:1: ( 'if' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1874:1: ( 'if' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1875:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Conditional__Group_1__1__Impl3787); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1888:1: rule__Conditional__Group_1__2 : rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 ;
    public final void rule__Conditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1892:1: ( rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1893:2: rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__23818);
            rule__Conditional__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__23821);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1900:1: rule__Conditional__Group_1__2__Impl : ( ( rule__Conditional__ConditionAssignment_1_2 ) ) ;
    public final void rule__Conditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1904:1: ( ( ( rule__Conditional__ConditionAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1905:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1905:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1906:1: ( rule__Conditional__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1907:1: ( rule__Conditional__ConditionAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1907:2: rule__Conditional__ConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl3848);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1917:1: rule__Conditional__Group_1__3 : rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 ;
    public final void rule__Conditional__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1921:1: ( rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1922:2: rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__33878);
            rule__Conditional__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__33881);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1929:1: rule__Conditional__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1933:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1934:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1934:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1935:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Conditional__Group_1__3__Impl3909); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1948:1: rule__Conditional__Group_1__4 : rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 ;
    public final void rule__Conditional__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1952:1: ( rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1953:2: rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__43940);
            rule__Conditional__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__43943);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1960:1: rule__Conditional__Group_1__4__Impl : ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) ;
    public final void rule__Conditional__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1964:1: ( ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1965:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1965:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1966:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1967:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1967:2: rule__Conditional__IfTrueExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl3970);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1977:1: rule__Conditional__Group_1__5 : rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 ;
    public final void rule__Conditional__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1981:1: ( rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1982:2: rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54000);
            rule__Conditional__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54003);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1989:1: rule__Conditional__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1993:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1994:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1994:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:1995:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__5__Impl4031); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2008:1: rule__Conditional__Group_1__6 : rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 ;
    public final void rule__Conditional__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2012:1: ( rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2013:2: rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64062);
            rule__Conditional__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64065);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2020:1: rule__Conditional__Group_1__6__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2024:1: ( ( 'else' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2025:1: ( 'else' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2025:1: ( 'else' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2026:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Conditional__Group_1__6__Impl4093); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2039:1: rule__Conditional__Group_1__7 : rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 ;
    public final void rule__Conditional__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2043:1: ( rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2044:2: rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74124);
            rule__Conditional__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74127);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2051:1: rule__Conditional__Group_1__7__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2055:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2056:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2056:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2057:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Conditional__Group_1__7__Impl4155); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2070:1: rule__Conditional__Group_1__8 : rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 ;
    public final void rule__Conditional__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2074:1: ( rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2075:2: rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84186);
            rule__Conditional__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84189);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2082:1: rule__Conditional__Group_1__8__Impl : ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) ;
    public final void rule__Conditional__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2086:1: ( ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2087:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2087:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2088:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2089:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2089:2: rule__Conditional__IfFalseExpressionAssignment_1_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4216);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2099:1: rule__Conditional__Group_1__9 : rule__Conditional__Group_1__9__Impl ;
    public final void rule__Conditional__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2103:1: ( rule__Conditional__Group_1__9__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2104:2: rule__Conditional__Group_1__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94246);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2110:1: rule__Conditional__Group_1__9__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2114:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2115:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2115:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2116:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__9__Impl4274); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2149:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2153:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2154:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04325);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04328);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2161:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2165:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2166:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2166:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2167:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4355);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2178:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2182:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2183:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14384);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2189:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2193:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2194:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2194:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2195:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2196:1: ( rule__OrExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2196:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4411);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2210:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2214:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2215:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04446);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04449);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2222:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2226:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2227:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2227:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2228:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2229:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2231:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2241:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2245:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2246:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14507);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14510);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2253:1: rule__OrExpression__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2257:1: ( ( '|' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2258:1: ( '|' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2258:1: ( '|' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2259:1: '|'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OrExpression__Group_1__1__Impl4538); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2272:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2276:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2277:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24569);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2283:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2287:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2288:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2288:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2289:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2290:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2290:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4596);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2306:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2310:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2311:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04632);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04635);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2318:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2322:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2323:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2323:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2324:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl4662);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2335:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2339:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2340:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14691);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2346:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2350:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2351:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2351:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2352:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2353:1: ( rule__AndExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2353:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4718);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2367:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2371:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2372:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04753);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04756);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2379:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2383:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2384:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2384:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2385:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2386:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2388:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2398:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2402:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2403:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14814);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14817);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2410:1: rule__AndExpression__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2414:1: ( ( '&' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2415:1: ( '&' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2415:1: ( '&' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2416:1: '&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AndExpression__Group_1__1__Impl4845); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2429:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2433:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2434:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24876);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2440:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2444:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2445:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2445:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2446:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2447:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2447:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4903);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2463:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2467:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2468:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__04939);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__04942);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2475:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2479:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2480:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2480:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2481:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl4969);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2492:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2496:1: ( rule__EqualExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2497:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__14998);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2503:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2507:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2508:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2508:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2509:1: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2510:1: ( rule__EqualExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2510:2: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5025);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2524:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2528:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2529:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05060);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05063);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2536:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2540:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2541:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2541:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2542:1: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2543:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2545:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2555:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2559:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2560:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15121);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15124);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2567:1: rule__EqualExpression__Group_1__1__Impl : ( '==' ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2571:1: ( ( '==' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2572:1: ( '==' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2572:1: ( '==' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2573:1: '=='
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5152); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2586:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2590:1: ( rule__EqualExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2591:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25183);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2597:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2601:1: ( ( ( rule__EqualExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2602:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2602:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2603:1: ( rule__EqualExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2604:1: ( rule__EqualExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2604:2: rule__EqualExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5210);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2620:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2624:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2625:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05246);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05249);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2632:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2636:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2637:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2637:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2638:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5276);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2649:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2653:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2654:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15305);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2660:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2664:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2665:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2665:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2666:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2667:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2667:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl5332);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2681:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2685:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2686:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__05367);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__05370);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2693:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2697:1: ( ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2698:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2698:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2699:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2700:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2700:2: rule__ComparisonExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl5397);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2710:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2714:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2715:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__15427);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2721:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2725:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2726:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2726:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2727:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2728:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2728:2: rule__ComparisonExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl5454);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2742:1: rule__ComparisonExpression__Group_1_0_0__0 : rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2746:1: ( rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2747:2: rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__05488);
            rule__ComparisonExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__05491);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2754:1: rule__ComparisonExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2758:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2759:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2759:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2760:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2761:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2763:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2773:1: rule__ComparisonExpression__Group_1_0_0__1 : rule__ComparisonExpression__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2777:1: ( rule__ComparisonExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2778:2: rule__ComparisonExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__15549);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2784:1: rule__ComparisonExpression__Group_1_0_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2788:1: ( ( '>' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2789:1: ( '>' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2789:1: ( '>' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2790:1: '>'
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl5577); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2807:1: rule__ComparisonExpression__Group_1_0_1__0 : rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 ;
    public final void rule__ComparisonExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2811:1: ( rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2812:2: rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__05612);
            rule__ComparisonExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__05615);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2819:1: rule__ComparisonExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2823:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2824:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2824:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2825:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2826:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2828:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2838:1: rule__ComparisonExpression__Group_1_0_1__1 : rule__ComparisonExpression__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2842:1: ( rule__ComparisonExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2843:2: rule__ComparisonExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__15673);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2849:1: rule__ComparisonExpression__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2853:1: ( ( '<' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2854:1: ( '<' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2854:1: ( '<' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2855:1: '<'
            {
             before(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl5701); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2872:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2876:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2877:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05736);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05739);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2884:1: rule__AddExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2888:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2889:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2889:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2890:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl5766);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2901:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2905:1: ( rule__AddExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2906:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15795);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2912:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2916:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2917:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2917:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2918:1: ( rule__AddExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2919:1: ( rule__AddExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2919:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5822);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2933:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2937:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2938:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05857);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05860);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2945:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2949:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2950:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2950:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2951:1: ( rule__AddExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2952:1: ( rule__AddExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2952:2: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl5887);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2962:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2966:1: ( rule__AddExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2967:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15917);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2973:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2977:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2978:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2978:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2979:1: ( rule__AddExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2980:1: ( rule__AddExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2980:2: rule__AddExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5944);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2994:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2998:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:2999:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__05978);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__05981);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3006:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3010:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3011:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3011:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3012:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3013:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3015:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3025:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3029:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3030:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16039);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3036:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3040:1: ( ( '+' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3041:1: ( '+' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3041:1: ( '+' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3042:1: '+'
            {
             before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6067); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3059:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3063:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3064:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06102);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06105);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3071:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3075:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3076:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3076:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3077:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3078:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3080:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3090:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3094:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3095:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16163);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3101:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3105:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3106:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3106:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3107:1: '-'
            {
             before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl6191); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3124:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3128:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3129:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06226);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06229);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3136:1: rule__MultExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3140:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3141:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3141:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3142:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6256);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3153:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3157:1: ( rule__MultExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3158:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16285);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3164:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3168:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3169:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3169:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3170:1: ( rule__MultExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3171:1: ( rule__MultExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=35 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3171:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6312);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3185:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3189:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3190:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06347);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06350);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3197:1: rule__MultExpression__Group_1__0__Impl : ( ( rule__MultExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3201:1: ( ( ( rule__MultExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3202:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3202:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3203:1: ( rule__MultExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3204:1: ( rule__MultExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3204:2: rule__MultExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl6377);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3214:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3218:1: ( rule__MultExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3219:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16407);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3225:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3229:1: ( ( ( rule__MultExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3230:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3230:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3231:1: ( rule__MultExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3232:1: ( rule__MultExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3232:2: rule__MultExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6434);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3246:1: rule__MultExpression__Group_1_0_0__0 : rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 ;
    public final void rule__MultExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3250:1: ( rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3251:2: rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__06468);
            rule__MultExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__06471);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3258:1: rule__MultExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3262:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3263:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3263:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3264:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3265:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3267:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3277:1: rule__MultExpression__Group_1_0_0__1 : rule__MultExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3281:1: ( rule__MultExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3282:2: rule__MultExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__16529);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3288:1: rule__MultExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3292:1: ( ( '*' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3293:1: ( '*' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3293:1: ( '*' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3294:1: '*'
            {
             before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl6557); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3311:1: rule__MultExpression__Group_1_0_1__0 : rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 ;
    public final void rule__MultExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3315:1: ( rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3316:2: rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__06592);
            rule__MultExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__06595);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3323:1: rule__MultExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3327:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3328:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3328:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3329:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3330:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3332:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3342:1: rule__MultExpression__Group_1_0_1__1 : rule__MultExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3346:1: ( rule__MultExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3347:2: rule__MultExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__16653);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3353:1: rule__MultExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3357:1: ( ( '/' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3358:1: ( '/' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3358:1: ( '/' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3359:1: '/'
            {
             before(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl6681); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3376:1: rule__MultExpression__Group_1_0_2__0 : rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 ;
    public final void rule__MultExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3380:1: ( rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3381:2: rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__06716);
            rule__MultExpression__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__06719);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3388:1: rule__MultExpression__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3392:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3393:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3393:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3394:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3395:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3397:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3407:1: rule__MultExpression__Group_1_0_2__1 : rule__MultExpression__Group_1_0_2__1__Impl ;
    public final void rule__MultExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3411:1: ( rule__MultExpression__Group_1_0_2__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3412:2: rule__MultExpression__Group_1_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__16777);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3418:1: rule__MultExpression__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__MultExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3422:1: ( ( '%' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3423:1: ( '%' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3423:1: ( '%' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3424:1: '%'
            {
             before(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MultExpression__Group_1_0_2__1__Impl6805); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3441:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3445:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3446:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__06840);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__06843);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3453:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3457:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3458:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3458:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3459:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3460:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3462:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3472:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3476:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3477:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__16901);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__16904);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3484:1: rule__UnaryExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3488:1: ( ( '!' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3489:1: ( '!' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3489:1: ( '!' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3490:1: '!'
            {
             before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__UnaryExpression__Group_1__1__Impl6932); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3503:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3507:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3508:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__26963);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3514:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3518:1: ( ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3519:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3519:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3520:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3521:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3521:2: rule__UnaryExpression__TargetAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl6990);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3537:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3541:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3542:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07026);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07029);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3549:1: rule__UnaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3553:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3554:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3554:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3555:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3556:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3558:1: 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3568:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3572:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3573:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17087);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17090);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3580:1: rule__UnaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3584:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3585:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3585:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3586:1: '-'
            {
             before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__UnaryExpression__Group_2__1__Impl7118); 
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3599:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3603:1: ( rule__UnaryExpression__Group_2__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3604:2: rule__UnaryExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27149);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3610:1: rule__UnaryExpression__Group_2__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3614:1: ( ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3615:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3615:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3616:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3617:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3617:2: rule__UnaryExpression__TargetAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7176);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3633:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3637:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3638:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07212);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07215);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3645:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3649:1: ( ( ( '-' )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3650:1: ( ( '-' )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3650:1: ( ( '-' )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3651:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3652:1: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3653:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EInt__Group__0__Impl7244); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3664:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3668:1: ( rule__EInt__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3669:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17277);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3675:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3679:1: ( ( RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3680:1: ( RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3680:1: ( RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3681:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7304); 
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


    // $ANTLR start "rule__CellularAutomata__RulesAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3697:1: rule__CellularAutomata__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__CellularAutomata__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3701:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3702:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3702:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3703:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomata__RulesAssignment_17342);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CellularAutomata__RulesAssignment_1"


    // $ANTLR start "rule__CellularAutomata__RulesAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3712:1: rule__CellularAutomata__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__CellularAutomata__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3716:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3717:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3717:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3718:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomata__RulesAssignment_27373);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CellularAutomata__RulesAssignment_2"


    // $ANTLR start "rule__Rule__FilterAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3727:1: rule__Rule__FilterAssignment_1 : ( rulePopulationRange ) ;
    public final void rule__Rule__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3731:1: ( ( rulePopulationRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3732:1: ( rulePopulationRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3732:1: ( rulePopulationRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3733:1: rulePopulationRange
            {
             before(grammarAccess.getRuleAccess().getFilterPopulationRangeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_rule__Rule__FilterAssignment_17404);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterPopulationRangeParserRuleCall_1_0()); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3742:1: rule__Rule__EvaluatedValAssignment_5 : ( ruleConditional ) ;
    public final void rule__Rule__EvaluatedValAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3746:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3747:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3747:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3748:1: ruleConditional
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_57435);
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


    // $ANTLR start "rule__PopulationRange__LowerRangeAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3757:1: rule__PopulationRange__LowerRangeAssignment_2 : ( ruleEInt ) ;
    public final void rule__PopulationRange__LowerRangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3761:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3762:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3762:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3763:1: ruleEInt
            {
             before(grammarAccess.getPopulationRangeAccess().getLowerRangeEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PopulationRange__LowerRangeAssignment_27466);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPopulationRangeAccess().getLowerRangeEIntParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PopulationRange__LowerRangeAssignment_2"


    // $ANTLR start "rule__PopulationRange__UpperRangeAssignment_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3772:1: rule__PopulationRange__UpperRangeAssignment_4 : ( ruleEInt ) ;
    public final void rule__PopulationRange__UpperRangeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3776:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3777:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3777:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3778:1: ruleEInt
            {
             before(grammarAccess.getPopulationRangeAccess().getUpperRangeEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PopulationRange__UpperRangeAssignment_47497);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPopulationRangeAccess().getUpperRangeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PopulationRange__UpperRangeAssignment_4"


    // $ANTLR start "rule__Max__NeighborsFilterAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3787:1: rule__Max__NeighborsFilterAssignment_2 : ( rulePopulationRange ) ;
    public final void rule__Max__NeighborsFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3791:1: ( ( rulePopulationRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3792:1: ( rulePopulationRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3792:1: ( rulePopulationRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3793:1: rulePopulationRange
            {
             before(grammarAccess.getMaxAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_rule__Max__NeighborsFilterAssignment_27528);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getMaxAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Max__NeighborsFilterAssignment_2"


    // $ANTLR start "rule__Min__NeighborsFilterAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3802:1: rule__Min__NeighborsFilterAssignment_2 : ( rulePopulationRange ) ;
    public final void rule__Min__NeighborsFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3806:1: ( ( rulePopulationRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3807:1: ( rulePopulationRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3807:1: ( rulePopulationRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3808:1: rulePopulationRange
            {
             before(grammarAccess.getMinAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_rule__Min__NeighborsFilterAssignment_27559);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getMinAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Min__NeighborsFilterAssignment_2"


    // $ANTLR start "rule__Sum__NeighborsFilterAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3817:1: rule__Sum__NeighborsFilterAssignment_2 : ( rulePopulationRange ) ;
    public final void rule__Sum__NeighborsFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3821:1: ( ( rulePopulationRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3822:1: ( rulePopulationRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3822:1: ( rulePopulationRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3823:1: rulePopulationRange
            {
             before(grammarAccess.getSumAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_rule__Sum__NeighborsFilterAssignment_27590);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getSumAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sum__NeighborsFilterAssignment_2"


    // $ANTLR start "rule__Size__NeighborsFilterAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3832:1: rule__Size__NeighborsFilterAssignment_2 : ( rulePopulationRange ) ;
    public final void rule__Size__NeighborsFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3836:1: ( ( rulePopulationRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3837:1: ( rulePopulationRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3837:1: ( rulePopulationRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3838:1: rulePopulationRange
            {
             before(grammarAccess.getSizeAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_rule__Size__NeighborsFilterAssignment_27621);
            rulePopulationRange();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Size__NeighborsFilterAssignment_2"


    // $ANTLR start "rule__Conditional__ConditionAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3847:1: rule__Conditional__ConditionAssignment_1_2 : ( ruleConditional ) ;
    public final void rule__Conditional__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3851:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3852:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3852:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3853:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_27652);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3862:1: rule__Conditional__IfTrueExpressionAssignment_1_4 : ( ruleConditional ) ;
    public final void rule__Conditional__IfTrueExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3866:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3867:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3867:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3868:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_47683);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3877:1: rule__Conditional__IfFalseExpressionAssignment_1_8 : ( ruleConditional ) ;
    public final void rule__Conditional__IfFalseExpressionAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3881:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3882:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3882:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3883:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_87714);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3892:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3896:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3897:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3897:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3898:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_27745);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3907:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3911:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3912:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3912:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3913:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_27776);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3922:1: rule__EqualExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3926:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3927:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3927:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3928:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_27807);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3937:1: rule__ComparisonExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3941:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3942:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3942:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3943:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_17838);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3952:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3956:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3957:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3957:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3958:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_17869);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3967:1: rule__MultExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3971:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3972:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3972:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3973:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_17900);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3982:1: rule__UnaryExpression__TargetAssignment_1_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3986:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3987:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3987:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3988:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_27931);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:3997:1: rule__UnaryExpression__TargetAssignment_2_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4001:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4002:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4002:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4003:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_27962);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4012:1: rule__IntegerLiteral__ValAssignment : ( ruleEInt ) ;
    public final void rule__IntegerLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4016:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4017:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4017:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalEvol.g:4018:1: ruleEInt
            {
             before(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment7993);
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
        public static final BitSet FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomata68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__0_in_ruleCellularAutomata94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_entryRulePopulationRange181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePopulationRange188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__0_in_rulePopulationRange214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_entryRuleMax301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMax308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Max__Group__0_in_ruleMax334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_entryRuleMin361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMin368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Min__Group__0_in_ruleMin394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_entryRuleSum421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSum428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sum__Group__0_in_ruleSum454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_entryRuleSize481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSize488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Size__Group__0_in_ruleSize514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurrentCellPopulation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CurrentCellPopulation__Group__0_in_ruleCurrentCellPopulation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Alternatives_in_ruleConditional634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_rule__LiteralsExpression__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_rule__LiteralsExpression__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_rule__LiteralsExpression__Alternatives1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_rule__LiteralsExpression__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_rule__LiteralsExpression__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__0__Impl_in_rule__CellularAutomata__Group__01632 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__1_in_rule__CellularAutomata__Group__01635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__1__Impl_in_rule__CellularAutomata__Group__11693 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__2_in_rule__CellularAutomata__Group__11696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__RulesAssignment_1_in_rule__CellularAutomata__Group__1__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__Group__2__Impl_in_rule__CellularAutomata__Group__21753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomata__RulesAssignment_2_in_rule__CellularAutomata__Group__2__Impl1780 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01817 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Rule__Group__0__Impl1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11879 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21940 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Rule__Group__2__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32002 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Rule__Group__3__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42064 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rule__Group__4__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52126 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__52129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__EvaluatedValAssignment_5_in_rule__Rule__Group__5__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__62186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Rule__Group__6__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__0__Impl_in_rule__PopulationRange__Group__02259 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__1_in_rule__PopulationRange__Group__02262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__1__Impl_in_rule__PopulationRange__Group__12320 = new BitSet(new long[]{0x0000000403EA0010L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__2_in_rule__PopulationRange__Group__12323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PopulationRange__Group__1__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__2__Impl_in_rule__PopulationRange__Group__22382 = new BitSet(new long[]{0x0000000403EA0010L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__3_in_rule__PopulationRange__Group__22385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__LowerRangeAssignment_2_in_rule__PopulationRange__Group__2__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__3__Impl_in_rule__PopulationRange__Group__32443 = new BitSet(new long[]{0x0000000403EC0010L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__4_in_rule__PopulationRange__Group__32446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PopulationRange__Group__3__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__4__Impl_in_rule__PopulationRange__Group__42505 = new BitSet(new long[]{0x0000000403EC0010L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__5_in_rule__PopulationRange__Group__42508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__UpperRangeAssignment_4_in_rule__PopulationRange__Group__4__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PopulationRange__Group__5__Impl_in_rule__PopulationRange__Group__52566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PopulationRange__Group__5__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__02637 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__02640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LiteralsExpression__Group_0__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__12699 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__12702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__22758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LiteralsExpression__Group_0__2__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Max__Group__0__Impl_in_rule__Max__Group__02823 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Max__Group__1_in_rule__Max__Group__02826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Max__Group__1__Impl_in_rule__Max__Group__12884 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Max__Group__2_in_rule__Max__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Max__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Max__Group__2__Impl_in_rule__Max__Group__22946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Max__NeighborsFilterAssignment_2_in_rule__Max__Group__2__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Min__Group__0__Impl_in_rule__Min__Group__03010 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Min__Group__1_in_rule__Min__Group__03013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Min__Group__1__Impl_in_rule__Min__Group__13071 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Min__Group__2_in_rule__Min__Group__13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Min__Group__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Min__Group__2__Impl_in_rule__Min__Group__23133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Min__NeighborsFilterAssignment_2_in_rule__Min__Group__2__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sum__Group__0__Impl_in_rule__Sum__Group__03197 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Sum__Group__1_in_rule__Sum__Group__03200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sum__Group__1__Impl_in_rule__Sum__Group__13258 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Sum__Group__2_in_rule__Sum__Group__13261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Sum__Group__1__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sum__Group__2__Impl_in_rule__Sum__Group__23320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sum__NeighborsFilterAssignment_2_in_rule__Sum__Group__2__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__03384 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__03387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__13445 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__13448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Size__Group__1__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__23507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Size__NeighborsFilterAssignment_2_in_rule__Size__Group__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CurrentCellPopulation__Group__0__Impl_in_rule__CurrentCellPopulation__Group__03571 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__CurrentCellPopulation__Group__1_in_rule__CurrentCellPopulation__Group__03574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CurrentCellPopulation__Group__1__Impl_in_rule__CurrentCellPopulation__Group__13632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CurrentCellPopulation__Group__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__03695 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__03698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__13756 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__13759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Conditional__Group_1__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__23818 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__23821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__33878 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__33881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Conditional__Group_1__3__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__43940 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__43943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54000 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__5__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64062 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Conditional__Group_1__6__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74124 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Conditional__Group_1__7__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84186 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__9__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04325 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4411 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04446 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14507 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OrExpression__Group_1__1__Impl4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04632 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4718 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04753 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14814 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AndExpression__Group_1__1__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__04939 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__04942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__14998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5025 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05060 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15121 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05246 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl5332 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__05367 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__05370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__15427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__05488 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__05491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__15549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__05612 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__05615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__15673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05736 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5822 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05857 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__05978 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__05981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06102 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06226 = new BitSet(new long[]{0x0000003800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6312 = new BitSet(new long[]{0x0000003800000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06347 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__06468 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__06471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__16529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__06592 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__06595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__16653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__06716 = new BitSet(new long[]{0x0000003800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__06719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__16777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MultExpression__Group_1_0_2__1__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__06840 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__06843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__16901 = new BitSet(new long[]{0x0000000403E80010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__16904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__UnaryExpression__Group_1__1__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__26963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl6990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07026 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17087 = new BitSet(new long[]{0x0000000403E80010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__UnaryExpression__Group_2__1__Impl7118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07212 = new BitSet(new long[]{0x0000000403E80010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EInt__Group__0__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomata__RulesAssignment_17342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomata__RulesAssignment_27373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_rule__Rule__FilterAssignment_17404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_57435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PopulationRange__LowerRangeAssignment_27466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PopulationRange__UpperRangeAssignment_47497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_rule__Max__NeighborsFilterAssignment_27528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_rule__Min__NeighborsFilterAssignment_27559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_rule__Sum__NeighborsFilterAssignment_27590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_rule__Size__NeighborsFilterAssignment_27621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_27652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_47683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_87714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_27745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_27776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_27807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_17838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_17869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_17900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_27931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_27962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment7993 = new BitSet(new long[]{0x0000000000000002L});
    }


}