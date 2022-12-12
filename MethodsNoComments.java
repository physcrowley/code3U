import java.util.Scanner;

public class MethodsNoComments {

    private static Scanner input = new Scanner( System.console().reader() );

    public static void main(String[] args) {

        // System.out.print( "accueil... " );
        greet();
        
        // System.out.print( "obtenir le nom... " );
        String name = getName();
        
        // System.out.print( "déterminer le prix... ");
        int points = prize( name );
        
        // System.out.print( "produire le prix... " );
        String prize = makePrize( name, points );
        
        // System.out.println( "afficher le prix... " );
        System.out.println( prize );
    }

    public static void greet(){
        System.out.println( "Bonjour!" );
    }

    public static String getName(){
        System.out.print( "Quel est votre nom? > " );
        return input.nextLine();
    }
    
    public static int prize( String s ) {
        int n = s.length();
        if ( n >= 10 ) return 10;
        if ( n >= 5 ) return 5;
        return 1;
    }

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
