package insa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import insa.services.ExpArithmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpArithmParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g"; }



     	private ExpArithmGrammarAccess grammarAccess;
     	
        public InternalExpArithmParser(TokenStream input, ExpArithmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ExpressionArithm";	
       	}
       	
       	@Override
       	protected ExpArithmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpressionArithm"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:67:1: entryRuleExpressionArithm returns [EObject current=null] : iv_ruleExpressionArithm= ruleExpressionArithm EOF ;
    public final EObject entryRuleExpressionArithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionArithm = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:68:2: (iv_ruleExpressionArithm= ruleExpressionArithm EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:69:2: iv_ruleExpressionArithm= ruleExpressionArithm EOF
            {
             newCompositeNode(grammarAccess.getExpressionArithmRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionArithm_in_entryRuleExpressionArithm75);
            iv_ruleExpressionArithm=ruleExpressionArithm();

            state._fsp--;

             current =iv_ruleExpressionArithm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionArithm85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionArithm"


    // $ANTLR start "ruleExpressionArithm"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:76:1: ruleExpressionArithm returns [EObject current=null] : ( (lv_racine_0_0= ruleEltExp ) )? ;
    public final EObject ruleExpressionArithm() throws RecognitionException {
        EObject current = null;

        EObject lv_racine_0_0 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:79:28: ( ( (lv_racine_0_0= ruleEltExp ) )? )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:80:1: ( (lv_racine_0_0= ruleEltExp ) )?
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:80:1: ( (lv_racine_0_0= ruleEltExp ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOUBLE||(LA1_0>=8 && LA1_0<=11)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:81:1: (lv_racine_0_0= ruleEltExp )
                    {
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:81:1: (lv_racine_0_0= ruleEltExp )
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:82:3: lv_racine_0_0= ruleEltExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionArithmAccess().getRacineEltExpParserRuleCall_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleExpressionArithm130);
                    lv_racine_0_0=ruleEltExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionArithmRule());
                    	        }
                           		set(
                           			current, 
                           			"racine",
                            		lv_racine_0_0, 
                            		"EltExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionArithm"


    // $ANTLR start "entryRuleEltExp"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:106:1: entryRuleEltExp returns [EObject current=null] : iv_ruleEltExp= ruleEltExp EOF ;
    public final EObject entryRuleEltExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEltExp = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:107:2: (iv_ruleEltExp= ruleEltExp EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:108:2: iv_ruleEltExp= ruleEltExp EOF
            {
             newCompositeNode(grammarAccess.getEltExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_entryRuleEltExp166);
            iv_ruleEltExp=ruleEltExp();

            state._fsp--;

             current =iv_ruleEltExp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEltExp176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEltExp"


    // $ANTLR start "ruleEltExp"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:115:1: ruleEltExp returns [EObject current=null] : (this_Valeur_0= ruleValeur | this_Plus_1= rulePlus | this_Moins_2= ruleMoins | this_Mult_3= ruleMult | this_Division_4= ruleDivision ) ;
    public final EObject ruleEltExp() throws RecognitionException {
        EObject current = null;

        EObject this_Valeur_0 = null;

        EObject this_Plus_1 = null;

        EObject this_Moins_2 = null;

        EObject this_Mult_3 = null;

        EObject this_Division_4 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:118:28: ( (this_Valeur_0= ruleValeur | this_Plus_1= rulePlus | this_Moins_2= ruleMoins | this_Mult_3= ruleMult | this_Division_4= ruleDivision ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:119:1: (this_Valeur_0= ruleValeur | this_Plus_1= rulePlus | this_Moins_2= ruleMoins | this_Mult_3= ruleMult | this_Division_4= ruleDivision )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:119:1: (this_Valeur_0= ruleValeur | this_Plus_1= rulePlus | this_Moins_2= ruleMoins | this_Mult_3= ruleMult | this_Division_4= ruleDivision )
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
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:120:5: this_Valeur_0= ruleValeur
                    {
                     
                            newCompositeNode(grammarAccess.getEltExpAccess().getValeurParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleValeur_in_ruleEltExp223);
                    this_Valeur_0=ruleValeur();

                    state._fsp--;

                     
                            current = this_Valeur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:130:5: this_Plus_1= rulePlus
                    {
                     
                            newCompositeNode(grammarAccess.getEltExpAccess().getPlusParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePlus_in_ruleEltExp250);
                    this_Plus_1=rulePlus();

                    state._fsp--;

                     
                            current = this_Plus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:140:5: this_Moins_2= ruleMoins
                    {
                     
                            newCompositeNode(grammarAccess.getEltExpAccess().getMoinsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMoins_in_ruleEltExp277);
                    this_Moins_2=ruleMoins();

                    state._fsp--;

                     
                            current = this_Moins_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:150:5: this_Mult_3= ruleMult
                    {
                     
                            newCompositeNode(grammarAccess.getEltExpAccess().getMultParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMult_in_ruleEltExp304);
                    this_Mult_3=ruleMult();

                    state._fsp--;

                     
                            current = this_Mult_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:160:5: this_Division_4= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getEltExpAccess().getDivisionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleEltExp331);
                    this_Division_4=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEltExp"


    // $ANTLR start "entryRuleValeur"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:176:1: entryRuleValeur returns [EObject current=null] : iv_ruleValeur= ruleValeur EOF ;
    public final EObject entryRuleValeur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValeur = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:177:2: (iv_ruleValeur= ruleValeur EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:178:2: iv_ruleValeur= ruleValeur EOF
            {
             newCompositeNode(grammarAccess.getValeurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValeur_in_entryRuleValeur366);
            iv_ruleValeur=ruleValeur();

            state._fsp--;

             current =iv_ruleValeur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValeur376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValeur"


    // $ANTLR start "ruleValeur"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:185:1: ruleValeur returns [EObject current=null] : ( (lv_valeur_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleValeur() throws RecognitionException {
        EObject current = null;

        Token lv_valeur_0_0=null;

         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:188:28: ( ( (lv_valeur_0_0= RULE_DOUBLE ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:189:1: ( (lv_valeur_0_0= RULE_DOUBLE ) )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:189:1: ( (lv_valeur_0_0= RULE_DOUBLE ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:190:1: (lv_valeur_0_0= RULE_DOUBLE )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:190:1: (lv_valeur_0_0= RULE_DOUBLE )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:191:3: lv_valeur_0_0= RULE_DOUBLE
            {
            lv_valeur_0_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_ruleValeur417); 

            			newLeafNode(lv_valeur_0_0, grammarAccess.getValeurAccess().getValeurDOUBLETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValeurRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valeur",
                    		lv_valeur_0_0, 
                    		"DOUBLE");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValeur"


    // $ANTLR start "entryRulePlus"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:215:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:216:2: (iv_rulePlus= rulePlus EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:217:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlus_in_entryRulePlus457);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlus467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:224:1: rulePlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_EltGauche_1_0 = null;

        EObject lv_eltDroit_2_0 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:227:28: ( (otherlv_0= '+' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:228:1: (otherlv_0= '+' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:228:1: (otherlv_0= '+' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:228:3: otherlv_0= '+' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) )
            {
            otherlv_0=(Token)match(input,8,FollowSets000.FOLLOW_8_in_rulePlus504); 

                	newLeafNode(otherlv_0, grammarAccess.getPlusAccess().getPlusSignKeyword_0());
                
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:232:1: ( (lv_EltGauche_1_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:233:1: (lv_EltGauche_1_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:233:1: (lv_EltGauche_1_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:234:3: lv_EltGauche_1_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getPlusAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rulePlus525);
            lv_EltGauche_1_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlusRule());
            	        }
                   		set(
                   			current, 
                   			"EltGauche",
                    		lv_EltGauche_1_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:250:2: ( (lv_eltDroit_2_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:251:1: (lv_eltDroit_2_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:251:1: (lv_eltDroit_2_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:252:3: lv_eltDroit_2_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getPlusAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_rulePlus546);
            lv_eltDroit_2_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlusRule());
            	        }
                   		set(
                   			current, 
                   			"eltDroit",
                    		lv_eltDroit_2_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMoins"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:276:1: entryRuleMoins returns [EObject current=null] : iv_ruleMoins= ruleMoins EOF ;
    public final EObject entryRuleMoins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoins = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:277:2: (iv_ruleMoins= ruleMoins EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:278:2: iv_ruleMoins= ruleMoins EOF
            {
             newCompositeNode(grammarAccess.getMoinsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoins_in_entryRuleMoins582);
            iv_ruleMoins=ruleMoins();

            state._fsp--;

             current =iv_ruleMoins; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoins592); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoins"


    // $ANTLR start "ruleMoins"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:285:1: ruleMoins returns [EObject current=null] : (otherlv_0= '-' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) ;
    public final EObject ruleMoins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_EltGauche_1_0 = null;

        EObject lv_eltDroit_2_0 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:288:28: ( (otherlv_0= '-' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:289:1: (otherlv_0= '-' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:289:1: (otherlv_0= '-' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:289:3: otherlv_0= '-' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) )
            {
            otherlv_0=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleMoins629); 

                	newLeafNode(otherlv_0, grammarAccess.getMoinsAccess().getHyphenMinusKeyword_0());
                
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:293:1: ( (lv_EltGauche_1_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:294:1: (lv_EltGauche_1_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:294:1: (lv_EltGauche_1_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:295:3: lv_EltGauche_1_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getMoinsAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleMoins650);
            lv_EltGauche_1_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoinsRule());
            	        }
                   		set(
                   			current, 
                   			"EltGauche",
                    		lv_EltGauche_1_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:311:2: ( (lv_eltDroit_2_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:312:1: (lv_eltDroit_2_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:312:1: (lv_eltDroit_2_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:313:3: lv_eltDroit_2_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getMoinsAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleMoins671);
            lv_eltDroit_2_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoinsRule());
            	        }
                   		set(
                   			current, 
                   			"eltDroit",
                    		lv_eltDroit_2_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoins"


    // $ANTLR start "entryRuleMult"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:337:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:338:2: (iv_ruleMult= ruleMult EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:339:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMult_in_entryRuleMult707);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMult717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:346:1: ruleMult returns [EObject current=null] : (otherlv_0= '*' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_EltGauche_1_0 = null;

        EObject lv_eltDroit_2_0 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:349:28: ( (otherlv_0= '*' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:350:1: (otherlv_0= '*' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:350:1: (otherlv_0= '*' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:350:3: otherlv_0= '*' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) )
            {
            otherlv_0=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleMult754); 

                	newLeafNode(otherlv_0, grammarAccess.getMultAccess().getAsteriskKeyword_0());
                
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:354:1: ( (lv_EltGauche_1_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:355:1: (lv_EltGauche_1_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:355:1: (lv_EltGauche_1_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:356:3: lv_EltGauche_1_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleMult775);
            lv_EltGauche_1_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultRule());
            	        }
                   		set(
                   			current, 
                   			"EltGauche",
                    		lv_EltGauche_1_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:372:2: ( (lv_eltDroit_2_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:373:1: (lv_eltDroit_2_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:373:1: (lv_eltDroit_2_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:374:3: lv_eltDroit_2_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleMult796);
            lv_eltDroit_2_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultRule());
            	        }
                   		set(
                   			current, 
                   			"eltDroit",
                    		lv_eltDroit_2_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleDivision"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:398:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:399:2: (iv_ruleDivision= ruleDivision EOF )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:400:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivision_in_entryRuleDivision832);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivision842); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:407:1: ruleDivision returns [EObject current=null] : (otherlv_0= '/' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_EltGauche_1_0 = null;

        EObject lv_eltDroit_2_0 = null;


         enterRule(); 
            
        try {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:410:28: ( (otherlv_0= '/' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:411:1: (otherlv_0= '/' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:411:1: (otherlv_0= '/' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:411:3: otherlv_0= '/' ( (lv_EltGauche_1_0= ruleEltExp ) ) ( (lv_eltDroit_2_0= ruleEltExp ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDivision879); 

                	newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getSolidusKeyword_0());
                
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:415:1: ( (lv_EltGauche_1_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:416:1: (lv_EltGauche_1_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:416:1: (lv_EltGauche_1_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:417:3: lv_EltGauche_1_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getDivisionAccess().getEltGaucheEltExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleDivision900);
            lv_EltGauche_1_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	        }
                   		set(
                   			current, 
                   			"EltGauche",
                    		lv_EltGauche_1_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:433:2: ( (lv_eltDroit_2_0= ruleEltExp ) )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:434:1: (lv_eltDroit_2_0= ruleEltExp )
            {
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:434:1: (lv_eltDroit_2_0= ruleEltExp )
            // ../insa.expArithm.xtext/src-gen/insa/parser/antlr/internal/InternalExpArithm.g:435:3: lv_eltDroit_2_0= ruleEltExp
            {
             
            	        newCompositeNode(grammarAccess.getDivisionAccess().getEltDroitEltExpParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEltExp_in_ruleDivision921);
            lv_eltDroit_2_0=ruleEltExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	        }
                   		set(
                   			current, 
                   			"eltDroit",
                    		lv_eltDroit_2_0, 
                    		"EltExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExpressionArithm_in_entryRuleExpressionArithm75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionArithm85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleExpressionArithm130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEltExp_in_entryRuleEltExp166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEltExp176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValeur_in_ruleEltExp223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_ruleEltExp250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoins_in_ruleEltExp277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_ruleEltExp304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleEltExp331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValeur_in_entryRuleValeur366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValeur376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleValeur417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlus_in_entryRulePlus457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlus467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rulePlus504 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_rulePlus525 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_rulePlus546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoins_in_entryRuleMoins582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoins592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_ruleMoins629 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleMoins650 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleMoins671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMult_in_entryRuleMult707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMult717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_ruleMult754 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleMult775 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleMult796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivision842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDivision879 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleDivision900 = new BitSet(new long[]{0x0000000000000F10L});
        public static final BitSet FOLLOW_ruleEltExp_in_ruleDivision921 = new BitSet(new long[]{0x0000000000000002L});
    }


}