import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

/**
 * @file: Ej2_C14_2_.java
 * 
 * @info: Realiza un programa que genere una excepción de forma aleatoria de
 *        entre las siguientes excepciones: NumberFormatException, IOException,
 *        FileNotFoundException, IndexOutOfBoundsException y
 *        ArithmeticException.
 * 
 * @author: Jose Angel Moya Baena
 */

public class C14_2_Ej2 {

  public static void main(String[] args) {

    // Creamos un objeto Random para generar un número aleatorio del 0 al 4
    Random random = new Random();
    int idExp = random.nextInt(5);

    System.out.println("\nMenú:");
    System.out.println("1 => Excepcion NumberFormatException");
    System.out.println("2 => Excepcion IOException");
    System.out.println("3 => Excepcion FileNotFoundException");
    System.out.println("4 => Excepcion IndexOutOfBoundsException");
    System.out.println("5 => Excepcion ArithmeticException");
    System.out.println("Excepcion que se genera aleatoriamente id => " + (idExp + 1));

    try {

      // Con un switch generamos una excepción aleatoria dependiendo del número
      // aleatorio generado
      switch (idExp) {
        case 0:
          throw new NumberFormatException("Excepción aleatoria: NumberFormatException");
        case 1:
          throw new IOException("Excepción aleatoria: IOException");
        case 2:
          throw new FileNotFoundException("Excepción aleatoria: FileNotFoundException");
        case 3:
          throw new IndexOutOfBoundsException("Excepción aleatoria: IndexOutOfBoundsException");
        case 4:
          throw new ArithmeticException("Excepción aleatoria: ArithmeticException");
      }
    } catch (Exception e) {

      // Si se produce alguna excepción, se muestra el mensaje correspondiente
      System.out.println(e.getMessage());
    }

  }

}