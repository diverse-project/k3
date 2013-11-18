SYNTAXDEF expArithmtxt
FOR <http://expArithm> <expArithm.genmodel>
START ExpressionArithm

OPTIONS {
	reloadGeneratorModel = "true";
	usePredefinedTokens = "false";
}

TOKENS {
    DEFINE FRAGMENT DIGIT $('0'..'9')$;
    DEFINE VALUE DIGIT + $+('.'$ + DIGIT + $+)?$ ;
    DEFINE LINEBREAK $('\r\n'|'\r'|'\n')$;
    DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}


TOKENSTYLES {
	"+" COLOR #000080, BOLD;
	"-" COLOR #000080, BOLD;
	"*" COLOR #000080, BOLD;
	"/" COLOR #000080, BOLD;
}

RULES {
	ExpressionArithm ::= racine? ;
	Valeur ::= valeur[VALUE];
	Plus ::= "+" EltGauche eltDroit ;
	Mult ::= "*" EltGauche eltDroit ;
	Division ::= "/" EltGauche eltDroit ;
	Moins ::= "-" EltGauche eltDroit ;
}