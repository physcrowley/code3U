import java.util.Scanner;

public class Iteration {
    
    public static void main(String[] args) {
        
        // ----------- WHILE -----------

        // afficherNombres(1, 10);
        // afficherNombres(2, 6);

        //devinerNombre();

        
        // -------- DO - WHILE ---------
        
        //devinerNombre2();


        
        // ----- while (true) et break -----

        //presqueToujours();
        boucleDeJeu();

        //sauterNombres(); // exemple avec CONTINUE
        
    }

    static void boucleDeJeu()
    {
        Scanner console = new Scanner( System.console().reader() );
        System.out.println( "Bienvenue au jeu de chance." );

        // boucle du jeu
        while ( true )
        {
            System.out.println( "On va rouler une dé. Ça prend 4 pour gagner." );
            System.out.println( "Taper [Entrée] pour rouler." );
            console.nextLine(); // attendre Entrée
            int num = 1 + (int) (Math.random() * 6); // valeur de 1 à 6

            System.out.println( "Vous avez roulé un " + num );
            if (num == 4 )
            {
                System.out.println( "Vous avez gagné! C'est la fin du jeu.");
                break; // fin de la boucle du jeu
            }
        }
    }
    
    static void presqueToujours()
    {
        int i = 1;
        while( true )
        {
            System.out.println( i +"this is the song that never ends..." );
            i++;
            if ( i > 500 )
            {
                System.out.println( "Sauf ici");
                break; // termine la boucle
            }
        }
    }
    
    static void sauterNombres()
    {
        int i = 0;
        while ( i < 20 )
        {
            i++;
            if ( i % 2 == 0 ) // divisble par 2
            {
                continue; // ne rien faire
            }
            System.out.println( i );
        }
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

    static void devinerNombre2()
    {
        Scanner input = new Scanner( System.console().reader() );

        int hiddenValue = 12; // valeur cible à deviner

        int answer; // answer prend les réponses de l'utilisateur

        // se répète jusqu'à ce que l'utilisateur choisit la bonne valeur
        do
        {
            System.out.println( "Entrer un nombre entre 0 et 20" );

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
        } while ( answer != hiddenValue );
    }
}
