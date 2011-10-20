lexer grammar InternalFunction;
@header {
package org.xtext.bhdrkn.function.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '[FUNCTIONS]' ;
T12 : '[/FUNCTIONS]' ;
T13 : 'function' ;
T14 : '[CALLS]' ;
T15 : '[/CALLS]' ;
T16 : 'call' ;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 678
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 680
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 682
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 684
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 686
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 688
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.function.ui/src-gen/org/xtext/bhdrkn/function/ui/contentassist/antlr/internal/InternalFunction.g" 690
RULE_ANY_OTHER : .;


