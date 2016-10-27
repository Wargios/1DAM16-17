import java.util.Scanner;

/**
 * 4. Realizar un programa que solicite dos números enteros y muestre por
 * pantalla el máximo común divisor de los dos números.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer04 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, mcd = 0, limite;

		System.out.println("Introduce dos números");
		a = Integer.parseInt(teclado.nextLine());
		b = Integer.parseInt(teclado.nextLine());

		// while (b != 0) { // método de euclides
		// aux = b;
		// b = a % b;
		// a = aux;
		//
		// /*
		// * Método de euclides hace el bucle hasta que el resto valga 0,
		// * entonces el mcd es el divisor
		// *
		// * mcd (20 y 12)
		// *
		// * 20 % 12 = 8
		// *
		// * 12 % 8 = 4
		// *
		// * 8 % 4 = 0
		// *
		// * mcd = 4
		// *
		// */
		//
		// }

		if (a < b)
			limite = b / 2 ;
		else
			limite = a / 2;

		for (int i = 1; i <= limite; i++) {
			if (a % i == 0 && b % i == 0)
				mcd = i;

		}

		System.out.println(mcd);
	}

}
