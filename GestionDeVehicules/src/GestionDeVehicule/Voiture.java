package GestionDeVehicule;

public class Voiture extends Vehicule implements TransportPassagers {
	
	// Capacité maximale de passagers
    private int maxPassager;  
    private int passager;  

    public Voiture(double vitesseMax, int capacitePassagers) {
        super(vitesseMax);
        this.maxPassager = capacitePassagers;        
    }
    
    @Override
    public void deplacer() {
    	if(this.passager <= this.maxPassager) {
    		System.out.println("La voiture vient de démarer et se déplace sur la route avec "+this.passager+" passagers");
    	}
    	
    }; 
    
    @Override
    public void embarquerPassagers(int nombre) {
        if (this.passager + nombre <= this.maxPassager) {
            this.passager += nombre;
            System.out.println("vous avez actuellement " + this.passager+" passagers dans votre voiture");
        } else {
            System.out.println("La voiture à une capacité maximum de "+this.maxPassager+" passagers, vous devez réesayer avec "+(this.maxPassager - (this.passager + nombre) )+" passagers pour démarer");
        }
    };

}
