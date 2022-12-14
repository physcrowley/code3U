/**
 * Exemples de
 * <pre>
 *System.out.printf()
 *String.format()
 * </pre><p>
 * Voir le manuel du cours pour plus de détails
 * @author physcrowley (2022-10)
 */
public class Printf {
    
    public static void main(String[] args) {
        
        //
        // System.out.printf
        //
        
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

        //
        // String.format
        //

        // spécifier la largeur
        String s;
        s = String.format( "%8d  %8d  %8d", 8, 32, 128 ); // 8 caractères de large
        System.out.println( s );
        s = String.format( "%-8d  %-8d  %-8d", 8, 32, 128 ); // aligné à gauche
        System.out.println( s );
        s = String.format( "%08d  %08d  %08d", 8, 32, 128 ); // rempli avec des 0
        System.out.println( s );

        // NOTE : c'est possible de spécifier la largeur avec tous les types, 
        // pas juste les String.
    }
    
}
