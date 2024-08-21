package POO;

public class Main {
               public static void main (String[] args){
                              Voiture maVoiture = new Voiture("Rouge","Toyota");
                             maVoiture.setNom("Mercedes");
                              System.out.println(maVoiture.getNom());
                              maVoiture.accelerer();
                              maVoiture.ralentir();
                              maVoiture.freiner();
                              maVoiture.tourner();
                              Main mymain = new Main();
                              nettoyage();
                              mymain.nettoyagepublic();
               }
               static void nettoyage(){
                              System.out.println("Static methode");
               }
               public void nettoyagepublic(){
                              System.out.println("Public methode");
               }
}
