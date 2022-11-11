import java.io.File;        // classe File dans le package java.io
import java.io.FileWriter;  // classe FileWriter dans le package java.io
import java.util.Locale;    // classe Locale dans le package java.util
import java.util.Scanner;   // classe Scanner dans le package java.util

public class FileInputOutput 
{
    public static void main(String[] args) throws Exception { // à cause des fichiers
               
        //
        // ENTRÉE
        // Saisir les valeurs dans le fichier
        //

        // préparation du Scanner pour lire le fichier
        String filePath = "./data/input1.txt"; 
        Scanner fileReader = new Scanner( new File( filePath ) );

        // sachant que la source utilise des . (format anglais)
        fileReader.useLocale( Locale.CANADA );

        // le format du fichier est Nom(un mot) hauteur(double) masse(double)
        String name = fileReader.next();
        double height = fileReader.nextDouble(); // présumé en mètres
        double weight = fileReader.nextDouble(); // présumé en kg

        // libère le fichier après les entrées
        fileReader.close();


        //
        // TRAITEMENT
        // Se servir des valeurs pour faire quelque chose
        //

        // la formule du BMI pour les kg et les mètres
        double BMI = weight / ( height * height );


        //
        // SORTIE - console et fichier
        //

        // texte à afficher et à enregistrer
        String output = name + " a un BMI de " + BMI;

        // instruction de sortie > console
        System.out.println( output ); 

        // préparation d'un FileWriter
        // le fichier sera crée s'il n'existe pas ou remplacé s'il existe déjà
        String outputFile = "./data/output1.txt";
        FileWriter fWriter = new FileWriter( outputFile );

        // instruction de sortie > fichier
        fWriter.write( output );

        // il faut se rappeler de fermer les objets qui manipulent des fichiers
        fWriter.close();
    }
}
