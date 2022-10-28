```java
/*
 * Exemples avec les différents opérateurs pour les Strings à exécuter dans jshell
 */
/*
    * CONCATENATION DU TEXTE
    * + entre un texte et n'importe quel autre type de donnée produit un plus
    * long texte combinant la valeur des deux.
    * 
    */
String s = "Un début " + "de phrase";
s = "Olé! ";
s = s + s + s;
s += s; // équivalent à s = s + s;

String name = "David";
int id = 101010;
double average = 87.4;
String student = name + " (" + id + ") : moyenne = " + average;
double best = 99.7;
student = student + " (best = " + best + ")";

/*
    * CHANGER LA CASSE
    */

s.toLowerCase(); // minuscules
s.toUpperCase(); // majuscules


/*
    * CONVERTIR LE TEXTE EN VALEURS NUMÉRIQUES
    * 
    * Il y a une classe pour chaque type de donnée numérique. P. ex. :
    *    int -> class Integer
    *    double -> class Double
    *    boolean -> class Boolean
    * 
    * Dans ces classes, il y une méthode "parse" qui tente de traduire un texte
    * dans le format numérique demandé.
    */

String sNum = "1", sVal = "3.5", sIsWrong = "false";

int iCalc;
//iCalc = sNum + 1; // erreur parce sNum n'est pas numérique
int num = Integer.parseInt( sNum ); // traduit le texte en int
iCalc = num + 1;

double dCalc;
//dCalc = sVal + 1.0; // erreur parce sVal n'est pas numérique
double val = Double.parseDouble( sVal ); // traduit le texte en double
dCalc = val + 1.0;

boolean isItWrong;
//isItWrong = sIsWrong; // erreur parce que sIsWrong n'est pas un booléen
boolean isWrong = Boolean.parseBoolean( sIsWrong ); // traduit le texte en booléen
isItWrong = isWrong;


```