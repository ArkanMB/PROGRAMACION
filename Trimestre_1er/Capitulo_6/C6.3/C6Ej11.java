/*
 * C6Ej11.java
 * 
 * Programa que muestra 20 notas generadas al azar.
 * 
 * @ÁngelMB
*/

public class C6Ej11 {

  public static void main(String[] args) {
    
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          System.out.println("suspenso ");
          suspensos++;
          break;
        case 1:
          System.out.println("suficiente ");
          suficientes++;
          break;
        case 2:
          System.out.println("bien ");
          bienes++;
          break;
        case 3:
          System.out.println("notable ");
          notables++;
          break;
        case 4:
          System.out.println("sobresaliente ");
          sobresalientes++;
          break;
        default:
      }

    }
    
    System.out.println("\nNº de suspensos: " + suspensos);
    System.out.println("Nº de suficientes: " + suficientes);
    System.out.println("Nº de bienes: " + bienes);
    System.out.println("Nº de notables: " + notables);
    System.out.println("Nº de sobresalientes: " + sobresalientes);
  }
}
