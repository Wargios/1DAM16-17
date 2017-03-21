
public abstract class Vehiculo {
	private static final double GAMA_ALTA = 50;
	private static final double GAMA_MEDIA = 40;
	private static final double GAMA_BAJA = 30;
	private String matricula;
	private String gama;

	public Vehiculo(String matricula, String gama) throws VehiculoException {
		this.matricula = matricula;
		setGama(gama);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) throws VehiculoException {
		gama=gama.toUpperCase();
		if (!(gama.equals("BAJA") || gama.equals("MEDIA") || gama.equals("ALTA")))
			throw new VehiculoException("Error. Gama introducida incorrecta.");
		this.gama = gama;
	}

	public abstract double calculoPrecioAlquiler(int dias) throws VehiculoException;
	
	protected void comprobarDias(int dias) throws VehiculoException{
		if(dias <=0)
			throw new VehiculoException("Dias introducidos incorrectos.");
	}

	protected double calculoPrecioBase() {
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

	@Override
	public String toString() {
		return "Matricula: " + matricula + ", Gama: " + gama;
	}

}
