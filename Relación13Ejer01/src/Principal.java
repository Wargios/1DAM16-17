import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ejercicio 1 Realizar un programa que presente el siguiente menú:
 * 
 * 1. Crear directorio: Se solicitará un nombre de directorio y se intentará
 * crear en el directorio actual. Si ya existe el fichero se mostrará un mensaje
 * de error. Se mostrará un mensaje de si se ha podido crear o no correctamente.
 * 
 * 2. Crear fichero de texto: Se solicitará el nombre del fichero y se creará un
 * fichero de texto que contenga una cadena de caracteres solicitada por
 * teclado. Si ya existe un fichero con ese nombre se mostrará un mensaje de
 * error.
 * 
 * 3. Borrar fichero de texto: Se solicitará el nombre del fichero y se borrará.
 * Se mostrará un mensaje si no se ha podido borrar.
 * 
 * 4. Salir.
 * 
 * @author Wargios
 *
 */
public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int op;

		do {
			mostrarMenu();
			op = solicitarInt("Introduce una opción: ");
			tratarMenu(op);
		} while (op != 4);

	}

	private static void tratarMenu(int op) {
		
		switch (op) {
		case 1:
			crearDirectorio();
			break;

		case 2:
			crearFichero();
			break;

		case 3:
			borrarFichero();
			break;

		case 4:
			System.out.println("Adiós");
			break;

		default:
			System.out.println("Opción incorrecta");
			break;
		}

	}

	private static String solicitarString(String msg) {
		System.out.println(msg);
		return teclado.nextLine();

	}

	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Crear directorio");
		System.out.println("2. Crear fichero de texto");
		System.out.println("3. Borrar fichero de texto");
		System.out.println("4. Salir");

	}

	private static int solicitarInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());

	}

	private static void crearDirectorio() {
		String nombre;
		boolean creado;
		File fichero;

		nombre = solicitarString("Introduce el nombre del directorio: ");
		fichero = new File(nombre);
		if (fichero.exists())
			System.out.println("Ya existe el directorio");
		else {
			creado = fichero.mkdirs();
			if (creado)
				System.out.println("Directorio creado");
			else
				System.out.println("No se pudo crear el directorio");
		}
	}

	private static void crearFichero() {
		String nombre, contenido;

		nombre = solicitarString("Introduce el nombre del archivo: ");

		File fichero = new File(nombre);

		if (fichero.exists() && fichero.isFile())
			System.out.println("El archivo ya existe.");

		else {
			contenido = solicitarString("Introduce la cadena de texto: ");

			try {
				FileWriter flujoEscritura = new FileWriter(fichero);
				PrintWriter filtroEscritura = new PrintWriter(flujoEscritura);

				filtroEscritura.print(contenido);

				filtroEscritura.close();
				flujoEscritura.close();
				System.out.println("Fichero creado correctamente");

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void borrarFichero() {
		String nombre;

		nombre = solicitarString("Introduce el nombre del archivo a borrar: ");

		File fichero = new File(nombre);
		if (!(fichero.exists() && fichero.isFile())) 
			System.out.println("No esxite el archivo");

		else{
			fichero.delete();
			System.out.println("Archivo borrado");
		}
	}

}
