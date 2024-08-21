import java.util.ArrayList;

public class Employe {
               private int id;
               private String nom;
               private String poste;
               private int salaire;

               // getters
               public int getId() {
                              return id;
               }

               public String getNom() {
                              return nom;
               }

               public String getPoste() {
                              return poste;
               }

               public int getSalaire() {
                              return salaire;
               }

               // setters
               public void setId(int newId) {
                              this.id = newId;
               }

               public void setNom(String nom) {
                              this.nom = nom;
               }

               public void setPoste(String poste) {
                              this.poste = poste;
               }

               public void setSalaire(int salaire) {
                              this.salaire = salaire;
               }
               // le constructeur

               public void getEmploye(ArrayList<Employe> donnee) {
                              for (Employe employe : donnee) {
                                             // System.out.println("Id: " + " " + employe.getId());
                                             System.out.println("Nom: " + " " + employe.getNom());
                                             System.out.println("Poste: " + " " + employe.getPoste());
                                             System.out.println("Salaire: " + " " + employe.getSalaire());
                              }
               }

}
