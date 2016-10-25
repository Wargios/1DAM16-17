import java.util.Scanner;

/**
 * 1. Realizar un programa que lea un número entero por teclado e informe de si
 * el número es par o impar (el cero se considera par).
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio01 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num;

		System.out.println("Introduce un número para saber si es par o impar");
		num = Integer.parseInt(teclado.nextLine());

		if (num % 2 == 0)
			System.out.println("El número " + num + " es par");
		else
			System.out.println("El número " + num + " es impar");
	}
}
