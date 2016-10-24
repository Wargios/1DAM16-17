import java.util.Scanner;

/**
 * 5. Realizar un programa que solicite números hasta que se introduzca un
 * número negativo. Cuando termine informará de cuantos números positivos se han
 * introducido.
 * 
 * Ejemplo:
 * 
 * Introduce un número ( negativo para terminar): 4
 * 
 * Introduce un número (negativo para terminar): 8
 * 
 * Introduce un número (negativo para terminar): -2
 * 
 * Has introducido 2 numeros positivos
 * 
 * @author Wargios
 *
 */
public class Ejer05 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, contadorPositivos = 0;

		do {
			num = Integer.parseInt(teclado.nextLine());

			if (num > 0) // Así no contamos al 0 como positivo
				contadorPositivos++;
			System.out.println(contadorPositivos);
			
		} while (num >= 0);
		System.out.println("Total números positivos: " + contadorPositivos);
	}
}
