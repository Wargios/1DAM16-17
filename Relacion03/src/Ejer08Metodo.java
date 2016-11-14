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

// Si la raíz cuadrada de numeroB elevado a 2 - 4 por numeroA por
// numeroC es menor a 0, la ecuación no tiene solución

// if (Math.sqrt((numeroB * numeroB) - (4 * numeroA * numeroC)) < 0) {
// System.out.println("Error, la ecuación no tiene solución");

public class Ejer08Metodo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double a, b, c;

		System.out.println("Ax^2 + B*x + C = 0");
		System.out.println("Introduce 3 numeros para resolver la ecuacion de segundo grado:");

		a = Double.parseDouble(teclado.nextLine());
		b = Double.parseDouble(teclado.nextLine());
		c = Double.parseDouble(teclado.nextLine());

		ecuacionDeSegundoGrado(a, b, c);
	}

	private static void ecuacionDeSegundoGrado(double a, double b, double c) {
		boolean hayResultado = false;
		double x1;
		double x2;

		x1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
		x2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));

		if (a * x1 * x1 + b * x1 + c == 0 || a * x2 * x2 + b * x2 + c == 0)
			hayResultado = true;

		if (!hayResultado)
			System.out.println("No hay resultados posibles para 'x'");

		else {
			System.out.println("x = " + x1);
			if (x1 != x2)
				System.out.println("x = " + x2);
		}
	}
}
