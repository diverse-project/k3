package insa.ui.contentassist.antlr.internal; 

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
import insa.services.ExpArithmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpArithmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_DOUBLE=4;
    public static final int T__8=8;
    public static final int RULE_ML_COMMENT=5;

    // delegates
    // delegators


        public InternalExpArithmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpArithmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpArithmParser.tokenNames; }
    public String getGrammarFileName() { return "../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g"; }


     
     	private ExpArithmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpArithmGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleExpressionArithm"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:60:1: entryRuleExpressionArithm : ruleExpressionArithm EOF ;
    public final void entryRuleExpressionArithm() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:61:1: ( ruleExpressionArithm EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:62:1: ruleExpressionArithm EOF
            {
             before(grammarAccess.getExpressionArithmRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionArithm_in_entryRuleExpressionArithm61);
            ruleExpressionArithm();

            state._fsp--;

             after(grammarAccess.getExpressionArithmRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionArithm68); 

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
    // $ANTLR end "entryRuleExpressionArithm"


    // $ANTLR start "ruleExpressionArithm"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:69:1: ruleExpressionArithm : ( ( rule__ExpressionArithm__RacineAssignment )? ) ;
    public final void ruleExpressionArithm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:73:2: ( ( ( rule__ExpressionArithm__RacineAssignment )? ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:74:1: ( ( rule__ExpressionArithm__RacineAssignment )? )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:74:1: ( ( rule__ExpressionArithm__RacineAssignment )? )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:75:1: ( rule__ExpressionArithm__RacineAssignment )?
            {
             before(grammarAccess.getExpressionArithmAccess().getRacineAssignment()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:76:1: ( rule__ExpressionArithm__RacineAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOUBLE||(LA1_0>=8 && LA1_0<=11)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:76:2: rule__ExpressionArithm__RacineAssignment
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExpressionArithm__RacineAssignment_in_ruleExpressionArithm94);
                    rule__ExpressionArithm__RacineAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionArithmAccess().getRacineAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionArithm"


    // $ANTLR start "entryRuleEltExp"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:88:1: entryRuleEltExp : ruleEltExp EOF ;
    public final void entryRuleEltExp() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:89:1: ( ruleEltExp EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:90:1: ruleEltExp EOF
            {
             before(grammarAccess.getEltExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_entryRuleEltExp122);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getEltExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEltExp129); 

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
    // $ANTLR end "entryRuleEltExp"


    // $ANTLR start "ruleEltExp"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:97:1: ruleEltExp : ( ( rule__EltExp__Alternatives ) ) ;
    public final void ruleEltExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:101:2: ( ( ( rule__EltExp__Alternatives ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:102:1: ( ( rule__EltExp__Alternatives ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:102:1: ( ( rule__EltExp__Alternatives ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:103:1: ( rule__EltExp__Alternatives )
            {
             before(grammarAccess.getEltExpAccess().getAlternatives()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:104:1: ( rule__EltExp__Alternatives )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:104:2: rule__EltExp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EltExp__Alternatives_in_ruleEltExp155);
            rule__EltExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEltExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEltExp"


    // $ANTLR start "entryRuleValeur"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:116:1: entryRuleValeur : ruleValeur EOF ;
    public final void entryRuleValeur() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:117:1: ( ruleValeur EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:118:1: ruleValeur EOF
            {
             before(grammarAccess.getValeurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValeur_in_entryRuleValeur182);
            ruleValeur();

            state._fsp--;

             after(grammarAccess.getValeurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValeur189); 

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
    // $ANTLR end "entryRuleValeur"


    // $ANTLR start "ruleValeur"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:125:1: ruleValeur : ( ( rule__Valeur__ValeurAssignment ) ) ;
    public final void ruleValeur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:129:2: ( ( ( rule__Valeur__ValeurAssignment ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:130:1: ( ( rule__Valeur__ValeurAssignment ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:130:1: ( ( rule__Valeur__ValeurAssignment ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:131:1: ( rule__Valeur__ValeurAssignment )
            {
             before(grammarAccess.getValeurAccess().getValeurAssignment()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:132:1: ( rule__Valeur__ValeurAssignment )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:132:2: rule__Valeur__ValeurAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Valeur__ValeurAssignment_in_ruleValeur215);
            rule__Valeur__ValeurAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValeurAccess().getValeurAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValeur"


    // $ANTLR start "entryRulePlus"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:144:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:145:1: ( rulePlus EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:146:1: rulePlus EOF
            {
             before(grammarAccess.getPlusRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlus_in_entryRulePlus242);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getPlusRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlus249); 

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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:153:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:157:2: ( ( ( rule__Plus__Group__0 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:158:1: ( ( rule__Plus__Group__0 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:158:1: ( ( rule__Plus__Group__0 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:159:1: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:160:1: ( rule__Plus__Group__0 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:160:2: rule__Plus__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__0_in_rulePlus275);
            rule__Plus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMoins"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:172:1: entryRuleMoins : ruleMoins EOF ;
    public final void entryRuleMoins() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:173:1: ( ruleMoins EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:174:1: ruleMoins EOF
            {
             before(grammarAccess.getMoinsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoins_in_entryRuleMoins302);
            ruleMoins();

            state._fsp--;

             after(grammarAccess.getMoinsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoins309); 

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
    // $ANTLR end "entryRuleMoins"


    // $ANTLR start "ruleMoins"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:181:1: ruleMoins : ( ( rule__Moins__Group__0 ) ) ;
    public final void ruleMoins() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:185:2: ( ( ( rule__Moins__Group__0 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:186:1: ( ( rule__Moins__Group__0 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:186:1: ( ( rule__Moins__Group__0 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:187:1: ( rule__Moins__Group__0 )
            {
             before(grammarAccess.getMoinsAccess().getGroup()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:188:1: ( rule__Moins__Group__0 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:188:2: rule__Moins__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__0_in_ruleMoins335);
            rule__Moins__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoinsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoins"


    // $ANTLR start "entryRuleMult"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:200:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:201:1: ( ruleMult EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:202:1: ruleMult EOF
            {
             before(grammarAccess.getMultRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMult_in_entryRuleMult362);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMult369); 

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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:209:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:213:2: ( ( ( rule__Mult__Group__0 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:214:1: ( ( rule__Mult__Group__0 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:214:1: ( ( rule__Mult__Group__0 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:215:1: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:216:1: ( rule__Mult__Group__0 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:216:2: rule__Mult__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__0_in_ruleMult395);
            rule__Mult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleDivision"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:228:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:229:1: ( ruleDivision EOF )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:230:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivision_in_entryRuleDivision422);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivision429); 

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:237:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:241:2: ( ( ( rule__Division__Group__0 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:242:1: ( ( rule__Division__Group__0 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:242:1: ( ( rule__Division__Group__0 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:243:1: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:244:1: ( rule__Division__Group__0 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:244:2: rule__Division__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__0_in_ruleDivision455);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "rule__EltExp__Alternatives"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:256:1: rule__EltExp__Alternatives : ( ( ruleValeur ) | ( rulePlus ) | ( ruleMoins ) | ( ruleMult ) | ( ruleDivision ) );
    public final void rule__EltExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:260:1: ( ( ruleValeur ) | ( rulePlus ) | ( ruleMoins ) | ( ruleMult ) | ( ruleDivision ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt2=1;
                }
                break;
            case 8:
                {
                alt2=2;
                }
                break;
            case 9:
                {
                alt2=3;
                }
                break;
            case 10:
                {
                alt2=4;
                }
                break;
            case 11:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:261:1: ( ruleValeur )
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:261:1: ( ruleValeur )
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:262:1: ruleValeur
                    {
                     before(grammarAccess.getEltExpAccess().getValeurParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleValeur_in_rule__EltExp__Alternatives491);
                    ruleValeur();

                    state._fsp--;

                     after(grammarAccess.getEltExpAccess().getValeurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:267:6: ( rulePlus )
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:267:6: ( rulePlus )
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:268:1: rulePlus
                    {
                     before(grammarAccess.getEltExpAccess().getPlusParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePlus_in_rule__EltExp__Alternatives508);
                    rulePlus();

                    state._fsp--;

                     after(grammarAccess.getEltExpAccess().getPlusParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:273:6: ( ruleMoins )
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:273:6: ( ruleMoins )
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:274:1: ruleMoins
                    {
                     before(grammarAccess.getEltExpAccess().getMoinsParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMoins_in_rule__EltExp__Alternatives525);
                    ruleMoins();

                    state._fsp--;

                     after(grammarAccess.getEltExpAccess().getMoinsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:279:6: ( ruleMult )
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:279:6: ( ruleMult )
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:280:1: ruleMult
                    {
                     before(grammarAccess.getEltExpAccess().getMultParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMult_in_rule__EltExp__Alternatives542);
                    ruleMult();

                    state._fsp--;

                     after(grammarAccess.getEltExpAccess().getMultParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:285:6: ( ruleDivision )
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:285:6: ( ruleDivision )
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:286:1: ruleDivision
                    {
                     before(grammarAccess.getEltExpAccess().getDivisionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_rule__EltExp__Alternatives559);
                    ruleDivision();

                    state._fsp--;

                     after(grammarAccess.getEltExpAccess().getDivisionParserRuleCall_4()); 

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
    // $ANTLR end "rule__EltExp__Alternatives"


    // $ANTLR start "rule__Plus__Group__0"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:298:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:302:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:303:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__0__Impl_in_rule__Plus__Group__0589);
            rule__Plus__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__1_in_rule__Plus__Group__0592);
            rule__Plus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0"


    // $ANTLR start "rule__Plus__Group__0__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:310:1: rule__Plus__Group__0__Impl : ( '+' ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:314:1: ( ( '+' ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:315:1: ( '+' )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:315:1: ( '+' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:316:1: '+'
            {
             before(grammarAccess.getPlusAccess().getPlusSignKeyword_0()); 
            match(input,8,FollowSets000.FOLLOW_8_in_rule__Plus__Group__0__Impl620); 
             after(grammarAccess.getPlusAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0__Impl"


    // $ANTLR start "rule__Plus__Group__1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:329:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl rule__Plus__Group__2 ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:333:1: ( rule__Plus__Group__1__Impl rule__Plus__Group__2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:334:2: rule__Plus__Group__1__Impl rule__Plus__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__1__Impl_in_rule__Plus__Group__1651);
            rule__Plus__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__2_in_rule__Plus__Group__1654);
            rule__Plus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1"


    // $ANTLR start "rule__Plus__Group__1__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:341:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__EltGaucheAssignment_1 ) ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:345:1: ( ( ( rule__Plus__EltGaucheAssignment_1 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:346:1: ( ( rule__Plus__EltGaucheAssignment_1 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:346:1: ( ( rule__Plus__EltGaucheAssignment_1 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:347:1: ( rule__Plus__EltGaucheAssignment_1 )
            {
             before(grammarAccess.getPlusAccess().getEltGaucheAssignment_1()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:348:1: ( rule__Plus__EltGaucheAssignment_1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:348:2: rule__Plus__EltGaucheAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__EltGaucheAssignment_1_in_rule__Plus__Group__1__Impl681);
            rule__Plus__EltGaucheAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getEltGaucheAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1__Impl"


    // $ANTLR start "rule__Plus__Group__2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:358:1: rule__Plus__Group__2 : rule__Plus__Group__2__Impl ;
    public final void rule__Plus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:362:1: ( rule__Plus__Group__2__Impl )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:363:2: rule__Plus__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__Group__2__Impl_in_rule__Plus__Group__2711);
            rule__Plus__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__2"


    // $ANTLR start "rule__Plus__Group__2__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:369:1: rule__Plus__Group__2__Impl : ( ( rule__Plus__EltDroitAssignment_2 ) ) ;
    public final void rule__Plus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:373:1: ( ( ( rule__Plus__EltDroitAssignment_2 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:374:1: ( ( rule__Plus__EltDroitAssignment_2 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:374:1: ( ( rule__Plus__EltDroitAssignment_2 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:375:1: ( rule__Plus__EltDroitAssignment_2 )
            {
             before(grammarAccess.getPlusAccess().getEltDroitAssignment_2()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:376:1: ( rule__Plus__EltDroitAssignment_2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:376:2: rule__Plus__EltDroitAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Plus__EltDroitAssignment_2_in_rule__Plus__Group__2__Impl738);
            rule__Plus__EltDroitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getEltDroitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__2__Impl"


    // $ANTLR start "rule__Moins__Group__0"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:392:1: rule__Moins__Group__0 : rule__Moins__Group__0__Impl rule__Moins__Group__1 ;
    public final void rule__Moins__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:396:1: ( rule__Moins__Group__0__Impl rule__Moins__Group__1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:397:2: rule__Moins__Group__0__Impl rule__Moins__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__0__Impl_in_rule__Moins__Group__0774);
            rule__Moins__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__1_in_rule__Moins__Group__0777);
            rule__Moins__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__0"


    // $ANTLR start "rule__Moins__Group__0__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:404:1: rule__Moins__Group__0__Impl : ( '-' ) ;
    public final void rule__Moins__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:408:1: ( ( '-' ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:409:1: ( '-' )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:409:1: ( '-' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:410:1: '-'
            {
             before(grammarAccess.getMoinsAccess().getHyphenMinusKeyword_0()); 
            match(input,9,FollowSets000.FOLLOW_9_in_rule__Moins__Group__0__Impl805); 
             after(grammarAccess.getMoinsAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__0__Impl"


    // $ANTLR start "rule__Moins__Group__1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:423:1: rule__Moins__Group__1 : rule__Moins__Group__1__Impl rule__Moins__Group__2 ;
    public final void rule__Moins__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:427:1: ( rule__Moins__Group__1__Impl rule__Moins__Group__2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:428:2: rule__Moins__Group__1__Impl rule__Moins__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__1__Impl_in_rule__Moins__Group__1836);
            rule__Moins__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__2_in_rule__Moins__Group__1839);
            rule__Moins__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__1"


    // $ANTLR start "rule__Moins__Group__1__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:435:1: rule__Moins__Group__1__Impl : ( ( rule__Moins__EltGaucheAssignment_1 ) ) ;
    public final void rule__Moins__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:439:1: ( ( ( rule__Moins__EltGaucheAssignment_1 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:440:1: ( ( rule__Moins__EltGaucheAssignment_1 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:440:1: ( ( rule__Moins__EltGaucheAssignment_1 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:441:1: ( rule__Moins__EltGaucheAssignment_1 )
            {
             before(grammarAccess.getMoinsAccess().getEltGaucheAssignment_1()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:442:1: ( rule__Moins__EltGaucheAssignment_1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:442:2: rule__Moins__EltGaucheAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__EltGaucheAssignment_1_in_rule__Moins__Group__1__Impl866);
            rule__Moins__EltGaucheAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoinsAccess().getEltGaucheAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__1__Impl"


    // $ANTLR start "rule__Moins__Group__2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:452:1: rule__Moins__Group__2 : rule__Moins__Group__2__Impl ;
    public final void rule__Moins__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:456:1: ( rule__Moins__Group__2__Impl )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:457:2: rule__Moins__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__Group__2__Impl_in_rule__Moins__Group__2896);
            rule__Moins__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__2"


    // $ANTLR start "rule__Moins__Group__2__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:463:1: rule__Moins__Group__2__Impl : ( ( rule__Moins__EltDroitAssignment_2 ) ) ;
    public final void rule__Moins__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:467:1: ( ( ( rule__Moins__EltDroitAssignment_2 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:468:1: ( ( rule__Moins__EltDroitAssignment_2 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:468:1: ( ( rule__Moins__EltDroitAssignment_2 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:469:1: ( rule__Moins__EltDroitAssignment_2 )
            {
             before(grammarAccess.getMoinsAccess().getEltDroitAssignment_2()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:470:1: ( rule__Moins__EltDroitAssignment_2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:470:2: rule__Moins__EltDroitAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Moins__EltDroitAssignment_2_in_rule__Moins__Group__2__Impl923);
            rule__Moins__EltDroitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoinsAccess().getEltDroitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__Group__2__Impl"


    // $ANTLR start "rule__Mult__Group__0"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:486:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:490:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:491:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__0959);
            rule__Mult__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__0962);
            rule__Mult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__0"


    // $ANTLR start "rule__Mult__Group__0__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:498:1: rule__Mult__Group__0__Impl : ( '*' ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:502:1: ( ( '*' ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:503:1: ( '*' )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:503:1: ( '*' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:504:1: '*'
            {
             before(grammarAccess.getMultAccess().getAsteriskKeyword_0()); 
            match(input,10,FollowSets000.FOLLOW_10_in_rule__Mult__Group__0__Impl990); 
             after(grammarAccess.getMultAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__0__Impl"


    // $ANTLR start "rule__Mult__Group__1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:517:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl rule__Mult__Group__2 ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:521:1: ( rule__Mult__Group__1__Impl rule__Mult__Group__2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:522:2: rule__Mult__Group__1__Impl rule__Mult__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__11021);
            rule__Mult__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__2_in_rule__Mult__Group__11024);
            rule__Mult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__1"


    // $ANTLR start "rule__Mult__Group__1__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:529:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__EltGaucheAssignment_1 ) ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:533:1: ( ( ( rule__Mult__EltGaucheAssignment_1 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:534:1: ( ( rule__Mult__EltGaucheAssignment_1 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:534:1: ( ( rule__Mult__EltGaucheAssignment_1 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:535:1: ( rule__Mult__EltGaucheAssignment_1 )
            {
             before(grammarAccess.getMultAccess().getEltGaucheAssignment_1()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:536:1: ( rule__Mult__EltGaucheAssignment_1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:536:2: rule__Mult__EltGaucheAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__EltGaucheAssignment_1_in_rule__Mult__Group__1__Impl1051);
            rule__Mult__EltGaucheAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getEltGaucheAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__1__Impl"


    // $ANTLR start "rule__Mult__Group__2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:546:1: rule__Mult__Group__2 : rule__Mult__Group__2__Impl ;
    public final void rule__Mult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:550:1: ( rule__Mult__Group__2__Impl )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:551:2: rule__Mult__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__Group__2__Impl_in_rule__Mult__Group__21081);
            rule__Mult__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__2"


    // $ANTLR start "rule__Mult__Group__2__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:557:1: rule__Mult__Group__2__Impl : ( ( rule__Mult__EltDroitAssignment_2 ) ) ;
    public final void rule__Mult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:561:1: ( ( ( rule__Mult__EltDroitAssignment_2 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:562:1: ( ( rule__Mult__EltDroitAssignment_2 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:562:1: ( ( rule__Mult__EltDroitAssignment_2 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:563:1: ( rule__Mult__EltDroitAssignment_2 )
            {
             before(grammarAccess.getMultAccess().getEltDroitAssignment_2()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:564:1: ( rule__Mult__EltDroitAssignment_2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:564:2: rule__Mult__EltDroitAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Mult__EltDroitAssignment_2_in_rule__Mult__Group__2__Impl1108);
            rule__Mult__EltDroitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getEltDroitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:580:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:584:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:585:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__01144);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__1_in_rule__Division__Group__01147);
            rule__Division__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:592:1: rule__Division__Group__0__Impl : ( '/' ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:596:1: ( ( '/' ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:597:1: ( '/' )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:597:1: ( '/' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:598:1: '/'
            {
             before(grammarAccess.getDivisionAccess().getSolidusKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Division__Group__0__Impl1175); 
             after(grammarAccess.getDivisionAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:611:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:615:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:616:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__11206);
            rule__Division__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__2_in_rule__Division__Group__11209);
            rule__Division__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:623:1: rule__Division__Group__1__Impl : ( ( rule__Division__EltGaucheAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:627:1: ( ( ( rule__Division__EltGaucheAssignment_1 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:628:1: ( ( rule__Division__EltGaucheAssignment_1 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:628:1: ( ( rule__Division__EltGaucheAssignment_1 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:629:1: ( rule__Division__EltGaucheAssignment_1 )
            {
             before(grammarAccess.getDivisionAccess().getEltGaucheAssignment_1()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:630:1: ( rule__Division__EltGaucheAssignment_1 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:630:2: rule__Division__EltGaucheAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__EltGaucheAssignment_1_in_rule__Division__Group__1__Impl1236);
            rule__Division__EltGaucheAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getEltGaucheAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group__2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:640:1: rule__Division__Group__2 : rule__Division__Group__2__Impl ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:644:1: ( rule__Division__Group__2__Impl )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:645:2: rule__Division__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__Group__2__Impl_in_rule__Division__Group__21266);
            rule__Division__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2"


    // $ANTLR start "rule__Division__Group__2__Impl"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:651:1: rule__Division__Group__2__Impl : ( ( rule__Division__EltDroitAssignment_2 ) ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:655:1: ( ( ( rule__Division__EltDroitAssignment_2 ) ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:656:1: ( ( rule__Division__EltDroitAssignment_2 ) )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:656:1: ( ( rule__Division__EltDroitAssignment_2 ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:657:1: ( rule__Division__EltDroitAssignment_2 )
            {
             before(grammarAccess.getDivisionAccess().getEltDroitAssignment_2()); 
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:658:1: ( rule__Division__EltDroitAssignment_2 )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:658:2: rule__Division__EltDroitAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Division__EltDroitAssignment_2_in_rule__Division__Group__2__Impl1293);
            rule__Division__EltDroitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getEltDroitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2__Impl"


    // $ANTLR start "rule__ExpressionArithm__RacineAssignment"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:675:1: rule__ExpressionArithm__RacineAssignment : ( ruleEltExp ) ;
    public final void rule__ExpressionArithm__RacineAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:679:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:680:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:680:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:681:1: ruleEltExp
            {
             before(grammarAccess.getExpressionArithmAccess().getRacineEltExpParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__ExpressionArithm__RacineAssignment1334);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getExpressionArithmAccess().getRacineEltExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionArithm__RacineAssignment"


    // $ANTLR start "rule__Valeur__ValeurAssignment"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:690:1: rule__Valeur__ValeurAssignment : ( RULE_DOUBLE ) ;
    public final void rule__Valeur__ValeurAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:694:1: ( ( RULE_DOUBLE ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:695:1: ( RULE_DOUBLE )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:695:1: ( RULE_DOUBLE )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:696:1: RULE_DOUBLE
            {
             before(grammarAccess.getValeurAccess().getValeurDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__Valeur__ValeurAssignment1365); 
             after(grammarAccess.getValeurAccess().getValeurDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valeur__ValeurAssignment"


    // $ANTLR start "rule__Plus__EltGaucheAssignment_1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:705:1: rule__Plus__EltGaucheAssignment_1 : ( ruleEltExp ) ;
    public final void rule__Plus__EltGaucheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:709:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:710:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:710:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:711:1: ruleEltExp
            {
             before(grammarAccess.getPlusAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Plus__EltGaucheAssignment_11396);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getPlusAccess().getEltGaucheEltExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__EltGaucheAssignment_1"


    // $ANTLR start "rule__Plus__EltDroitAssignment_2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:720:1: rule__Plus__EltDroitAssignment_2 : ( ruleEltExp ) ;
    public final void rule__Plus__EltDroitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:724:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:725:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:725:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:726:1: ruleEltExp
            {
             before(grammarAccess.getPlusAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Plus__EltDroitAssignment_21427);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getPlusAccess().getEltDroitEltExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__EltDroitAssignment_2"


    // $ANTLR start "rule__Moins__EltGaucheAssignment_1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:735:1: rule__Moins__EltGaucheAssignment_1 : ( ruleEltExp ) ;
    public final void rule__Moins__EltGaucheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:739:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:740:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:740:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:741:1: ruleEltExp
            {
             before(grammarAccess.getMoinsAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Moins__EltGaucheAssignment_11458);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getMoinsAccess().getEltGaucheEltExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__EltGaucheAssignment_1"


    // $ANTLR start "rule__Moins__EltDroitAssignment_2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:750:1: rule__Moins__EltDroitAssignment_2 : ( ruleEltExp ) ;
    public final void rule__Moins__EltDroitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:754:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:755:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:755:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:756:1: ruleEltExp
            {
             before(grammarAccess.getMoinsAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Moins__EltDroitAssignment_21489);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getMoinsAccess().getEltDroitEltExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moins__EltDroitAssignment_2"


    // $ANTLR start "rule__Mult__EltGaucheAssignment_1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:765:1: rule__Mult__EltGaucheAssignment_1 : ( ruleEltExp ) ;
    public final void rule__Mult__EltGaucheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:769:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:770:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:770:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:771:1: ruleEltExp
            {
             before(grammarAccess.getMultAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Mult__EltGaucheAssignment_11520);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getMultAccess().getEltGaucheEltExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__EltGaucheAssignment_1"


    // $ANTLR start "rule__Mult__EltDroitAssignment_2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:780:1: rule__Mult__EltDroitAssignment_2 : ( ruleEltExp ) ;
    public final void rule__Mult__EltDroitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:784:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:785:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:785:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:786:1: ruleEltExp
            {
             before(grammarAccess.getMultAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Mult__EltDroitAssignment_21551);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getMultAccess().getEltDroitEltExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__EltDroitAssignment_2"


    // $ANTLR start "rule__Division__EltGaucheAssignment_1"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:795:1: rule__Division__EltGaucheAssignment_1 : ( ruleEltExp ) ;
    public final void rule__Division__EltGaucheAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:799:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:800:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:800:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:801:1: ruleEltExp
            {
             before(grammarAccess.getDivisionAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Division__EltGaucheAssignment_11582);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getEltGaucheEltExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__EltGaucheAssignment_1"


    // $ANTLR start "rule__Division__EltDroitAssignment_2"
    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:810:1: rule__Division__EltDroitAssignment_2 : ( ruleEltExp ) ;
    public final void rule__Division__EltDroitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:814:1: ( ( ruleEltExp ) )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:815:1: ( ruleEltExp )
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:815:1: ( ruleEltExp )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:816:1: ruleEltExp
            {
             before(grammarAccess.getDivisionAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rule__Division__EltDroitAssignment_21613);
            ruleEltExp();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getEltDroitEltExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__EltDroitAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExpressionArithm_in_entryRuleExpressionArithm61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionArithm68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionArithm__RacineAssignment_in_ruleExpressionArithm94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_entryRuleEltExp122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEltExp129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EltExp__Alternatives_in_ruleEltExp155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValeur_in_entryRuleValeur182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValeur189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Valeur__ValeurAssignment_in_ruleValeur215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_entryRulePlus242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlus249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__Group__0_in_rulePlus275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoins_in_entryRuleMoins302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoins309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__Group__0_in_ruleMoins335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_entryRuleMult362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMult369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__Group__0_in_ruleMult395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivision429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__Group__0_in_ruleDivision455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValeur_in_rule__EltExp__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_rule__EltExp__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoins_in_rule__EltExp__Alternatives525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_rule__EltExp__Alternatives542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_rule__EltExp__Alternatives559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__Group__0__Impl_in_rule__Plus__Group__0589 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Plus__Group__1_in_rule__Plus__Group__0592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__Plus__Group__0__Impl620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__Group__1__Impl_in_rule__Plus__Group__1651 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Plus__Group__2_in_rule__Plus__Group__1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__EltGaucheAssignment_1_in_rule__Plus__Group__1__Impl681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__Group__2__Impl_in_rule__Plus__Group__2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Plus__EltDroitAssignment_2_in_rule__Plus__Group__2__Impl738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__Group__0__Impl_in_rule__Moins__Group__0774 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Moins__Group__1_in_rule__Moins__Group__0777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_rule__Moins__Group__0__Impl805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__Group__1__Impl_in_rule__Moins__Group__1836 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Moins__Group__2_in_rule__Moins__Group__1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__EltGaucheAssignment_1_in_rule__Moins__Group__1__Impl866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__Group__2__Impl_in_rule__Moins__Group__2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Moins__EltDroitAssignment_2_in_rule__Moins__Group__2__Impl923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__0959 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__0962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_rule__Mult__Group__0__Impl990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__11021 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Mult__Group__2_in_rule__Mult__Group__11024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__EltGaucheAssignment_1_in_rule__Mult__Group__1__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__Group__2__Impl_in_rule__Mult__Group__21081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Mult__EltDroitAssignment_2_in_rule__Mult__Group__2__Impl1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__Group__0__Impl_in_rule__Division__Group__01144 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Division__Group__1_in_rule__Division__Group__01147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Division__Group__0__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__Group__1__Impl_in_rule__Division__Group__11206 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_rule__Division__Group__2_in_rule__Division__Group__11209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__EltGaucheAssignment_1_in_rule__Division__Group__1__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__Group__2__Impl_in_rule__Division__Group__21266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Division__EltDroitAssignment_2_in_rule__Division__Group__2__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__ExpressionArithm__RacineAssignment1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Valeur__ValeurAssignment1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Plus__EltGaucheAssignment_11396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Plus__EltDroitAssignment_21427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Moins__EltGaucheAssignment_11458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Moins__EltDroitAssignment_21489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Mult__EltGaucheAssignment_11520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Mult__EltDroitAssignment_21551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Division__EltGaucheAssignment_11582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_rule__Division__EltDroitAssignment_21613 = new BitSet(new long[]{0x0000000000000002L});
    }


}