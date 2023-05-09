/**
 * @file: C7_1Ej1.java
 * 
 * @info: Define un array de 12 números enteros con nombre num y asigna los
 *        valores
 *        según la tabla que se muestra a continuación. Muestra el contenido de
 *        todos
 *        los elementos del array. ¿Qué sucede con los valores de los elementos
 *        que no
 *        han sido inicializados? -- Los valores que no se an iniciado se
 *        rellenan automáticamente con un valor = 0;
 *
 * @author: José Ángel Moya Baena
 */

// Definición de la clase
public class C7_1Ej1 {

  // Método principal
  public static void main(String[] args) {

    // Creamos un array de enteros con una longitud de 12
    int[] num = new int[12];

    // Asignamos valores a los elementos de la imagen del enunciado01234567'0986º134
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    // Inicializamos una variable que es la posición en la que va el elemento a la
    // hora de imprimirlo
    int p = 0;

    // Bucle "for each" que nos ayudará a imprimir de forma comoda los elementos
    // aparece en el punto 7.3 del libro
    for (int i : num) {

      // Imprime el índice del elemento actual y lo incrementamos en 1 para el
      // siguiente elemento
      System.out.print("Indice " + (p++) + ": ");

      // Imprime el valor del elemento actual
      System.out.println(i + " ");

    }

  }

}