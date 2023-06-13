import java.util.Scanner;

/*
 * C5Ep2.java
 *
 * Programa que muestre por pantalla los números naturales hasta un valor introducido por teclado.
 * 
 * @Ángel
 */
public class C5Ep2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Escribe un número entero natural positivo cualquiera => ");
		int i = s.nextInt();
		if (i < 0) {
			i = i * (-1);
			System.out.println("Quizás has querido poner => " + i );
			for (int ii = 0 ; ii<=i; ii++  )  {
				System.out.println(ii);
			}
		} else {
			for (int ii = 0 ; ii<=i; ii++  )  {
				System.out.println(ii);
			}
		}

	}
}
