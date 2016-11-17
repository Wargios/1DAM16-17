import java.util.Scanner;

/**
 * 3. Realizar un método que informe de si un año es o no bisiesto. Un año es
 * bisiesto si es múltiplo de 4, a excepción de los que siendo múltiplos de 4
 * son múltiplos de 100 y no de 400. Probarlo desde el main.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer03 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduce un año para saber si es bisiesto:");
		if (esBisisesto(Integer.parseInt(teclado.nextLine()))) 
			System.out.println("Es bisiesto.");
		else
			System.out.println("No es bisitesto.");
	}

	private static boolean esBisisesto(int anno) {
		boolean resul = false;

		if (anno % 4 == 0) {
			resul = true;
			if (anno % 100 == 0 && anno % 400 != 0) {
				resul = false;
			}
		}
		
		return resul;
	}
}
