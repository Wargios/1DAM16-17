
public class Microbus extends Vehiculo {
	private static final double PRECIOxPLAZA = 5;
	private int numeroPlazas;

	public Microbus(String matricula, String gama, int numeroPlazas) throws VehiculoException {
		super(matricula, gama);
		this.numeroPlazas = numeroPlazas;

	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	@Override
	public double calculoPrecioAlquiler(int dias) {
		double precioFinal = calculoPrecioBase();
		precioFinal += numeroPlazas * PRECIOxPLAZA;

		return (precioFinal * dias);
	}

	@Override
	public String toString() {
		return "Microbus:\n" + super.toString() + ", Numero Plazas: " + numeroPlazas;
	}
}
