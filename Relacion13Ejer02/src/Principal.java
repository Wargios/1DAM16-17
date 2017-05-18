import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
		int numeroPalabras;
		String archivoEntrada, palabra, archivoSalida;

		archivoEntrada = solicitarString("Introduce el nombre del archivo: ");
		numeroPalabras = contarPalabrasEnArchivo(archivoEntrada);

		System.out.println("El número total de palabras es " + numeroPalabras);

		contarVocalesEnArchivo(archivoEntrada);

		palabra = solicitarString("Introduce la palabra a buscar: ");
		archivoSalida = "BuscandoPalabra" + palabra + ".txt";

		encuentraPalabraEnArchivo(archivoEntrada, palabra, archivoSalida);

	}

	private static void contarVocalesEnArchivo(String nombreArchivo) {
		System.out.println("A: " + contarLetraEnArchivo(nombreArchivo, 'a'));
		System.out.println("E: " + contarLetraEnArchivo(nombreArchivo, 'e'));
		System.out.println("I: " + contarLetraEnArchivo(nombreArchivo, 'i'));
		System.out.println("O: " + contarLetraEnArchivo(nombreArchivo, 'o'));
		System.out.println("U: " + contarLetraEnArchivo(nombreArchivo, 'u'));
	}

	private static String solicitarString(String msg) {
		System.out.println(msg);

		return teclado.nextLine();
	}

	private static boolean encuentraPalabraEnArchivo(String archivoEntrada, String palabra, String archivoSalida) {

		boolean encontrado = false;
		int fila = 0, columna;
		String linea;

		try {
			FileReader ficheroEntrada = new FileReader(archivoEntrada);
			BufferedReader filtroEntrada = new BufferedReader(ficheroEntrada);

			linea = filtroEntrada.readLine();

			while (linea != null) {
				fila++;
				columna = buscarPalabraEnString(linea, palabra);

				if (columna != -1) {
					FileWriter flujoEscritura = new FileWriter(archivoSalida, true);
					PrintWriter filtroEscritura = new PrintWriter(flujoEscritura);

					filtroEscritura.println("Encontrada en línea " + fila + " columna " + columna);

					filtroEscritura.close();
					flujoEscritura.close();

				}
				linea = filtroEntrada.readLine();
			}

			filtroEntrada.close();
			ficheroEntrada.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return encontrado;

	}

	private static int buscarPalabraEnString(String linea, String palabra) {
		int pos;

		pos = linea.indexOf(palabra);

		return pos;
	}

	private static int contarPalabrasEnArchivo(String nombre) {
		int numeroPalabras = 0;
		String linea;

		try {
			FileReader ficheroEntrada = new FileReader(nombre);
			BufferedReader filtroEntrada = new BufferedReader(ficheroEntrada);

			linea = filtroEntrada.readLine();

			while (linea != null) {
				numeroPalabras += contarPalabrasEnString(filtroEntrada.readLine());
				linea = filtroEntrada.readLine();
			}

			filtroEntrada.close();
			ficheroEntrada.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numeroPalabras;
	}

	private static int contarPalabrasEnString(String cad) {
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

	private static int contarLetraEnArchivo(String nombreArchivo, char letra) {

		int numeroLetra = 0;
		String linea;

		try {
			FileReader ficheroEntrada = new FileReader(nombreArchivo);
			BufferedReader filtroEntrada = new BufferedReader(ficheroEntrada);

			linea = filtroEntrada.readLine();

			while (linea != null) {
				numeroLetra += contarLetraEnString(filtroEntrada.readLine(), letra);
				linea = filtroEntrada.readLine();
			}

			filtroEntrada.close();
			ficheroEntrada.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return numeroLetra;

	}

	private static int contarLetraEnString(String cad, char letra) {
		int contador = 0;
		char caracter;

		for (int i = 0; i < cad.length(); i++) {

			caracter = cad.charAt(i);

			if (caracter == Character.toLowerCase(letra) || caracter == Character.toUpperCase(letra)) {

				contador++;

			}
		}

		return contador;
	}

}