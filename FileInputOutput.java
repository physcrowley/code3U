import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class FileInputOutput {
    //
    // Variables globales
    //
    static String name;
    static double height, weight, BMI; // en m, en kg, en kg/m²

    //
    // Logique principale
    //
    public static void main(String[] args) throws Exception { // à cause des fichiers

        scanFile("./data/input1.txt");
        calculateBmi();

        String output = name + " a un BMI de " + BMI;
        showBmi(output);
        saveBmiToFile(output, "./data/output1.txt");
    }

    //
    // Implémentation des procédures et méthodes
    //

    /** Lit le fichier pour obtenir les valeurs */
    public static void scanFile(String source) throws Exception { // à cause des fichiers
        Scanner fileReader = new Scanner(new File(source));
        fileReader.useLocale(Locale.CANADA); // sachant que la source utilise des . (format anglais)

        // le format du fichier est Nom(un mot) hauteur(double) masse(double)
        name = fileReader.next();
        height = fileReader.nextDouble(); // présumé en mètres
        weight = fileReader.nextDouble(); // présumé en kg

        fileReader.close(); // libère le fichier après les entrées
    }

    /** Utilise les variables globales pour calculer le BMI */
    public static void calculateBmi() {
        BMI =  weight / (height * height);
    }

    /** Affiche simplement le résultat à la console */
    public static void showBmi(String text) {
        System.out.println(text);
    }

    /** Enregistre le résultat dans le fichier choisi */
    public static void saveBmiToFile(String text, String outputFile) throws Exception { // à cause des fichiers
        FileWriter fWriter = new FileWriter(outputFile);
        fWriter.write(text);
        fWriter.close();
    }

}
