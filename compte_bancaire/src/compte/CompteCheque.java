package compte;

public class CompteCheque extends CompteBancaire {
	
	//nous devons pouvoir retirer jusqu'a -200€ avec des frais supplémentaire de 15€ si le solde est inférieur à 0
	
	private static double limite = -200;
	private static double fraisRetrait = 15;
		
	public CompteCheque() {
		super();
	}
	
    @Override
    public void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("vous ne pouvez pas retirer une somme négatif");
            return;
        }

        // nous vérifions si le retrait est possible sans découvert
        if (this.solde - montant >= limite) {
            this.solde -= montant;
            System.out.println("vous venez de retirer "+montant+"€ il vous reste "+this.solde+"€");

            // nous appliquons des frais supplémentaires si le solde est inférieur à 0
            if (this.solde < 0) {
                this.solde -= fraisRetrait;
                System.out.println("vous avez des frais d'opéraiton supplémentaires " + fraisRetrait+"il vous reste " + this.solde + " €");
            }
        } else {
            System.out.println("vous ne pouvez pas retirer en dessous de "+ limite +"€");
        }
    }
}
