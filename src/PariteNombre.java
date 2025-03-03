import java.util.Scanner;

public class PariteNombre {
    public static void paritePositif(String[] args) {
        // Rechercher si le nombre est positif ou négatif
        while (true) {
            System.out.println("Nombre positif ou négatif ? ");
            Scanner lire = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            int n = lire.nextInt();
            if (n > 0) {
                System.out.println("Ce nombre est positif ! ");
            } else
                System.out.println("Ce nombre est négatif ! ");

            // Rechercher la parité de la fonction
            if (n % 2 == 0) {
                System.out.println("Ce nombre est pair ! ");
            } else {
                System.out.println("Ce nombre est impair ! ");
            }
        }

    }
}
