/* 
* C2_1Ej8.java
* 
* @Ángel
*/
public class C2_1Ej8 {
  public static void main(String[] args) {

    char letra1 = 'c';
    char letra2 = 'a';
    char letra3 = 'm';
    char letra4 = 'i';
    char letra5 = 'ó';
    char letra6 = 'n';

    String totalString = " " + letra1 + letra2 + letra3 + letra4 + letra5 + letra6; //Tenemos el problema de que si concatenamos 5 variables tipo char, tienen como resultado un número. Lo solucionaríamos añaniendo la variable String un " ".
    System.out.println("Resultado de las letras: " + totalString);
  }
 }