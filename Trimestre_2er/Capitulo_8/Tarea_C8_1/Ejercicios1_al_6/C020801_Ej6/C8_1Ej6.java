import java.util.Scanner;
import Tarea_C8_1.libFunciones.FuncionesMatematicas;

/**
 * @file: C8_2Ej6
 * 
 * @info: Le da la vuelta a un número.
 * 
 * @author: José Ángel Moya Baena
 */

public class C8_1Ej6 {

  public static void main(String[] args) {

    // Creamos el objeto scanner para leer lo que introduzca el usuario
    Scanner s = new Scanner(System.in);

    // Creamos un array de enteros con longitud 3
    long[] array = new long[3];

    // Le pedimos al usuario que introduzca 3 números enteros
    System.out.print("Introduzca 3 números enteros separados por un 'Enter' ");

    array[0] = s.nextLong();
    array[1] = s.nextLong();
    array[2] = s.nextLong();

    // Usamos un bucle for each para imprimir los números introducidos y dados la
    // vuelta
    for (long i : array) {

      System.out.print("El número " + i + " dado la vuelta sería --> ");
      System.out.println(Tarea_C8_1.libFunciones.FuncionesMatematicas.voltea(i));

    }

  }

}