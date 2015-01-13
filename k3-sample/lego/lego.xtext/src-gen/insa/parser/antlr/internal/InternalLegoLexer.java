package insa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegoLexer extends Lexer {
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

    public InternalLegoLexer() {;} 
    public InternalLegoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLegoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:11:7: ( 'while' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:11:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:12:7: ( 'do' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:12:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:13:7: ( 'end' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:13:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:14:7: ( 'not' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:14:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:15:7: ( 'and' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:15:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:16:7: ( 'if' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:16:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:17:7: ( 'then' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:17:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:18:7: ( 'else' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:18:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:19:7: ( 'hasTurned' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:19:9: 'hasTurned'
            {
            match("hasTurned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:20:7: ( '(' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:21:7: ( 'angle' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:21:9: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:22:7: ( '=' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:23:7: ( ')' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:24:7: ( 'move' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:24:9: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:25:7: ( 'power' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:25:9: 'power'
            {
            match("power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:26:7: ( 'display' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:26:9: 'display'
            {
            match("display"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:27:7: ( 'msg' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:27:9: 'msg'
            {
            match("msg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:28:7: ( ',' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:29:7: ( 'duration' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:29:9: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:30:7: ( 'line' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:30:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:31:7: ( 'col' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:31:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:32:7: ( 'setTurnAngle' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:32:9: 'setTurnAngle'
            {
            match("setTurnAngle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:33:7: ( 'stopEngine' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:33:9: 'stopEngine'
            {
            match("stopEngine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:34:7: ( 'stopProgram' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:34:9: 'stopProgram'
            {
            match("stopProgram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:35:7: ( 'turn' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:35:9: 'turn'
            {
            match("turn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:36:7: ( 'obstacle' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:36:9: 'obstacle'
            {
            match("obstacle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:37:7: ( 'distance' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:37:9: 'distance'
            {
            match("distance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:38:7: ( 'true' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:38:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:39:7: ( 'false' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:39:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1171:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1173:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1173:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1173:24: ( options {greedy=false; } : . )*
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
            	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1173:52: .
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
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:41: ( '\\r' )? '\\n'
                    {
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1175:41: '\\r'
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
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1177:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1177:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1177:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1179:21: ( '0' .. '9' )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1179:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1181:13: ( RULE_INT '.' ( RULE_DIGIT )* )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1181:15: RULE_INT '.' ( RULE_DIGIT )*
            {
            mRULE_INT(); 
            match('.'); 
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1181:28: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1181:28: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='1' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:26: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1183:26: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
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
    // $ANTLR end "RULE_INT"

    public void mTokens() throws RecognitionException {
        // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOUBLE | RULE_INT )
        int alt12=35;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:184: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:196: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:212: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:228: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:236: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 35 :
                // ../lego.xtext/src-gen/insa/parser/antlr/internal/InternalLego.g:1:248: RULE_INT
                {
                mRULE_INT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\27\uffff\2\50\21\uffff\1\50\11\uffff";
    static final String DFA12_eofS =
        "\64\uffff";
    static final String DFA12_minS =
        "\1\11\1\uffff\1\151\1\154\1\uffff\1\156\1\uffff\1\150\4\uffff\1"+
        "\157\4\uffff\1\145\3\uffff\1\52\1\uffff\2\56\1\uffff\1\163\3\uffff"+
        "\1\144\6\uffff\1\157\4\uffff\1\56\1\160\2\uffff\1\160\2\uffff\1"+
        "\105\2\uffff";
    static final String DFA12_maxS =
        "\1\167\1\uffff\1\165\1\156\1\uffff\1\156\1\uffff\1\165\4\uffff\1"+
        "\163\4\uffff\1\164\3\uffff\1\57\1\uffff\1\56\1\71\1\uffff\1\163"+
        "\3\uffff\1\147\6\uffff\1\157\4\uffff\1\71\1\164\2\uffff\1\160\2"+
        "\uffff\1\120\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\uffff\1\6\1\uffff\1\11\1\12\1\14\1\15"+
        "\1\uffff\1\17\1\22\1\24\1\25\1\uffff\1\32\1\35\1\36\1\uffff\1\41"+
        "\2\uffff\1\2\1\uffff\1\23\1\3\1\10\1\uffff\1\7\1\31\1\34\1\16\1"+
        "\21\1\26\1\uffff\1\37\1\40\1\43\1\42\2\uffff\1\5\1\13\1\uffff\1"+
        "\20\1\33\1\uffff\1\27\1\30";
    static final String DFA12_specialS =
        "\64\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\1\uffff\1\24\4\uffff\1\24\1"+
            "\11\1\13\2\uffff\1\16\2\uffff\1\25\1\27\11\30\3\uffff\1\12\43"+
            "\uffff\1\5\1\uffff\1\20\1\2\1\3\1\23\1\uffff\1\10\1\6\2\uffff"+
            "\1\17\1\14\1\4\1\22\1\15\2\uffff\1\21\1\7\2\uffff\1\1",
            "",
            "\1\32\5\uffff\1\31\5\uffff\1\33",
            "\1\35\1\uffff\1\34",
            "",
            "\1\36",
            "",
            "\1\37\11\uffff\1\41\2\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\42\3\uffff\1\43",
            "",
            "",
            "",
            "",
            "\1\44\16\uffff\1\45",
            "",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "",
            "\1\51",
            "\1\51\1\uffff\12\52",
            "",
            "\1\53",
            "",
            "",
            "",
            "\1\54\2\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "",
            "",
            "",
            "\1\51\1\uffff\12\52",
            "\1\57\3\uffff\1\60",
            "",
            "",
            "\1\61",
            "",
            "",
            "\1\62\12\uffff\1\63",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOUBLE | RULE_INT );";
        }
    }
 

}