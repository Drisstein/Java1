import java.lang.Math;

class Point {
    private int x, y;

    // Constructeur
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Méthodes d'accès
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Méthodes de modification
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Déplacement du point
    public void deplacer(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Affichage des coordonnées du point
    public void afficher() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    // Conversion en chaîne de caractères
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Calcul de la distance entre deux points
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

public class CorrTabMinmax {
    public static void main(String[] args) {
        // Création de deux points
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        // Affichage des coordonnées
        System.out.println("Coordonnées initiales de p1 : " + p1);
        System.out.println("Coordonnées initiales de p2 : " + p2);

        // Calcul et affichage de la distance
        System.out.println("Distance entre p1 et p2 : " + p1.distance(p2));

        // Déplacement de p1
        p1.deplacer(2, -1);
        System.out.println("Nouvelle position de p1 après déplacement : " + p1);

        // Ajout d'un test supplémentaire
        Point p3 = new Point(0, 0);
        System.out.println("Coordonnées initiales de p3 : " + p3);
        System.out.println("Distance entre p1 et p3 : " + p1.distance(p3));
    }
}
