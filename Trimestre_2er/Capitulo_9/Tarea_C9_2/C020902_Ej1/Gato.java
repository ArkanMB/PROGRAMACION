package Trimestre_2er.Capitulo_9.Tarea_C9_2.C020902_Ej1;

import java.util.Scanner;

/**
 * @file: Gato
 * 
 * @info: Clase Gato con sus atributos, getters y setters.
 * 
 * @author: José Ángel Moya Baena
 */

public class Gato {

  // Atributos
  private String mote;
  private String tamaño;
  private String color;
  private String raza;
  public static int sardinas = 10;

  // Constructor
  public Gato() {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el mote del gato:");
    this.mote = s.nextLine().toLowerCase();

    System.out.println("Introduce el tamaño del gato:");
    this.tamaño = s.nextLine().toLowerCase();

    System.out.println("Introduce el color del gato:");
    this.color = s.nextLine().toLowerCase();

    System.out.println("Introduce la raza del gato:");
    this.raza = s.nextLine().toLowerCase();
  }

  // Métodos getter para obtener los valores desde fuera de esta clase
  // Métodos setter para darles valor desde fuera de esta clase

  public String getMoteString() {

    return mote;

  }

  public void setMote(String moteString) {

    this.mote = moteString;

  }

  public String getTamañoString() {

    return tamaño;

  }

  public void setTamaño(String tamaño) {

    this.mote = tamaño;

  }

  public String getColorString() {

    return color;

  }

  public void setColor(String color) {

    this.mote = color;

  }

  public String raza() {

    return raza;

  }

  public void setRaza(String raza) {

    this.raza = raza;

  }

  /*****************************************************************************/

  /**
   * Este método setter lo que hace es que el Gato coma sardinas
   * 
   * @param sardina es el número de sardinas que comen no pueden comer mas
   *                 de 10 sardinas entre los 3 gatos
   * 
   */

  public void come(int sardina) {

    // Comprobamos si hay suficientes sardinas
    if (sardinas >= sardina) {

      // Restamos la cantidad de sardinas que come el gato a la cantidad total de
      // sardinas
      sardinas -= sardina;
      System.out.print(mote + " come ");

      // Imprimimos "Ñam..." tantas veces como sardinas se coman
      for (int i = 0; i < s; i++) {
        System.out.print("Ñam...");
      }

      // Mostramos la cantidad de sardinas que quedan en el plato
      System.out.println("quedan " + sardinas + " sardinas");
    } else {
      System.out.println(mote + " no puede comer " + sardina + " sardinas. Solo quedan " + sardinas + " sardinas.");
      System.out.println("Ya no hay sardinas");

      // Establecemos la cantidad de sardinas a cero
      sardinas = 0;
    }
  }

}
