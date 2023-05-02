/* 
 * C6Ej19.java
 * 
 * Programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados
 * 
 * @ÁngelMB
*/
public class C6Ej19 {
  public static void main(String[] args) {
    System.out.println("50 números aleatorios entre el -100 y el 200: ");
    System.out.println("");
    
    int numero;
    int maxPar = -100;
    int minImpar = 200;
    int suma = 0;
    
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random() * 301) - 100;
      
      System.out.print(numero + " ");
      
      if (numero % 2 == 0) { 
        if (numero > maxPar) maxPar = numero;
      } else { 
        if (numero < minImpar) minImpar = numero;
      }      
      suma += numero;
    }
    
    System.out.println("");
    System.out.println("\nMáximo de los pares: " + maxPar);
    System.out.println("");
    System.out.println("Mínimo de los impares: " + minImpar);
    System.out.println("");
    System.out.println("Media: " + suma / 50);
  }
}
