package C3_3Ej8;

import java.util.Scanner;

/**
 * @file: C3_3Ej8.java
 * 
 * @info: Programa que calcula el salario semanal de un empleado en base a las
 *        horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author: José Ángel Moya Baena
 */

public class C3_3Ej8 {
  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer
    System.out.print("\nIntroduzca el número de horas trabajadas durante la semana => ");

    // Declaramos una variable de tipo entero en la que se introduce un valor pedido
    // por teclado
    int horas = s.nextInt();

    // Calculamos mediante esta función el salario
    int salario = horas * 12;

    // Lo imprimimos por pantalla el salario
    System.out.println("\nEl salario semanal sería => " + salario + " €\n");

  }
}