/*
 * Les éléments de la bibliothèque standard que nous avons utilisés jusqu'à
 * maintenant - System, String, Math - sont tous dans le package java.lang.
 * Vous pouvez le voir en mettant votre curseur sur le mot String dans un
 * des programmes : son nom complet est java.lang.String. Tout ce qui est
 * dans ce package est directement accessible dans tout programme, sans
 * action additionnelle.
 * 
 * On va maintenant utiliser quelque chose de la bibliothèque standard qui
 * est dans un autre package - java.util. Parce que ça vient d'un autre
 * package, on doit déclarer l'importation explicitement.
 */
import java.util.Locale; // importe la classe Locale du package java.util
import java.util.Scanner; // importe la classe Scanner du package java.util

/**
 * Exemples avec un Scanner <p>
 * USAGE : lire les commentaires et le code source. Ensuite, compiler et
 * lancer le programme via la console pour voir l'effet pour l'utilisateur.
 * @author physcrowley (2022-10)
 */
public class PromptInput 
{
    public static void main(String[] args) 
    {
        /* 
         * Créer un objet de type Scanner qui observera un autre objet,
         * soit System.console().reader(). Cet objet fait référence
         * à tout ce qui est tapé à la console où notre programme est
         * lancé.
         * 
         * La plupart des exemples que vous trouverez dans des manuels
         * ou en ligne utilise plutôt l'objet System.in qui fait aussi
         * référence à la console. Par contre, sur Windows, System.in
         * utilise un encodage qui n'est pas compatible avec l'UTF-8 et
         * si l'utilisateur tape des caractères avec des accents, ils
         * seront mal interprétés par nos programmes.
         * 
         * System.console().reader() n'a pas le même problème. Il fonctionne
         * bien avec des programmes en UTF-8, même sur Windows.
         * 
         * MISE EN GARDE : cela fonctionne seulement si le programme est
         * lancé en mode interactif. Si, par contre, il est lancé par un
         * programme test qui fournit toutes les entrées via un fichier 
         * (de manière automatisé), System.in va quand même fonctionner
         * mais pas System.console().reader() parce que la console n'est
         * pas utilisée.
         */
        Scanner input = new Scanner( System.console().reader() );
        // input.useLocale( Locale.CANADA);

        System.out.println( "Bonjour!" ); // acceuil

        // Les commentaires sont pour nous et les autres développeurs.
        // Si on veut communiquer avec l'utilisateur du programme, on
        // doit afficher une INVITE DE COMMANDE comme ceci
        System.out.print( "Quel est votre prénom? > " );

        // Voici l'instruction d'ENTRÉE. Chaque objet Scanner a plusieurs
        // méthodes pour saisir différents types de valeurs. Pour du texte
        // c'est la méthode .next()
        String firstName = input.next();
        System.out.println( "\nBienvenue, " + firstName + "." ); // confirmation

        System.out.print( "Taper une courte phrase > "); // invite de commande
        String firstWord = input.next(); // entrée -> next() prend juste un mot
        System.out.println( "J'ai capté : " + firstWord ); // confirmation

        // Au lieu d'un seul mot [comme next()], nextLine() prend tout jusqu'au 
        // retour de ligne. Parce que le dernier appel a saisit juste le 1e
        // mot, il reste encore des éléments dans le System.console().reader()
        // qu'on peut lire.
        String restOfSentence = input.nextLine(); 
        System.out.println( "Et le reste de la phrase : " + restOfSentence );

        System.out.print( "Entrez votre age > " );
        int age = input.nextInt(); // convertit texte -> int si possible

        System.out.print( "Entrez votre masse en lb > " );
        double masse = input.nextDouble(); // convertit texte -> double si possible

        System.out.printf( 
            "\nMerci %s (age : %d, poids : %.1flb).\n", 
            firstName, age, masse );
        System.out.println( "Je me souviendrez toujours que vous m'avez dit :");
        System.out.println( firstWord + " " + restOfSentence );
        System.out.println( "\nAu revoir!" );

        /*
         * RAPPEL DE QUELQUES MÉTHODES D'ENTRÉE
         * 
         * next() -> String (prochain mot)
         * nextLine() -> 1- String (tout le texte jusqu'au retour de ligne)
         *               2- C'est aussi utile pour vider une ligne et passer 
         *               à la prochaine : simplement appeler nextLine() sans
         *               assigner la valeur à une variable
         * nextInt() -> int
         * nextDouble() -> double
         * 
         */
    }
    
}
