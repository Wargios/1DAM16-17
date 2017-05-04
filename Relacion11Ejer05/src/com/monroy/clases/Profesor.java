package com.monroy.clases;

public class Profesor extends Persona {

	private int antiguedad;

	public Profesor(String dni, String nombre, int edad, String correo, String contra) throws IESException {
		super(dni, nombre, edad, correo, contra);
		this.antiguedad = 0;

	}

	public Profesor(String dni, String nombre, int edad, int antiguedad, String correo, String contra)
			throws IESException {
		super(dni, nombre, edad, correo, contra);
		setAntiguedad(antiguedad);

	}

	public int getAntiguedad() {
		return antiguedad;
	}

	private void setAntiguedad(int antiguedad) throws IESException {
		if (antiguedad < 0)
			throw new IESException("Antigüedad incorrecta " + antiguedad);
		this.antiguedad = antiguedad;
	}

	public void incrementarAntiguedad() {
		antiguedad++;
	}

	@Override
	public String toString() {
		return "Profesor " + super.toString() + " Antigüedad: " + antiguedad + " años";
	}

}
