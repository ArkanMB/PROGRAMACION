import java.util.Scanner;

/*
 * C4Ej2.java
 * 
 * Programa que pide una hora por teclado y muestra luego buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se incluyen.
 * 
 * @ÁngelMB
 */
public class C4Ej2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("¿Qué hora es? ");
    int hora = s.nextInt();

    if (hora < 6) {
      System.out.println("Buenas noches");

    } else {
        if (hora < 13) {
          System.out.println("Buenos días");       
        } else {
            if (hora < 21) {
              System.out.println("Buenas tardes");
            } else {
                if (hora < 24) {
                  System.out.println("Buenas noches");
                } else {
                  System.out.println("");
                }
            }     
        }
            
    }
        
  }
    
}
