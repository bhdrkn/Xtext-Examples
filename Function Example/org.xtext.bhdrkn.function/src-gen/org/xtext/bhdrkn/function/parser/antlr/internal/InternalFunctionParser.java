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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[DEFINITIONS]'", "'[/DEFINITIONS]'", "'Type1'", "'Type2'", "'[FUNCTIONS]'", "'[/FUNCTIONS]'", "'function'", "'('", "')'", "'[CALLS]'", "'[/CALLS]'", "'call'"
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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:86:1: ruleFUNCFile returns [EObject current=null] : ( ( (lv_defines_0_0= ruleDefines ) ) ( (lv_functions_1_0= ruleFunctions ) ) ( (lv_calls_2_0= ruleCalls ) ) ) ;
    public final EObject ruleFUNCFile() throws RecognitionException {
        EObject current = null;

        EObject lv_defines_0_0 = null;

        EObject lv_functions_1_0 = null;

        EObject lv_calls_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:91:6: ( ( ( (lv_defines_0_0= ruleDefines ) ) ( (lv_functions_1_0= ruleFunctions ) ) ( (lv_calls_2_0= ruleCalls ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:1: ( ( (lv_defines_0_0= ruleDefines ) ) ( (lv_functions_1_0= ruleFunctions ) ) ( (lv_calls_2_0= ruleCalls ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:1: ( ( (lv_defines_0_0= ruleDefines ) ) ( (lv_functions_1_0= ruleFunctions ) ) ( (lv_calls_2_0= ruleCalls ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:2: ( (lv_defines_0_0= ruleDefines ) ) ( (lv_functions_1_0= ruleFunctions ) ) ( (lv_calls_2_0= ruleCalls ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:92:2: ( (lv_defines_0_0= ruleDefines ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:93:1: (lv_defines_0_0= ruleDefines )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:93:1: (lv_defines_0_0= ruleDefines )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:94:3: lv_defines_0_0= ruleDefines
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getDefinesDefinesParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefines_in_ruleFUNCFile131);
            lv_defines_0_0=ruleDefines();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"defines",
            	        		lv_defines_0_0, 
            	        		"Defines", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:116:2: ( (lv_functions_1_0= ruleFunctions ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:117:1: (lv_functions_1_0= ruleFunctions )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:117:1: (lv_functions_1_0= ruleFunctions )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:118:3: lv_functions_1_0= ruleFunctions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getFunctionsFunctionsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctions_in_ruleFUNCFile152);
            lv_functions_1_0=ruleFunctions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"functions",
            	        		lv_functions_1_0, 
            	        		"Functions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:140:2: ( (lv_calls_2_0= ruleCalls ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:141:1: (lv_calls_2_0= ruleCalls )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:141:1: (lv_calls_2_0= ruleCalls )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:142:3: lv_calls_2_0= ruleCalls
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getCallsCallsParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCalls_in_ruleFUNCFile173);
            lv_calls_2_0=ruleCalls();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"calls",
            	        		lv_calls_2_0, 
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


    // $ANTLR start entryRuleDefines
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:172:1: entryRuleDefines returns [EObject current=null] : iv_ruleDefines= ruleDefines EOF ;
    public final EObject entryRuleDefines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefines = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:173:2: (iv_ruleDefines= ruleDefines EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:174:2: iv_ruleDefines= ruleDefines EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefines_in_entryRuleDefines209);
            iv_ruleDefines=ruleDefines();
            _fsp--;

             current =iv_ruleDefines; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefines219); 

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
    // $ANTLR end entryRuleDefines


    // $ANTLR start ruleDefines
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:181:1: ruleDefines returns [EObject current=null] : ( '[DEFINITIONS]' ( (lv_definitions_1_0= ruleDefine ) )* '[/DEFINITIONS]' ) ;
    public final EObject ruleDefines() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:186:6: ( ( '[DEFINITIONS]' ( (lv_definitions_1_0= ruleDefine ) )* '[/DEFINITIONS]' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:187:1: ( '[DEFINITIONS]' ( (lv_definitions_1_0= ruleDefine ) )* '[/DEFINITIONS]' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:187:1: ( '[DEFINITIONS]' ( (lv_definitions_1_0= ruleDefine ) )* '[/DEFINITIONS]' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:187:3: '[DEFINITIONS]' ( (lv_definitions_1_0= ruleDefine ) )* '[/DEFINITIONS]'
            {
            match(input,11,FOLLOW_11_in_ruleDefines254); 

                    createLeafNode(grammarAccess.getDefinesAccess().getDEFINITIONSKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:191:1: ( (lv_definitions_1_0= ruleDefine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:192:1: (lv_definitions_1_0= ruleDefine )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:192:1: (lv_definitions_1_0= ruleDefine )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:193:3: lv_definitions_1_0= ruleDefine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefinesAccess().getDefinitionsDefineParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefine_in_ruleDefines275);
            	    lv_definitions_1_0=ruleDefine();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefinesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"definitions",
            	    	        		lv_definitions_1_0, 
            	    	        		"Define", 
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

            match(input,12,FOLLOW_12_in_ruleDefines286); 

                    createLeafNode(grammarAccess.getDefinesAccess().getDEFINITIONSKeyword_2(), null); 
                

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
    // $ANTLR end ruleDefines


    // $ANTLR start entryRuleDefine
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:227:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:228:2: (iv_ruleDefine= ruleDefine EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:229:2: iv_ruleDefine= ruleDefine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefineRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine322);
            iv_ruleDefine=ruleDefine();
            _fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine332); 

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
    // $ANTLR end entryRuleDefine


    // $ANTLR start ruleDefine
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:236:1: ruleDefine returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:241:6: ( ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:242:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:242:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:242:2: ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:242:2: ( (lv_keyword_0_0= ruleKeyword ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:243:1: (lv_keyword_0_0= ruleKeyword )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:243:1: (lv_keyword_0_0= ruleKeyword )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:244:3: lv_keyword_0_0= ruleKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDefineAccess().getKeywordKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleKeyword_in_ruleDefine378);
            lv_keyword_0_0=ruleKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefineRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"Keyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:266:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:267:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:267:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:268:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefine395); 

            			createLeafNode(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefineRule().getType().getClassifier());
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
    // $ANTLR end ruleDefine


    // $ANTLR start entryRuleKeyword
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:298:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:299:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:300:2: iv_ruleKeyword= ruleKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword437);
            iv_ruleKeyword=ruleKeyword();
            _fsp--;

             current =iv_ruleKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword448); 

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
    // $ANTLR end entryRuleKeyword


    // $ANTLR start ruleKeyword
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:307:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Type1' | kw= 'Type2' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:312:6: ( (kw= 'Type1' | kw= 'Type2' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:313:1: (kw= 'Type1' | kw= 'Type2' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:313:1: (kw= 'Type1' | kw= 'Type2' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("313:1: (kw= 'Type1' | kw= 'Type2' )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:314:2: kw= 'Type1'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleKeyword486); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getType1Keyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:321:2: kw= 'Type2'
                    {
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleKeyword505); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getType2Keyword_1(), null); 
                        

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
    // $ANTLR end ruleKeyword


    // $ANTLR start entryRuleFunctions
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:334:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:335:2: (iv_ruleFunctions= ruleFunctions EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:336:2: iv_ruleFunctions= ruleFunctions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctions_in_entryRuleFunctions545);
            iv_ruleFunctions=ruleFunctions();
            _fsp--;

             current =iv_ruleFunctions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctions555); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:343:1: ruleFunctions returns [EObject current=null] : ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:348:6: ( ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:349:1: ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:349:1: ( '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:349:3: '[FUNCTIONS]' ( (lv_functions_1_0= ruleFunction ) )* '[/FUNCTIONS]'
            {
            match(input,15,FOLLOW_15_in_ruleFunctions590); 

                    createLeafNode(grammarAccess.getFunctionsAccess().getFUNCTIONSKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:353:1: ( (lv_functions_1_0= ruleFunction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:354:1: (lv_functions_1_0= ruleFunction )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:354:1: (lv_functions_1_0= ruleFunction )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:355:3: lv_functions_1_0= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleFunctions611);
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
            	    break loop3;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleFunctions622); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:389:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:390:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:391:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction658);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction668); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:398:1: ruleFunction returns [EObject current=null] : ( 'function' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_args_3_0= ruleArgument ) )* ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_args_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:403:6: ( ( 'function' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_args_3_0= ruleArgument ) )* ')' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:404:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_args_3_0= ruleArgument ) )* ')' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:404:1: ( 'function' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_args_3_0= ruleArgument ) )* ')' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:404:3: 'function' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_args_3_0= ruleArgument ) )* ')'
            {
            match(input,17,FOLLOW_17_in_ruleFunction703); 

                    createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:408:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:409:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:409:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:410:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction720); 

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

            match(input,18,FOLLOW_18_in_ruleFunction735); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:436:1: ( (lv_args_3_0= ruleArgument ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:437:1: (lv_args_3_0= ruleArgument )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:437:1: (lv_args_3_0= ruleArgument )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:438:3: lv_args_3_0= ruleArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getArgsArgumentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleFunction756);
            	    lv_args_3_0=ruleArgument();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"args",
            	    	        		lv_args_3_0, 
            	    	        		"Argument", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleFunction767); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRGhtParenthesSKeyword_4(), null); 
                

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


    // $ANTLR start entryRuleArgument
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:472:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:473:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:474:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument803);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument813); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:481:1: ruleArgument returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:486:6: ( ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:487:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:487:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:487:2: ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:487:2: ( (lv_keyword_0_0= ruleKeyword ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:488:1: (lv_keyword_0_0= ruleKeyword )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:488:1: (lv_keyword_0_0= ruleKeyword )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:489:3: lv_keyword_0_0= ruleKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getKeywordKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleKeyword_in_ruleArgument859);
            lv_keyword_0_0=ruleKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"Keyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:511:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:512:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:512:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:513:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument876); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
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
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleCalls
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:543:1: entryRuleCalls returns [EObject current=null] : iv_ruleCalls= ruleCalls EOF ;
    public final EObject entryRuleCalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalls = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:544:2: (iv_ruleCalls= ruleCalls EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:545:2: iv_ruleCalls= ruleCalls EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallsRule(), currentNode); 
            pushFollow(FOLLOW_ruleCalls_in_entryRuleCalls917);
            iv_ruleCalls=ruleCalls();
            _fsp--;

             current =iv_ruleCalls; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalls927); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:552:1: ruleCalls returns [EObject current=null] : ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' ) ;
    public final EObject ruleCalls() throws RecognitionException {
        EObject current = null;

        EObject lv_calls_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:557:6: ( ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:558:1: ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:558:1: ( '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:558:3: '[CALLS]' ( (lv_calls_1_0= ruleCall ) )* '[/CALLS]'
            {
            match(input,20,FOLLOW_20_in_ruleCalls962); 

                    createLeafNode(grammarAccess.getCallsAccess().getCALLSKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:562:1: ( (lv_calls_1_0= ruleCall ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:563:1: (lv_calls_1_0= ruleCall )
            	    {
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:563:1: (lv_calls_1_0= ruleCall )
            	    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:564:3: lv_calls_1_0= ruleCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCallsAccess().getCallsCallParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCall_in_ruleCalls983);
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
            	    break loop5;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleCalls994); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:598:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:599:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:600:2: iv_ruleCall= ruleCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1030);
            iv_ruleCall=ruleCall();
            _fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1040); 

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
    // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:607:1: ruleCall returns [EObject current=null] : ( 'call' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:612:6: ( ( 'call' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) ) ')' ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:613:1: ( 'call' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) ) ')' )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:613:1: ( 'call' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) ) ')' )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:613:3: 'call' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) ) ')'
            {
            match(input,22,FOLLOW_22_in_ruleCall1075); 

                    createLeafNode(grammarAccess.getCallAccess().getCallKeyword_0(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:617:1: ( ( RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:618:1: ( RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:618:1: ( RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:619:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall1093); 

            		createLeafNode(grammarAccess.getCallAccess().getNameFunctionCrossReference_1_0(), "name"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleCall1103); 

                    createLeafNode(grammarAccess.getCallAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:635:1: ( ( RULE_ID ) )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:636:1: ( RULE_ID )
            {
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:636:1: ( RULE_ID )
            // ../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g:637:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall1121); 

            		createLeafNode(grammarAccess.getCallAccess().getArgsDefineCrossReference_3_0(), "args"); 
            	

            }


            }

            match(input,19,FOLLOW_19_in_ruleCall1131); 

                    createLeafNode(grammarAccess.getCallAccess().getRGhtParenthesSKeyword_4(), null); 
                

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
    public static final BitSet FOLLOW_ruleDefines_in_ruleFUNCFile131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFunctions_in_ruleFUNCFile152 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCalls_in_ruleFUNCFile173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefines_in_entryRuleDefines209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefines219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDefines254 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleDefines275 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleDefines286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleDefine378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefine395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleKeyword486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleKeyword505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctions_in_entryRuleFunctions545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctions555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunctions590 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctions611 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleFunctions622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFunction703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction720 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction735 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleFunction756 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_19_in_ruleFunction767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleArgument859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalls_in_entryRuleCalls917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalls927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCalls962 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleCall_in_ruleCalls983 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCalls994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCall1075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall1093 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCall1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall1121 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCall1131 = new BitSet(new long[]{0x0000000000000002L});

}