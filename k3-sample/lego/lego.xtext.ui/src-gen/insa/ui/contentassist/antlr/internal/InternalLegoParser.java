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
import insa.services.LegoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "'true'", "'false'", "'while'", "'do'", "'end'", "'not'", "'and'", "'if'", "'then'", "'else'", "'hasTurned'", "'('", "'angle'", "'='", "')'", "'move'", "'power'", "'display'", "'msg'", "','", "'duration'", "'line'", "'col'", "'setTurnAngle'", "'stopEngine'", "'stopProgram'", "'turn'", "'obstacle'", "'distance'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLegoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLegoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLegoParser.tokenNames; }
    public String getGrammarFileName() { return "../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g"; }


     
     	private LegoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LegoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgramUnit"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:60:1: entryRuleProgramUnit : ruleProgramUnit EOF ;
    public final void entryRuleProgramUnit() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:61:1: ( ruleProgramUnit EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:62:1: ruleProgramUnit EOF
            {
             before(grammarAccess.getProgramUnitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProgramUnit_in_entryRuleProgramUnit61);
            ruleProgramUnit();

            state._fsp--;

             after(grammarAccess.getProgramUnitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProgramUnit68); 

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
    // $ANTLR end "entryRuleProgramUnit"


    // $ANTLR start "ruleProgramUnit"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:69:1: ruleProgramUnit : ( ( rule__ProgramUnit__BlockAssignment )* ) ;
    public final void ruleProgramUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:73:2: ( ( ( rule__ProgramUnit__BlockAssignment )* ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:74:1: ( ( rule__ProgramUnit__BlockAssignment )* )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:74:1: ( ( rule__ProgramUnit__BlockAssignment )* )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:75:1: ( rule__ProgramUnit__BlockAssignment )*
            {
             before(grammarAccess.getProgramUnitAccess().getBlockAssignment()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:76:1: ( rule__ProgramUnit__BlockAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=16 && LA1_0<=18)||LA1_0==21||LA1_0==26||LA1_0==28||(LA1_0>=34 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:76:2: rule__ProgramUnit__BlockAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProgramUnit__BlockAssignment_in_ruleProgramUnit94);
            	    rule__ProgramUnit__BlockAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramUnitAccess().getBlockAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramUnit"


    // $ANTLR start "entryRuleExpression"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:89:1: ( ruleExpression EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression122);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression129); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:97:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:101:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:102:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:102:1: ( ( rule__Expression__Alternatives ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:103:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:104:1: ( rule__Expression__Alternatives )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:104:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression155);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:116:1: entryRuleBoolExp : ruleBoolExp EOF ;
    public final void entryRuleBoolExp() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:117:1: ( ruleBoolExp EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:118:1: ruleBoolExp EOF
            {
             before(grammarAccess.getBoolExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_entryRuleBoolExp182);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getBoolExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExp189); 

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
    // $ANTLR end "entryRuleBoolExp"


    // $ANTLR start "ruleBoolExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:125:1: ruleBoolExp : ( ( rule__BoolExp__Alternatives ) ) ;
    public final void ruleBoolExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:129:2: ( ( ( rule__BoolExp__Alternatives ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:130:1: ( ( rule__BoolExp__Alternatives ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:130:1: ( ( rule__BoolExp__Alternatives ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:131:1: ( rule__BoolExp__Alternatives )
            {
             before(grammarAccess.getBoolExpAccess().getAlternatives()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:132:1: ( rule__BoolExp__Alternatives )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:132:2: rule__BoolExp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolExp__Alternatives_in_ruleBoolExp215);
            rule__BoolExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExp"


    // $ANTLR start "entryRuleWhileLoop"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:144:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:145:1: ( ruleWhileLoop EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:146:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop242);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop249); 

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:153:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:157:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:158:1: ( ( rule__WhileLoop__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:158:1: ( ( rule__WhileLoop__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:159:1: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:160:1: ( rule__WhileLoop__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:160:2: rule__WhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__0_in_ruleWhileLoop275);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleNegExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:172:1: entryRuleNegExp : ruleNegExp EOF ;
    public final void entryRuleNegExp() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:173:1: ( ruleNegExp EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:174:1: ruleNegExp EOF
            {
             before(grammarAccess.getNegExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegExp_in_entryRuleNegExp302);
            ruleNegExp();

            state._fsp--;

             after(grammarAccess.getNegExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExp309); 

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
    // $ANTLR end "entryRuleNegExp"


    // $ANTLR start "ruleNegExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:181:1: ruleNegExp : ( ( rule__NegExp__Group__0 ) ) ;
    public final void ruleNegExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:185:2: ( ( ( rule__NegExp__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:186:1: ( ( rule__NegExp__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:186:1: ( ( rule__NegExp__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:187:1: ( rule__NegExp__Group__0 )
            {
             before(grammarAccess.getNegExpAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:188:1: ( rule__NegExp__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:188:2: rule__NegExp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExp__Group__0_in_ruleNegExp335);
            rule__NegExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegExp"


    // $ANTLR start "entryRuleAndExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:200:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:201:1: ( ruleAndExp EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:202:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExp_in_entryRuleAndExp362);
            ruleAndExp();

            state._fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExp369); 

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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:209:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:213:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:214:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:214:1: ( ( rule__AndExp__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:215:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:216:1: ( rule__AndExp__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:216:2: rule__AndExp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__0_in_ruleAndExp395);
            rule__AndExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleIfBlock"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:228:1: entryRuleIfBlock : ruleIfBlock EOF ;
    public final void entryRuleIfBlock() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:229:1: ( ruleIfBlock EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:230:1: ruleIfBlock EOF
            {
             before(grammarAccess.getIfBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfBlock_in_entryRuleIfBlock422);
            ruleIfBlock();

            state._fsp--;

             after(grammarAccess.getIfBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfBlock429); 

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
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:237:1: ruleIfBlock : ( ( rule__IfBlock__Group__0 ) ) ;
    public final void ruleIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:241:2: ( ( ( rule__IfBlock__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:242:1: ( ( rule__IfBlock__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:242:1: ( ( rule__IfBlock__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:243:1: ( rule__IfBlock__Group__0 )
            {
             before(grammarAccess.getIfBlockAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:244:1: ( rule__IfBlock__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:244:2: rule__IfBlock__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__0_in_ruleIfBlock455);
            rule__IfBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleCommand"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:256:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:257:1: ( ruleCommand EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:258:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommand_in_entryRuleCommand482);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommand489); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:265:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:269:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:270:1: ( ( rule__Command__Alternatives ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:270:1: ( ( rule__Command__Alternatives ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:271:1: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:272:1: ( rule__Command__Alternatives )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:272:2: rule__Command__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Command__Alternatives_in_ruleCommand515);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleHasTurnedCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:286:1: entryRuleHasTurnedCmd : ruleHasTurnedCmd EOF ;
    public final void entryRuleHasTurnedCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:287:1: ( ruleHasTurnedCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:288:1: ruleHasTurnedCmd EOF
            {
             before(grammarAccess.getHasTurnedCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHasTurnedCmd_in_entryRuleHasTurnedCmd544);
            ruleHasTurnedCmd();

            state._fsp--;

             after(grammarAccess.getHasTurnedCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHasTurnedCmd551); 

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
    // $ANTLR end "entryRuleHasTurnedCmd"


    // $ANTLR start "ruleHasTurnedCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:295:1: ruleHasTurnedCmd : ( ( rule__HasTurnedCmd__Group__0 ) ) ;
    public final void ruleHasTurnedCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:299:2: ( ( ( rule__HasTurnedCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:300:1: ( ( rule__HasTurnedCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:300:1: ( ( rule__HasTurnedCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:301:1: ( rule__HasTurnedCmd__Group__0 )
            {
             before(grammarAccess.getHasTurnedCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:302:1: ( rule__HasTurnedCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:302:2: rule__HasTurnedCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__0_in_ruleHasTurnedCmd577);
            rule__HasTurnedCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHasTurnedCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHasTurnedCmd"


    // $ANTLR start "entryRuleMoveCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:314:1: entryRuleMoveCmd : ruleMoveCmd EOF ;
    public final void entryRuleMoveCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:315:1: ( ruleMoveCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:316:1: ruleMoveCmd EOF
            {
             before(grammarAccess.getMoveCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveCmd_in_entryRuleMoveCmd604);
            ruleMoveCmd();

            state._fsp--;

             after(grammarAccess.getMoveCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveCmd611); 

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
    // $ANTLR end "entryRuleMoveCmd"


    // $ANTLR start "ruleMoveCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:323:1: ruleMoveCmd : ( ( rule__MoveCmd__Group__0 ) ) ;
    public final void ruleMoveCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:327:2: ( ( ( rule__MoveCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:328:1: ( ( rule__MoveCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:328:1: ( ( rule__MoveCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:329:1: ( rule__MoveCmd__Group__0 )
            {
             before(grammarAccess.getMoveCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:330:1: ( rule__MoveCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:330:2: rule__MoveCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__0_in_ruleMoveCmd637);
            rule__MoveCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveCmd"


    // $ANTLR start "entryRulePrintCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:342:1: entryRulePrintCmd : rulePrintCmd EOF ;
    public final void entryRulePrintCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:343:1: ( rulePrintCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:344:1: rulePrintCmd EOF
            {
             before(grammarAccess.getPrintCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrintCmd_in_entryRulePrintCmd664);
            rulePrintCmd();

            state._fsp--;

             after(grammarAccess.getPrintCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrintCmd671); 

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
    // $ANTLR end "entryRulePrintCmd"


    // $ANTLR start "rulePrintCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:351:1: rulePrintCmd : ( ( rule__PrintCmd__Group__0 ) ) ;
    public final void rulePrintCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:355:2: ( ( ( rule__PrintCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:356:1: ( ( rule__PrintCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:356:1: ( ( rule__PrintCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:357:1: ( rule__PrintCmd__Group__0 )
            {
             before(grammarAccess.getPrintCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:358:1: ( rule__PrintCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:358:2: rule__PrintCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__0_in_rulePrintCmd697);
            rule__PrintCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintCmd"


    // $ANTLR start "entryRuleSetTurnAngleCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:370:1: entryRuleSetTurnAngleCmd : ruleSetTurnAngleCmd EOF ;
    public final void entryRuleSetTurnAngleCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:371:1: ( ruleSetTurnAngleCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:372:1: ruleSetTurnAngleCmd EOF
            {
             before(grammarAccess.getSetTurnAngleCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetTurnAngleCmd_in_entryRuleSetTurnAngleCmd724);
            ruleSetTurnAngleCmd();

            state._fsp--;

             after(grammarAccess.getSetTurnAngleCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetTurnAngleCmd731); 

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
    // $ANTLR end "entryRuleSetTurnAngleCmd"


    // $ANTLR start "ruleSetTurnAngleCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:379:1: ruleSetTurnAngleCmd : ( ( rule__SetTurnAngleCmd__Group__0 ) ) ;
    public final void ruleSetTurnAngleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:383:2: ( ( ( rule__SetTurnAngleCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:384:1: ( ( rule__SetTurnAngleCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:384:1: ( ( rule__SetTurnAngleCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:385:1: ( rule__SetTurnAngleCmd__Group__0 )
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:386:1: ( rule__SetTurnAngleCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:386:2: rule__SetTurnAngleCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__0_in_ruleSetTurnAngleCmd757);
            rule__SetTurnAngleCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetTurnAngleCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetTurnAngleCmd"


    // $ANTLR start "entryRuleStopEngineCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:398:1: entryRuleStopEngineCmd : ruleStopEngineCmd EOF ;
    public final void entryRuleStopEngineCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:399:1: ( ruleStopEngineCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:400:1: ruleStopEngineCmd EOF
            {
             before(grammarAccess.getStopEngineCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStopEngineCmd_in_entryRuleStopEngineCmd784);
            ruleStopEngineCmd();

            state._fsp--;

             after(grammarAccess.getStopEngineCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStopEngineCmd791); 

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
    // $ANTLR end "entryRuleStopEngineCmd"


    // $ANTLR start "ruleStopEngineCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:407:1: ruleStopEngineCmd : ( ( rule__StopEngineCmd__Group__0 ) ) ;
    public final void ruleStopEngineCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:411:2: ( ( ( rule__StopEngineCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:412:1: ( ( rule__StopEngineCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:412:1: ( ( rule__StopEngineCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:413:1: ( rule__StopEngineCmd__Group__0 )
            {
             before(grammarAccess.getStopEngineCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:414:1: ( rule__StopEngineCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:414:2: rule__StopEngineCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopEngineCmd__Group__0_in_ruleStopEngineCmd817);
            rule__StopEngineCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopEngineCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStopEngineCmd"


    // $ANTLR start "entryRuleStopProgramCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:426:1: entryRuleStopProgramCmd : ruleStopProgramCmd EOF ;
    public final void entryRuleStopProgramCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:427:1: ( ruleStopProgramCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:428:1: ruleStopProgramCmd EOF
            {
             before(grammarAccess.getStopProgramCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStopProgramCmd_in_entryRuleStopProgramCmd844);
            ruleStopProgramCmd();

            state._fsp--;

             after(grammarAccess.getStopProgramCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStopProgramCmd851); 

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
    // $ANTLR end "entryRuleStopProgramCmd"


    // $ANTLR start "ruleStopProgramCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:435:1: ruleStopProgramCmd : ( ( rule__StopProgramCmd__Group__0 ) ) ;
    public final void ruleStopProgramCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:439:2: ( ( ( rule__StopProgramCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:440:1: ( ( rule__StopProgramCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:440:1: ( ( rule__StopProgramCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:441:1: ( rule__StopProgramCmd__Group__0 )
            {
             before(grammarAccess.getStopProgramCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:442:1: ( rule__StopProgramCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:442:2: rule__StopProgramCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopProgramCmd__Group__0_in_ruleStopProgramCmd877);
            rule__StopProgramCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopProgramCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStopProgramCmd"


    // $ANTLR start "entryRuleTurnCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:454:1: entryRuleTurnCmd : ruleTurnCmd EOF ;
    public final void entryRuleTurnCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:455:1: ( ruleTurnCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:456:1: ruleTurnCmd EOF
            {
             before(grammarAccess.getTurnCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTurnCmd_in_entryRuleTurnCmd904);
            ruleTurnCmd();

            state._fsp--;

             after(grammarAccess.getTurnCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTurnCmd911); 

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
    // $ANTLR end "entryRuleTurnCmd"


    // $ANTLR start "ruleTurnCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:463:1: ruleTurnCmd : ( ( rule__TurnCmd__Group__0 ) ) ;
    public final void ruleTurnCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:467:2: ( ( ( rule__TurnCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:468:1: ( ( rule__TurnCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:468:1: ( ( rule__TurnCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:469:1: ( rule__TurnCmd__Group__0 )
            {
             before(grammarAccess.getTurnCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:470:1: ( rule__TurnCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:470:2: rule__TurnCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__0_in_ruleTurnCmd937);
            rule__TurnCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnCmd"


    // $ANTLR start "entryRuleObstacleCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:482:1: entryRuleObstacleCmd : ruleObstacleCmd EOF ;
    public final void entryRuleObstacleCmd() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:483:1: ( ruleObstacleCmd EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:484:1: ruleObstacleCmd EOF
            {
             before(grammarAccess.getObstacleCmdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleObstacleCmd_in_entryRuleObstacleCmd964);
            ruleObstacleCmd();

            state._fsp--;

             after(grammarAccess.getObstacleCmdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObstacleCmd971); 

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
    // $ANTLR end "entryRuleObstacleCmd"


    // $ANTLR start "ruleObstacleCmd"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:491:1: ruleObstacleCmd : ( ( rule__ObstacleCmd__Group__0 ) ) ;
    public final void ruleObstacleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:495:2: ( ( ( rule__ObstacleCmd__Group__0 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:496:1: ( ( rule__ObstacleCmd__Group__0 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:496:1: ( ( rule__ObstacleCmd__Group__0 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:497:1: ( rule__ObstacleCmd__Group__0 )
            {
             before(grammarAccess.getObstacleCmdAccess().getGroup()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:498:1: ( rule__ObstacleCmd__Group__0 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:498:2: rule__ObstacleCmd__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__0_in_ruleObstacleCmd997);
            rule__ObstacleCmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacleCmd"


    // $ANTLR start "entryRuleBOOLEAN_LITERAL"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:510:1: entryRuleBOOLEAN_LITERAL : ruleBOOLEAN_LITERAL EOF ;
    public final void entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:511:1: ( ruleBOOLEAN_LITERAL EOF )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:512:1: ruleBOOLEAN_LITERAL EOF
            {
             before(grammarAccess.getBOOLEAN_LITERALRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL1024);
            ruleBOOLEAN_LITERAL();

            state._fsp--;

             after(grammarAccess.getBOOLEAN_LITERALRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL1031); 

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
    // $ANTLR end "entryRuleBOOLEAN_LITERAL"


    // $ANTLR start "ruleBOOLEAN_LITERAL"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:519:1: ruleBOOLEAN_LITERAL : ( ( rule__BOOLEAN_LITERAL__Alternatives ) ) ;
    public final void ruleBOOLEAN_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:523:2: ( ( ( rule__BOOLEAN_LITERAL__Alternatives ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:524:1: ( ( rule__BOOLEAN_LITERAL__Alternatives ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:524:1: ( ( rule__BOOLEAN_LITERAL__Alternatives ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:525:1: ( rule__BOOLEAN_LITERAL__Alternatives )
            {
             before(grammarAccess.getBOOLEAN_LITERALAccess().getAlternatives()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:526:1: ( rule__BOOLEAN_LITERAL__Alternatives )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:526:2: rule__BOOLEAN_LITERAL__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BOOLEAN_LITERAL__Alternatives_in_ruleBOOLEAN_LITERAL1057);
            rule__BOOLEAN_LITERAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEAN_LITERALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN_LITERAL"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:538:1: rule__Expression__Alternatives : ( ( ruleWhileLoop ) | ( ruleNegExp ) | ( ruleAndExp ) | ( ruleIfBlock ) | ( ruleCommand ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:542:1: ( ( ruleWhileLoop ) | ( ruleNegExp ) | ( ruleAndExp ) | ( ruleIfBlock ) | ( ruleCommand ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 21:
            case 26:
            case 28:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
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
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:543:1: ( ruleWhileLoop )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:543:1: ( ruleWhileLoop )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:544:1: ruleWhileLoop
                    {
                     before(grammarAccess.getExpressionAccess().getWhileLoopParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_rule__Expression__Alternatives1093);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getWhileLoopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:549:6: ( ruleNegExp )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:549:6: ( ruleNegExp )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:550:1: ruleNegExp
                    {
                     before(grammarAccess.getExpressionAccess().getNegExpParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNegExp_in_rule__Expression__Alternatives1110);
                    ruleNegExp();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNegExpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:555:6: ( ruleAndExp )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:555:6: ( ruleAndExp )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:556:1: ruleAndExp
                    {
                     before(grammarAccess.getExpressionAccess().getAndExpParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAndExp_in_rule__Expression__Alternatives1127);
                    ruleAndExp();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAndExpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:561:6: ( ruleIfBlock )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:561:6: ( ruleIfBlock )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:562:1: ruleIfBlock
                    {
                     before(grammarAccess.getExpressionAccess().getIfBlockParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIfBlock_in_rule__Expression__Alternatives1144);
                    ruleIfBlock();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIfBlockParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:567:6: ( ruleCommand )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:567:6: ( ruleCommand )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:568:1: ruleCommand
                    {
                     before(grammarAccess.getExpressionAccess().getCommandParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCommand_in_rule__Expression__Alternatives1161);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCommandParserRuleCall_4()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BoolExp__Alternatives"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:578:1: rule__BoolExp__Alternatives : ( ( ruleNegExp ) | ( ruleAndExp ) | ( ruleHasTurnedCmd ) | ( ruleObstacleCmd ) );
    public final void rule__BoolExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:582:1: ( ( ruleNegExp ) | ( ruleAndExp ) | ( ruleHasTurnedCmd ) | ( ruleObstacleCmd ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:583:1: ( ruleNegExp )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:583:1: ( ruleNegExp )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:584:1: ruleNegExp
                    {
                     before(grammarAccess.getBoolExpAccess().getNegExpParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNegExp_in_rule__BoolExp__Alternatives1193);
                    ruleNegExp();

                    state._fsp--;

                     after(grammarAccess.getBoolExpAccess().getNegExpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:589:6: ( ruleAndExp )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:589:6: ( ruleAndExp )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:590:1: ruleAndExp
                    {
                     before(grammarAccess.getBoolExpAccess().getAndExpParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAndExp_in_rule__BoolExp__Alternatives1210);
                    ruleAndExp();

                    state._fsp--;

                     after(grammarAccess.getBoolExpAccess().getAndExpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:595:6: ( ruleHasTurnedCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:595:6: ( ruleHasTurnedCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:596:1: ruleHasTurnedCmd
                    {
                     before(grammarAccess.getBoolExpAccess().getHasTurnedCmdParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHasTurnedCmd_in_rule__BoolExp__Alternatives1227);
                    ruleHasTurnedCmd();

                    state._fsp--;

                     after(grammarAccess.getBoolExpAccess().getHasTurnedCmdParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:601:6: ( ruleObstacleCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:601:6: ( ruleObstacleCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:602:1: ruleObstacleCmd
                    {
                     before(grammarAccess.getBoolExpAccess().getObstacleCmdParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleObstacleCmd_in_rule__BoolExp__Alternatives1244);
                    ruleObstacleCmd();

                    state._fsp--;

                     after(grammarAccess.getBoolExpAccess().getObstacleCmdParserRuleCall_3()); 

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
    // $ANTLR end "rule__BoolExp__Alternatives"


    // $ANTLR start "rule__Command__Alternatives"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:612:1: rule__Command__Alternatives : ( ( ruleMoveCmd ) | ( rulePrintCmd ) | ( ruleSetTurnAngleCmd ) | ( ruleStopEngineCmd ) | ( ruleStopProgramCmd ) | ( ruleTurnCmd ) | ( ruleHasTurnedCmd ) | ( ruleObstacleCmd ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:616:1: ( ( ruleMoveCmd ) | ( rulePrintCmd ) | ( ruleSetTurnAngleCmd ) | ( ruleStopEngineCmd ) | ( ruleStopProgramCmd ) | ( ruleTurnCmd ) | ( ruleHasTurnedCmd ) | ( ruleObstacleCmd ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            case 38:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:617:1: ( ruleMoveCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:617:1: ( ruleMoveCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:618:1: ruleMoveCmd
                    {
                     before(grammarAccess.getCommandAccess().getMoveCmdParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMoveCmd_in_rule__Command__Alternatives1276);
                    ruleMoveCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoveCmdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:623:6: ( rulePrintCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:623:6: ( rulePrintCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:624:1: rulePrintCmd
                    {
                     before(grammarAccess.getCommandAccess().getPrintCmdParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrintCmd_in_rule__Command__Alternatives1293);
                    rulePrintCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPrintCmdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:629:6: ( ruleSetTurnAngleCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:629:6: ( ruleSetTurnAngleCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:630:1: ruleSetTurnAngleCmd
                    {
                     before(grammarAccess.getCommandAccess().getSetTurnAngleCmdParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetTurnAngleCmd_in_rule__Command__Alternatives1310);
                    ruleSetTurnAngleCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSetTurnAngleCmdParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:635:6: ( ruleStopEngineCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:635:6: ( ruleStopEngineCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:636:1: ruleStopEngineCmd
                    {
                     before(grammarAccess.getCommandAccess().getStopEngineCmdParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStopEngineCmd_in_rule__Command__Alternatives1327);
                    ruleStopEngineCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getStopEngineCmdParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:641:6: ( ruleStopProgramCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:641:6: ( ruleStopProgramCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:642:1: ruleStopProgramCmd
                    {
                     before(grammarAccess.getCommandAccess().getStopProgramCmdParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStopProgramCmd_in_rule__Command__Alternatives1344);
                    ruleStopProgramCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getStopProgramCmdParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:647:6: ( ruleTurnCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:647:6: ( ruleTurnCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:648:1: ruleTurnCmd
                    {
                     before(grammarAccess.getCommandAccess().getTurnCmdParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTurnCmd_in_rule__Command__Alternatives1361);
                    ruleTurnCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getTurnCmdParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:653:6: ( ruleHasTurnedCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:653:6: ( ruleHasTurnedCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:654:1: ruleHasTurnedCmd
                    {
                     before(grammarAccess.getCommandAccess().getHasTurnedCmdParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHasTurnedCmd_in_rule__Command__Alternatives1378);
                    ruleHasTurnedCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHasTurnedCmdParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:659:6: ( ruleObstacleCmd )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:659:6: ( ruleObstacleCmd )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:660:1: ruleObstacleCmd
                    {
                     before(grammarAccess.getCommandAccess().getObstacleCmdParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleObstacleCmd_in_rule__Command__Alternatives1395);
                    ruleObstacleCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getObstacleCmdParserRuleCall_7()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__BOOLEAN_LITERAL__Alternatives"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:670:1: rule__BOOLEAN_LITERAL__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:674:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:675:1: ( 'true' )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:675:1: ( 'true' )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:676:1: 'true'
                    {
                     before(grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__BOOLEAN_LITERAL__Alternatives1428); 
                     after(grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:683:6: ( 'false' )
                    {
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:683:6: ( 'false' )
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:684:1: 'false'
                    {
                     before(grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BOOLEAN_LITERAL__Alternatives1448); 
                     after(grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BOOLEAN_LITERAL__Alternatives"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:698:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:702:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:703:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__0__Impl_in_rule__WhileLoop__Group__01480);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__1_in_rule__WhileLoop__Group__01483);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:710:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:714:1: ( ( 'while' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:715:1: ( 'while' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:715:1: ( 'while' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:716:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__WhileLoop__Group__0__Impl1511); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:729:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:733:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:734:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__1__Impl_in_rule__WhileLoop__Group__11542);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__2_in_rule__WhileLoop__Group__11545);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:741:1: rule__WhileLoop__Group__1__Impl : ( ( rule__WhileLoop__LoopCondAssignment_1 ) ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:745:1: ( ( ( rule__WhileLoop__LoopCondAssignment_1 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:746:1: ( ( rule__WhileLoop__LoopCondAssignment_1 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:746:1: ( ( rule__WhileLoop__LoopCondAssignment_1 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:747:1: ( rule__WhileLoop__LoopCondAssignment_1 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopCondAssignment_1()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:748:1: ( rule__WhileLoop__LoopCondAssignment_1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:748:2: rule__WhileLoop__LoopCondAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__LoopCondAssignment_1_in_rule__WhileLoop__Group__1__Impl1572);
            rule__WhileLoop__LoopCondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getLoopCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:758:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:762:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:763:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__2__Impl_in_rule__WhileLoop__Group__21602);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__3_in_rule__WhileLoop__Group__21605);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:770:1: rule__WhileLoop__Group__2__Impl : ( 'do' ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:774:1: ( ( 'do' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:775:1: ( 'do' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:775:1: ( 'do' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:776:1: 'do'
            {
             before(grammarAccess.getWhileLoopAccess().getDoKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WhileLoop__Group__2__Impl1633); 
             after(grammarAccess.getWhileLoopAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:789:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:793:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:794:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__3__Impl_in_rule__WhileLoop__Group__31664);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__4_in_rule__WhileLoop__Group__31667);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:801:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__BlockAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:805:1: ( ( ( rule__WhileLoop__BlockAssignment_3 )* ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:806:1: ( ( rule__WhileLoop__BlockAssignment_3 )* )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:806:1: ( ( rule__WhileLoop__BlockAssignment_3 )* )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:807:1: ( rule__WhileLoop__BlockAssignment_3 )*
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_3()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:808:1: ( rule__WhileLoop__BlockAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||(LA6_0>=16 && LA6_0<=18)||LA6_0==21||LA6_0==26||LA6_0==28||(LA6_0>=34 && LA6_0<=38)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:808:2: rule__WhileLoop__BlockAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__BlockAssignment_3_in_rule__WhileLoop__Group__3__Impl1694);
            	    rule__WhileLoop__BlockAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWhileLoopAccess().getBlockAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:818:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:822:1: ( rule__WhileLoop__Group__4__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:823:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__4__Impl_in_rule__WhileLoop__Group__41725);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:829:1: rule__WhileLoop__Group__4__Impl : ( 'end' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:833:1: ( ( 'end' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:834:1: ( 'end' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:834:1: ( 'end' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:835:1: 'end'
            {
             before(grammarAccess.getWhileLoopAccess().getEndKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__WhileLoop__Group__4__Impl1753); 
             after(grammarAccess.getWhileLoopAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__NegExp__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:858:1: rule__NegExp__Group__0 : rule__NegExp__Group__0__Impl rule__NegExp__Group__1 ;
    public final void rule__NegExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:862:1: ( rule__NegExp__Group__0__Impl rule__NegExp__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:863:2: rule__NegExp__Group__0__Impl rule__NegExp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExp__Group__0__Impl_in_rule__NegExp__Group__01794);
            rule__NegExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NegExp__Group__1_in_rule__NegExp__Group__01797);
            rule__NegExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExp__Group__0"


    // $ANTLR start "rule__NegExp__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:870:1: rule__NegExp__Group__0__Impl : ( 'not' ) ;
    public final void rule__NegExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:874:1: ( ( 'not' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:875:1: ( 'not' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:875:1: ( 'not' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:876:1: 'not'
            {
             before(grammarAccess.getNegExpAccess().getNotKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__NegExp__Group__0__Impl1825); 
             after(grammarAccess.getNegExpAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExp__Group__0__Impl"


    // $ANTLR start "rule__NegExp__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:889:1: rule__NegExp__Group__1 : rule__NegExp__Group__1__Impl ;
    public final void rule__NegExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:893:1: ( rule__NegExp__Group__1__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:894:2: rule__NegExp__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExp__Group__1__Impl_in_rule__NegExp__Group__11856);
            rule__NegExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExp__Group__1"


    // $ANTLR start "rule__NegExp__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:900:1: rule__NegExp__Group__1__Impl : ( ( rule__NegExp__ExpAssignment_1 ) ) ;
    public final void rule__NegExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:904:1: ( ( ( rule__NegExp__ExpAssignment_1 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:905:1: ( ( rule__NegExp__ExpAssignment_1 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:905:1: ( ( rule__NegExp__ExpAssignment_1 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:906:1: ( rule__NegExp__ExpAssignment_1 )
            {
             before(grammarAccess.getNegExpAccess().getExpAssignment_1()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:907:1: ( rule__NegExp__ExpAssignment_1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:907:2: rule__NegExp__ExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExp__ExpAssignment_1_in_rule__NegExp__Group__1__Impl1883);
            rule__NegExp__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegExpAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExp__Group__1__Impl"


    // $ANTLR start "rule__AndExp__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:921:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:925:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:926:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__01917);
            rule__AndExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__01920);
            rule__AndExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__0"


    // $ANTLR start "rule__AndExp__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:933:1: rule__AndExp__Group__0__Impl : ( 'and' ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:937:1: ( ( 'and' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:938:1: ( 'and' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:938:1: ( 'and' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:939:1: 'and'
            {
             before(grammarAccess.getAndExpAccess().getAndKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__AndExp__Group__0__Impl1948); 
             after(grammarAccess.getAndExpAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__0__Impl"


    // $ANTLR start "rule__AndExp__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:952:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl rule__AndExp__Group__2 ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:956:1: ( rule__AndExp__Group__1__Impl rule__AndExp__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:957:2: rule__AndExp__Group__1__Impl rule__AndExp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__11979);
            rule__AndExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__2_in_rule__AndExp__Group__11982);
            rule__AndExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__1"


    // $ANTLR start "rule__AndExp__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:964:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__LeftExpAssignment_1 ) ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:968:1: ( ( ( rule__AndExp__LeftExpAssignment_1 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:969:1: ( ( rule__AndExp__LeftExpAssignment_1 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:969:1: ( ( rule__AndExp__LeftExpAssignment_1 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:970:1: ( rule__AndExp__LeftExpAssignment_1 )
            {
             before(grammarAccess.getAndExpAccess().getLeftExpAssignment_1()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:971:1: ( rule__AndExp__LeftExpAssignment_1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:971:2: rule__AndExp__LeftExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__LeftExpAssignment_1_in_rule__AndExp__Group__1__Impl2009);
            rule__AndExp__LeftExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpAccess().getLeftExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__1__Impl"


    // $ANTLR start "rule__AndExp__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:981:1: rule__AndExp__Group__2 : rule__AndExp__Group__2__Impl ;
    public final void rule__AndExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:985:1: ( rule__AndExp__Group__2__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:986:2: rule__AndExp__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__Group__2__Impl_in_rule__AndExp__Group__22039);
            rule__AndExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__2"


    // $ANTLR start "rule__AndExp__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:992:1: rule__AndExp__Group__2__Impl : ( ( rule__AndExp__RightExpAssignment_2 ) ) ;
    public final void rule__AndExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:996:1: ( ( ( rule__AndExp__RightExpAssignment_2 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:997:1: ( ( rule__AndExp__RightExpAssignment_2 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:997:1: ( ( rule__AndExp__RightExpAssignment_2 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:998:1: ( rule__AndExp__RightExpAssignment_2 )
            {
             before(grammarAccess.getAndExpAccess().getRightExpAssignment_2()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:999:1: ( rule__AndExp__RightExpAssignment_2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:999:2: rule__AndExp__RightExpAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExp__RightExpAssignment_2_in_rule__AndExp__Group__2__Impl2066);
            rule__AndExp__RightExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpAccess().getRightExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__2__Impl"


    // $ANTLR start "rule__IfBlock__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1015:1: rule__IfBlock__Group__0 : rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 ;
    public final void rule__IfBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1019:1: ( rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1020:2: rule__IfBlock__Group__0__Impl rule__IfBlock__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__0__Impl_in_rule__IfBlock__Group__02102);
            rule__IfBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__1_in_rule__IfBlock__Group__02105);
            rule__IfBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__0"


    // $ANTLR start "rule__IfBlock__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1027:1: rule__IfBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1031:1: ( ( 'if' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1032:1: ( 'if' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1032:1: ( 'if' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1033:1: 'if'
            {
             before(grammarAccess.getIfBlockAccess().getIfKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IfBlock__Group__0__Impl2133); 
             after(grammarAccess.getIfBlockAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__0__Impl"


    // $ANTLR start "rule__IfBlock__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1046:1: rule__IfBlock__Group__1 : rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 ;
    public final void rule__IfBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1050:1: ( rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1051:2: rule__IfBlock__Group__1__Impl rule__IfBlock__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__1__Impl_in_rule__IfBlock__Group__12164);
            rule__IfBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__2_in_rule__IfBlock__Group__12167);
            rule__IfBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__1"


    // $ANTLR start "rule__IfBlock__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1058:1: rule__IfBlock__Group__1__Impl : ( ( rule__IfBlock__ConditionAssignment_1 ) ) ;
    public final void rule__IfBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1062:1: ( ( ( rule__IfBlock__ConditionAssignment_1 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1063:1: ( ( rule__IfBlock__ConditionAssignment_1 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1063:1: ( ( rule__IfBlock__ConditionAssignment_1 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1064:1: ( rule__IfBlock__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfBlockAccess().getConditionAssignment_1()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1065:1: ( rule__IfBlock__ConditionAssignment_1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1065:2: rule__IfBlock__ConditionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__ConditionAssignment_1_in_rule__IfBlock__Group__1__Impl2194);
            rule__IfBlock__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfBlockAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__1__Impl"


    // $ANTLR start "rule__IfBlock__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1075:1: rule__IfBlock__Group__2 : rule__IfBlock__Group__2__Impl rule__IfBlock__Group__3 ;
    public final void rule__IfBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1079:1: ( rule__IfBlock__Group__2__Impl rule__IfBlock__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1080:2: rule__IfBlock__Group__2__Impl rule__IfBlock__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__2__Impl_in_rule__IfBlock__Group__22224);
            rule__IfBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__3_in_rule__IfBlock__Group__22227);
            rule__IfBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__2"


    // $ANTLR start "rule__IfBlock__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1087:1: rule__IfBlock__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1091:1: ( ( 'then' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1092:1: ( 'then' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1092:1: ( 'then' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1093:1: 'then'
            {
             before(grammarAccess.getIfBlockAccess().getThenKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfBlock__Group__2__Impl2255); 
             after(grammarAccess.getIfBlockAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__2__Impl"


    // $ANTLR start "rule__IfBlock__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1106:1: rule__IfBlock__Group__3 : rule__IfBlock__Group__3__Impl rule__IfBlock__Group__4 ;
    public final void rule__IfBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1110:1: ( rule__IfBlock__Group__3__Impl rule__IfBlock__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1111:2: rule__IfBlock__Group__3__Impl rule__IfBlock__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__3__Impl_in_rule__IfBlock__Group__32286);
            rule__IfBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__4_in_rule__IfBlock__Group__32289);
            rule__IfBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__3"


    // $ANTLR start "rule__IfBlock__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1118:1: rule__IfBlock__Group__3__Impl : ( ( rule__IfBlock__ThenBlockAssignment_3 )* ) ;
    public final void rule__IfBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1122:1: ( ( ( rule__IfBlock__ThenBlockAssignment_3 )* ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1123:1: ( ( rule__IfBlock__ThenBlockAssignment_3 )* )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1123:1: ( ( rule__IfBlock__ThenBlockAssignment_3 )* )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1124:1: ( rule__IfBlock__ThenBlockAssignment_3 )*
            {
             before(grammarAccess.getIfBlockAccess().getThenBlockAssignment_3()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1125:1: ( rule__IfBlock__ThenBlockAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13||(LA7_0>=16 && LA7_0<=18)||LA7_0==21||LA7_0==26||LA7_0==28||(LA7_0>=34 && LA7_0<=38)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1125:2: rule__IfBlock__ThenBlockAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IfBlock__ThenBlockAssignment_3_in_rule__IfBlock__Group__3__Impl2316);
            	    rule__IfBlock__ThenBlockAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIfBlockAccess().getThenBlockAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__3__Impl"


    // $ANTLR start "rule__IfBlock__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1135:1: rule__IfBlock__Group__4 : rule__IfBlock__Group__4__Impl rule__IfBlock__Group__5 ;
    public final void rule__IfBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1139:1: ( rule__IfBlock__Group__4__Impl rule__IfBlock__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1140:2: rule__IfBlock__Group__4__Impl rule__IfBlock__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__4__Impl_in_rule__IfBlock__Group__42347);
            rule__IfBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__5_in_rule__IfBlock__Group__42350);
            rule__IfBlock__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__4"


    // $ANTLR start "rule__IfBlock__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1147:1: rule__IfBlock__Group__4__Impl : ( ( rule__IfBlock__Group_4__0 )? ) ;
    public final void rule__IfBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1151:1: ( ( ( rule__IfBlock__Group_4__0 )? ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1152:1: ( ( rule__IfBlock__Group_4__0 )? )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1152:1: ( ( rule__IfBlock__Group_4__0 )? )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1153:1: ( rule__IfBlock__Group_4__0 )?
            {
             before(grammarAccess.getIfBlockAccess().getGroup_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1154:1: ( rule__IfBlock__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1154:2: rule__IfBlock__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group_4__0_in_rule__IfBlock__Group__4__Impl2377);
                    rule__IfBlock__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfBlockAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__4__Impl"


    // $ANTLR start "rule__IfBlock__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1164:1: rule__IfBlock__Group__5 : rule__IfBlock__Group__5__Impl ;
    public final void rule__IfBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1168:1: ( rule__IfBlock__Group__5__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1169:2: rule__IfBlock__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group__5__Impl_in_rule__IfBlock__Group__52408);
            rule__IfBlock__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__5"


    // $ANTLR start "rule__IfBlock__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1175:1: rule__IfBlock__Group__5__Impl : ( 'end' ) ;
    public final void rule__IfBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1179:1: ( ( 'end' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1180:1: ( 'end' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1180:1: ( 'end' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1181:1: 'end'
            {
             before(grammarAccess.getIfBlockAccess().getEndKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__IfBlock__Group__5__Impl2436); 
             after(grammarAccess.getIfBlockAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group__5__Impl"


    // $ANTLR start "rule__IfBlock__Group_4__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1206:1: rule__IfBlock__Group_4__0 : rule__IfBlock__Group_4__0__Impl rule__IfBlock__Group_4__1 ;
    public final void rule__IfBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1210:1: ( rule__IfBlock__Group_4__0__Impl rule__IfBlock__Group_4__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1211:2: rule__IfBlock__Group_4__0__Impl rule__IfBlock__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group_4__0__Impl_in_rule__IfBlock__Group_4__02479);
            rule__IfBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group_4__1_in_rule__IfBlock__Group_4__02482);
            rule__IfBlock__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_4__0"


    // $ANTLR start "rule__IfBlock__Group_4__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1218:1: rule__IfBlock__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__IfBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1222:1: ( ( 'else' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1223:1: ( 'else' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1223:1: ( 'else' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1224:1: 'else'
            {
             before(grammarAccess.getIfBlockAccess().getElseKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__IfBlock__Group_4__0__Impl2510); 
             after(grammarAccess.getIfBlockAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_4__0__Impl"


    // $ANTLR start "rule__IfBlock__Group_4__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1237:1: rule__IfBlock__Group_4__1 : rule__IfBlock__Group_4__1__Impl ;
    public final void rule__IfBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1241:1: ( rule__IfBlock__Group_4__1__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1242:2: rule__IfBlock__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfBlock__Group_4__1__Impl_in_rule__IfBlock__Group_4__12541);
            rule__IfBlock__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_4__1"


    // $ANTLR start "rule__IfBlock__Group_4__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1248:1: rule__IfBlock__Group_4__1__Impl : ( ( rule__IfBlock__ElseBlockAssignment_4_1 )* ) ;
    public final void rule__IfBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1252:1: ( ( ( rule__IfBlock__ElseBlockAssignment_4_1 )* ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1253:1: ( ( rule__IfBlock__ElseBlockAssignment_4_1 )* )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1253:1: ( ( rule__IfBlock__ElseBlockAssignment_4_1 )* )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1254:1: ( rule__IfBlock__ElseBlockAssignment_4_1 )*
            {
             before(grammarAccess.getIfBlockAccess().getElseBlockAssignment_4_1()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1255:1: ( rule__IfBlock__ElseBlockAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13||(LA9_0>=16 && LA9_0<=18)||LA9_0==21||LA9_0==26||LA9_0==28||(LA9_0>=34 && LA9_0<=38)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1255:2: rule__IfBlock__ElseBlockAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IfBlock__ElseBlockAssignment_4_1_in_rule__IfBlock__Group_4__1__Impl2568);
            	    rule__IfBlock__ElseBlockAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIfBlockAccess().getElseBlockAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__Group_4__1__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1270:1: rule__HasTurnedCmd__Group__0 : rule__HasTurnedCmd__Group__0__Impl rule__HasTurnedCmd__Group__1 ;
    public final void rule__HasTurnedCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1274:1: ( rule__HasTurnedCmd__Group__0__Impl rule__HasTurnedCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1275:2: rule__HasTurnedCmd__Group__0__Impl rule__HasTurnedCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__0__Impl_in_rule__HasTurnedCmd__Group__02604);
            rule__HasTurnedCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__1_in_rule__HasTurnedCmd__Group__02607);
            rule__HasTurnedCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__0"


    // $ANTLR start "rule__HasTurnedCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1282:1: rule__HasTurnedCmd__Group__0__Impl : ( 'hasTurned' ) ;
    public final void rule__HasTurnedCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1286:1: ( ( 'hasTurned' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1287:1: ( 'hasTurned' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1287:1: ( 'hasTurned' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1288:1: 'hasTurned'
            {
             before(grammarAccess.getHasTurnedCmdAccess().getHasTurnedKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__HasTurnedCmd__Group__0__Impl2635); 
             after(grammarAccess.getHasTurnedCmdAccess().getHasTurnedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__0__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1301:1: rule__HasTurnedCmd__Group__1 : rule__HasTurnedCmd__Group__1__Impl rule__HasTurnedCmd__Group__2 ;
    public final void rule__HasTurnedCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1305:1: ( rule__HasTurnedCmd__Group__1__Impl rule__HasTurnedCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1306:2: rule__HasTurnedCmd__Group__1__Impl rule__HasTurnedCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__1__Impl_in_rule__HasTurnedCmd__Group__12666);
            rule__HasTurnedCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__2_in_rule__HasTurnedCmd__Group__12669);
            rule__HasTurnedCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__1"


    // $ANTLR start "rule__HasTurnedCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1313:1: rule__HasTurnedCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__HasTurnedCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1317:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1318:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1318:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1319:1: '('
            {
             before(grammarAccess.getHasTurnedCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__HasTurnedCmd__Group__1__Impl2697); 
             after(grammarAccess.getHasTurnedCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__1__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1332:1: rule__HasTurnedCmd__Group__2 : rule__HasTurnedCmd__Group__2__Impl rule__HasTurnedCmd__Group__3 ;
    public final void rule__HasTurnedCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1336:1: ( rule__HasTurnedCmd__Group__2__Impl rule__HasTurnedCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1337:2: rule__HasTurnedCmd__Group__2__Impl rule__HasTurnedCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__2__Impl_in_rule__HasTurnedCmd__Group__22728);
            rule__HasTurnedCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__3_in_rule__HasTurnedCmd__Group__22731);
            rule__HasTurnedCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__2"


    // $ANTLR start "rule__HasTurnedCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1344:1: rule__HasTurnedCmd__Group__2__Impl : ( 'angle' ) ;
    public final void rule__HasTurnedCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1348:1: ( ( 'angle' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1349:1: ( 'angle' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1349:1: ( 'angle' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1350:1: 'angle'
            {
             before(grammarAccess.getHasTurnedCmdAccess().getAngleKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__HasTurnedCmd__Group__2__Impl2759); 
             after(grammarAccess.getHasTurnedCmdAccess().getAngleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__2__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1363:1: rule__HasTurnedCmd__Group__3 : rule__HasTurnedCmd__Group__3__Impl rule__HasTurnedCmd__Group__4 ;
    public final void rule__HasTurnedCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1367:1: ( rule__HasTurnedCmd__Group__3__Impl rule__HasTurnedCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1368:2: rule__HasTurnedCmd__Group__3__Impl rule__HasTurnedCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__3__Impl_in_rule__HasTurnedCmd__Group__32790);
            rule__HasTurnedCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__4_in_rule__HasTurnedCmd__Group__32793);
            rule__HasTurnedCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__3"


    // $ANTLR start "rule__HasTurnedCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1375:1: rule__HasTurnedCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__HasTurnedCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1379:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1380:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1380:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1381:1: '='
            {
             before(grammarAccess.getHasTurnedCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__HasTurnedCmd__Group__3__Impl2821); 
             after(grammarAccess.getHasTurnedCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__3__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1394:1: rule__HasTurnedCmd__Group__4 : rule__HasTurnedCmd__Group__4__Impl rule__HasTurnedCmd__Group__5 ;
    public final void rule__HasTurnedCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1398:1: ( rule__HasTurnedCmd__Group__4__Impl rule__HasTurnedCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1399:2: rule__HasTurnedCmd__Group__4__Impl rule__HasTurnedCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__4__Impl_in_rule__HasTurnedCmd__Group__42852);
            rule__HasTurnedCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__5_in_rule__HasTurnedCmd__Group__42855);
            rule__HasTurnedCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__4"


    // $ANTLR start "rule__HasTurnedCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1406:1: rule__HasTurnedCmd__Group__4__Impl : ( ( rule__HasTurnedCmd__AngleAssignment_4 ) ) ;
    public final void rule__HasTurnedCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1410:1: ( ( ( rule__HasTurnedCmd__AngleAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1411:1: ( ( rule__HasTurnedCmd__AngleAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1411:1: ( ( rule__HasTurnedCmd__AngleAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1412:1: ( rule__HasTurnedCmd__AngleAssignment_4 )
            {
             before(grammarAccess.getHasTurnedCmdAccess().getAngleAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1413:1: ( rule__HasTurnedCmd__AngleAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1413:2: rule__HasTurnedCmd__AngleAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__AngleAssignment_4_in_rule__HasTurnedCmd__Group__4__Impl2882);
            rule__HasTurnedCmd__AngleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHasTurnedCmdAccess().getAngleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__4__Impl"


    // $ANTLR start "rule__HasTurnedCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1423:1: rule__HasTurnedCmd__Group__5 : rule__HasTurnedCmd__Group__5__Impl ;
    public final void rule__HasTurnedCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1427:1: ( rule__HasTurnedCmd__Group__5__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1428:2: rule__HasTurnedCmd__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HasTurnedCmd__Group__5__Impl_in_rule__HasTurnedCmd__Group__52912);
            rule__HasTurnedCmd__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__5"


    // $ANTLR start "rule__HasTurnedCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1434:1: rule__HasTurnedCmd__Group__5__Impl : ( ')' ) ;
    public final void rule__HasTurnedCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1438:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1439:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1439:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1440:1: ')'
            {
             before(grammarAccess.getHasTurnedCmdAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__HasTurnedCmd__Group__5__Impl2940); 
             after(grammarAccess.getHasTurnedCmdAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__Group__5__Impl"


    // $ANTLR start "rule__MoveCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1465:1: rule__MoveCmd__Group__0 : rule__MoveCmd__Group__0__Impl rule__MoveCmd__Group__1 ;
    public final void rule__MoveCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1469:1: ( rule__MoveCmd__Group__0__Impl rule__MoveCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1470:2: rule__MoveCmd__Group__0__Impl rule__MoveCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__0__Impl_in_rule__MoveCmd__Group__02983);
            rule__MoveCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__1_in_rule__MoveCmd__Group__02986);
            rule__MoveCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__0"


    // $ANTLR start "rule__MoveCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1477:1: rule__MoveCmd__Group__0__Impl : ( 'move' ) ;
    public final void rule__MoveCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1481:1: ( ( 'move' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1482:1: ( 'move' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1482:1: ( 'move' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1483:1: 'move'
            {
             before(grammarAccess.getMoveCmdAccess().getMoveKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MoveCmd__Group__0__Impl3014); 
             after(grammarAccess.getMoveCmdAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__0__Impl"


    // $ANTLR start "rule__MoveCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1496:1: rule__MoveCmd__Group__1 : rule__MoveCmd__Group__1__Impl rule__MoveCmd__Group__2 ;
    public final void rule__MoveCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1500:1: ( rule__MoveCmd__Group__1__Impl rule__MoveCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1501:2: rule__MoveCmd__Group__1__Impl rule__MoveCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__1__Impl_in_rule__MoveCmd__Group__13045);
            rule__MoveCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__2_in_rule__MoveCmd__Group__13048);
            rule__MoveCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__1"


    // $ANTLR start "rule__MoveCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1508:1: rule__MoveCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__MoveCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1512:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1513:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1513:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1514:1: '('
            {
             before(grammarAccess.getMoveCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MoveCmd__Group__1__Impl3076); 
             after(grammarAccess.getMoveCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__1__Impl"


    // $ANTLR start "rule__MoveCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1527:1: rule__MoveCmd__Group__2 : rule__MoveCmd__Group__2__Impl rule__MoveCmd__Group__3 ;
    public final void rule__MoveCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1531:1: ( rule__MoveCmd__Group__2__Impl rule__MoveCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1532:2: rule__MoveCmd__Group__2__Impl rule__MoveCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__2__Impl_in_rule__MoveCmd__Group__23107);
            rule__MoveCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__3_in_rule__MoveCmd__Group__23110);
            rule__MoveCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__2"


    // $ANTLR start "rule__MoveCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1539:1: rule__MoveCmd__Group__2__Impl : ( 'power' ) ;
    public final void rule__MoveCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1543:1: ( ( 'power' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1544:1: ( 'power' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1544:1: ( 'power' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1545:1: 'power'
            {
             before(grammarAccess.getMoveCmdAccess().getPowerKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MoveCmd__Group__2__Impl3138); 
             after(grammarAccess.getMoveCmdAccess().getPowerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__2__Impl"


    // $ANTLR start "rule__MoveCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1558:1: rule__MoveCmd__Group__3 : rule__MoveCmd__Group__3__Impl rule__MoveCmd__Group__4 ;
    public final void rule__MoveCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1562:1: ( rule__MoveCmd__Group__3__Impl rule__MoveCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1563:2: rule__MoveCmd__Group__3__Impl rule__MoveCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__3__Impl_in_rule__MoveCmd__Group__33169);
            rule__MoveCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__4_in_rule__MoveCmd__Group__33172);
            rule__MoveCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__3"


    // $ANTLR start "rule__MoveCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1570:1: rule__MoveCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__MoveCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1574:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1575:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1575:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1576:1: '='
            {
             before(grammarAccess.getMoveCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MoveCmd__Group__3__Impl3200); 
             after(grammarAccess.getMoveCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__3__Impl"


    // $ANTLR start "rule__MoveCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1589:1: rule__MoveCmd__Group__4 : rule__MoveCmd__Group__4__Impl rule__MoveCmd__Group__5 ;
    public final void rule__MoveCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1593:1: ( rule__MoveCmd__Group__4__Impl rule__MoveCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1594:2: rule__MoveCmd__Group__4__Impl rule__MoveCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__4__Impl_in_rule__MoveCmd__Group__43231);
            rule__MoveCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__5_in_rule__MoveCmd__Group__43234);
            rule__MoveCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__4"


    // $ANTLR start "rule__MoveCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1601:1: rule__MoveCmd__Group__4__Impl : ( ( rule__MoveCmd__PowerAssignment_4 ) ) ;
    public final void rule__MoveCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1605:1: ( ( ( rule__MoveCmd__PowerAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1606:1: ( ( rule__MoveCmd__PowerAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1606:1: ( ( rule__MoveCmd__PowerAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1607:1: ( rule__MoveCmd__PowerAssignment_4 )
            {
             before(grammarAccess.getMoveCmdAccess().getPowerAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1608:1: ( rule__MoveCmd__PowerAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1608:2: rule__MoveCmd__PowerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__PowerAssignment_4_in_rule__MoveCmd__Group__4__Impl3261);
            rule__MoveCmd__PowerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveCmdAccess().getPowerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__4__Impl"


    // $ANTLR start "rule__MoveCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1618:1: rule__MoveCmd__Group__5 : rule__MoveCmd__Group__5__Impl ;
    public final void rule__MoveCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1622:1: ( rule__MoveCmd__Group__5__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1623:2: rule__MoveCmd__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveCmd__Group__5__Impl_in_rule__MoveCmd__Group__53291);
            rule__MoveCmd__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__5"


    // $ANTLR start "rule__MoveCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1629:1: rule__MoveCmd__Group__5__Impl : ( ')' ) ;
    public final void rule__MoveCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1633:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1634:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1634:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1635:1: ')'
            {
             before(grammarAccess.getMoveCmdAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MoveCmd__Group__5__Impl3319); 
             after(grammarAccess.getMoveCmdAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__Group__5__Impl"


    // $ANTLR start "rule__PrintCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1660:1: rule__PrintCmd__Group__0 : rule__PrintCmd__Group__0__Impl rule__PrintCmd__Group__1 ;
    public final void rule__PrintCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1664:1: ( rule__PrintCmd__Group__0__Impl rule__PrintCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1665:2: rule__PrintCmd__Group__0__Impl rule__PrintCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__0__Impl_in_rule__PrintCmd__Group__03362);
            rule__PrintCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__1_in_rule__PrintCmd__Group__03365);
            rule__PrintCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__0"


    // $ANTLR start "rule__PrintCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1672:1: rule__PrintCmd__Group__0__Impl : ( 'display' ) ;
    public final void rule__PrintCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1676:1: ( ( 'display' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1677:1: ( 'display' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1677:1: ( 'display' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1678:1: 'display'
            {
             before(grammarAccess.getPrintCmdAccess().getDisplayKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PrintCmd__Group__0__Impl3393); 
             after(grammarAccess.getPrintCmdAccess().getDisplayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__0__Impl"


    // $ANTLR start "rule__PrintCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1691:1: rule__PrintCmd__Group__1 : rule__PrintCmd__Group__1__Impl rule__PrintCmd__Group__2 ;
    public final void rule__PrintCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1695:1: ( rule__PrintCmd__Group__1__Impl rule__PrintCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1696:2: rule__PrintCmd__Group__1__Impl rule__PrintCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__1__Impl_in_rule__PrintCmd__Group__13424);
            rule__PrintCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__2_in_rule__PrintCmd__Group__13427);
            rule__PrintCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__1"


    // $ANTLR start "rule__PrintCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1703:1: rule__PrintCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__PrintCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1707:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1708:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1708:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1709:1: '('
            {
             before(grammarAccess.getPrintCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PrintCmd__Group__1__Impl3455); 
             after(grammarAccess.getPrintCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__1__Impl"


    // $ANTLR start "rule__PrintCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1722:1: rule__PrintCmd__Group__2 : rule__PrintCmd__Group__2__Impl rule__PrintCmd__Group__3 ;
    public final void rule__PrintCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1726:1: ( rule__PrintCmd__Group__2__Impl rule__PrintCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1727:2: rule__PrintCmd__Group__2__Impl rule__PrintCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__2__Impl_in_rule__PrintCmd__Group__23486);
            rule__PrintCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__3_in_rule__PrintCmd__Group__23489);
            rule__PrintCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__2"


    // $ANTLR start "rule__PrintCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1734:1: rule__PrintCmd__Group__2__Impl : ( 'msg' ) ;
    public final void rule__PrintCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1738:1: ( ( 'msg' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1739:1: ( 'msg' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1739:1: ( 'msg' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1740:1: 'msg'
            {
             before(grammarAccess.getPrintCmdAccess().getMsgKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PrintCmd__Group__2__Impl3517); 
             after(grammarAccess.getPrintCmdAccess().getMsgKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__2__Impl"


    // $ANTLR start "rule__PrintCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1753:1: rule__PrintCmd__Group__3 : rule__PrintCmd__Group__3__Impl rule__PrintCmd__Group__4 ;
    public final void rule__PrintCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1757:1: ( rule__PrintCmd__Group__3__Impl rule__PrintCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1758:2: rule__PrintCmd__Group__3__Impl rule__PrintCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__3__Impl_in_rule__PrintCmd__Group__33548);
            rule__PrintCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__4_in_rule__PrintCmd__Group__33551);
            rule__PrintCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__3"


    // $ANTLR start "rule__PrintCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1765:1: rule__PrintCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__PrintCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1769:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1770:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1770:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1771:1: '='
            {
             before(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PrintCmd__Group__3__Impl3579); 
             after(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__3__Impl"


    // $ANTLR start "rule__PrintCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1784:1: rule__PrintCmd__Group__4 : rule__PrintCmd__Group__4__Impl rule__PrintCmd__Group__5 ;
    public final void rule__PrintCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1788:1: ( rule__PrintCmd__Group__4__Impl rule__PrintCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1789:2: rule__PrintCmd__Group__4__Impl rule__PrintCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__4__Impl_in_rule__PrintCmd__Group__43610);
            rule__PrintCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__5_in_rule__PrintCmd__Group__43613);
            rule__PrintCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__4"


    // $ANTLR start "rule__PrintCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1796:1: rule__PrintCmd__Group__4__Impl : ( ( rule__PrintCmd__MsgAssignment_4 ) ) ;
    public final void rule__PrintCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1800:1: ( ( ( rule__PrintCmd__MsgAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1801:1: ( ( rule__PrintCmd__MsgAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1801:1: ( ( rule__PrintCmd__MsgAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1802:1: ( rule__PrintCmd__MsgAssignment_4 )
            {
             before(grammarAccess.getPrintCmdAccess().getMsgAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1803:1: ( rule__PrintCmd__MsgAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1803:2: rule__PrintCmd__MsgAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__MsgAssignment_4_in_rule__PrintCmd__Group__4__Impl3640);
            rule__PrintCmd__MsgAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrintCmdAccess().getMsgAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__4__Impl"


    // $ANTLR start "rule__PrintCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1813:1: rule__PrintCmd__Group__5 : rule__PrintCmd__Group__5__Impl rule__PrintCmd__Group__6 ;
    public final void rule__PrintCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1817:1: ( rule__PrintCmd__Group__5__Impl rule__PrintCmd__Group__6 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1818:2: rule__PrintCmd__Group__5__Impl rule__PrintCmd__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__5__Impl_in_rule__PrintCmd__Group__53670);
            rule__PrintCmd__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__6_in_rule__PrintCmd__Group__53673);
            rule__PrintCmd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__5"


    // $ANTLR start "rule__PrintCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1825:1: rule__PrintCmd__Group__5__Impl : ( ',' ) ;
    public final void rule__PrintCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1829:1: ( ( ',' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1830:1: ( ',' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1830:1: ( ',' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1831:1: ','
            {
             before(grammarAccess.getPrintCmdAccess().getCommaKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PrintCmd__Group__5__Impl3701); 
             after(grammarAccess.getPrintCmdAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__5__Impl"


    // $ANTLR start "rule__PrintCmd__Group__6"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1844:1: rule__PrintCmd__Group__6 : rule__PrintCmd__Group__6__Impl rule__PrintCmd__Group__7 ;
    public final void rule__PrintCmd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1848:1: ( rule__PrintCmd__Group__6__Impl rule__PrintCmd__Group__7 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1849:2: rule__PrintCmd__Group__6__Impl rule__PrintCmd__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__6__Impl_in_rule__PrintCmd__Group__63732);
            rule__PrintCmd__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__7_in_rule__PrintCmd__Group__63735);
            rule__PrintCmd__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__6"


    // $ANTLR start "rule__PrintCmd__Group__6__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1856:1: rule__PrintCmd__Group__6__Impl : ( 'duration' ) ;
    public final void rule__PrintCmd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1860:1: ( ( 'duration' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1861:1: ( 'duration' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1861:1: ( 'duration' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1862:1: 'duration'
            {
             before(grammarAccess.getPrintCmdAccess().getDurationKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PrintCmd__Group__6__Impl3763); 
             after(grammarAccess.getPrintCmdAccess().getDurationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__6__Impl"


    // $ANTLR start "rule__PrintCmd__Group__7"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1875:1: rule__PrintCmd__Group__7 : rule__PrintCmd__Group__7__Impl rule__PrintCmd__Group__8 ;
    public final void rule__PrintCmd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1879:1: ( rule__PrintCmd__Group__7__Impl rule__PrintCmd__Group__8 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1880:2: rule__PrintCmd__Group__7__Impl rule__PrintCmd__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__7__Impl_in_rule__PrintCmd__Group__73794);
            rule__PrintCmd__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__8_in_rule__PrintCmd__Group__73797);
            rule__PrintCmd__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__7"


    // $ANTLR start "rule__PrintCmd__Group__7__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1887:1: rule__PrintCmd__Group__7__Impl : ( '=' ) ;
    public final void rule__PrintCmd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1891:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1892:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1892:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1893:1: '='
            {
             before(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PrintCmd__Group__7__Impl3825); 
             after(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__7__Impl"


    // $ANTLR start "rule__PrintCmd__Group__8"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1906:1: rule__PrintCmd__Group__8 : rule__PrintCmd__Group__8__Impl rule__PrintCmd__Group__9 ;
    public final void rule__PrintCmd__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1910:1: ( rule__PrintCmd__Group__8__Impl rule__PrintCmd__Group__9 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1911:2: rule__PrintCmd__Group__8__Impl rule__PrintCmd__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__8__Impl_in_rule__PrintCmd__Group__83856);
            rule__PrintCmd__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__9_in_rule__PrintCmd__Group__83859);
            rule__PrintCmd__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__8"


    // $ANTLR start "rule__PrintCmd__Group__8__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1918:1: rule__PrintCmd__Group__8__Impl : ( ( rule__PrintCmd__DurationAssignment_8 ) ) ;
    public final void rule__PrintCmd__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1922:1: ( ( ( rule__PrintCmd__DurationAssignment_8 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1923:1: ( ( rule__PrintCmd__DurationAssignment_8 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1923:1: ( ( rule__PrintCmd__DurationAssignment_8 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1924:1: ( rule__PrintCmd__DurationAssignment_8 )
            {
             before(grammarAccess.getPrintCmdAccess().getDurationAssignment_8()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1925:1: ( rule__PrintCmd__DurationAssignment_8 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1925:2: rule__PrintCmd__DurationAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__DurationAssignment_8_in_rule__PrintCmd__Group__8__Impl3886);
            rule__PrintCmd__DurationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPrintCmdAccess().getDurationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__8__Impl"


    // $ANTLR start "rule__PrintCmd__Group__9"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1935:1: rule__PrintCmd__Group__9 : rule__PrintCmd__Group__9__Impl rule__PrintCmd__Group__10 ;
    public final void rule__PrintCmd__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( rule__PrintCmd__Group__9__Impl rule__PrintCmd__Group__10 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1940:2: rule__PrintCmd__Group__9__Impl rule__PrintCmd__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__9__Impl_in_rule__PrintCmd__Group__93916);
            rule__PrintCmd__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__10_in_rule__PrintCmd__Group__93919);
            rule__PrintCmd__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__9"


    // $ANTLR start "rule__PrintCmd__Group__9__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1947:1: rule__PrintCmd__Group__9__Impl : ( ',' ) ;
    public final void rule__PrintCmd__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1951:1: ( ( ',' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1952:1: ( ',' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1952:1: ( ',' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1953:1: ','
            {
             before(grammarAccess.getPrintCmdAccess().getCommaKeyword_9()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PrintCmd__Group__9__Impl3947); 
             after(grammarAccess.getPrintCmdAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__9__Impl"


    // $ANTLR start "rule__PrintCmd__Group__10"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1966:1: rule__PrintCmd__Group__10 : rule__PrintCmd__Group__10__Impl rule__PrintCmd__Group__11 ;
    public final void rule__PrintCmd__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1970:1: ( rule__PrintCmd__Group__10__Impl rule__PrintCmd__Group__11 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1971:2: rule__PrintCmd__Group__10__Impl rule__PrintCmd__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__10__Impl_in_rule__PrintCmd__Group__103978);
            rule__PrintCmd__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__11_in_rule__PrintCmd__Group__103981);
            rule__PrintCmd__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__10"


    // $ANTLR start "rule__PrintCmd__Group__10__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1978:1: rule__PrintCmd__Group__10__Impl : ( 'line' ) ;
    public final void rule__PrintCmd__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1982:1: ( ( 'line' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1983:1: ( 'line' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1983:1: ( 'line' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1984:1: 'line'
            {
             before(grammarAccess.getPrintCmdAccess().getLineKeyword_10()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__PrintCmd__Group__10__Impl4009); 
             after(grammarAccess.getPrintCmdAccess().getLineKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__10__Impl"


    // $ANTLR start "rule__PrintCmd__Group__11"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:1997:1: rule__PrintCmd__Group__11 : rule__PrintCmd__Group__11__Impl rule__PrintCmd__Group__12 ;
    public final void rule__PrintCmd__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2001:1: ( rule__PrintCmd__Group__11__Impl rule__PrintCmd__Group__12 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2002:2: rule__PrintCmd__Group__11__Impl rule__PrintCmd__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__11__Impl_in_rule__PrintCmd__Group__114040);
            rule__PrintCmd__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__12_in_rule__PrintCmd__Group__114043);
            rule__PrintCmd__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__11"


    // $ANTLR start "rule__PrintCmd__Group__11__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2009:1: rule__PrintCmd__Group__11__Impl : ( '=' ) ;
    public final void rule__PrintCmd__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2013:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2014:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2014:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2015:1: '='
            {
             before(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_11()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PrintCmd__Group__11__Impl4071); 
             after(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__11__Impl"


    // $ANTLR start "rule__PrintCmd__Group__12"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2028:1: rule__PrintCmd__Group__12 : rule__PrintCmd__Group__12__Impl rule__PrintCmd__Group__13 ;
    public final void rule__PrintCmd__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2032:1: ( rule__PrintCmd__Group__12__Impl rule__PrintCmd__Group__13 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2033:2: rule__PrintCmd__Group__12__Impl rule__PrintCmd__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__12__Impl_in_rule__PrintCmd__Group__124102);
            rule__PrintCmd__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__13_in_rule__PrintCmd__Group__124105);
            rule__PrintCmd__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__12"


    // $ANTLR start "rule__PrintCmd__Group__12__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2040:1: rule__PrintCmd__Group__12__Impl : ( ( rule__PrintCmd__LineAssignment_12 ) ) ;
    public final void rule__PrintCmd__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2044:1: ( ( ( rule__PrintCmd__LineAssignment_12 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2045:1: ( ( rule__PrintCmd__LineAssignment_12 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2045:1: ( ( rule__PrintCmd__LineAssignment_12 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2046:1: ( rule__PrintCmd__LineAssignment_12 )
            {
             before(grammarAccess.getPrintCmdAccess().getLineAssignment_12()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2047:1: ( rule__PrintCmd__LineAssignment_12 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2047:2: rule__PrintCmd__LineAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__LineAssignment_12_in_rule__PrintCmd__Group__12__Impl4132);
            rule__PrintCmd__LineAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPrintCmdAccess().getLineAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__12__Impl"


    // $ANTLR start "rule__PrintCmd__Group__13"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2057:1: rule__PrintCmd__Group__13 : rule__PrintCmd__Group__13__Impl rule__PrintCmd__Group__14 ;
    public final void rule__PrintCmd__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2061:1: ( rule__PrintCmd__Group__13__Impl rule__PrintCmd__Group__14 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2062:2: rule__PrintCmd__Group__13__Impl rule__PrintCmd__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__13__Impl_in_rule__PrintCmd__Group__134162);
            rule__PrintCmd__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__14_in_rule__PrintCmd__Group__134165);
            rule__PrintCmd__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__13"


    // $ANTLR start "rule__PrintCmd__Group__13__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2069:1: rule__PrintCmd__Group__13__Impl : ( ',' ) ;
    public final void rule__PrintCmd__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2073:1: ( ( ',' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2074:1: ( ',' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2074:1: ( ',' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2075:1: ','
            {
             before(grammarAccess.getPrintCmdAccess().getCommaKeyword_13()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PrintCmd__Group__13__Impl4193); 
             after(grammarAccess.getPrintCmdAccess().getCommaKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__13__Impl"


    // $ANTLR start "rule__PrintCmd__Group__14"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2088:1: rule__PrintCmd__Group__14 : rule__PrintCmd__Group__14__Impl rule__PrintCmd__Group__15 ;
    public final void rule__PrintCmd__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2092:1: ( rule__PrintCmd__Group__14__Impl rule__PrintCmd__Group__15 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2093:2: rule__PrintCmd__Group__14__Impl rule__PrintCmd__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__14__Impl_in_rule__PrintCmd__Group__144224);
            rule__PrintCmd__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__15_in_rule__PrintCmd__Group__144227);
            rule__PrintCmd__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__14"


    // $ANTLR start "rule__PrintCmd__Group__14__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2100:1: rule__PrintCmd__Group__14__Impl : ( 'col' ) ;
    public final void rule__PrintCmd__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2104:1: ( ( 'col' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2105:1: ( 'col' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2105:1: ( 'col' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2106:1: 'col'
            {
             before(grammarAccess.getPrintCmdAccess().getColKeyword_14()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PrintCmd__Group__14__Impl4255); 
             after(grammarAccess.getPrintCmdAccess().getColKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__14__Impl"


    // $ANTLR start "rule__PrintCmd__Group__15"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2119:1: rule__PrintCmd__Group__15 : rule__PrintCmd__Group__15__Impl rule__PrintCmd__Group__16 ;
    public final void rule__PrintCmd__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2123:1: ( rule__PrintCmd__Group__15__Impl rule__PrintCmd__Group__16 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2124:2: rule__PrintCmd__Group__15__Impl rule__PrintCmd__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__15__Impl_in_rule__PrintCmd__Group__154286);
            rule__PrintCmd__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__16_in_rule__PrintCmd__Group__154289);
            rule__PrintCmd__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__15"


    // $ANTLR start "rule__PrintCmd__Group__15__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2131:1: rule__PrintCmd__Group__15__Impl : ( '=' ) ;
    public final void rule__PrintCmd__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2135:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2136:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2136:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2137:1: '='
            {
             before(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_15()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PrintCmd__Group__15__Impl4317); 
             after(grammarAccess.getPrintCmdAccess().getEqualsSignKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__15__Impl"


    // $ANTLR start "rule__PrintCmd__Group__16"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2150:1: rule__PrintCmd__Group__16 : rule__PrintCmd__Group__16__Impl rule__PrintCmd__Group__17 ;
    public final void rule__PrintCmd__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2154:1: ( rule__PrintCmd__Group__16__Impl rule__PrintCmd__Group__17 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2155:2: rule__PrintCmd__Group__16__Impl rule__PrintCmd__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__16__Impl_in_rule__PrintCmd__Group__164348);
            rule__PrintCmd__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__17_in_rule__PrintCmd__Group__164351);
            rule__PrintCmd__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__16"


    // $ANTLR start "rule__PrintCmd__Group__16__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2162:1: rule__PrintCmd__Group__16__Impl : ( ( rule__PrintCmd__ColAssignment_16 ) ) ;
    public final void rule__PrintCmd__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2166:1: ( ( ( rule__PrintCmd__ColAssignment_16 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2167:1: ( ( rule__PrintCmd__ColAssignment_16 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2167:1: ( ( rule__PrintCmd__ColAssignment_16 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2168:1: ( rule__PrintCmd__ColAssignment_16 )
            {
             before(grammarAccess.getPrintCmdAccess().getColAssignment_16()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2169:1: ( rule__PrintCmd__ColAssignment_16 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2169:2: rule__PrintCmd__ColAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__ColAssignment_16_in_rule__PrintCmd__Group__16__Impl4378);
            rule__PrintCmd__ColAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getPrintCmdAccess().getColAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__16__Impl"


    // $ANTLR start "rule__PrintCmd__Group__17"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2179:1: rule__PrintCmd__Group__17 : rule__PrintCmd__Group__17__Impl ;
    public final void rule__PrintCmd__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2183:1: ( rule__PrintCmd__Group__17__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2184:2: rule__PrintCmd__Group__17__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrintCmd__Group__17__Impl_in_rule__PrintCmd__Group__174408);
            rule__PrintCmd__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__17"


    // $ANTLR start "rule__PrintCmd__Group__17__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2190:1: rule__PrintCmd__Group__17__Impl : ( ')' ) ;
    public final void rule__PrintCmd__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2194:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2195:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2195:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2196:1: ')'
            {
             before(grammarAccess.getPrintCmdAccess().getRightParenthesisKeyword_17()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__PrintCmd__Group__17__Impl4436); 
             after(grammarAccess.getPrintCmdAccess().getRightParenthesisKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__Group__17__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2245:1: rule__SetTurnAngleCmd__Group__0 : rule__SetTurnAngleCmd__Group__0__Impl rule__SetTurnAngleCmd__Group__1 ;
    public final void rule__SetTurnAngleCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2249:1: ( rule__SetTurnAngleCmd__Group__0__Impl rule__SetTurnAngleCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2250:2: rule__SetTurnAngleCmd__Group__0__Impl rule__SetTurnAngleCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__0__Impl_in_rule__SetTurnAngleCmd__Group__04503);
            rule__SetTurnAngleCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__1_in_rule__SetTurnAngleCmd__Group__04506);
            rule__SetTurnAngleCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__0"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2257:1: rule__SetTurnAngleCmd__Group__0__Impl : ( 'setTurnAngle' ) ;
    public final void rule__SetTurnAngleCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2261:1: ( ( 'setTurnAngle' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2262:1: ( 'setTurnAngle' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2262:1: ( 'setTurnAngle' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2263:1: 'setTurnAngle'
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getSetTurnAngleKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SetTurnAngleCmd__Group__0__Impl4534); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getSetTurnAngleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__0__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2276:1: rule__SetTurnAngleCmd__Group__1 : rule__SetTurnAngleCmd__Group__1__Impl rule__SetTurnAngleCmd__Group__2 ;
    public final void rule__SetTurnAngleCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2280:1: ( rule__SetTurnAngleCmd__Group__1__Impl rule__SetTurnAngleCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2281:2: rule__SetTurnAngleCmd__Group__1__Impl rule__SetTurnAngleCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__1__Impl_in_rule__SetTurnAngleCmd__Group__14565);
            rule__SetTurnAngleCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__2_in_rule__SetTurnAngleCmd__Group__14568);
            rule__SetTurnAngleCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__1"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2288:1: rule__SetTurnAngleCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__SetTurnAngleCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2292:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2293:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2293:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2294:1: '('
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SetTurnAngleCmd__Group__1__Impl4596); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__1__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2307:1: rule__SetTurnAngleCmd__Group__2 : rule__SetTurnAngleCmd__Group__2__Impl rule__SetTurnAngleCmd__Group__3 ;
    public final void rule__SetTurnAngleCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2311:1: ( rule__SetTurnAngleCmd__Group__2__Impl rule__SetTurnAngleCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2312:2: rule__SetTurnAngleCmd__Group__2__Impl rule__SetTurnAngleCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__2__Impl_in_rule__SetTurnAngleCmd__Group__24627);
            rule__SetTurnAngleCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__3_in_rule__SetTurnAngleCmd__Group__24630);
            rule__SetTurnAngleCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__2"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2319:1: rule__SetTurnAngleCmd__Group__2__Impl : ( 'angle' ) ;
    public final void rule__SetTurnAngleCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2323:1: ( ( 'angle' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2324:1: ( 'angle' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2324:1: ( 'angle' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2325:1: 'angle'
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getAngleKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SetTurnAngleCmd__Group__2__Impl4658); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getAngleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__2__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2338:1: rule__SetTurnAngleCmd__Group__3 : rule__SetTurnAngleCmd__Group__3__Impl rule__SetTurnAngleCmd__Group__4 ;
    public final void rule__SetTurnAngleCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2342:1: ( rule__SetTurnAngleCmd__Group__3__Impl rule__SetTurnAngleCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2343:2: rule__SetTurnAngleCmd__Group__3__Impl rule__SetTurnAngleCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__3__Impl_in_rule__SetTurnAngleCmd__Group__34689);
            rule__SetTurnAngleCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__4_in_rule__SetTurnAngleCmd__Group__34692);
            rule__SetTurnAngleCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__3"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2350:1: rule__SetTurnAngleCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__SetTurnAngleCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2354:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2356:1: '='
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SetTurnAngleCmd__Group__3__Impl4720); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__3__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2369:1: rule__SetTurnAngleCmd__Group__4 : rule__SetTurnAngleCmd__Group__4__Impl rule__SetTurnAngleCmd__Group__5 ;
    public final void rule__SetTurnAngleCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2373:1: ( rule__SetTurnAngleCmd__Group__4__Impl rule__SetTurnAngleCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2374:2: rule__SetTurnAngleCmd__Group__4__Impl rule__SetTurnAngleCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__4__Impl_in_rule__SetTurnAngleCmd__Group__44751);
            rule__SetTurnAngleCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__5_in_rule__SetTurnAngleCmd__Group__44754);
            rule__SetTurnAngleCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__4"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2381:1: rule__SetTurnAngleCmd__Group__4__Impl : ( ( rule__SetTurnAngleCmd__AngleAssignment_4 ) ) ;
    public final void rule__SetTurnAngleCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2385:1: ( ( ( rule__SetTurnAngleCmd__AngleAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2386:1: ( ( rule__SetTurnAngleCmd__AngleAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2386:1: ( ( rule__SetTurnAngleCmd__AngleAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2387:1: ( rule__SetTurnAngleCmd__AngleAssignment_4 )
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getAngleAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2388:1: ( rule__SetTurnAngleCmd__AngleAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2388:2: rule__SetTurnAngleCmd__AngleAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__AngleAssignment_4_in_rule__SetTurnAngleCmd__Group__4__Impl4781);
            rule__SetTurnAngleCmd__AngleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetTurnAngleCmdAccess().getAngleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__4__Impl"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2398:1: rule__SetTurnAngleCmd__Group__5 : rule__SetTurnAngleCmd__Group__5__Impl ;
    public final void rule__SetTurnAngleCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2402:1: ( rule__SetTurnAngleCmd__Group__5__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2403:2: rule__SetTurnAngleCmd__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetTurnAngleCmd__Group__5__Impl_in_rule__SetTurnAngleCmd__Group__54811);
            rule__SetTurnAngleCmd__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__5"


    // $ANTLR start "rule__SetTurnAngleCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2409:1: rule__SetTurnAngleCmd__Group__5__Impl : ( ')' ) ;
    public final void rule__SetTurnAngleCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2413:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2414:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2414:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2415:1: ')'
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__SetTurnAngleCmd__Group__5__Impl4839); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__Group__5__Impl"


    // $ANTLR start "rule__StopEngineCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2440:1: rule__StopEngineCmd__Group__0 : rule__StopEngineCmd__Group__0__Impl rule__StopEngineCmd__Group__1 ;
    public final void rule__StopEngineCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2444:1: ( rule__StopEngineCmd__Group__0__Impl rule__StopEngineCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2445:2: rule__StopEngineCmd__Group__0__Impl rule__StopEngineCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopEngineCmd__Group__0__Impl_in_rule__StopEngineCmd__Group__04882);
            rule__StopEngineCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StopEngineCmd__Group__1_in_rule__StopEngineCmd__Group__04885);
            rule__StopEngineCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopEngineCmd__Group__0"


    // $ANTLR start "rule__StopEngineCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2452:1: rule__StopEngineCmd__Group__0__Impl : ( () ) ;
    public final void rule__StopEngineCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2456:1: ( ( () ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2457:1: ( () )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2457:1: ( () )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2458:1: ()
            {
             before(grammarAccess.getStopEngineCmdAccess().getStopEngineCmdAction_0()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2459:1: ()
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2461:1: 
            {
            }

             after(grammarAccess.getStopEngineCmdAccess().getStopEngineCmdAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopEngineCmd__Group__0__Impl"


    // $ANTLR start "rule__StopEngineCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2471:1: rule__StopEngineCmd__Group__1 : rule__StopEngineCmd__Group__1__Impl ;
    public final void rule__StopEngineCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2475:1: ( rule__StopEngineCmd__Group__1__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2476:2: rule__StopEngineCmd__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopEngineCmd__Group__1__Impl_in_rule__StopEngineCmd__Group__14943);
            rule__StopEngineCmd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopEngineCmd__Group__1"


    // $ANTLR start "rule__StopEngineCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2482:1: rule__StopEngineCmd__Group__1__Impl : ( 'stopEngine' ) ;
    public final void rule__StopEngineCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2486:1: ( ( 'stopEngine' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2487:1: ( 'stopEngine' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2487:1: ( 'stopEngine' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2488:1: 'stopEngine'
            {
             before(grammarAccess.getStopEngineCmdAccess().getStopEngineKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__StopEngineCmd__Group__1__Impl4971); 
             after(grammarAccess.getStopEngineCmdAccess().getStopEngineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopEngineCmd__Group__1__Impl"


    // $ANTLR start "rule__StopProgramCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2505:1: rule__StopProgramCmd__Group__0 : rule__StopProgramCmd__Group__0__Impl rule__StopProgramCmd__Group__1 ;
    public final void rule__StopProgramCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2509:1: ( rule__StopProgramCmd__Group__0__Impl rule__StopProgramCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2510:2: rule__StopProgramCmd__Group__0__Impl rule__StopProgramCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopProgramCmd__Group__0__Impl_in_rule__StopProgramCmd__Group__05006);
            rule__StopProgramCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StopProgramCmd__Group__1_in_rule__StopProgramCmd__Group__05009);
            rule__StopProgramCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopProgramCmd__Group__0"


    // $ANTLR start "rule__StopProgramCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2517:1: rule__StopProgramCmd__Group__0__Impl : ( () ) ;
    public final void rule__StopProgramCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2521:1: ( ( () ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2522:1: ( () )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2522:1: ( () )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2523:1: ()
            {
             before(grammarAccess.getStopProgramCmdAccess().getStopProgramCmdAction_0()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2524:1: ()
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2526:1: 
            {
            }

             after(grammarAccess.getStopProgramCmdAccess().getStopProgramCmdAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopProgramCmd__Group__0__Impl"


    // $ANTLR start "rule__StopProgramCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2536:1: rule__StopProgramCmd__Group__1 : rule__StopProgramCmd__Group__1__Impl ;
    public final void rule__StopProgramCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2540:1: ( rule__StopProgramCmd__Group__1__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2541:2: rule__StopProgramCmd__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StopProgramCmd__Group__1__Impl_in_rule__StopProgramCmd__Group__15067);
            rule__StopProgramCmd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopProgramCmd__Group__1"


    // $ANTLR start "rule__StopProgramCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2547:1: rule__StopProgramCmd__Group__1__Impl : ( 'stopProgram' ) ;
    public final void rule__StopProgramCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2551:1: ( ( 'stopProgram' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2552:1: ( 'stopProgram' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2552:1: ( 'stopProgram' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2553:1: 'stopProgram'
            {
             before(grammarAccess.getStopProgramCmdAccess().getStopProgramKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__StopProgramCmd__Group__1__Impl5095); 
             after(grammarAccess.getStopProgramCmdAccess().getStopProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopProgramCmd__Group__1__Impl"


    // $ANTLR start "rule__TurnCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2570:1: rule__TurnCmd__Group__0 : rule__TurnCmd__Group__0__Impl rule__TurnCmd__Group__1 ;
    public final void rule__TurnCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2574:1: ( rule__TurnCmd__Group__0__Impl rule__TurnCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2575:2: rule__TurnCmd__Group__0__Impl rule__TurnCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__0__Impl_in_rule__TurnCmd__Group__05130);
            rule__TurnCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__1_in_rule__TurnCmd__Group__05133);
            rule__TurnCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__0"


    // $ANTLR start "rule__TurnCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2582:1: rule__TurnCmd__Group__0__Impl : ( 'turn' ) ;
    public final void rule__TurnCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2586:1: ( ( 'turn' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2587:1: ( 'turn' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2587:1: ( 'turn' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2588:1: 'turn'
            {
             before(grammarAccess.getTurnCmdAccess().getTurnKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TurnCmd__Group__0__Impl5161); 
             after(grammarAccess.getTurnCmdAccess().getTurnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__0__Impl"


    // $ANTLR start "rule__TurnCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2601:1: rule__TurnCmd__Group__1 : rule__TurnCmd__Group__1__Impl rule__TurnCmd__Group__2 ;
    public final void rule__TurnCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2605:1: ( rule__TurnCmd__Group__1__Impl rule__TurnCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2606:2: rule__TurnCmd__Group__1__Impl rule__TurnCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__1__Impl_in_rule__TurnCmd__Group__15192);
            rule__TurnCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__2_in_rule__TurnCmd__Group__15195);
            rule__TurnCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__1"


    // $ANTLR start "rule__TurnCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2613:1: rule__TurnCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__TurnCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2617:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2618:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2618:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2619:1: '('
            {
             before(grammarAccess.getTurnCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TurnCmd__Group__1__Impl5223); 
             after(grammarAccess.getTurnCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__1__Impl"


    // $ANTLR start "rule__TurnCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2632:1: rule__TurnCmd__Group__2 : rule__TurnCmd__Group__2__Impl rule__TurnCmd__Group__3 ;
    public final void rule__TurnCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2636:1: ( rule__TurnCmd__Group__2__Impl rule__TurnCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2637:2: rule__TurnCmd__Group__2__Impl rule__TurnCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__2__Impl_in_rule__TurnCmd__Group__25254);
            rule__TurnCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__3_in_rule__TurnCmd__Group__25257);
            rule__TurnCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__2"


    // $ANTLR start "rule__TurnCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2644:1: rule__TurnCmd__Group__2__Impl : ( 'power' ) ;
    public final void rule__TurnCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2648:1: ( ( 'power' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2649:1: ( 'power' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2649:1: ( 'power' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2650:1: 'power'
            {
             before(grammarAccess.getTurnCmdAccess().getPowerKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TurnCmd__Group__2__Impl5285); 
             after(grammarAccess.getTurnCmdAccess().getPowerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__2__Impl"


    // $ANTLR start "rule__TurnCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2663:1: rule__TurnCmd__Group__3 : rule__TurnCmd__Group__3__Impl rule__TurnCmd__Group__4 ;
    public final void rule__TurnCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2667:1: ( rule__TurnCmd__Group__3__Impl rule__TurnCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2668:2: rule__TurnCmd__Group__3__Impl rule__TurnCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__3__Impl_in_rule__TurnCmd__Group__35316);
            rule__TurnCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__4_in_rule__TurnCmd__Group__35319);
            rule__TurnCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__3"


    // $ANTLR start "rule__TurnCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2675:1: rule__TurnCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__TurnCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2679:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2680:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2680:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2681:1: '='
            {
             before(grammarAccess.getTurnCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TurnCmd__Group__3__Impl5347); 
             after(grammarAccess.getTurnCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__3__Impl"


    // $ANTLR start "rule__TurnCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2694:1: rule__TurnCmd__Group__4 : rule__TurnCmd__Group__4__Impl rule__TurnCmd__Group__5 ;
    public final void rule__TurnCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2698:1: ( rule__TurnCmd__Group__4__Impl rule__TurnCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2699:2: rule__TurnCmd__Group__4__Impl rule__TurnCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__4__Impl_in_rule__TurnCmd__Group__45378);
            rule__TurnCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__5_in_rule__TurnCmd__Group__45381);
            rule__TurnCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__4"


    // $ANTLR start "rule__TurnCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2706:1: rule__TurnCmd__Group__4__Impl : ( ( rule__TurnCmd__PowerAssignment_4 ) ) ;
    public final void rule__TurnCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2710:1: ( ( ( rule__TurnCmd__PowerAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2711:1: ( ( rule__TurnCmd__PowerAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2711:1: ( ( rule__TurnCmd__PowerAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2712:1: ( rule__TurnCmd__PowerAssignment_4 )
            {
             before(grammarAccess.getTurnCmdAccess().getPowerAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2713:1: ( rule__TurnCmd__PowerAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2713:2: rule__TurnCmd__PowerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__PowerAssignment_4_in_rule__TurnCmd__Group__4__Impl5408);
            rule__TurnCmd__PowerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTurnCmdAccess().getPowerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__4__Impl"


    // $ANTLR start "rule__TurnCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2723:1: rule__TurnCmd__Group__5 : rule__TurnCmd__Group__5__Impl rule__TurnCmd__Group__6 ;
    public final void rule__TurnCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2727:1: ( rule__TurnCmd__Group__5__Impl rule__TurnCmd__Group__6 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2728:2: rule__TurnCmd__Group__5__Impl rule__TurnCmd__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__5__Impl_in_rule__TurnCmd__Group__55438);
            rule__TurnCmd__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__6_in_rule__TurnCmd__Group__55441);
            rule__TurnCmd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__5"


    // $ANTLR start "rule__TurnCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2735:1: rule__TurnCmd__Group__5__Impl : ( ',' ) ;
    public final void rule__TurnCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2739:1: ( ( ',' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2740:1: ( ',' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2740:1: ( ',' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2741:1: ','
            {
             before(grammarAccess.getTurnCmdAccess().getCommaKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TurnCmd__Group__5__Impl5469); 
             after(grammarAccess.getTurnCmdAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__5__Impl"


    // $ANTLR start "rule__TurnCmd__Group__6"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2754:1: rule__TurnCmd__Group__6 : rule__TurnCmd__Group__6__Impl rule__TurnCmd__Group__7 ;
    public final void rule__TurnCmd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2758:1: ( rule__TurnCmd__Group__6__Impl rule__TurnCmd__Group__7 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2759:2: rule__TurnCmd__Group__6__Impl rule__TurnCmd__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__6__Impl_in_rule__TurnCmd__Group__65500);
            rule__TurnCmd__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__7_in_rule__TurnCmd__Group__65503);
            rule__TurnCmd__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__6"


    // $ANTLR start "rule__TurnCmd__Group__6__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2766:1: rule__TurnCmd__Group__6__Impl : ( 'angle' ) ;
    public final void rule__TurnCmd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2770:1: ( ( 'angle' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2771:1: ( 'angle' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2771:1: ( 'angle' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2772:1: 'angle'
            {
             before(grammarAccess.getTurnCmdAccess().getAngleKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TurnCmd__Group__6__Impl5531); 
             after(grammarAccess.getTurnCmdAccess().getAngleKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__6__Impl"


    // $ANTLR start "rule__TurnCmd__Group__7"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2785:1: rule__TurnCmd__Group__7 : rule__TurnCmd__Group__7__Impl rule__TurnCmd__Group__8 ;
    public final void rule__TurnCmd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2789:1: ( rule__TurnCmd__Group__7__Impl rule__TurnCmd__Group__8 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2790:2: rule__TurnCmd__Group__7__Impl rule__TurnCmd__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__7__Impl_in_rule__TurnCmd__Group__75562);
            rule__TurnCmd__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__8_in_rule__TurnCmd__Group__75565);
            rule__TurnCmd__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__7"


    // $ANTLR start "rule__TurnCmd__Group__7__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2797:1: rule__TurnCmd__Group__7__Impl : ( '=' ) ;
    public final void rule__TurnCmd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2801:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2802:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2802:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2803:1: '='
            {
             before(grammarAccess.getTurnCmdAccess().getEqualsSignKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TurnCmd__Group__7__Impl5593); 
             after(grammarAccess.getTurnCmdAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__7__Impl"


    // $ANTLR start "rule__TurnCmd__Group__8"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2816:1: rule__TurnCmd__Group__8 : rule__TurnCmd__Group__8__Impl rule__TurnCmd__Group__9 ;
    public final void rule__TurnCmd__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2820:1: ( rule__TurnCmd__Group__8__Impl rule__TurnCmd__Group__9 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2821:2: rule__TurnCmd__Group__8__Impl rule__TurnCmd__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__8__Impl_in_rule__TurnCmd__Group__85624);
            rule__TurnCmd__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__9_in_rule__TurnCmd__Group__85627);
            rule__TurnCmd__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__8"


    // $ANTLR start "rule__TurnCmd__Group__8__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2828:1: rule__TurnCmd__Group__8__Impl : ( ( rule__TurnCmd__AngleAssignment_8 ) ) ;
    public final void rule__TurnCmd__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2832:1: ( ( ( rule__TurnCmd__AngleAssignment_8 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2833:1: ( ( rule__TurnCmd__AngleAssignment_8 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2833:1: ( ( rule__TurnCmd__AngleAssignment_8 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2834:1: ( rule__TurnCmd__AngleAssignment_8 )
            {
             before(grammarAccess.getTurnCmdAccess().getAngleAssignment_8()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2835:1: ( rule__TurnCmd__AngleAssignment_8 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2835:2: rule__TurnCmd__AngleAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__AngleAssignment_8_in_rule__TurnCmd__Group__8__Impl5654);
            rule__TurnCmd__AngleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTurnCmdAccess().getAngleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__8__Impl"


    // $ANTLR start "rule__TurnCmd__Group__9"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2845:1: rule__TurnCmd__Group__9 : rule__TurnCmd__Group__9__Impl ;
    public final void rule__TurnCmd__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2849:1: ( rule__TurnCmd__Group__9__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2850:2: rule__TurnCmd__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TurnCmd__Group__9__Impl_in_rule__TurnCmd__Group__95684);
            rule__TurnCmd__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__9"


    // $ANTLR start "rule__TurnCmd__Group__9__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2856:1: rule__TurnCmd__Group__9__Impl : ( ')' ) ;
    public final void rule__TurnCmd__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2860:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2861:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2861:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2862:1: ')'
            {
             before(grammarAccess.getTurnCmdAccess().getRightParenthesisKeyword_9()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TurnCmd__Group__9__Impl5712); 
             after(grammarAccess.getTurnCmdAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__Group__9__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__0"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2895:1: rule__ObstacleCmd__Group__0 : rule__ObstacleCmd__Group__0__Impl rule__ObstacleCmd__Group__1 ;
    public final void rule__ObstacleCmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2899:1: ( rule__ObstacleCmd__Group__0__Impl rule__ObstacleCmd__Group__1 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2900:2: rule__ObstacleCmd__Group__0__Impl rule__ObstacleCmd__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__0__Impl_in_rule__ObstacleCmd__Group__05763);
            rule__ObstacleCmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__1_in_rule__ObstacleCmd__Group__05766);
            rule__ObstacleCmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__0"


    // $ANTLR start "rule__ObstacleCmd__Group__0__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2907:1: rule__ObstacleCmd__Group__0__Impl : ( 'obstacle' ) ;
    public final void rule__ObstacleCmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2911:1: ( ( 'obstacle' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2912:1: ( 'obstacle' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2912:1: ( 'obstacle' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2913:1: 'obstacle'
            {
             before(grammarAccess.getObstacleCmdAccess().getObstacleKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ObstacleCmd__Group__0__Impl5794); 
             after(grammarAccess.getObstacleCmdAccess().getObstacleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__0__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2926:1: rule__ObstacleCmd__Group__1 : rule__ObstacleCmd__Group__1__Impl rule__ObstacleCmd__Group__2 ;
    public final void rule__ObstacleCmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2930:1: ( rule__ObstacleCmd__Group__1__Impl rule__ObstacleCmd__Group__2 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2931:2: rule__ObstacleCmd__Group__1__Impl rule__ObstacleCmd__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__1__Impl_in_rule__ObstacleCmd__Group__15825);
            rule__ObstacleCmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__2_in_rule__ObstacleCmd__Group__15828);
            rule__ObstacleCmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__1"


    // $ANTLR start "rule__ObstacleCmd__Group__1__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2938:1: rule__ObstacleCmd__Group__1__Impl : ( '(' ) ;
    public final void rule__ObstacleCmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2942:1: ( ( '(' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2943:1: ( '(' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2943:1: ( '(' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2944:1: '('
            {
             before(grammarAccess.getObstacleCmdAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ObstacleCmd__Group__1__Impl5856); 
             after(grammarAccess.getObstacleCmdAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__1__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2957:1: rule__ObstacleCmd__Group__2 : rule__ObstacleCmd__Group__2__Impl rule__ObstacleCmd__Group__3 ;
    public final void rule__ObstacleCmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2961:1: ( rule__ObstacleCmd__Group__2__Impl rule__ObstacleCmd__Group__3 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2962:2: rule__ObstacleCmd__Group__2__Impl rule__ObstacleCmd__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__2__Impl_in_rule__ObstacleCmd__Group__25887);
            rule__ObstacleCmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__3_in_rule__ObstacleCmd__Group__25890);
            rule__ObstacleCmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__2"


    // $ANTLR start "rule__ObstacleCmd__Group__2__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2969:1: rule__ObstacleCmd__Group__2__Impl : ( 'distance' ) ;
    public final void rule__ObstacleCmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2973:1: ( ( 'distance' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2974:1: ( 'distance' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2974:1: ( 'distance' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2975:1: 'distance'
            {
             before(grammarAccess.getObstacleCmdAccess().getDistanceKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ObstacleCmd__Group__2__Impl5918); 
             after(grammarAccess.getObstacleCmdAccess().getDistanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__2__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2988:1: rule__ObstacleCmd__Group__3 : rule__ObstacleCmd__Group__3__Impl rule__ObstacleCmd__Group__4 ;
    public final void rule__ObstacleCmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2992:1: ( rule__ObstacleCmd__Group__3__Impl rule__ObstacleCmd__Group__4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:2993:2: rule__ObstacleCmd__Group__3__Impl rule__ObstacleCmd__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__3__Impl_in_rule__ObstacleCmd__Group__35949);
            rule__ObstacleCmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__4_in_rule__ObstacleCmd__Group__35952);
            rule__ObstacleCmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__3"


    // $ANTLR start "rule__ObstacleCmd__Group__3__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3000:1: rule__ObstacleCmd__Group__3__Impl : ( '=' ) ;
    public final void rule__ObstacleCmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3004:1: ( ( '=' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3005:1: ( '=' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3005:1: ( '=' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3006:1: '='
            {
             before(grammarAccess.getObstacleCmdAccess().getEqualsSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ObstacleCmd__Group__3__Impl5980); 
             after(grammarAccess.getObstacleCmdAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__3__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3019:1: rule__ObstacleCmd__Group__4 : rule__ObstacleCmd__Group__4__Impl rule__ObstacleCmd__Group__5 ;
    public final void rule__ObstacleCmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3023:1: ( rule__ObstacleCmd__Group__4__Impl rule__ObstacleCmd__Group__5 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3024:2: rule__ObstacleCmd__Group__4__Impl rule__ObstacleCmd__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__4__Impl_in_rule__ObstacleCmd__Group__46011);
            rule__ObstacleCmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__5_in_rule__ObstacleCmd__Group__46014);
            rule__ObstacleCmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__4"


    // $ANTLR start "rule__ObstacleCmd__Group__4__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3031:1: rule__ObstacleCmd__Group__4__Impl : ( ( rule__ObstacleCmd__DistanceAssignment_4 ) ) ;
    public final void rule__ObstacleCmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3035:1: ( ( ( rule__ObstacleCmd__DistanceAssignment_4 ) ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3036:1: ( ( rule__ObstacleCmd__DistanceAssignment_4 ) )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3036:1: ( ( rule__ObstacleCmd__DistanceAssignment_4 ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3037:1: ( rule__ObstacleCmd__DistanceAssignment_4 )
            {
             before(grammarAccess.getObstacleCmdAccess().getDistanceAssignment_4()); 
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3038:1: ( rule__ObstacleCmd__DistanceAssignment_4 )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3038:2: rule__ObstacleCmd__DistanceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__DistanceAssignment_4_in_rule__ObstacleCmd__Group__4__Impl6041);
            rule__ObstacleCmd__DistanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObstacleCmdAccess().getDistanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__4__Impl"


    // $ANTLR start "rule__ObstacleCmd__Group__5"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3048:1: rule__ObstacleCmd__Group__5 : rule__ObstacleCmd__Group__5__Impl ;
    public final void rule__ObstacleCmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3052:1: ( rule__ObstacleCmd__Group__5__Impl )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3053:2: rule__ObstacleCmd__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObstacleCmd__Group__5__Impl_in_rule__ObstacleCmd__Group__56071);
            rule__ObstacleCmd__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__5"


    // $ANTLR start "rule__ObstacleCmd__Group__5__Impl"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3059:1: rule__ObstacleCmd__Group__5__Impl : ( ')' ) ;
    public final void rule__ObstacleCmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3063:1: ( ( ')' ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3064:1: ( ')' )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3064:1: ( ')' )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3065:1: ')'
            {
             before(grammarAccess.getObstacleCmdAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObstacleCmd__Group__5__Impl6099); 
             after(grammarAccess.getObstacleCmdAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__Group__5__Impl"


    // $ANTLR start "rule__ProgramUnit__BlockAssignment"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3091:1: rule__ProgramUnit__BlockAssignment : ( ruleExpression ) ;
    public final void rule__ProgramUnit__BlockAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3095:1: ( ( ruleExpression ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3096:1: ( ruleExpression )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3096:1: ( ruleExpression )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3097:1: ruleExpression
            {
             before(grammarAccess.getProgramUnitAccess().getBlockExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ProgramUnit__BlockAssignment6147);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramUnitAccess().getBlockExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramUnit__BlockAssignment"


    // $ANTLR start "rule__WhileLoop__LoopCondAssignment_1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3106:1: rule__WhileLoop__LoopCondAssignment_1 : ( ruleBoolExp ) ;
    public final void rule__WhileLoop__LoopCondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3110:1: ( ( ruleBoolExp ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3111:1: ( ruleBoolExp )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3111:1: ( ruleBoolExp )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3112:1: ruleBoolExp
            {
             before(grammarAccess.getWhileLoopAccess().getLoopCondBoolExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_rule__WhileLoop__LoopCondAssignment_16178);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getLoopCondBoolExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopCondAssignment_1"


    // $ANTLR start "rule__WhileLoop__BlockAssignment_3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3121:1: rule__WhileLoop__BlockAssignment_3 : ( ruleExpression ) ;
    public final void rule__WhileLoop__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3125:1: ( ( ruleExpression ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3126:1: ( ruleExpression )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3126:1: ( ruleExpression )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3127:1: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getBlockExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__WhileLoop__BlockAssignment_36209);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getBlockExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__BlockAssignment_3"


    // $ANTLR start "rule__NegExp__ExpAssignment_1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3136:1: rule__NegExp__ExpAssignment_1 : ( ruleBoolExp ) ;
    public final void rule__NegExp__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3140:1: ( ( ruleBoolExp ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3141:1: ( ruleBoolExp )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3141:1: ( ruleBoolExp )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3142:1: ruleBoolExp
            {
             before(grammarAccess.getNegExpAccess().getExpBoolExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_rule__NegExp__ExpAssignment_16240);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getNegExpAccess().getExpBoolExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExp__ExpAssignment_1"


    // $ANTLR start "rule__AndExp__LeftExpAssignment_1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3151:1: rule__AndExp__LeftExpAssignment_1 : ( ruleBoolExp ) ;
    public final void rule__AndExp__LeftExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3155:1: ( ( ruleBoolExp ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3156:1: ( ruleBoolExp )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3156:1: ( ruleBoolExp )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3157:1: ruleBoolExp
            {
             before(grammarAccess.getAndExpAccess().getLeftExpBoolExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_rule__AndExp__LeftExpAssignment_16271);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getAndExpAccess().getLeftExpBoolExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__LeftExpAssignment_1"


    // $ANTLR start "rule__AndExp__RightExpAssignment_2"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3166:1: rule__AndExp__RightExpAssignment_2 : ( ruleBoolExp ) ;
    public final void rule__AndExp__RightExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3170:1: ( ( ruleBoolExp ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3171:1: ( ruleBoolExp )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3171:1: ( ruleBoolExp )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3172:1: ruleBoolExp
            {
             before(grammarAccess.getAndExpAccess().getRightExpBoolExpParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_rule__AndExp__RightExpAssignment_26302);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getAndExpAccess().getRightExpBoolExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__RightExpAssignment_2"


    // $ANTLR start "rule__IfBlock__ConditionAssignment_1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3181:1: rule__IfBlock__ConditionAssignment_1 : ( ruleBoolExp ) ;
    public final void rule__IfBlock__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3185:1: ( ( ruleBoolExp ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3186:1: ( ruleBoolExp )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3186:1: ( ruleBoolExp )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3187:1: ruleBoolExp
            {
             before(grammarAccess.getIfBlockAccess().getConditionBoolExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolExp_in_rule__IfBlock__ConditionAssignment_16333);
            ruleBoolExp();

            state._fsp--;

             after(grammarAccess.getIfBlockAccess().getConditionBoolExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__ConditionAssignment_1"


    // $ANTLR start "rule__IfBlock__ThenBlockAssignment_3"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3196:1: rule__IfBlock__ThenBlockAssignment_3 : ( ruleExpression ) ;
    public final void rule__IfBlock__ThenBlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3200:1: ( ( ruleExpression ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3201:1: ( ruleExpression )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3201:1: ( ruleExpression )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3202:1: ruleExpression
            {
             before(grammarAccess.getIfBlockAccess().getThenBlockExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__IfBlock__ThenBlockAssignment_36364);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfBlockAccess().getThenBlockExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__ThenBlockAssignment_3"


    // $ANTLR start "rule__IfBlock__ElseBlockAssignment_4_1"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3211:1: rule__IfBlock__ElseBlockAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__IfBlock__ElseBlockAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3215:1: ( ( ruleExpression ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3216:1: ( ruleExpression )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3216:1: ( ruleExpression )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3217:1: ruleExpression
            {
             before(grammarAccess.getIfBlockAccess().getElseBlockExpressionParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__IfBlock__ElseBlockAssignment_4_16395);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfBlockAccess().getElseBlockExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfBlock__ElseBlockAssignment_4_1"


    // $ANTLR start "rule__HasTurnedCmd__AngleAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3229:1: rule__HasTurnedCmd__AngleAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__HasTurnedCmd__AngleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3233:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3234:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3234:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3235:1: RULE_DOUBLE
            {
             before(grammarAccess.getHasTurnedCmdAccess().getAngleDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__HasTurnedCmd__AngleAssignment_46429); 
             after(grammarAccess.getHasTurnedCmdAccess().getAngleDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasTurnedCmd__AngleAssignment_4"


    // $ANTLR start "rule__MoveCmd__PowerAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3244:1: rule__MoveCmd__PowerAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__MoveCmd__PowerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3248:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3249:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3249:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3250:1: RULE_DOUBLE
            {
             before(grammarAccess.getMoveCmdAccess().getPowerDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__MoveCmd__PowerAssignment_46460); 
             after(grammarAccess.getMoveCmdAccess().getPowerDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveCmd__PowerAssignment_4"


    // $ANTLR start "rule__PrintCmd__MsgAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3259:1: rule__PrintCmd__MsgAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PrintCmd__MsgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3263:1: ( ( RULE_STRING ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3264:1: ( RULE_STRING )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3264:1: ( RULE_STRING )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3265:1: RULE_STRING
            {
             before(grammarAccess.getPrintCmdAccess().getMsgSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PrintCmd__MsgAssignment_46491); 
             after(grammarAccess.getPrintCmdAccess().getMsgSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__MsgAssignment_4"


    // $ANTLR start "rule__PrintCmd__DurationAssignment_8"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3274:1: rule__PrintCmd__DurationAssignment_8 : ( RULE_INT ) ;
    public final void rule__PrintCmd__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3278:1: ( ( RULE_INT ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3279:1: ( RULE_INT )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3279:1: ( RULE_INT )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3280:1: RULE_INT
            {
             before(grammarAccess.getPrintCmdAccess().getDurationINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrintCmd__DurationAssignment_86522); 
             after(grammarAccess.getPrintCmdAccess().getDurationINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__DurationAssignment_8"


    // $ANTLR start "rule__PrintCmd__LineAssignment_12"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3289:1: rule__PrintCmd__LineAssignment_12 : ( RULE_INT ) ;
    public final void rule__PrintCmd__LineAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3293:1: ( ( RULE_INT ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3294:1: ( RULE_INT )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3294:1: ( RULE_INT )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3295:1: RULE_INT
            {
             before(grammarAccess.getPrintCmdAccess().getLineINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrintCmd__LineAssignment_126553); 
             after(grammarAccess.getPrintCmdAccess().getLineINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__LineAssignment_12"


    // $ANTLR start "rule__PrintCmd__ColAssignment_16"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3304:1: rule__PrintCmd__ColAssignment_16 : ( RULE_INT ) ;
    public final void rule__PrintCmd__ColAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3308:1: ( ( RULE_INT ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3309:1: ( RULE_INT )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3309:1: ( RULE_INT )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3310:1: RULE_INT
            {
             before(grammarAccess.getPrintCmdAccess().getColINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrintCmd__ColAssignment_166584); 
             after(grammarAccess.getPrintCmdAccess().getColINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintCmd__ColAssignment_16"


    // $ANTLR start "rule__SetTurnAngleCmd__AngleAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3319:1: rule__SetTurnAngleCmd__AngleAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__SetTurnAngleCmd__AngleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3323:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3324:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3324:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3325:1: RULE_DOUBLE
            {
             before(grammarAccess.getSetTurnAngleCmdAccess().getAngleDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__SetTurnAngleCmd__AngleAssignment_46615); 
             after(grammarAccess.getSetTurnAngleCmdAccess().getAngleDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTurnAngleCmd__AngleAssignment_4"


    // $ANTLR start "rule__TurnCmd__PowerAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3334:1: rule__TurnCmd__PowerAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__TurnCmd__PowerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3338:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3339:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3339:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3340:1: RULE_DOUBLE
            {
             before(grammarAccess.getTurnCmdAccess().getPowerDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__TurnCmd__PowerAssignment_46646); 
             after(grammarAccess.getTurnCmdAccess().getPowerDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__PowerAssignment_4"


    // $ANTLR start "rule__TurnCmd__AngleAssignment_8"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3349:1: rule__TurnCmd__AngleAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__TurnCmd__AngleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3353:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3354:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3354:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3355:1: RULE_DOUBLE
            {
             before(grammarAccess.getTurnCmdAccess().getAngleDOUBLETerminalRuleCall_8_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__TurnCmd__AngleAssignment_86677); 
             after(grammarAccess.getTurnCmdAccess().getAngleDOUBLETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCmd__AngleAssignment_8"


    // $ANTLR start "rule__ObstacleCmd__DistanceAssignment_4"
    // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3364:1: rule__ObstacleCmd__DistanceAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__ObstacleCmd__DistanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3368:1: ( ( RULE_DOUBLE ) )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3369:1: ( RULE_DOUBLE )
            {
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3369:1: ( RULE_DOUBLE )
            // ../lego.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalLego.g:3370:1: RULE_DOUBLE
            {
             before(grammarAccess.getObstacleCmdAccess().getDistanceDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__ObstacleCmd__DistanceAssignment_46708); 
             after(grammarAccess.getObstacleCmdAccess().getDistanceDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleCmd__DistanceAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProgramUnit_in_entryRuleProgramUnit61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProgramUnit68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProgramUnit__BlockAssignment_in_ruleProgramUnit94 = new BitSet(new long[]{0x0000007C14272002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_entryRuleBoolExp182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExp189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolExp__Alternatives_in_ruleBoolExp215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__0_in_ruleWhileLoop275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExp_in_entryRuleNegExp302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExp309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExp__Group__0_in_ruleNegExp335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExp369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__0_in_ruleIfBlock455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommand489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasTurnedCmd_in_entryRuleHasTurnedCmd544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHasTurnedCmd551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__0_in_ruleHasTurnedCmd577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveCmd_in_entryRuleMoveCmd604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveCmd611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__0_in_ruleMoveCmd637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrintCmd_in_entryRulePrintCmd664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrintCmd671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__0_in_rulePrintCmd697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetTurnAngleCmd_in_entryRuleSetTurnAngleCmd724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetTurnAngleCmd731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__0_in_ruleSetTurnAngleCmd757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopEngineCmd_in_entryRuleStopEngineCmd784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStopEngineCmd791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopEngineCmd__Group__0_in_ruleStopEngineCmd817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopProgramCmd_in_entryRuleStopProgramCmd844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStopProgramCmd851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopProgramCmd__Group__0_in_ruleStopProgramCmd877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTurnCmd_in_entryRuleTurnCmd904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTurnCmd911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__0_in_ruleTurnCmd937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObstacleCmd_in_entryRuleObstacleCmd964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObstacleCmd971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__0_in_ruleObstacleCmd997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BOOLEAN_LITERAL__Alternatives_in_ruleBOOLEAN_LITERAL1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_rule__Expression__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExp_in_rule__Expression__Alternatives1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExp_in_rule__Expression__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfBlock_in_rule__Expression__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommand_in_rule__Expression__Alternatives1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExp_in_rule__BoolExp__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExp_in_rule__BoolExp__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasTurnedCmd_in_rule__BoolExp__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObstacleCmd_in_rule__BoolExp__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveCmd_in_rule__Command__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrintCmd_in_rule__Command__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetTurnAngleCmd_in_rule__Command__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopEngineCmd_in_rule__Command__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopProgramCmd_in_rule__Command__Alternatives1344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTurnCmd_in_rule__Command__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasTurnedCmd_in_rule__Command__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObstacleCmd_in_rule__Command__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BOOLEAN_LITERAL__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BOOLEAN_LITERAL__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__0__Impl_in_rule__WhileLoop__Group__01480 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__1_in_rule__WhileLoop__Group__01483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__WhileLoop__Group__0__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__1__Impl_in_rule__WhileLoop__Group__11542 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__2_in_rule__WhileLoop__Group__11545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__LoopCondAssignment_1_in_rule__WhileLoop__Group__1__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__2__Impl_in_rule__WhileLoop__Group__21602 = new BitSet(new long[]{0x0000007C1427A000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__3_in_rule__WhileLoop__Group__21605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WhileLoop__Group__2__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__3__Impl_in_rule__WhileLoop__Group__31664 = new BitSet(new long[]{0x0000007C1427A000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__4_in_rule__WhileLoop__Group__31667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__BlockAssignment_3_in_rule__WhileLoop__Group__3__Impl1694 = new BitSet(new long[]{0x0000007C14272002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__4__Impl_in_rule__WhileLoop__Group__41725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__WhileLoop__Group__4__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExp__Group__0__Impl_in_rule__NegExp__Group__01794 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__NegExp__Group__1_in_rule__NegExp__Group__01797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__NegExp__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExp__Group__1__Impl_in_rule__NegExp__Group__11856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExp__ExpAssignment_1_in_rule__NegExp__Group__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__01917 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AndExp__Group__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__11979 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__AndExp__Group__2_in_rule__AndExp__Group__11982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__LeftExpAssignment_1_in_rule__AndExp__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__Group__2__Impl_in_rule__AndExp__Group__22039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExp__RightExpAssignment_2_in_rule__AndExp__Group__2__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__0__Impl_in_rule__IfBlock__Group__02102 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__1_in_rule__IfBlock__Group__02105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IfBlock__Group__0__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__1__Impl_in_rule__IfBlock__Group__12164 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__2_in_rule__IfBlock__Group__12167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__ConditionAssignment_1_in_rule__IfBlock__Group__1__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__2__Impl_in_rule__IfBlock__Group__22224 = new BitSet(new long[]{0x0000007C1437A000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__3_in_rule__IfBlock__Group__22227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfBlock__Group__2__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__3__Impl_in_rule__IfBlock__Group__32286 = new BitSet(new long[]{0x0000007C1437A000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__4_in_rule__IfBlock__Group__32289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__ThenBlockAssignment_3_in_rule__IfBlock__Group__3__Impl2316 = new BitSet(new long[]{0x0000007C14272002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__4__Impl_in_rule__IfBlock__Group__42347 = new BitSet(new long[]{0x0000007C1437A000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__5_in_rule__IfBlock__Group__42350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group_4__0_in_rule__IfBlock__Group__4__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group__5__Impl_in_rule__IfBlock__Group__52408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__IfBlock__Group__5__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group_4__0__Impl_in_rule__IfBlock__Group_4__02479 = new BitSet(new long[]{0x0000007C14272000L});
        public static final BitSet FOLLOW_rule__IfBlock__Group_4__1_in_rule__IfBlock__Group_4__02482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IfBlock__Group_4__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__Group_4__1__Impl_in_rule__IfBlock__Group_4__12541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfBlock__ElseBlockAssignment_4_1_in_rule__IfBlock__Group_4__1__Impl2568 = new BitSet(new long[]{0x0000007C14272002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__0__Impl_in_rule__HasTurnedCmd__Group__02604 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__1_in_rule__HasTurnedCmd__Group__02607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__HasTurnedCmd__Group__0__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__1__Impl_in_rule__HasTurnedCmd__Group__12666 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__2_in_rule__HasTurnedCmd__Group__12669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__HasTurnedCmd__Group__1__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__2__Impl_in_rule__HasTurnedCmd__Group__22728 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__3_in_rule__HasTurnedCmd__Group__22731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__HasTurnedCmd__Group__2__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__3__Impl_in_rule__HasTurnedCmd__Group__32790 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__4_in_rule__HasTurnedCmd__Group__32793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__HasTurnedCmd__Group__3__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__4__Impl_in_rule__HasTurnedCmd__Group__42852 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__5_in_rule__HasTurnedCmd__Group__42855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__AngleAssignment_4_in_rule__HasTurnedCmd__Group__4__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HasTurnedCmd__Group__5__Impl_in_rule__HasTurnedCmd__Group__52912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__HasTurnedCmd__Group__5__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__0__Impl_in_rule__MoveCmd__Group__02983 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__1_in_rule__MoveCmd__Group__02986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MoveCmd__Group__0__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__1__Impl_in_rule__MoveCmd__Group__13045 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__2_in_rule__MoveCmd__Group__13048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MoveCmd__Group__1__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__2__Impl_in_rule__MoveCmd__Group__23107 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__3_in_rule__MoveCmd__Group__23110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MoveCmd__Group__2__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__3__Impl_in_rule__MoveCmd__Group__33169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__4_in_rule__MoveCmd__Group__33172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MoveCmd__Group__3__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__4__Impl_in_rule__MoveCmd__Group__43231 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__5_in_rule__MoveCmd__Group__43234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__PowerAssignment_4_in_rule__MoveCmd__Group__4__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveCmd__Group__5__Impl_in_rule__MoveCmd__Group__53291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MoveCmd__Group__5__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__0__Impl_in_rule__PrintCmd__Group__03362 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__1_in_rule__PrintCmd__Group__03365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PrintCmd__Group__0__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__1__Impl_in_rule__PrintCmd__Group__13424 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__2_in_rule__PrintCmd__Group__13427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PrintCmd__Group__1__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__2__Impl_in_rule__PrintCmd__Group__23486 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__3_in_rule__PrintCmd__Group__23489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PrintCmd__Group__2__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__3__Impl_in_rule__PrintCmd__Group__33548 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__4_in_rule__PrintCmd__Group__33551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PrintCmd__Group__3__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__4__Impl_in_rule__PrintCmd__Group__43610 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__5_in_rule__PrintCmd__Group__43613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__MsgAssignment_4_in_rule__PrintCmd__Group__4__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__5__Impl_in_rule__PrintCmd__Group__53670 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__6_in_rule__PrintCmd__Group__53673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PrintCmd__Group__5__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__6__Impl_in_rule__PrintCmd__Group__63732 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__7_in_rule__PrintCmd__Group__63735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PrintCmd__Group__6__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__7__Impl_in_rule__PrintCmd__Group__73794 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__8_in_rule__PrintCmd__Group__73797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PrintCmd__Group__7__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__8__Impl_in_rule__PrintCmd__Group__83856 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__9_in_rule__PrintCmd__Group__83859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__DurationAssignment_8_in_rule__PrintCmd__Group__8__Impl3886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__9__Impl_in_rule__PrintCmd__Group__93916 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__10_in_rule__PrintCmd__Group__93919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PrintCmd__Group__9__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__10__Impl_in_rule__PrintCmd__Group__103978 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__11_in_rule__PrintCmd__Group__103981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__PrintCmd__Group__10__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__11__Impl_in_rule__PrintCmd__Group__114040 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__12_in_rule__PrintCmd__Group__114043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PrintCmd__Group__11__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__12__Impl_in_rule__PrintCmd__Group__124102 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__13_in_rule__PrintCmd__Group__124105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__LineAssignment_12_in_rule__PrintCmd__Group__12__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__13__Impl_in_rule__PrintCmd__Group__134162 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__14_in_rule__PrintCmd__Group__134165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PrintCmd__Group__13__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__14__Impl_in_rule__PrintCmd__Group__144224 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__15_in_rule__PrintCmd__Group__144227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PrintCmd__Group__14__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__15__Impl_in_rule__PrintCmd__Group__154286 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__16_in_rule__PrintCmd__Group__154289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PrintCmd__Group__15__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__16__Impl_in_rule__PrintCmd__Group__164348 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__17_in_rule__PrintCmd__Group__164351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__ColAssignment_16_in_rule__PrintCmd__Group__16__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrintCmd__Group__17__Impl_in_rule__PrintCmd__Group__174408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PrintCmd__Group__17__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__0__Impl_in_rule__SetTurnAngleCmd__Group__04503 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__1_in_rule__SetTurnAngleCmd__Group__04506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SetTurnAngleCmd__Group__0__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__1__Impl_in_rule__SetTurnAngleCmd__Group__14565 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__2_in_rule__SetTurnAngleCmd__Group__14568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SetTurnAngleCmd__Group__1__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__2__Impl_in_rule__SetTurnAngleCmd__Group__24627 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__3_in_rule__SetTurnAngleCmd__Group__24630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SetTurnAngleCmd__Group__2__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__3__Impl_in_rule__SetTurnAngleCmd__Group__34689 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__4_in_rule__SetTurnAngleCmd__Group__34692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SetTurnAngleCmd__Group__3__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__4__Impl_in_rule__SetTurnAngleCmd__Group__44751 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__5_in_rule__SetTurnAngleCmd__Group__44754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__AngleAssignment_4_in_rule__SetTurnAngleCmd__Group__4__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetTurnAngleCmd__Group__5__Impl_in_rule__SetTurnAngleCmd__Group__54811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SetTurnAngleCmd__Group__5__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopEngineCmd__Group__0__Impl_in_rule__StopEngineCmd__Group__04882 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__StopEngineCmd__Group__1_in_rule__StopEngineCmd__Group__04885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopEngineCmd__Group__1__Impl_in_rule__StopEngineCmd__Group__14943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__StopEngineCmd__Group__1__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopProgramCmd__Group__0__Impl_in_rule__StopProgramCmd__Group__05006 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__StopProgramCmd__Group__1_in_rule__StopProgramCmd__Group__05009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StopProgramCmd__Group__1__Impl_in_rule__StopProgramCmd__Group__15067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__StopProgramCmd__Group__1__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__0__Impl_in_rule__TurnCmd__Group__05130 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__1_in_rule__TurnCmd__Group__05133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TurnCmd__Group__0__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__1__Impl_in_rule__TurnCmd__Group__15192 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__2_in_rule__TurnCmd__Group__15195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TurnCmd__Group__1__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__2__Impl_in_rule__TurnCmd__Group__25254 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__3_in_rule__TurnCmd__Group__25257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TurnCmd__Group__2__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__3__Impl_in_rule__TurnCmd__Group__35316 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__4_in_rule__TurnCmd__Group__35319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TurnCmd__Group__3__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__4__Impl_in_rule__TurnCmd__Group__45378 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__5_in_rule__TurnCmd__Group__45381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__PowerAssignment_4_in_rule__TurnCmd__Group__4__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__5__Impl_in_rule__TurnCmd__Group__55438 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__6_in_rule__TurnCmd__Group__55441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TurnCmd__Group__5__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__6__Impl_in_rule__TurnCmd__Group__65500 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__7_in_rule__TurnCmd__Group__65503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TurnCmd__Group__6__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__7__Impl_in_rule__TurnCmd__Group__75562 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__8_in_rule__TurnCmd__Group__75565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TurnCmd__Group__7__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__8__Impl_in_rule__TurnCmd__Group__85624 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__9_in_rule__TurnCmd__Group__85627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__AngleAssignment_8_in_rule__TurnCmd__Group__8__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TurnCmd__Group__9__Impl_in_rule__TurnCmd__Group__95684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TurnCmd__Group__9__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__0__Impl_in_rule__ObstacleCmd__Group__05763 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__1_in_rule__ObstacleCmd__Group__05766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ObstacleCmd__Group__0__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__1__Impl_in_rule__ObstacleCmd__Group__15825 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__2_in_rule__ObstacleCmd__Group__15828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ObstacleCmd__Group__1__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__2__Impl_in_rule__ObstacleCmd__Group__25887 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__3_in_rule__ObstacleCmd__Group__25890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ObstacleCmd__Group__2__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__3__Impl_in_rule__ObstacleCmd__Group__35949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__4_in_rule__ObstacleCmd__Group__35952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ObstacleCmd__Group__3__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__4__Impl_in_rule__ObstacleCmd__Group__46011 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__5_in_rule__ObstacleCmd__Group__46014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__DistanceAssignment_4_in_rule__ObstacleCmd__Group__4__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObstacleCmd__Group__5__Impl_in_rule__ObstacleCmd__Group__56071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObstacleCmd__Group__5__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ProgramUnit__BlockAssignment6147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_rule__WhileLoop__LoopCondAssignment_16178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__WhileLoop__BlockAssignment_36209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_rule__NegExp__ExpAssignment_16240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_rule__AndExp__LeftExpAssignment_16271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_rule__AndExp__RightExpAssignment_26302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExp_in_rule__IfBlock__ConditionAssignment_16333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__IfBlock__ThenBlockAssignment_36364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__IfBlock__ElseBlockAssignment_4_16395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__HasTurnedCmd__AngleAssignment_46429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__MoveCmd__PowerAssignment_46460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PrintCmd__MsgAssignment_46491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrintCmd__DurationAssignment_86522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrintCmd__LineAssignment_126553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrintCmd__ColAssignment_166584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SetTurnAngleCmd__AngleAssignment_46615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TurnCmd__PowerAssignment_46646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TurnCmd__AngleAssignment_86677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__ObstacleCmd__DistanceAssignment_46708 = new BitSet(new long[]{0x0000000000000002L});
    }


}