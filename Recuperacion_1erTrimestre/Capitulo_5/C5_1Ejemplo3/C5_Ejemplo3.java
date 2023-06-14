package C5_1Ejemplo3;

import java.util.Scanner;

/**
 * @file: C5_Ejemplo3.java
 * 
 * @info: Uso del bucle while pero introduciendo datos, el usuario tendría que
 *        escribir exit para poder salir del programa si no seguirá pidiendo que
 *        introduzcas algun valor, y lo que hará será imprimirte lo que
 *        escribas.
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_Ejemplo3 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner importando la clase Scanner para poder
    // introducir datos por teclado
    Scanner s = new Scanner(System.in);

    // Declaramos una variable para introducir la respuesta y será de tipo
    // String(caracteres)
    String respuesta = "";

    // Este bucle te pedirá que introduzcas el valor exit para poder salir del
    // programa es decir, mientras la respuesta no sea "exit", se seguirá reiterando
    // en el bucle e imprimiendote lo que introduzcas
    while (!respuesta.equals("exit")) {

      // Le decimos al usuario lo que tiene que hacer
      System.out.print("\nIntroduce un valor (escribe 'exit' para salir del programa) => ");

      // Y leemos los datos introducidos
      respuesta = s.nextLine();
      
      // Imprime la respuesta del usuario
      System.out.println("\nHas puesto => " + respuesta); 
    }

    // Cerramos Scanner cuando termine el programa para evitar problemas de
    // cualquier tipo
    s.close();

  }

}