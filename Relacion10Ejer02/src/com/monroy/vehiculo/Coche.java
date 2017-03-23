package com.monroy.vehiculo;

public class Coche extends Vehiculo {
	private static final double PRECIO_DIESEL = 2;
	private static final double PRECIO_GASOLINA = 3.5;
	private boolean diesel;

	public Coche(String matricula, TipoGama gama, boolean diesel) throws VehiculoException {
		super(matricula, gama);
		this.diesel = diesel;
	}

	public boolean isDiesel() {
		return diesel;
	}

	@Override
	public double calculoPrecioAlquiler(int dias) throws VehiculoException {
		comprobarDias(dias);
		double precioFinal = calculoPrecioBase();
		if (diesel)
			precioFinal += PRECIO_DIESEL;
		else
			precioFinal += PRECIO_GASOLINA;

		return (precioFinal * dias);
	}

	@Override
	public String toString() {
		String motor;
		if (diesel)
			motor = "Diesel";
		else
			motor = "Gasolina";

		return "Coche:\n" + super.toString() + ", Motor: " + motor;
	}
}
