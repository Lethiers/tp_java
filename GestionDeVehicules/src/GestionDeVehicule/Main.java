package GestionDeVehicule;

public class Main {

    public static void main(String[] args) {
        Voiture voiture = new Voiture(130, 4);
        
        System.out.println();
        System.out.println("test voiture");
        voiture.afficherDetails();
        voiture.embarquerPassagers(2);
        voiture.embarquerPassagers(4);
        voiture.embarquerPassagers(2);
        voiture.deplacer();
        System.out.println();
        
        Avion avion = new Avion(500, 100,150);
        
        System.out.println("test avion");
        avion.afficherDetails();
        avion.embarquerPassagers(50);
        avion.embarquerPassagers(2);
        avion.chargerFret(30);
        avion.deplacer();
        System.out.println();
        
        Bateau bateau = new Bateau(500, 100,150);
        
        System.out.println("test avion");
        bateau.afficherDetails();
        bateau.embarquerPassagers(50);
        bateau.embarquerPassagers(500);
        bateau.chargerFret(200);
        bateau.deplacer();
        

    }
}