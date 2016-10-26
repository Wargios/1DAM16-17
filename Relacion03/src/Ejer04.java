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
		int a, b, aux;
		System.out.println("Introduce");
		a = Integer.parseInt(teclado.nextLine());
		b = Integer.parseInt(teclado.nextLine());

		while (b != 0) { // método de euclides
			aux = b;
			b = a % b;
			a = aux;

			/*
			 * Método de euclides hace el bucle hasta que el resto valga 0,
			 * entonces el mcd es el divisor
			 * 
			 * mcd (20 y 12)
			 * 
			 * 20 % 12 = 8
			 * 
			 * 12 % 8 = 4
			 * 
			 * 8 % 4 = 0
			 * 
			 * mcd = 4
			 * 
			 */

		}
		System.out.println(a);
	}

}
