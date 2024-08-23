package Gestion;

public class Manager extends Employee {
               int nbrePersonnes;
               public Manager(){
                              this.poste = "Manager";
               }

               public int getNbrePersonnes() {
                              return this.nbrePersonnes;
               }

               public void setNbrePersonnes(int nbrePersonnes) {
                              this.nbrePersonnes = nbrePersonnes;
               }

             
              //Affichage des details
              public void getDetail() {
               System.out.println("Id: " + this.getId());
               System.out.println("Nom: " + this.getNom());
               System.out.println("Poste: " + this.getPoste());
               System.out.println("Nombre de personne à la charge: " + this.getNbrePersonnes());
               System.out.println("Salaire: " + this.getSalaire());
}
}
