import java.util.Scanner;

/**
 * Ej11.java
 * 
 * Programa que realiza un conversor de Kb a Mb.
 * 
 * @ÁngelMB
 */

public class Ej11{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Escribe los kilobytes que quieras convertir a megabytes => ");
  
    int kb = s.nextInt();

    System.out.println(kb + " kilobytes son => " + (kb / 1000) + " megabytes");
  }

}