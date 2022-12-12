// les classes du package java.lang (comme System, String et Math) 
// sont toujours importéss automatiquement par Java. Toutes les
// autres doivent être importées explicitement

import java.util.Locale; // importe la classe Locale du package java.util
import java.util.Scanner; // importe la classe Scanner du package java.util

/**
 * Exemples avec un Scanner <p> qui scanne la console
 * USAGE : lire les commentaires et le code source. Ensuite, compiler et
 * lancer le programme via la console pour voir l'effet pour l'utilisateur.
 * @author physcrowley (2022-10)
 */
public class PromptInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.console().reader() );
        // input.useLocale( Locale.CANADA); // format anglais

        // acceuil
        System.out.println( "Bonjour!" ); 

        // invite de commande
        System.out.print( "Quel est votre prénom? > " );
        // instruction d'entrée
        String firstName = input.next(); // un seul mot
        // confirmation
        System.out.println( "\nBienvenue, " + firstName + "." );

        
        System.out.print( "Taper une courte phrase > ");
        String firstWord = input.next(); // un seul mot
        System.out.println( "J'ai capté : " + firstWord );
        String restOfSentence = input.nextLine(); // tout ce reste entre le dernier mot et le retour de ligne
        System.out.println( "Et le reste de la phrase : " + restOfSentence );

        System.out.print( "Entrez votre age > " );
        int age = input.nextInt(); // mot -> int si possible

        System.out.print( "Entrez votre masse en lb > " );
        double masse = input.nextDouble(); // mot -> double si possible

        // sortie formatée
        System.out.printf( 
            "\nMerci %s (age : %d, poids : %.1flb).\n", 
            firstName, age, masse );
        System.out.println( "Je me souviendrez toujours que vous m'avez dit :");
        System.out.println( firstWord + " " + restOfSentence );
        System.out.println( "\nAu revoir!" );
    }
    
}
