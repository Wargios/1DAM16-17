import java.util.Scanner;

/**
 * 7. Realizar un programa que solicite una cantidad de números que van a
 * pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
 * es la media de los números.
 * 
 * Realizar el programa de forma que si la cantidad es incorrecta vuelva a
 * solicitarse.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer07 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double media, suma, num;
		int cantidadNumeros;
		do {
			System.out.println("Introduce la cantidad de números que vas a introducir.");
			cantidadNumeros = Integer.parseInt(teclado.nextLine());
		} while (cantidadNumeros <= 0);

		suma = 0;
		for (int i = 0; i < cantidadNumeros; i++) {
			num = Integer.parseInt(teclado.nextLine());
			suma = suma + num;
		}
		media = suma / cantidadNumeros;
		System.out.println("La media total es " + media);
	}
}
