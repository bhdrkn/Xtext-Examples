lexer grammar InternalFunction;
@header {
package org.xtext.bhdrkn.function.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[FUNCTIONS]' ;
T12 : '[/FUNCTIONS]' ;
T13 : 'function' ;
T14 : '[CALLS]' ;
T15 : '[/CALLS]' ;
T16 : 'call' ;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 349
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 351
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 353
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 355
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 357
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 359
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.function/src-gen/org/xtext/bhdrkn/function/parser/antlr/internal/InternalFunction.g" 361
RULE_ANY_OTHER : .;


