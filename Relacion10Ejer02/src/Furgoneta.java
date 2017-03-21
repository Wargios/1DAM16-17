
public class Furgoneta extends Vehiculo {
	private static final double PRECIOxKG = 0.5;
	private int pma;

	public Furgoneta(String matricula, String gama,int pma) throws VehiculoException {
		super(matricula, gama);
		this.pma = pma;
	}

	public int getPma() {
		return pma;
	}

	@Override
	public double calculoPrecioAlquiler(int dias) {
		double precioFinal = calculoPrecioBase();

		precioFinal += pma * PRECIOxKG;

		return (precioFinal * dias);
	}

	@Override
	public String toString() {
		return "Furgoneta:\n" + super.toString() + ", PMA: " + pma;
	}
}
