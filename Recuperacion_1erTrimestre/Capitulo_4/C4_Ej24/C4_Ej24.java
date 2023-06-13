package C4_Ej24;

import java.util.Scanner;

/**
 * @file: C4_Ej24.java
 * 
 * @statement: Escribe un programa que genere la nómina (bien desglosada) de un
 *             empleado
 * 
 * @author: José Ángel Moya Baena
 */

public class C4_Ej24 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer
    System.out.println("\n¿En puesto estas? Tienes que poner 1, 2 o 3");
    System.out.println("1 => Programador Junior");
    System.out.println("2 => Programador Senior");
    System.out.println("3 => Jefe de proyecto");
    System.out.print("1, 2 o 3 => ");

    // Declaramos una variable para meter el número introducido por teclado
    int puesto = s.nextInt();

    // Le pedimos lo restante y declaramos las variables correspondientes
    System.out.print("¿Cuantos días has viajado? => ");
    int viaje = s.nextInt();

    System.out.print("Estas casado o soltero => ");
    String estadoCivil = s.next();

    // Usaremos el método toLoweCase de la clase String predeterminada para poner
    // todas las letras en minúscula
    estadoCivil = estadoCivil.toLowerCase();

    // Y declaramos tambien el sueldo base
    int sueldoBase = 0;

    // Usaremos un switch para facilitarnos el trabajo
    switch (puesto) {

      case 1:
        sueldoBase = 950;
        break;

      case 2:
        sueldoBase = 1200;
        break;

      case 3:
        sueldoBase = 1600;
        break;

      default:
        System.out.print("\nAlgo has puesto mal vuelve a hacerlo anda\n");

    }

    /*******************************************************************/

    // Lo mismo que antes declaramos lo que vayamos a usar y luego un switch
    int retencion = 0;

    switch (estadoCivil) {
      case "soltero":
        retencion = 25;
        break;

      case "casado":
        retencion = 20;
        break;

      default:
        System.out.print("Algo has puesto mal vuelve a hacerlo anda");

    }

    /*******************************************************************/

    // Ahora solo quedaría las funciones de calculo necesarias
    int sueldoExtra = viaje * 30;

    int sueldoBruto = sueldoBase + sueldoExtra;

    int retencion1 = (sueldoBruto * retencion) / 100;

    int sueldoNeto = sueldoBruto - retencion1;

    /*******************************************************************/

    // Y por último imprimimos por pantalla los resultados
    System.out.println("\n Sueldo base =>" + sueldoBase);
    System.out.println(" Dietas ( " + viaje + " viajes ) => " + sueldoExtra + "\n");
    System.out.println(" Sueldo bruto => " + sueldoBruto + "\n");
    System.out.println(" Retención (" + retencion + " %) " + retencion1 + "\n");
    System.out.println(" Sueldo neto => " + sueldoNeto + "\n");
    

  }

}
