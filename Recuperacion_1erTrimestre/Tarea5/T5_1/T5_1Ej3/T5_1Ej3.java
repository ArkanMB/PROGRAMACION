package Tarea5.T5_1.T5_1Ej3;

/**
 * @file: T5_1Ej3.java
 * 
 * @info: Programa que calcula y muestra la longitud de una circunferencia de
 *        radio = 5 cm
 * 
 * @author: José Ángel Moya Baena
 */

public class T5_1Ej3 {

  public static void main(String[] args) {

    // Definimos el radio de la circunferencia
    int radio = 5;

    // Con una funcion de la longitud de la circunferencia la calculamos
    // Aqui estamos usando un método de la clase Math que es predeterminado y no
    // hay que importar ninguna clase externa y representa al número Pi(π)
    double longitud = 2 * Math.PI * radio;

    // Ahora solo imprimimos el resultado
    System.out.println("\nLa longitud de la circunferencia de radio " + radio + " cm es => " + longitud + " cm\n");

  }

}