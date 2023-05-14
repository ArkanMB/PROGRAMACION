/*
 * C6Ej6.java
 * 
 * Programa que te crea un número aletorio y tienes que adivinarlo en 5 oportunidades
 * 
 * @ÁngelMB
*/

import java.util.Scanner;

public class C6Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroSecreto = (int) Math.round(Math.random() * 100);

    int oportunidades = 5;

    while (oportunidades > 0) {
      System.out.print("Introduce un número entre 0 y 100 => ");
      int numeroUsuario = s.nextInt();

      if (numeroUsuario == numeroSecreto) {
        System.out.println("¡¡¡OLEE lo has acertadooo!!! Y no sabes ni como...");
        break;
      } else {
        if (numeroUsuario < numeroSecreto) {
          System.out.println("El número es mayor.");
        } else {
          System.out.println("El número es menor.");
        }
        oportunidades--;
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
    }

    if (oportunidades == 0) {
      System.out.println("Ya no tienes más oportunidades. El número era " + numeroSecreto);
    }
  }
}