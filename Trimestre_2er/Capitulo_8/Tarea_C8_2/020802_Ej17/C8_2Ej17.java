import matematicas.varias;

/**
 * @file: C8_2Ej17
 * 
 * @info: Programa que pasa de binario a decimal.
 * 
 * @author: José Ángel Moya Baena
 */

public class C8_2Ej17 {

  public static void main(String[] args) {

    long decimal = 0;
System.out.print("Introduzca un número binario: ");
long binario = Long.parseLong(System.console().readLine());
int bits = matematicas.Varias.digitos(binario);
for(int i = 0; i < bits; i++) {
decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potenc\
ia(2, i);
}
System.out.println(binario + " en binario es " + decimal + " en decimal.");

  }

}