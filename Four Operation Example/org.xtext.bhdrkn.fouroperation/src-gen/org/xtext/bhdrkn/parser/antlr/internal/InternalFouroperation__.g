lexer grammar InternalFouroperation;
@header {
package org.xtext.bhdrkn.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'operation' ;
T13 : '{' ;
T14 : '}' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : '/' ;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 568
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 570
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 572
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 574
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 576
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 578
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 580
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation/src-gen/org/xtext/bhdrkn/parser/antlr/internal/InternalFouroperation.g" 582
RULE_ANY_OTHER : .;


