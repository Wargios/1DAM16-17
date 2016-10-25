import java.util.Scanner;

/**
 * 3. Realizar un programa que solicite un número entero y determine el número
 * de cifras que tiene dicho número.
 * 
 * Ejemplo:
 * 
 * Introduce un número: 124
 * 
 * El número 124 tiene 3 cifras
 * 
 * @author alumnodiurno
 *
 */
public class Ejer03 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, totalcifras, numActual;

		num = Integer.parseInt(teclado.nextLine());
		numActual = num;
		
		totalcifras = 1
				;
		while(numActual / 10 != 0){
			numActual = numActual/10;
			totalcifras++;
		}
		System.out.println("El numero " + num + " tiene " + totalcifras + " cifras.");
	}
}
