/**
 * Exemples de
 * <pre>
 *System.out.printf()
 *String.format()
 </pre>
 @author physcrowley (2022-10)
 */
public class Printf {
    public static void main(String[] args) {
        
        /*
         * System.out.printf
         * 
         * une autre méthode pour afficher le texte, mais cette fois-ci,
         * plus configurable au coût de plus de complexité.
         * 
         * VOIR LES NOTES DANS LE MANUEL POUR LES DÉTAILS
         * Le code ici sont les exemples dans les notes.
         * 
         */
        
        String firstName = "David", lastName = "Crowley";
        System.out.printf( "%s %S\n", firstName, lastName ); // noter la casse
        
        int kilo = 1024;
        System.out.printf( "En décimal : %d, en hex : %x\n", kilo, kilo ); 
        
        double p = 3.1415926535897932385;
        double t = 2 * p;
        System.out.printf( "Pi : %f, Tau : %f\n", p, t ); // précision par défaut

        // spécifier la précision des nombres à virgule flottante
        System.out.printf( "Pi : %.2f, Tau : %.2f\n", p, t );
        System.out.printf( "Pi : %.4f, Tau : %.4f\n", p, t );
        System.out.printf( "Pi : %.15f, Tau : %.15f\n", p, t );

        /*
         * String.format
         * 
         * prend les mêmes arguments que printf mais retourne un String 
         * formaté au lieu de l'afficher. On peut l'assigner à une 
         * variable de type String.
         * 
         */
        
        // spécifier la largeur
        String s = String.format( "%8d  %8d  %8d", 12, 24, 48 );
        System.out.println( s );
        s = String.format( "%-8d  %-8d  %-8d", 12, 24, 48 ); // aligné à gauche
        System.out.println( s );
        s = String.format( "%08d  %08d  %08d", 12, 24, 48 ); // rempli avec des 0
        System.out.println( s );

        // NOTE : c'est possible de spécifier la largeur avec tous les types, 
        // pas juste les String.
    }
    
}
