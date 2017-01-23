
public class Maquina {

	private static final int MAXIMO_CAFE = 50;
	private static final int MAXIMO_LECHE = 50;
	private static final int MAXIMO_VASOS = 80;
	public static final double PRECIO_CAFE = 1;
	public static final double PRECIO_LECHE = 0.8;
	public static final double PRECIO_CAFE_CON_LECHE = 1.5;

	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;

	Maquina(double dineroInicial) throws MaquinaException {
		llenardepositos();
		setMonedero(dineroInicial);
	}

	public int getDepositoCafe() {
		return depositoCafe;
	}

	public int getDepositoLeche() {
		return depositoLeche;
	}

	public int getDepositoVasos() {
		return depositoVasos;
	}

	public double getMonedero() {
		return monedero;
	}

	private void setMonedero(double monedero) throws MaquinaException {
		if (monedero <= 0) {

			throw new MaquinaException("ERROR. No puede tener el monedero negativo");

		} else

			this.monedero = monedero;

	}

	public void llenardepositos() {
		depositoCafe = MAXIMO_CAFE;
		depositoLeche = MAXIMO_LECHE;
		depositoVasos = MAXIMO_VASOS;
	}

	public double servirCafe(double dinero) throws MaquinaException {
		double cambio = 0;

		if (dinero < PRECIO_CAFE)

			throw new MaquinaException("ERROR. Te falta dinero");
		cambio = dinero - PRECIO_CAFE;

		if (cambio > monedero)

			throw new MaquinaException("ERROR. No hay suficiente cambio");

		if (depositoVasos == 0)

			throw new MaquinaException("ERROR. No hay vasos");

		if (depositoCafe == 0)

			throw new MaquinaException("ERROR. No hay café");

		depositoCafe--;
		depositoVasos--;
		monedero = monedero + PRECIO_CAFE;

		return cambio;
	}

	public double servirLeche(double dinero) throws MaquinaException {
		double cambio = 0;
		if (dinero < PRECIO_LECHE)

			throw new MaquinaException("ERROR. Te falta dinero");
		
		cambio = dinero - PRECIO_LECHE;

		if (cambio > monedero)

			throw new MaquinaException("ERROR. No hay suficiente cambio");

		if (depositoVasos == 0)

			throw new MaquinaException("ERROR. No hay vasos");

		if (depositoLeche == 0)

			throw new MaquinaException("ERROR. No hay leche");

		depositoLeche--;
		depositoVasos--;
		monedero = monedero + PRECIO_LECHE;

		return cambio;

	}

	public double servirCafeconLeche(double dinero) throws MaquinaException {
		double cambio = 0;
		if (dinero < PRECIO_LECHE)
			throw new MaquinaException("ERROR. Te falta dinero");
		cambio = dinero - PRECIO_LECHE;

		if (cambio > monedero)
			throw new MaquinaException("ERROR. No hay suficiente cambio");

		if (depositoVasos == 0)
			throw new MaquinaException("ERROR. No hay vasos");

		if (depositoLeche == 0)
			throw new MaquinaException("ERROR. No hay leche");

		if (depositoCafe == 0)
			throw new MaquinaException("ERROR. No hay café");

		depositoLeche--;
		depositoCafe--;
		depositoVasos--;
		monedero = monedero + PRECIO_CAFE_CON_LECHE;

		return cambio;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "La maquna tiene: " + depositoCafe + " de café, " + depositoLeche + " de leche" + depositoVasos
				+ " de vasos, y " + monedero + " en el monedero.";
		return cadena;
	}

}
