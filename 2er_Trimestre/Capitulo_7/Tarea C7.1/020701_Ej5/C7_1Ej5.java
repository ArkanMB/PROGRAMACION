import java.util.Scanner;

/**
 * @file: C7_1Ej5.java
 * 
 * @info: Escribe un programa que pida 10 números por teclado y que luego
 *        muestre los números introducidos junto con las palabras “máximo” y
 *        “mínimo” al lado del máximo y del mínimo respectivamente.
 *
 * @author: José Ángel Moya Baena
 */

public class C7_1Ej5 {

  public static void main(String[] args) {

    // Creamos un objeto Scanner para leer la entrada del usuario
    Scanner s = new Scanner(System.in);

    // Y creamos también un array de tamaño 10 para almacenar los números
    int[] numeros = new int[10];

    // Le pedimos al usuario que meta 10 números y lo almacenamos en el array
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Ingrese un número: ");
      numeros[i] = s.nextInt();
    }

    // Declaramos el valor máximo, mínimo y posición en el array
    int max = numeros[0];
    int min = numeros[0];
    int posicionMax = 0;
    int posicionMin = 0;

    // Encontramos mediante este bucle esos valores, el mímimo, máximo y su posición
    for (int i = 1; i < numeros.length; i++) {

      if (numeros[i] > max) {

        max = numeros[i];

        posicionMax = i;

      }
      if (numeros[i] < min) {

        min = numeros[i];

        posicionMin = i;

      }

    }

    // Mostramos los números con las palabras "máximo" y "mínimo" al lado
    System.out.println("\nNúmeros");
    for (int i = 0; i < numeros.length; i++) {

      if (i == posicionMax) {

        System.out.println(numeros[i] + " <-- Máximo");

      } else if (i == posicionMin) {

        System.out.println(numeros[i] + " <--Mínimo");

      } else {

        System.out.println(numeros[i]);

      }

    }

    // Salto de línea
    System.out.println();

  }

}
