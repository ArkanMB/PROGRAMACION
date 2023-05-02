import java.util.Scanner;

/**
 * Ej10.java
 * 
 * Programa que realiza un conversor de Mb a Kb.
 * 
 * @ÁngelMB
 */

public class Ej10{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Escribe los megabytes que quieras convertir a kilobytes => ");
  
    int mb = s.nextInt();

    System.out.println(mb + " megabytes son => " + (mb * 1000) + " kilobytes");
  
  }
}