import java.util.Scanner;

/**
 * 7. Realizar un programa que lea el estado civil de una persona (S-Soltero, C-
 * Casado, V-Viudo y D-Divorciado) y su edad. Después debe mostrar por pantalla
 * el porcentaje de retención que debe aplicársele de acuerdo con las siguientes
 * reglas: -A los solteros o divorciados menores de 35 años, un 12% -Todas las
 * personas mayores de 50 años, un 8.5% -A los viudos o casados menores de 35
 * años, un 11.3% -Al resto de casos se le aplica un 10.5%
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio07 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int LIMITE_EDAD1 = 35;
	private static final int LIMITE_EDAD2 = 50;
	private static final double PORCENTAJE1 = 12;
	private static final double PORCENTAJE2 = 8.5;
	private static final double PORCENTAJE3 = 11.3;
	private static final double PORCENTAJE4 = 10.5;

	public static void main(String[] args) {
		int edad;
		char c;
		double porcentaje;

		do {
			System.out.println("Introduce el estado civil (S-Soltero, C- Casado, V-Viudo y D-Divorciado)");
			c = teclado.nextLine().toUpperCase().charAt(0);
		} while (c != 'S' && c != 'C' && c != 'V' && c != 'D');
		do {
			System.out.println("Introduce la edad");
			edad = Integer.parseInt(teclado.nextLine());
		} while (edad < 0 || edad > 100);

		if (edad > LIMITE_EDAD2) {
			porcentaje = PORCENTAJE2;
		} else {
			if (edad > LIMITE_EDAD1) {
				porcentaje = PORCENTAJE4;
			} else {
				if (c == 'S' || c == 'D') {
					porcentaje = PORCENTAJE1;
				} else {
					porcentaje = PORCENTAJE3;
				}
			}
		}
		System.out.println("Su porcentaje es " + porcentaje);
	}
}
