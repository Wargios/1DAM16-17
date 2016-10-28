import java.util.Scanner;

/**
 * 8. Realizar un programa que calcule las soluciones de una ecuación de segundo
 * grado. Deben pedirse los tres coeficientes A, B, C e informar de si la
 * ecuación tiene dos soluciones, una solución, o ninguna solución.
 * 
 * A*x^2 + B*x + C = 0
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer08 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double a, b, c, resul1, resul2;

		System.out.println("Introduce 3 numeros para resolver la ecuacion de segundo grado:");

		a = Double.parseDouble(teclado.nextLine());
		b = Double.parseDouble(teclado.nextLine());
		c = Double.parseDouble(teclado.nextLine());

		resul1 = 0;
		resul2 = 0;

		System.out.println();
	}
}
