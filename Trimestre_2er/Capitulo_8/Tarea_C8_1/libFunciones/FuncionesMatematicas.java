package Tarea_C8_1.libFunciones;

/**
 * @file: FuncionesMatematicas
 * 
 * @info: Libreria de funciones matemáticas muy util para optimizar código y
 *        espacio
 * 
 * @author: José Ángel Moya Baena
 */

public class FuncionesMatematicas {

  /**
   * Este método verifica si un número long es capicua o no.
   * 
   * @param num el número long que se quiere verificar
   * @return true si el número es capicua, false si no lo es
   */
  public static boolean esCapicua(long num) {

    // Compara el número original con el número invertido para determinar si es
    // capicúa y lo devuelve
    return num == voltea(num);
  }

  /*****************************************************************************/

  /**
   * Este método invierte de posición un número long.
   * 
   * @param num el número long que se quiere invertir
   * @return el resultado del número invertido
   */
  public static long voltea(long num) {

    // Primero inicializamos el resultado en cero
    long resultado = 0;

    // Mientras que num sea distinta a 0, comprobandolo a través de cada dígito del
    // número original
    while (num != 0) {

      // Multiplicamos el resultado por 10 y agrega el dígito actual a la derecha
      resultado = resultado * 10 + num % 10;

      // Dividimos el número original por 10 para eliminar el dígito actual
      num /= 10;
    }

    // Por ultimos tenemos que devolver el número invertido
    return resultado;
  }

  /*****************************************************************************/

  /**
   * Este método verifica si un número long es primo o no.
   * 
   * @param num el número long que se quiere verificar
   * @return true si el número es primo, false si no lo es
   */
  public static boolean esPrimo(long num) {

    // Usamos un condicional if para comprobar si el número es menor que 2, no es
    // primo
    if (num < 2) {

      return false;

    } else {

      // Comprobamos si el número es divisible por algún número desde 2 hasta su raíz
      // cuadrada, para reducir la cantidad de números que tendríamos que comprobar si
      // es un número largo
      for (long i = 2; i <= Math.sqrt(num); i++) {

        // Si el número es divisible por i, no es primo
        if (num % i == 0) {
          return false;
        }

      }
    }

    // Devolvemos true si no se encontró ningún divisor, entonces el número es primo
    return true;
  }

  /*****************************************************************************/

  /**
   * Este método te devuelve el siguiente primo despues del número introducido
   * 
   * @param num el número long que se quiere devolver
   * @return el siguiente número primo
   */

  public static int siguientePrimo(int num) {

    // Mientras no sea primo sumale 1
    while (!esPrimo(++num)) {
    }
    ;

    // Devuelve el siguiente número primo
    return num;
  }

  /*****************************************************************************/

  /**
   * Este método te devuelve la potencia, utilizando una base y un exponente
   * introducidos
   * 
   * @param base      es la base de la potencia
   * @param exponente es el exponente de la potencia
   * @return el siguiente número primo
   */

  public static double potencia(int base, int exponente) {

    // Si el exponente es igual a 0 devolvemos 1
    if (exponente == 0) {
      return 1;
    }

    // Si el exponente es menor que cero tendríamos que cambiarle el signo a
    // positivo y devolvemos 1 partido la potencia
    if (exponente < 0) {
      return 1 / potencia(base, -exponente);
    }

    int num = 1;

    // Mientras que la variable i sea menos que el exponente, se multiplica la base por si misma.
    for (int i = 0; i < exponente; i++) {
      num = num * base;
    }

    // Devolvemos num
    return num;
  }

  /*****************************************************************************/

  /**
   * Este método te devuelve la potencia, utilizando una base y un exponente
   * introducidos
   * 
   * @param base      es la base de la potencia
   * @param exponente es el exponente de la potencia
   * @return el siguiente número primo
   */

  public static long digitos(long num) {

    // Obligamos, al número introducido, que sea positivo para que no nos de fallos
    if (num < 0) {
      num = -num;
    }

    int n = 0;

    // Utilizamos un bucle do-while para contar la cantidad de dígitos, dividiendo
    // num entre 10 en cada iteración para quitar el dígito más a la derecha hasta
    // llegar a 0 que sale del búcle
    do {
      n++;
      num /= 10;
    } while (num != 0);

    // Devolvemos el total de dígitos que tiene el número
    return n;
  }

}