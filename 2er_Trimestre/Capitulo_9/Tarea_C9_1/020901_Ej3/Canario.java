/**
 * @file: Canario.java
 * 
 * @info: Creamos la clase Canario con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

class Canario extends Ave {

  // Creamos el constructor de la clase Canario
  public Canario(String nombre, int edad, double envergadura) {
    super(nombre, edad, envergadura);
  }

  // Creamos el método que muestra un mensaje
  public void canta() {

    System.out.println(nombre + " que bien canta.");

  }

  // Creamos el método que muestra un mensaje.

  public void vuela2() {

    System.out.println(nombre + " hay que comprarle una jaula mas grande pa que pueda volar mejor.");

  }
}
