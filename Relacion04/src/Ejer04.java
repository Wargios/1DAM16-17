import java.util.Scanner;

/**
 * 4. Realizar un método llamado diasDeUnMes que tenga como entrada un número de
 * mes (entre 1 y 12) y un año y devuelva el número de días de ese mes y año.
 * Usar el método anterior para cuando el año sea bisiesto, febrero tenga 29
 * días. 30 31 28/29frebrero
 * 
 * @author alumnodiurno
 *
 */
public class Ejer04 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int dias, mes, anno;

		anno = solicitarAnno();
		mes = solicitarMes();

		dias = diasDeUnMes(mes, anno);

		System.out.println("Este mes tiene " + dias + " días");
	}

	private static int solicitarMes() {
		int mes;
		do {
			System.out.println("Introduce un mes:");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);
		
		
		return mes;
	}

	private static int solicitarAnno() {
		int anno;
		do {
			System.out.println("Introduce un año:");
			anno = Integer.parseInt(teclado.nextLine());
		} while (anno < 0);
		
		return anno;
	}

	private static int diasDeUnMes(int mes, int anno) {
		int dias;

		if (mes <= 7) { // Diás del 1 al 7

			if (mes % 2 != 0) {// impares
				dias = 31;

			} else// pares
				dias = 30;

		} else { // Dias del 8 al 12

			if (mes % 2 != 0) {// impares
				dias = 30;

			} else { // pares
				dias = 31;
				if (mes == 2) { // solo febrero
					dias = 28;
					if (esBisisesto(anno)) {
						dias++;
					}
				}
			}
		}
		return dias;
	}

	private static boolean esBisisesto(int anno) {
		boolean resul = false;

		if (anno % 4 == 0) {
			resul = true;
			if (anno % 100 == 0 && anno % 400 != 0) {
				resul = false;
			}
		}

		return resul;
	}

}
