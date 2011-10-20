package org.xtext.bhdrkn.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.bhdrkn.services.FouroperationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFouroperationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'operation'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalFouroperationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g"; }



     	private FouroperationGrammarAccess grammarAccess;
     	
        public InternalFouroperationParser(TokenStream input, IAstFactory factory, FouroperationGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Operation";	
       	}
       	
       	@Override
       	protected FouroperationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleOperation
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:77:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:78:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:79:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation75);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation85); 

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
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:86:1: ruleOperation returns [EObject current=null] : ( 'operation' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_statements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:91:6: ( ( 'operation' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_statements_3_0= ruleStatement ) )* '}' ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:92:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:92:1: ( 'operation' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_statements_3_0= ruleStatement ) )* '}' )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:92:3: 'operation' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_statements_3_0= ruleStatement ) )* '}'
            {
            match(input,12,FOLLOW_12_in_ruleOperation120); 

                    createLeafNode(grammarAccess.getOperationAccess().getOperationKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:97:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation137); 

            			createLeafNode(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleOperation152); 

                    createLeafNode(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:124:1: ( (lv_statements_3_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NUMBER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:125:1: (lv_statements_3_0= ruleStatement )
            	    {
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:125:1: (lv_statements_3_0= ruleStatement )
            	    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:126:3: lv_statements_3_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getStatementsStatementParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleOperation173);
            	    lv_statements_3_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_3_0, 
            	    	        		"Statement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleOperation184); 

                    createLeafNode(grammarAccess.getOperationAccess().getRGhtCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleStatement
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:160:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:161:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:162:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement220);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement230); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:169:1: ruleStatement returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:174:6: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:175:1: ( (lv_expression_0_0= ruleExpression ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:175:1: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:176:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:176:1: (lv_expression_0_0= ruleExpression )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:177:3: lv_expression_0_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement275);
            lv_expression_0_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_0_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleExpression
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:207:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:208:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:209:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression310);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression320); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:216:1: ruleExpression returns [EObject current=null] : (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject this_Minus_1 = null;

        EObject this_Multi_2 = null;

        EObject this_Div_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:221:6: ( (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:222:1: (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:222:1: (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    alt2=4;
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("222:1: (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv )", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("222:1: (this_Addition_0= ruleAddition | this_Minus_1= ruleMinus | this_Multi_2= ruleMulti | this_Div_3= ruleDiv )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:223:5: this_Addition_0= ruleAddition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAddition_in_ruleExpression367);
                    this_Addition_0=ruleAddition();
                    _fsp--;

                     
                            current = this_Addition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:233:5: this_Minus_1= ruleMinus
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMinus_in_ruleExpression394);
                    this_Minus_1=ruleMinus();
                    _fsp--;

                     
                            current = this_Minus_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:243:5: this_Multi_2= ruleMulti
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getMultiParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMulti_in_ruleExpression421);
                    this_Multi_2=ruleMulti();
                    _fsp--;

                     
                            current = this_Multi_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:253:5: this_Div_3= ruleDiv
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getDivParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDiv_in_ruleExpression448);
                    this_Div_3=ruleDiv();
                    _fsp--;

                     
                            current = this_Div_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleAddition
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:269:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:270:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:271:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition483);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition493); 

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:278:1: ruleAddition returns [EObject current=null] : ( ( (lv_left_0_0= RULE_NUMBER ) ) '+' ( (lv_right_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:283:6: ( ( ( (lv_left_0_0= RULE_NUMBER ) ) '+' ( (lv_right_2_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:284:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '+' ( (lv_right_2_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:284:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '+' ( (lv_right_2_0= RULE_NUMBER ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:284:2: ( (lv_left_0_0= RULE_NUMBER ) ) '+' ( (lv_right_2_0= RULE_NUMBER ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:284:2: ( (lv_left_0_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:285:1: (lv_left_0_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:285:1: (lv_left_0_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:286:3: lv_left_0_0= RULE_NUMBER
            {
            lv_left_0_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAddition535); 

            			createLeafNode(grammarAccess.getAdditionAccess().getLeftNUMBERTerminalRuleCall_0_0(), "left"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"left",
            	        		lv_left_0_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleAddition550); 

                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSGnKeyword_1(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:312:1: ( (lv_right_2_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:313:1: (lv_right_2_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:313:1: (lv_right_2_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:314:3: lv_right_2_0= RULE_NUMBER
            {
            lv_right_2_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAddition567); 

            			createLeafNode(grammarAccess.getAdditionAccess().getRightNUMBERTerminalRuleCall_2_0(), "right"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_2_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMinus
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:344:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:345:2: (iv_ruleMinus= ruleMinus EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:346:2: iv_ruleMinus= ruleMinus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinusRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus608);
            iv_ruleMinus=ruleMinus();
            _fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus618); 

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
    // $ANTLR end entryRuleMinus


    // $ANTLR start ruleMinus
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:353:1: ruleMinus returns [EObject current=null] : ( ( (lv_left_0_0= RULE_NUMBER ) ) '-' ( (lv_right_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:358:6: ( ( ( (lv_left_0_0= RULE_NUMBER ) ) '-' ( (lv_right_2_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:359:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '-' ( (lv_right_2_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:359:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '-' ( (lv_right_2_0= RULE_NUMBER ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:359:2: ( (lv_left_0_0= RULE_NUMBER ) ) '-' ( (lv_right_2_0= RULE_NUMBER ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:359:2: ( (lv_left_0_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:360:1: (lv_left_0_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:360:1: (lv_left_0_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:361:3: lv_left_0_0= RULE_NUMBER
            {
            lv_left_0_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMinus660); 

            			createLeafNode(grammarAccess.getMinusAccess().getLeftNUMBERTerminalRuleCall_0_0(), "left"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMinusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"left",
            	        		lv_left_0_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleMinus675); 

                    createLeafNode(grammarAccess.getMinusAccess().getHyphenMNusKeyword_1(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:387:1: ( (lv_right_2_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:388:1: (lv_right_2_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:388:1: (lv_right_2_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:389:3: lv_right_2_0= RULE_NUMBER
            {
            lv_right_2_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMinus692); 

            			createLeafNode(grammarAccess.getMinusAccess().getRightNUMBERTerminalRuleCall_2_0(), "right"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMinusRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_2_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMinus


    // $ANTLR start entryRuleMulti
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:419:1: entryRuleMulti returns [EObject current=null] : iv_ruleMulti= ruleMulti EOF ;
    public final EObject entryRuleMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulti = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:420:2: (iv_ruleMulti= ruleMulti EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:421:2: iv_ruleMulti= ruleMulti EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiRule(), currentNode); 
            pushFollow(FOLLOW_ruleMulti_in_entryRuleMulti733);
            iv_ruleMulti=ruleMulti();
            _fsp--;

             current =iv_ruleMulti; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulti743); 

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
    // $ANTLR end entryRuleMulti


    // $ANTLR start ruleMulti
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:428:1: ruleMulti returns [EObject current=null] : ( ( (lv_left_0_0= RULE_NUMBER ) ) '*' ( (lv_right_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleMulti() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:433:6: ( ( ( (lv_left_0_0= RULE_NUMBER ) ) '*' ( (lv_right_2_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:434:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '*' ( (lv_right_2_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:434:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '*' ( (lv_right_2_0= RULE_NUMBER ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:434:2: ( (lv_left_0_0= RULE_NUMBER ) ) '*' ( (lv_right_2_0= RULE_NUMBER ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:434:2: ( (lv_left_0_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:435:1: (lv_left_0_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:435:1: (lv_left_0_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:436:3: lv_left_0_0= RULE_NUMBER
            {
            lv_left_0_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMulti785); 

            			createLeafNode(grammarAccess.getMultiAccess().getLeftNUMBERTerminalRuleCall_0_0(), "left"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"left",
            	        		lv_left_0_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleMulti800); 

                    createLeafNode(grammarAccess.getMultiAccess().getAsterSkKeyword_1(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:462:1: ( (lv_right_2_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:463:1: (lv_right_2_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:463:1: (lv_right_2_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:464:3: lv_right_2_0= RULE_NUMBER
            {
            lv_right_2_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMulti817); 

            			createLeafNode(grammarAccess.getMultiAccess().getRightNUMBERTerminalRuleCall_2_0(), "right"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMultiRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_2_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMulti


    // $ANTLR start entryRuleDiv
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:494:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:495:2: (iv_ruleDiv= ruleDiv EOF )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:496:2: iv_ruleDiv= ruleDiv EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDivRule(), currentNode); 
            pushFollow(FOLLOW_ruleDiv_in_entryRuleDiv858);
            iv_ruleDiv=ruleDiv();
            _fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiv868); 

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
    // $ANTLR end entryRuleDiv


    // $ANTLR start ruleDiv
    // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:503:1: ruleDiv returns [EObject current=null] : ( ( (lv_left_0_0= RULE_NUMBER ) ) '/' ( (lv_right_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:508:6: ( ( ( (lv_left_0_0= RULE_NUMBER ) ) '/' ( (lv_right_2_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:509:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '/' ( (lv_right_2_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:509:1: ( ( (lv_left_0_0= RULE_NUMBER ) ) '/' ( (lv_right_2_0= RULE_NUMBER ) ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:509:2: ( (lv_left_0_0= RULE_NUMBER ) ) '/' ( (lv_right_2_0= RULE_NUMBER ) )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:509:2: ( (lv_left_0_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:510:1: (lv_left_0_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:510:1: (lv_left_0_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:511:3: lv_left_0_0= RULE_NUMBER
            {
            lv_left_0_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDiv910); 

            			createLeafNode(grammarAccess.getDivAccess().getLeftNUMBERTerminalRuleCall_0_0(), "left"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDivRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"left",
            	        		lv_left_0_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleDiv925); 

                    createLeafNode(grammarAccess.getDivAccess().getSolDusKeyword_1(), null); 
                
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:537:1: ( (lv_right_2_0= RULE_NUMBER ) )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:538:1: (lv_right_2_0= RULE_NUMBER )
            {
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:538:1: (lv_right_2_0= RULE_NUMBER )
            // ../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g:539:3: lv_right_2_0= RULE_NUMBER
            {
            lv_right_2_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDiv942); 

            			createLeafNode(grammarAccess.getDivAccess().getRightNUMBERTerminalRuleCall_2_0(), "right"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDivRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_2_0, 
            	        		"NUMBER", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDiv


 

    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOperation120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation137 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation152 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleOperation173 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleOperation184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_ruleExpression421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_ruleExpression448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAddition535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddition550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAddition567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMinus660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMinus675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMinus692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulti_in_entryRuleMulti733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulti743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMulti785 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMulti800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMulti817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_entryRuleDiv858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiv868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDiv910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDiv925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDiv942 = new BitSet(new long[]{0x0000000000000002L});

}