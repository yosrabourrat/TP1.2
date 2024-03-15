import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int nbr = sc.nextInt();
        while(nbr <= 0){
            System.out.print("Veuillez entrez un entier positif : ");
            nbr = sc.nextInt();
        }
        System.out.print("Les diviseurs de " +nbr+ " sont : ");
        int nbrDiv = 0;
        int sommeDiv = 0;
        for (int i=1; i<=nbr; i++) {
            if (nbr % i == 0) {
                System.out.print(i + " ");
                nbrDiv++;
                sommeDiv += i;
            }
        }
        System.out.println("\nLe nombre de diviseurs de " +nbr+ " est : " +nbrDiv);
        System.out.println("La somme des diviseurs de " +nbr+ " est : " +sommeDiv);
    }
}