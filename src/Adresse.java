public class Adresse {
    int numero;
    String rue;
    String ville;
    String pays;

    Adresse(int numero, String rue, String ville, String pays){
        this.numero = numero;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }

    public String toString(){
        return "numéro: " + numero + " rue: " + rue + " ville: " + ville + " pays: " + pays;
    }
}
