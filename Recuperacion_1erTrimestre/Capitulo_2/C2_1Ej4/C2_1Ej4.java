/**
 * @file: C2_1Ej4.java
 * 
 * @statement: Realiza un conversor de euros a pesetas. La cantidad en euros que
 *             se quiere convertir deberá estar almacenada en una variable.
 * 
 * @author: José Ángel Moya Baena
 */

public class C2_1Ej4 {
  public static void main(String[] args) {

    // Definimos las variables y le damos valores
    double euros = 6;
    double pesetas = 166;

    // Con esta función calculamos la conversion de euros a pesetas
    int conversion = (int) euros * (int) pesetas;

    // Por ultimo imprimimos la conversión
    System.out.println("\nLa conversion de 6 euros a pesetas son => " + conversion + "\n");
  }
}
