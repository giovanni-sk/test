
public class Voiture {
               private String nom = "audi";
               int modele = 2019;
               int prix = 99580;
               String couleur = "Rouge";

               // getters
               public String getNom() {
                              return this.nom;
               }

               // setters
               public void setNom(String nom) {
                              this.nom = nom;
               }

               public Voiture(String couleur , String nom) {
                              this.couleur = couleur;
                              this.nom = nom;
                              System.out.println("Couleur" + couleur);
               }

               public void accelerer() {
                              System.out.println("J'accélère");
               }

               public void ralentir() {
                              System.out.println("Je ralenti");
               }

               public void tourner() {
                              System.out.println("Je tourne");
               }

               public void freiner() {
                              System.out.println("Je freine");
               }

}
