/**
 * 8. Realizar un método llamado diaDelaSemanaDespues que se le pasen 3
 * parámetros enteros:
 * 
 * • dia
 * 
 * • mes
 * 
 * • anno
 * 
 * El método debe devolver en un String el día de la semana que era en la fecha
 * siguiente a la que se indica.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer08 {
	public static void main(String[] args) {
		int dia, mes, anno;

		anno = Ejer06.solicitarAnno();
		mes = Ejer06.solicitarMes();
		dia = Ejer06.solicitarDia(mes, anno);

		System.out.println("Ese dia siguente cae en " + calcularDiaDeLaSemanaDespues(dia, mes, anno) + ".");
	}

	private static String calcularDiaDeLaSemanaDespues(int dia, int mes, int anno) {
		int a, y, m, d;
		String diaDeLaSemana = "";

		a = (14 - mes) / 12;
		y = anno - a;
		m = mes + 12 * a - 2;
		d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

		d++;

		switch (d) {

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
		case 7:
			diaDeLaSemana = "Domingo";
			break;
		}

		return diaDeLaSemana;
	}

}
