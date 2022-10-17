public class Print {
    public static void main(String[] args) {
        
        /*
         * System.out.print()
         * 
         * print() est une autre méthode de l'objet System.out pour
         * afficher du texte. Il agit exactement comme println() sauf
         * qu'il n'ajoute pas de retour de ligne à la fin. Le curseur
         * restera à la fin du texte affiché.
         * 
         * Parce que cette méthode n'ajoute rien, il faut absolumment
         * lui donner quelque chose à afficher, sinon le programme
         * renvoit un message d'erreur.
         * 
         */

        // mots
        System.out.print( "Mon ");
        System.out.print( "nom " );
        System.out.print( "est ");
        System.out.print( "Jean.");

        System.out.println(); // retour de ligne

        /*
         * Caractères d'échappement
         * 
         * On peut manuellement ajouter des retours de ligne ou des
         * tabulations avec des caractères d'échappement. Voici une courte
         * liste :
         * 
         * \n retour de ligne
         * \t tabulation
         * \" insérer un guillemet dans le texte à afficher
         * \' insérer un apostrophe dans le texte à afficher
         * \\ insérer un \ dans le texte à afficher
         * 
         */

        System.out.print( "Deux\nlignes\n" );
        System.out.print( "\n" ); // ligne vide avec print
        System.out.print( "En-tête\n" );
        System.out.println( "\t- item 1");
        System.out.println( "\t- item 2");
        System.out.println(); // ligne vide avec println

        // compléter une ligne d'affichage avec println
        System.out.print( "Le résultat de 3 * 4 est "); 
        System.out.println( 3 * 4 ); // s'affiche à la fin du print

    }
    
}
