import java.util.Scanner;

public class MethodsToValidate{
    public static void main(String[] args ){
        /*
         * pseudocode :
         * demander des valeurs numériques
         * vérifier que les réponses sont valides
         * arrêter quand une valeur spécifique est entrée, sinon répéter la demande
         * calculer la somme des valeurs numériques
         */
        
        // Invite de commande
        System.out.println("Entrer un nombre ou -99 pour arrêter");

        // Traitement
        double sum = 0;
        double val;
        do {
            val = getDouble();
            sum += val;
        } while (val != -99);
        sum += 99;
        
        // Afficher le résultat
        System.out.println("La somme de ces nombres est " + sum);
    }

    static double getDouble() {
        Scanner input = new Scanner( System.console().reader() );
        System.out.print("> "); // invite de valeur
        String next = input.next(); // saisir la valeur
        return definitelyADouble( next ); // retourner la valeur convertie
    }

    static double definitelyADouble( String s ) {
        // bloc try-catch, quand on tente de faire quelque chose
        // qui peut faire planter le programme
        // si le programme plante, il va dans le bloc catch au lieu
        // de s'arrêter
        try{
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("   ;-( Pas un nombre valide");
            return getDouble();
        }
    }
}