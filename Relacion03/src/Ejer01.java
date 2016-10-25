import java.util.Scanner;

/**
 * 1. Realizar un programa que solicite 3 números cualesquiera y los muestre por
 * pantalla ordenados de menor a mayor.
 * 
 * @author Fco J. Glez
 *
 */
public class Ejer01 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int aux;
		System.out.println("Introduce 3 numeros");
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		num3 = Integer.parseInt(teclado.nextLine());

		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}

		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}

		System.out.println(num1 + " < " + num2 + " < " + num3);
	}
}
