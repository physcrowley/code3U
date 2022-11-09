# Opérations sur les nombres dans Java

> Les exemples ci-dessous se suivent. Vous devrez les copier ou transcrire dans jshell et les lancer pour voir les résultats.

## Opérations arithmétiques

* `+` addition
* `-` soustraction
* `/` division
* `*` multiplication

## Autoassignation

L'**autoassignation** est lorsqu'on assigne à une variable une nouvelle valeur calculée à partir de sa valeur actuelle.

* `n++` -> **incrémentation** : équivalent à `n = n + 1`
* `n--` -> **décrémentation** : équivalent à `n = n - 1`
* `n += 5;` -> équivalent à `n = n + 5;`
* `n -= 5;` -> équivalent à `n = n - 5;`
* `n *= 5;` -> équivalent à `n = n * 5;`
* `n /= 5;` -> équivalent à `n = n / 5;`

## Exemples avec des nombres entiers
```java
int a, b, c; // déclaration de trois int
a = 5;
b = 12;
c = 3 + a * b; // PEDMAS s'applique (multiplication avant addition)
c++; // équivalent à c = c + 1
b--; // équivalent à b = b - 1
```

## Exemples avec des nombres à virgule flottante

```java
double x = 2.5, y = -13.1, z; // déclaration et initialisation de quelques double
z = x / y;
z = z*z;
x *= x; // équivalent à x = x*x;
y -= 20; // équivalent à y = y - 20;
```


## Résultats surprenants avec les nombres entiers

* `/` division entière (laisse tomber la partie décimale)
* `%` modulo (restant)


```java
// division avec deux nombres à virgule flottante
double x = 7; y = 2; // x = 7.0, y = 2.0
z = x / y; // z = 3.5

// division avec deux entiers
int a = 7; b = 2;
c = a / b; // c = 3
    // La division entre 2 entiers produit un résultat entier qui laisse tomber
    // la partie décimale.

z = a / b; // z = 3.0 
    // la division entière est évaluée avant d'assigner le résultat au double z

// modulo (restant)
c = 7 % 2; // c = 1 (lorsqu'on divise 7 par 2, le restant est 1)
c = 24 % 3; // c = 0 (aucun restant, 24 se divise parfaitement par 3)
```

## Conversion entre les types numériques (Casting)

La conversion d'un résultat entre des types compatibles s'appelle le **casting**.

* `int` -> `double` : automatique (Java ajoute .0)
* `double` -> `int` : erreur parce que Java devra supprimer la partie décimale, ce qui représente une perte d'information.

### Casting explicite

On peut demander à Java de convertir un `double` -> `int` (et supprimer la partie décimale). Pour le faire, on doit **mettre le type voulu entre parenthèses devant le résultat à convertir**, comme dans les exemples ci-dessous. 

```java
int a = 7, b = 2;
int c = 0;
double z;
// conversion automatique
z = a / b; // a / b = 3 -> z = 3.0 (int 3 converti automatiquement au double 3.0)
z = c; // z = 0.0 (0 -> 0.0)
// c = 12.7; // produit une erreur parce que la conversion perdrait le .7

// conversion explicite
z = (double) a / b; // z = 3.5 parce qu'on fait 7.0 / 2
z = a / (double) b ; // z = 3.5 parce qu'on fait 7 / 2.0
z = (double)( a / b ); // z = 3.0 parce qu'on fait 7 / 2 = 3 -> 3.0
    // c'est une forme explicite de ce que Java fait automatiquement

c = (int) z; // c = 3 parce qu'on converti 3.5 -> 3
```
