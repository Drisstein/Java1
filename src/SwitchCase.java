import java.util.Scanner;

public class SwitchCase {
    /**
     * @param args
     */
    public static void jourSemaine(String[] args) {
        Scanner lire = new Scanner(System.in);
        while (true) {
            // Programme 1: Jours de la semaine
            System.out.print("Veuillez saisir le jour : ");
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
                    System.out.println("Nous sommes Samedi!");
                    break;
                case 7:
                    System.out.println("Nous sommes Dimanche !");
                    break;
                default:
                    System.out.println("Veuillez saisir un nombre entre 1 et 7");
            }

            // Programme 2 : Calculatrice
            System.out.println("Veuillez saisir deux nombres : ");
            int a = lire.nextInt();
            int b = lire.nextInt();
            System.out.print("Nature de l'operation : ");
            char op = lire.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case '%':
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                case '/':
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;

                default:
                    System.out.println("Operation invalide ! Veuillez reessayer svp ! ");
                    break;
            }
        }

    }
}