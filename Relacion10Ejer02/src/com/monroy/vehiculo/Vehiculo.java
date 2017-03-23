package com.monroy.vehiculo;

public abstract class Vehiculo {
	private static final double GAMA_ALTA = 50;
	private static final double GAMA_MEDIA = 40;
	private static final double GAMA_BAJA = 30;
	private String matricula;
	private TipoGama gama;

	public Vehiculo(String matricula, TipoGama gama) throws VehiculoException {
		this.matricula = matricula;
		setGama(gama);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoGama getGama() {
		return gama;
	}

	public void setGama(TipoGama gama) throws VehiculoException {
		this.gama = gama;
	}

	public abstract double calculoPrecioAlquiler(int dias) throws VehiculoException;
	
	protected void comprobarDias(int dias) throws VehiculoException{
		if(dias <=0)
			throw new VehiculoException("Dias introducidos incorrectos.");
	}

	protected double calculoPrecioBase() {
		double precio = 0;

		switch (gama) {

		case BAJA:
			precio = GAMA_BAJA;
			break;

		case MEDIA:
			precio = GAMA_MEDIA;
			break;

		case ALTA:
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
