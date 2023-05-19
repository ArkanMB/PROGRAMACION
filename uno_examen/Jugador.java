package uno_examen;

/**
 * Clase Jugador: instancia jugadores con nombre y cartas
 * Contiene los métodos necesarios para manejar las cartas del jugador desde el programa principal en "Uno".
 * Dependencias: Clase Carta (instancias y estático)
 *  
 * Examen DAM DAW del 19/05/2023
 * ¡¡NO MODIFICAR!!
 * 
 * @Author Pablo Carmona
 * @version 19/05/2023
 */

//=======================================================================================================================================
// CLASE COMPLETA, NO TOCAR!
//=======================================================================================================================================

public class Jugador {
  
  // Atributos de clase
  static final int NUM_CARTAS = Uno.NUM_CARTAS;
  static final String RESET = "\033[0m";

  // Atributos de instancia
  Carta[] cartas = new Carta[NUM_CARTAS];
  String nombre;



  // Constructor con nombre
  //-------------------------------------------------------------------------------------------------------------------------------------
  public Jugador (String nombre) {
    this.nombre = nombre;
  }

  // Getter de nombre
  //-------------------------------------------------------------------------------------------------------------------------------------
  public String getNombre() {
    return this.nombre;
  }

  // cogeCarta
  // Toma la carta que se ha pasado por parámetro y la incorpora a su lista de cartas, en el primer hueco libre (null)
  //-------------------------------------------------------------------------------------------------------------------------------------
  public void cogeCarta(Carta carta) {
    for (int i = 0; i < cartas.length ; i++) {
      if (cartas[i] == null) {
        this.cartas[i] =  carta;
        break;
      }
    }
  }

  // puedeJugar
  // Devuelve true si el jugador tiene cartas compatibles con la carta en juego,
  // Usa Carta.esJugable
  //-------------------------------------------------------------------------------------------------------------------------------------
  public boolean puedeJugar() {
    boolean puede = false;
    for (Carta c : this.cartas ) {
      if (c != null) {
        if (c.esJugable()) { // Si alguna carta es jugable, puede jugar
          puede = true;
        }
      }
    }
    return puede;
  }

  // numCartas
  // Devuelve el número de cartas que tiene el jugador
  //-------------------------------------------------------------------------------------------------------------------------------------
  public int numCartas() {
    int cuenta = 0;
    for (Carta c: this.cartas) {
      if (c != null) {
        cuenta++;
      }
    }
    return cuenta;
  }

  // toString
  // Devuelve el dibujo a imprimir de las cartas de cada jugador, en 3 líneas
  // Usa Carta.dibujaFila, 
  //-------------------------------------------------------------------------------------------------------------------------------------
  @Override
  public String toString() {
    String dibujoCartas = "";
    // fila 1 de las cartas
    for (Carta c : cartas) {
      if (c != null) {
        dibujoCartas += c.dibujaFila(1) + " ";
      }
    }
    dibujoCartas +=  "\n";
    // fila 2 de las cartas
    for (Carta c : cartas) {
      if (c != null) {
        dibujoCartas += c.dibujaFila(2) + " ";
      }
    }
    dibujoCartas +=  "\n";
    // fila 3 de las cartas
    for (Carta c : cartas) {
      if (c != null) {
        dibujoCartas += c.dibujaFila(3) + " ";
      }
    }
    dibujoCartas +=  "\n";
    return dibujoCartas;
  }

  // juegaCartaAleatoria
  // Devuelve una carta aleatoria que puede jugar el jugador
  // Usa Carta.esJugable, Carta.setCartaEnJuego, tapaHuecos
  //-------------------------------------------------------------------------------------------------------------------------------------
  public void juegaCartaAleatoria() {
    int r = (int)(Math.random()*cartas.length);  // El índice aleatorio divide el array en 2 partes
    Carta cartaElegida = null;
    for (int i = r; i < cartas.length; i++) {    //Recorre las cartas desde la posición aleatoria hasta el final de la lista
      if (cartas[i] != null) {
        if (cartas[i].esJugable()) {             // Si es jugable, nos quedamos con esta
          cartaElegida = cartas[i];
          Carta.setCartaEnJuego(cartas[i]);
          cartas[i] = null;         
          tapaHuecos();                          // Para que no queden huecos en el array, y todas las cartas se puedan ir añadiendo a la derecha
          break;
        }
      }
    }
    if (cartaElegida == null) {                  //Si no se encontró ninguna en el recorrido parcial anterior
      for (int i = 0; i < r; i++) {              //Recorre las cartas desde el principio de la lista hasta la posición aleatoria
        if (cartas[i] != null) {
          if (cartas[i].esJugable()) {           // Si es jugable, nos quedamos con esta
            cartaElegida = cartas[i];
            Carta.setCartaEnJuego(cartas[i]);
            cartas[i] = null;
            tapaHuecos();
            break;
          }
        }
      }  
    }
  }

  // tapaHuecos
  // Tapa huecos en la lista de cartas (null), desplazando todas las que están a su derecha, 
  // para que las nuevas cartas se incorporen siempre a la derecha
  //-------------------------------------------------------------------------------------------------------------------------------------

  public void tapaHuecos() {
    for (int i = 0; i < cartas.length; i++) {
      if (cartas[i] == null) {
        for (int j = i; j < cartas.length-1; j++) {
          cartas[j] = cartas[j+1];
        }
        break;
      }
    }
  }

}
