package Tarea5.T5_1.T5_1Ej5;

/**
 * @file: T5_1Ej5.java
 * 
 * @info: Programa que calcule y muestre el volumen de una esfera de radio =
 *        8,75 cm
 * 
 * @author: José Ángel Moya Baena
 */

public class T5_1Ej5 {

  public static void main(String[] args) {

    // Definimos el radio de la esfera como double ya que es decimal
    double radio = 8.75;

    // Con una funcion del volumen de una esfera la calculamos
    // Aqui estamos usando dos metodos de la clase Math que es predeterminado y no
    // hay que importartarla y representa al número PI(π), el otro metodo seria el
    // de la potencia "pow" que habría que poner la base y luego el exponente
    double volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);

    // Ahora solo imprimimos el resultado
    System.out.println("\nEl volumen de la esfera de radio " + radio + " cm" + " es => " + volumen + " cm³\n");



    

  }

}
