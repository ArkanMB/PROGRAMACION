/*
 * C6Ej10.java
 * 
 * Programa que pinta por pantalla diez líneas formadas por caracteres.
 * 
 * @ÁngelMB
*/


public class C6Ej10 {
  public static void main(String[] args) {
		
		int longitud = (int) (Math.random() * 40) + 1;	
    int caracter = (int)(Math.random()*6) + 1; 
    String forma;
    forma = "";
    
    System.out.println("La longitud de la linea va a ser: " + longitud);
    
    switch(caracter) {
		case 1:
		forma = "*";
		break;
		case 2:
		forma = "-";
		break;
		case 3:
		forma = "=";
		break;
		case 4:
		forma = ".";
		break;
		case 5:
		forma = "|";
		break;
		case 6:
		forma = "@";
		break;
		}
		System.out.println("El caracter de la linea va a ser: " + forma);
		
		for (int lineas = 10; lineas > 0; lineas = lineas - 1) {
			
			for (int largo = 0; largo < longitud; largo = largo + 1){
				System.out.print(forma);
			}
		System.out.println();
		}
  }
}




