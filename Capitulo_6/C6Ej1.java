/*
 * C6Ej1.java
 * 
 * Programa que simula 3 tiradas de dados y da su suma.
 * 
 * @ÁngelMB
*/


public class C6Ej1 {
  public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("Vamos a tirar el dado 3 veces a ver que sale: ");
		System.out.println(" ");
		
		int primera = (int)(Math.random()*6+1);
			System.out.println(" Primera tirada: " + primera);
		int segunda = (int)(Math.random()*6+1);
			System.out.println(" Segunda tirada: " + segunda);
		int tercera = (int)(Math.random()*6+1);
			System.out.println(" Tercera tirada: " + tercera);
		
		
		System.out.println("  ");
		System.out.println("Las tres tiradas de dados dan como resultado esta suma: " + (primera + segunda + tercera));
    System.out.println("  ");
    System.out.println("  ");
 	}
}
