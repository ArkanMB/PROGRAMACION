/*
 * C6Ej16.java
 * 
 * Programa que realiza un simulador de máquina tragaperras simplificada.
 * 
 * @ÁngelMB
*/


public class C6Ej16 {
  public static void main(String[] args) {

    System.out.println(" ");
    System.out.println(" ");

    int figura;
    int figura1;
    figura1 = 0;
    int figura2;
    figura2 = 0;
    int figura3;
    figura3 = 0;
    
    for (int i = 0; i < 3; i++) {
      figura = (int)(5 * Math.random());

      switch(figura) {
        case 0:
          System.out.println("Corazón  ");
          break;
        case 1:
          System.out.println("Herradura");
          break;
        case 2:
          System.out.println("Campana");
          break;
        case 3:
          System.out.println("Diamante");
          break;
        case 4:
          System.out.println("Limón");
          break;
        default:
      }
      
      switch(i) {
        case 0:
          figura1 = figura;
          break;
        case 1:
          figura2 = figura;
        break;
        case 2:
          figura3 = figura;
        break;
        default:
      }
    }

    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("Lo siento, ha perdido.");
    } 
    else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("Oleee, has ganado 10 monedas.");
    } 
    else {
      System.out.println("No esta mal, has recuperado tu moneda.");
    }

    System.out.println(" ");
    System.out.println(" ");
  }
}
