public class Main {
  public static void main (String [] args){
    int note = 101;
    String resultat =(note<100)?(note>= 50)?"Reussi":"Echoué":"Note invalide";
    System.out.println(resultat);
  }
}