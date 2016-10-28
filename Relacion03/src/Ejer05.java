import java.util.Scanner;

/**
 * 5. Realizar un programa que solicite un número e informe de si es o no primo.
 * Un número es primo si entre sus divisores sólo está él mismo y el número 1.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer05 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, contador;
		boolean esprimo;

		esprimo = true;
		num = Integer.parseInt(teclado.nextLine());
		contador = num / 2;

		while (esprimo && contador > 2) {
			contador--;
			if (num % contador == 0) {
				esprimo = false;
			}
		}
		if (esprimo)
			System.out.println("El numero " + num + " es primo");
		else
			System.out.println("El numero " + num + " no es primo");
	}

}
