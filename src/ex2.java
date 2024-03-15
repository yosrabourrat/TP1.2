import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez l'heure : ");
        int h = sc.nextInt();
        System.out.print("Entrez les minutes : ");
        int min = sc.nextInt();
        // Calcul de l'heure suivante
        min++;
        if (min == 60) { // Si les minutes dépassent 59, réinitialiser à 0 et ajouter une heure
            min = 0;
            h++;
            if (h == 24) { // Si l'heure dépasse 23, réinitialiser à 0 (00 heure)
                h = 0;
            }
        }
        System.out.println("Dans une minute, il sera " +h+ "h" +min+ ".");
    }
}