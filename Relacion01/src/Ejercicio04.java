import java.util.Scanner;

/**
 * 4. Realizar un programa que lea la edad de una persona menor a 100 años e
 * informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-
 * 29) o un adulto.
 * 
 * @author alumnodiurno
 *
 */

public class Ejercicio04 {
	private static Scanner teclado = new Scanner(System.in);

	private static final int NINO = 12;
	private static final int ADOLESCENTE = 17;
	private static final int JOVEN = 29;

	public static void main(String[] args) {
		int edad;
		do {

			System.out.println("Introduce tu edad");
			edad = Integer.parseInt(teclado.nextLine());

		} while (edad < 0);

		if (edad <= NINO) {
			System.out.println("Eres un niño");
		} else {
			if (edad <= ADOLESCENTE) {
				System.out.println("Eres un adolescente");
			}else {
				if (edad <= JOVEN) {
					System.out.println("Eres un joven");
				}else {
					System.out.println("Eres un adulto");
				}
			}
		}
	}
}
