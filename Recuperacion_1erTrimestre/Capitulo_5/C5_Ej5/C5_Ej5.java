package C5_Ej5;

/**
 * @file: C5_Ej5.java
 * 
 * @statement: Muestra los números del 320 al 160, contando de 20 en 20 hacia
 *             atrás utilizando un bucle while.
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_Ej5 {

  public static void main(String[] args) {

    // Le explicamos al usuario lo que vamos a hacer
    System.out.println("\nVamos a ir de 360 hasta 160 bajando de 20 en 20\n");

    // Declaramos el número de inicio
    int numInicio = 360;

    // Y con el bucle vamos reiterando hasta que llegue a 160 de 20 en 20
    while (numInicio >= 160) {

      // Imprimimos el número en pantalla
      System.out.println("=> " + numInicio);

      // Le vamos restando 20
      numInicio = numInicio - 20;
    }

    System.out.println("\n");

  }

}