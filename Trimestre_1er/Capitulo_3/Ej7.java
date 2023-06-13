import java.util.Scanner;

/*
 * Ej7.java
 * 
 * Programa que calcula el total de una factura a partir de la base imponible.
 * 
 * @Ángel
 */
public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA):");
    
    int baseImponible = s.nextInt();
    double IVA =  baseImponible * 0.21;
    double total = baseImponible * 1.21;
  
    System.out.printf(" El IVA es: %.2f\n", IVA);
    System.out.printf(" El Total sería: %.2f\n", total);
    
  }
  }