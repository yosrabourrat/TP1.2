import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre poids en kg : ");
        double poids = sc.nextDouble();
        System.out.print("Entrez votre taille en m : ");
        double taille = sc.nextDouble();
        System.out.print("Entrez votre sexe (F pour femme, M pour homme) : ");
        char sexe = sc.next().charAt(0);
        double imc = IMC(poids, taille);
        System.out.println("Votre IMC est : " +imc);
        String etatPoids = EtatPoids(imc, sexe);
        System.out.println("Votre état de poids est : " +etatPoids);
    }

    // Fonction pour calculer l'IMC
    public static double IMC(double poids, double taille) {
        return poids / (taille*taille);
    }

    // Fonction pour déterminer l'état de poids
    public static String EtatPoids(double imc, char sexe) {
        if (sexe == 'F') {
            if (imc < 19) {
                return "Maigreur";
            } else if (imc >= 19 && imc <= 24) {
                return "Poids normal";
            } else if (imc >= 24 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        } else {
            if (imc < 20) {
                return "Maigreur";
            } else if (imc >= 20 && imc <= 25) {
                return "Poids normal";
            } else if (imc >= 25 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        }
    }
}
