package Tarea5.T5_1.T5_1Ej4;

/**
 * @file: T5_1Ej4.java
 * 
 * @info: Programa que calcula y muestra el área de un círculo de
 *        radio = 7,125cm
 * 
 * @author: José Ángel Moya Baena
 */

public class T5_1Ej4 {

  public static void main(String[] args) {

    // Definimos el radio del circulo como double ya que es decimal
    double radio = 7.125;

    // Con una funcion del area de un circulo la calculamos
    // Aqui estamos usando dos metodos de la clase Math que es predeterminado y no
    // hay que importartarla y representa al número PI(π), el otro metodo seria el
    // de la potencia "pow" que habría que poner la base y luego el exponente
    double area = Math.PI * Math.pow(radio, 2);

    // Ahora solo imprimimos el resultado
    System.out.println("\nEl area del circulo de radio " + radio + " cm" + " es => " + area + " cm²\n");

  }

}
