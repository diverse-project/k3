// $ANTLR 3.4

	package robot.resource.robot.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RobotLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BOOLEAN_LITERAL=4;
    public static final int INT_LITERAL=5;
    public static final int LINEBREAK=6;
    public static final int STRING_LITERAL=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RobotLexer() {} 
    public RobotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RobotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Robot.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:15:7: ( '(' )
            // Robot.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:16:7: ( ')' )
            // Robot.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:17:7: ( ',' )
            // Robot.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:18:7: ( '=' )
            // Robot.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:19:7: ( 'and' )
            // Robot.g:19:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:20:7: ( 'angle' )
            // Robot.g:20:9: 'angle'
            {
            match("angle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:21:7: ( 'bip' )
            // Robot.g:21:9: 'bip'
            {
            match("bip"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:22:7: ( 'col' )
            // Robot.g:22:9: 'col'
            {
            match("col"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:23:7: ( 'display' )
            // Robot.g:23:9: 'display'
            {
            match("display"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:24:7: ( 'distance' )
            // Robot.g:24:9: 'distance'
            {
            match("distance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:25:7: ( 'do' )
            // Robot.g:25:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:26:7: ( 'duration' )
            // Robot.g:26:9: 'duration'
            {
            match("duration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:27:7: ( 'else' )
            // Robot.g:27:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:28:7: ( 'end' )
            // Robot.g:28:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:29:7: ( 'hasTurned' )
            // Robot.g:29:9: 'hasTurned'
            {
            match("hasTurned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:30:7: ( 'if' )
            // Robot.g:30:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:31:7: ( 'line' )
            // Robot.g:31:9: 'line'
            {
            match("line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:32:7: ( 'move' )
            // Robot.g:32:9: 'move'
            {
            match("move"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:33:7: ( 'msg' )
            // Robot.g:33:9: 'msg'
            {
            match("msg"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:34:7: ( 'not' )
            // Robot.g:34:9: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:35:7: ( 'obstacle' )
            // Robot.g:35:9: 'obstacle'
            {
            match("obstacle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:36:7: ( 'power' )
            // Robot.g:36:9: 'power'
            {
            match("power"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:37:7: ( 'repeat' )
            // Robot.g:37:9: 'repeat'
            {
            match("repeat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:38:7: ( 'setTurnAngle' )
            // Robot.g:38:9: 'setTurnAngle'
            {
            match("setTurnAngle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:39:7: ( 'stopEngine' )
            // Robot.g:39:9: 'stopEngine'
            {
            match("stopEngine"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:40:7: ( 'stopProgram' )
            // Robot.g:40:9: 'stopProgram'
            {
            match("stopProgram"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:41:7: ( 'then' )
            // Robot.g:41:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:42:7: ( 'turn' )
            // Robot.g:42:9: 'turn'
            {
            match("turn"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:43:7: ( 'while' )
            // Robot.g:43:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2494:16: ( ( 'true' | 'false' ) )
            // Robot.g:2495:2: ( 'true' | 'false' )
            {
            // Robot.g:2495:2: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Robot.g:2495:2: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Robot.g:2495:9: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2497:15: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' ) )
            // Robot.g:2498:2: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' )
            {
            // Robot.g:2498:2: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"' )
            // Robot.g:2498:2: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Robot.g:2498:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) |~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't':
                        {
                        alt2=1;
                        }
                        break;
                    case 'u':
                        {
                        alt2=2;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt2=3;
                        }
                        break;

                    }

                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // Robot.g:2498:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 

            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Robot.g:2498:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    {
            	    // Robot.g:2498:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    // Robot.g:2498:48: '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    {
            	    match('\\'); 

            	    match('u'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // Robot.g:2498:169: '\\\\' ( '0' .. '7' )
            	    {
            	    match('\\'); 

            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 4 :
            	    // Robot.g:2498:184: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "INT_LITERAL"
    public final void mINT_LITERAL() throws RecognitionException {
        try {
            int _type = INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2500:12: ( ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ) )
            // Robot.g:2501:2: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            {
            // Robot.g:2501:2: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // Robot.g:2501:2: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // Robot.g:2501:2: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Robot.g:2501:3: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Robot.g:2501:7: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // Robot.g:2501:15: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Robot.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_LITERAL"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2503:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Robot.g:2504:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Robot.g:2504:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Robot.g:2504:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Robot.g:2504:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Robot.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2507:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Robot.g:2508:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Robot.g:2511:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Robot.g:2512:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Robot.g:2512:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Robot.g:2512:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Robot.g:2512:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\n') ) {
                    alt6=1;
                }
                else {
                    alt6=2;
                }
            }
            else if ( (LA6_0=='\n') ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Robot.g:2512:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Robot.g:2512:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Robot.g:2512:19: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Robot.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | BOOLEAN_LITERAL | STRING_LITERAL | INT_LITERAL | TEXT | WHITESPACE | LINEBREAK )
        int alt7=35;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Robot.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // Robot.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // Robot.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // Robot.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // Robot.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // Robot.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // Robot.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // Robot.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // Robot.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // Robot.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // Robot.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // Robot.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // Robot.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // Robot.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // Robot.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // Robot.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // Robot.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // Robot.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // Robot.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // Robot.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // Robot.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // Robot.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // Robot.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // Robot.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // Robot.g:1:154: T__34
                {
                mT__34(); 


                }
                break;
            case 26 :
                // Robot.g:1:160: T__35
                {
                mT__35(); 


                }
                break;
            case 27 :
                // Robot.g:1:166: T__36
                {
                mT__36(); 


                }
                break;
            case 28 :
                // Robot.g:1:172: T__37
                {
                mT__37(); 


                }
                break;
            case 29 :
                // Robot.g:1:178: T__38
                {
                mT__38(); 


                }
                break;
            case 30 :
                // Robot.g:1:184: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 


                }
                break;
            case 31 :
                // Robot.g:1:200: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 32 :
                // Robot.g:1:215: INT_LITERAL
                {
                mINT_LITERAL(); 


                }
                break;
            case 33 :
                // Robot.g:1:227: TEXT
                {
                mTEXT(); 


                }
                break;
            case 34 :
                // Robot.g:1:232: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 35 :
                // Robot.g:1:243: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\5\uffff\21\31\1\uffff\2\64\3\uffff\4\31\1\73\4\31\1\100\16\31\1"+
        "\uffff\1\64\1\117\1\31\1\121\1\122\1\31\1\uffff\2\31\1\127\1\31"+
        "\1\uffff\2\31\1\133\1\134\12\31\1\uffff\1\31\2\uffff\3\31\1\153"+
        "\1\uffff\1\31\1\155\1\156\2\uffff\5\31\1\165\1\166\1\167\2\31\1"+
        "\172\3\31\1\uffff\1\31\2\uffff\1\31\1\u0080\4\31\3\uffff\1\u0085"+
        "\1\167\1\uffff\5\31\1\uffff\1\u008b\3\31\1\uffff\1\u008f\4\31\1"+
        "\uffff\3\31\1\uffff\1\u0097\1\u0098\1\31\1\u009a\3\31\2\uffff\1"+
        "\u009e\1\uffff\3\31\1\uffff\1\31\1\u00a3\2\31\1\uffff\1\u00a6\1"+
        "\u00a7\2\uffff";
    static final String DFA7_eofS =
        "\u00a8\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\1\156\1\151\1\157\1\151\1\154\1\141\1\146\1\151\2"+
        "\157\1\142\1\157\2\145\2\150\1\141\1\uffff\2\55\3\uffff\1\144\1"+
        "\160\1\154\1\163\1\55\1\162\1\163\1\144\1\163\1\55\1\156\1\166\1"+
        "\147\1\164\1\163\1\167\1\160\1\164\1\157\1\145\1\162\1\165\1\151"+
        "\1\154\1\uffff\2\55\1\154\2\55\1\160\1\uffff\1\141\1\145\1\55\1"+
        "\124\1\uffff\2\145\2\55\1\164\2\145\1\124\1\160\2\156\1\145\1\154"+
        "\1\163\1\uffff\1\145\2\uffff\1\154\1\141\1\164\1\55\1\uffff\1\165"+
        "\2\55\2\uffff\1\141\1\162\1\141\1\165\1\105\3\55\2\145\1\55\1\141"+
        "\1\156\1\151\1\uffff\1\162\2\uffff\1\143\1\55\1\164\1\162\1\156"+
        "\1\162\3\uffff\2\55\1\uffff\1\171\1\143\1\157\1\156\1\154\1\uffff"+
        "\1\55\1\156\1\147\1\157\1\uffff\1\55\1\145\1\156\2\145\1\uffff\1"+
        "\101\1\151\1\147\1\uffff\2\55\1\144\1\55\2\156\1\162\2\uffff\1\55"+
        "\1\uffff\1\147\1\145\1\141\1\uffff\1\154\1\55\1\155\1\145\1\uffff"+
        "\2\55\2\uffff";
    static final String DFA7_maxS =
        "\1\172\4\uffff\1\156\1\151\1\157\1\165\1\156\1\141\1\146\1\151\1"+
        "\163\1\157\1\142\1\157\1\145\1\164\1\165\1\150\1\141\1\uffff\2\172"+
        "\3\uffff\1\147\1\160\1\154\1\163\1\172\1\162\1\163\1\144\1\163\1"+
        "\172\1\156\1\166\1\147\1\164\1\163\1\167\1\160\1\164\1\157\1\145"+
        "\1\162\1\165\1\151\1\154\1\uffff\2\172\1\154\2\172\1\164\1\uffff"+
        "\1\141\1\145\1\172\1\124\1\uffff\2\145\2\172\1\164\2\145\1\124\1"+
        "\160\2\156\1\145\1\154\1\163\1\uffff\1\145\2\uffff\1\154\1\141\1"+
        "\164\1\172\1\uffff\1\165\2\172\2\uffff\1\141\1\162\1\141\1\165\1"+
        "\120\3\172\2\145\1\172\1\141\1\156\1\151\1\uffff\1\162\2\uffff\1"+
        "\143\1\172\1\164\1\162\1\156\1\162\3\uffff\2\172\1\uffff\1\171\1"+
        "\143\1\157\1\156\1\154\1\uffff\1\172\1\156\1\147\1\157\1\uffff\1"+
        "\172\1\145\1\156\2\145\1\uffff\1\101\1\151\1\147\1\uffff\2\172\1"+
        "\144\1\172\2\156\1\162\2\uffff\1\172\1\uffff\1\147\1\145\1\141\1"+
        "\uffff\1\154\1\172\1\155\1\145\1\uffff\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\21\uffff\1\37\2\uffff\1\41\1\42\1\43\30"+
        "\uffff\1\40\6\uffff\1\13\4\uffff\1\20\16\uffff\1\5\1\uffff\1\7\1"+
        "\10\4\uffff\1\16\3\uffff\1\23\1\24\16\uffff\1\15\1\uffff\1\21\1"+
        "\22\6\uffff\1\33\1\34\1\36\2\uffff\1\6\5\uffff\1\26\4\uffff\1\35"+
        "\5\uffff\1\27\3\uffff\1\11\7\uffff\1\12\1\14\1\uffff\1\25\3\uffff"+
        "\1\17\4\uffff\1\31\2\uffff\1\32\1\30";
    static final String DFA7_specialS =
        "\u00a8\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\32\1\33\1\uffff\1\32\1\33\22\uffff\1\32\1\uffff\1\26\5\uffff"+
            "\1\1\1\2\2\uffff\1\3\1\31\2\uffff\1\27\11\30\3\uffff\1\4\3\uffff"+
            "\32\31\4\uffff\1\31\1\uffff\1\5\1\6\1\7\1\10\1\11\1\25\1\31"+
            "\1\12\1\13\2\31\1\14\1\15\1\16\1\17\1\20\1\31\1\21\1\22\1\23"+
            "\2\31\1\24\3\31",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\5\uffff\1\40\5\uffff\1\41",
            "\1\42\1\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\3\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\16\uffff\1\56",
            "\1\57\11\uffff\1\61\2\uffff\1\60",
            "\1\62",
            "\1\63",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\65\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\66\2\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\31\2\uffff\12\65\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\120",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\123\3\uffff\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\154",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163\12\uffff\1\164",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\170",
            "\1\171",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0099",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | BOOLEAN_LITERAL | STRING_LITERAL | INT_LITERAL | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}