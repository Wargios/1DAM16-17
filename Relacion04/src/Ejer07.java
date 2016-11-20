/**
 * 7. Realizar un método llamado diaDe1laSemana al que se le pasen 3 parámetros
 * enteros:
 * 
 * • dia
 * 
 * • mes
 * 
 * • anno
 * 
 * El método debe devolver en un String el día de la semana que era esa fecha.
 * Para ello se tendrá en cuenta el siguiente algoritmo:
 * 
 * a = (14 - mes) / 12
 * 
 * y = anno – a
 * 
 * m = mes + 12 * a – 2
 * 
 * d = (día + y + y/4 - y/100 + y/400 + (31*m)/12) mod 7
 * 
 * Si el resultado de d es es un cero (0) era domingo, 1 para el lunes... 6 para
 * el sábado.
 * 
 * @author Francisco José González Jiménez
 *
 */

public class Ejer07 {

	public static void main(String[] args) {
		int dia, mes, anno;

		anno = Ejer06.solicitarAnno();
		mes = Ejer06.solicitarMes();
		dia = Ejer06.solicitarDia(mes, anno);

		System.out.println("Ese dia cae en " + calcularDiaDeLaSemana(dia, mes, anno) + ".");
	}

	private static String calcularDiaDeLaSemana(int dia, int mes, int anno) {
		int a, y, m, d;
		String diaDeLaSemana = "";

		a = (14 - mes) / 12;
		y = anno - a;
		m = mes + 12 * a - 2;
		d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

		switch (d) {
		case 0:
			diaDeLaSemana = "Domingo";
			break;
		case 1:
			diaDeLaSemana = "Lunes";
			break;
		case 2:
			diaDeLaSemana = "Martes";
			break;
		case 3:
			diaDeLaSemana = "Miércoles";
			break;
		case 4:
			diaDeLaSemana = "Jueves";
			break;
		case 5:
			diaDeLaSemana = "Viernes";
			break;
		case 6:
			diaDeLaSemana = "Sábado";
			break;
		}

		return diaDeLaSemana;
	}

}
