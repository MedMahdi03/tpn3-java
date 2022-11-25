
public class Compte {
    Personne personne;
    float solde;
    String numeroCompte;
    Compte(Personne personne, float solde, String numeroCompte){
        this.personne = personne;
        this.solde = solde;
        this.numeroCompte = numeroCompte;
    }
    void crediter(){}
    void debiter(){}

    String getSolde(int numcompte){
      return "le solde de cette compte est: "+ solde + " DT";

    }
    public String toString(){
        return " personne: " + personne.toString() + " solde: " + solde + " numéroCompte: " + numeroCompte+ "solde: " + solde;
    }

}
