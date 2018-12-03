Software : Fahrzeuganalyse+ autonomesFahren [Klimaregulation] [mobilerRouter] [Unterhaltung] onboardComputer :: _Software ;

Fahrzeuganalyse : Scheibenwischwasser
	| Ölstand
	| Reifendruck ;

autonomesFahren : Umgebungsanalyse Geschwindigkeitsregulierung Lenkung Routenplanung :: _autonomesFahren ;

onboardComputer : Sprachsteuerung
	| manuelleSteuerung ;

%%

Unterhaltung implies mobilerRouter ;

