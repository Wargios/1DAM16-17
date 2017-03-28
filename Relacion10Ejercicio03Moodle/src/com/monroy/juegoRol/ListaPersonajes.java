package com.monroy.juegoRol;

public class ListaPersonajes {
	private static int contadorPersonajes = 0;
	private Personaje[] personajes;

	public ListaPersonajes(int max) {
		personajes = new Personaje[max];
	}

	public void altaPersonaje(Personaje personaje) {
		if (contadorPersonajes > personajes.length)
			personajes[contadorPersonajes] = personaje;
		contadorPersonajes++;
	}

	public Personaje buscarPersonaje(String nombre) throws PersonajeException {
		Personaje pj = null;
		boolean encontrado = false;

		for (int i = 0; i < contadorPersonajes && !encontrado; i++) {
			if (personajes[i] != null && personajes[i].getNombre().equals(nombre)) {
				pj = personajes[i];
				encontrado = true;
			}
		}

		if (!encontrado)
			throw new PersonajeException("Personaje no encontrado.");

		return pj;
	}

	public void borrarPersonaje(Personaje objetivo) {
		boolean encontrado = false;
		for (int i = 0; i < contadorPersonajes && !encontrado; i++) {
			if (personajes[i] != null && personajes[i].equals(objetivo)) {
				personajes[i] = null;
				encontrado = true;
			}
		}

	}

	public void magoAprendeHechizo(String nombreMago, String nombreHechizo) throws PersonajeException {

		Personaje pj = buscarPersonaje(nombreMago);

		if (pj instanceof Mago) {
			Mago mago = (Mago) pj;
			mago.aprenderHechizo(nombreHechizo);
		} else
			throw new PersonajeException("No es un mago.");
	}

	public void magoLanzaHechizo(String nombreMago, String hechizo, String nombreObjetivo) throws PersonajeException {

		Personaje pj = buscarPersonaje(nombreMago);
		Personaje objetivo = buscarPersonaje(nombreObjetivo);

		if (pj.equals(objetivo))
			throw new PersonajeException("No puede ser el mismo mago.");

		if (pj instanceof Mago) {
			Mago mago = (Mago) pj;
			mago.lanzarHechizo(hechizo, objetivo);

			if (objetivo.getVidaActual() <= 0)
				borrarPersonaje(objetivo);

		} else
			throw new PersonajeException("No es un mago.");

	}

	public void clerigoCuraPersonaje(String nombreClerigo, String nombreObjetivo) throws PersonajeException {
		Personaje pj = buscarPersonaje(nombreClerigo);
		Personaje objetivo = buscarPersonaje(nombreObjetivo);

		if (pj.equals(objetivo))
			throw new PersonajeException("No puede curarse a sí mismo.");

		if (pj instanceof Clerigo) {
			Clerigo clerigo = (Clerigo) pj;
			clerigo.curar(objetivo);

		} else
			throw new PersonajeException("No es un clerigo.");

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < contadorPersonajes; i++) {
			if (personajes[i] != null) {
				sb.append(personajes[i] + "\n");
			}
		}
		return sb.toString();
	}

}
