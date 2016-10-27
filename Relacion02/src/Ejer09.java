import java.util.Scanner;

/**
 * 9. Realizar un programa que lea un número entero positivo y averigüe si es
 * perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
 * excepto él mismo. Realizar el programa de forma que si algún dato es
 * incorrecto vuelva a solicitarse Ejemplos:
 * 
 * El número 6 es perfecto porque es igual que 1+2+3=6
 * 
 * El número 8 no es perfecto porque 1+2+4= 7
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer09 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, sumaDivisores;

		do {
			System.out.println("Introduce un número positivo.");
			num = Integer.parseInt(teclado.nextLine());
		} while (num <= 0);

		sumaDivisores = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sumaDivisores += i;
		}
		if (num == sumaDivisores)
			System.out.println("El numero "+num+" es perfecto.");
		else
			System.out.println("El numero "+num+" no es perfecto.");
	}
}
