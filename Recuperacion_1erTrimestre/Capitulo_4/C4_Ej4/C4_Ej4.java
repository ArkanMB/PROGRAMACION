package C4_Ej4;

import java.util.Scanner;

/**
 * @file: C4_Ej4.java
 * 
 * @statement: Escribe un programa que calcule el salario semanal de un
 *             trabajador teniendo en cuenta que las horas ordinarias (40
 *             primeras horas de trabajo) se pagan a 12 euros la hora. A partir
 *             de la hora 41, se pagan a 16 euros la hora.
 * 
 * @author: José Ángel Moya Baena
 */

public class C4_Ej4 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer y declaramos las variables,
    // dandole un valor introducido por teclado
    System.out.print("\nIntroduce las horas que has hechado esta semana => ");

    // Declaramos una variable para almacenar las horas trabajadas y la variable del
    // sueldo semanal
    int horas = s.nextInt();
    int sueldo;

    // Usamos el condicional if-else para hacer los calculos si son menos de 40
    // horas pues se cobra 12 y si son mas de 40 horas pues se sube a 16
    if (horas < 40) {

      sueldo = 12 * horas;

    } else {

      sueldo = (40 * 12) + ((horas - 40) * 16);

    }
    System.out.println("\nCobraría esta semana => " + sueldo + " €\n");
  }

}
