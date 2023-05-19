package ExamenDesarrolo;

import java.util.Random;

/**
 * @file: Ficha.java
 * 
 * @info: Clase Ficha con sus métodos y atributos.
 * 
 * @author: José Ángel Moya Baena
 */

/**
 * Clase que representa una ficha de dominó.
 */
class Ficha {
  private int lado1;
  private int lado2;
  private static int numFichasCreadas = 0;

  /**
   * Constructor de la clase Ficha. Crea una ficha con valores proporcionados.
   * 
   * @param lado1 Valor del lado 1.
   * @param lado2 Valor del lado 2.
   */
  public Ficha(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    numFichasCreadas++;
  }

  /**
   * Constructor de la clase Ficha. Crea una ficha con valores aleatorios.
   */
  public Ficha() {
    Random rand = new Random();
    this.lado1 = rand.nextInt(7);
    this.lado2 = rand.nextInt(7);
    numFichasCreadas++;
  }

  /**
   * Método para obtener el número de fichas creadas.
   * 
   * @return Número de fichas creadas.
   */
  public static int getNumFichasCreadas() {
    return numFichasCreadas;
  }

  /**
   * Método para voltear la ficha, intercambiando los valores de los lados.
   * 
   * @return Nueva ficha con los lados cambiados.
   */
  public Ficha voltea() {
    return new Ficha(lado2, lado1);
  }

  /**
   * Método que verifica si esta ficha encaja con otra ficha dada.
   * Dos fichas encajan si tienen al menos un lado igual.
   * 
   * @param otraFicha Ficha a verificar.
   * @return true si las fichas encajan, false en caso contrario.
   */
  public boolean encaja(Ficha otraFicha) {
    return this.lado1 == otraFicha.lado1 || this.lado1 == otraFicha.lado2 ||
        this.lado2 == otraFicha.lado1 || this.lado2 == otraFicha.lado2;
  }

  /**
   * Representación en cadena de la ficha.
   * 
   * @return Cadena que representa la ficha en el formato [lado1|lado2].
   */
  
  @Override
  public String toString() {
    return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + "]";
  }
}
