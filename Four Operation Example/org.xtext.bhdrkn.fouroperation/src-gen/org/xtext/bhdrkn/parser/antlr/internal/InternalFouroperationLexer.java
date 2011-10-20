package org.xtext.bhdrkn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFouroperationLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int Tokens=19;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public InternalFouroperationLexer() {;} 
    public InternalFouroperationLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:10:5: ( 'operation' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:10:7: 'operation'
            {
            match("operation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:11:5: ( '{' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:12:5: ( '}' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:12:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:13:5: ( '+' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:13:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:14:5: ( '-' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:14:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:15:5: ( '*' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:15:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:16:5: ( '/' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:16:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start RULE_NUMBER
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:32: ( '0' .. '9' )+
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
                    	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:568:33: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NUMBER

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:570:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:570:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:570:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:570:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:570:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:572:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:572:12: ( '0' .. '9' )+
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:572:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:572:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("574:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:574:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:576:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:576:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:576:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:576:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:578:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:580:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:580:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:580:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:582:16: ( . )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:582:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=15;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:38: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 9 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:50: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:58: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:67: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:79: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:95: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:111: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:1:119: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\12\1\22\5\uffff\1\32\1\12\1\20\1\uffff\1\20\1\uffff\2\20\2\uffff"+
        "\1\22\11\uffff\1\12\2\uffff\6\22\1\45\1\uffff";
    static final String DFA15_eofS =
        "\46\uffff";
    static final String DFA15_minS =
        "\1\0\1\160\5\uffff\1\52\2\60\1\uffff\1\101\1\uffff\2\0\2\uffff\1"+
        "\145\11\uffff\1\60\2\uffff\1\162\1\141\1\164\1\151\1\157\1\156\1"+
        "\60\1\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\1\160\5\uffff\1\57\2\71\1\uffff\1\172\1\uffff\2\ufffe\2"+
        "\uffff\1\145\11\uffff\1\71\2\uffff\1\162\1\141\1\164\1\151\1\157"+
        "\1\156\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\10\1\uffff\1\11\2\uffff\1"+
        "\16\1\17\1\uffff\1\11\1\2\1\3\1\4\1\5\1\6\1\15\1\14\1\7\1\uffff"+
        "\1\13\1\16\7\uffff\1\1";
    static final String DFA15_specialS =
        "\46\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\15\4\20\1\16\2\20\1"+
            "\6\1\4\1\20\1\5\1\11\1\7\12\10\7\20\32\14\3\20\1\13\1\14\1\20"+
            "\16\14\1\1\13\14\1\2\1\20\1\3\uff81\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\31\4\uffff\1\30",
            "\12\33",
            "\12\12",
            "",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\uffff\34",
            "\uffff\34",
            "",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}