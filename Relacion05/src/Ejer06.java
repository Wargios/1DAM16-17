import java.util.Scanner;

/**
 * 6. Diseñar un programa que determine la cantidad de vocales diferentes, que
 * tiene una palabra o frase introducida por teclado. Por ejemplo, la cadena
 * “Abaco”, devolvería 2.
 * 
 * 
 * @author Francisco José González Jiménez
 *
 */

public class Ejer06 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce una frase para saber cuantas vocales diferentes tiene:");
		System.out.println("El texto contiene " + contarDiferentesVocales(teclado.nextLine()) + " vocales diferentes.");
	}

	private static int contarDiferentesVocales(String cad) {
		int contador = 0;
		String vocales = "aeiou";

		cad = cad.toLowerCase();

		for (int i = 0; i < vocales.length(); i++) {
			if (cad.indexOf(vocales.charAt(i)) >= 0)
				contador++;
		}
		
		// if (cad.indexOf('a') >= 0)
		// contador++;
		// if (cad.indexOf('e') >= 0)
		// contador++;
		// if (cad.indexOf('i') >= 0)
		// contador++;
		// if (cad.indexOf('o') >= 0)
		// contador++;
		// if (cad.indexOf('u') >= 0)
		// contador++;

		return contador;
	}
}
