import java.util.Scanner;

/**
 * 7. Realizar un programa que solicite dos números enteros mayores que 0, que
 * calcule el máximo común divisor entre ellos mediante el algoritmo de Euclides
 * y que muestre por pantalla el resultado. El algoritmo de Euclides se explica
 * a continuación con un ejemplo:
 * 
 * Supongamos que queremos calcular el m.c.d de 120 y 54
 * 
 * 120 : 54 = 2 y resto 12
 * 
 * 54 : 12 = 4 y resto 6
 * 
 * 12: 6 = 2 y resto 0
 * 
 * El m.c.d. de 120 y 54 es 6
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer07 {
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

		}
		System.out.println(a);

	}
}
