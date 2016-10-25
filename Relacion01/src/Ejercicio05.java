import java.util.Scanner;

/**
 * 5. Realizar un programa que solicite 4 números e imprima la media de los
 * números. También debe imprimir aquellos números que son superiores a la
 * media.
 * 
 * @author alumnodiurno
 *
 */

public class Ejercicio05 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		int suma;
		int media;
		
		System.out.println("Introduce 4 números");
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		num3 = Integer.parseInt(teclado.nextLine());
		num4 = Integer.parseInt(teclado.nextLine());

		suma = num1 + num2 + num3 + num4;
		media= suma/4;
		System.out.println("La media es "+media);
	}
}
