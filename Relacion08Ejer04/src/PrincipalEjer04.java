import java.util.Scanner;

/**
 * 4. Realizar un programa que solicite la fecha como tres datos numéricos (día,
 * mes y año). Deberá mostrar la fecha en formato largo.
 * 
 * Introduce el día de la fecha: 15
 * 
 * Introduce el mes de la fecha: 3
 * 
 * Introduce el año de la fecha: 2009
 * 
 * La fecha en formato largo es 15 de Marzo de 2009
 * 
 * Si la fecha introducida es incorrecta se mostrará un mensaje de error: “Fecha
 * incorrecta” y el programa terminará.
 * 
 * Crear la clase Fecha e incluir el método pasarAformatoLargo que devuelva una
 * cadena con formato largo.
 * 
 * NOTAS:
 * 
 * • Para guardar los meses del año, utilizar un array de String.
 * 
 * • Utilizar el método diasDeUnMes que devuelve el número de días de un mes
 * (Relación 4, ejercicio 4).
 * 
 * • Se deben tratar los errores con Excepciones.
 * 
 * @author Wargios
 *
 */
public class PrincipalEjer04 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Fecha fecha;
		int dia, mes , anno;
		
		dia  = solicitarDia();
		mes = solicitarMes();
		anno = solicitarAnio();
		try {
			fecha = new Fecha(anno, mes, dia);
			System.out.println("La fecha en formato largo es " + fecha.aFormatoLargo());
		} catch (FechaException e) {
			System.out.println(e.getMessage());
		}

	}

	public static int solicitarAnio() {
		int anio;

		do {
			System.out.println("Introduce el año de la fecha: ");
			anio = Integer.parseInt(teclado.nextLine());
		} while (anio < 0);

		return anio;
	}

	private static int solicitarMes() {
		int mes;

		do {
			System.out.println("Introduce el mes de la fecha: ");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);

		return mes;
	}
	
	private static int solicitarDia() {
		int dia;

		do {
			System.out.println("Introduce el día de la fecha: ");
			dia = Integer.parseInt(teclado.nextLine());
		} while (dia < 1 || dia > 31);

		return dia;
	}
}
