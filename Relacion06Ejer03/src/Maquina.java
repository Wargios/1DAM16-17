
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

	Maquina(double dineroInicial) {
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

	private void setMonedero(double monedero) {
		if (monedero <= 0) {
			// excep
			System.out.println("ERROR. No puede tener el monedero negativo");

		} else

			this.monedero = monedero;

	}

	public void llenardepositos() {
		depositoCafe = MAXIMO_CAFE;
		depositoLeche = MAXIMO_LECHE;
		depositoVasos = MAXIMO_VASOS;
	}

	public double servirCafe(double dinero) {
		double cambio = 0;

		if (dinero < PRECIO_CAFE)
			// excep
			System.out.println("ERROR. Te falta dinero");
		cambio = dinero - PRECIO_CAFE;

		if (cambio > monedero)
			// excep
			System.out.println("ERROR. No hay suficiente cambio");

		else if (depositoVasos == 0) {
			// excep
			System.out.println("ERROR. No hay vasos");

		} else if (depositoCafe == 0) {
			// exc
			System.out.println("ERROR. No hay café");

		} else {
			depositoCafe--;
			depositoVasos--;
			monedero = monedero + PRECIO_CAFE;
		}

		return cambio;
	}

	public double servirLeche(double dinero) {
		double cambio = 0;
		if (dinero < PRECIO_LECHE)
			// excep
			System.out.println("ERROR. Te falta dinero");
		cambio = dinero - PRECIO_LECHE;

		if (cambio > monedero)
			// excep
			System.out.println("ERROR. No hay suficiente cambio");

		else if (depositoVasos == 0) {
			// excep
			System.out.println("ERROR. No hay vasos");

		} else if (depositoLeche == 0) {
			// exc
			System.out.println("ERROR. No hay leche");

		} else {
			depositoLeche--;
			depositoVasos--;
			monedero = monedero + PRECIO_LECHE;
		}
		return cambio;

	}

	public double servirCafeconLeche(double dinero) {
		double cambio = 0;
		if (dinero < PRECIO_LECHE)
			// excep
			System.out.println("ERROR. Te falta dinero");
		cambio = dinero - PRECIO_LECHE;

		if (cambio > monedero)
			// excep
			System.out.println("ERROR. No hay suficiente cambio");

		else if (depositoVasos == 0) {
			// excep
			System.out.println("ERROR. No hay vasos");

		} else if (depositoLeche == 0) {
			// exc
			System.out.println("ERROR. No hay leche");
		} else if (depositoCafe == 0) {
			// exc
			System.out.println("ERROR. No hay café");

		} else {
			depositoLeche--;
			depositoCafe--;
			depositoVasos--;
			monedero = monedero + PRECIO_CAFE_CON_LECHE;
		}
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
