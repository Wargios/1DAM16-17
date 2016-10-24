import java.util.Scanner;

/**
 * 6. Realizar un programa que lea dos números enteros cualesquiera numeroA y
 * numeroB, y calcule el producto de A y B mediante sumas (es decir sin usar el
 * operador *).
 * 
 * @author Wargios
 *
 */
public class Ejer06 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numA, numB, resultado = 0, signo = 1;

		System.out.println("Introduce 2 números a multiplicar");
		numA = Integer.parseInt(teclado.nextLine());
		numB = Integer.parseInt(teclado.nextLine());

		if (numA < 0) {
			signo = signo * -1;
		}

		if (numB < 0) {
			signo = signo * -1;
		}

		for (int i = 0; i < numB; i++) {
			resultado = resultado + numA;
		}
		resultado = resultado * signo;
		System.out.println("El resultado es " + resultado);
	}
}
