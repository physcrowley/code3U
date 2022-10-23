/**
 * Une classe qui présente quelques exemples de types de données de base en Java
 * @author physcrowley (2022-10)
 */
class Types{
    public static void main(String[] args) {

        /*
         * NOTES -> DÉCLARER DES VARIABLES
         * 
         * Une variable est une valeur nommée.
         * 
         * Dans Java, il faut spécifier le type de donnée que la variable 
         * représente, p. ex. :
         * 
         * int -> nombre entier
         * char -> caractère unique Unicode
         * double -> valeur numérique à virgule flottante
         * boolean -> valeur true ou false
         * String -> texte
         * 
         * On peut donner une INSTRUCTION DE DÉCLARATION qui donne seulement 
         * le type et le nom de la variable.
         * 
         * On peut aussi donner une INSTRUCTION D'ASSIGNATION qui assigne une
         * valeur de type appropriée à la variable.
         * 
         * Quand on assigne une valeur, cette valeur peut être :
         *     - LITTÉRALE, p. ex. : 1, -25.6, 'v', "David"
         *     - le résultat d'une expression (comme une autre variable ou un
         *       calcul)
         * 
         * La première fois qu'une variable est assignée une valeur s'appelle
         * son INSTRUCTION D'INITIALISATION.
         */

        /*
         * INSTRUCTIONS
         * 
         * Copiez et collez ces instructions 1-par-1 dans un terminal jshell
         * et taper Enter pour voir ce qui se passe.
         * 
         *    ATTENTION! Avec le terminal intégré de VS Code, la combinaison
         *    Ctrl + V ne semble pas marcher dans jshell. Il faut faire un 
         *    clic-droit pour coller le code dans le terminal.
         * 
         * Puisqu'il n'y a aucune instruction de sortie/affichage dans ce
         * programme, si vous le compilez et le lancez, vous ne verrez rien.
         */
        
        // ------------ NOMBRES ENTIERS -------------- 

        int num; // déclaration
        num = 3; // initialisation avec une valeur littérale
        int otherNum = 5; // déclaration et initialisation avec une autre valeur littérale
        num = otherNum; // assignation avec une expression (variable otherNum)


        // ----------- VIRGULES FLOTTANTES -------------

        double val; // déclaration
        val = -2.5; // le décimal est un point (.) pour les valeurs littérales
        
        final double PI = Math.PI; // assignation avec une expression
            // notez que les majuscules suggèrent que Math.PI est une constante 
            // déclarée dans la classe Math
            // la nouvelle variable PI dans cette classe est aussi une constant
            // parce qu'on a ajouté le mot-clé 'final' à sa déclaration

        
        // ------------ BOOLÉENS --------------------

        boolean go = false; // les valeurs littérales sont les mot-clés 'true' ou 'false'
        boolean isBigger = 3 > 1; // assignation avec une expression conditionnelle


        // ----------- CARACTÈRES UNICODE -------------

        char a = 97; // 97 est le code décimal pour le caractère 'a'
        char c = 'c'; // on utilise des apostrophes (') pour les valeurs littérales
        int cCode = c; // obtenir le code numérique d'un char

        // caractères spéciaux
        int arrowCode = '→'; // 8594 sur ma machine (valeur décimale)
        char arrow = '\u8594'; // probablement pas une flèche
        arrow      = '\u2192'; // valeur hexadécimale de 8594; 
                               // toujours probabalement pas une flèche

        /* 
         * À cause des difficultés avec les différents encodages, surtout sur Windows,
         * ce n'est pas recommandé d'utiliser directement les valeurs Unicode pour des
         * symboles spéciaux parce qu'ils seront mal interprétés via un tableau de
         * caractères spécifiques à Windows et non via les tableaux UTF-8
         */


        // -------------- TEXTE -------------------

        /*
         * Les STRING sont utilisés pour représenter le texte.
         * 
         * Un STRING est une structure de données plus complexe qui agit comme une
         * chaîne de char. Contrairement aux autres types vus plus haut, le
         * String est une classe et contient donc plusieurs méthodes pour
         * travailler avec le texte.
         * 
         * Notez que, parce que c'est une classe, le nom du type commence avec
         * une lettre majuscule.
         */

        String alphabet;
        alphabet = "abcdefghijklmnopqrstuvwxyz"; // la valeur littérale est entourée
                                                 // de guillemets (")
        alphabet = alphabet.toUpperCase(); // une méthode pour changer la casse

        String alphanum = alphabet + "0123456789"; // le symbole + joint 2 Strings

    }
}