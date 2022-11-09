import java.util.Scanner;

class Selection
{
    public static void main(String[] args) 
    {
        //exemple1(); // les méthodes sont, à la base, des instructions nommées
        //exemple2(); // ça, c'est un APPEL de méthode qui lance les instructions
        exemple3(); // faire Ctrl + clic pour sauter à la DÉFINITION de méthode
    }

    static void exemple3()
    {
        System.out.println( "Exemple 3" );
        Scanner in = new Scanner( System.console().reader() );

        System.out.print( "Choisir un nombre parmis les suivants (1, 3, 7) > ");
        int answer = in.nextInt();

        // même logique que l'exemple 2, mais on combine plusieurs conditions
        // avec l'opérateur OR (||) pour éviter le copiage des blocs de code
        // identiques.
        if ( answer == 1 || answer == 3 || answer == 7 )
        {
            System.out.println( "valide" );
        }
        else 
        {
            System.out.println( "invalide" );
        }
    }

    static void exemple2()
    {
        System.out.println( "Exemple 2" );
        Scanner in = new Scanner( System.console().reader() );

        System.out.print( "Choisir un nombre parmis les suivants (1, 3, 7) > ");
        int answer = in.nextInt();

        if ( answer == 1 )
        {
            System.out.println( "valide" );
        }
        else if ( answer == 3 )
        {
            System.out.println( "valide" );
        }
        else if ( answer == 7 )
        {
            System.out.println( "valide" );
        }
        else 
        {
            System.out.println( "invalide" );
        }
    }

    static void exemple1() // une méthode = instructions nommées
    {
        System.out.println( "Exemple 1" );
        Scanner in = new Scanner( System.console().reader() );

        //
        // ENTRÉE
        //

        // invite de commande
        System.out.print("Couleur préférée (minuscules) ? > ");
        // entrée
        String answer = in.nextLine();

        //
        // TRAITEMENT
        //

        String result;

        /*
         * Pour comparer du texte, on doit utiliser la
         * méthode equals, p.ex. "this".equals("that") et non
         * "this" == "that"
         * 
         * Pour les nombres, on utilise toujours ==, p. ex.
         * 1 == 2 ou -3 == -3.0
         */

        //if ( answer.equals("bleu") ) // la casse est importante
        if ( answer.equalsIgnoreCase("bleu") ) // la casse n'est pas importante
        {
            result = "Meilleure réponse";
        }
        else if ( answer.equalsIgnoreCase("vert") )
        {
            result = "Bonne réponse";
        }
        else
        {
            result = "Mauvais goût";
        }
    

        //
        // SORTIE
        //

        System.out.println( result );
    }
}