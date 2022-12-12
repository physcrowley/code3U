/** 
 * Exemples avec <pre>System.out.println()</pre><p>
 * Les notes détaillées sont dans le manuel du cours
 * @author physcrowley (2022-10)
 */
public class Println {
    
    public static void main(String[] args) {

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
