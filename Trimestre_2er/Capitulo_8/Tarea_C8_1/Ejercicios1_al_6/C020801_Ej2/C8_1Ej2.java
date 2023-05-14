import java.util.Scanner;
import Tarea_C8_1.libFunciones.FuncionesMatematicas;

/**
 * @file: C8_2Ej2
 * 
 * @info: Devuelve verdadero si el número que se pasa como parámetro es primo y
 *        falso en caso contrario.
 *        Creamos la clase C8_1Ej2 que contiene un método para verificar si un número
 *        es primo o no. Y un main comprobando si funciona.
 * 
 * @author: José Ángel Moya Baena
 */

/**
 * Creamos la clase C8_1Ej2 que contiene un método para verificar si un número
 * es primo o no. Y un main comprobando si funciona.
 */
public class C8_1Ej2 {

  public static void main(String[] args) {

    // Creamos un objeto Scanner para leer la entrada del usuario desde la consola.
    Scanner s = new Scanner(System.in);

    // Pedimos al usuario que introduzca tres números separados por un espacio
    System.out.print("Te voy a pedir que introduzcas 3 números con un espacio entre ellos: ");

    // Creamos un array de enteros de tamaño 3 para almacenar los números
    // introducidos
    int[] array = new int[3];

    // Leemos los tres números introducidos por el usuario y los almacenamos en el
    // array
    array[0] = s.nextInt();
    array[1] = s.nextInt();
    array[2] = s.nextInt();

    // Informamos al usuario que vamos a comprobar si los números introducidos son
    // primos
    System.out.print("Vamos a comprobar si los números que has metidos son primos, ");
    System.out.println("te diré true si es primo y false si no: ");

    // Comprobamos con un foreach si cada número es primo o no usando el método
    // esPrimo
    for (int i : array) {
      System.out.println(i + " --> " + Tarea_C8_1.libFunciones.FuncionesMatematicas.esPrimo(i));
    }
  }

}