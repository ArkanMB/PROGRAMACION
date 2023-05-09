import java.util.Scanner;

/**
 * @file: C7_1Ej3.java
 * 
 * @info: Escribe un programa que lea 10 números por teclado y que luego los
 *        muestre en orden inverso, es decir, el primero que se introduce es el
 *        último en mostrarse y viceversa.
 *
 * @author: José Ángel Moya Baena
 */

public class C7_1Ej3 {

  public static void main(String[] args) {

    // Creamos el objeto Scanner para leer los datos introducidos por el usuario
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce 10 números uno detras del otro (al escribirlo presiona enter): ");

    int[] num = new int[10];

    // Bucle que mete en el array 10 números introducidos por pantalla
    for (int i = 0; i < num.length; i++) {

      num[i] = s.nextInt();

      System.out.print(" ");

    }

    // Cerramos el Scanner
    s.close();

    System.out.println();

    System.out.println("Ahora invertiré las posiciones");

    System.out.println("");

    // Bucle que imprime por pantalla desde el último elemento del array hasta el
    // primero, con su correspondiente posición
    for (int j = 9; j > -1; j--) {

      System.out.println("Posición " + (j + 1) + ": " + num[j]);

    }

  }

}