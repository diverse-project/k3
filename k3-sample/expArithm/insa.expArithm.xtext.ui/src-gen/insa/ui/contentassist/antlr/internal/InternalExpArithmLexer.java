package insa.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpArithmLexer extends Lexer {
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_DOUBLE=4;
    public static final int RULE_ML_COMMENT=5;

    // delegates
    // delegators

    public InternalExpArithmLexer() {;} 
    public InternalExpArithmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExpArithmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:11:6: ( '+' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:11:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:12:6: ( '-' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:12:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:13:7: ( '*' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:14:7: ( '/' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:15: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:826:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:828:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:828:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:828:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:828:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:41: ( '\\r' )? '\\n'
                    {
                    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:830:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:832:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:8: ( T__8 | T__9 | T__10 | T__11 | RULE_DOUBLE | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt9=8;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:32: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 6 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:44: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 7 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:60: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // ../insa.expArithm.xtext.ui/src-gen/insa/ui/contentassist/antlr/internal/InternalExpArithm.g:1:76: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\4\uffff\1\11\5\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\11\3\uffff\1\52\5\uffff";
    static final String DFA9_maxS =
        "\1\71\3\uffff\1\57\5\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\10\1\6\1\7\1\4";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\11\uffff\1\3\1\1\1\uffff\1\2\1"+
            "\uffff\1\4\12\5",
            "",
            "",
            "",
            "\1\7\4\uffff\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | RULE_DOUBLE | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}