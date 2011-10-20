lexer grammar InternalFouroperation;
@header {
package org.xtext.bhdrkn.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'operation' ;
T13 : '{' ;
T14 : '}' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : '/' ;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 996
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 998
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1000
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1002
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1004
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1006
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1008
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.bhdrkn.fouroperation.ui/src-gen/org/xtext/bhdrkn/ui/contentassist/antlr/internal/InternalFouroperation.g" 1010
RULE_ANY_OTHER : .;


