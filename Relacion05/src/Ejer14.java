import java.util.Scanner;

/**
 * 14. Escribir un programa para jugar al ahorcado. El usuario deberá ir
 * introduciendo letras y el programa deberá ir mostrando la palabra si la letra
 * está, o bien, anotando fallos si son incorrectas. El programa acaba si se
 * adivina la palabra o si se produce un total de 7 fallos. Nota: Para empezar
 * utilizaremos una única palabra secreta aunque mejoraremos el programa en el
 * siguiente tema para seleccionar una palabra aleatoriamente de entre un
 * conjunto de palabras.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer14 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int MAX_FALLOS = 7;

	public static void main(String[] args) {

		ahorcado();

	}

	private static void ahorcado() {
		int fallos = 0;
		String palabra = "CABEZA";
		StringBuilder sbPalabra = new StringBuilder(palabra.length());
		StringBuilder sbLetrasIntroducidas = new StringBuilder(27);
		char letra;

		for (int i = 0; i < palabra.length(); i++) {

			sbPalabra.append("_");

		}

		while (fallos < MAX_FALLOS && palabra != sbPalabra.toString()) {

			System.out.println("Introduce una letra");

			letra = teclado.nextLine().toUpperCase().charAt(0);

			if (sbLetrasIntroducidas.toString().indexOf(letra) != -1)
				sbLetrasIntroducidas.append(letra);

			if (palabra.indexOf(letra) == -1) {

				fallos++;

			}

		}
	}
}
