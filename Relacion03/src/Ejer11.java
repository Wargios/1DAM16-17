import java.util.Scanner;

/**
 * 10. Realizar un programa utilizando bucles, que muestre la siguiente figura
 * por pantalla:
 *
 * // *
 * 
 * // * *
 * 
 * // * * *
 * 
 * // * * * *
 * 
 * 
 * 11. Repetir el ejercicio anterior, pero indicando por pantalla la longitud de
 * la altura del triángulo (base = altura).
 * 
 * @author alumnodiurno
 *
 */
public class Ejer11 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		do {
			num = Integer.parseInt(teclado.nextLine());
		} while (num<=0);
		
		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
