/*
* generated by Xtext
*/
grammar InternalFunction;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.bhdrkn.function.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleFUNCFile
entryRuleFUNCFile returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFUNCFileRule(), currentNode); }
	 iv_ruleFUNCFile=ruleFUNCFile 
	 { $current=$iv_ruleFUNCFile.current; } 
	 EOF 
;

// Rule FUNCFile
ruleFUNCFile returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getFunctionsFunctionsParserRuleCall_0_0(), currentNode); 
	    }
		lv_functions_0_0=ruleFunctions		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"functions",
	        		lv_functions_0_0, 
	        		"Functions", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFUNCFileAccess().getCallsCallsParserRuleCall_1_0(), currentNode); 
	    }
		lv_calls_1_0=ruleCalls		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFUNCFileRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"calls",
	        		lv_calls_1_0, 
	        		"Calls", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleFunctions
entryRuleFunctions returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFunctionsRule(), currentNode); }
	 iv_ruleFunctions=ruleFunctions 
	 { $current=$iv_ruleFunctions.current; } 
	 EOF 
;

// Rule Functions
ruleFunctions returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'[FUNCTIONS]' 
    {
        createLeafNode(grammarAccess.getFunctionsAccess().getFUNCTIONSKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFunctionsAccess().getFunctionsFunctionParserRuleCall_1_0(), currentNode); 
	    }
		lv_functions_1_0=ruleFunction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFunctionsRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"functions",
	        		lv_functions_1_0, 
	        		"Function", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'[/FUNCTIONS]' 
    {
        createLeafNode(grammarAccess.getFunctionsAccess().getFUNCTIONSKeyword_2(), null); 
    }
)
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'function' 
    {
        createLeafNode(grammarAccess.getFunctionAccess().getFunctionKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleCalls
entryRuleCalls returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCallsRule(), currentNode); }
	 iv_ruleCalls=ruleCalls 
	 { $current=$iv_ruleCalls.current; } 
	 EOF 
;

// Rule Calls
ruleCalls returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'[CALLS]' 
    {
        createLeafNode(grammarAccess.getCallsAccess().getCALLSKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getCallsAccess().getCallsCallParserRuleCall_1_0(), currentNode); 
	    }
		lv_calls_1_0=ruleCall		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCallsRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"calls",
	        		lv_calls_1_0, 
	        		"Call", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'[/CALLS]' 
    {
        createLeafNode(grammarAccess.getCallsAccess().getCALLSKeyword_2(), null); 
    }
)
;





// Entry rule entryRuleCall
entryRuleCall returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCallRule(), currentNode); }
	 iv_ruleCall=ruleCall 
	 { $current=$iv_ruleCall.current; } 
	 EOF 
;

// Rule Call
ruleCall returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'call' 
    {
        createLeafNode(grammarAccess.getCallAccess().getCallKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getCallAccess().getNameFunctionCrossReference_1_0(), "name"); 
	}

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

