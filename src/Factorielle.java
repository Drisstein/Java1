import java.util.Scanner;

public class Factorielle {

    public static int fact(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("Calculatrice de Factorielle !");
        while (true) {
            int x;
            do {
                System.out.print("Veuillez saisir un nombre :");
                x = lire.nextInt();
            } while (x < 0);
            System.out.println("Le factorielle de " + x + " est : " + fact(x));
        }
    }
}