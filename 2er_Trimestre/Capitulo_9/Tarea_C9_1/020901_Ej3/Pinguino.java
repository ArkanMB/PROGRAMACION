/**
 * @file: Pinguino.java
 * 
 * @info: Creamos la clase Pinguino con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

class Pinguino extends Ave {

  // Creamos el constructor de la clase Pinguino.
  public Pinguino(String nombre, int edad, double envergadura) {

    super(nombre, edad, envergadura);

  }

  // Creamos el método nado que imprime un mensaje.
  public void nado() {

    System.out.println(nombre + " está nadando con el frio que hace.");

  }

  // Creamos el método paseito que imprime un mensaje.
  public void paseito() {

    System.out.println(nombre + " esta paseando de chill por la nieve.");
  }

}
