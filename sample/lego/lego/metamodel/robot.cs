SYNTAXDEF robot
FOR <http://robot/1.0>
START FlotCtrl.ProgramUnit

TOKENS {
DEFINE BOOLEAN_LITERAL $'true'|'false'$;
DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;
DEFINE INT_LITERAL $('0'|'1'..'9''0'..'9'*)$;
}

TOKENSTYLES {
	"STRING_LITERAL" COLOR #2A00FF;
	"do" COLOR #7F0055, BOLD;
	"end" COLOR #7F0055, BOLD;
	"while" COLOR #7F0055, BOLD;
	"and" COLOR #7F0055, BOLD;
	"if" COLOR #7F0055, BOLD;
	"then" COLOR #7F0055, BOLD;
	"else" COLOR #7F0055, BOLD;
	"not" COLOR #7F0055, BOLD;
	"bip" COLOR #0000FF, BOLD;
	"move" COLOR #0000FF, BOLD;
	"obstacle" COLOR #0000FF, BOLD;
	"hasTurned" COLOR #0000FF, BOLD;
	"turn" COLOR #0000FF, BOLD;
	"setTurnAngle" COLOR #0000FF, BOLD;
	"stopEngine" COLOR #0000FF, BOLD;
	"stopProgram" COLOR #0000FF, BOLD;
	"display" COLOR #0000FF, BOLD;
	"duration" COLOR #6D1050, ITALIC;
	"power" COLOR #6D1050, ITALIC;
	"repeat" COLOR #6D1050, ITALIC;
	"angle" COLOR #6D1050, ITALIC;
	"msg" COLOR #6D1050, ITALIC;
	"col" COLOR #6D1050, ITALIC;
	"line" COLOR #6D1050, ITALIC;
	"distance" COLOR #6D1050, ITALIC;
}

RULES {
	FlotCtrl.ProgramUnit ::=  block* ;

	@Operator(type="binary_left_associative", weight="1", superclass="BoolExp")
	FlotCtrl.AndExp ::= leftExp "and" rightExp ;

	@Operator(type="unary_prefix", weight="2", superclass="BoolExp")
	FlotCtrl.NegExp ::= "not" exp;
	
	@Operator(type="primitive", weight="3", superclass="BoolExp")
	Robot.HasTurnedCmd ::= "hasTurned" "(" "angle" "=" angle[INT_LITERAL] ")" ;

	@Operator(type="primitive", weight="3", superclass="BoolExp")
	Robot.ObstacleCmd ::= "obstacle" "(" "distance" "=" distance[INT_LITERAL] ")" ;

	@Operator(type="primitive", weight="3", superclass="Expression")
	FlotCtrl.WhileLoop ::= "while" loopCond "do" block* "end" ;

	@Operator(type="primitive", weight="3", superclass="Expression")
	FlotCtrl.IfBlock ::= "if" condition "then" thenBlock+ ("else" elseBlock*)? "end" ;

	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.Bip ::= "bip" "(" "duration" "=" duration[INT_LITERAL] "," "power" "=" power[INT_LITERAL] "," "repeat" "=" repet[BOOLEAN_LITERAL]  ")" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.MoveCmd ::= "move" "(" "power" "=" power[INT_LITERAL] ")" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.PrintCmd ::= "display" "(" "msg" "=" msg[STRING_LITERAL] "," "duration" "=" duration[INT_LITERAL] "," "line" "=" line[INT_LITERAL] "," "col" "=" col[INT_LITERAL] ")" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.SetTurnAngleCmd ::= "setTurnAngle" "(" "angle" "=" angle[INT_LITERAL] ")" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.StopEngineCmd ::= "stopEngine" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.StopProgramCmd ::= "stopProgram" ;
	
	@Operator(type="primitive", weight="3", superclass="Expression")
	Robot.TurnCmd ::= "turn" "(" "power" "=" power[INT_LITERAL] "," "angle" "=" angle[INT_LITERAL] ")" ;
}