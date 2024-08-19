//Pratique de la déclaration de différentes variables et comprendre leurs tailles en mémoire
public class Main {

    byte aByte = 0;
    short aShort = 0;
    int anInt = 0;
    long aLong = 0;
    float aFloat = 0;
    double aDouble = 0;
    char aChar = 'P';
    boolean aBoolean = true;
               public static void main (String[] args){
//déclaration de variable de type primitif
System.out.println("byte par défaut : " + Byte.BYTES+"octets" ); // 0
        System.out.println("short par défaut : " + Short.BYTES+"octets"); // 0
        System.out.println("int par défaut : " + Integer.BYTES + " octets"); // 0
        System.out.println("long par défaut : " + Long.BYTES+ "octets"); 
        System.out.println("float par défaut : " + Float.BYTES+"octets"); // 0.0f
        System.out.println("double par défaut : " + Double.BYTES +"octets"); // 0.0d
        System.out.println("char par défaut : " + Character.BYTES+ "octets"); // '\u0000' (caractère nul)
//         System.out.println("boolean par défaut : " + Boolean); // false

               }
}

// byte mybyte = 12;
// short myshort = ;
// int myint = 1; 
// long mylong = 125455554884455;
// float myfloat = 12.45f; 
// double mydouble = 9.2d;
// char mychar = "A";
// boolean myboolean = 12==15 ;
// System.out.println(mybyte);
// System.out.println(myshort);
// System.out.println()
// System.out.println()
// System.out.println()
// System.out.println()
// System.out.println()
// System.out.println()