/**
 * @file: C7_1Ej2.java
 * 
 * @info: Define un array de 10 caracteres con nombre simbolo y asigna valores a
 *        los elementos según la tabla que se muestra a continuación. Muestra el
 *        contenido de todos los elementos del array. ¿Qué sucede con los
 *        valores de los elementos que no han sido inicializados? -- El elemento
 *        no inicializado sería = null
 * 
 * @author: José Ángel Moya Baena
 */

public class C7_1Ej2 {

  public static void main(String[] args) {

    // Creamos un array de enteros con una longitud de 10
    String[] simbolo = new String[10];

    // Asignamos valores a los elementos de la imagen del enunciado
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";

    // Inicializamos una variable que es la posición en la que va el elemento a la
    // hora de imprimirlo
    int p = 0;

    // Bucle "for each" que nos ayudará a imprimir de forma comoda los elementos
    // aparece en el punto 7.3 del libro
    for (String i : simbolo) {

      // Imprime el índice del elemento actual y lo incrementamos en 1 para el
      // siguiente elemento
      System.out.print("Indice " + (p++) + ": ");

      // Imprime el valor del elemento actual
      System.out.println(i + " ");

    }

  }

}