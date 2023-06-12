import java.util.Scanner;

import javax.swing.Spring;

/*
 * C4Ej3.java
 * 
 * Programa en que dado un número del 1 a 7 escribe el correspondiente nombre del día de la semana.
 * 
 * @ÁngelMB
 */

public class C4Ej3{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escribe un número del 1 al 7 => ");
    int n = s.nextInt();
    
    if (n == 1) {
      System.out.println("El día es el Lunes");
    } else {
        if (n == 2) {
          System.out.println("El día es el Martes");  
        } else {
          if (n == 3) {
            System.out.println("El día es el Miércoles");
          } else {
            if (n == 4) {
              System.out.println("El día es el Jueves");
            } else {
              if (n == 5) {
                System.out.println("El día es el Viernes");
              } else {
                if (n == 6) {
                  System.out.println("El día es el Sábado");
                } else {
                  if (n == 7) {
                    System.out.println("El día es el Domingo");
                  } else {
                    System.out.println("No puedes poner otro número que no sea del 1 al 7 enteros");
                  } 
                } 
              } 
            } 
          } 
        }  
    }
  }
}