import java.util.ArrayList;
import java.util.Scanner;

public class Employe {
              long id;
              String nom;
              String poste;
              double salaire;
              static  ArrayList<Employe> donnee= new ArrayList<Employe>();
              static Scanner scanner = new Scanner(System.in);

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
  


              public static void getEmploye(ArrayList<Employe> donnee) {
                              for (Employe employe : donnee) {
                                             System.out.println("Id: " + " " + employe.getId());
                                             System.out.println("Nom: " + " " + employe.getNom());
                                             System.out.println("Poste: " + " " + employe.getPoste());
                                             System.out.println("Salaire: " + " " + employe.getSalaire());
                              }  

                              //Menu 
                              menu();         
               }

              public static void addEmploye(){
                            System.out.println("Combien d'utilisateur voulez vous enregistrer ?");
                            int n = scanner.nextInt();
                            for (int i = 0; i <n; i++) {
                                        long newId = System.currentTimeMillis();
                                             System.out.println(newId);
                                            
                                           scanner.nextLine();
                                           System.out.println("Entrez le nom de l'employé");
                                           String nomIn = scanner.nextLine();
                                           System.out.println("Entrez le poste de l'employé");
                                           String posteIn = scanner.nextLine();
                                           System.out.println("Entrez le Salaire de l'employé");
                                           double salaireIn = scanner.nextDouble();
                              //Recuperation des données
                              Employe employe = new Employe();
                              employe.setId(newId);
                              employe.setNom(nomIn);
                              employe.setPoste(posteIn);
                              employe.setSalaire(salaireIn);
                              donnee.add(employe);
                              System.out.println("Employé enregistré avec succès.");
                            }
                            menu();
                            
                              
               }

               // Menu
              public  static void menu(){
                              System.out.println("MENU:");
                            System.out.println("1-Enregistrer un employé:");
                            System.out.println("2-Supprimer un employé:");
                            System.out.println("3-Modifier un employé:");
                            System.out.println("4-Afficher tous les employés:");
                            System.out.println("5-Quitter:");
                            System.out.println("Choisissez une option :");
                            int choix = scanner.nextInt();

                            switch (choix) {
                               case 1:
                                  addEmploye();
                                  break;
                               case 2:
                                  deleteEmploye();
                                  break;
                               case 3:
                                             updateEmploye();
                                  break;
                               case 4:
                                  getEmploye(donnee);
                                  break;
                               case 5:
                                  System.out.println("Sortie du programme...");
                                  System.exit(0);
                               default:
                                  System.out.println("Choix invalide.");
                   
                            }       
                            
                            }
                            

             public  static void deleteEmploye(){
               System.out.println("Quel Utilisateur voulez vous supprimer?(L'id)");

               long Id = scanner.nextLong();
                              donnee.removeIf(el->el.id ==Id);
                              menu();
             }


              public  static void updateEmploye(){}
              

}
