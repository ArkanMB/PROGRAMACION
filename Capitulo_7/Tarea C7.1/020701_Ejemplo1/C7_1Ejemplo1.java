/**
 * @file: C7_1Ejemplo1.java
 * 
 * @info: Ejemplo 1 de Arrays en el punto 7.1
 *
 * @author: José Ángel Moya Baena
 */

public class C7_1Ejemplo1 {
  public static void main(String[] args) {

    int[] n; // se define n como un array de enteros

    n = new int[4]; // se reserva espacio para 4 enteros

    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;

    System.out.println();

    System.out.print("Los valores del array n son los siguientes: ");

    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

    int suma = n[0] + n[3];

    System.out.println();

    System.out.println("\nEl primer elemento del array más el último suman " + suma);

    System.out.println();
  }
}