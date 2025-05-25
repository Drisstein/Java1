import java.util.Scanner;

public class SaisiTableauCorrection {

    // Méthode pour saisir un tableau
    public static int[] saisirTableau(int taille) {
        Scanner lire = new Scanner(System.in);
        int[] arr = new int[taille];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Entrez un entier : ");
            arr[i] = lire.nextInt();
        }
        return arr;
    }

    // Méthode pour calculer la moyenne
    public static double calculerMoyenne(int[] arr) {
        int somme = 0;
        for (int val : arr) {
            somme += val;
        }
        return (double) somme / arr.length;
    }


    // Méthode pour trouver la valeur maximale
    public static int trouverMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Méthode pour trouver la valeur minimale
    public static int trouverMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("- - TABLEAU OPE. DE BASE - -");
        int[] tableau = saisirTableau(5);

        System.out.println("Moyenne : " + calculerMoyenne(tableau));
        System.out.println("Valeur maximale : " + trouverMax(tableau));
        System.out.println("Valeur minimale : " + trouverMin(tableau));
    }
}