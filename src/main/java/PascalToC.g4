grammar PascalToC;

/*
 * Parser rules
*/

program: (programHeader)? blocks DOT EOF;

programHeader: PROGRAM IDENT SEMICOLON;

blocks: (constBlock | varBlock | functionBlock)* codeBlock;

constBlock: CONST (constDefinition)+;
constDefinition: IDENT COLON type EQUAL constValue SEMICOLON;
constValue: (NUMBER | LITERAL | IDENT);

varBlock : VAR (varDefinition)+;
varDefinition: varIdent (SEMICOLON varIdent)* SEMICOLON;
varIdent: identList COLON type;

identList: IDENT (COMMA IDENT)*;
type: (INTEGER | STRING | BOOLEAN | DOUBLE | CHAR);

functionBlock: (functionDefinition | procedureDefinition) (varBlock)? codeBlock SEMICOLON;
functionDefinition: FUNCTION IDENT LPAREN args RPAREN COLON type SEMICOLON;
procedureDefinition: PROCEDURE IDENT LPAREN args RPAREN SEMICOLON;
args: ((VAR)? identList COLON type (SEMICOLON (VAR)? identList COLON type)*)?;

codeBlock: BEGIN statements END;

statements: statement (SEMICOLON statement)*;
statement: simpleStatement | structuredStatement;
simpleStatement : assignStatement | procedureStatement | ;
assignStatement: varName ASSIGN expression;
procedureStatement: IDENT LPAREN parameterList RPAREN;

expression: simpleExpression (lastPriorityOperator expression)?;
simpleExpression: term (thirdPriorityOperator simpleExpression)?;
term: signedFactor (secondPriorityOperator term)?;
signedFactor: (PLUS | MINUS)? factor;
factor: varName | LPAREN expression RPAREN | functionalCall | unsignedConstant | NOT factor | bool;
functionalCall: IDENT LPAREN parameterList RPAREN;
parameterList: expression (COMMA expression)*;
secondPriorityOperator: STAR | DIV | MOD | AND;
thirdPriorityOperator: PLUS | MINUS | OR;
lastPriorityOperator: EQUAL | NOT_EQUAL | GT | LT | GE | LE;

varName: IDENT;

structuredStatement: codeBlock | conditionalStatement | repetetiveStatement;
conditionalStatement: ifStatement;
ifStatement: IF expression THEN statements (ELSE statements)?;
repetetiveStatement: whileStatement | repeatStatement | forStatement;
whileStatement: WHILE expression DO statement;
repeatStatement: REPEAT statements UNTIL expression;
forStatement: FOR varName ASSIGN expression (TO | DOWNTO) expression DO statement;

bool: (TRUE | FALSE);
unsignedConstant : unsignedNumber #numberConst| LITERAL #literalConst| NIL #nullConst;
unsignedNumber : NUMBER;

/*
 * Lexer rules
*/

// tokens
fragment A : ('a' | 'A');
fragment B : ('b' | 'B');
fragment C : ('c' | 'C');
fragment D : ('d' | 'D');
fragment E : ('e' | 'E');
fragment F : ('f' | 'F');
fragment G : ('g' | 'G');
fragment H : ('h' | 'H');
fragment I : ('i' | 'I');
fragment J : ('j' | 'J');
fragment K : ('k' | 'K');
fragment L : ('l' | 'L');
fragment M : ('m' | 'M');
fragment N : ('n' | 'N');
fragment O : ('o' | 'O');
fragment P : ('p' | 'P');
fragment Q : ('q' | 'Q');
fragment R : ('r' | 'R');
fragment S : ('s' | 'S');
fragment T : ('t' | 'T');
fragment U : ('u' | 'U');
fragment V : ('v' | 'V');
fragment W : ('w' | 'W');
fragment X : ('x' | 'X');
fragment Y : ('y' | 'Y');
fragment Z : ('z' | 'Z');
fragment DIGITS: ('0'..'9')+;
fragment SIGN: ('-' | '+');


PROGRAM : P R O G R A M;

FUNCTION: F U N C T I O N;
PROCEDURE: P R O C E D U R E;

CONST: C O N S T;

VAR: V A R;

BEGIN: B E G I N;
END: E N D;

INTEGER: I N T E G E R;
BOOLEAN: B O O L E A N;
CHAR: C H A R;
DOUBLE: D O U B L E;
STRING: S T R I N G;

LPAREN: '(';
RPAREN: ')';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';

ASSIGN: ':=';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: D I V;
MOD: M O D;

EQUAL: '=';
NOT_EQUAL: '<>';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

OR: O R;
AND: A N D;
NOT: N O T;

TRUE: T R U E;
FALSE: F A L S E;

NIL: N I L;

IF: I F;
THEN: T H E N ;
ELSE: E L S E;

FOR: F O R;
TO: T O;
DOWNTO: D O W N T O;
WHILE: W H I L E;
DO: D O;
REPEAT: R E P E A T;
UNTIL: U N T I L;

NUMBER: (SIGN)? DIGITS (DOT DIGITS)?;
IDENT: ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
LITERAL : '\'' ('\'\'' | ~ ('\''))* '\'';

WS : [ \t\r\n] -> skip;