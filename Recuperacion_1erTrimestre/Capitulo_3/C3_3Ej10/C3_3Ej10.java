import java.util.Scanner;

/**
 * @file: C3_3Ej10.java
 * 
 * @info: Programa que realiza un conversor de Mb a Kb.
 * 
 * @author: José Ángel Moya Baena
 */

public class C3_3Ej10 {
  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer
    System.out.print("\nEscribe los megabytes que quieras convertir a kilobytes => ");

    // Declaramos una variable de tipo entero en la que se introduce un valor por teclado
    int mb = s.nextInt();

    // Y lo imprimimos por pantalla
    System.out.println("\n" + mb + " megabytes son => " + (mb * 1000) + " kilobytes\n");

  }
}