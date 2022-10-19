public class Add 
{
    /**
     * {@code String[] args} est un tableaux de valeurs de type {@code String}. 
     * On verra plus sur les tableaux plus tard dans le cours, mais il suffit 
     * de savoir qu'on peut accéder aux valeurs individuelles en utilisant 
     * leur <b>index</b>, soit un chiffre qui donne leur position dans le tableau.
     * <p>
     * USAGE : p. ex. : {@code java Add 4 5} -> il faut ajouter 2 valeurs entières après 
     * le nom de la classe (comme 4 et 5 dans l'exemple)
     */
    public static void main(String[] args) 
    {
        System.out.println( "NOTE : Il faut lancer ce programme" );
        System.out.println( "       avec 2 nombres entiers après le nom de classe.\n" );

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
