import java.util.Scanner;

class StringRange {
    
    public static void main(String[] args) {
        Scanner console = new Scanner( System.console().reader() );
        

        System.out.print( "Taper un caractère de a à g > ");
        String rep = console.next().toLowerCase();

        // je veux 1 caractère dans les caractères permis
        // String carPermis = "abcdefg";
        // if ( rep.length() == 1 && carPermis.contains( rep ) )
        
        // je veux entre "a" et "g" 
        if ( rep.compareTo("a") >= 0 && rep.compareTo("g") <= 0 ) {
            System.out.println( "réponse valide");
        }
        else {
            System.out.println( "pas permis");
        }

    }
}