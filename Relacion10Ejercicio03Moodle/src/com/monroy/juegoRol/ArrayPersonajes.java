package com.monroy.juegoRol;

public class ArrayPersonajes {
	private static int contadorPersonajes = 0;
	private Personaje[] personajes;

	public ArrayPersonajes(int max) {
		personajes = new Personaje[max];
	}

	public void altaPersonaje(Personaje personaje) {
		if (contadorPersonajes > personajes.length)
			personajes[contadorPersonajes] = personaje;
		contadorPersonajes++;
	}

	public void magoAprendeHechizo(String nombreMago, String nombreHechizo) throws PersonajeException {
		int pos = buscarPersonaje(nombreMago);

		if (personajes[pos] instanceof Mago) {
			Mago mago = (Mago) personajes[pos];
			mago.aprenderHechizo(nombreHechizo);
		} else
			throw new PersonajeException("No es un mago.");
	}

	private int buscarPersonaje(String nombre) throws PersonajeException {
		int pos = -1;
		for (int i = 0; i < contadorPersonajes; i++) {
			if (personajes[i] != null) {
				if (personajes[i].getNombre().equals(nombre)) {
					pos = i;
				}
			}
		}
		if (pos == -1) {
			throw new PersonajeException("Personaje no encontrado.");
		}
		return pos;
	}

	public void magoLanzaHechizo(String nombreMago, String nombreObjetivo) throws PersonajeException {

		int pos = buscarPersonaje(nombreMago);

		if (personajes[pos] instanceof Mago) {
			// Mago mago = (Mago) personajes[pos];

		} else
			throw new PersonajeException("No es un mago.");

	}

	

}
