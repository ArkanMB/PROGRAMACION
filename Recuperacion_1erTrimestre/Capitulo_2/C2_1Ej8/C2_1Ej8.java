/**
 * @file: C2_1Ej8.java
 * 
 * @statement: Escribe un programa que declare 5 variables de tipo char. A
 *             continuación, crea otra variable como cadena de caracteres y
 *             asígnale como valor la concatenación de las anteriores 5
 *             variables. Por último, muestra la cadena de caracteres por
 *             pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author: José Ángel Moya Baena
 */

public class C2_1Ej8 {
  public static void main(String[] args) {

    // Definimos las variables tipo char (caracter) y le damos valor con comillas
    // simples
    char letra1 = 'c';
    char letra2 = 'o';
    char letra3 = 'c';
    char letra4 = 'h';
    char letra5 = 'e';
    char letra6 = 's';

    // Tenemos el problema de que si concatenamos 5 variables tipo char, tienen como
    // resultado un número. Lo solucionaríamos añaniendo la variable String un " ".
    String totalString = " " + letra1 + letra2 + letra3 + letra4 + letra5 + letra6;

    // Ahora si nos imprime el conjunto de palabras
    System.out.println("\nResultado de las letras => " + totalString + "\n");
  }
}