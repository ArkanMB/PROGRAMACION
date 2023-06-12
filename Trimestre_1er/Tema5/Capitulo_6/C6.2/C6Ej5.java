/*
 * C6Ej5.java
 * 
 * Programa que da 50 números aleatorios entre 100 y 199 y calcula 
 * su máximo, su minimo y su media.  
 * 
 * @ÁngelMB
*/


public class C6Ej5 {
  public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("He generado 50 números aleatorios entre el 100 y 199");
		System.out.println(" ");
		
		int numero;
		numero = 0;
		
		int sumatorio;
		sumatorio = 0;
		
		int mayor;
		mayor = 100;
		
		int minimo;
		minimo = 200;
		
		for (int veces = 1; veces <= 50; veces = veces + 1){
			
			numero = ((int)(Math.random()*100)+100);
			sumatorio += numero;
				if (numero<minimo){
					minimo = numero;
				}
				if (numero>mayor){
					mayor = numero;
				}
		}
		System.out.println("El número más pequeño generado es: " + minimo);
		System.out.println(" ");
		System.out.println("La media de los números generados es: " + sumatorio/50);
		System.out.println(" ");
		System.out.println("El mayor número de los generados es: " + mayor);
		System.out.println(" ");
    System.out.println(" ");
 	}
}


