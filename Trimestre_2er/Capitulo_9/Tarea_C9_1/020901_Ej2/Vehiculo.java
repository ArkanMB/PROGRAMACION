/**
 * @file: Vehiculo.java
 * 
 * @info: Creamos la clase Vehiculo con sus atributos y métodos
 * 
 * @author: José Ángel Moya Baena
 */

// Creamos la clase abstracta Vehiculo
public abstract class Vehiculo {

  // Definimos dos atributos de clase "static" para el número total de
  // kilómetros recorridos por todos los vehículos
  // y el número total de vehículos creados.
  private static int totalKM = 0;

  // Definimos un atributo de instancia no static para el número de kilómetros
  // recorridos por cada vehículo.
  private int kmRecorridos;

  // Definimos un constructor que inicializa el número de kilómetros recorridos a
  // cero.
  public Vehiculo() {

    this.kmRecorridos = 0;

  }

  // Definimos un método llamado "getKmRecorridos" que devuelve el
  // número de kilómetros recorridos por el vehículo actual.
  public int getKmRecorridos() {

    return this.kmRecorridos;

  }

  // Definimos un método público y estático llamado "getKmTotales" que
  // devuelve el número total de kilómetros recorridos por todos los vehículos.
  public static int getKmTotales() {

    return Vehiculo.totalKM;

  }

  // Definimos un método público llamado "recorre" que recibe un parámetro entero
  // "r" que representa los kilómetros recorridos por el vehículo.
  // El método incrementa el número de kilómetros recorridos por el vehículo
  // actual y el número total de kilómetros recorridos por todos los vehículos.
  public void recorre(int r) {

    this.kmRecorridos += r;

    Vehiculo.totalKM += r;

  }
}