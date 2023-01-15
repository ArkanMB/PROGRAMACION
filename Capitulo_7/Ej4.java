/* 
 * Ej4.java
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 * 
 * @AngelMB
 */

public class Ej4 {
  public static void main(String[] args) {

    int t = 20;

    int[] numero = new int[t];
    int[] cuadrado = new int[t]; 
    int[] cubo = new int[t];

    for (int i = 0; i < t; i++) {
      numero[i] = (int)(Math.random()*101);
    }

    for (int i = 0; i < t; i++) {
      cuadrado[i] = (int)(Math.pow((numero[i]), 2));
    }

    for (int i = 0; i < t; i++) {
      cubo[i] = (int)(Math.pow((numero[i]), 3));
    }

    for (int i = 0; i < t; i++) {
      System.out.println(numero[i] + " " + cuadrado[i] + " " + cubo[i]);
    }

  }
}
