import java.util.Scanner;

/*
 * Ej9.java 
 * 
 * programa que calcule el volumen de un cono según la fórmula V = 1/3 π r
 */
public class Ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double Pi = 3.1416; 

    System.out.print("Escribe el radio y la altura (con una separación y en dm) => ");

    double radio = s.nextInt(); 
    double altura = s.nextInt(); 

    double volumen = (1.0/3.0) * Pi * (radio * radio) * altura; 

    System.out.printf("El volumen del cono es: %.2f", volumen);
    System.out.printf(" Litros\n");
  }
}