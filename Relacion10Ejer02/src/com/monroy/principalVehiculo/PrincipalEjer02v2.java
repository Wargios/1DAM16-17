package com.monroy.principalVehiculo;
import java.util.Scanner;

import com.monroy.vehiculo.AlmacenVehiculos;
import com.monroy.vehiculo.Coche;
import com.monroy.vehiculo.Furgoneta;
import com.monroy.vehiculo.Microbus;
import com.monroy.vehiculo.TipoGama;
import com.monroy.vehiculo.Vehiculo;
import com.monroy.vehiculo.VehiculoException;

/**
 * Se debe presentar un menú con las siguientes opciones:
 * 
 * 1. Alta de vehículo: Se solicitará el tipo de vehículo y sus datos y lo dará
 * de alta.
 * 
 * 2. Cálculo de precio de alquiler: Se solicitará la matrícula del vehículo, el
 * número de días que ha sido alquilado y se mostrará el precio del alquiler
 * 
 * 3. Salir.
 * 
 * Considerar que la empresa trabajará con un máximo de 200 vehículos
 * 
 * @author Wargios
 *
 */

public class PrincipalEjer02v2 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int MAX_VEHICULOS = 200;

	public static void main(String[] args) {

		AlmacenVehiculos almacenVehiculos = new AlmacenVehiculos(MAX_VEHICULOS);
		int opcion = 0;
		do {
			mostrarMenu();
			try {
				opcion = solicitarInt("Introduce una opción:");
			} catch (NumberFormatException e) {
				System.out.println("Debe ser un caracter válido.");
			}

			try {
				tratarMenu(opcion, almacenVehiculos);
			} catch (VehiculoException e) {
				System.out.println(e.getMessage());
			}

		} while (opcion != 3);
	}

	private static int solicitarInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}

	private static void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Alta de vehículo.");
		System.out.println("2. Cálculo de precio de alquiler.");
		System.out.println("3. Salir.");

	}

	private static void tratarMenu(int opcion, AlmacenVehiculos almacenVehiculos) throws VehiculoException {
		String matricula;
		Vehiculo vehiculo;
		double precio;
		switch (opcion) {

		case 1:
			try {
				almacenVehiculos.altaVehiculo(solicitarVehiculo());
			} catch (IllegalArgumentException e) {
				System.out.println("Error.");
			}

			break;

		case 2:
			matricula = solicitarString("Introduce la matrícula del vehículo:");
			vehiculo = almacenVehiculos.buscarVehiculo(matricula);
			precio = vehiculo.calculoPrecioAlquiler(solicitarInt("Introduce el número de días"));
			System.out.println("El total a pagar serían: " + precio + ".");
			break;

		case 3:
			System.out.println("Adiós.");
			break;

		default:
			System.out.println("Opcion no válida.");
			break;
		}
	}

	private static Vehiculo solicitarVehiculo() throws VehiculoException {
		System.out.println("Coche, Furgoneta o Microbus:");
		String tipoVehiculo = teclado.nextLine().toUpperCase();
		Vehiculo vehiculo = null;

		switch (tipoVehiculo) {
		
		case "COCHE":
			vehiculo = new Coche(solicitarString("Introduce la matrícula:"), solicitarGama("Introduce la gama:"),
					solicitarBoolean("¿Es diesel?"));
			break;
			
		case "FURGONETA":
			vehiculo = new Furgoneta(solicitarString("Introduce la matrícula:"), solicitarGama("Introduce la gama:"),
					solicitarInt("Introduce el PMA:"));
			break;
			
		case "MICROBUS":
			vehiculo = new Microbus(solicitarString("Introduce la matrícula:"), solicitarGama("Introduce la gama:"),
					solicitarInt("Introduce el número de asientos:"));
			break;

		default:
			throw new VehiculoException("Vehiculo desconocido.");
			
		}
		return vehiculo;

	}

	private static TipoGama solicitarGama(String string) {
		System.out.println(string);
		TipoGama gama = TipoGama.valueOf(teclado.nextLine().toUpperCase());
		return gama;
	}

	private static boolean solicitarBoolean(String string) throws VehiculoException {
		boolean resul;
		System.out.println(string);
		String respuesta = teclado.nextLine();
		if (respuesta.toUpperCase().equals("SI")) {
			resul = true;
		} else if (respuesta.toUpperCase().equals("NO")) {
			resul = false;
		} else {
			throw new VehiculoException("Respuesta no válida.");
		}

		return resul;
	}

	private static String solicitarString(String string) {
		System.out.println(string);

		return teclado.nextLine();
	}
}
