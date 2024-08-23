package Gestion;

import java.util.ArrayList;

public interface EmployeeOperations {

               // Methode pour ajouter un employé
               void createEmployee(Employee em);

               // Methode pour modifier un employé
               void updateEmployee(ArrayList<Employee> employes, long identifiant);

               // Methode pour supprimer un employé
               void deleteEmployee(ArrayList<Employee> employes, long identifiant);

               // Methode pour recuperer un employé
               void getEmployee(ArrayList<Employee> employes, long identifiant);

               // Methode pour recuperer tout les employé
               void getAllEmployee(ArrayList<Employee> employes);

}
