/* C2_1Ej6.java
* Programa que imprime por pantalla una factura a partir de la base imponible
*@LDS
*/
public class C2_1Ej6 {
    public static void main(String[] args) {

      double base;
      base = 345.99;

      double iva;
      iva = 0.21;

      double ivabase;
      ivabase = base * iva;

      double facturaiva;
      facturaiva = base + ivabase;

      System.out.println("El total del IVA es de: " + ivabase + "€");
      System.out.println("El total de la factura con IVA es de: " + facturaiva + "€");
    }
 }
    
    