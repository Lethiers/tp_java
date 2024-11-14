package GestionDeVehicule;


//définit les propriétés et méthodes de base
public abstract class Vehicule {

    protected double vitesseMax;

    public Vehicule(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    // en fonction de son moyen de déplacement (route, air, eau) à définir dans les classes filles
    public abstract void deplacer();

    public void afficherDetails() {
    	System.out.println("vous utiliser le véhicule suivant "+getClass().getSimpleName());
        System.out.println("Votre vitesse maximale est de " + vitesseMax + " km/h");
    }
}
