package Gestion;


 abstract class Employee {
               protected long id ;
               protected String nom ;
               protected String poste ;
               protected double salaire ;
               

                // getters
                public long getId() {
                              return id;
               }

               public String getNom() {
                              return nom;
               }

               public String getPoste() {
                              return poste;
               }

               public double getSalaire() {
                              return salaire;
               }

               // setters
               public void setId(long newId) {
                              this.id = newId;
               }

               public void setNom(String nom) {
                              this.nom = nom;
               }

               public void setPoste(String poste) {
                              this.poste = poste;
               }

               public void setSalaire(double salaire) {
                              this.salaire = salaire;
               }
  


               public abstract void detail();
}
