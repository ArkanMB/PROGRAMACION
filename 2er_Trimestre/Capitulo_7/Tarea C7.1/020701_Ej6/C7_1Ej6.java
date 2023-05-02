import java.util.Scanner;

/**
 * @file: C7_1Ej6.java
 * 
 * @info: Escribe un programa que lea 15 números por teclado y que los almacene
 *        en un array. Rota los elementos de ese array, es decir, el elemento de
 *        la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El
 *        número que se encuentra en la última posición debe pasar a la posición
 *        0. Finalmente, muestra el contenido del array.
 *
 * @author: José Ángel Moya Baena
 */

public class C7_1Ej6 {

  public static void main(String[] args) {

    // Creamos un objeto Scanner para leer la entrada del usuario
    Scanner s = new Scanner(System.in);

    // Luego un array de enteros de tamaño 15
    int[] numeros = new int[15];

    System.out.println("Introduce 15 números:");

    // Leemos 15 números por teclado y almacenarlos en el array
    for (int i = 0; i < 15; i++) {

      numeros[i] = s.nextInt();

    }

    // Almacenamos primero el último elemento del array en una variable temporal
    int t = numeros[14];

    // Aqui rotaremos los elementos del array
    for (int i = 14; i > 0; i--) { // Itera desde la posición 14 del array hasta la posición 1

      numeros[i] = numeros[i - 1]; // Mueve cada elemento una posición hacia la derecha

    }

    // Ahora que tenemos el ultimos número en t tendríamos que movierlo a la
    // posición 0
    numeros[0] = t;

    // Mostrar el contenido del array
    for (int i = 0; i < numeros.length; i++) {

      System.out.print(numeros[i] + " ");

    }
  }
}
