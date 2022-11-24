import java.util.Scanner;

/**
 * Ej12.java
 * 
 * Programa que calcula la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. Hay que tener en 
 * cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * 
 * @ÁngelMB
 */

public class Ej12{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la nota del primer examen => ");
    double nota1 = s.nextDouble(); 

    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double media = s.nextDouble();
    
    double nota2 = (((nota1*0.4)-media)/0.6)*-1;

   if (nota2 <= 10) {
    System.out.printf("Para tener un %.2f", media);
    System.out.printf(" en el trismestre necesitas sacar un %.2f", nota2);
    System.out.printf(" en el segundo examen \n");
    
   } else {
    System.out.println("Lo siento pero no vas a poder sacar esa nota");
   }
    
  }

}