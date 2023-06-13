package C4_Ej20;

import java.util.Scanner;

/**
 * @file: C4_Ej20.java
 * 
 * @statement: Realiza un programa que diga si un número entero positivo
 *             introducido por teclado es capicúa. Se permiten números de hasta
 *             5 cifras.
 * 
 * @author: José Ángel Moya Baena
 */

public class C4_Ej20 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer
    System.out.print("\nIntroduce un número entero de 5 cifras como mucho => ");

    // Declaramos una variable para meter el número introducido por teclado
    int num = s.nextInt();

    // Declaramos otra variable booleana para ayudarnos en el programa dandole como
    // valor inicial false
    boolean capicua = false;

    // Ahora iríamos poco a poco comprovando con condicionales si capicua o no

    if (num < 10) {

      capicua = true;

    }

    /*******************************************************************/

    if ((num >= 10) && (num < 100)) {
      if ((num / 10) == (num % 10)) {
        capicua = true;
      }
    }

    /*******************************************************************/

    if ((num >= 100) && (num < 1000)) {
      if ((num / 100) == (num % 10)) {
        capicua = true;
      }
    }

    /*******************************************************************/

    if ((num >= 1000) && (num < 10000)) {
      if (((num / 1000) == (num % 10)) && (((num / 100) % 10) == ((num / 10) % 10))) {
        capicua = true;
      }
    }

    /*******************************************************************/

    if (num >= 10000) {
      if (((num / 10000) == (num % 10)) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
        capicua = true;
      }
    }

    /*******************************************************************/

    if (num > 99999) {
      System.out.println("Te he dicho que de 5 cifras, vuelve a intentarlo cuando puedas");
    }

    /*******************************************************************/

    // Y terminamos mostrando por pantalla si número introducido es o no capicua
    if (capicua) {
      System.out.println("Pues si es capicua mira tu por donde\n");
    } else {
      System.out.println("No es capicua lo es lo siento\n");
    }

  }

}
