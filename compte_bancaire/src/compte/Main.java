package compte;

public class Main {
    public static void main(String[] args) {
        // création d'un compte epargne
        System.out.println("compte epargne");
        CompteEpargne compteEpargne = new CompteEpargne();
        

        compteEpargne.deposer(2000);
        compteEpargne.retirer(500); 
        compteEpargne.retirer(1500); 
        compteEpargne.retirer(1000); 


        // création d'un compte cheque
        System.out.println("compte cheque");
        CompteCheque compteCheque = new CompteCheque();

        //compte cheque
        compteCheque.deposer(100);
        compteCheque.retirer(50);
        compteCheque.retirer(200);  
        compteCheque.retirer(100);    
    }
}