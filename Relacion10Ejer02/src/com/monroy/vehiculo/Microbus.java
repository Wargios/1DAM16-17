package com.monroy.vehiculo;

public class Microbus extends Vehiculo {
	private static final double PRECIOxPLAZA = 5;
	private int numeroPlazas;

	public Microbus(String matricula, TipoGama gama, int numeroPlazas) throws VehiculoException {
		super(matricula, gama);
		this.numeroPlazas = numeroPlazas;

	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) throws VehiculoException {
		if(numeroPlazas <= 0)
			throw new VehiculoException("Debe tener alguna plaza");
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public double calculoPrecioAlquiler(int dias) throws VehiculoException {
		comprobarDias(dias);
		double precioFinal = calculoPrecioBase();
		precioFinal += numeroPlazas * PRECIOxPLAZA;

		return (precioFinal * dias);
	}

	@Override
	public String toString() {
		return "Microbus:\n" + super.toString() + ", Numero Plazas: " + numeroPlazas;
	}
}
