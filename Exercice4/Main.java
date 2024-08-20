
//Conversion de types (Widening et Narrowing)
//windening
// public class Main {
//                public static void main (String[] args){
//                      int intvar = 2;
//                      double doubleVar = intvar;   
//                               System.out.println(intvar);
//                               System.out.println(doubleVar);
//                }
// }


//narrowing
public class Main {
               public static void main (String[] args){
                     double intvar = 2;
                     int doubleVar = (int) intvar;   
                              System.out.println(intvar);
                              System.out.println(doubleVar);
               }
}