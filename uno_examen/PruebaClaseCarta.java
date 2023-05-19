package uno_examen;

/**
 * Programa ejecutable: PruebaClaseCarta
 * Sirve para comprobar que la clase carta esté bien implementada para
 * incorporar al juego "Uno".
 * Dependencias: Clase Carta (instancias y estático)
 * 
 * Examen DAM DAW del 19/05/2023
 * ¡¡NO MODIFICAR!!
 * 
 * @Author Pablo Carmona
 * @version 19/05/2023
 */

// =======================================================================================================================================
// CLASE COMPLETA, NO TOCAR!
// =======================================================================================================================================

public class PruebaClaseCarta {

  static final String ROJO = "\033[1;101m";
  static final String VERDE = "\033[42m";
  static final String AMARILLO = "\033[1;103m";
  static final String AZUL = "\033[0;104m";
  static final String PURPURA = "\033[1;105m";
  static final String RESET = "\033[0m";

  public static void main(String[] args) {

    Carta[] cartas = new Carta[4];
    cartas[0] = new Carta(1, ROJO);
    cartas[1] = new Carta(2, VERDE);
    cartas[2] = new Carta(1, VERDE);
    cartas[3] = new Carta(0, PURPURA);

    System.out.println("Así es como deben aparecer las 4 cartas:");
    System.out.print(ROJO + "/ \\" + RESET + " " + VERDE + "/ \\" + RESET + " ");
    System.out.println(VERDE + "/ \\" + RESET + " " + ROJO + "/" + PURPURA + " " + VERDE + "\\" + RESET + " ");
    System.out.print(ROJO + " 1 " + RESET + " " + VERDE + " 2 " + RESET + " ");
    System.out.println(VERDE + " 1 " + RESET + " " + PURPURA + " 0 " + RESET + " ");
    System.out.print(ROJO + "\\ /" + RESET + " " + VERDE + "\\ /" + RESET + " ");
    System.out.println(VERDE + "\\ /" + RESET + " " + AZUL + "\\" + PURPURA + " " + AMARILLO + "/" + RESET + " ");

    System.out.println("Así es como aparecen, como las has implementado :");
    System.out.print(cartas[0].dibujaFila(1) + " " + cartas[1].dibujaFila(1) + " ");
    System.out.print(cartas[2].dibujaFila(1) + " " + cartas[3].dibujaFila(1) + "\n");
    System.out.print(cartas[0].dibujaFila(2) + " " + cartas[1].dibujaFila(2) + " ");
    System.out.print(cartas[2].dibujaFila(2) + " " + cartas[3].dibujaFila(2) + "\n");
    System.out.print(cartas[0].dibujaFila(3) + " " + cartas[1].dibujaFila(3) + " ");
    System.out.print(cartas[2].dibujaFila(3) + " " + cartas[3].dibujaFila(3) + "\n");

    System.out.println("Este texto debe aparecer normal, sin colores (usa RESET después del texto coloreado)");
    System.out.println();

    Carta.setCartaEnJuego(cartas[1]);
    System.out.println("Setter y getters de cartaEnJuego bien creados? " + (Carta.getCartaEnJuego() == cartas[1]));
    System.out.println("Getter de color bien creado? " + (cartas[0].getColor() == ROJO));
    System.out.println("Getter de numero bien creado? " + (cartas[0].getNumero() == 1));
    System.out.println();

    System.out.print("Es jugable " + cartas[0] + " con " + cartas[1] + " ? ");
    System.out.println(cartas[0].esJugable() + " : (debe ser false)  \n");
    System.out.print("Es jugable " + cartas[2] + " con " + cartas[1] + " ? ");
    System.out.println(cartas[2].esJugable() + " : (debe ser true)  \n");
    System.out.print("Es jugable " + cartas[3] + " con " + cartas[1] + " ? ");
    System.out.println(cartas[3].esJugable() + " : (debe ser true) \n");
    Carta.setCartaEnJuego(cartas[2]);
    System.out.print("Es jugable " + cartas[0] + " con " + cartas[2] + " ? ");
    System.out.println(cartas[0].esJugable() + " : (debe ser true)  \n");
    Carta.setCartaEnJuego(cartas[3]);
    System.out.print("Es jugable " + cartas[0] + " con " + cartas[3] + " ? ");
    System.out.println(cartas[0].esJugable() + " : (debe ser true)  \n");

    System.out.print("Es " + cartas[3] + " un comodín? ");
    System.out.println(cartas[3].esComodin() + " : (debe ser true)  \n");

  }

}
