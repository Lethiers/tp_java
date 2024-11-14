package GestionDeVehicule;

public class Avion extends Vehicule implements TransportPassagers,TransportFret {
	
	// Capacité maximale de passagers
    private int maxPassager;  
    private int passager;  
    private int poids;
    private double poidsMax;

    public Avion(double vitesseMax, int capacitePassagers, double poidsMax) {
        super(vitesseMax);
        this.maxPassager = capacitePassagers;  
        this.poidsMax = poidsMax;
    }
    
    @Override
    public void deplacer() {
    	if(this.passager <= this.maxPassager) {
    		System.out.println(" vient de démarer et se déplace dans l'air avec "+this.passager+" passagers et "+this.poids+" kg de marchandises");
    	}
    	
    }; 
    
    @Override
    public void embarquerPassagers(int nombre) {
        if (this.passager + nombre <= this.maxPassager) {
            this.passager += nombre;
            System.out.println("vous avez actuellement " + this.passager+" passagers dans votre avion");
        } else {
            System.out.println("L'avion à une capacité maximum de "+this.maxPassager+" passagers, vous devez réesayer avec "+(this.maxPassager - (this.passager + nombre) )+" passagers pour démarer");
        }
    };
    
    @Override
    public void chargerFret(double poids) {
        if (this.poids + poids <= this.poidsMax) {
            this.poids += poids;
            System.out.println("Vous avez" + this.poids + " kg de marchandises");
        } else {
            System.out.println("Le poids du fret est supérieur à la capacité maximum de " + this.poidsMax + " kg");
        }
    }


}
