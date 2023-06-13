/**
 * @file: C2_1Ej6.java
 * 
 * @statement: Escribe un programa que calcule el total de una factura a partir
 *             de la base imponible (precio sin IVA). La base imponible estará
 *             almacenada en una variable.
 * 
 * @author: José Ángel Moya Baena
 */

public class C2_1Ej6 {
  public static void main(String[] args) {

    // Definimos las variables base e iva en double ya que son decimales
    double base = 345.99;
    double iva = 0.21;

    // Ahora calculamos el iva de la base
    double ivabase = base * iva;

    // Y calculamos el total de la factura a partir de la base imponible es decir
    // sumar la base mas el iva de la base
    double facturaiva = base + ivabase;

    // Finalizamos imprimiendo los datos por pantalla
    System.out.println("\nEl total del IVA es de => " + ivabase + "€");
    System.out.println("El total de la factura con IVA es de => " + facturaiva + "€\n");
  }
}
