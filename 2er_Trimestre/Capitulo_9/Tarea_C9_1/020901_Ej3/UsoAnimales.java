/**
 * @file: UsoAnimales.java
 * 
 * @info: Creamos la clase principal UsoAnimales para instanciar los objetos y
 *        aplicar los métodos
 * 
 * @author: José Ángel Moya Baena
 */

public class UsoAnimales {
  public static void main(String[] args) {

    // Instanciamos los objetos de cada clase creada y le añadimos valores
    // iniciales.
    Mamifero mamifero = new Mamifero("Rey Leon", 10, "Calvo");
    Ave ave = new Ave("Conchi", 5, 2.5);
    Gato gato = new Gato("Garfield", 3, "Naranja");
    Perro perro = new Perro("Scooby-Doo", 4, "Café");
    Canario canario = new Canario("Piolín", 1, 0.2);
    Pinguino pinguino = new Pinguino("Skipper", 2, 1.0);
    Lagarto lagarto = new Lagarto("Dr. Connors", 52, "Verde");

    // Llamamos los diferentes métodos para cada objeto creado.
    mamifero.comia();
    mamifero.ostia();
    mamifero.sueño();

    ave.comia();
    ave.vuela();
    ave.caza();

    gato.nocomia();
    gato.arañar();
    gato.trepa();

    perro.comia();
    perro.ladrio();
    perro.cagar();

    canario.comia();
    canario.canta();
    canario.vuela2();

    pinguino.comia();
    pinguino.nado();
    pinguino.cagar();

    lagarto.nocomia();
    lagarto.agüilla();
    lagarto.baila();
  }
}