package Trimestre_2er.Capitulo_9.Tarea_C9_2.C020902_Ej1;

/**
 * @file: C9_2Ej1
 * 
 * @info: Utiliza la clase Gato para crear un array de cuatro gatos e introduce
 *        los datos de cada uno de ellos mediante un bucle. Muestra a
 *        continuación los datos detodos los gatos utilizando también un bucle.
 * 
 * @author: José Ángel Moya Baena
 */

public class C9_2Ej1 {

  public static void main(String[] args) {
    Gato[] gatos = new Gato[3];

    for (int i = 0; i < 3; i++) {
      System.out.println("Introduce los atributos del gato " + (i + 1) + ":");
      gatos[i] = new Gato();
    }

    gatos[0].come(2);
    gatos[1].come(5);
    gatos[2].come(15);
  }

}