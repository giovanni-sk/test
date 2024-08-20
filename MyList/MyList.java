 
import java.util.Arrays;
import java.util.Scanner;

public class MyList {
               // Exo1
               // public static void main (String[] args){
               //           int [] number = {5, 2, 9, 1, 5, 6};
               //           Arrays.sort(number);
               //           for(int i : number){
               //                          System.out.println(i);
               //           }
               // }


               // Exo2

               // public static void main(String[] args) {
               //                int[] numbers = {1,2,3,4,5,6};
               //                for(int i = 0; i<numbers.length;i++){
               //                               if (numbers[i]%2==0) {      
               //                                              System.out.println(numbers[i]);
               //                               }
               //                }
               // }

               // Exo3
//               public static void main (String[] args){
//                          int [] number = {5, 2, 9, 1, 5, 6};
//                          Arrays.sort(number);
//                          for(int i=0 ; i<number.length;i++){
//                                         System.out.println(i);
//                          }
//                          System.out.println("le minimum"+ number[0]+ "et le maximum"+ number[number.length-1]);
//                }

// Exo4

public static void main(String[] args) {
               int [] number = {5, 2, 9, 1, 5, 6};
                                        Arrays.sort(number);
                                        Scanner scanner= new Scanner(System.in);
                                        System.out.println("Entrez la valeur dont vous rechercher l'index");
                                        int index = scanner.nextInt();
                                        System.out.println("Le nombre"+ index + " entrer se trouve a l'index" + Arrays.binarySearch(number,index));
                              scanner.close();
                              }
}
