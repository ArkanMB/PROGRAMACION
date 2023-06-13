package C4_Ej12;

import java.util.Scanner;

/**
 * @file: C4_Ej12.java
 * 
 * @statement: Realiza un minicuestionario con 4 preguntas tipo test sobre las
 *             asignaturas que se imparten en el curso. Cada pregunta acertada
 *             sumará un punto. El programa mostrará al final la calificación
 *             obtenida. Pásale el minicuestionario a tus compañeros y pídeles
 *             que lo hagan para ver qué tal andan de conocimientos en las
 *             diferentes asignaturas del curso.
 * 
 * @author: José Ángel Moya Baena
 */

public class C4_Ej12 {

  public static void main(String[] args) {

    // Creamos un objeto de tipo Scanner para recojer datos introducidos por teclado
    Scanner s = new Scanner(System.in);

    // Declaramos las variables que vamos a usar
    int puntos = 0;
    String respuesta;

    // Le explicamos al usuario un poco sobre el programa
    System.out.println("\nEstas a punto de hacer un cuestionario a ver que tal");
    System.out.println("Las reglas son sencillas: hay 3 opciones y solo hay una correcta");

    // Empezamos con el cuestionario, es muy sencillo consiste en pregunta y
    // opciones
    // El usuario elige una respuesta y si acierta va sumando 1 punto

    System.out.println("1) ¿Qué significa 'HTML' en una palabra?");
    System.out.println("a) Hipercord.\nb) Hipercodigo.\nc) Hipertexto");
    System.out.print("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("c")) {
      puntos++;
    }

    /*******************************************************************/

    System.out.println("2) ¿Cuál es el lenguaje de programación más utilizado a dia de hoy?");
    System.out.println("a) Python\nb) JAVA\nc) SQL");
    System.out.print("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
    }

    /*******************************************************************/

    System.out.println("3) ¿Cuál de las siguientes opciones NO es un sistema operativo?");
    System.out.println("a) Windows\nb) MacOS\nc) Bing");
    System.out.print("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("c")) {
      puntos++;
    }

    /*******************************************************************/

    System.out.println("4) ¿Qué significa 'CPU' en una sola palabra?");
    System.out.println("a) Procesador\nb) Memoria\nc) Grafica");
    System.out.print("=> ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
    }

    /*******************************************************************/

    if (puntos == 4) {

      System.out.println("\nTienes " + puntos + " puntos");
      System.out.println("\nEnorabuenaa eres un crack\n");

    } else {

      System.out.println("\nTienes " + puntos + " puntos");
      System.out.println("Has fallado alguna asinque repitelo hasta tener un 5\n");

    }

  }

}
