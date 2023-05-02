import java.util.Scanner;

/*
 * Ej6.java
 * 
 * Este ejercicio pide los lados de un triángulo y te calcula el área
 * 
 * @Ángel
 */

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escribe base y altúra del mismo en centímetros (con una separación) => ");
    
    double b = s.nextDouble();
    double a = s.nextDouble();

    double area = (b * a)/2; 

    System.out.println("El área total del triángulo es: " + area + " cm");

  }
}