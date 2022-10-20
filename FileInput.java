import java.io.File;        // classe File dans le package java.io
import java.io.FileWriter;  // classe FileWriter dans le package java.io
import java.util.Locale;    // classe Locale dans le package java.util
import java.util.Scanner;   // classe Scanner dans le package java.util

public class FileInput 
{
    /*
     * à main() on DOIT ajouter "throws Exception" parce qu'il y a une
     * possibilité de plantage (d'une "Exception") si Java ne peut pas 
     * trouver le fichier avec le chemin qu'on a spécifié.
     */
    public static void main(String[] args) throws Exception
    {
        String filePath = "./data/input1.txt"; 
            // où se trouve le fichier par rapport à la racine du projet
        
        /*
         * Ici, le Scanner observera un objet de type File qu'on utilise
         * pour ouvrir et manipuler des fichiers.
         * En utilisant des fichiers texte, on utilise les mêmes méthodes
         * de Scanner qu'on a utilisées pour traiter les entrées de la
         * console.
         */
        Scanner fileReader = new Scanner( new File( filePath ) );

        /*
         * C'est important de savoir comment les données sont structurées
         * dans le fichier avant de saisir les valeurs.
         * Dans ce cas, input1.txt contient 3 lignes :
         * - un nom
         * - un chiffre avec un . comme décimal
         * - un nombre entier
         * 
         */

        // Parce que les ordis sont configurés en français et on sait que
        // le fichier contient des valeurs décimales avec un ., il faut
        // dire au Scanner d'utiliser les règles anglaises pour interpréter
        // les nombres.
        fileReader.useLocale( Locale.CANADA ); 
            // supprimer .CANADA et retaper le . pour voir une liste des
            // divers Locales disponibles
        
        //
        // ENTRÉE
        // Saisir les valeurs dans le fichier
        //

        String name = fileReader.next();
        double height = fileReader.nextDouble(); // présumé en mètres
        double weight = fileReader.nextDouble(); // présumé en kg

        // fermer le Scanner afin de libérer le fichier
        // Si on oublie de faire ça, on risque de ruiner les données dans le 
        // fichier ou d'empêcher d'autres programmes d'y accéder.
        fileReader.close();

        //
        // TRAITEMENT
        // Se servir des valeurs pour faire quelque chose
        //

        // la formule du BMI pour les kg et les mètres
        double BMI = weight / ( height * height );

        //
        // SORTIE
        //

        String output = name + " a un BMI de " + BMI;

        // à la console
        System.out.println( output );

        // vers un fichier

        // chemin du nouveau fichier
        String outputFile = "./data/output1.txt"; 
        
        // Au lieu de System.out (pour la console), on utilise un FileWriter
        // Si le fichier n'existe pas déjà, il sera créé.
        // Si le fichier existe, son contenu sera remplacé
        FileWriter fWriter = new FileWriter( outputFile );
        fWriter.write( output );
        fWriter.close(); 
            // encore, il faut fermer l'objet qui manipule le fichier
            // afin de protéger son contenu et le rendre accessible au
            // système d'exploitation
    }
}
