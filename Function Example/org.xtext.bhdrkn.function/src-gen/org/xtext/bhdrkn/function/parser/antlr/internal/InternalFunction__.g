lexer grammar InternalFunction;
@header {
package org.xtext.bhdrkn.function.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[DEFINITIONS]' ;
T12 : '[/DEFINITIONS]' ;
T13 : 'Type1' ;
T14 : 'Type2' ;
T15 : '[FUNCTIONS]' ;
T16 : '[/FUNCTIONS]' ;
T17 : 'function' ;
T18 : '(' ;
T19 : ')' ;
T20 : '[CALLS]' ;
T21 : '[/CALLS]' ;
T22 : 'call' ;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 660
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 662
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 664
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 666
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 668
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 670
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 672
RULE_ANY_OTHER : .;


