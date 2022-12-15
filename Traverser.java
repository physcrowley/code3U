class Traverser {
    public static void main(String[] args) {
        
        int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        String mot = "Généreux";
        String[] jours = {
            "lundi", "mardi", "mercredi", "jeudi", "vendredi",
            "samedi", "dimanche"
        };

        //
        // pour voir juste un seul exemple à la fois, placer les autres derrière
        // un commentaire
        //
        // chaque méthode est définie après main() - elle inclut simplement 
        // le code fourni dans les notes de cours
        //

        // traverser avec des boucles while
        whileWithNumbers(fib);
        sep(); // affiche un séparateur
        whileWithText(mot);

        // traverser avec des boucles for
        sep(); sep();
        forWithNumbers(fib);
        sep();
        forWithText(mot);

        // traverser avec des boucles for-each
        sep(); sep();
        forEachWithTextArray(jours);
        sep();
        forEachWithNumbers(fib);
        sep();
        forEachWithText(mot);
        
        
    }

    static void sep(){
        System.out.println("\n-------------------------------\n");
    }

    static void whileWithNumbers( int[] nums ) {
        int i = 0; // i représente l'index
        while ( i < nums.length ) { // utiliser la taille du tableau comme condition
            System.out.println( nums[ i ] ); // ou autre(s) opération(s) avec nums[i]
            i++; // changer l'index
        }
    }

    static void whileWithText( String word ) {
        int i = 0; // l'index
        while ( i < word.length() ) {  // utiliser la taille du String comme condition
            System.out.println( word.charAt( i ) ); // ou autres opérations sur le char
            i++; // changer l'index
        }
    }

    static void forWithNumbers( int[] nums ) {
        for ( int i = 0; i < nums.length; i++ ) { // tous les éléments dans la déclaration
            System.out.println( nums[ i ] ); // ou autre(s) opération(s) avec nums[i]
        }
    }

    static void forWithText( String word ) {
        for( int i = 0; i < word.length(); i++ ) { // tous les éléments dans la déclaration
            System.out.println( word.charAt( i ) );
        }
    }

    static void forEachWithTextArray( String[] jours ) {
        for ( String jour : jours ) { // se lit "For each String in the String array jours"
            System.out.println( jour ); // ou autre opération avec la valeur de l'élément
        }
    }
    
    static void forEachWithNumbers( int[] nums ) {
        for ( int n : nums ) { // se lit "For each int in the int array nums"
            System.out.println( n ); // ou autre opération avec la valeur de l'élément
        }
    }

    static void forEachWithText( String word ) {
        for ( char letter : word.toCharArray() ) { // se lit "For each char in the char array"
            System.out.println( letter ); // ou autre opération avec la valeur de l'élément
        }
    }
}