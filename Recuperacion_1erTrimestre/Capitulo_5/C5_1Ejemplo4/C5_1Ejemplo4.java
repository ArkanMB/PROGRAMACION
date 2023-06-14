package C5_1Ejemplo4;

/**
 * @file: C5_Ejemplo4.java
 * 
 * @info: Uso del bucle do-while sencillo, vamos a hacer un contador del 1 hasta
 *        el 5
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_1Ejemplo4 {

  public static void main(String[] args) {

    // Declaramos una variable llamada contador iniciada en 1
    int contador = 1;

    // Este bucle do-while primero imprime y incrementa el contador y luego
    // comprueba si el contador es menor o igual que 5 y si es true pues sale del
    // bucle
    do {

      // Imprimimos por pantalla
      System.out.println("\nContador => " + contador);

      // Incrementamos contador
      contador++;

    } while (contador <= 5);

System.out.println("\n");

  }

}