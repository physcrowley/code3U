# Notes sur différents façons d'afficher au terminal

## Caractères d'échappement

On peut manuellement ajouter des retours de ligne, des
tabulations et d'autres caractères spéciaux dans nos textes avec des caractères d'échappement. 
Voici une courte liste :

* `\n` retour de ligne
* `\t` tabulation
* `\"` insérer un guillemet dans le texte à afficher
* `\'` insérer un apostrophe dans le texte à afficher
* `\\` insérer un \ dans le texte à afficher

Voir les classes [Print.java](./Print.java) et [Printf.java](./Printf.java) pour des exemples.

## System.out

`out` est un objet d'affichage liée à la console (au terminal) du système
d'exploitation.

Cet objet est défini dans la classe `System`, d'où `System.out`.

L'objet `out` a plusieurs façons d'afficher du texte au terminal,
dont les méthodes :
* `println`
* `print` et
* `printf`

## System.out.println

`println` convertit tout ce qui est entre ses parenthèses en texte
avant de l'afficher. Finalement, il :

* ajoute un retour de ligne 
* qui place le curseur au début de la prochaine ligne.

### Code avec les exemples

Le code dans la classe [Println](./Println.java) inclut des exemples d'utilisation de `System.out.println`.

* Lire le code source dans ce fichier
* Compiler et lancer le programme pour voir la sortie.

## System.out.print

`System.out.print` est une autre méthode de l'objet `System.out` pour afficher du texte. Il agit exactement comme `println` sauf 

* qu'il **n'ajoute pas de retour de ligne à la fin**
* le curseur restera à la fin du texte affiché

Parce que cette méthode n'ajoute rien (contrairement à println qui ajoute un retour de ligne), il faut absolumment
lui donner quelque chose à afficher, sinon le programme
renvoit un message d'erreur.

### Code avec les exemples

Le code dans la classe [Print](./Print.java) inclut des exemples d'utilisation de `System.out.print`

* Lire le code source dans ce fichier
* Compiler et lancer le programme pour voir la sortie.

## System.out.printf et String.format

`System.out.printf` est une autre méthode pour afficher le texte, mais :

* plus configurable/flexible/personnalisable
* plus complexe 

`String.format` prend les mêmes arguments que `System.out.printf` mais retourne un `String` formaté au lieu de l'afficher. On peut l'assigner à une variable de type `String`.

### Notes plus détaillées

Il y a [une présentation Google Slides](https://docs.google.com/presentation/d/1PY2C5CiXlKepv-A88xfAJskgtlpY2emlK9lNpg8x4oI/present) avec les détails sur les différents arguments à passer à `printf` et à `String.format`.

### Code avec les exemples

Le code dans la classe [Printf](./Printf.java) rassemble les exemples dans la présentation Google Slides.

* Lire le code source dans ce fichier
* Compiler et lancer le programme pour voir la sortie.

## Pratique

N'oublier pas de faire les tâches de pratique dans [le manuel du cours](https://bit.ly/manICS3U) > Module 5 > Structure de base > Affichage à la console.