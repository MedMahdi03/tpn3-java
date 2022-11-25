public class TestCompte {
   public  static  void  main(String[] args){
       Adresse a1 = new Adresse(1,"a","b","c");
       Personne p1 = new Personne("aa","bb",a1);
       Compte compte1 = new Compte(p1,100000.000f,"1");
       Compte compte2 = new Compte(p1,140000.000f,"2");
       Compte compte3 = new Compte(p1,250000.000f,"2");
       System.out.println(compte1.toString());
       System.out.println(compte2.toString());
       System.out.println(compte3.toString());

       Banque b = new Banque();
       b.ouvrir(compte1);
       b.ouvrir(compte2);
       b.ouvrir(compte3);
       b.cloturer(compte2);
       System.out.println(compte1.getSolde(1));
       System.out.println(b.toString());

   }




}
