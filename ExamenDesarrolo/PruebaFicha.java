package ExamenDesarrolo;

/**
 * @file: PruebFicha.java
 * 
 * @info: Prueba de la clase Ficha
 * 
 * @author: José Ángel Moya Baena
 */

public class PruebaFicha {

  public static void main(String[] args) {

    // Crea un array para alojar las 28 fichas del dominó.
    Ficha[] ficha = new Ficha[28];

    // Crea las fichas, con ambos valores dados o aleatorios.
    ficha[0] = new Ficha(6, 1);
    ficha[1] = new Ficha(0, 4);
    ficha[2] = new Ficha(3, 3);
    ficha[3] = new Ficha(0, 1);
    ficha[4] = new Ficha();

    // Imprime todas las fichas creadas
    for (int i = 0; i < Ficha.getNumFichasCreadas(); i++) {
      System.out.println(ficha[i]);
    }

    // voltea() obtiene una nueva ficha con los lados cambiados
    System.out.println(ficha[1].voltea());

    // ficha[a].encaja(ficha[b]) es true si ambas fichas tienen algún lado igual
    System.out.println(ficha[1].encaja(ficha[3]));
    System.out.println(ficha[0].encaja(ficha[3]));
    System.out.println(ficha[0].encaja(ficha[2]));
    System.out.println(ficha[0].encaja(ficha[1]));
  }
}