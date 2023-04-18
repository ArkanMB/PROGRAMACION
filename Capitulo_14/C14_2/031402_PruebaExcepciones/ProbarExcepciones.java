
/**
 * @file: ProbarExcepciones.java
 * 
 * @info: Programa para probar las excepciones que nos podemos encontrar en java
 * 
 * @author: Jose Angel Moya Baena
 */

// Importamos las clases FileNotFoundException y Scanner
import java.io.FileNotFoundException;

import java.util.Scanner;

// Declaramos la clase
public class ProbarExcepciones {

  // Creamos el método principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Declaramos la variable
    int eleccion = 0;

    // Hacemos un bucle de repetición que muestra las opciones que hay y las
    // excepciones
    do {
      System.out.println("Interface:");
      System.out.println("1. Provocar un error SatckOverFlowError");
      System.out.println("2. Provocar un error NumberFormatException");
      System.out.println("3. Provocar un error ArrayIndexOutOfBoundsException");
      System.out.println("4. Provocar un error FileNotFoundException");
      System.out.println("5. Provocar un error ArithmeticException");
      System.out.println("6. No quiero provocar un error");
      System.out.print("¿Que opción vas a elegir? ");

      eleccion = s.nextInt();

      try {

        // Empieza el switch para elegir el método correspondiente según la opción que
        // eliga el usuario
        switch (eleccion) {
          case 1:
            exp1();
            break;
          case 2:
            exp2();
            break;
          case 3:
            exp3();
            break;
          case 4:
            exp4();
            break;
          case 5:
            exp5();
            break;
          case 6:
            System.out.println("Ya no vuelvas mas anda...");
            break;

          default:
            System.out.println("No me sirve, no es ninguna de las que te he propuesto. Elige otra opcion: ");
        }

        // Catch para las diferentes excepciones
      } catch (StackOverflowError e) {
        System.out.println("Nombre de la excepcion: " + e.getClass().getName());
        System.out.println(("Cagada: " + e.getMessage()));
        System.out.print("Provoca otra excepcion:");
      } catch (NumberFormatException e) {
        System.out.println("Nombre de la excepcion: " + e.getClass().getName());
        System.out.println(("Cagada: " + e.getMessage()));
        System.out.print("Provoca otra excepcion:");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Nombre de la excepcion: " + e.getClass().getName());
        System.out.println(("Cagada: " + e.getMessage()));
        System.out.print("Provoca otra excepcion:");
      } catch (FileNotFoundException e) {
        System.out.println("Nombre de la excepcion: " + e.getClass().getName());
        System.out.println(("Cagada: " + e.getMessage()));
        System.out.print("Provoca otra excepcion:");
      } catch (ArithmeticException e) {
        System.out.println("Nombre de la excepcion: " + e.getClass().getName());
        System.out.println(("Cagada: " + e.getMessage()));
        System.out.print("Provoca otra excepcion:");
      }
    } while (eleccion != 6);
    System.out.print("Hasta otra ;)\n");
    s.close();
  }

  // Método para provocar un StackOverFlow
  public static void exp1() throws StackOverflowError {
    exp1();
  }

  // Método para provocar un NumberFormat
  public static void exp2() throws NumberFormatException {
    String letra = "No es un número";
    int num = Integer.parseInt(letra);
    System.out.print(num);
  }

  // Método para provocar un ArrayIndexOutOfBounds
  public static void exp3() throws ArrayIndexOutOfBoundsException {
    int[] num = new int[3];
    int indice = num.length + 1;
    System.out.print(num[indice]);
  }

  // Método para provocar un FileNotFound
  public static void exp4() throws FileNotFoundException {
    java.io.FileReader schemaxml = new java.io.FileReader("C:\\Users\\arkangel\\DAW\\compra.xml");
    System.out.print(schemaxml);
  }

  // Método para provocar un excepción Aritmetica
  public static void exp5() throws ArithmeticException {
    int p = 283;
    int q = 0 ^ 1 * 0;
    int r = p / q;
    System.out.print(r);
  }
}