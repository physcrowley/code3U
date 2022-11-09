# Identifiants Java
        
Toute chose qu'on nomme dans un programme Java doit avoir un nom, soit un **identifiant**, unique.

## Conventions pour les différents types de noms

### 🛑 Interdit

* être un des mots-clés de Java, p. ex.: `if`, `while`, `public`, `class`
* commencer avec un nombre
* inclure un espace
* toute ponctuation sauf `_` et `$`

### Classes

Commence avec une majuscule, casse chameau (🐫)

> La casse chameau est appelé ainsi parce les mots subséquents commencent par une majuscule, créant une "bosse" à chaque nouveau mot.

Exemples : `MyClass`, `String`, `SuperIncredibleProject`

### Méthodes

Commence avec une minuscule, casse chameau (🐫)

Exemples : `main`, `toUpperCase`, `print`, `makeSomethingSpecial`

### Variables

Comme les méthodes

Exemples : `firstName`, `startingNum`, `index`, `result`

### Constantes

Tout en majuscules, séparés par des `_`

Exemples : `MAX_VALUE`, `PI`, `REFERENCE_POINT`

### 🚧 Déconseillé : 

* Inclure des accents (à cause des problèmes d'encodage)
