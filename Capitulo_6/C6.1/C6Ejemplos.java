/*
 * C6Ejemplo1.java
 * 
 * Programa que saca 15 números aleatorios en diferentes modalidades de 0 a 9,
 * de 1 a 10, de 0 a 10, de 0 a 6 y de 50 a 60.
 * 
 * @ÁngelMB
*/


public class C6Ejemplos {
  public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("Esto son números aleatorios del 0 al 9 => ");
		System.out.println(" ");
		
		for (int veces = 1; veces <= 15; veces = veces + 1){
			System.out.print( (int)(Math.random()*10) + " ");
		}
		System.out.println(" ");
    System.out.println(" ");
		System.out.println(" ");
		System.out.println("Esto son números aleatorios del 1 al 10 => ");
		System.out.println(" ");
		
		for (int veces = 1; veces <= 15; veces = veces + 1){
			System.out.print( (int)(Math.random()*10+1) + " ");
		}
		System.out.println(" ");
    System.out.println(" ");
		System.out.println(" ");
		System.out.println("Esto son números aleatorios del 0 al 10 => ");
		System.out.println(" ");
		
		for (int veces = 1; veces <= 15; veces = veces + 1){
			System.out.print( (int)(Math.random()*11) + " ");
		}
		System.out.println(" ");
    System.out.println(" ");
		System.out.println(" ");
		System.out.println("Esto son números aleatorios del 0 al 6 => ");
		System.out.println(" ");
		
		for (int veces = 1; veces <=15; veces = veces + 1){
			System.out.print( (int)(Math.random()*7) + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
    System.out.println(" ");
		System.out.println("Esto son números aleatorios del 50 al 60 => ");
		System.out.println(" ");
		
		for (int veces = 1; veces <=15; veces = veces + 1){
			System.out.print( ((int)(Math.random()*11)+50) + " ");
      
		}
    System.out.println(" ");
    System.out.println(" ");
 	}
}