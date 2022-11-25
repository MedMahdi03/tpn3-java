public class Personne {
    String nom;
    String prenom;
    Adresse adresse;

    Personne(String nom, String prenom, Adresse adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public String toString(){
        return " nom: " + nom + " prénom: " + prenom + " adresse: " + adresse.toString();
    }

}
