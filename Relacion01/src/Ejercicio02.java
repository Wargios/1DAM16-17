import java.util.Scanner;

/**
 * 2. Realizar un programa que solicite dos números por teclado e imprima en
 * pantalla si son iguales, el primero mayor que el segundo o el primero más
 * pequeño que el segundo.
 * 
 * @author alumnodiurno
 *
 */

public class Ejercicio02 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;

		System.out.println("Introduce 2 numeros");
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());

		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			if (num1 < num2) {
				System.out.println(num1 + " es menor que " + num2);
			} else {
				System.out.println(num1 + " es mayor que " + num2);
			}
		}
	}
}
