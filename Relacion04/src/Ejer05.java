import java.util.Scanner;

/**
 * 5. Realizar un método llamado pintarNuevaHora al que se le pasen 4 parámetros
 * enteros:
 * 
 * • horaActual
 * 
 * • minutosActuales
 * 
 * • segundosActuales
 * 
 * • segundosASumar
 * 
 * El método no devuelve nada y debe mostrar dos mensajes:
 * 
 * La hora anterior era H: M: S
 * 
 * La nueva hora es H: M: S
 * 
 * El método supondrá que los datos de entrada son correctos. Esta validación de
 * datos se realizará desde el main. Probar el método desde el main.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer05 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int horasActuales, minutosActuales, segundosActuales, segundosASumar;
		horasActuales = solicitarHoras();
		minutosActuales = solicitarMinutos();
		segundosActuales = solicitarSegundos();
		segundosASumar = solicitarSegundosASumar();
		pintarNuevaHora(horasActuales, minutosActuales, segundosActuales, segundosASumar);

	}

	private static int solicitarSegundosASumar() {
		int num;
		System.out.println("Introduce los segundos a sumar: (debe ser positivo)");
		do {
			num = Integer.parseInt(teclado.nextLine());
		} while (num < 0);
		return num;
	}

	private static int solicitarSegundos() {
		int num;

		do {
			System.out.println("Introduce los segundos: (0-59)");
			num = Integer.parseInt(teclado.nextLine());
		} while (num < 0 || num > 59);
		return num;
	}

	private static int solicitarMinutos() {
		int num;

		do {
			System.out.println("Introduce los minutos: (0-59)");
			num = Integer.parseInt(teclado.nextLine());
		} while (num < 0 || num > 59);
		return num;
	}

	private static int solicitarHoras() {
		int num;

		do {
			System.out.println("Introduce las horas: (0-23)");
			num = Integer.parseInt(teclado.nextLine());
		} while (num < 0 || num > 23);
		return num;
	}

	private static void pintarNuevaHora(int horasActuales, int minutosActuales, int segundosActuales,
			int segundosASumar) {
		segundosActuales += segundosASumar;

		while (segundosActuales >= 60) {
			segundosActuales -= 60;
			minutosActuales++;
		}
		while (minutosActuales >= 60) {
			minutosActuales -= 60;
			horasActuales++;
		}
		while (horasActuales >= 24) {
			horasActuales -= 24;
		}

		System.out.println(
				"La hora resultado es " + horasActuales + ":" + minutosActuales + ":" + segundosActuales + ".");

	}

}
