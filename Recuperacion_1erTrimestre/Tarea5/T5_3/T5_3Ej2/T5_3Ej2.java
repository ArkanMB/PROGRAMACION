/**
 * @file: T5_3Ej2
 * 
 * @statement: Realizar un programa que muestre por pantalla el resultado de
 *             cada una de las siguientes expresiones, suponiendo valores
 *             iniciales de entero1 = 5 y entero2 = 7
 * 
 * @author: José Ángel Moya Baena
 */
public class T5_3Ej2 {

  public static void main(String[] args) {

    // Le explicamos al usuario lo que vamos a hacer
    System.out.println();
    System.out.printf("%20s %s", "", "Vamos a realizar una tabla de funciones");
    System.out.println("\n");

    // Ahora declaramos las variables que vamos a necesitar para los calculos
    int entero1 = 5;
    int entero2 = 7;
    boolean a, b, d, e, f, g, h;
    int c;

    // Aqui tendríamos la tabla en la que vamos creando las filas con el espacio que
    // queramos y alineados a la izquierda
    // Intercaladamente iremos haciendo los calculos y concatenandolos a la tabla
    System.out.printf("%-4s %-65s %-7s", "", "Instrucción", "Resultado");
    System.out.println();

    a = (entero1 > 5) && (entero2 + 3 < 10);
    System.out.printf("%-4s %-65s %-7s", "A)", "(entero1 > 5) && (entero2 + 3 < 10)", a);
    System.out.println();

    b = (10 != entero1 + 5) || (20 > (entero2 + 5) * entero1 + 5);
    System.out.printf("%-4s %-65s %-7s", "B)", "(10 != entero1 + 5) || (20 > (entero2 + 5) * entero1 + 5)", b);
    System.out.println();

    c = entero1 * entero2 + 10 + 4/2 - 2*4 +2;
    System.out.printf("%-4s %-65s %-7s", "C)", "entero1 * entero2 + 10 + 4/2 - 2*4 +2", c);
    System.out.println();

    d = (10/2 - 1 == entero1) && (20 > entero2 + 13);
    System.out.printf("%-4s %-65s %-7s", "D)", "(10/2 - 1 == entero1) && (20 > entero2 + 13)", d);
    System.out.println();

    e = (5-2 > 4) &&! (5 == 25/5);
    System.out.printf("%-4s %-65s %-7s", "E)", "(5-2 > 4) &&! (5 == 25/5)", e);
    System.out.println();

    f = "J"=="j" || "S"=="s"; 
    System.out.printf("%-4s %-65s %-7s", "F)", "'J'=='j' || 'S'=='s'", f);
    System.out.println();

    g = (4*2 <= 8) || (2*2 < 5) && (4 > 3 + 1);
    System.out.printf("%-4s %-65s %-7s", "G)", "(4*2 <= 8) || (2*2 < 5) && (4 > 3 + 1)", g);
    System.out.println();

    h = (10+4 < 15-3) || (2*5 + 1 > 14 - 2*2);
    System.out.printf("%-4s %-65s %-7s", "H)", "(10+4 < 15-3) || (2*5 + 1 > 14 - 2*2)", h);
    System.out.println("\n");

  }

}