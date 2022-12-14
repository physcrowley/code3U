# Exemples de code pour le cours ICS3U
> version 2022

Les exemples sont préparés pour téléchargement par les élèves du cours ICS3U de M. Crowley. 

Ces exemples sont complémentaires aux leçons présentées en classe et sont souvent la base des exercices.

## Utilisation

<details>
    <summary><i>Afficher ce fichier (et tous les autres .md) en mode Preview par défaut</i></summary>

Pour afficher les fichiers Markdown (.md) en mode Preview, simplement :
* faire un clic-droit sur un fichier .md dans l'Explorateur de VS Code (p. ex. README.md)
* choisir "Ouvrir avec..." > "Configurer l'éditeur par défaut pour "*.md""
* cliquer sur "Markdown Preview"

Tous les fichiers .md s'ouvriront maintenant en mode Preview directement.

>Par la suite, si vous voulez modifier un ficher .md, vous pouvez simplement cliquer sur "Ouvrir avec..." > "Éditeur de texte"

</details>
<p></p>
<details>
    <summary><i>Clôner est synchroniser le dossier sur votre ordinateur</i></summary>

* Cloner le répertoire sur votre ordinateur
* Si l'enseignant ajoute des nouveaux fichiers, simplement faire un Fetch (cliquer sur le bouton synchroniser dans VS Code)
* Copier tout exemple (fichier ou package) que vous voulez utiliser comme gabarit dans votre propre dossier de projet
    * vous n'êtes pas autorisé à apporter des modifications à ce répertoire
    * si vous en faites, vous aurez des messages d'erreur quand vous tenter de synchroniser ce dossier à nouveau

</details>

## Structure

<details>
    <summary><i>Cliquez pour voir les informations</i></summary>

Tout le code se trouve dans le même dossier racine - c'est voulu : on peut alors facilement utiliser du code de n'importe quel fichier existant dans n'importe quel nouveau fichier. Dans le jargon de Java, tout le code se trouve dans le même *package*, et les membres d'un package peuvent toujours se voir.

</details>

## Répertoire

### Structure de base

Cette section du cours nous montre comment implémenter les opérations d'**entrée/sortie**, d'**assignation** et de **calcul** qu'on a vu dans le module 2 sur les algorithmes. Ça montre aussi où un programme Java commence et où il se termine.

#### Organisation du code

* [Bonjour.java](Bonjour.java)
* [Commentaires.java](Commentaires.java)
* [Documentation.java](Documentation.java)
* [Ponctuation.java](Ponctuation.java)
* [Identifiers.java](Identifiers.java)

#### Types de données

* [Types.java](Types.java)
* [Operations.java](Operations.java)
* [StringOps.java](StringOps.java)

#### Affichage à la console

* [Println.java](Println.java)
* [Print.java](Print.java)
* [Printf.java](Printf.java)

#### Utiliser la bibliothèque standard

* [MoreMath.java](MoreMath.java)

#### Saisir des données

* [PromptInput.java](PromptInput.java)
* [FileInput.java](FileInput.java)
* [Add.java](Add.java) -> utiliser `String[] args`

### Tester et valider le code

Cette section du cours nous donne des outils pour identifier les erreurs dans notre programme plus rapidement.

#### Messages d'erreur

#### Déboguer par afficher

#### Débogueurs intégrés

### Planifier la solution au problème

Cette section du cours nous aide à réfléchir à une solution avant de se perdre dans les détails du Java (et les bogues).

#### Décrire le problème avec un diagramme ETS ("IPO" en anglais)

#### Décrire les cas de test importants

#### Décrire l'algorithme qui réalise l'ETS (diagramme de flux ou pseudocode)

### Structures de contrôle

Cette section du cours présente comment implémenter la **sélection** et l'**itération** qu'on a vu dans le module 2 sur les algorithmes, complétant la tournée des outils algorithmiques fondamentaux.

#### Sélection

#### Itération

### Structures de données

Cette section du cours nous montre comment plus efficacement gérer de grandes quantités de données.

#### Strings

#### Tableaux

### Code modulaire

Cette section du cours nous montre comment produire du code qui est réutilisable et qui peut être intégré efficacement dans différents projets. Par la bande, on apprend aussi une façon plus efficace de tester chaque partie de notre code séparément.

#### Méthodes

#### Classes
* Pour les algorithmes
* Pour tester les algorithmes
