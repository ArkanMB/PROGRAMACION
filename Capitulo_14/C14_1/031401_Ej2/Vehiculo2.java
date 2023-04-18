/**
 * @file: Vehiculos2.java
 * 
 * @info:
 * 
 * @author: José Ángel Moya Baena
 */
public abstract class Vehiculo2 {

  // atributos de clase

  private static int kilometrosTotales2 = 0;
  private static int vehiculosCreados2 = 0;

  // atributos de instancia

  private int kilometrosRecorridos2;

  public Vehiculo() {

    this.kilometrosRecorridos2 = 0;

  }

  public int getKilometrosRecorridos2() {

    return this.kilometrosRecorridos2;
  }

  public static int getKilometrosTotales2() {

    return Vehiculo.kilometrosTotales2;

  }

  /*
   * Hace que un vehículo recorra una distancia determinada.
   * <p>
   * Cuando un vehículo recorre una distancia <code>k</code>, se
   * incrementan su propio cuentakilómetros, es decir, su atributo
   * <code>kilometrosRecorridos</code> y también se incrementa la cuenta
   * global de kilómetros que recorren todos los vehículos, es decir, el
   * atributo de clase <code>kilometrosTotales</code>.
   *
   * @param k kilómetros a recorrer
   */

  public void recorre2(int k) {

    this.kilometrosRecorridos2 += k;
    Vehiculo2.kilometrosTotales2 += k;

  }
}