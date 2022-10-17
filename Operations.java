/** Exemples avec les différents opérateurs à exécuter dans jshell
 * @author physcrowley (2022-10)
 */
public class Operations {

    /** Aucune instruction de sortie, alors le programme se lance sans
     * afficher de résultat. Transcrire ou copier les exemples dans jshell
     * pour voir les résultats.
     */
    public static void main(String[] args) {
        
        /*
         * OPÉRATIONS ARITHMÉTIQUES SUR LES NOMBRES
         * 
         * + addition
         * - soustraction
         * / division
         * * multiplication
         * 
         * AUTOASSIGNATION
         * 
         * C'est lorsqu'on assigne à une variable une nouvelle valeur calculée à
         * partir de sa valeur actuelle.
         * 
         *     n++ -> équivalent à n = n + 1
         *     n-- -> équivalent à n = n - 1
         *     n += 5; -> équivalent à n = n + 5;
         *     n -= 5; -> équivalent à n = n - 5;
         *     n *= 5; -> équivalent à n = n * 5;
         *     n /= 5; -> équivalent à n = n / 5;
         */

        int a, b, c; // déclaration de trois int
        a = 5;
        b = 12;
        c = 3 + a * b; // PEDMAS s'applique (multiplication avant addition)
        c++; // équivalent à c = c + 1
        b--; // équivalent à b = b - 1

        double x = 2.5, y = -13.1, z; // déclaration et initialisation de quelques double
        z = x / y;
        z = z*z;
        x *= x; // équivalent à x = x*x;
        y -= 20; // équivalent à y = y - 20;

        /*
         * RÉSULTATS SURPRENANTS AVEC LES ENTIERS
         *
         * / division entière
         * % modulo (restant)
         *
         */

        // division avec deux nombres à virgule flottante
        x = 7; y = 2; // x = 7.0, y = 2.0
        z = x / y; // z = 3.5

        // division avec deux entiers
        a = 7; b = 2;
        c = a / b; // c = 3
            // La division entre 2 entiers produit un résultat entier qui laisse tomber
            // la partie décimale.

        z = a / b; // z = 3.0 
            // la division entière est évaluée avant d'assigner le résultat au double z
        
        // modulo (restant)
        c = 7 % 2; // c = 1 (lorsqu'on divise 7 par 2, le restant est 1)
        c = 24 % 3; // c = 0 (aucun restant, 24 se divise parfaitement par 3)

        /*
         * CONVERSION ENTRE LES TYPES NUMÉRIQUES (CASTING)
         * 
         * int -> double : automatique (Java ajoute .0)
         * double -> int : erreur parce que Java devra supprimer la partie décimale
         * 
         * CASTING explicite
         * On peut demander à Java de convertir un double -> int (et supprimer la partie
         * décimale). Voir l'exemple ci-dessous. 
         */
        
        // conversion automatique
        z = a / b; // a / b = 3 -> z = 3.0 (int 3 converti automatiquement au double 3.0)
        z = c; // z = 0.0 (0 -> 0.0)
        // c = 12.7; // produit une erreur parce que la conversion perdrait le .7

        // conversion explicite
        z = (double) a / b; // z = 3.5 parce qu'on fait 7.0 / 2
        z = a / (double) b ; // z = 3.5 parce qu'on fait 7 / 2.0
        z = (double)( a / b ); // z = 3.0 parce qu'on fait 7 / 2 = 3 -> 3.0
            // c'est une forme explicite de ce que Java fait automatiquement

        c = (int) z; // c = 3 parce qu'on converti 3.5 -> 3

    }
    
}
