import java.util.Scanner;

/**
 * 10.Realizar un programa que solicite un número entero positivo o cero y
 * calcule su factorial. Realizar el programa de forma que si algún dato es
 * incorrecto vuelva a solicitarse.
 * 
 * Factorial (0)=1
 * 
 * Factorial (1)=1
 * 
 * Factorial (N)=N* (N-1)* (N-2)* …......1
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer10 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, factorial;

		do {
			System.out.println("Introduzca un número mayor o igual que 0: ");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero < 0);

		factorial = 1;
		for (int i = 2; i <= numero; i++) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + numero + " es " + factorial);

	}
}
