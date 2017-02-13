
public class Fecha {
	private static final String[] MESES = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };
	private int anno;
	private int mes;
	private int dia;

	public Fecha(int anno, int mes, int dia) throws FechaException {

		if (!fechaValida(anno, mes, dia))
			throw new FechaException("Error. Fecha incorrecta.");

		this.anno = anno;
		this.mes = mes;
		this.dia = dia;
	}

	public int getAnno() {
		return anno;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	private boolean fechaValida(int anno, int mes, int dia) {
		boolean resul = false;
		int totalDiasMes = calcularDiasMesAnio(mes, anno);

		if (dia > 0 && dia <= totalDiasMes)
			resul = true;

		return resul;
	}

	public static boolean comprobarBisiesto(int anio) {
		boolean esBisiesto = false;

		if (anio % 4 == 0) {
			esBisiesto = true;

			if (anio % 100 == 0 && anio % 400 != 0)
				esBisiesto = false;
		}

		return esBisiesto;
	}

	public static int calcularDiasMesAnio(int mes, int anio) {
		int dias;
		boolean esBisiesto;

		esBisiesto = comprobarBisiesto(anio);

		if (mes == 2) {
			if (!esBisiesto)
				dias = 28;
			else
				dias = 29;
		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
				dias = 30;
			else
				dias = 31;
		}
		return dias;
	}

	public String aFormatoLargo() {
		return dia + " de " + MESES[mes - 1] + " de " + anno;
	}

	@Override
	public String toString() {
		return (anno + " - " + mes + " - " + dia);
	}

}
