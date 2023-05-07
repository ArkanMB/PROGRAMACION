/**
 * @file: Lagarto.java
 * 
 * @info: Creamos la clase Lagarto con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos la clase Lagarto, que hereda de la clase Animal
class Lagarto extends Animal {

  // Creamos una variable de instancia privada
  private String color;

  // Creamos el constructor de la clase Lagarto, que inicializa las variables de
  // instancia
  public Lagarto(String nombre, int edad, String color) {

    super(nombre, edad); // Llamamos al constructor de la clase padre Animal para inicializar sus
                         // variables de instancia

    this.color = color; // Inicializamos la variable de instancia

  }

  // Creamos el método agüilla()
  public void agüilla() {

    System.out.println(nombre + " se está mojando los tobillitos.");

  }

  // Creamos el método baila()
  public void baila() {

    System.out.println(nombre + " no sabe cómo bailar.");

  }
}