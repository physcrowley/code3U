import java.util.Scanner;

class Selection
{
    public static void main(String[] args) 
    {
        /*
         * La sélection rend un programme intelligent.
         * 
         * C'est ce qui lui permet de faire des choix.
         * 
         * Selon le résultat true/false d'une condition
         * un bloc de code ou un autre sera exécuté.
         * 
         * La sélection présente une fourche ou un
         * branchement dans le code. Seulement un
         * chemin sera suivi.
         * 
         * Les mots-clés pour la sélection sont :
         * IF
         * ELSE
         * ELSE IF
         */

        //exemple1();
        //exemple2();
        exemple3();

    }

    static void exemple3()
    {
        System.out.println( "Exemple 3" );
        Scanner in = new Scanner( System.console().reader() );
        System.out.print( "Choisir un nombre parmis les suivants (1, 3, 7) > ");
        int answer = in.nextInt();

        /*
         * L'opération OU / OR -> ||
         * L'opération ET / AND -> &&
         */
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

    static void exemple1() // une méthode - instructions nommées
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