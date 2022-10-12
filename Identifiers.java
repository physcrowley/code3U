public class Identifiers {
    public static void main(String[] args) {
        
        /*
         * Toute chose qu'on nomme dans un programme Java doit avoir un nom,
         * soit un IDENTIFIANT, unique.
         * 
         * La sortie suivante présente les conventions et les quelques
         * interdictions pour le choix des identifiants.
         */

        System.out.println("Conventions pour les différents types de noms");
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Interdit : ");
        System.out.println("    -être un des mots-clés de Java, p. ex.: if, while, public");
        System.out.println("    -commencer avec un nombre");
        System.out.println("    -inclure un espace");
        System.out.println("    -toute ponctuation sauf '_' et '$'");
        System.out.println();
        System.out.println("Classes : Commence avec une majuscule, casse chameau");
        System.out.println("    ex. : MyClass, String, SuperIncredibleProject");
        System.out.println();
        System.out.println("Méthodes : Commence avec une minuscule, casse chameau");
        System.out.println("    ex. : main, toUpperCase, print, makeSomethingSpecial");
        System.out.println();
        System.out.println("Variables : comme les méthodes");
        System.out.println("    ex. : firstName, startingNum, index, result");
        System.out.println();
        System.out.println("Constantes : tout en majuscules, séparés par des '_'");
        System.out.println("    ex. : MAX_VALUE, PI, REFERENCE_POINT");
        System.out.println();
        System.out.println("Déconseillé : ");
        System.out.println("    -inclure des accents à cause des problèmes d'encodage"); 
        System.out.println();
    }

}
