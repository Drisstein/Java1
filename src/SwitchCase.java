import java.util.Scanner;

public class SwitchCase {

    public static void jourSemaine(String[] args) {

        Scanner lire = new Scanner(System.in);
        while (true) {
            System.out.println("Veuillez saisir le jour : ");
            int x = lire.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Nous sommes Lundi.");
                    break;
                case 2:
                    System.out.println("Nous sommes Mardi !");
                    break;
                case 3:
                    System.out.println("Nous sommes Mercredi!");
                    break;
                case 4:
                    System.out.println("Nous sommes Jeudi!");
                    break;
                case 5:
                    System.out.println("Nous sommes Vendredi!");
                    break;
                case 6:
                    System.out.println("Samedi!");
                    break;
                case 7:
                    System.out.println("Nous sommes Dimanche !");
                    break;
                default:
                    System.out.println("Veuillez saisir un nombre entre 1 et 7");
            }
        }

    }
}