import java.util.Scanner;

/*
 * Ejemp1.java
 *
 * a) Programa que muestra los elementod del array
 * b) Preguntar una posición y mostrar en elemento
 * c) Mostrar la suma de los elemntos de las posiciones pares
 * 
 * @AngelMB
*/

public class Ejemp1 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10]; // n es un array y se reserva 4 huecos

    num[0] = 1;
    num[1] = 2;
    num[2] = 2*2;
    num[3] = 2*2*2;
    num[4] = 2*2*2*2;
    num[5] = 2*2*2*2*2;
    num[6] = num[2] * 10;
    num[7] = num[2] / 10;
    num[8] = num[0] + num[1] + num[2];
    num[9] = num[8];  

    System.out.println("Los valores del array son: ");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(num[i]);
    }

    System.out.println("Elije una posición del 0 al 9");

    int posicion = s.nextInt();

    System.out.println("El numero de la posiciones es => " + num[posicion]);

    System.out.println("Los elementos de las posiciones pares son => ");

    for (int i = 0; i < 10; i= i + 2) {
      System.out.println(num[i]);

    }
    
    
  }
}












