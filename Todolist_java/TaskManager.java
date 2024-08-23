import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager implements TaskOperations {
               static ArrayList<Task> taskList = new ArrayList<>();
               static Scanner scanner = new Scanner(System.in);
               static TaskManager taskManager = new TaskManager();
               static int id = 1;
               // Corps des methodes de l'interface
               @Override
               public void addTask() {
                              System.out.println("Entrez votre tâche");
                              String title = scanner.nextLine();
                              Task task = new Task(id++, title);
                              taskList.add(task);
                              System.out.println("Vous venez d'ajouter la tâche : " + task.gettitle());
                              menu();
               }

               @Override
               public void displayTask() {
                              System.out.println("Listes des tâches");
                              for (Task task : taskList) {
                                            System.out.println("ID:"+ task.getId());
                                            System.out.println("TITRE:"+ task.gettitle());
                                            System.out.println("STATUS:"+ task.getStatus());
                              }
                              menu();
               }
              
              //Sauvegader dans un fichier
               public void Sauvegarder(){
                              String taskFil = "task.txt";
                              //Ecriture dans le fichier
                              try(BufferedWriter writer = new BufferedWriter(new FileWriter(taskFil))){
                                             writer.write(taskList.toString());
                              }
                              catch(IOException e){
                                             e.printStackTrace();
                              }
               }

               public static void menu() {
                              while (true) {

                                             System.out.println("---------**MENU**---------");
                                             System.out.println("Que voulez vous faire?");
                                             System.out.println("1-Enregistrer une tâche");
                                             System.out.println("2-Modifier une tâche");
                                             System.out.println("3-Afficher une tâche");
                                             System.out.println("4-Afficher toute les tâches");
                                             System.out.println("5-Supprimer une tâche");
                                             System.out.println("6-Quitter");
                                             System.out.println("Choisissez une option");

                                             int choix = scanner.nextInt();
                                             scanner.nextLine();
                                             switch (choix) {
                                                            case 1:
                                                                           taskManager.addTask();
                                                                           taskManager.Sauvegarder();
                                                                           break;
                                                            case 2:

                                                                           taskManager.displayTask();
                                                                           break;
                                                            default:
                                                                           System.out.println("Sortie du programme...");
                                                                           System.exit(0);
                                                                           break;
                                             }
                              }
               }

               public static void main(String[] args) {
                              menu();
               }
}
