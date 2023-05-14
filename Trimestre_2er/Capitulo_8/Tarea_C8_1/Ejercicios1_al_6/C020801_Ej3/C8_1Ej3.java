import java.util.Scanner;
import Tarea_C8_1.libFunciones.FuncionesMatematicas;

/**
 * @file: C8_2Ej3
 * 
 * @info: Devuelve el menor primo que es mayor al número que se pasa como
 *        parámetro.
 * 
 * @author: José Ángel Moya Baena
 */

public class C8_1Ej3 {
  public static void main(String[] args) {

    // Creamos el objeto scanner para leer lo que introduzca el usuario
    Scanner s = new Scanner(System.in);

    // Creamos un array de enteros con longitud 3
    int[] array = new int[3];

    // Le pedimos al usuario que introduzca 3 números enteros
    System.out.print("Introduzca 3 números enteros separados por un 'Enter' ");

    array[0] = s.nextInt();
    array[1] = s.nextInt();
    array[2] = s.nextInt();

    // Recorremos el array con un bucle foreach y calculamos el siguiente primo
    // mayor para cada elemento
    for (int i : array) {

      System.out.print("El siguiente primo mayor que " + i);

      // Llamamos al método siguientePrimo de la biblioteca FuncionesMatematicas y
      // imprimimos el resultado el resultado
      System.out.println(" es " + Tarea_C8_1.libFunciones.FuncionesMatematicas.siguientePrimo(i));

    }

  }

}