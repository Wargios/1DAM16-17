import java.util.Scanner;

/**
 * 6. Realizar un programa que solicite un carácter por teclado e informe por
 * pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
 * mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio06 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		char c;
		System.out.println("Introduce una letra");
		c = teclado.nextLine().toUpperCase().charAt(0);
		
		switch (c) {
		case 'A':
			System.out.println("Es la primera vocal");
			break;
		case 'E':
			System.out.println("Es la segunda vocal");
			break;
		case 'I':
			System.out.println("Es la tercera vocal");
			break;
		case 'O':
			System.out.println("Es la cuarta vocal");
			break;
		case 'U':
			System.out.println("Es la quinta vocal");
			break;
		default:
			System.out.println("No es una vocal");
			break;
		}
	}
}
