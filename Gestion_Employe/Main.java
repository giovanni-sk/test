
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<Employe> donnee = new ArrayList<Employe>();
   static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      Employe employe = new Employe();
    
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
               employe.addEmploye();
               break;
            case 2:
               employe.deleteEmploye();
               break;
            case 3:
               employe.updateEmploye();
               break;
            case 4:
               employe.getEmploye(donnee);
               break;
            case 5:
               System.out.println("Sortie du programme...");
               System.exit(0);
            default:
               System.out.println("Choix invalide.");

         }
      }

   
   

}
