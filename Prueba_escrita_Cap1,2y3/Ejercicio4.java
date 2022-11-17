import java.util.Scanner;

/*
 * ejercicio4.java
 * 
 * El programa te pedirá tu nombre y tu edad y te las mostrá por pantalla
 * 
 * @Ángel
 */
public class Ejercicio4{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Escriba tu nombre y edad => ");

    String nombreString = s.next();
    int edadString = s.nextInt();

    System.out.println("Mi nombre es: " + nombreString + " y tengo " + edadString + " años.");        

  }

}