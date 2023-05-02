import java.util.Random;

/**
 * @file: C7_1Ej4.java
 * 
 * @info: Define tres arrays de 20 números enteros cada una, con nombres numero,
 *        cuadrado y cubo. Carga el array numero con valores aleatorios entre 0
 *        y 100. En el array cuadrado se deben almacenar los cuadrados de los
 *        valores que hay en el array numero. En el array cubo se deben
 *        almacenar los cubos de los valores que hay en numero. A continuación,
 *        muestra el contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author: José Ángel Moya Baena
 */

public class C7_1Ej4 {
  
  public static void main(String[] args) {

    // Declaramos e iniciamos los tres arrays de 20 números enteros
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    // Creamos un objeto Random para generar números aleatorios
    Random random = new Random();

    // Rellenamos el array "numero" con valores aleatorios entre 0 y 100
    for (int i = 0; i < numero.length; i++) {

      numero[i] = random.nextInt(101);

    }

    // Calculamos los cuadrados y cubos y guardarlos en los arrays correspondientes
    for (int i = 0; i < numero.length; i++) {

      cuadrado[i] = numero[i] * numero[i];

      cubo[i] = numero[i] * numero[i] * numero[i];

    }

    // Mostramos los tres arrays en una tabla de tres columnas
    System.out.println("\nNumero\tCuadrado\tCubo");

    for (int i = 0; i < numero.length; i++) {

      System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);

    }

    System.out.println(" ");// Espacio abajo

  }

}
