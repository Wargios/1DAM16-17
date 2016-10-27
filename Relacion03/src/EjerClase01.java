import java.util.Scanner;

/**
 * Solicitar un numero positivo e informe cuanto suman sus cifras
 * 
 * @author alumnodiurno
 *
 */
public class EjerClase01 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, sumaCifras, numActual;

		do {
			num = Integer.parseInt(teclado.nextLine());
			numActual = num;
		} while (num <= 0);

		sumaCifras = 0;

		while (numActual != 0) {
			sumaCifras = sumaCifras + (numActual % 10);
			numActual = numActual / 10;

		}
		System.out.println("Al numero " + num + " le suman las cifras un total de " + sumaCifras + ".");
	}

}
