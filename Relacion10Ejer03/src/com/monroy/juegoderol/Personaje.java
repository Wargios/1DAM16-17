package com.monroy.juegoderol;

public class Personaje {
	private static final int MAX_FUERZA = 20;
	private static final int MAX_INTELIGENCIA = 20;
	private static final int MAX_VIDA = 20;
	private String nombre;
	private Raza raza;
	private int fuerza;
	private int inteligencia;
	private int puntosVidaMaximos;
	private int puntosVidaActual;

	public Personaje(String nombre, Raza raza, int fuerza, int inteligencia, int puntosVidaMax)
			throws JuegoRolException {
		setNombre(nombre);
		setRaza(raza);
		setFuerza(fuerza);
		setInteligencia(inteligencia);
		setPuntosVidaMaximos(puntosVidaMax);
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public Raza getRaza() {
		return raza;
	}

	public int getPuntosVidaActual() {
		return puntosVidaActual;
	}

	public int getPuntosVidaMaximos() {
		return puntosVidaMaximos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public void setPuntosVidaActual(int puntosVidaActual) {
		this.puntosVidaActual = puntosVidaActual;
	}

	public void setFuerza(int fuerza) throws JuegoRolException {
		if (fuerza < 0 || fuerza > MAX_FUERZA)
			throw new JuegoRolException("Error. Puntos de vida máximos incorrectos");
		this.fuerza = fuerza;
	}

	public void setInteligencia(int inteligencia) throws JuegoRolException {
		if (inteligencia < 0 || inteligencia > MAX_INTELIGENCIA)
			throw new JuegoRolException("Error. Puntos de vida máximos incorrectos");
		this.inteligencia = inteligencia;
	}

	public void setPuntosVidaMaximos(int puntosVidaMaximos) throws JuegoRolException {
		if (puntosVidaMaximos < 0 || puntosVidaMaximos > MAX_VIDA)
			throw new JuegoRolException("Error. Puntos de vida máximos incorrectos");
		this.puntosVidaMaximos = puntosVidaMaximos;
	}

	@Override
	public String toString() {
		return nombre + " Raza: " + raza + " FUE=" + fuerza + " INT=" + inteligencia + " PV=" + puntosVidaActual + " / "
				+ puntosVidaMaximos;
	}

}
