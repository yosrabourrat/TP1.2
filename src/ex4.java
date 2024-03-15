import java.util.Scanner;
public class ex4 {
    public static int sommeDiviseurs(int nbr) {
        int somme = 0;
        for (int i = 2; i <= nbr / 2; i++) {
            if (nbr % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int n = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int m = sc.nextInt();
        // Voir si les deux entiers sont des amis ou pas
        int sommeN = sommeDiviseurs(n);
        int sommeM = sommeDiviseurs(m);
        if (sommeN==m && sommeM==n) {
            System.out.println(n+ " et " +m+ " sont des nombres amis.");
        } else {
            System.out.println(n+ " et " +m+ " ne sont pas des nombres amis.");
        }
    }
}
