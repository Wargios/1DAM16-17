import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 2
 * 
 * Realizar un programa que solicite un nombre de un fichero de texto y realice
 * los siguiente:
 * 
 * Muestre por pantalla cuantas palabras tiene. Considerar que la palabra tiene
 * algún carácter alfanumérico y separada por un espacio o por un salto de línea
 * (salvo que sea la última).
 * 
 * Muestre por pantalla cuantas veces aparecen cada una de las vocales.
 * 
 * Solicite una palabra para buscarla en el fichero. Si encuentra la palabra en
 * el fichero debe escribir un fichero de texto con el resultado de la búsqueda
 * llamado “BuscandoPalabraXXXXX.txt”
 * 
 * El fichero contendrá las líneas y columnas donde se encontró la palabra, por
 * ejemplo:
 * 
 * Encontrada en línea 2 columna 7
 * 
 * Encontrada en línea 3 columna 1
 * 
 * @author alumnodiurno
 *
 */
public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroPalabras = 0;

		tratarContarPalabras(numeroPalabras);

		System.out.println("El número total de palabras es " + numeroPalabras);

	}

	private static void tratarContarPalabras(int numeroPalabras) {
		String nombre;
		String linea;
		nombre = solicitarString("Introduce el nombre del archivo: ");

		try {
			FileReader ficheroEntrada = new FileReader(nombre);
			BufferedReader filtroEntrada = new BufferedReader(ficheroEntrada);

			linea = filtroEntrada.readLine();

			while (linea != null) {
				numeroPalabras += cuentaPalabras(filtroEntrada.readLine());
				linea = filtroEntrada.readLine();
			}

			filtroEntrada.close();
			ficheroEntrada.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String solicitarString(String msg) {
		System.out.println(msg);
		return teclado.nextLine();

	}

	private static int cuentaPalabras(String cad) {
		int palabras = 0;
		boolean dentroPalabra = false;
		char caracter;

		for (int i = 0; i < cad.length(); i++) {

			caracter = cad.charAt(i);

			if (!Character.isWhitespace(caracter)) {

				if (!dentroPalabra) {

					dentroPalabra = true;
					palabras++;

				}

			} else {
				dentroPalabra = false;
			}
		}

		return palabras;
	}

}
