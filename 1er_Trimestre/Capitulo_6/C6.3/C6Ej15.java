/*
 * C6Ej15.java
 * 
 * Programa que realiza un generador de melodía
 * 
 * @ÁngelMB
*/


public class C6Ej15 {
  public static void main(String[] args) {

    System.out.println(" ");

    int nota= 4 * (int)(Math.random() * 7 + 1);
    String conjuntoNotas;
    conjuntoNotas="";
    String nota1;
    nota1="";
    int contaNota;
     
		
		for (contaNota=1; contaNota<= nota; contaNota++){    
      switch ((int)(Math.random() * 7)) {
        case 0:
          conjuntoNotas="DO";
        break;
        case 1:
          conjuntoNotas="RE";
        break;
        case 2:
          conjuntoNotas="MI"; 
        break;
        case 3:
          conjuntoNotas="FA";
        break;
        case 4:
          conjuntoNotas="SOL";
        break;
        case 5:
          conjuntoNotas="LA";
        break;
        case 6:
          conjuntoNotas="SI"; 
        break;
        default:
      }
		
      if (contaNota == 1) {
        nota1 = conjuntoNotas;
      }
      if (contaNota == nota) {
        conjuntoNotas = nota1;
      }
      System.out.print(conjuntoNotas + " ");
      
      if (contaNota == nota) {
        System.out.print("||");
      } else if (contaNota % 4 == 0 ) {
        System.out.print("| ");
      }
    } //Aqui termina el bucle "for".  
    System.out.println(" ");
    System.out.println(" ");
  }
}
