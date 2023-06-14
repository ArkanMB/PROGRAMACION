package C5_1Ejemplo2;

/**
 * @file: C5_Ejemplo2.java
 * 
 * @info: Uso del bucle while para crear contador de 1 hasta 5
 * 
 * @author: José Ángel Moya Baena
 */

public class C5_1Ejemplo2 {

  public static void main(String[] args) {

    // Explicamos que vamos a hacer
    System.out.println("\nHas iniciado un contador de 1 hasta 5\n");

    // Declaramos la variable contador y la iniciamos en 1
    int contador = 1;

    // Mientras contador sea menor o igual a 5, reiteramos en el bucle
    while (contador <= 5) {

      // Imprimimos por pantalla el valor del contador
      System.out.println("Contador => " + contador);

      // Incrementamos el contador cada vez que reiteramos
      contador++;
    }

    System.out.println("\n");

  }

}