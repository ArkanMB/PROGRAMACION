import java.util.Scanner;

/**
 * @file: C3_3Ej11.java
 * 
 * @info: Programa que realiza un conversor de Kb a Mb.
 * 
 * @author: José Ángel Moya Baena
 */

public class C3_3Ej11{
  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);
  
     // Le decimos al usuario lo que tiene que hacer
    System.out.print("\nEscribe los kilobytes que quieras convertir a megabytes => ");
  
    // Declaramos una variable de tipo decimal en la que se introduce un valor por teclado
    double kb = s.nextDouble();

    // Y lo imprimimos por pantalla
    System.out.println("\n" + kb + " kilobytes son => " + (kb / 1000) + " megabytes\n");
  }

}