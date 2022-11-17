import java.util.Scanner;

/*
 * Ej3.java
 * 
 * Programa que te convierte las pesetas incluidas por pantalla a euros
 * 
 * @Ángel
 */

 public class  Ej3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escriba las pesetas que quieras convertir a euros: ");

        int pesetas = s.nextInt();
        
        double euros = (double) pesetas / (double) 166; 

        System.out.println(pesetas + " son: " + euros + " €");
    }

 }