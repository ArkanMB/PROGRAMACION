/**
 * @file: Ave.java
 * 
 * @info: Creamos la clase Ave con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos la clase Ave, que hereda de la clase Animal
class Ave extends Animal {

  // Creamos una variable de instancia privada de la clase Ave
  private double grande;

  // Creamos el constructor de la clase Ave
  public Ave(String nombre, int edad, double grande) {

    super(nombre, edad); // Llamada al constructor de la clase padre Animal para inicializar sus
                         // variables de instancia
    this.grande = grande; // Inicialización de la variable de instancia privada de la clase Ave

  }

  // Creamos el método vuela()
  public void vuela() {

    System.out.println("Mira mami estoy volando.");

  }

  // Creamos el método caza()
  public void caza() {

    System.out.println(nombre + " está cazando un colibrí para comérselo luego.");

  }
}
