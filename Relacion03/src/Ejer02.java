import java.util.Scanner;

/**
 * 2. Realizar un programa que solicite dos números, base y exponente, enteros
 * positivos (incluido el 0), y que calcule la potencia (base elevado a
 * exponente) a través de productos. Si los datos son incorrectos deberán
 * volverse a solicitar.
 * 
 * @author Wargios
 *
 */
public class Ejer02 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int base, exponente, resultado = 1;
		do {
			System.out.println("Introduce la base:");
			base = Integer.parseInt(teclado.nextLine());
		} while (base < 0);

		do {
			System.out.println("Introduce el exponente:");
			exponente = Integer.parseInt(teclado.nextLine());
		} while (base < 0);
		if (base == 0 && exponente == 00) {
			System.out.println("No se puede hacer esta operacion ");
		} else {
			for (int i = 0; i < exponente; i++) {
				resultado = resultado * base;
			}
			System.out.println("El resultado es " + resultado);
		}
	}
}
