import java.util.Scanner;

/**
 * 13. Realizar un programa que solicita 10 direcciones web y para cada una de
 * ellas informe si es o no válida. Las direcciones validas deben tener el
 * formato http:// www.direccion.com
 * 
 * ó
 * 
 * http://www.direccion.es
 * 
 * Donde dirección puede contener letras o números, al menos 1, la primera una
 * letra .
 * 
 * Ejemplo direcciones válidas:
 * 
 * http://www.elmundo.es
 * 
 * http://www.a.com
 * 
 * http://www.marca2.com
 * 
 * Ejemplo direcciones inválidas
 * 
 * http://www.2a.es
 * 
 * http://www.el mundo.es
 * 
 * http://www.com
 * 
 * h://www.elmundo.es
 * 
 * @author Wargios
 *
 */
public class Ejer13 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String direccion = solicitarDirecccion();

		if (comprobarDireccion(direccion))
			System.out.println("La direccion es válida.");
		else
			System.out.println("La direccion no es válida.");

	}

	private static String solicitarDirecccion() {

		System.out.println("Introduce una dirección web:");

		return teclado.nextLine();

	}

	private static boolean comprobarDireccion(String direccion) {

		String inicio = "http://www.";
		String fin1 = ".es";
		String fin2 = ".com";
		String parteIntermedia;
		String finalDireccion;
		boolean esCorrecta = false;

		if (direccion.indexOf(inicio) == 0) {

			finalDireccion = direccion.substring(direccion.lastIndexOf(".", direccion.length()));

			if (finalDireccion.equals(fin1) || finalDireccion.equals(fin2)) {

				// que no se solape si hay un solo punto EJ: http://www.es
				if (direccion.length() - finalDireccion.length() != inicio.length() - 1) {

					parteIntermedia = direccion.substring(inicio.length(),
							direccion.length() - finalDireccion.length());

					// si no está vacía
					if (parteIntermedia.length() != 0)
						esCorrecta = comprobarParteIntermedia(parteIntermedia);
					
				}
			}
		}

		return esCorrecta;

	}

	private static boolean comprobarParteIntermedia(String cadena) {

		boolean resul = true;

		// si el primer caracter no es un número
		if (!Character.isDigit(cadena.charAt(0))) {

			for (int i = 0; i < cadena.length(); i++) {

				// si algun caracter es letra o numero
				if (!Character.isLetterOrDigit(cadena.charAt(i)))

					resul = false;

			}

		}

		return resul;
	}

}
