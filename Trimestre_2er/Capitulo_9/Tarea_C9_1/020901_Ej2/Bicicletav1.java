/**
 * @file: Bicicletav1.java
 * 
 * @info: Creamos la Clase Bicicletav1 con un método y un atributo
 * 
 * @author: José Ángel Moya Baena
 */

// Creamos Bicicletav1, que extiende de la clase Vehiculo.
public class Bicicletav1 extends Vehiculo {

  // Definimos un atributo privado llamado marchas para representar el número de
  // marchas que tiene la bici
  private int marchas;

  // Se define un constructor para la clase Bicicletav1
  // El constructor llama al constructor de la clase padre (Vehiculo) utilizando
  // la palabra clave "super".
  // Además, le asignamos el valor del parámetro a la variable derrapa uƒtilizando
  // la palabra clave "this".
  public Bicicletav1(int m) {

    super();
    this.marchas = m;

  }

  // Definimos un método público llamado "derrapa". El método imprime un "String"
  // por la consola.
  public void derrapa() {
    System.out.println("Miraa mamiii como derrapo");
  }
}