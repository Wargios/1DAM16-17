package com.monroy.principal;

import java.util.Scanner;

import com.monroy.correos.*;

public class PrincipalIncompleto {

	private static Scanner teclado = new Scanner(System.in);
	private static final int OPCION_SALIR = 6;

	public static void main(String[] args) {

		Instituto instituto = new Instituto();
		int opcion;
		do {
			opcion = mostrarMenuPrincipal();
			// tratarOpcionesMenuPrincipal(opcion, instituto);
		} while (opcion != OPCION_SALIR);

	}

	private static int mostrarMenuPrincipal() {

		int opcion;
		do {
			System.out.println("\n1.Gestion personas\n2.Correos\n3.Salir");
			opcion = pedirInt("Introduce opcion:");
		} while (opcion < 1 || opcion > 3);
		return opcion;

	}

	private static void menuGestionPersonas(Instituto instituto) {

		int opcion;
		do {
			opcion = mostrarMenuPersonas();
			// tratarMenuPersonas(opcion, instituto);
		} while (opcion != 4);

	}

	
	private static int mostrarMenuCorreos() {

		int opcion;
		do {
			System.out.println(
					"\n1.Enviar mensaje\n2.Leer correos\n3.Leer correos ordenado por remitente\n4.Borrar correo\n5.Buscar correos\n6.Volver");
			opcion = pedirInt("Introduce opcion:");
		} while (opcion < 1 || opcion > OPCION_SALIR);
		return opcion;

	}

	private static int mostrarMenuPersonas() {

		int opcion;
		do {
			System.out.println("\n1.Alta persona\n2.Baja Persona\n3.Listado personas ordenado por nombre\n4.Volver");
			opcion = pedirInt("Introduce opcion:");
		} while (opcion < 1 || opcion > 4);
		return opcion;

	}

	private static Persona crearPersona() throws IESException {

		String dni, nombre, correo, contrasenna;
		int edad, antiguedad;
		char esProfesor;
		dni = pedirCadena("Introduce tu dni: ");
		nombre = pedirCadena("Introduce tu dni: ");
		edad = pedirInt("Introduce tu edad: ");
		correo = pedirCadena("Introduce tu correo: ");
		contrasenna = pedirCadena("Introduce tu contraseña: ");
		Persona persona;

		esProfesor = solicitarSiEsProfesor();
		if (esProfesor == 'S') {
			antiguedad = pedirInt("Antigueadad: ");
			persona = new Profesor(dni, nombre, antiguedad, correo, contrasenna);
		} else {
			TipoEnsennanza ensennanza = TipoEnsennanza.ESO;
			int curso = pedirInt("Introduce curso:");
			persona = new Alumno(dni, nombre, edad, ensennanza, curso, correo, contrasenna);
		}

		return persona;

	}

	private static char solicitarSiEsProfesor() {
		char esProfesor;
		System.out.println("¿Es profesor (S/N)?");
		esProfesor = Character.toUpperCase(teclado.nextLine().charAt(0));
		return esProfesor;
	}

	private static String pedirCadena(String msg) {
		String cadena;

		System.out.println(msg);
		cadena = teclado.nextLine();

		return cadena;

	}

	private static int pedirInt(String msg) {
		int dato = 0;
		boolean incorrecto = false;

		do {
			try {
				incorrecto = false;
				System.out.println(msg);
				dato = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				incorrecto = true;
				System.out.println("Solo puedes introducir numeros");
			}
		} while (incorrecto == true);

		return dato;
	}

}
