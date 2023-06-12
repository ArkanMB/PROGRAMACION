import java.util.Scanner;
/**
 * C4Ej1.java
 * 
 * Programa que pide por teclado un día de la semana y te dice qué
 * asignatura toca a primera hora ese día.
 * 
 * @ÁngelMB
 */

public class C4Ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Pon el día en cuestión => ");
    String dia = s.next();

    if (dia.equals("Lunes")) {
      System.out.println("El Lunes hay Formación y Orientación Laboral");

    } else {
        if (dia.equals("Martes")) {
          System.out.println("El Martes hay Base de Datos");
          
        } else {
            if (dia.equals("Miércoles")) {
              System.out.println("El Miércoles hay Base de Datos");

            } else {
                if (dia.equals("Jueves")) {
                  System.out.println("El Jueves hay Sistemas informáticos");
                } else {
                    if (dia.equals("Viernes")) {
                      System.out.println("El Viernes hay Lenguajes de marcas");
                    } else {
                      System.out.println("No hay clase XD");
                    }
                }
              
            }
        
        }
    }

   
  }    
}
