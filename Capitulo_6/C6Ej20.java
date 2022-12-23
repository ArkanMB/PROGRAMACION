/* 
 * C6Ejercicio20.java
 * 
 * Programa que pinte por pantalla una cuba con cierta cantidad de agua. 
 * La capacidad será indicada por el usuario. La cuba se llenará con una 
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima 
 * que pueda admitir. El ancho de la cuba no varía.
 * 
 * @ÁngelMB
*/
import java.util.Scanner;
public class C6Ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la capacidad de la cuba en litros: ");
    
    int capacidad = s.nextInt();
    int litros = (int)(Math.random() * (capacidad + 1));
        
    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("#    #");
      } else {
        System.out.println("#====#");
      }
    }

    System.out.println("######");
    System.out.printf("La cuba tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua");
    System.out.println(" "); //Para que no aparezca ese simbolo de porcentaje.
  }
}
