
public class Methode {
               // Exo 1 calcule de la somme
               public static void sum(int a, int b) {
                              System.out.println(a + b);

               }

               // Exo 2 VERIFICATION DE PARITE
               public static boolean isEven(int number) {
                              boolean result = true;
                              if (number % 2 == 0) {

                                             System.out.println(true);
                              } else {

                                             System.out.println(false);
                              }
                              return result;
               }

               // Exo 3 Calcule de factoriel
               public static void factorial(int n) {

               }

               // Exo 4 Methode de Surchage

               public static void multiply(int a, int b) {
                              System.out.println(a * b);
               }

               public static void multiply(double a, double b) {
                              System.out.println(a * b);
               }
               // Exo 5 Methode de manipulation des chaines
               public static void reverseString(String str){
                              StringBuilder= new 
                              System.out.println();
               }

               public static void main(String[] args) {
                              sum(5, 7);
                              isEven(7);
                              multiply(3, 4);
                              multiply(3.5, 4.2);
                              reverseString("Hello");
               }

}
