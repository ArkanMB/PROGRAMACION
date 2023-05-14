import java.util.Scanner;
import Tarea_C8_1.libFunciones.FuncionesMatematicas;

/**
 * @file: C8_2Ej4
 * 
 * @info: Dada una base y un exponente devuelve la potencia.
 * 
 * @author: José Ángel Moya Baena
 */

public class C8_1Ej4 {

  public static void main(String[] args) {

    // Creamos el objeto scanner para leer lo que introduzca el usuario
    Scanner s = new Scanner(System.in);

    // Creamos un array bidimensional de enteros con longitud 3 y 2
    int[][] array = new int[3][2];

    // Le pedimos al usuario que introduzca 3 números enteros
    System.out.print("Introduzca 3 bases y 3 exponentes de forma intercalada separados por un 'Enter' ");

    array[0][0] = s.nextInt();
    array[0][1] = s.nextInt();
    array[1][0] = s.nextInt();
    array[1][1] = s.nextInt();
    array[2][0] = s.nextInt();
    array[2][1] = s.nextInt();

    // Creamos una nueva matriz para almacenar los resultados de las potencias
    int[][] resultados = new int[3][1];

    // Calculamos las potencias de cada número introducido y las almacenamos los
    // resultados
    for (int i = 0; i < array.length; i++) {
      resultados[i][0] = (int) Tarea_C8_1.libFunciones.FuncionesMatematicas.potencia(array[i][0], array[i][1]);
    }

    // Imprimimos los resultados
    for (int i = 0; i < resultados.length; i++) {
      System.out.println("El resultado de " + array[i][0] + "^" + array[i][1] + " es " + resultados[i][0]);
    }

  }

}