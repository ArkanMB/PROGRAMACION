/*
* Ejemplo2.java
* 
* Es un ejemplo de como leer números por pantalla y imprimir por pantalla unos sucesos.
*
* @Ángel
*/
public class Ejemplo2{
    public static void main(String[] args) {

    System.out.print("Por favor, introduce un número: ");
    int primerNumeroInt = Integer.parseInt(System.console().readLine() );

    System.out.print("introduce otro, por favor: ");
    int segundoNumeroInt = Integer.parseInt(System.console().readLine() );

    int totalInt = (2 * primerNumeroInt) + segundoNumeroInt;

    System.out.print("El primer número introducido es " + primerNumeroInt);
    System.out.println(" y el segundo es " + segundoNumeroInt);
    System.out.print("El doble del primer número más el segundo es ");
    System.out.print(totalInt);
    
    }
}