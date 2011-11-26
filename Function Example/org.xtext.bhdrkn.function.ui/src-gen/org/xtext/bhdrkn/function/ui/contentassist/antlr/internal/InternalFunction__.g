lexer grammar InternalFunction;
@header {
package org.xtext.bhdrkn.function.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Type1' ;
T12 : 'Type2' ;
T13 : '[DEFINITIONS]' ;
T14 : '[/DEFINITIONS]' ;
T15 : '[FUNCTIONS]' ;
T16 : '[/FUNCTIONS]' ;
T17 : 'function' ;
T18 : '(' ;
T19 : ')' ;
T20 : '[CALLS]' ;
T21 : '[/CALLS]' ;
T22 : 'call' ;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1383
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1385
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1387
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1389
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1391
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1393
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 1395
RULE_ANY_OTHER : .;


