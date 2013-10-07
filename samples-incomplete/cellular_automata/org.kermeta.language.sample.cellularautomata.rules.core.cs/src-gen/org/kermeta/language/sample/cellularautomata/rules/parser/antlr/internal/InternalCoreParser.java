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
import org.kermeta.language.sample.cellularautomata.rules.services.CoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoreParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g"; }



     	private CoreGrammarAccess grammarAccess;
     	
        public InternalCoreParser(TokenStream input, CoreGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Rule";	
       	}
       	
       	@Override
       	protected CoreGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:67:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:68:2: (iv_ruleRule= ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:69:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule75);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule85); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:76:1: ruleRule returns [EObject current=null] : (otherlv_0= 'when' otherlv_1= 'value' otherlv_2= '=' ( (lv_evaluatedVal_3_0= ruleConditional ) ) otherlv_4= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_evaluatedVal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:79:28: ( (otherlv_0= 'when' otherlv_1= 'value' otherlv_2= '=' ( (lv_evaluatedVal_3_0= ruleConditional ) ) otherlv_4= ';' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:80:1: (otherlv_0= 'when' otherlv_1= 'value' otherlv_2= '=' ( (lv_evaluatedVal_3_0= ruleConditional ) ) otherlv_4= ';' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:80:1: (otherlv_0= 'when' otherlv_1= 'value' otherlv_2= '=' ( (lv_evaluatedVal_3_0= ruleConditional ) ) otherlv_4= ';' )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:80:3: otherlv_0= 'when' otherlv_1= 'value' otherlv_2= '=' ( (lv_evaluatedVal_3_0= ruleConditional ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRule122); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getWhenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule134); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getValueKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRule146); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getEqualsSignKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:92:1: ( (lv_evaluatedVal_3_0= ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:93:1: (lv_evaluatedVal_3_0= ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:93:1: (lv_evaluatedVal_3_0= ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:94:3: lv_evaluatedVal_3_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleRule167);
            lv_evaluatedVal_3_0=ruleConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"evaluatedVal",
                    		lv_evaluatedVal_3_0, 
                    		"Conditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRule179); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:122:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:123:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:124:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional215);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional225); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:131:1: ruleConditional returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) ;
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
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:134:28: ( (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:135:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:135:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
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
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:136:5: this_OrExpression_0= ruleOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleConditional272);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;

                     
                            current = this_OrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:145:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:145:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:145:7: () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:145:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:146:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalAccess().getConditionalAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditional299); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getIfKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:155:1: ( (lv_condition_3_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:156:1: (lv_condition_3_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:156:1: (lv_condition_3_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:157:3: lv_condition_3_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional320);
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

                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConditional332); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:177:1: ( (lv_ifTrueExpression_5_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:178:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:178:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:179:3: lv_ifTrueExpression_5_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional353);
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConditional365); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5());
                        
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConditional377); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_1_6());
                        
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConditional389); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:207:1: ( (lv_ifFalseExpression_9_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:208:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:208:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:209:3: lv_ifFalseExpression_9_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional410);
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

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConditional422); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:237:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:238:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:239:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression459);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression469); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:246:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:249:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:250:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:250:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:251:5: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression516);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:259:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:259:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:259:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:260:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOrExpression537); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:269:1: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:270:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:270:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:271:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression558);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:295:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:296:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:297:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression596);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression606); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:304:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:307:28: ( (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:308:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:308:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:309:5: this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression653);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;

             
                    current = this_EqualExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:317:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:317:2: () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:317:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:318:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAndExpression674); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:327:1: ( (lv_right_3_0= ruleEqualExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:328:1: (lv_right_3_0= ruleEqualExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:328:1: (lv_right_3_0= ruleEqualExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:329:3: lv_right_3_0= ruleEqualExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression695);
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
            	    break loop3;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:353:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:354:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:355:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression733);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression743); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:362:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:365:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:366:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:366:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:367:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression790);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:375:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:375:2: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:375:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:376:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEqualExpression811); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:385:1: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:386:1: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:386:1: (lv_right_3_0= ruleComparisonExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:387:3: lv_right_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression832);
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
            	    break loop4;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:411:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:412:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:413:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression870);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression880); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:420:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:423:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:424:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:424:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:425:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression927);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==22) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==23) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:3: ( () otherlv_2= '>' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:3: ( () otherlv_2= '>' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:4: () otherlv_2= '>'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:433:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:434:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleComparisonExpression950); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:444:6: ( () otherlv_4= '<' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:444:6: ( () otherlv_4= '<' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:444:7: () otherlv_4= '<'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:444:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:445:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComparisonExpression979); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:454:3: ( (lv_right_5_0= ruleAddExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:455:1: (lv_right_5_0= ruleAddExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:455:1: (lv_right_5_0= ruleAddExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:456:3: lv_right_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression1002);
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
            	    break loop6;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:480:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:481:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:482:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1040);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1050); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:489:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:492:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:493:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:493:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:494:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression1097);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==24) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==25) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:3: ( () otherlv_2= '+' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:4: () otherlv_2= '+'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:502:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:503:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAddExpression1120); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:513:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:513:6: ( () otherlv_4= '-' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:513:7: () otherlv_4= '-'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:513:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:514:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAddExpression1149); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:523:3: ( (lv_right_5_0= ruleMultExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:524:1: (lv_right_5_0= ruleMultExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:524:1: (lv_right_5_0= ruleMultExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:525:3: lv_right_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression1172);
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
            	    break loop8;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:549:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:550:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:551:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression1210);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression1220); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:558:1: ruleMultExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:561:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:562:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:562:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:563:5: this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression1267);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:3: ( () otherlv_2= '*' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:4: () otherlv_2= '*'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:571:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:572:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultExpression1290); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:582:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:582:6: ( () otherlv_4= '/' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:582:7: () otherlv_4= '/'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:582:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:583:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultExpression1319); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:593:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:593:6: ( () otherlv_6= '%' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:593:7: () otherlv_6= '%'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:593:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:594:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultExpression1348); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:603:3: ( (lv_right_7_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:604:1: (lv_right_7_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:604:1: (lv_right_7_0= ruleUnaryExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:605:3: lv_right_7_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression1371);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:629:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:630:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:631:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1409);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression1419); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:638:1: ruleUnaryExpression returns [EObject current=null] : (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_LiteralsExpression_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_target_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:641:28: ( (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:642:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:642:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 30:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==25||LA11_2==30) ) {
                    alt11=3;
                }
                else if ( (LA11_2==RULE_INT) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:643:5: this_LiteralsExpression_0= ruleLiteralsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1466);
                    this_LiteralsExpression_0=ruleLiteralsExpression();

                    state._fsp--;

                     
                            current = this_LiteralsExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:652:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:652:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:652:7: () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:652:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:653:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleUnaryExpression1493); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:662:1: ( (lv_target_3_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:663:1: (lv_target_3_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:663:1: (lv_target_3_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:664:3: lv_target_3_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1514);
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
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:681:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:681:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:681:7: () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:681:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:682:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleUnaryExpression1543); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:691:1: ( (lv_target_6_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:692:1: (lv_target_6_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:692:1: (lv_target_6_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:693:3: lv_target_6_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1564);
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


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:717:1: entryRuleLiteralsExpression returns [EObject current=null] : iv_ruleLiteralsExpression= ruleLiteralsExpression EOF ;
    public final EObject entryRuleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralsExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:718:2: (iv_ruleLiteralsExpression= ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:719:2: iv_ruleLiteralsExpression= ruleLiteralsExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression1601);
            iv_ruleLiteralsExpression=ruleLiteralsExpression();

            state._fsp--;

             current =iv_ruleLiteralsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression1611); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:726:1: ruleLiteralsExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_IntegerLiteral_3= ruleIntegerLiteral ) ;
    public final EObject ruleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Conditional_1 = null;

        EObject this_IntegerLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:729:28: ( ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_IntegerLiteral_3= ruleIntegerLiteral ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:730:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_IntegerLiteral_3= ruleIntegerLiteral )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:730:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_IntegerLiteral_3= ruleIntegerLiteral )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT||LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:730:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:730:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:730:4: otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLiteralsExpression1649); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleLiteralsExpression1671);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLiteralsExpression1682); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:749:5: this_IntegerLiteral_3= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression1711);
                    this_IntegerLiteral_3=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_3; 
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:765:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:766:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:767:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1746);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral1756); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:774:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:777:28: ( ( (lv_val_0_0= ruleEInt ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:778:1: ( (lv_val_0_0= ruleEInt ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:778:1: ( (lv_val_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:779:1: (lv_val_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:779:1: (lv_val_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:780:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerLiteral1801);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:804:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:805:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:806:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1837);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1848); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:813:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:816:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:817:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:817:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:817:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:817:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.core.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalCore.g:818:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt1887); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1904); 

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
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRule122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRule146 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleRule167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRule179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleConditional272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleConditional299 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional320 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConditional332 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional353 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConditional365 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConditional377 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConditional389 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional410 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConditional422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression516 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleOrExpression537 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression558 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression653 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleAndExpression674 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression695 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression790 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleEqualExpression811 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression832 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression927 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_22_in_ruleComparisonExpression950 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_23_in_ruleComparisonExpression979 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression1002 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression1097 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_24_in_ruleAddExpression1120 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_25_in_ruleAddExpression1149 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression1172 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression1210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression1267 = new BitSet(new long[]{0x000000001C000002L});
        public static final BitSet FOLLOW_26_in_ruleMultExpression1290 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_27_in_ruleMultExpression1319 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_28_in_ruleMultExpression1348 = new BitSet(new long[]{0x0000000062000010L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression1371 = new BitSet(new long[]{0x000000001C000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleUnaryExpression1493 = new BitSet(new long[]{0x0000000042000010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleUnaryExpression1543 = new BitSet(new long[]{0x0000000042000010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression1601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLiteralsExpression1649 = new BitSet(new long[]{0x0000000062008010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleLiteralsExpression1671 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLiteralsExpression1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerLiteral1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt1887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1904 = new BitSet(new long[]{0x0000000000000002L});
    }


}