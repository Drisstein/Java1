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
        System.out.println("Veuillez saisir un nombre!");
        int x = lire.nextInt();
        System.out.println(fact(x));
    }
}
