package uno_examen;

/**
 * @file: Carta.java
 * 
 * @info: Esta clase Carta representa una carta de juego con sus atributos y
 *        métodos para obtener y establecer estos atributos, cuenta con una
 *        carta en juego estática, que representa la carta actualmente en juego,
 *        hay un método para determinar si una carta es un comodín y si es
 *        jugable según carta en juego y aparte un método para representar
 *        visualmente una carta en forma de cadena de caracteres.
 * 
 * @author: José Ángel Moya Baena
 */

public class Carta {

  // Número de la carta
  public int numero;

  // Color de la carta
  public String color;

  // Carta actualmente en juego
  private static Carta cartaEnJuego;

  // Constante de los colores
  public static final String ROJO = "\033[1;101m";
  public static final String VERDE = "\033[42m";
  public static final String AMARILLO = "\033[1;103m";
  public static final String AZUL = "\033[0;104m";
  public static final String PURPURA = "\033[1;105m";
  public static final String GRIS = "\033[1;100m";
  public static final String RESET = "\033[0m";

  // Constructor
  public Carta(int numero, String color) {
    this.numero = numero;
    this.color = color;
  }

  /**
   * Este metodo getter nos permite acceder al color
   * 
   * @return: color
   */
  public String getColor() {
    return color;
  }

  /**
   * Este metodo getter nos permite acceder al numero de la carta
   * 
   * @return: numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Este metodo nos permite devolver el número 0 si es comodín
   * 
   * @return: numero igual a 0
   */
  public boolean esComodin() {
    return numero == 0;
  }

  /**
   * Este metodo setter estático establece cual es la carta en juego
   * 
   * @param: cartaEnJuego
   */
  public static void setCartaEnJuego(Carta carta) {
    cartaEnJuego = carta; 
  }

  /**
   * Este metodo getter estático devuelve la carta actualmente en juego
   * 
   * @return: cartaEnJuego
   */
  public static Carta getCartaEnJuego() {
    return cartaEnJuego; 
  }

  /**
   * Este metodo devuelve (true) si la carta se puede jugar
   * 
   * @return: true
   */
  public boolean esJugable() {

    return color.equals(cartaEnJuego.color) || numero == cartaEnJuego.numero || esComodin();

  }

  /**
   * Este metodo devuelve una representación en cadena de la carta
   * 
   * @return: color + " " + numero + RESET
   */
  public String toString() {

    return color + " " + numero + RESET;

  }

  /**
   * Este metodo dibuja con un switch la carta dependiendo si es comodín o normal
   */

  public String dibujaFila(int fila) {
    switch (fila) {
      case 1:
        // Dibuja la primera fila de la carta esto --> "/ \"
        return color + "/ \\" + RESET;

      case 2:
        if (numero == 0) {

          // Si la carta es un comodín
          return GRIS + " " + color.charAt(1) + " " + RESET;
        } else {

          // Dibuja la segunda fila de la carta en el formato " color numero "
          return color + " " + numero + " " + RESET;
        }

      case 3:

        // Dibuja la tercera fila de la carta esto --> "\\ /"
        return color + "\\ /" + RESET;

      default:

        return ""; // Devuelve una cadena vacía para cualquier otra fila
    }
  }
}
