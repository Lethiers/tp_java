package FormesGeometrique;

public class Cercle extends Forme {
    
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return 3.14 * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * 13.14 * rayon;
    }
}
