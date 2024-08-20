public class MyArray {
              public static  void main( String[] args){
            
              String [] fruits  =  new String[5];
              fruits[0] = "Ananas";
              fruits[1] = "Pomme";
              fruits[2] = "Banane";
              fruits[3] = "Orange";
              fruits[4] = "Papaye";
              byte[] mybytenumber = {1,5,4};
               System.out.println(mybytenumber[0]);
               mybytenumber[1]=124;
               System.out.println(mybytenumber[1]);
               for (int i = 0; i<fruits.length; i++) {
                   System.out.println("L'élément a l'index  "+  i  +"  " +"est " + fruits[i]);
               }

              }
}

