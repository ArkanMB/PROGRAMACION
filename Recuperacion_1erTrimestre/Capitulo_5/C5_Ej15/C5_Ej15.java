package C5_Ej15;

import java.util.Scanner;

/**
 * @file: C5_Ej15.java
 * 
 * @statement: Escribe un programa que dados dos números, uno real (base) y un
 *             entero positivo (exponente), saque por pantalla todas las
 *             potencias con base el numero dado y exponentes entre uno y el
 *             exponente introducido. No se deben utilizar funciones de
 *             exponenciación. Por ejemplo, si introducimos el 2 y el 5, se
 *             deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_Ej15 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer los valores introducidos por
    // teclado
    Scanner s = new Scanner(System.in);

    // Le pedimos al usuario lo que tiene que introducir y lo recojemos declarando
    // una variable de tipo entero
    System.out.print("\nIntroduce la base (tiene que ser número entero) => ");
    int base = s.nextInt();

    // Aqui igual que antes
    System.out.print("\nIntroduce el exponente es decir a lo que quieres que se eleve la base (tiene que ser entero) => ");
    int exponente = s.nextInt();

    // Le damos un espacio
    System.out.println();

    // Necesitaremos declar el valor potencia
    int potencia;

    // Ahora usamos un bucle for usando una variable temporal llamada i que nos
    // ayudará a ir recojiendo los números desde 1 hasta el exponente introducido
    // para luego imprimirlos
    for (int i = 1; i <= exponente; i++) {

      // A la potencia le damos valor 1 mientras que i sea menor o igual al exponente
      potencia = 1;

      // Creamos otro bucle for con una variable temporal 'j' para que mientras sea
      // menor o igual que i haga que la potencia sea igual a la potencia por la base,
      // asi dandonos el resultado de la potencia entre la base y el exponente desde 1
      // hasta el número que haya introducido el usuario
      for (int j = 1; j <= i; j++) {
        potencia *= base;
      }

      // Por ultimo se imprimi la base el exponente y su potencia
      System.out.println("· " + base + "^" + i + " = " + potencia + "\n");
    }

    // Le damos un espacio
    System.out.println();

  }

}