
/**
 * @file: C14_2_Ej1.java
 * 
 * @info: Realiza un programa que pida 6 números por teclado y nos diga cuál es
 *        el máximo. Si el usuario introduce un dato erróneo (algo que no sea un
 *        número entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * @author: Jose Angel Moya Baena
 */

import java.util.Scanner;

public class C14_2_Ej1 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Inicializamos la variable "max"
    int max = Integer.MIN_VALUE;
    int num;

    // Iniciamos un bucle que se repetirá 6 veces para pedir 6 números
    for (int i = 0; i < 6; i++) {

      // Inicializamos la variable 'correcto' a false para indicar que el número
      // introducido es incorrecto
      boolean correcto = false;

      // Iniciamos un bucle do-while para pedir un número válido
      do {

        // Intentamos realizar esta sección de código
        try {

          // Pedimos al usuario que introduzca un número
          System.out.print("Introduce un número: ");

          // Leemos el número introducido y lo guardamos en la variable 'num'
          num = Integer.parseInt(s.nextLine());

          // Si el número introducido es mayor que el número máximo actual
          if (num > max) {

            // Actualizamos el valor de la variable 'max'
            max = num;
          }

          // Indicamos que el número introducido es correcto

          correcto = true;

          // Si se produce una excepción de tipo NumberFormatException
        } catch (NumberFormatException e) {

          // Mostramos un mensaje de error
          System.out.println("Error: No has introducido un número entero.");
        }

        // El bucle se repetirá mientras el número introducido no sea correcto
      } while (!correcto);
    }

    // Mostramos el número máximo
    System.out.println("El número máximo de los que has dado es " + max);

    // Cerramos el objeto Scanner para evitar problemas de recursos
    s.close();
  }
}
