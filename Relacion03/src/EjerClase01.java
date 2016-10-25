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
		int num, totalcifras, numActual;

		num = Integer.parseInt(teclado.nextLine());
		numActual = num;

		totalcifras = 1;
		while (numActual / 10 != 0) {
			numActual = numActual / 10;
			totalcifras++;
		}
		System.out.println("El numero " + num + " tiene " + totalcifras + " cifras.");
	}

}
