# Opérateurs sur le texte dans Java

> Copier ou transcrire les exemples ci-dessous dans jshell pour voir le résultat


## Concaténation du texte

La **concaténation** est quand deux ou plusieurs valeurs sont collées pour former un seul texte. Au moins une des valeurs doit être du texte, sinon l'opérateur `+` fera une addition entre les nombres.

Il faut simplement placer l'opérateur `+` entre le texte et n'importe quel autre type de donnée.

```java
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
```

## Changer la casse

On utilise les méthodes `toLowerCase()` et `toUpperCase()` sur les String.

```java
String s = "Ma réponse est MAGNIFIQUE!";
s.toLowerCase(); // minuscules
s.toUpperCase(); // majuscules
"Nom Propre".toLowerCase();
```

## Convertir le texte en valeurs numériques

Il y a une classe pour chaque type de donnée numérique. P. ex. :

* `int` -> classe `Integer`
* `double` -> classe `Double`
* `boolean` -> class `Boolean`

Dans ces classes, il y une méthode **parse** qui tente de traduire un texte
dans le format numérique demandé. P. ex. :

* `Integer.parseInt( texte )`
* `Double.parseDouble( texte )`

```java
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
