/*
 * C6Ej17.java
 * 
 * Programa que pinta por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * 
 * @ÁngelMB
*/
import java.util.Scanner;
public class C6Ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println(" ");
    System.out.println(" ");

    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = s.nextInt();

    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = s.nextInt();
    int posicion = 0;
    int pez = (int)(Math.random()*(alto - 2)*(ancho - 2));

    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    for(int i = 2; i < alto; i++) {
      System.out.print("*");
      for(int a = 2; a < ancho; a++) {
        if (posicion == pez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      } 
      System.out.println("*");
    } 
    for(int i = 0; i < ancho; i++) {
      System.out.print("*");
    }

    System.out.println(" ");
    System.out.println(" ");
  }
}

