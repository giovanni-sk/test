// // Exo 1

// public class Main
// {
//   public static void main (String[] args){
//     int number = 3;
//     String result = (number % 2 ==0) ? "  est pair": " est impair";
//   System.out.println(number + result);
// }
// }


// Exo 2


// public class Main
// {
//   public static void main (String[] args){
//   int a= 2, b=10, c=50;
//   if(a>b && a>c){
// //retourner que a est plus grand
//     System.out.println("a est le plus grand");
//   }else if(b>c && b>a){
// // b est le plus grand
//     System.out.println(" b est le plus grand");
//   }else{
//     // c est le plus grand
//     System.out.println("c est le plus grand");
//   }

// }
// }


//Exo 3


// public class Main
// {
//   public static void main (String[] args){
//     int age = 100;
//     if(age >= 65){
// System.out.println("Sénior");
//     }else
//      if(20>=age && age >=64){
//   System.out.println("Adulte");
//     }else
//      if(13>= age && age >=19){
//   System.out.println("Adolescent");
//     }
//     else{
//       System.out.println("Enfant");
//     }
// }
// }

// Exo 4
public class Main {
  public static void main (String [] args){
    int note = 55;
    String resultat = (note>= 50)?"Reussi":"Echoué";
    System.out.println(resultat);
  }
}