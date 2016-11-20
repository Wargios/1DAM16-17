import java.util.Scanner;

/**
 * 6. Realizar un método llamado siguienteFecha al que se le pasen 3 parámetros
 * enteros:
 * 
 * • diaActual
 * 
 * • mesActual
 * 
 * • annoActual
 * 
 * El método no devuelve nada y debe mostrar dos mensajes:
 * 
 * La fecha de hoy es D-M-A
 * 
 * La fecha de mañana es D-M-A
 * 
 * El método supondrá que los datos de entrada son correctos. Esta validación de
 * datos se realizará desde el main. Probar el método desde el main.
 * 
 * @author alumnodiurno
 *
 */

public class Ejer06 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int diaActual, mesActual, annoActual;

		annoActual = solicitarAnno();
		mesActual = solicitarMes();
		diaActual = solicitarDia(mesActual, annoActual);

		System.out.println("La fecha de hoy es " + diaActual + "-" + mesActual + "-" + annoActual);

		mostrarDiaSiguiente(annoActual, mesActual, diaActual);

	}

	private static void mostrarDiaSiguiente(int anno, int mes, int dia) {
		int maxDias = Ejer04.diasDeUnMes(mes, anno);
		dia++;
		if (dia > maxDias) {
			dia -= maxDias;
			mes++;
			if (mes > 12) {
				mes -= 12;
				anno++;
			}
		}
		System.out.println("La fecha de hoy es " + dia + "-" + mes + "-" + anno);

	}

	public static int solicitarDia(int mes, int anno) {
		int dia, maxDias;
		maxDias = Ejer04.diasDeUnMes(mes, anno);
		do {
			System.out.println("Introduce el dia: (1-" + maxDias + ")");
			dia = Integer.parseInt(teclado.nextLine());
		} while (dia < 1 || dia > maxDias);

		return dia;
	}

	public static int solicitarMes() {
		int mes;
		do {
			System.out.println("Introduce un mes:");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);

		return mes;
	}

	public static int solicitarAnno() {
		int anno;
		do {
			System.out.println("Introduce un año:");
			anno = Integer.parseInt(teclado.nextLine());
		} while (anno < 0);

		return anno;
	}

	

}
