/** 
 * Exemples avec <pre>System.out.println()</pre>
 * @author physcrowley (2022-10)
 */
public class Println {
    public static void main(String[] args) {
        /*
         * System.out.println()
         * 
         * out est un objet liée à la console (au terminal) du système
         * d'exploitation.
         * 
         * Cet objet est défini dans la classe System, d'où "System.out".
         * 
         * L'objet out a plusieurs façons d'afficher du texte au terminal,
         * dont la méthode println().
         * 
         * println() convertit tout ce qui est entre ses parenthèses en texte
         * avant de l'afficher. Finalement, il ajoute un retour de ligne qui
         * place le curseur au début de la prochaine ligne au terminal.
         */

        int a = 3;
        double x = 3.5;
        String s = "coucou";

        System.out.println( a ); // convertit int -> String et l'affiche
        System.out.println( x ); // convertit double -> String et l'affiche
        System.out.println( s ); // affiche le String
        System.out.println( a + x + s ); // évalue le calcul avant la concaténation
        System.out.println(); // ligne vide

        // slalom - un ASCII art pathétique
        System.out.println("x                      ");
        System.out.println(" x                     ");
        System.out.println("  x                    ");
        System.out.println("    x                  ");
        System.out.println("       x               ");
        System.out.println("         x             ");
        System.out.println("            x          ");
        System.out.println("              x        ");
        System.out.println("               x       ");
        System.out.println("              x        ");
        System.out.println("           x           ");
        System.out.println("        x              ");
        System.out.println("      x                ");
        System.out.println("    x                  ");
        System.out.println("     x                 ");
        System.out.println("       x               ");
        System.out.println("          x            ");
        System.out.println("              x        ");
        System.out.println("                  x    ");
        System.out.println("                 x     ");
    }
}
