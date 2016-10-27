import java.util.Scanner;

/**
 * 8. Realizar un programa que solicite un conjunto de números. Después de
 * introducir cada número se realizará la pregunta ¿Desea introducir más números
 * (S/N). Si la respuesta es 'S' se solicitará otro número Una vez que no desee
 * introducir más números debe informar cual es el menor de los números
 * introducidos.
 * 
 * NOTA: Debe comprobarse que la respuesta es 'S' o 'N' y si no lo es, volver a
 * pedirla
 * 
 * @author alumnodiurno
 *
 */
public class Ejer08 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, numeroMenor = 999999999;
		char repetir = 0;

		do {

			System.out.println("Introduce un numero");
			num = Integer.parseInt(teclado.nextLine());
			
			if (num < numeroMenor)
				numeroMenor = num;

			do {
				System.out.println("Vas a introducir otro número ('S' o 'N')");
				num = teclado.nextLine().charAt(0);
			} while (!(repetir == 'S' || repetir == 'N'));

		} while (repetir == 'S');
	}
}
