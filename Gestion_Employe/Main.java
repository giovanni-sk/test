

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
               public static void main(String[] args) {
                              Employe employe = new Employe();
                              System.out.println(employe);
                              ArrayList<Employe> donnee= new ArrayList<Employe>();
                              Scanner scanner = new Scanner(System.in);
                              // System.out.println("Entrer l'identifiant");
                              // int IdIn = scanner.nextInt();
                              System.out.println("Entrer le nom de l'employé");
                              String nomIn = scanner.nextLine();
                              System.out.println("Entrer le poste de l'employé");
                              String posteIn = scanner.nextLine();
                              System.out.println("Entrer le Salaire de l'employé");
                              int salaireIn = scanner.nextInt();

                              // employe.setId(IdIn);
                              employe.setNom(nomIn);
                              employe.setPoste(posteIn);
                              employe.setSalaire(salaireIn);
                              donnee.add(employe);
                            
                              System.out.println(donnee);
                              employe.getEmploye(donnee);
                              scanner.close();

               }
}
