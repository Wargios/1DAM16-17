package com.monroy.juegoderol;

public class Mago extends Personaje {
	private static final int MAX_FUERZA_MAGO = 15;
	private static final int MIN_INTELIGENCIA_MAGO = 17;
	private static final int MAX_HECHIZOS=4;
	private String hechizos[];

	public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int puntosVidaMax) throws JuegoRolException {
		super(nombre, raza, fuerza, inteligencia, puntosVidaMax);
		setFuerza(fuerza);
		setInteligencia(inteligencia);
		hechizos= new String[MAX_HECHIZOS];

	}

	@Override
	public void setFuerza(int fuerza) throws JuegoRolException {
		if (fuerza > MAX_FUERZA_MAGO)
			throw new JuegoRolException("Error. La fuerza máxima es " + MAX_FUERZA_MAGO + ".");
		super.setFuerza(fuerza);
	}
	
	@Override
	public void setInteligencia(int inteligencia) throws JuegoRolException {
		if (inteligencia < MIN_INTELIGENCIA_MAGO)
			throw new JuegoRolException("Error. La fuerza máxima es " + MAX_FUERZA_MAGO + ".");
		super.setInteligencia(inteligencia);
	}

}
