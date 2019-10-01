// Grammar for language Pp
// Authors:
// Eduardo Enrique Trujillo Ramos - A01187313
// Hugo Oswaldo Garcia Perez      - A00815354

grammar Pp;

r : program0 ;

// Regular Expressions

ID : '_'?[a-zA-Z][a-zA-Z0-9_]* ;
INT_NUMBER : [+|-]?[0-9]+ ;
FLOAT_NUMBER : [+|-]?[0-9]+'.'([0-9]+)?('E'[+|-]?[0-9]+)? ;
STRING_LITERAL : '"'.*?'"' ;
WS : [\t\r\n ]+ -> skip ;

// Grammar

program0 :
  statement0 program0
  | function_decl0 program0
  | // empty
  ;

statement0 :
  variable_decl0
  | assignment0
  | function_call0
  | io_statement0
  | if0
  | while0
  | return0
  ;

block0 : 
  '{' block1 '}'
  ;

block1 :
  statement0 block1
  | // empty
  ;

function_decl0 :
  'func' type0 ID '(' parameters0 ')' block0
  ;

parameters0 :
  type0 ID parameters1
  ;

parameters1 :
  ',' parameters0
  | // empty
  ;

variable_decl0 :
  'let' type0 ID variables_decl1 ';'
  ;

variables_decl1 :
  ',' ID variables_decl1
  | // empty
  ;

assignment0 :
  value0 '=' expression0 ';'
  ;

function_call0 :
  function_call_aux0 ';'
  ;

function_call_aux0 :
  ID '(' function_call_aux1 ')'
  ;

function_call_aux1 :
  ID function_call_aux2
  | // empty
  ;

function_call_aux2 :
  ',' ID function_call_aux2
  | // empty
  ;

if0 :
  'if' '(' bool_exp0 ')' block0 else0
  ;

else0 :
  'elseif' '(' bool_exp0 ')' block0 else0
  | 'else' block0
  | // empty
  ;

while0 :
  'while' '(' bool_exp0 ')' block0
  ;


io_statement0 :
  input0
  | output0
  | plot0
  | readcsv0
  ;

input0 :
  'read' '(' ID ')' ';'
  ;

output0 :
  'write' '(' expression0 ')' ';'
  ;

plot0 :
  'plot' '(' arithmetic_exp0 ',' arithmetic_exp0 ')' ';'
  ;

readcsv0 :
  'readcsv' '(' ID ')' ';'
  ;

return0 :
  'return' expression0 ';'
  ;

expression0 :
  STRING_LITERAL
  | bool_exp0
  | arithmetic_exp0
  ;

bool_exp0 :
  bool_term0 bool_exp1
  | 'not' bool_exp0 bool_exp1
  | arithmetic_exp0 rel_op0 arithmetic_exp0 bool_exp1
  ;

bool_exp1 :
  bool_op0 bool_exp0 bool_exp1
  | // empty
  ;

// X -> Xa | b => X -> bX', X' -> aX' | eps;

bool_term0 :
  'true'
  | 'false'
  | value0
  | function_call_aux0
  ;

bool_op0 :
  'and'
  | 'or'
  | '=='
  | '!='
  ;

rel_op0 :
  '=='
  | '!='
  | '>'
  | '<'
  | '>='
  | '<='
  ;

arithmetic_exp0 :
  numeric_term0 arithmetic_exp1
  |  '(' arithmetic_exp0 ')' arithmetic_exp1
  ;

arithmetic_exp1 :
  math_op0 arithmetic_exp0 arithmetic_exp1
  | // empty
  ;

numeric_term0 :
  sign0 numeric_term1
  | INT_NUMBER
  | FLOAT_NUMBER
  ;

numeric_term1 :
  value0
  | function_call_aux0
  | matrix_literal0
  ;

sign0 :
  '-'
  | // empty
  ;

math_op0 :
  '+'
  | '-'
  | '*'
  | '/'
  | '%'
  | '^'
  ;

type0 :
  basic_type0
  | 'matrix' '<' basic_type0 '>' '[' INT_NUMBER ']' '[' INT_NUMBER ']'
  | 'dataset' '<' basic_type0 type1 '>'
  ;

type1 :
  ',' basic_type0 type1
  | // empty
  ;

basic_type0 :
  'float'
  | 'int'
  | 'string'
  | 'bool'
  ;

value0 :
 ID value1
 ;

value1 :
  '[' arithmetic_exp0 ']' '[' arithmetic_exp0 ']'
  | // empty
  ;

matrix_literal0 :
  '[' matrix_literal1 ']'
  ;

matrix_literal1 :
  '[' matrix_literal2 ']' matrix_literal3
  | // empty
  ;

matrix_literal2 : 
  expression0 matrix_literal4
  | // empty
  ;

matrix_literal3 :
  ',' '[' matrix_literal2 ']' matrix_literal3
  | // empty
  ;

matrix_literal4 :
  ',' expression0 matrix_literal4
  | // empty
  ;


