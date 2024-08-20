public class Main
{
  public static void main (String[] args){
  int a= 2, b=10, c=50;
  if(a>b && a>c){
//retourner que a est plus grand
    System.out.println("a est le plus grand");
  }else if(b>c && b>a){
// b est le plus grand
    System.out.println(" b est le plus grand");
  }else{
    // c est le plus grand
    System.out.println("c est le plus grand");
  }

}
}