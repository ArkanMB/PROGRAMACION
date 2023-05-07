/**
 * @file: Gato.java
 * 
 * @info: Creamos la clase Gato con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

class Gato extends Mamifero {

  // Creamos el constructor que llama al constructor de la superclase Mamifero
  public Gato(String nombre, int edad, String pelaje) {
    super(nombre, edad, pelaje);
  }

  // Creamos el método arañar que imprime un mensaje
  public void arañar() {
    System.out.println(nombre + " me está arañando tol brazo.");
  }

  // Creamos el método trepa que imprime un mensaje
  public void trepa() {
    System.out.println(nombre + " nove como sube de rapido.");
  }
}
