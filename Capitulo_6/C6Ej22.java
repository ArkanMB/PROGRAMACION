import java.util.Scanner;

/*
 * C6Ej22.java
 * 
 * Programa que pint por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se coloca
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo va serpenteando de la siguiente manera: se genera de forma
 * aleatoria un valor entre tres posibles que hace que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pide por
 * teclado y se supone que el usuario introduce un dato correcto.
 * 
 * @ÁngelMB
 */

public class C6Ej22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la longitud total de la serpiente => ");
    int largo = s.nextInt(); 

    System.out.print("¿Qué forma tiene la cabeza? => ");
    String cabeza = s.next();


    System.out.println("\n            " + cabeza);

    int i; 
    int x = 13; 

    while (largo > 1) {
      x += (int)(Math.random() * 3) - 1; 

      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }

      System.out.println("#");

      largo--; 
    }
  }
}