import java.util.Scanner;

public class ChercherMax {
    public static void maxMin() {
        try (Scanner lire = new Scanner(System.in)) {
            int x;
            int y;
            while (true) {
                System.out.println("Entrez un nombre : ");
                x = lire.nextInt();
                System.out.println("Entrez un autre nombre : ");
                y = lire.nextInt();

                if (x > y) {
                    System.out.println("Le plus grand est : " + x);
                    System.out.println("Le plus petit est : " + y);
                } else {
                    System.out.println("Le plus grand est : " + y);
                    System.out.println("Le plus petit est : " + x);
                }
            }
            // System.out.println("Voulez-vous continuer ? (O/N)");
            // String reponse = lire.next();
            // if (reponse.equals("N")) {
            // break;
            // }
        }
    }
}