# Exemples avec la classe Math

> Encore : prendre les exemples et les copier dans jshell pour voir le résultat.

## Opérations plus avancées

```java
// puissances
Math.pow( 10, 3 ); // 10 exposant 3
// racine carrée
Math.sqrt( 64 ); // 8
Math.sqrt( 25.67 ); 
// valeur absolue
Math.abs( -3 ); // 3 (la valeur absolue ignore le signe)
Math.abs( 3 ); // aussi 3
// min et max
Math.max( 23, 27 ); // 27
Math.min( 23, 27 ); // 23
```

## Trigonométrie

```java
// fonctions trigonométrique (les angles sont en radians)
Math.sin( Math.PI / 2 ); // 1
Math.cos( Math.PI / 2 ); // 0
Math.tan( Math.PI / 2 ); // infini 
// convertir les radians -> degrés
Math.toDegrees( Math.PI / 2 ); // 90
Math.toDegrees( 1.54 );
Math.toDegrees( 5 );
// convertir les degrés -> radians
Math.toRadians( 45 );
Math.toRadians( 90 );
Math.toRadians( 180 );
```

## Valeurs aléatoires

```java
// valeurs entre 0.0 (inclus) et 1.0 (exclus)
Math.random();
Math.random();
Math.random();
Math.random();
Math.random();
Math.random();

// utiliser y = mx + b pour avoir des valeurs dans un intervalle choisi
double d;
d = 25 + Math.random() * 25; // entre 25 et 49.999 inclusivement 
d = 25 + Math.random() * 25; // entre 25 et 49 inclusivement
d = 25 + Math.random() * 25; // entre 25 et 49 inclusivement
d = 25 + Math.random() * 25; // entre 25 et 49 inclusivement
int n;
n = (int) ( 1 + Math.random() * 100 ); // entre 1 et 100 inclusivement
n = (int) ( 1 + Math.random() * 100 ); // entre 1 et 100 inclusivement
n = (int) ( 1 + Math.random() * 100 ); // entre 1 et 100 inclusivement
n = (int) ( 1 + Math.random() * 100 ); // entre 1 et 100 inclusivement
n = (int) ( 1 + Math.random() * 100 ); // entre 1 et 100 inclusivement
```