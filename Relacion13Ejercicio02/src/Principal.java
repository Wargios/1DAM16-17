import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	private static Scanner teclado = new Scanner(System.in);
	private static char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
	private static int[] contadorVocales = new int[vocales.length];

	public static void main(String[] args) {

		String nombreFichero, palabra;

		System.out.println("Introduce el nombre del fichero");
		nombreFichero = teclado.nextLine();

		try {

			// Contar palabras del fichero
			contarPalabrasYVocales(nombreFichero);

			System.out.println("Introduce una palabra a buscar: ");
			palabra = teclado.nextLine();
			busquedaPalabraEnFichero(nombreFichero, palabra);

		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero " + nombreFichero);
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + nombreFichero);
		}

	}

	private static void busquedaPalabraEnFichero(String nombreFichero, String palabra) throws IOException {

		String linea;
		int numeroDeLinea =1, columna;
		String nombreFicheroResultado = "BuscandoPalabra" + palabra + ".txt";

		FileReader flujoEntrada = new FileReader(nombreFichero);
		BufferedReader filtroEntrada = new BufferedReader(flujoEntrada);

		FileWriter flujoSalida = new FileWriter(nombreFicheroResultado);
		PrintWriter filtroSalida = new PrintWriter(flujoSalida);

		linea = filtroEntrada.readLine();
		while (linea != null) {
			columna = linea.indexOf(palabra);
			if (columna != -1) {
				filtroSalida.println("Encontrada en linea " + numeroDeLinea + " columna " + (columna +1));
			}

			linea = filtroEntrada.readLine();
			numeroDeLinea++;
		}
		filtroEntrada.close();
		flujoEntrada.close();

		filtroSalida.close();
		flujoSalida.close();
		System.out.println("Fichero " + nombreFicheroResultado + " creado correctamente.");

	}

	private static void contarPalabrasYVocales(String nombreFichero) throws IOException {
		int numeroPalabras = 0;
		String linea;

		FileReader flujoEntrada = new FileReader(nombreFichero);
		BufferedReader filtroEntrada = new BufferedReader(flujoEntrada);

		linea = filtroEntrada.readLine();
		while (linea != null) {
			numeroPalabras = numeroPalabras + contarPalabrasCadena(linea);
			linea = filtroEntrada.readLine();
		}
		filtroEntrada.close();
		flujoEntrada.close();

		System.out.println("El numero de palabras del fichero es " + numeroPalabras);

		imprimirVectorVocales();

	}

	private static void imprimirVectorVocales() {
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("La vocal " + vocales[i] + " aparece " + contadorVocales[i] + " veces");
		}
	}

	private static int contarPalabrasCadena(String cad) {

		int i;
		int numeroDePalabras = 0;
		char caracter;
		boolean hayPalabra = false;

		for (i = 0; i < cad.length(); i++) {
			caracter = cad.charAt(i);

			contarVocales(caracter);

			if (Character.isAlphabetic(caracter) || Character.isDigit(caracter)) {
				hayPalabra = true;
			} else {
				if (caracter == ' ' && hayPalabra) {

					hayPalabra = false;
					numeroDePalabras++;
				}
			}

		}

		if (hayPalabra)
			numeroDePalabras++;

		return numeroDePalabras;
	}

	private static void contarVocales(char caracter) {

		int i = 0;
		boolean encontrado = false;
		caracter = Character.toUpperCase(caracter);

		while (i < vocales.length && !encontrado) {
			if (vocales[i] == caracter) {
				contadorVocales[i]++;
				encontrado = true;
			}
			i++;

		}
	}

}
