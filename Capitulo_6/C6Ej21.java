/* 
 * C6Ejercicio21.java
 * 
 * Programa que genere una secuencia de cinco monedas de curso legal 
 * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. 
 * Las dos posiciones posibles son cara y cruz.
 * 
 * @ÁngelMB
*/
import java.util.Scanner;
public class C6Ej21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("En las 5 monedas lanzadas ha salido: ");
    System.out.println("");
        
    String moneda = "";
    String posicion = "";
    
    for (int i = 0; i < 5; i++) {
      switch((int)(Math.random() * 8)) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
        default:
      }
      switch((int)(Math.random() * 2)) {
        case 0:
          posicion = "cara";
          break;
        case 1:
          posicion = "cruz";
          break;
        default:
      }
      System.out.println(moneda + " - " + posicion);
    }
  }
}
