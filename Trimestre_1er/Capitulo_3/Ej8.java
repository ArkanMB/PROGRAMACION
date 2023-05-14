import java.util.Scanner;

/*
 * Ej8.java
 * 
 * Programa que calcula el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @ÁngelMB
 */

 public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número de horas trabajadas durante la semana => ");

    int horas = s.nextInt(); 

    int salario = horas * 12; 

    System.out.println("El salario semanal sería: " + salario + " € ");

  }
 }