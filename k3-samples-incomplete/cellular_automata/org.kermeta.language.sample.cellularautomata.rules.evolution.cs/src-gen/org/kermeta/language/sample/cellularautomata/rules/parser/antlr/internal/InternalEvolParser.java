package org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kermeta.language.sample.cellularautomata.rules.services.EvolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvolParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g"; }



     	private EvolGrammarAccess grammarAccess;
     	
        public InternalEvolParser(TokenStream input, EvolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CellularAutomata";	
       	}
       	
       	@Override
       	protected EvolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:67:1: entryRuleCellularAutomata returns [EObject current=null] : iv_ruleCellularAutomata= ruleCellularAutomata EOF ;
    public final EObject entryRuleCellularAutomata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellularAutomata = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:68:2: (iv_ruleCellularAutomata= ruleCellularAutomata EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:69:2: iv_ruleCellularAutomata= ruleCellularAutomata EOF
            {
             newCompositeNode(grammarAccess.getCellularAutomataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata75);
            iv_ruleCellularAutomata=ruleCellularAutomata();

            state._fsp--;

             current =iv_ruleCellularAutomata; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomata85); 

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
    // $ANTLR end "entryRuleCellularAutomata"


    // $ANTLR start "ruleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:76:1: ruleCellularAutomata returns [EObject current=null] : ( () ( (lv_rules_1_0= ruleRule ) ) ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleCellularAutomata() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_1_0 = null;

        EObject lv_rules_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:79:28: ( ( () ( (lv_rules_1_0= ruleRule ) ) ( (lv_rules_2_0= ruleRule ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:80:1: ( () ( (lv_rules_1_0= ruleRule ) ) ( (lv_rules_2_0= ruleRule ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:80:1: ( () ( (lv_rules_1_0= ruleRule ) ) ( (lv_rules_2_0= ruleRule ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:80:2: () ( (lv_rules_1_0= ruleRule ) ) ( (lv_rules_2_0= ruleRule ) )*
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:80:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellularAutomataAccess().getCellularAutomataAction_0(),
                        current);
                

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:86:2: ( (lv_rules_1_0= ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:87:1: (lv_rules_1_0= ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:87:1: (lv_rules_1_0= ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:88:3: lv_rules_1_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomata140);
            lv_rules_1_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellularAutomataRule());
            	        }
                   		add(
                   			current, 
                   			"rules",
                    		lv_rules_1_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:104:2: ( (lv_rules_2_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:105:1: (lv_rules_2_0= ruleRule )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:105:1: (lv_rules_2_0= ruleRule )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:106:3: lv_rules_2_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomata161);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellularAutomataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_2_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleCellularAutomata"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:130:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:131:2: (iv_ruleRule= ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:132:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule198);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule208); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:139:1: ruleRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= 'nextValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_filter_1_0 = null;

        EObject lv_evaluatedVal_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:142:28: ( (otherlv_0= 'when' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= 'nextValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:143:1: (otherlv_0= 'when' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= 'nextValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:143:1: (otherlv_0= 'when' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= 'nextValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:143:3: otherlv_0= 'when' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= 'nextValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRule245); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getWhenKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:147:1: ( (lv_filter_1_0= rulePopulationRange ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:148:1: (lv_filter_1_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:148:1: (lv_filter_1_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:149:3: lv_filter_1_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterPopulationRangeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleRule266);
                    lv_filter_1_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule279); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getNextValueKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRule291); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRule303); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:177:1: ( (lv_evaluatedVal_5_0= ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:178:1: (lv_evaluatedVal_5_0= ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:178:1: (lv_evaluatedVal_5_0= ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:179:3: lv_evaluatedVal_5_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleRule324);
            lv_evaluatedVal_5_0=ruleConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"evaluatedVal",
                    		lv_evaluatedVal_5_0, 
                    		"Conditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRule336); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:207:1: entryRulePopulationRange returns [EObject current=null] : iv_rulePopulationRange= rulePopulationRange EOF ;
    public final EObject entryRulePopulationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulationRange = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:208:2: (iv_rulePopulationRange= rulePopulationRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:209:2: iv_rulePopulationRange= rulePopulationRange EOF
            {
             newCompositeNode(grammarAccess.getPopulationRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_entryRulePopulationRange372);
            iv_rulePopulationRange=rulePopulationRange();

            state._fsp--;

             current =iv_rulePopulationRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePopulationRange382); 

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
    // $ANTLR end "entryRulePopulationRange"


    // $ANTLR start "rulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:216:1: rulePopulationRange returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' ) ;
    public final EObject rulePopulationRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerRange_2_0 = null;

        AntlrDatatypeRuleToken lv_upperRange_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:219:28: ( ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:220:1: ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:220:1: ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:220:2: () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:220:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPopulationRangeAccess().getPopulationRangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePopulationRange428); 

                	newLeafNode(otherlv_1, grammarAccess.getPopulationRangeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:230:1: ( (lv_lowerRange_2_0= ruleEInt ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==34) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:231:1: (lv_lowerRange_2_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:231:1: (lv_lowerRange_2_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:232:3: lv_lowerRange_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPopulationRangeAccess().getLowerRangeEIntParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePopulationRange449);
                    lv_lowerRange_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPopulationRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerRange",
                            		lv_lowerRange_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePopulationRange462); 

                	newLeafNode(otherlv_3, grammarAccess.getPopulationRangeAccess().getCommaKeyword_3());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:252:1: ( (lv_upperRange_4_0= ruleEInt ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:253:1: (lv_upperRange_4_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:253:1: (lv_upperRange_4_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:254:3: lv_upperRange_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPopulationRangeAccess().getUpperRangeEIntParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePopulationRange483);
                    lv_upperRange_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPopulationRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperRange",
                            		lv_upperRange_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePopulationRange496); 

                	newLeafNode(otherlv_5, grammarAccess.getPopulationRangeAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "rulePopulationRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:282:1: entryRuleLiteralsExpression returns [EObject current=null] : iv_ruleLiteralsExpression= ruleLiteralsExpression EOF ;
    public final EObject entryRuleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralsExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:283:2: (iv_ruleLiteralsExpression= ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:284:2: iv_ruleLiteralsExpression= ruleLiteralsExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression532);
            iv_ruleLiteralsExpression=ruleLiteralsExpression();

            state._fsp--;

             current =iv_ruleLiteralsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression542); 

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
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:291:1: ruleLiteralsExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_CurrentCellPopulation_7= ruleCurrentCellPopulation | this_IntegerLiteral_8= ruleIntegerLiteral ) ;
    public final EObject ruleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Conditional_1 = null;

        EObject this_Max_3 = null;

        EObject this_Min_4 = null;

        EObject this_Sum_5 = null;

        EObject this_Size_6 = null;

        EObject this_CurrentCellPopulation_7 = null;

        EObject this_IntegerLiteral_8 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:294:28: ( ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_CurrentCellPopulation_7= ruleCurrentCellPopulation | this_IntegerLiteral_8= ruleIntegerLiteral ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:295:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_CurrentCellPopulation_7= ruleCurrentCellPopulation | this_IntegerLiteral_8= ruleIntegerLiteral )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:295:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_CurrentCellPopulation_7= ruleCurrentCellPopulation | this_IntegerLiteral_8= ruleIntegerLiteral )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:295:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:295:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:295:4: otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLiteralsExpression580); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleLiteralsExpression602);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLiteralsExpression613); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:314:5: this_Max_3= ruleMax
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getMaxParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMax_in_ruleLiteralsExpression642);
                    this_Max_3=ruleMax();

                    state._fsp--;

                     
                            current = this_Max_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:324:5: this_Min_4= ruleMin
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getMinParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMin_in_ruleLiteralsExpression669);
                    this_Min_4=ruleMin();

                    state._fsp--;

                     
                            current = this_Min_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:334:5: this_Sum_5= ruleSum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getSumParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSum_in_ruleLiteralsExpression696);
                    this_Sum_5=ruleSum();

                    state._fsp--;

                     
                            current = this_Sum_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:344:5: this_Size_6= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getSizeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSize_in_ruleLiteralsExpression723);
                    this_Size_6=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:354:5: this_CurrentCellPopulation_7= ruleCurrentCellPopulation
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getCurrentCellPopulationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_ruleLiteralsExpression750);
                    this_CurrentCellPopulation_7=ruleCurrentCellPopulation();

                    state._fsp--;

                     
                            current = this_CurrentCellPopulation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:364:5: this_IntegerLiteral_8= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression777);
                    this_IntegerLiteral_8=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_8; 
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
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRuleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:380:1: entryRuleMax returns [EObject current=null] : iv_ruleMax= ruleMax EOF ;
    public final EObject entryRuleMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMax = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:381:2: (iv_ruleMax= ruleMax EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:382:2: iv_ruleMax= ruleMax EOF
            {
             newCompositeNode(grammarAccess.getMaxRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMax_in_entryRuleMax812);
            iv_ruleMax=ruleMax();

            state._fsp--;

             current =iv_ruleMax; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMax822); 

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
    // $ANTLR end "entryRuleMax"


    // $ANTLR start "ruleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:389:1: ruleMax returns [EObject current=null] : ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:392:28: ( ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:393:1: ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:393:1: ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:393:2: () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:393:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:394:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMaxAccess().getMaxAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMax868); 

                	newLeafNode(otherlv_1, grammarAccess.getMaxAccess().getNeighborsMaxKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:403:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:404:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:404:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:405:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMaxAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleMax889);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMaxRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMax"


    // $ANTLR start "entryRuleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:429:1: entryRuleMin returns [EObject current=null] : iv_ruleMin= ruleMin EOF ;
    public final EObject entryRuleMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMin = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:430:2: (iv_ruleMin= ruleMin EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:431:2: iv_ruleMin= ruleMin EOF
            {
             newCompositeNode(grammarAccess.getMinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMin_in_entryRuleMin926);
            iv_ruleMin=ruleMin();

            state._fsp--;

             current =iv_ruleMin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMin936); 

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
    // $ANTLR end "entryRuleMin"


    // $ANTLR start "ruleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:438:1: ruleMin returns [EObject current=null] : ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleMin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:441:28: ( ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:442:1: ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:442:1: ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:442:2: () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:442:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:443:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMinAccess().getMinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMin982); 

                	newLeafNode(otherlv_1, grammarAccess.getMinAccess().getNeighborsMinKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:452:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:453:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:453:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:454:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMinAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleMin1003);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMinRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMin"


    // $ANTLR start "entryRuleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:478:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:479:2: (iv_ruleSum= ruleSum EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:480:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSum_in_entryRuleSum1040);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSum1050); 

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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:487:1: ruleSum returns [EObject current=null] : ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:490:28: ( ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:491:1: ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:491:1: ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:491:2: () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:491:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:492:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumAccess().getSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSum1096); 

                	newLeafNode(otherlv_1, grammarAccess.getSumAccess().getNeighborsSumKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:501:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:502:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:502:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:503:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleSum1117);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:527:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:528:2: (iv_ruleSize= ruleSize EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:529:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSize_in_entryRuleSize1154);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSize1164); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:536:1: ruleSize returns [EObject current=null] : ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:539:28: ( ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:540:1: ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:540:1: ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:540:2: () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:540:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSizeAccess().getSizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSize1210); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getNeighborsSizeKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:550:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:551:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:551:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:552:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleSize1231);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:576:1: entryRuleCurrentCellPopulation returns [EObject current=null] : iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF ;
    public final EObject entryRuleCurrentCellPopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrentCellPopulation = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:577:2: (iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:578:2: iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF
            {
             newCompositeNode(grammarAccess.getCurrentCellPopulationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation1268);
            iv_ruleCurrentCellPopulation=ruleCurrentCellPopulation();

            state._fsp--;

             current =iv_ruleCurrentCellPopulation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurrentCellPopulation1278); 

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
    // $ANTLR end "entryRuleCurrentCellPopulation"


    // $ANTLR start "ruleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:585:1: ruleCurrentCellPopulation returns [EObject current=null] : ( () otherlv_1= 'CurrentValue' ) ;
    public final EObject ruleCurrentCellPopulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:588:28: ( ( () otherlv_1= 'CurrentValue' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:589:1: ( () otherlv_1= 'CurrentValue' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:589:1: ( () otherlv_1= 'CurrentValue' )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:589:2: () otherlv_1= 'CurrentValue'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:589:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCurrentCellPopulationAccess().getCurrentCellPopulationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCurrentCellPopulation1324); 

                	newLeafNode(otherlv_1, grammarAccess.getCurrentCellPopulationAccess().getCurrentValueKeyword_1());
                

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
    // $ANTLR end "ruleCurrentCellPopulation"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:607:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:608:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:609:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional1360);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional1370); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:616:1: ruleConditional returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_OrExpression_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_ifTrueExpression_5_0 = null;

        EObject lv_ifFalseExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:619:28: ( (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:620:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:620:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==19||(LA10_0>=21 && LA10_0<=25)||LA10_0==34||LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:621:5: this_OrExpression_0= ruleOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleConditional1417);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;

                     
                            current = this_OrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:630:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:630:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:630:7: () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:630:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:631:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalAccess().getConditionalAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConditional1444); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getIfKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:640:1: ( (lv_condition_3_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:641:1: (lv_condition_3_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:641:1: (lv_condition_3_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:642:3: lv_condition_3_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1465);
                    lv_condition_3_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1477); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:662:1: ( (lv_ifTrueExpression_5_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:663:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:663:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:664:3: lv_ifTrueExpression_5_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1498);
                    lv_ifTrueExpression_5_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"ifTrueExpression",
                            		lv_ifTrueExpression_5_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditional1510); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5());
                        
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConditional1522); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_1_6());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1534); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:692:1: ( (lv_ifFalseExpression_9_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:693:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:693:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:694:3: lv_ifFalseExpression_9_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1555);
                    lv_ifFalseExpression_9_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"ifFalseExpression",
                            		lv_ifFalseExpression_9_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditional1567); 

                        	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9());
                        

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:722:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:723:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:724:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression1604);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression1614); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:731:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:734:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:735:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:735:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:736:5: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1661);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:744:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:744:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:744:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:745:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOrExpression1682); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:754:1: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:755:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:755:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:756:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1703);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:780:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:781:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:782:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression1741);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression1751); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:789:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:792:28: ( (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:793:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:793:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:794:5: this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1798);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;

             
                    current = this_EqualExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:802:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:802:2: () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:802:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:803:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAndExpression1819); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:812:1: ( (lv_right_3_0= ruleEqualExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:813:1: (lv_right_3_0= ruleEqualExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:813:1: (lv_right_3_0= ruleEqualExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:814:3: lv_right_3_0= ruleEqualExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1840);
            	    lv_right_3_0=ruleEqualExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"EqualExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:838:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:839:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:840:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1878);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression1888); 

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
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:847:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:850:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:851:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:851:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:852:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1935);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:860:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:860:2: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:860:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:861:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEqualExpression1956); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:870:1: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:871:1: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:871:1: (lv_right_3_0= ruleComparisonExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:872:3: lv_right_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1977);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ComparisonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:896:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:897:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:898:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2015);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression2025); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:905:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:908:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:909:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:909:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:910:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2072);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==31) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==32) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:3: ( () otherlv_2= '>' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:3: ( () otherlv_2= '>' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:4: () otherlv_2= '>'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:918:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:919:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComparisonExpression2095); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:929:6: ( () otherlv_4= '<' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:929:6: ( () otherlv_4= '<' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:929:7: () otherlv_4= '<'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:929:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:930:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComparisonExpression2124); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:939:3: ( (lv_right_5_0= ruleAddExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:940:1: (lv_right_5_0= ruleAddExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:940:1: (lv_right_5_0= ruleAddExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:941:3: lv_right_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2147);
            	    lv_right_5_0=ruleAddExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"AddExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:965:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:966:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:967:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2185);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2195); 

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:974:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:977:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:978:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:978:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:979:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2242);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==33) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==34) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:3: ( () otherlv_2= '+' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:4: () otherlv_2= '+'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:987:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:988:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAddExpression2265); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:998:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:998:6: ( () otherlv_4= '-' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:998:7: () otherlv_4= '-'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:998:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:999:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAddExpression2294); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1008:3: ( (lv_right_5_0= ruleMultExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1009:1: (lv_right_5_0= ruleMultExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1009:1: (lv_right_5_0= ruleMultExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1010:3: lv_right_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2317);
            	    lv_right_5_0=ruleMultExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1034:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1035:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1036:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2355);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2365); 

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
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1043:1: ruleMultExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1046:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1047:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1047:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1048:5: this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2412);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=37)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:3: ( () otherlv_2= '*' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:4: () otherlv_2= '*'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1056:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1057:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultExpression2435); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1067:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1067:6: ( () otherlv_4= '/' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1067:7: () otherlv_4= '/'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1067:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1068:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultExpression2464); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1078:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1078:6: ( () otherlv_6= '%' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1078:7: () otherlv_6= '%'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1078:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1079:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultExpression2493); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1088:3: ( (lv_right_7_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1089:1: (lv_right_7_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1089:1: (lv_right_7_0= ruleUnaryExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1090:3: lv_right_7_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2516);
            	    lv_right_7_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1114:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1115:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1116:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2554);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2564); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1123:1: ruleUnaryExpression returns [EObject current=null] : (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_LiteralsExpression_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_target_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1126:28: ( (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1127:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1127:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==19||(LA20_2>=21 && LA20_2<=25)||LA20_2==34) ) {
                    alt20=3;
                }
                else if ( (LA20_2==RULE_INT) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1128:5: this_LiteralsExpression_0= ruleLiteralsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2611);
                    this_LiteralsExpression_0=ruleLiteralsExpression();

                    state._fsp--;

                     
                            current = this_LiteralsExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1137:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1137:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1137:7: () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1137:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1138:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUnaryExpression2638); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1147:1: ( (lv_target_3_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1148:1: (lv_target_3_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1148:1: (lv_target_3_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1149:3: lv_target_3_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2659);
                    lv_target_3_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_3_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1166:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1166:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1166:7: () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1166:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1167:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnaryExpression2688); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1176:1: ( (lv_target_6_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1177:1: (lv_target_6_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1177:1: (lv_target_6_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1178:3: lv_target_6_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2709);
                    lv_target_6_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_6_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1202:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1203:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1204:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2746);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral2756); 

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1211:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1214:28: ( ( (lv_val_0_0= ruleEInt ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1215:1: ( (lv_val_0_0= ruleEInt ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1215:1: ( (lv_val_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1216:1: (lv_val_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1216:1: (lv_val_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1217:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerLiteral2801);
            lv_val_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1241:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1242:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1243:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2837);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2848); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1250:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1253:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1254:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1254:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1254:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1254:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.evolution.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalEvol.g:1255:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEInt2887); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2904); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomata85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomata140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomata161 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRule245 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleRule266 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule279 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRule291 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRule303 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleRule324 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRule336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_entryRulePopulationRange372 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePopulationRange382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePopulationRange428 = new BitSet(new long[]{0x0000000403EA0010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePopulationRange449 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePopulationRange462 = new BitSet(new long[]{0x0000000403EC0010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePopulationRange483 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePopulationRange496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleLiteralsExpression580 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleLiteralsExpression602 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLiteralsExpression613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_ruleLiteralsExpression642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_ruleLiteralsExpression669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_ruleLiteralsExpression696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_ruleLiteralsExpression723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_ruleLiteralsExpression750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_entryRuleMax812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMax822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleMax868 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleMax889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_entryRuleMin926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMin936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMin982 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleMin1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_entryRuleSum1040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSum1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSum1096 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleSum1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_entryRuleSize1154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSize1164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSize1210 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleSize1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation1268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurrentCellPopulation1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCurrentCellPopulation1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleConditional1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleConditional1444 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1465 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1477 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1498 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConditional1510 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleConditional1522 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1534 = new BitSet(new long[]{0x0000004407E80010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1555 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConditional1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1661 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleOrExpression1682 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1703 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1798 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAndExpression1819 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1840 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1878 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1935 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleEqualExpression1956 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1977 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression2025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2072 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_31_in_ruleComparisonExpression2095 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_32_in_ruleComparisonExpression2124 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2147 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2242 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_33_in_ruleAddExpression2265 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_34_in_ruleAddExpression2294 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2317 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2412 = new BitSet(new long[]{0x0000003800000002L});
        public static final BitSet FOLLOW_35_in_ruleMultExpression2435 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_36_in_ruleMultExpression2464 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_37_in_ruleMultExpression2493 = new BitSet(new long[]{0x0000004403E80010L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2516 = new BitSet(new long[]{0x0000003800000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleUnaryExpression2638 = new BitSet(new long[]{0x0000000403E80010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnaryExpression2688 = new BitSet(new long[]{0x0000000403E80010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerLiteral2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEInt2887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2904 = new BitSet(new long[]{0x0000000000000002L});
    }


}