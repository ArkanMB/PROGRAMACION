package C5_Ej33;

import java.util.Scanner;

/**
 * @file: C5_Ej33.java
 * 
 * @statement: Realiza un programa que pinte la letra U por pantalla hecha con
 *             asteriscos. El
 *             programa pedirá la altura. Fíjate que el programa inserta un
 *             espacio y pinta
 *             dos asteriscos menos en la base para simular la curvatura de las
 *             esquinas
 *             inferiores.
 * 
 * @info: El programa tiene como principal un bucle 'for' para la zona vertical
 *        y un System.out.println para la base de la U, tiene una caracteristica
 *        que nos simplicica mucho el trabajo que es el método 'repeat' de la
 *        clase predeterminada String, herramienta que nos ayuda a no tener que
 *        volver a poner varias veces que imprima un valor en concreto, dentro
 *        de los parentesis le indicamos las veces que queremos repetir el valor
 *        de la variable indicada
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_Ej33 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer los valores introducidos por
    // teclado
    Scanner s = new Scanner(System.in);

    // Le indicamos al usuario lo que tiene que hacer
    System.out.print("\nIntroduzca la altura que quiere que sea la U => ");

    // Leemos lo que haya introducido
    int altura = s.nextInt();

    // Usaremos un bucle for para la zona vertical de la U
    for (int i = 1; i < altura; i++) {

      // Ahora imprimimos cada línea hasta completar la altura indicada
      // Usaremos el método repeat para no tener que hacer otro bucle o otra
      // herramienta, repetiremos el espacio restandole a la altura 1 para que sea
      // algo mas estrechita
      System.out.println("*" + " ".repeat(altura - 1) + "*");

    }

    // Por ultimos imprimimos la base de la U con un espacio primero para darte
    // curbatura, aparte usamos el método repeat que nos ayuda a no tener que
    // escribir tanto
    System.out.println(" " + "*".repeat(altura - 1));

    s.close();

  }

}