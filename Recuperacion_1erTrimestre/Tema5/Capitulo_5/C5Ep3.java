/*
 * C5Ep3.java
 *
 * Programa que calcule y muestre por pantalla, la suma y el producto de los 10 primeros números naturales.
 * 
 * @Ángel
 */

public class C5Ep3 {
  public static void main(String[] args) {
    
    int suma = 0; 
    for (int i = 0; i <= 10; i = i + 1) {
      suma = suma + i; 
      if (suma == 55) {
        System.out.println("La suma de los 10 primeros números naturales es: " + suma) ;
      } else {
        
      };
    }
    
    int producto = 1;
    for (int ii = 1; ii <= 10; ii = ii + 1) {
      producto = producto * ii; 
      if (producto == 3628800) {
        System.out.println("Él producto de los 10 primeros números naturales es: " + producto);
      } else {
        
      }

    }
    
  }
}

