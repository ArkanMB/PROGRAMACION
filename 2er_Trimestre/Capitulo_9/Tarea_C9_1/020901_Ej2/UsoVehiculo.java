import java.util.Scanner;

/**
 * @file: UsoVehiculo.java
 * 
 * @info: Crea la clase Vehiculo, así como las clases Bicicleta y Coche como
 *        subclases de la primera. Para la clase Vehiculo, crea los atributos de
 *        clase vehiculosCreadosy kilometrosTotales, así como el atributo de
 *        instancia kilometrosRecorridos. Crea también algún método específico
 *        para cada una de las subclases. Prueba las clases creadas mediante un
 *        programa con un menú como el que se muestra a continuación:
 * 
 * @author: José Ángel Moya Baena
 */

public class UsoVehiculo {

  // El método principal se encarga de crear objetos de las clases Bicicletav1 y
  // Coche, y permite al usuario interactuar con ellos mediante un menú.
  public static void main(String[] args) {

    // Creamos un objeto Scanner para leer los kilómetros recorridos que inserte el
    // usuario.
    Scanner s = new Scanner(System.in);

    // Se inicializan dos variables enteras para guardar la opción seleccionada por
    // el usuario y la cantidad de kilómetros a recorrer.
    int eleccion = 0;
    int km;

    // Se crean objetos de las clases Bicicletav1 y Coche; junto con los valores de
    // las marchas de la bici y los caballos del coche.
    Bicicletav1 bici1 = new Bicicletav1(24);
    Coche seatLeon = new Coche(150);

    // Se crea un bucle while que muestra un menú de opciones al usuario y ejecuta
    // el código correspondiente según la opción seleccionada.
    while (eleccion != 8) {
      System.out.println("Opciones a elegir: ");
      System.out.println("1 --> Anda con la bici");
      System.out.println("2 --> Derrapa fuertemente con la bici");
      System.out.println("3 --> Anda con el Seat Leon");
      System.out.println("4 --> Descaportar el Seat Leon");
      System.out.println("5 --> Ver kilometraje de la bici");
      System.out.println("6 --> Ver kilometraje del Seat Leon");
      System.out.println("7 --> Ver kilometraje total");
      System.out.println("8 --> Salir del programa");
      System.out.print("Escoge una opción del 1 al 8 ==> ");

      // Leeremos la opción elegida por el usuario desde la consola.
      eleccion = s.nextInt();

      // Utilizamos un switch para ejecutar el código correspondiente a la opción
      // seleccionada.
      switch (eleccion) {
        case 1:
          System.out.print("¿Cuántos kilómetros va a recorrer? ");
          km = s.nextInt();
          bici1.recorre(km);
          break;

        case 2:
          bici1.derrapa();
          break;

        case 3:
          System.out.print("¿Cuántos kilómetros va a recorrer? ");
          km = s.nextInt();
          seatLeon.recorre(km);
          break;

        case 4:
          seatLeon.descapotar();
          break;

        case 5:
          System.out.println("La bicicleta lleva hechos ");
          System.out.println(bici1.getKmRecorridos() + " Kilómetros");
          break;
        case 6:
          System.out.println("El coche lleva hechos ");
          System.out.println(seatLeon.getKmRecorridos() + " Kilómetros");
          break;

        case 7:
          System.out.println("Los el coche y la bici llevan recorridos en total ");
          System.out.println(Vehiculo.getKmTotales() + " Kilómetros");

        default:
          System.out.println("No has elegido una de las 8 opciones ");

      }

    }

  }

}