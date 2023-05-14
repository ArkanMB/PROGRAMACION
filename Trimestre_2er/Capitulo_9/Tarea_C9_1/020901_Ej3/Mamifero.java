/**
 * @file: Mamifero.java
 * 
 * @info: Creamos la clase Mamifero con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos de la clase Mamifero, que hereda de la clase Animal
class Mamifero extends Animal {
  // Creamos una variable de instancia pública de la clase Mamifero
  public String pelaje;

  // Creamos el constructor de la clase Mamifero, que inicializa las variables de
  // instancia
  // con los valores dados
  public Mamifero(String nombre, int edad, String pelaje) {
    super(nombre, edad); // Llamada al constructor de la clase padre Animal para inicializar sus
                         // variables de instancia
    this.pelaje = pelaje; // Inicialización de la variable de instancia pública de la clase Mamifero
  }

  // Creamos el método ostia()
  public void ostia() {
    System.out.println(nombre + " le está pegando a sus crías.");
  }

  // Creamos el método moverse()
  public void moverse() {
    System.out.println(nombre + " está caminando.");
  }
}
