import java.util.Scanner;

public class MenuCuentaCredito {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		CuentaCredito cuentaCredito = new CuentaCredito();
		do {
			mostrarMenu();
			opcion = solicitarInt("Introduce una opción.");
			tratarOpcion(cuentaCredito, opcion);
		} while (opcion != 4);

	}

	private static void tratarOpcion(CuentaCredito cuentaCredito, int opcion) {
		switch (opcion) {
		
		case 1:
			try {
				cuentaCredito.ingresar(solicitarDouble("Dinero a Ingresar:"));
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			try {
				cuentaCredito.retirar(solicitarDouble("Dinero a Retirar:"));
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
			}

			break;
			
		case 3:
			System.out.println(cuentaCredito);
			break;
			
		case 4:
			System.out.println("Adiós.");
			break;

		default:
			System.out.println("Opción incorrecta.");
			break;
		}

	}

	private static double solicitarDouble(String msg) {
		double num = 0;
		System.out.println(msg);
		try {
			num = Double.parseDouble(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("No es un número");
		}

		return num;
	}

	private static int solicitarInt(String msg) {
		int num = 0;
		System.out.println(msg);
		try {
			num = Integer.parseInt(teclado.nextLine());
			
		} catch (Exception e) {
			System.out.println("No es un número");
		}

		return num;
	}

	private static void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Sacar dinero");
		System.out.println("3. Mostrar saldo y credito");
		System.out.println("4. Salir");
		;

	}

}
