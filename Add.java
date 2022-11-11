/** 
 * Une classe qui fait une addition utilisant les args comme entrées<p>
 * USAGE : {@code java Add 4 5} -> il faut ajouter 2 valeurs entières après 
 * le nom de la classe au lancement du programme qui seront passées comme
 * args pour l'addition (comme 4 et 5 dans l'exemple)
 */
public class Add 
{
    public static void main(String[] args) 
    {
        System.out.println( "NOTE : Ce programme doit avoir 2 args qui sont des 'int'." );

        // On obtient la taille d'un tableau en plaçant .length après son nom
        System.out.println( "Il y a " + args.length +  " valeurs dans args.\n");

        /* 
         * Les 2 prochaines lignes de code produiront des erreurs s'il manque des arguments
         * ou si les arguments ne peuvent pas être interprétés comme des nombres entiers.
         */ 

        // Les args sont du texte (String), alors il faut les convertir en entiers
        int a = Integer.parseInt( args[0] ); // index 0, 1e valeur dans String[] args
        int b = Integer.parseInt( args[1] ); // index 1, 2e valeur dans String[] args

        // Le but du programme
        System.out.println( "La somme de " + a + " et " + b + " est " + ( a + b ) );
        System.out.println(); // ligne vide
    }
}
