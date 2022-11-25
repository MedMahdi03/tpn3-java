public class Banque {
    Compte[] comptes = new Compte[3];
    Compte[] lesComptes = new Compte[comptes.length-1];
    int i = 0;


    public void ouvrir(Compte compte){

        comptes[i] = compte;
        i++;



    }
    public void cloturer(Compte unCompte){

        Compte element = unCompte;
        for (int i = 0, j = 0; i < comptes.length;i++){
            if(comptes[i] != element){
                lesComptes[j] = comptes[i];
                j++;
            }
        }
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < lesComptes.length; i++){
            s += lesComptes[i].toString() + "\n";
        }
        return s;
    }
    public int getNbComptes(){return 0;}
}
