package FormesGeometrique;

public class Main {
    public static void main(String[] args) {
        Forme cercle = new Cercle(5); 
        Forme rectangle = new Rectangle(5,10); 
        Forme triangle = new Triangle(5,10,2,2,2);
        
        cercle.afficherDetails();
        rectangle.afficherDetails();
        triangle.afficherDetails();
    }
}