package compte;

public class CompteBancaire {
	public double solde;
	// je viens de créer le solde à zéro lors de l'ouverture du compte
	public CompteBancaire() {
		this.solde = 0;
	}
	// je souhaite déposer de l'argent si le nombre est plus grand que zéro
	public void deposer(double ajouter) {
		
		if(ajouter > 0) {
			this.solde += ajouter;
			System.out.println("vous venez de déposer "+ajouter+"€ vous avez maintenant "+this.solde+"€");
		}else {
			System.out.println("vous ne pouvez pas déposer une somme négatif");
		}
	}
	
	// je souhaite pouvoir retirer si le solde du compte est plus grand que zero
	public void retirer(double retirer) {
		
		if(this.solde-retirer >= 0 && retirer >0) {
			this.solde -= retirer; 
			System.out.println("vous venez de retirer "+retirer+"€ il vous reste "+this.solde+"€");
		}else {
			System.out.println("solde insuffisant pour retirer");
		}	
	}
}
