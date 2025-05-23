/*
 * Exercice
 * Ecrire un programme qui simule la table de multiplication d’un entier saisi
 * par l’utilisateur.
 * Exemple d’exécution :
 * Veuillez saisir un entier : 5
 * Table de multiplication de 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 5 = 25
 * 5 x 7 = 35
 * 5 x 9 = 45
 * 5 x 4 =
 * 5 x 6 = 30
 * 5 x 8 = 40
 * 5 x 10 = 5
 */

import java.util.Scanner;

public static void main(String[] args) {
    System.out.println("- - - TABLE DE MULTIPLICATION - - -");
    int x;
    try (Scanner lire = new Scanner(System.in)) {
        while (true) {
            System.out.print("Entrer le numéro de table :");
            x = lire.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(x + " * " + i + " = " + (x * i));
            }
        }
    }
}
