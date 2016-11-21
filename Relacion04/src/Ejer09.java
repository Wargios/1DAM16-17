import java.util.Scanner;

/**
 * 9. Realizar un programa que presente un menú de este tipo:
 * 
 * 1. Calcular factorial de un número
 * 
 * 2. Calcular mcd de dos números
 * 
 * 3. Calcular el mcm de dos números
 * 
 * 4. Salir
 * 
 * Introduce una opción (1-3):
 * 
 * El menú debe repetirse mientras no se introduzca la opción salir. Realizar al
 * menos los siguientes métodos:
 * 
 * • Un método que muestre el menú por pantalla.
 * 
 * • Un método que devuelve la opción elegida, validándola.
 * 
 * • Un método que calcule el factorial (anterior).
 * 
 * • Un método que calcule el mcd.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer09 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;

		do {
			mostrarMenu();
			opcion = solicitaOpcion();
			tratarMenu(opcion);
		} while (opcion != 4);

	}

	private static void tratarMenu(int opcion) {
		int num1, num2;

		switch (opcion) {

		case 1:
			System.out.println("Introduce un número:");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("El factorial de " + num1 + " es " + calcularFactorial(num1));
			break;

		case 2:
			System.out.println("Introduce el primer número:");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce el segundo número:");
			num2 = Integer.parseInt(teclado.nextLine());
			System.out.println("El mcd de " + num1 + " y " + num2 + " es " + calcularMcd(num1, num2));
			break;

		case 3:
			System.out.println("Introduce el primer número:");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce el segundo número:");
			num2 = Integer.parseInt(teclado.nextLine());
			System.out.println("El mcm de " + num1 + " y " + num2 + " es " + calcularMcm(num1, num2));
			break;

		case 4:
			System.out.println("Hasta luego.");
			break;

		default:
			System.out.println("Error. Opción incorrecta");
			break;
		}

	}

	private static int solicitaOpcion() {
		System.out.println("Introduce una opción (1-3):");
		return Integer.parseInt(teclado.nextLine());
	}

	private static void mostrarMenu() {

		System.out.println("1. Calcular factorial de un número");
		System.out.println("2. Calcular mcd de dos números");
		System.out.println("3. Calcular el mcm de dos números");
		System.out.println("4. Salir");

	}

	private static long calcularFactorial(int num) {
		long factorial = 1;

		if (num >= 0)

			for (int numActual = num; numActual >= 1; numActual--) {
				factorial = factorial * numActual;
			}

		else
			factorial = -1;

		return factorial;
	}

	private static int calcularMcd(int num1, int num2) {
		int a, b, aux;
		System.out.println("Introduce");
		a = Integer.parseInt(teclado.nextLine());
		b = Integer.parseInt(teclado.nextLine());

		while (b != 0) { // método de euclides
			aux = b;
			b = a % b;
			a = aux;

		}

		return a;
	}

	private static int calcularMcm(int num1, int num2) {

		return 0;
	}

}
