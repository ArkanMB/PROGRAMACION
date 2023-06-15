/**
 * @file: T5_3Ej1
 * 
 * @statement: Realiza un programa que muestre por pantalla en cada caso, los
 *             siguientes valores de las variables a, b y c.
 * 
 * @author: José Ángel Moya Baena
 */
public class T5_3Ej1 {

  public static void main(String[] args) {

    // Le explicamos al usuario lo que vamos a hacer
    System.out.println();
    System.out.printf("%1s %s", "", "Vamos a realizar una tabla de funciones");
    System.out.println("\n");

    // Ahora declaramos las variables que vamos a necesitar para los calculos
    int a = 1;
    int b = 2;
    int c = 3;

    // Aqui tendríamos la tabla en la que vamos creando las filas con el espacio que
    // queramos y alineados a la izquierda
    // Intercaladamente iremos haciendo los calculos y concatenandolos a la tabla
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "", "", "a", "b", "c");
    System.out.println();
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "", "Instrucción", "1", "2", "3");
    System.out.println();
    a = b;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "1", "a = b", a, b, c);
    System.out.println();
    c = a;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "2", "c = a", a, b, c);
    System.out.println();
    b = (a+b+c)/2;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "3", "b = (a+b+c)/2", a, b, c);
    System.out.println();
    a = a+c*2;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "4", "a = a+c*2", a, b, c);
    System.out.println();
    c = b-a;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "5", "c = b-a", a, b, c);
    System.out.println();
    a = b*c;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "6", "a = b*c", a, b, c);
    System.out.println();
    b = a+b*2;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "7", "b = a+b*2", a, b, c);
    System.out.println();
    c = c-2;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "8", "c = c-2", a, b, c);
    System.out.println();
    a = b;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "9", "a = b", a, b, c);
    System.out.println();
    c = a/b;
    System.out.printf("%-4s %-20s %-7s %-7s %-7s", "10", "c = a/b", a, b, c);
    System.out.println("\n");

  }

}