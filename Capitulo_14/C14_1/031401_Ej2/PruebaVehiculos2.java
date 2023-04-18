import java.util.*;

/**
 * @file: PruebaVehiculos2.java
 * 
 * @info: 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *        como subclases de la primera. Para la clase Vehiculo , crea los
 *        atributos de clase vehiculosCreados y kilometrosTotales , así como
 *        el atributo de instancia kilometrosRecorridos . Crea también algún
 *        método específico para cada una de las subclases. Prueba las
 *        clases creadas mediante un programa con un menú como el que se
 *        muestra a continuación:
 *        VEHÍCULOS
 *        =========
 *        1. Anda con la bicicleta
 *        2. Haz el caballito con la bicicleta
 *        3. Anda con el coche
 *        4. Quema rueda con el coche
 *        5. Ver kilometraje de la bicicleta
 *        6. Ver kilometraje del coche
 *        7. Ver kilometraje total
 *        8. Salir
 *        Elige una opción (1-8):
 *
 * @author: José Ángel Moya Baena
 */

public class PruebaVehiculos2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String option = "";
    int km;
    int optionNum = 14;

    Bicicleta2 bicicleta = new Bicicleta2(9);
    Coche2 coche = new Coche2(1900);

    while (optionNum != 8) {
      System.out.println("\nIndice:");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");

      option = s.nextLine();

      System.out.println("");

      if (exp1(option)) {

        optionNum = Integer.parseInt(option);

      } else {

        optionNum = 0;

      }

      switch (optionNum) {

        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          bicicleta.recorre2(km);
          break;

        case 2:
        bicicleta.hazCaballito2();
          break;

        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          coche.recorre2(km);
          break;

        case 4:
        coche.quemaRueda2();
          break;

        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(bicicleta.getKilometrosRecorridos2() + " Km");
          break;

        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(coche.getKilometrosRecorridos2() + " Km");
          break;

        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo2.getKilometrosTotales2() + " Km");
        default:

      } // switch

    } // while

  }

  public static boolean exp1(String str) {
    return str != null && str.matches("[0-8.]+");
  }

}