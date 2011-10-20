package org.xtext.bhdrkn.function.parser.antlr.internal; 

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
import org.xtext.bhdrkn.function.services.FunctionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFunctionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[FUNCTIONS]'", "'[/FUNCTIONS]'", "'function'", "'[CALLS]'", "'[/CALLS]'", "'call'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalFunctionParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g"; }



     	private FunctionGrammarAccess grammarAccess;
     	
        public InternalFunctionParser(TokenStream input, IAstFactory factory, FunctionGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FUNCFile";	
       	}
       	
       	@Override
       	protected FunctionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleFUNCFile
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:77:1: entryRuleFUNCFile returns [EObject current=null] : iv_ruleFUNCFile= ruleFUNCFile EOF ;
    public final EObject entryRuleFUNCFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFUNCFile = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:78:2: (iv_ruleFUNCFile= ruleFUNCFile EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:79:2: iv_ruleFUNCFile= ruleFUNCFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFUNCFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleFUNCFile_in_entryRuleFUNCFile75);
            iv_ruleFUNCFile=ruleFUNCFile();
            _fsp--;

             current =iv_ruleFUNCFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCFile85); 

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
    // $ANTLR end entryRuleFUNCFile


    // $ANTLR start ruleFUNCFile
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:86:1: ruleFUNCFile returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctions ) ) ( (lv_calls_1_0= ruleCalls ) ) ) ;
    public final EObject ruleFUNCFile() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_calls_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:91:6: ( ( ( (lv_functions_0_0= ruleFunctions ) ) ( (lv_calls_1_0= ruleCalls ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:1: ( ( (lv_functions_0_0= ruleFunctions ) ) ( (lv_calls_1_0= ruleCalls ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:1: ( ( (lv_functions_0_0= ruleFunctions ) ) ( (lv_calls_1_0= ruleCalls ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:2: ( (lv_functions_0_0= ruleFunctions ) ) ( (lv_calls_1_0= ruleCalls ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:2: ( (lv_functions_0_0= ruleFunctions ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:93:1: (lv_functions_0_0= ruleFunctions )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:93:1: (lv_functions_0_0= ruleFunctions )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:94:3: lv_functions_0_0= ruleFunctions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getFunctionsFunctionsParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctions_in_ruleFUNCFile131);
            lv_functions_0_0=ruleFunctions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"functions",
            	        		lv_functions_0_0, 
            	        		"Functions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:116:2: ( (lv_calls_1_0= ruleCalls ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:117:1: (lv_calls_1_0= ruleCalls )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:117:1: (lv_calls_1_0= ruleCalls )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:118:3: lv_calls_1_0= ruleCalls
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getCallsCallsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCalls_in_ruleFUNCFile152);
            lv_calls_1_0=ruleCalls();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"calls",
            	        		lv_calls_1_0, 
            	        		"Calls", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleFUNCFile


    // $ANTLR start entryRuleFunctions
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:148:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:149:2: (iv_ruleFunctions= ruleFunctions EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:150:2: iv_ruleFunctions= ruleFunctions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctions_in_entryRuleFunctions188);
            iv_ruleFunctions=ruleFunctions();
            _fsp--;

             current =iv_ruleFunctions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctions198); 

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
    // $ANTLR end entryRuleFunctions


    // $ANTLR start ruleFunctions
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:157:1: ruleFunctions returns [EObject current=null] : ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:162:6: ( ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:163:1: ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:163:1: ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:163:3: '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]'
            {
            match(input,11,FOLLOW_11_in_ruleFunctions233); 

                    createLeafNode(grammarAccess.getFunctionsAccess().getFUNCTIONSKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:167:1: ( (lv_functions_1_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:168:1: (lv_functions_1_0= ruleFunction )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:168:1: (lv_functions_1_0= ruleFunction )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:169:3: lv_functions_1_0= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleFunctions254);
            	    lv_functions_1_0=ruleFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functions",
            	    	        		lv_functions_1_0, 
            	    	        		"Function", 
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

            match(input,12,FOLLOW_12_in_ruleFunctions265); 

                    createLeafNode(grammarAccess.getFunctionsAccess().getFUNCTIONSKeyword_2(), null); 
                

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
    // $ANTLR end ruleFunctions


    // $ANTLR start entryRuleFunction
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:203:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:204:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:205:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction301);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction311); 

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
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:212:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:217:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:218:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:218:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:218:3: 'function' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleFunction346); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:223:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:223:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction363); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
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
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleCalls
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:254:1: entryRuleCalls returns [EObject current=null] : iv_ruleCalls= ruleCalls EOF ;
    public final EObject entryRuleCalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalls = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:255:2: (iv_ruleCalls= ruleCalls EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:256:2: iv_ruleCalls= ruleCalls EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallsRule(), currentNode); 
            pushFollow(FOLLOW_ruleCalls_in_entryRuleCalls404);
            iv_ruleCalls=ruleCalls();
            _fsp--;

             current =iv_ruleCalls; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalls414); 

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
    // $ANTLR end entryRuleCalls


    // $ANTLR start ruleCalls
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:263:1: ruleCalls returns [EObject current=null] : ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' ) ;
    public final EObject ruleCalls() throws RecognitionException {
        EObject current = null;

        EObject lv_calls_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:268:6: ( ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:269:1: ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:269:1: ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:269:3: '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]'
            {
            match(input,14,FOLLOW_14_in_ruleCalls449); 

                    createLeafNode(grammarAccess.getCallsAccess().getCALLSKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:273:1: ( (lv_calls_1_0= ruleCall ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:274:1: (lv_calls_1_0= ruleCall )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:274:1: (lv_calls_1_0= ruleCall )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:275:3: lv_calls_1_0= ruleCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCallsAccess().getCallsCallParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCall_in_ruleCalls470);
            	    lv_calls_1_0=ruleCall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCallsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"calls",
            	    	        		lv_calls_1_0, 
            	    	        		"Call", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleCalls481); 

                    createLeafNode(grammarAccess.getCallsAccess().getCALLSKeyword_2(), null); 
                

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
    // $ANTLR end ruleCalls


    // $ANTLR start entryRuleCall
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:309:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:310:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:311:2: iv_ruleCall= ruleCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall517);
            iv_ruleCall=ruleCall();
            _fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall527); 

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
    // $ANTLR end entryRuleCall


    // $ANTLR start ruleCall
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:318:1: ruleCall returns [EObject current=null] : ( 'call' ( ( RULE_ID ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:323:6: ( ( 'call' ( ( RULE_ID ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:324:1: ( 'call' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:324:1: ( 'call' ( ( RULE_ID ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:324:3: 'call' ( ( RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleCall562); 

                    createLeafNode(grammarAccess.getCallAccess().getCallKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:328:1: ( ( RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:329:1: ( RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:329:1: ( RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:330:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall580); 

            		createLeafNode(grammarAccess.getCallAccess().getNameFunctionCrossReference_1_0(), "name"); 
            	

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
    // $ANTLR end ruleCall


 

    public static final BitSet FOLLOW_ruleFUNCFile_in_entryRuleFUNCFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctions_in_ruleFUNCFile131 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCalls_in_ruleFUNCFile152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctions_in_entryRuleFunctions188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctions198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFunctions233 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctions254 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleFunctions265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunction346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalls_in_entryRuleCalls404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalls414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCalls449 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleCall_in_ruleCalls470 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCalls481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCall562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall580 = new BitSet(new long[]{0x0000000000000002L});

}