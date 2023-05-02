/**
 * @file: Bicicleta2.java
 * 
 * @info: clase "Bicicleta2"
 * 
 * @author: José Ángel Moya Baena
 */

public class Bicicleta2 extends Vehiculo2 {
  private int marcha2; // número de marchas

  public Bicicleta2(int p) {
    super();
    this.marcha2 = p;
  }

  public void hazCaballito2() {
    System.out.println("Estoy haciendo el caballito");
  }
}
