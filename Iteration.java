import java.util.Scanner;

public class Iteration {
    
    public static void main(String[] args) {
        
        // ----------- WHILE -----------

        // afficherNombres(1, 10);
        // afficherNombres(2, 6);

        devinerNombre();

        
        // -------- DO - WHILE ---------
        



        
        // ----- while (true) et break -----

        
        
    }

    static void afficherNombres( int start, int end)
    {
        Scanner input = new Scanner( System.console().reader() );

        int num = start;
        while ( num <= end )
        {
            System.out.println( num );
            // augmenter num afin que la boucle puisse s'arrêter
            // éventuellement
            num++; // équivalent aux deux suivants
            // num = num + 1;
            // num += 1;
        }
    }


    static void devinerNombre()
    {
        Scanner input = new Scanner( System.console().reader() );

        int hiddenValue = 12; // valeur cible à deviner

        int answer = 0; // answer prend les réponses de l'utilisateur

        // se répète jusqu'à ce que l'utilisateur choisit la bonne valeur
        while ( answer != hiddenValue )
        {
            System.out.println( "Entrer un nombre entre 0 et 20" );

            /*
             * Vérifier que la réponse est un int afin d'éviter
             * de faire planter le programme.
             */
            if ( input.hasNextInt() )
            {
                // changer la valeur de answer permet à la boucle
                // d'arrêter éventuellement
                answer = input.nextInt();

                // vérifier que la valeur est dans le bon intervalle
                if ( answer >= 0 && answer <= 20 )
                {
                    // vérifier si c'est la bonne réponse
                    if ( answer == hiddenValue )
                    {
                        System.out.println( "Bravo!" );
                    }
                    else
                    {
                        System.out.println( "Essaye encore" );
                    }
                }
                else
                {
                    System.out.println( "Pas entre 0 et 20" );
                }
            }
            else // pas un entier
            {
                System.out.println( "Ce n'était pas un nombre entier" );
                input.next(); // le prendre et l'oublier (ne pas garder)
            }
        }
    }
}
