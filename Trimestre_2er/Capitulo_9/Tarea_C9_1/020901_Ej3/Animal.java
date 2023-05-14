/**
 * @file: Animal.java
 * 
 * @info: Creamos la clase Animal con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos la clase Animal
class Animal {

  // Creamos las variables de instancia de la clase Animal
  public String nombre;
  public int edad;

  // Creamos el constructor de la clase Animal, que inicializa las variables de
  // instancia
  public Animal(String nombre, int edad) {

    this.nombre = nombre;
    this.edad = edad;

  }

  // Creamos el método comia()
  public void comia() {

    System.out.println(nombre + " no ve si come.");

  }

  // Creamos el método nocomia()
  public void nocomia() {

    System.out.println("A " + nombre + " hay que llevarlo al veterinario porque no come na.");

  }

  // Creamos el método sueño()
  public void sueño() {

    System.out.println(nombre + " está sobando.");

  }

  // Creamos el método cagar()
  public void cagar() {

    System.out.println(nombre + " mira como caga.");

  }
}
