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
import org.kermeta.language.sample.cellularautomata.rules.services.InitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInitParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g"; }



     	private InitGrammarAccess grammarAccess;
     	
        public InternalInitParser(TokenStream input, InitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CellularAutomataInitialization";	
       	}
       	
       	@Override
       	protected InitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:67:1: entryRuleCellularAutomataInitialization returns [EObject current=null] : iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF ;
    public final EObject entryRuleCellularAutomataInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellularAutomataInitialization = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:68:2: (iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:69:2: iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF
            {
             newCompositeNode(grammarAccess.getCellularAutomataInitializationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization75);
            iv_ruleCellularAutomataInitialization=ruleCellularAutomataInitialization();

            state._fsp--;

             current =iv_ruleCellularAutomataInitialization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomataInitialization85); 

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
    // $ANTLR end "entryRuleCellularAutomataInitialization"


    // $ANTLR start "ruleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:76:1: ruleCellularAutomataInitialization returns [EObject current=null] : ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* ) ;
    public final EObject ruleCellularAutomataInitialization() throws RecognitionException {
        EObject current = null;

        EObject lv_geometry_1_0 = null;

        EObject lv_seedRules_2_0 = null;

        EObject lv_seedRules_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:79:28: ( ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:80:1: ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:80:1: ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:80:2: () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )*
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:80:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomatatInitializationAction_0(),
                        current);
                

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:86:2: ( (lv_geometry_1_0= ruleRegularGeometry ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:87:1: (lv_geometry_1_0= ruleRegularGeometry )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:87:1: (lv_geometry_1_0= ruleRegularGeometry )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:88:3: lv_geometry_1_0= ruleRegularGeometry
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_ruleCellularAutomataInitialization140);
                    lv_geometry_1_0=ruleRegularGeometry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
                    	        }
                           		set(
                           			current, 
                           			"geometry",
                            		lv_geometry_1_0, 
                            		"RegularGeometry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:104:3: ( (lv_seedRules_2_0= ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:105:1: (lv_seedRules_2_0= ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:105:1: (lv_seedRules_2_0= ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:106:3: lv_seedRules_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomataInitialization162);
            lv_seedRules_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
            	        }
                   		add(
                   			current, 
                   			"seedRules",
                    		lv_seedRules_2_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:122:2: ( (lv_seedRules_3_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:123:1: (lv_seedRules_3_0= ruleRule )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:123:1: (lv_seedRules_3_0= ruleRule )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:124:3: lv_seedRules_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomataInitialization183);
            	    lv_seedRules_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"seedRules",
            	            		lv_seedRules_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleCellularAutomataInitialization"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:148:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:149:2: (iv_ruleRule= ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:150:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule220);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule230); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:157:1: ruleRule returns [EObject current=null] : (otherlv_0= 'where' ( (lv_filter_1_0= ruleGlobalPosition ) )? otherlv_2= 'initValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' ) ;
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
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:160:28: ( (otherlv_0= 'where' ( (lv_filter_1_0= ruleGlobalPosition ) )? otherlv_2= 'initValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:161:1: (otherlv_0= 'where' ( (lv_filter_1_0= ruleGlobalPosition ) )? otherlv_2= 'initValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:161:1: (otherlv_0= 'where' ( (lv_filter_1_0= ruleGlobalPosition ) )? otherlv_2= 'initValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:161:3: otherlv_0= 'where' ( (lv_filter_1_0= ruleGlobalPosition ) )? otherlv_2= 'initValue' otherlv_3= '=' otherlv_4= '{' ( (lv_evaluatedVal_5_0= ruleConditional ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRule267); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getWhereKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:165:1: ( (lv_filter_1_0= ruleGlobalPosition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:166:1: (lv_filter_1_0= ruleGlobalPosition )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:166:1: (lv_filter_1_0= ruleGlobalPosition )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:167:3: lv_filter_1_0= ruleGlobalPosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterGlobalPositionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGlobalPosition_in_ruleRule288);
                    lv_filter_1_0=ruleGlobalPosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
                            		"GlobalPosition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule301); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getInitValueKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRule313); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRule325); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:195:1: ( (lv_evaluatedVal_5_0= ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:196:1: (lv_evaluatedVal_5_0= ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:196:1: (lv_evaluatedVal_5_0= ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:197:3: lv_evaluatedVal_5_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleRule346);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRule358); 

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


    // $ANTLR start "entryRuleGlobalPosition"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:225:1: entryRuleGlobalPosition returns [EObject current=null] : iv_ruleGlobalPosition= ruleGlobalPosition EOF ;
    public final EObject entryRuleGlobalPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalPosition = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:226:2: (iv_ruleGlobalPosition= ruleGlobalPosition EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:227:2: iv_ruleGlobalPosition= ruleGlobalPosition EOF
            {
             newCompositeNode(grammarAccess.getGlobalPositionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGlobalPosition_in_entryRuleGlobalPosition394);
            iv_ruleGlobalPosition=ruleGlobalPosition();

            state._fsp--;

             current =iv_ruleGlobalPosition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGlobalPosition404); 

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
    // $ANTLR end "entryRuleGlobalPosition"


    // $ANTLR start "ruleGlobalPosition"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:234:1: ruleGlobalPosition returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) ) (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )* otherlv_5= '}' ) ;
    public final EObject ruleGlobalPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_coordinateRanges_2_0 = null;

        EObject lv_coordinateRanges_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:237:28: ( ( () otherlv_1= '{' ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) ) (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )* otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:238:1: ( () otherlv_1= '{' ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) ) (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )* otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:238:1: ( () otherlv_1= '{' ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) ) (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )* otherlv_5= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:238:2: () otherlv_1= '{' ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) ) (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )* otherlv_5= '}'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:238:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGlobalPositionAccess().getGlobalPositionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGlobalPosition450); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalPositionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:248:1: ( (lv_coordinateRanges_2_0= ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:249:1: (lv_coordinateRanges_2_0= ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:249:1: (lv_coordinateRanges_2_0= ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:250:3: lv_coordinateRanges_2_0= ruleCoordinateRange
            {
             
            	        newCompositeNode(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_ruleGlobalPosition471);
            lv_coordinateRanges_2_0=ruleCoordinateRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalPositionRule());
            	        }
                   		add(
                   			current, 
                   			"coordinateRanges",
                    		lv_coordinateRanges_2_0, 
                    		"CoordinateRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:266:2: (otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:266:4: otherlv_3= 'x' ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )?
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGlobalPosition484); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGlobalPositionAccess().getXKeyword_3_0());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:270:1: ( (lv_coordinateRanges_4_0= ruleCoordinateRange ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==17) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:271:1: (lv_coordinateRanges_4_0= ruleCoordinateRange )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:271:1: (lv_coordinateRanges_4_0= ruleCoordinateRange )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:272:3: lv_coordinateRanges_4_0= ruleCoordinateRange
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGlobalPositionAccess().getCoordinateRangesCoordinateRangeParserRuleCall_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_ruleGlobalPosition505);
            	            lv_coordinateRanges_4_0=ruleCoordinateRange();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGlobalPositionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"coordinateRanges",
            	                    		lv_coordinateRanges_4_0, 
            	                    		"CoordinateRange");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGlobalPosition520); 

                	newLeafNode(otherlv_5, grammarAccess.getGlobalPositionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleGlobalPosition"


    // $ANTLR start "entryRuleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:300:1: entryRuleCoordinateRange returns [EObject current=null] : iv_ruleCoordinateRange= ruleCoordinateRange EOF ;
    public final EObject entryRuleCoordinateRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinateRange = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:301:2: (iv_ruleCoordinateRange= ruleCoordinateRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:302:2: iv_ruleCoordinateRange= ruleCoordinateRange EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange556);
            iv_ruleCoordinateRange=ruleCoordinateRange();

            state._fsp--;

             current =iv_ruleCoordinateRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRange566); 

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
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:309:1: ruleCoordinateRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerCoordinate_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperCoordinate_3_0= ruleEInt ) ) otherlv_4= ']' ) ;
    public final EObject ruleCoordinateRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerCoordinate_1_0 = null;

        AntlrDatatypeRuleToken lv_upperCoordinate_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:312:28: ( (otherlv_0= '[' ( (lv_lowerCoordinate_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperCoordinate_3_0= ruleEInt ) ) otherlv_4= ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:313:1: (otherlv_0= '[' ( (lv_lowerCoordinate_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperCoordinate_3_0= ruleEInt ) ) otherlv_4= ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:313:1: (otherlv_0= '[' ( (lv_lowerCoordinate_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperCoordinate_3_0= ruleEInt ) ) otherlv_4= ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:313:3: otherlv_0= '[' ( (lv_lowerCoordinate_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_upperCoordinate_3_0= ruleEInt ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCoordinateRange603); 

                	newLeafNode(otherlv_0, grammarAccess.getCoordinateRangeAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:317:1: ( (lv_lowerCoordinate_1_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:318:1: (lv_lowerCoordinate_1_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:318:1: (lv_lowerCoordinate_1_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:319:3: lv_lowerCoordinate_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getCoordinateRangeAccess().getLowerCoordinateEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCoordinateRange624);
            lv_lowerCoordinate_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinateRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerCoordinate",
                    		lv_lowerCoordinate_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCoordinateRange636); 

                	newLeafNode(otherlv_2, grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:339:1: ( (lv_upperCoordinate_3_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:340:1: (lv_upperCoordinate_3_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:340:1: (lv_upperCoordinate_3_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:341:3: lv_upperCoordinate_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getCoordinateRangeAccess().getUpperCoordinateEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCoordinateRange657);
            lv_upperCoordinate_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinateRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperCoordinate",
                    		lv_upperCoordinate_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCoordinateRange669); 

                	newLeafNode(otherlv_4, grammarAccess.getCoordinateRangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleCoordinateRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:369:1: entryRuleLiteralsExpression returns [EObject current=null] : iv_ruleLiteralsExpression= ruleLiteralsExpression EOF ;
    public final EObject entryRuleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralsExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:370:2: (iv_ruleLiteralsExpression= ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:371:2: iv_ruleLiteralsExpression= ruleLiteralsExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression705);
            iv_ruleLiteralsExpression=ruleLiteralsExpression();

            state._fsp--;

             current =iv_ruleLiteralsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression715); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:378:1: ruleLiteralsExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral ) ;
    public final EObject ruleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Conditional_1 = null;

        EObject this_PositionLiteral_3 = null;

        EObject this_IntegerLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:381:28: ( ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:382:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:382:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
            case 32:
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
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:382:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:382:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:382:4: otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLiteralsExpression753); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleLiteralsExpression775);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLiteralsExpression786); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:401:5: this_PositionLiteral_3= rulePositionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_ruleLiteralsExpression815);
                    this_PositionLiteral_3=rulePositionLiteral();

                    state._fsp--;

                     
                            current = this_PositionLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:411:5: this_IntegerLiteral_4= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression842);
                    this_IntegerLiteral_4=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_4; 
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


    // $ANTLR start "entryRulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:427:1: entryRulePositionLiteral returns [EObject current=null] : iv_rulePositionLiteral= rulePositionLiteral EOF ;
    public final EObject entryRulePositionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:428:2: (iv_rulePositionLiteral= rulePositionLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:429:2: iv_rulePositionLiteral= rulePositionLiteral EOF
            {
             newCompositeNode(grammarAccess.getPositionLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral877);
            iv_rulePositionLiteral=rulePositionLiteral();

            state._fsp--;

             current =iv_rulePositionLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionLiteral887); 

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
    // $ANTLR end "entryRulePositionLiteral"


    // $ANTLR start "rulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:436:1: rulePositionLiteral returns [EObject current=null] : ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' ) ;
    public final EObject rulePositionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_dimensionIndex_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:439:28: ( ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:440:1: ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:440:1: ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:440:2: () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:440:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:441:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePositionLiteral933); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePositionLiteral945); 

                	newLeafNode(otherlv_2, grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:454:1: ( (lv_dimensionIndex_3_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:455:1: (lv_dimensionIndex_3_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:455:1: (lv_dimensionIndex_3_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:456:3: lv_dimensionIndex_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePositionLiteral966);
            lv_dimensionIndex_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPositionLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"dimensionIndex",
                    		lv_dimensionIndex_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePositionLiteral978); 

                	newLeafNode(otherlv_4, grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "rulePositionLiteral"


    // $ANTLR start "entryRuleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:484:1: entryRuleRegularGeometry returns [EObject current=null] : iv_ruleRegularGeometry= ruleRegularGeometry EOF ;
    public final EObject entryRuleRegularGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularGeometry = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:485:2: (iv_ruleRegularGeometry= ruleRegularGeometry EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:486:2: iv_ruleRegularGeometry= ruleRegularGeometry EOF
            {
             newCompositeNode(grammarAccess.getRegularGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry1014);
            iv_ruleRegularGeometry=ruleRegularGeometry();

            state._fsp--;

             current =iv_ruleRegularGeometry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegularGeometry1024); 

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
    // $ANTLR end "entryRuleRegularGeometry"


    // $ANTLR start "ruleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:493:1: ruleRegularGeometry returns [EObject current=null] : ( () otherlv_1= 'regularGeometry' ( (lv_neighborsNumber_2_0= ruleEInt ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleRegularGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_neighborsNumber_2_0 = null;

        EObject lv_dimensions_4_0 = null;

        EObject lv_dimensions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:496:28: ( ( () otherlv_1= 'regularGeometry' ( (lv_neighborsNumber_2_0= ruleEInt ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:497:1: ( () otherlv_1= 'regularGeometry' ( (lv_neighborsNumber_2_0= ruleEInt ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:497:1: ( () otherlv_1= 'regularGeometry' ( (lv_neighborsNumber_2_0= ruleEInt ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:497:2: () otherlv_1= 'regularGeometry' ( (lv_neighborsNumber_2_0= ruleEInt ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:497:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:498:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRegularGeometry1070); 

                	newLeafNode(otherlv_1, grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:507:1: ( (lv_neighborsNumber_2_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:508:1: (lv_neighborsNumber_2_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:508:1: (lv_neighborsNumber_2_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:509:3: lv_neighborsNumber_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getNeighborsNumberEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRegularGeometry1091);
            lv_neighborsNumber_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	        }
                   		set(
                   			current, 
                   			"neighborsNumber",
                    		lv_neighborsNumber_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRegularGeometry1103); 

                	newLeafNode(otherlv_3, grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:529:1: ( (lv_dimensions_4_0= ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:530:1: (lv_dimensions_4_0= ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:530:1: (lv_dimensions_4_0= ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:531:3: lv_dimensions_4_0= ruleDimension
            {
             
            	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_ruleRegularGeometry1124);
            lv_dimensions_4_0=ruleDimension();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	        }
                   		add(
                   			current, 
                   			"dimensions",
                    		lv_dimensions_4_0, 
                    		"Dimension");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:2: (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:4: otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegularGeometry1137); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRegularGeometryAccess().getXKeyword_5_0());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:551:1: ( (lv_dimensions_6_0= ruleDimension ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:552:1: (lv_dimensions_6_0= ruleDimension )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:552:1: (lv_dimensions_6_0= ruleDimension )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:553:3: lv_dimensions_6_0= ruleDimension
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDimension_in_ruleRegularGeometry1158);
            	    lv_dimensions_6_0=ruleDimension();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_6_0, 
            	            		"Dimension");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRegularGeometry1172); 

                	newLeafNode(otherlv_7, grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRegularGeometry"


    // $ANTLR start "entryRuleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:581:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:582:2: (iv_ruleDimension= ruleDimension EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:583:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_entryRuleDimension1208);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimension1218); 

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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:590:1: ruleDimension returns [EObject current=null] : ( ( () ( (lv_size_1_0= ruleEInt ) ) ) | ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token lv_isCircular_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_size_1_0 = null;

        AntlrDatatypeRuleToken lv_size_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:593:28: ( ( ( () ( (lv_size_1_0= ruleEInt ) ) ) | ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:1: ( ( () ( (lv_size_1_0= ruleEInt ) ) ) | ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:1: ( ( () ( (lv_size_1_0= ruleEInt ) ) ) | ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:2: ( () ( (lv_size_1_0= ruleEInt ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:2: ( () ( (lv_size_1_0= ruleEInt ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:3: () ( (lv_size_1_0= ruleEInt ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:594:3: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:595:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDimensionAccess().getDimensionAction_0_0(),
                                current);
                        

                    }

                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:600:2: ( (lv_size_1_0= ruleEInt ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:601:1: (lv_size_1_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:601:1: (lv_size_1_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:602:3: lv_size_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDimension1274);
                    lv_size_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDimensionRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:619:6: ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:619:6: ( ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:619:7: ( (lv_isCircular_2_0= '(' ) ) ( (lv_size_3_0= ruleEInt ) ) otherlv_4= ')'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:619:7: ( (lv_isCircular_2_0= '(' ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:620:1: (lv_isCircular_2_0= '(' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:620:1: (lv_isCircular_2_0= '(' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:621:3: lv_isCircular_2_0= '('
                    {
                    lv_isCircular_2_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDimension1300); 

                            newLeafNode(lv_isCircular_2_0, grammarAccess.getDimensionAccess().getIsCircularLeftParenthesisKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDimensionRule());
                    	        }
                           		setWithLastConsumed(current, "isCircular", true, "(");
                    	    

                    }


                    }

                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:634:2: ( (lv_size_3_0= ruleEInt ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:635:1: (lv_size_3_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:635:1: (lv_size_3_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:636:3: lv_size_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDimensionAccess().getSizeEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDimension1334);
                    lv_size_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDimensionRule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDimension1346); 

                        	newLeafNode(otherlv_4, grammarAccess.getDimensionAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:664:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:665:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:666:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional1383);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional1393); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:673:1: ruleConditional returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) ;
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
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:676:28: ( (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:677:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:677:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==20||LA9_0==22||LA9_0==32||LA9_0==36) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:678:5: this_OrExpression_0= ruleOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleConditional1440);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;

                     
                            current = this_OrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:687:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:687:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:687:7: () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:687:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:688:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalAccess().getConditionalAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConditional1467); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getIfKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:697:1: ( (lv_condition_3_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:698:1: (lv_condition_3_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:698:1: (lv_condition_3_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:699:3: lv_condition_3_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1488);
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

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1500); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:719:1: ( (lv_ifTrueExpression_5_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:720:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:720:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:721:3: lv_ifTrueExpression_5_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1521);
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

                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditional1533); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5());
                        
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConditional1545); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_1_6());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1557); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:749:1: ( (lv_ifFalseExpression_9_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:750:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:750:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:751:3: lv_ifFalseExpression_9_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1578);
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

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditional1590); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:779:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:780:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:781:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression1627);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression1637); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:788:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:791:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:792:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:792:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:793:5: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1684);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:801:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:801:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:801:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:802:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOrExpression1705); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:811:1: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:812:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:812:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:813:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1726);
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
            	    break loop10;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:837:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:838:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:839:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression1764);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression1774); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:846:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:849:28: ( (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:850:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:850:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:851:5: this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1821);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;

             
                    current = this_EqualExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:859:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:859:2: () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:859:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:860:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAndExpression1842); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:869:1: ( (lv_right_3_0= ruleEqualExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:870:1: (lv_right_3_0= ruleEqualExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:870:1: (lv_right_3_0= ruleEqualExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:871:3: lv_right_3_0= ruleEqualExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1863);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:895:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:896:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:897:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1901);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression1911); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:904:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:907:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:908:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:908:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:909:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1958);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:917:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:917:2: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:917:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:918:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEqualExpression1979); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:927:1: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:928:1: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:928:1: (lv_right_3_0= ruleComparisonExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:929:3: lv_right_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2000);
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
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:953:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:954:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:955:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2038);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression2048); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:962:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:965:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:966:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:966:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:967:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2095);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==29) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==30) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:3: ( () otherlv_2= '>' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:3: ( () otherlv_2= '>' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:4: () otherlv_2= '>'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:975:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:976:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleComparisonExpression2118); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:986:6: ( () otherlv_4= '<' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:986:6: ( () otherlv_4= '<' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:986:7: () otherlv_4= '<'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:986:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:987:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComparisonExpression2147); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:996:3: ( (lv_right_5_0= ruleAddExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:997:1: (lv_right_5_0= ruleAddExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:997:1: (lv_right_5_0= ruleAddExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:998:3: lv_right_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2170);
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
            	    break loop14;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1022:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1023:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1024:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2208);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2218); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1031:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1034:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1035:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1035:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1036:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2265);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==31) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==32) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:3: ( () otherlv_2= '+' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:4: () otherlv_2= '+'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1044:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1045:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAddExpression2288); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1055:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1055:6: ( () otherlv_4= '-' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1055:7: () otherlv_4= '-'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1055:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1056:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAddExpression2317); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1065:3: ( (lv_right_5_0= ruleMultExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1066:1: (lv_right_5_0= ruleMultExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1066:1: (lv_right_5_0= ruleMultExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1067:3: lv_right_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2340);
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
            	    break loop16;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1091:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1092:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1093:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2378);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2388); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1100:1: ruleMultExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1103:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1104:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1104:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1105:5: this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2435);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:3: ( () otherlv_2= '*' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:4: () otherlv_2= '*'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1113:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1114:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultExpression2458); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1124:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1124:6: ( () otherlv_4= '/' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1124:7: () otherlv_4= '/'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1124:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1125:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultExpression2487); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1135:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1135:6: ( () otherlv_6= '%' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1135:7: () otherlv_6= '%'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1135:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1136:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultExpression2516); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1145:3: ( (lv_right_7_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1146:1: (lv_right_7_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1146:1: (lv_right_7_0= ruleUnaryExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1147:3: lv_right_7_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2539);
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
            	    break loop18;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1171:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1172:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1173:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2577);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2587); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1180:1: ruleUnaryExpression returns [EObject current=null] : (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_LiteralsExpression_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_target_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1183:28: ( (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1184:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1184:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 20:
            case 22:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==20||LA19_2==22||LA19_2==32) ) {
                    alt19=3;
                }
                else if ( (LA19_2==RULE_INT) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1185:5: this_LiteralsExpression_0= ruleLiteralsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2634);
                    this_LiteralsExpression_0=ruleLiteralsExpression();

                    state._fsp--;

                     
                            current = this_LiteralsExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1194:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1194:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1194:7: () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1194:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1195:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUnaryExpression2661); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1204:1: ( (lv_target_3_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1205:1: (lv_target_3_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1205:1: (lv_target_3_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1206:3: lv_target_3_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2682);
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
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1223:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1223:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1223:7: () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1223:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1224:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUnaryExpression2711); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1233:1: ( (lv_target_6_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1234:1: (lv_target_6_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1234:1: (lv_target_6_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1235:3: lv_target_6_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2732);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1259:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1260:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1261:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2769);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral2779); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1268:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1271:28: ( ( (lv_val_0_0= ruleEInt ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1272:1: ( (lv_val_0_0= ruleEInt ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1272:1: ( (lv_val_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1273:1: (lv_val_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1273:1: (lv_val_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1274:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerLiteral2824);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1298:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1299:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1300:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2860);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2871); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1307:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1310:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1311:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1311:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1311:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1311:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1312:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEInt2910); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2927); 

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
        public static final BitSet FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomataInitialization85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_ruleCellularAutomataInitialization140 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomataInitialization162 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomataInitialization183 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRule267 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_ruleGlobalPosition_in_ruleRule288 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule301 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRule313 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRule325 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleRule346 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRule358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGlobalPosition_in_entryRuleGlobalPosition394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGlobalPosition404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGlobalPosition450 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_ruleGlobalPosition471 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleGlobalPosition484 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_ruleGlobalPosition505 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleGlobalPosition520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRange566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleCoordinateRange603 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCoordinateRange624 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCoordinateRange636 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCoordinateRange657 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCoordinateRange669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleLiteralsExpression753 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleLiteralsExpression775 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLiteralsExpression786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_ruleLiteralsExpression815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionLiteral887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePositionLiteral933 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePositionLiteral945 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePositionLiteral966 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePositionLiteral978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry1014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegularGeometry1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleRegularGeometry1070 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRegularGeometry1091 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRegularGeometry1103 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleDimension_in_ruleRegularGeometry1124 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRegularGeometry1137 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleDimension_in_ruleRegularGeometry1158 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRegularGeometry1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension1208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimension1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDimension1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDimension1300 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDimension1334 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleDimension1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleConditional1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleConditional1467 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1488 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1500 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1521 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConditional1533 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleConditional1545 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1557 = new BitSet(new long[]{0x0000001101500010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1578 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConditional1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1684 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleOrExpression1705 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1726 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1821 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAndExpression1842 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1863 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1958 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEqualExpression1979 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2000 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2095 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleComparisonExpression2118 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_30_in_ruleComparisonExpression2147 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2170 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2265 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_31_in_ruleAddExpression2288 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_32_in_ruleAddExpression2317 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2340 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2435 = new BitSet(new long[]{0x0000000E00000002L});
        public static final BitSet FOLLOW_33_in_ruleMultExpression2458 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_34_in_ruleMultExpression2487 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_35_in_ruleMultExpression2516 = new BitSet(new long[]{0x0000001100500010L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2539 = new BitSet(new long[]{0x0000000E00000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUnaryExpression2661 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleUnaryExpression2711 = new BitSet(new long[]{0x0000000100500010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerLiteral2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEInt2910 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2927 = new BitSet(new long[]{0x0000000000000002L});
    }


}