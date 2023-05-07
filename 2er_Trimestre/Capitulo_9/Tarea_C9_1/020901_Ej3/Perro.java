/**
 * @file: Perro.java
 * 
 * @info: Creamos la clase Perro con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos la clase Perro que hereda de Mamifero
class Perro extends Mamifero {

  // Creamos el constructor de la clase Perro
  public Perro(String nombre, int edad, String pelaje) {

    // Llamamos al constructor de la clase padre (Mamifero) con los mismos
    // parametros.
    super(nombre, edad, pelaje);
  }

  // Creamos el método ladrio que imprime un mensaje.
  public void ladrio() {

    System.out.println(nombre + " hay que ponerle un bozal porque nove si labra.");

  }

  // Creamos el método hiperactividad que imprime un mensaje.
  public void hiperactividad() {

    System.out.println(nombre + " no para quieto, corre, salta, muerde a cualquiera; hay que darle una pastillita.");

  }
}