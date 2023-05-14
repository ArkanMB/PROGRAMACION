package Tarea_C8_1.Ejercicios1_al_6.C020801_Ej1;
import java.util.Scanner;
import Tarea_C8_1.libFunciones.FuncionesMatematicas;

/**
 * @file: C8_2Ej1
 * 
 * @info: Devuelve verdadero si el número que se pasa como parámetro es capicúa
 *        y falso en caso contrario.
 * 
 * @author: José Ángel Moya Baena
 */

public class C8_1Ej1 {

  public static void main(String[] args) {

    // Creamos un objeto Scanner para leer la entrada del usuario
    Scanner s = new Scanner(System.in);

    // Pedimos al usuario que introduzca tres números separados por un espacio
    System.out.print("Escribe 3 números con un espacio entre ellos: ");

    // Creamos un array de enteros de tamaño 3 para almacenar los números
    // introducidos
    int[] array = new int[3];

    // Leemos los tres números introducidos por el usuario y los almacenamos en el
    // array
    array[0] = s.nextInt();
    array[1] = s.nextInt();
    array[2] = s.nextInt();

    // Informamos al usuario que vamos a comprobar si los números introducidos son
    // capicúa
    System.out.print("Vamos a comprovar si los números introducidos son capicua, ");
    System.out.println("al lado del número saldrá true si es capicua y false si no");

    // Comprobamos con un foreach si cada número es capicúa o no usando el método
    // esCapicua
    for (int i : array) {

      System.out.println(i + " --> " + Tarea_C8_1.libFunciones.FuncionesMatematicas.esCapicua(i));

    }

  }

}
