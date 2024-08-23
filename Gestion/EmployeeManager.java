package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager implements EmployeeOperations {
               static ArrayList<Employee> employes = new ArrayList<>();
               static Scanner scanner = new Scanner(System.in);
               static Manager manager = new Manager();
               static Developer developer = new Developer();
               static EmployeeManager Employee = new EmployeeManager();
               int choix;
               long id = System.currentTimeMillis();

               // Menu

               public static void Menu() {
                              System.out.println("**********MENU*********");
                              System.out.println("Que voulez-vous faire ?");
                              System.out.println("1-Enregistrer un employé:");
                              System.out.println("2-Supprimer un employé:");
                              System.out.println("3-Modifier un employé:");
                              System.out.println("4-Afficher les information d'un employé:");
                              System.out.println("5-Afficher tous les employés:");
                              System.out.println("6-Quitter:");
                              System.out.println("Choisissez une option :");
                              int choix = scanner.nextInt();
                              long identifiant;
                              switch (choix) {
                                             case 1:
                                                            Employee.addEmployee();
                                                            break;
                                             case 2:
                                                            System.out.println("Entrez l'id de l'utilisateur à supprimer");
                                                            identifiant = scanner.nextLong();
                                                            Employee.deleteEmployee(employes,identifiant);
                                                            break;
                                             case 3:
                                                            // Employee.updateEmploye();
                                                            break;
                                             case 4:
                                             System.out.println("Entrez l'id de l'utilisateur que vous rechercher");
                                             identifiant = scanner.nextLong();
                                                            Employee.getEmployee(employes,identifiant);
                                                            break;
                                             case 5:
                                                            Employee.getAllEmployee(employes);
                                                            break;
                                             case 6:
                                                            System.out.println("Sortie du programme...");
                                                            System.exit(0);
                                             default:
                                                            System.out.println("Choix invalide.");

                              }
               }

               // Ajoute un employé a la liste

               public void addEmployee() {
                              System.out.println("********************Enregistrement d'employé**********************");
                              System.out.println("1:Developpeur");
                              System.out.println("2:Manager");
                              int choix = scanner.nextInt();

                              
                              if (choix == 1) {
                                             System.out.println("*****************Enregistrement d'un Développeur***********************");
                                             System.out.println("Specialité :");
                                             developer.setLangageSpecialite(scanner.nextLine());
                                             createEmployee(developer);
                                             employes.add(developer);
                                             System.out.println("Enregistrement effectué avec succès");

                              } else if (choix == 2) {
                                             System.out.println("*****************Enregistrement d'un manager***********************");
                                             System.out.println("Nombre d'employé à la charge");
                                             manager.setNbrePersonnes(scanner.nextInt());
                                             createEmployee(manager);
                                             employes.add(manager);
                                             System.out.println("Enregistrement effectué avec succès");

                              }
                              Menu();
               }

               // methode de creation d'employee
               public void createEmployee(Employee em) {
                              em.setId(id++);
                              scanner.nextLine();
                              System.out.println("Entrez le nom :");
                              em.setNom(scanner.nextLine());
                              System.out.println("Entrez le Salaire :");
                              em.setSalaire(scanner.nextDouble());

               }

               // Methode de suppression d'employé

               public void deleteEmployee(ArrayList<Employee> employes, long identifiant) {
                         for (Employee employee : employes) {
                              if (employee.getId()==identifiant) {
                                             employes.remove(employee);
                                             break;
                              }
                         }
                              System.out.println("Suppression reussie");
                              Menu();
               }

               // Methode d'affichage de tous les employés

               public void getAllEmployee(ArrayList<Employee> employes) {
                              for (Employee emp : employes) {
                                             // Affichage des details
                                             emp.getDetail();
                              }
                       
                              Menu();
               }

               public void getEmployee(ArrayList<Employee> employes , long identifiant) {
                              for (Employee emp : employes) {
                                             if (emp.getId() == identifiant) {
                                                         emp.getDetail();
                                             }
                              }
                              
                              Menu();
               }

               public static void main(String[] args) {
                              Menu();
               }

}
