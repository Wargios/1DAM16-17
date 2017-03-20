
public abstract class Vehiculo {
	private static final double GAMA_ALTA = 50;
	private static final double GAMA_MEDIA = 40;
	private static final double GAMA_BAJA = 30;
	private String matricula;
	private String gama;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public abstract double calculoPrecioAlquiler(int dias);

	public double calculoPrecioBase() {
		double precio = 0;

		switch (gama.toUpperCase()) {

		case "BAJA":
			precio = GAMA_BAJA;
			break;

		case "MEDIA":
			precio = GAMA_MEDIA;
			break;

		case "ALTA":
			precio = GAMA_ALTA;
			break;

		}
		return precio;
	}
}
