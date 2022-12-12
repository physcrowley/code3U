import java.util.Scanner;

/** Classe qui montre les différents types de méthodes.
 * <p>
 * Toutes les méthodes ont le format [type] [identifiant]( [paramètres] ) {...}
 * <p>
 * Le type est liée à la valeur de retour de la méthode. Si la méthode ne retourne
 * rien, son type est {@code void}.
 * @author physcrowley (2022-10)
 */
public class Methods {

    /** 
     * Objet de type Scanner accessible par toutes les méthodes de la classe
     * comme {@code base.Methods.getName()}
     */
    private static Scanner input = new Scanner( System.console().reader() );

    public static void main(String[] args) {

        /*
         * Ici, les appels de fonctions assignent les valeurs de retour à des
         * variables et fournissent des valeurs à assigner aux paramètres.
         */
        System.out.print( "accueil... " );
        greet();
        
        System.out.print( "obtenir le nom... " );
        String name = getName();
        
        System.out.print( "déterminer le prix... ");
        int points = prize( name );
        
        System.out.print( "produire le prix... " );
        String prize = makePrize( name, points );
        
        System.out.println( "afficher le prix... " );
        System.out.println( prize );

    }

    /** Méthode sans paramètre ni valeur de retour */
    public static void greet(){
        System.out.println( "Bonjour!" );
    }

    /** Méthode sans paramètre qui retourne une valeur
     * @return le nom spécifié par l'utilisateur au clavier
     */
    public static String getName(){
        System.out.print( "Quel est votre nom? > " );
        return input.nextLine();
    }

    /** Méthode avec paramètre et avec valeur de retour 
     * @param s n'importe quel String
     * @return une valeur entière selon la longueur du String {@code s}
    */
    public static int prize( String s ) {
        int n = s.length();
        if ( n >= 10 ) return 10;
        if ( n >= 5 ) return 5;
        return 1;

        /*
        * Notez que l'instruction `return` met fin immédiatement à la méthode.
        * 
        * C'est pourquoi ce serait inutile de mettre des `else` si le bloc `if`
        * contient une instruction de retour. 
        *
        * Si la condition précédante est true, le `return` met fin à la méthode. 
        * Sinon, on passe à la ligne suivante. Donc on passe seulement à la 
        * ligne suivante si le `if` est false, exactement comme la structure 
        * if - else if.
        * 
        */
    }

    /**
     * Une méthode avec plusieurs paramètres et une valeur de retour
     * 
     * @param name le nom du/de la gagnant/e
     * @param points le nombre de points obtenus
     * @return un String représentant une pyramide de taille proportionnelle
     * au nombre de points
     */
    public static String makePrize( String name, int points ){
        StringBuilder out = new StringBuilder(); 
        out.append( "\n" + name + ", votre nom vous mérite cette pyramide :\n\n" );
        // triangle grandissant
        for ( int i = 1; i <= points; i++ ){
            // ligne contenant i * 'O'
            for ( int j = 0; j < i; j++ ) out.append( 'O' );
            out.append( '\n' );
        }
        // triangle diminuant
        for ( int i = points - 1; i > 0; i-- ){
            // ligne contenant i * 'O'
            for ( int j = 0; j < i; j++ ) out.append( 'O' );
            out.append( '\n' );
        }
        return out.toString();
    }

}
