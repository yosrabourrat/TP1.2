import java.util.Scanner;
public class ex7 {
    // Fonction pour déterminer si un habitant est imposable
    public static boolean estImposable(int age, char sexe) {
        if (sexe == 'M') {
            return age > 20;
        } else if (sexe == 'F') {
            return age >= 18 && age <= 35;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez l'âge de l'habitant : ");
        int age = sc.nextInt();
        System.out.print("Entrez le sexe de l'habitant (F pour femme, M pour homme) : ");
        char sexe = sc.next().charAt(0);
        boolean imposable = estImposable(age, sexe);
        if (imposable) {
            System.out.println("Cet habitant est imposable.");
        } else {
            System.out.println("Cet habitant n'est pas imposable.");
        }
    }
}