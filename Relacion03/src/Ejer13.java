import java.util.Scanner;

/**
 * 13.Realizar un programa que solicite un número impar comprendido entre 1 y 21
 * y que muestre un rombo por pantalla, siendo dicho número el ancho del rombo.
 * Ejemplo para el 7:
 * 
 * // ______*
 * 
 * // ____* * *
 * 
 * // __* * * * *
 * 
 * // * * * * * * *
 * 
 * // __* * * * *
 * 
 * // ____* * *
 * 
 * // ______*
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer13 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int anchoRombo, contadorAsteriscos, contadorEspacios, contadorSaltos;

		do {
			System.out.println("Introduce el ancho del rombo: (debe ser impar de 1 a 21)");
			anchoRombo = Integer.parseInt(teclado.nextLine());
		} while (anchoRombo < 0 || anchoRombo % 2 == 0||anchoRombo > 21);

		// Primera mitad
		
		for (contadorSaltos = 1; contadorSaltos <= anchoRombo; contadorSaltos += 2) {

			for (contadorEspacios = anchoRombo; contadorEspacios-contadorSaltos > 0; contadorEspacios-=2) {
				System.out.print("  ");
			}

			for (contadorAsteriscos = 0; contadorAsteriscos < contadorSaltos; contadorAsteriscos++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// Segunda mitad (tienen que empezar con una vuelta de más)
		
		for (contadorSaltos = 1; contadorSaltos <= anchoRombo; contadorSaltos += 2) {
			
			for (contadorEspacios = 1; contadorEspacios-contadorSaltos <= 0; contadorEspacios+=2) {
				System.out.print("  ");
			}
			
			for (contadorAsteriscos = anchoRombo-2; contadorAsteriscos >= contadorSaltos; contadorAsteriscos--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
