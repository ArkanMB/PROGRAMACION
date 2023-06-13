import java.util.Scanner;
/*
 * Ej4.java
 * 
 * Programa que te coje dos numeros y los calcula de diferentes formas.
 * 
 * @Ángel
 */

public class Ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos números separalos (mediante un espacio) => ");
    int n1 = s.nextInt();
    int n2 = s.nextInt();

    int suma = (int) n1 + (int) n2;
    int resta = (int) n1 - (int) n2; 
    int producto = (int) n1 * (int) n2; 
    double cociente = (double) n1 / (double) n2; 

    System.out.println("El resultado de la suma de " + n1 + " + " + n2 + " es => " + suma);
    System.out.println("El resultado de la resta de " + n1 + " - " + n2 + " es => " + resta);
    System.out.println("El producto de la multiplicación de " +  n1 + " * " + n2 + " es => " + producto);
    System.out.println("El cociente de la división de " + n1 + " / " + n2 + " es => " + cociente );

  }

}