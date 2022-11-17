import java.util.Scanner;

/*
 * Ejercicio3.java
 * 
 * El programa te pedirá 3 datos y se mostrarán por pantalla
 * 
 * @Ángel
 */
public class Ejercicio3{
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in); //Usamos Scanner para imprimir por pantalla más comodamente.
  System.out.print("Escriba tu año, mes y día de nacimiento => ");

  int año = s.nextInt(); 
  String mes = s.next();
  int dia = s.nextInt();

  System.out.println("Mi fecha de nacimiento es: " + dia + " de " + mes+ " de " + año );        

  }

}