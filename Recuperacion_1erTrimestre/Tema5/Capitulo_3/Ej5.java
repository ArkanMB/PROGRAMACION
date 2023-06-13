import java.util.Scanner;

/*
 * Ej5.java
 * 
 * Este ejercicio pide los lados de un rectángulo y te calcula el área
 * 
 * @Ángel
 */

public class Ej5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escribe ambos lados en centímetros (con una separación) => ");
    
    double a = s.nextDouble();
    double b = s.nextDouble();

    double area = a * b; 

    System.out.println("El área total del rectángulo es: " + area + " cm");

  }
}