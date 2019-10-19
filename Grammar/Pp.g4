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
BOOL_LITERAL : 'true' | 'false' ;
WS : [\t\r\n ]+ -> skip ;

// Grammar

program0 :
  variable_decl0 program1
  | program1
  ;
program1 :
  statement0 program1
  | function_decl0 program1
  | // empty
  ;

statement0 :
  assignment0
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
  'func' type0 ID '(' parameters_or_empty0 ')' decl_block0
  ;

decl_block0 :
  '{' variable_decl0 decl_block1 '}'
  ;

decl_block1 :
  statement0 decl_block1
  | // empty
  ;

parameters_or_empty0:
  parameters0
  | // empty
  ;

parameters0 :
  type0 ID parameters1
  ;

parameters1 :
  ',' parameters0
  | // empty
  ;

variable_decl0 :
  'let' type0 ID variables_decl1 ';' variable_decl0
  | // empty
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
  expression0 function_call_aux2
  | // empty
  ;

function_call_aux2 :
  ',' expression0 function_call_aux2
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
  ;

bool_exp0 :
  | bool_term0 bool_exp1
  | 'not' bool_exp0 bool_exp1
  ;

bool_exp1 :
  bool_op0 bool_exp0 bool_exp1
  | // empty
  ;

// X -> Xa | b => X -> bX', X' -> aX' | eps;

bool_term0 :
  arithmetic_exp0 bool_term1
  ;

bool_term1 :
  rel_op0 arithmetic_exp0
  | // empty
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
  arithmetic_factor0 arithmetic_exp1
  ;

arithmetic_exp1 :
  addition_subtraction0 arithmetic_factor0 arithmetic_exp1
  | // empty
  ;

addition_subtraction0 :
  '+'
  | '-'
  ;

arithmetic_factor0 :
  arithmetic_term0 arithmetic_factor1
  ;

arithmetic_factor1 :
  multiplication_division0 arithmetic_term0 arithmetic_factor1
  | // empty
  ;

multiplication_division0 :
  '*'
  | '/'
  | '%'
  ;

arithmetic_term0 :
  numeric_term0 arithmetic_term1
  ;
  
arithmetic_term1 :
  exponent0 numeric_term0
  | // empty
  ;

exponent0 :
  '^'
  ;

numeric_term0 :
  sign0 numeric_term1
  | INT_NUMBER
  | FLOAT_NUMBER
  | BOOL_LITERAL
  |  '(' bool_exp0 ')'
  ;

numeric_term1 :
  value0
  | stat_functions0
  | function_call_aux0
  | matrix_literal0
  ;

sign0 :
  '-'
  | // empty
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

stat_functions0 :
  mean0
  | median0
  | mode0
  | stdev0
  | variance
  | beta0
  | binom0
  | exp0
  | gamma0
  | geom0
  | norm0
  | pois0
  | unif0
  ;

mean0 :
  'mean' '(' expression0  ')'
  ;

median0 :
  'median' '(' expression0  ')'
  ;

mode0 :
  'mode' '(' expression0  ')'
  ;

stdev0 :
  'stdev' '(' expression0  ')'
  ;

variance :
  'variance' '(' expression0  ')'
  ;

beta0 :
  dbeta0
  | cbeta0
  | rbeta0
  ;

dbeta0 :
  'dbeta' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

cbeta0 :
  'cbeta' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

rbeta0 :
  'rbeta' '(' expression0 ',' expression0 ')'
  ;

binom0 :
  dbinom0
  | cbinom0
  | rbinom0
  ;

dbinom0 :
  'dbinom' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

cbinom0 :
  'cbinom' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

rbinom0 :
  'rbinom' '(' expression0 ',' expression0 ')'
  ;

exp0 :
  dexp0
  | cexp0
  | rexp0
  ;

dexp0 :
  'dexp' '(' expression0 ',' expression0 ')'
  ;

cexp0 :
  'cexp' '(' expression0 ',' expression0 ')'
  ;

rexp0 :
  'rexp' '(' expression0 ')'
  ;

gamma0 :
  dgamma0
  | cgamma0
  | rgamma0
  ;

dgamma0 :
  'dgamma' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

cgamma0 :
  'cgamma' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

rgamma0 :
  'rgamma' '(' expression0 ',' expression0 ')'
  ;

geom0 :
  dgeom0
  | cgeom0
  | rgeom0
  ;

dgeom0 :
  'dgeom' '(' expression0 ',' expression0 ')'
  ;

cgeom0 :
  'cgeom' '(' expression0 ',' expression0 ')'
  ;

rgeom0:
  'rgeom' '(' expression0 ')'
  ;

norm0 :
  dnorm0
  | cnorm0
  | rnorm0
  ;

dnorm0 :
  'dnorm' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

cnorm0 :
  'cnorm' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

rnorm0 :
  'rnorm' '(' expression0 ',' expression0 ')'
  ;

pois0 :
  dpois0
  | cpois0
  | rpois0
  ;

dpois0 :
  'dpois' '(' expression0 ',' expression0  ')'
  ;

cpois0 :
  'cpois' '(' expression0 ',' expression0  ')'
  ;

rpois0 :
  'rpois' '(' expression0  ')'
  ;

unif0 :
  dunif0
  | cunif0
  | runif0
  ;

dunif0 :
  'dunif' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

cunif0 :
  'cunif' '(' expression0 ',' expression0 ',' expression0 ')'
  ;

runif0 :
  'runif' '(' expression0 ',' expression0 ')'
  ;
