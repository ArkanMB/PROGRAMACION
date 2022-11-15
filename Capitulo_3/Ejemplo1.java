/*
 * Ejemplo1.java
 * 
 * El Ejercicio consiste en introducir por pantalla nuestro nombre y apellido
 * 
 * @ÁngelMB
 */

public class Ejemplo1 {
    public static void main(String[] args) {
        
        String nombreString;

        System.out.print("Por favor, dime cómo te llamas: ");

        nombreString = System.console().readLine();

        System.out.println("Hola " + nombreString + ", encantadoo de conocertee!!");
    }
    
}
