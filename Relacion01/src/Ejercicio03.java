import java.util.Scanner;

/**
 * 3. Realizar un programa que lea un número por teclado. El programa debe
 * imprimir en pantalla un mensaje con “El número xx es múltiplo de 2” o un
 * mensaje con “El número xx es múltiplo de 3”. Si es múltiplo de 2 y de 3 deben
 * aparecer los dos mensajes. Si no es múltiplo de ninguno de los dos el
 * programa finaliza sin mostrar ningún mensajes.
 * 
 * @author alumnodiurno
 *
 */

public class Ejercicio03 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num;

		System.out.println("Introduce un número");
		num = Integer.parseInt(teclado.nextLine());

		if (num % 2 == 0)
			System.out.println(num + " es mútiplo de 2");
		if (num % 3 == 0)
			System.out.println(num + " es mútiplo de 3");

	}
}
