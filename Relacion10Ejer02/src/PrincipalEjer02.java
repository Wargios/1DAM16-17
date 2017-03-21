import java.util.Scanner;

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

public class PrincipalEjer02 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int MAX_VEHICULOS = 200;
	private static int contadorVehiculos = 0;

	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[MAX_VEHICULOS];
		int opcion = 0;
		do {
			mostrarMenu();
			try {
				opcion = solicitarInt("Introduce una opción:");
			} catch (Exception e) {
				System.out.println("Debe ser un caracter válido.");
			}

			try {
				tratarMenu(opcion, vehiculos);
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

	private static void tratarMenu(int opcion, Vehiculo[] vehiculos) throws VehiculoException {
		String matricula;
		Vehiculo vehiculo;
		double precio;
		switch (opcion) {

		case 1:
			vehiculos[contadorVehiculos] = altaVehiculo(solicitarVehiculo());
			contadorVehiculos++;
			break;

		case 2:
			matricula = solicitarString("Introduce la matrícula del vehículo:");
			vehiculo = buscarVehiculo(matricula, vehiculos);
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

	private static Vehiculo buscarVehiculo(String matricula, Vehiculo[] vehiculos) throws VehiculoException {
		boolean encontrado = false;
		Vehiculo vehiculo = null;

		for (int i = 0; i < contadorVehiculos && !encontrado; i++) {
			if (vehiculos[i].getMatricula().equals(matricula)) {
				encontrado = true;
				vehiculo = vehiculos[i];
			}
		}

		if (!encontrado)
			throw new VehiculoException("Vehiculo no encontrado.");

		return vehiculo;
	}

	private static String solicitarVehiculo() throws VehiculoException {
		System.out.println("Coche, Furgoneta o Microbus:");
		String vehiculo = teclado.nextLine().toUpperCase();

		if (!(vehiculo.equals("COCHE") || vehiculo.equals("FURGONETA") || vehiculo.equals("MICROBUS")))
			throw new VehiculoException("Vehiculo desconocido.");

		return vehiculo;
	}

	private static Vehiculo altaVehiculo(String nombreVehiculo) throws VehiculoException {
		Vehiculo vehiculo = null;
		switch (nombreVehiculo) {
		case "COCHE":
			vehiculo = new Coche(solicitarString("Introduce la matrícula:"), solicitarString("Introduce la gama:"),
					solicitarBoolean("¿Es diesel?"));
			break;
		case "FURGONETA":
			vehiculo = new Furgoneta(solicitarString("Introduce la matrícula:"), solicitarString("Introduce la gama:"),
					solicitarInt("Introduce el PMA:"));
			break;
		case "MICROBUS":
			vehiculo = new Microbus(solicitarString("Introduce la matrícula:"), solicitarString("Introduce la gama:"),
					solicitarInt("Introduce el número de asientos:"));
			break;
		}
		return vehiculo;
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
