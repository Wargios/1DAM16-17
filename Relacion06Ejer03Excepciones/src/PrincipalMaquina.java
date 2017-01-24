import java.util.Scanner;

public class PrincipalMaquina {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String args[]) {
		Maquina m;
		double monedero;
		int opc;
		try {
			monedero = solicitarCantidad("Introduce la cantidad del monedero inicial: ");
			m = new Maquina(monedero);
			do {
				opc = mostrarMenuCafes();
				tratarMenuCafes(m, opc);
			} while (opc != 5);

		} catch (MaquinaException ex) {
			System.out.println(ex.getMessage());
		}

	}

	private static void tratarMenuCafes(Maquina m, int opcion)  {

		double dinero;
		double cambio = 0;

		try{
		switch (opcion) {
		case 1:
			dinero = solicitarCantidad("Introduce el dinero para el cafe: ");

			cambio = m.servirCafe(dinero);

			mostrarCambio(cambio);
			break;
		case 2:
			dinero = solicitarCantidad("Introduce el dinero para la leche: ");

			cambio = m.servirLeche(dinero);

			mostrarCambio(cambio);
			break;
		case 3:
			dinero = solicitarCantidad("Introduce el dinero para el cafe con leche: ");
			cambio = m.servirCafeconLeche(dinero);
			mostrarCambio(cambio);
			break;
		case 4:
			System.out.println(m);
		}
		}catch (MaquinaException e){
			System.out.println(e.getMessage());
		}

	}

	private static void mostrarCambio(double cambio) {
		if (cambio > 0) {
			System.out.println("Recoge tu cambio " + cambio);
		}
	}

	private static int mostrarMenuCafes() {

		int opcion = 0;

		do {
			try {
				System.out.println("\n1. Cafe solo" + "( " + Maquina.PRECIO_CAFE + "  euros)" + "\n2. Leche " + "( "
						+ Maquina.PRECIO_LECHE + " euros)" + "\n3. Cafe con leche" + "( "
						+ Maquina.PRECIO_CAFE_CON_LECHE + " euros)" + "\n4. Consultar estado maquina"
						+ "\n5. Salir\n Introduce opcion:");

				opcion = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Opcion incorrecta");
			}

		} while (opcion < 1 || opcion > 5);

		return opcion;
	}

	private static double solicitarCantidad(String mensaje) {

		String cadena;
		double cantidad = 0;
		boolean hayError;

		do {
			try {
				System.out.println(mensaje);
				cadena = teclado.nextLine();
				cantidad = Double.parseDouble(cadena);
				hayError = false;
			} catch (NumberFormatException ex) {
				System.out.println("Cantidad incorrecta");
				hayError = true;
			}
		} while (hayError == true || cantidad <= 0);

		return cantidad;
	}

}
