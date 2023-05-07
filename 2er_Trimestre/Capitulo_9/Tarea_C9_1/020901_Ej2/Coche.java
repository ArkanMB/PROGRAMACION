/**
 * @file: Coche.java
 * 
 * @info: Creamos la clase Coche añadiendo un atributo y un método
 * 
 * @author: José Ángel Moya Baena
 */

// Definimos la clase "Coche" que extiende a la clase "Vehiculo"
public class Coche extends Vehiculo {

  // Se declara una variable privada de tipo entero para los caballos de vapor
  private int cv;

  // Creamos el constructor de la clase Coche, recibe como parámetro la los
  // caballos de vapor y llama al constructor de la clase base "Vehiculo" usando
  // "super()"
  public Coche(int c) {
    super();
    this.cv = c;
  }

  // Creamos el método público "decaportar" que imprime un mensaje en la consola
  public void descapotar() {
    System.out.println("Descapotando el Seat");
  }
}
