/** 
 * Exemples de <pre>System.out.print()</pre><p>
 * Les notes détaillées sont dans le fichier PrintNotes.md 
 * @author physcrowley (2022-10)
 */
public class Print {
    public static void main(String[] args) {

        // mots
        System.out.print( "Mon " );
        System.out.print( "nom " );
        System.out.print( "est " );
        System.out.print( "Jean." );

        System.out.println(); // retour de ligne

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
