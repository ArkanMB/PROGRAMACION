import java.util.Scanner;

/*
 * C6Ej27.java
 * 
 * Juego piedra, papel y tijera.
 * 
 * @ÁngelMB
 */

public class C6Ej27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Tu turno (piedra, papel o tijera) => ");
    String jugador = s.nextLine(); 

    int mano = (int) (Math.random() * 3); 
    String ordenador = ""; 
    
    switch (mano) {
      case 0:
        ordenador = "piedra"; 
        break;
      case 1: 
        ordenador = "papel"; 
        break; 
      case 2: 
        ordenador = "tijeras"; 
        break;
      default:
    }

    System.out.println("Mi turno => " + ordenador);

    if (jugador.equals(ordenador)) {
      System.out.println("Empate");
    } else {
      int ganador = 0; 
      switch (jugador) {
        case "piedra":
          if (ordenador.equals("tijeras")) {
            ganador = 1; 
          }
          break;
        case "papel":
          if (ordenador.equals("piedra")) {
            ganador = 1; 
          }
          break;
        case "tijeras": 
          if (ordenador.equals("papel")) {
            ganador = 1; 
          } 
          break;
        default:

      }
      if (ganador == 1) {
        System.out.println("HAS GANADOOOOO");
      } else {
        System.out.println("JEJE GANEEE");
      }
    }
  }
}


 
 
 
 
 
 
 
 