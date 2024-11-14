package compte;

public class CompteEpargne extends CompteBancaire {
	
	//je vais créer une limite pour évtier que le solde soit sous les 50€ et 10€ de frais par retrait
	
	private static double limite = 50;
		
	public CompteEpargne() {
		super();
	}
	
    @Override
    public void retirer(double montant) {
        if (this.solde-montant <= limite) {
            System.out.println("Retrait impossible vous ne devez garder 50€ sur votre compte d'épargne");
        } else if (montant > 0 && this.solde-montant >= limite) {
            this.solde -= montant;
            System.out.println("Montant retiré du compte épargne : " + montant + " €. Solde actuel : " + this.solde + " €");
        } else {
            System.out.println("Retrait impossible");
        }
    }
	

}
