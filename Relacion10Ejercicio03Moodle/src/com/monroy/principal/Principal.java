package com.monroy.principal;

import java.util.Arrays;
import java.util.Scanner;

import com.monroy.juegoRol.*;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);
	private static final int OPCION_SALIR = 7;
	private static final int MAX_PERSONAJES = 100;

	public static void main(String[] args) {
		int opcion;

		ListaPersonajes personajes = new ListaPersonajes(MAX_PERSONAJES);

		do {
			opcion = mostrarMenu();
			tratarMenu(opcion, personajes);

		} while (opcion != OPCION_SALIR);

	}

	private static void tratarMenu(int opcion, ListaPersonajes personajes) {
		String nombrePersonaje;
		String nombreHechizo;
		String nombreObjetivo;
		try {
			switch (opcion) {

			case 1:
				personajes.altaPersonaje(crearPersonaje());
				break;

			case 2:
				nombrePersonaje = solicitarString("Nombre del mago: ");
				nombreHechizo = solicitarString("Hechizo: ");

				personajes.magoAprendeHechizo(nombrePersonaje, nombreHechizo);
				break;

			case 3:
				nombrePersonaje = solicitarString("Nombre del mago: ");
				nombreHechizo = solicitarString("Hechizo: ");
				nombreObjetivo = solicitarString("Nombre del personaje a lanzar el hechizo: ");

				personajes.magoLanzaHechizo(nombrePersonaje, nombreHechizo, nombreObjetivo);
				break;

			case 4:
				nombrePersonaje = solicitarString("Hechizo: ");
				nombreObjetivo = solicitarString("Nombre del personaje a curar: ");

				personajes.clerigoCuraPersonaje(nombrePersonaje, nombreObjetivo);
				break;

			case 5:

				break;

			case 6:

				break;

			case 7:
				System.out.println("Adiós");
				break;

			}

		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}

	}

	private static Personaje crearPersonaje() throws PersonajeException {
		Personaje pj = null;
		String respuesta;

		System.out.println("¿Clérigo o Mago?");

			respuesta = teclado.nextLine().toUpperCase();
	
			switch (respuesta) {
			case "MAGO":
				pj = new Mago(solicitarString("Introduce el nombre para el mago:"), solicitarRaza(),
						solicitarInt("Fuerza: "), solicitarInt("Inteligencia: "), solicitarInt("Vida Máxima: "));
				break;

			case "CLERIGO":
				pj = new Clerigo(solicitarString("Introduce el nombre para el clérigo:"), solicitarRaza(),
						solicitarInt("Fuerza: "), solicitarInt("Inteligencia: "), solicitarInt("Vida Máxima: "),
						solicitarString("Nombre del dios: "));
				break;

			default:
				throw new PersonajeException("Solo pueden ser clerigos o magos");
			}
			
		
		return pj;
	}

	private static int solicitarInt(String msg) {
		int num = 0;

		System.out.println(msg);

		try {
			num = Integer.parseInt(teclado.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Introduzca un número del 1 al " + OPCION_SALIR);
		}
		return num;
	}

	private static TRaza solicitarRaza() {
		TRaza raza;

		System.out.println("Raza: " + Arrays.toString(TRaza.values()));
		raza = TRaza.valueOf(teclado.nextLine().toUpperCase());

		return raza;
	}

	private static String solicitarString(String msg) {
		String str = null;
		System.out.println(msg);
		try {
			str = teclado.nextLine();
		} catch (NumberFormatException e) {
			System.out.println("Introduzca un número del 1 al " + OPCION_SALIR);
		}
		return str;
	}

	private static int mostrarMenu() {
		int op = 0;
		do {
			System.out.println("MENU:");
			System.out.println(" 1. Alta de personaje");
			System.out.println(" 2. Mago aprende hechizo");
			System.out.println(" 3. Mago lanza hechizo");
			System.out.println(" 4. Clérigo cura al mago");
			System.out.println(" 5. Mostrar el listado de personajes");
			System.out.println(" 6. Mostrar el listado de personajes ordenados por puntos actuales");
			System.out.println(" 7. Salir");

			try {
				op = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un número del 1 al " + OPCION_SALIR);
			}
		} while (op < 1 || op > OPCION_SALIR);

		return op;
	}
}
