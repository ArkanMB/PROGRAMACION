/*
 * C6Ej9.java
 * 
 * Programa que genera al azar números hasta que sale el 24.
 * 
 * @ÁngelMB
*/

public class C6Ej9 {
  public static void main(String[] args) {
    int contador = 0;

    while (true) {
      int numero = (int) (Math.random() * 101);
      if (numero % 2 == 0) {
        System.out.println(numero + " ");
        contador = contador +1;
      }
      if (numero == 24) {
				System.out.println("Salió el 24!");
        break;
      }
    }
    System.out.println("Salieron " + contador + " números hasta que salió el 24.");
  }
}
