package C5_1Ejemplo5;

import java.util.Scanner;

/**
 * @file: C5_1Ejemplo5.java
 * 
 * @info: Uso del bucle do-while pero introduciendo datos, el usario tendrá que
 *        escribir un número entero para poder
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_1Ejemplo5 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner importando la clase Scanner para poder
    // introducir datos por teclado
    Scanner s = new Scanner(System.in);

    // Declaramos una variable para introducir la respuesta y será de tipo entero
    int numero;

    // Este bucle pide un número y si introdoce el usuario el número 0 sale del
    // programa
    do {

      // Le decimos al usuario lo que tiene que hacer
      System.out.print("\nIntroduce un número positivo (0 para salir del programa) => ");

      // Leemos el número introducido
      numero = s.nextInt();

      // Imprimimos el número introducido
      System.out.println("Has puesto => " + numero);

      // Y comprobamos si es diferente a 0 si no sale del programa
    } while (numero != 0);

    // Cerramos Scanner para evitar problemas
    s.close();

  }

}