import java.util.Scanner;

/*
 * Ej2.java
 * 
 * El ejercicio recoje los euros que quieras convertir a pesetas
 * 
 * @Ángel
 */

public class Ej2{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Escriba los euros que quieras convertir a pesetas => ");
    int euros = s.nextInt();

    int pesetas = (int) euros * 166;

    System.out.println(euros + " son: " + pesetas + " pesetas.");

  }



}