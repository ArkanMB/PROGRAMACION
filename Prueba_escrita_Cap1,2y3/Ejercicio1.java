import java.util.Scanner;

/*
 * Ejercicio1.java
 * 
 * El programa te convertirá 564.25 euros a pesetas
 * 
 * @ÁngelMB
 */
public class Ejercicio1 {
  public static void main(String[] args) {

    double euros;
    euros = 564.25 ;
  
    int conversion;
    conversion = (int) euros * (int) 166.386;
  
    System.out.println("La conversión de 564.25 euros a pesetas son: " + conversion + " pesetas.");
  }

}
