import java.util.Scanner;
public class ex5 {

    // Fonction pour trouver le numéro du buteur
    public static int Buteur(int[] buts) {
        int buteur = 0;
        for (int i=1; i<buts.length; i++) {
            if (buts[i] > buts[buteur]) {
                buteur = i;
            }
        }
        return buteur;
    }
    // Fonction pour calculer le nombre total de buts inscrits par l'équipe
    public static int calButs(int[] buts) {
        int nbrButs = 0;
        for (int i=0; i<buts.length; i++) {
            nbrButs += buts[i];
        }
        return nbrButs;
    }
    // Fonction pour compter le nombre de joueurs qui n'ont pas marqué de buts
    public static int aucunButs(int[] buts) {
        int noButs = 0;
        for (int i=0; i<buts.length; i++) {
            if (buts[i] == 0) {
                noButs++;
            }
        }
        return noButs;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] buts = new int[22];
        // Entrer le nombre de buts inscrits par chaque joueur
        for (int i=0; i<22; i++) {
            System.out.print("Nombre de buts inscrits par le joueur " +(i+1)+ " : ");
            buts[i] = sc.nextInt();
        }
        int meilleurButeur = Buteur(buts);
        System.out.println("Le meilleur buteur de l'équipe est le joueur " +(meilleurButeur+1)+ ".");
        int totalButs = calButs(buts);
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " +totalButs);
        int PasDeButs = aucunButs(buts);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " +PasDeButs);
        buts[8] += 2;
        System.out.println("Les buts du joueur n°9 a été en mis à jour.");
    }
}