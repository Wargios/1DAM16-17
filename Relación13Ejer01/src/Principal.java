import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
			try {
				tratarMenu(op);
			} catch (IOException e) {
				System.out.println("Error.");
				// e.printStackTrace();
			}
		} while (op != 4);

	}

	private static void tratarMenu(int op) throws IOException {
		File directorio;
		FileWriter archivo;

		switch (op) {
		case 1:
			directorio = new File("/" + solicitarString("Introduce el nombre del directorio: ") + "/");
			System.out.println(directorio.isDirectory());
			break;

		case 2:
			archivo = new FileWriter(solicitarString("Introduce el nombre del directorio: "));
			archivo.write(solicitarString("Introduce el texto para el archivo: "));
			break;

		case 3:
			
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

}
