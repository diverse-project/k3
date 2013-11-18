// $ANTLR 3.4

	package expArithm.resource.expArithmtxt.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExpArithmtxtLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int LINEBREAK=4;
    public static final int VALUE=5;
    public static final int WHITESPACE=6;

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

    public ExpArithmtxtLexer() {} 
    public ExpArithmtxtLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpArithmtxtLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ExpArithmtxt.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:15:6: ( '*' )
            // ExpArithmtxt.g:15:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:16:6: ( '+' )
            // ExpArithmtxt.g:16:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:17:6: ( '-' )
            // ExpArithmtxt.g:17:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:18:7: ( '/' )
            // ExpArithmtxt.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:959:6: ( ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ) )
            // ExpArithmtxt.g:960:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            {
            // ExpArithmtxt.g:960:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ExpArithmtxt.g:960:3: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ExpArithmtxt.g:960:3: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ExpArithmtxt.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // ExpArithmtxt.g:960:14: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ExpArithmtxt.g:960:15: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // ExpArithmtxt.g:960:18: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ExpArithmtxt.g:
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:962:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // ExpArithmtxt.g:963:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // ExpArithmtxt.g:963:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // ExpArithmtxt.g:963:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // ExpArithmtxt.g:963:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n') ) {
                    alt4=1;
                }
                else {
                    alt4=2;
                }
            }
            else if ( (LA4_0=='\n') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ExpArithmtxt.g:963:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // ExpArithmtxt.g:963:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // ExpArithmtxt.g:963:16: '\\n'
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExpArithmtxt.g:966:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // ExpArithmtxt.g:967:2: ( ( ' ' | '\\t' | '\\f' ) )
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

    public void mTokens() throws RecognitionException {
        // ExpArithmtxt.g:1:8: ( T__7 | T__8 | T__9 | T__10 | VALUE | LINEBREAK | WHITESPACE )
        int alt5=7;
        switch ( input.LA(1) ) {
        case '*':
            {
            alt5=1;
            }
            break;
        case '+':
            {
            alt5=2;
            }
            break;
        case '-':
            {
            alt5=3;
            }
            break;
        case '/':
            {
            alt5=4;
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
        case '8':
        case '9':
            {
            alt5=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=6;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
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
                // ExpArithmtxt.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // ExpArithmtxt.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // ExpArithmtxt.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // ExpArithmtxt.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // ExpArithmtxt.g:1:31: VALUE
                {
                mVALUE(); 


                }
                break;
            case 6 :
                // ExpArithmtxt.g:1:37: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 7 :
                // ExpArithmtxt.g:1:47: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}