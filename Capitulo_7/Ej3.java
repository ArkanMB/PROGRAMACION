import java.util.Scanner;

/*
 * Ej3.java
 * 
 * Programa que lee 10 números y los muestra en orden inverso
 * 
 * @AngelMB
 */

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int tamanio = 10;
    
    int[] num = new int [tamanio];

    for (int i = 0; i < tamanio; i++) {
      System.out.print("Introduzca el número " + i + ": ");
      num[i] = s.nextInt();
    }

    for (int i = (tamanio - 1); i >= 0; i--) {
      System.out.println("Número " + i + " = " + num[i]);
    }

  }
}
