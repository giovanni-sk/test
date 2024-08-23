package Gestion;

public class Developer extends Employee {
                String langageSpecialite;

               public Developer(){
                              this.poste = "Developpeur";
               }
               public String getLangageSpecialite() {
                              return this.langageSpecialite;
               }

               public void setLangageSpecialite(String langageSpecialite) {
                              this.langageSpecialite = langageSpecialite;
               }

               //Affichage des details
               public void getDetail() {
                              System.out.println("Id: " + this.getId());
                              System.out.println("Nom: " + this.getNom());
                              System.out.println("Poste: " + this.getPoste());
                              System.out.println("Specialite: " + this.getLangageSpecialite());
                              System.out.println("Salaire: " + this.getSalaire());
               }
}
