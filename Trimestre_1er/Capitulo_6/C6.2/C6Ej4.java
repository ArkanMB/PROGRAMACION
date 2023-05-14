/*
 * C6Ej4.java
 * 
 * Programa que da 20 números aleatorios entre 0 y 10.
 * 
 * @ÁngelMB
*/


public class C6Ej4 {
  public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("Esto son 20 números aleatorios entre 0 y 10: ");
		System.out.println(" ");
		
		for (int veces = 1; veces <=20; veces = veces+1){
			System.out.print( (int)(Math.random()*11) + "  ");
		}

    System.out.println(" ");
    System.out.println(" ");
 	}
}
