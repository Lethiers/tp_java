package FormesGeometrique;

public abstract class Forme {
	
	// on va utiliser 
	public abstract double calculerAire();
	
	public abstract double calculerPerimetre();
	
	public void afficherDetails(){
		System.out.println("Type de forme: " + getClass().getSimpleName());
        System.out.println("Aire: " + calculerAire());
        System.out.println("Périmètre: " + calculerPerimetre());
	};

}
