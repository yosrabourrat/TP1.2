import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = sc.nextInt();
        int sommeDiv = 0;
        // Recherche des diviseurs et calcul de leur somme
        for (int i=1; i<=n/2 ; i++) {
            if (n % i == 0) {
                sommeDiv += i;
            }
        }
        // Vérification si n est parfait ou non
        if (sommeDiv==n && n!=1) {
            System.out.println(n+ " est un nombre parfait.");
        } else {
            System.out.println(n+ " n'est pas un nombre parfait.");
        }
    }
}