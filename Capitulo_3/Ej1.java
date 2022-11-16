/*
 * Ej1.java
 * 
 * El Ejercicio consiste en multiplicar dos números los cuales se introducirán por pantalla
 * 
 * @ÁngelMB
 */

public class Ej1 {
    public static void main(String[] args) {
    
        System.out.print("Por favor, introduce un número: ");
        int n1Int = Integer.parseInt(System.console().readLine() );

        System.out.print("Introduce otro, por favor: ");
        int n2Int = Integer.parseInt(System.console().readLine() );

        int productoInt = n1Int * n2Int;

        System.out.print("La multiplicación de los dos números que me has dado es: " + productoInt);
    
    }    
}
