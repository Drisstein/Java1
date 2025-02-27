import java.util.Scanner;

public class TrieDecroissant {
    public static void saisiDecroissant() {
        int x;
        int y;

        System.out.println("Entrez un nombre : ");
        try (Scanner lire = new Scanner(System.in)) {
            x = lire.nextInt();
            y = x;

            while (true) {
                System.out.println("Entrez un autre nombre : ");
                x = lire.nextInt();
                if (x > y) {
                    System.out.println("Le nombre saisi est plus grand que le précédent !");
                    break;
                } else {
                    y = x;
                    System.out.println("Saisie Correcte,continuez !");
                }
            }
        }
        // Affichage
        System.out.println("Vous avez saisi : " + x + " et " + y);

    }

}
