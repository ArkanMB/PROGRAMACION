import java.util.Scanner;

/**
 * @file: C3_3Ej12.java
 * 
 * @info: Programa que calcula la nota que hace falta sacar en el segundo examen
 *        de la asignatura Programación para obtener la media deseada. Hay que
 *        tener en cuenta que la nota del primer examen cuenta el 40% y la del
 *        segundo examen un 60%.
 * 
 * @author: José Ángel Moya Baena
 */

public class C3_3Ej12 {
  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Le decimos al usuario lo que tiene que hacer y declaramos las variables,
    // dandole un valor introducido por teclado
    System.out.print("\nIntroduce la nota del primer examen => ");
    double nota1 = s.nextDouble();

    System.out.print("\n¿Qué nota quieres sacar en el trimestre? ");
    double media = s.nextDouble();

    // Con esta función calculamos la nota que haría falta
    double nota2 = (((nota1 * 0.4) - media) / 0.6) * -1;

    // Usando el condicional if-else imprimimos al nota que quiere y la nota que
    // debería sacar en el siguiente examen, si nos da una nota que es imposible se
    // le comunica
    if (nota2 <= 10) {
      System.out.printf("\nPara tener un %.2f", media);
      System.out.printf(" en el trismestre necesitas sacar un %.2f", nota2);
      System.out.printf(" en el segundo examen \n\n");

    } else {
      System.out.println("\nLo siento pero no vas a poder sacar esa nota\n");
    }

  }

}