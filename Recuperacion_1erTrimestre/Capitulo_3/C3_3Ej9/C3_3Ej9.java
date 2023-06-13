import java.util.Scanner;

/**
 * @file: Ej9.java
 * 
 * @info: Programa que calcule el volumen de un cono según la fórmula V = 1/3 π
 *        r
 * 
 * @author: José Ángel Moya Baena
 */
public class C3_3Ej9 {
  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer
    System.out.print("\nEscribe el radio y la altura (pulsando intro entre valores) => ");

    // Declaramos dos variables de tipo decimal en la que se introduce un valor
    // pedido por teclado en radio y otro en altura
    double radio = s.nextInt();
    double altura = s.nextInt();

    // Calculamos mediante esta función el volumen del cono, usamos el método de la
    // clase Math que es predeterminado para obtener un resultado más preciso
    double volumen = (1.0 / 3.0) * Math.PI * (radio * radio) * altura;

    // Y lo imprimimos por pantalla con maximo 2 decimales
    System.out.printf("\nEl volumen del cono es: %.2f", volumen);
    System.out.println(" Litros\n");
  }
}