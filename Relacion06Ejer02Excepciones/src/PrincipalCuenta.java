
import java.util.Scanner;

public class PrincipalCuenta {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int op;
		double saldoInicial;
		Cuenta cuenta;
		char salir;

		try {
			saldoInicial = solicitarDoublePositivo("Introduce el saldo inicial de la cuenta:");
			cuenta = new Cuenta(saldoInicial);

			do {
				op = menu();
				salir = tratarMenu(op, cuenta);
			} while (salir == 'n');

		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}

	}

	private static double solicitarDoublePositivo(String msg) {
		double numero = 0;
		boolean hayError;
		do {
			try {
				System.out.println(msg);
				numero = Double.parseDouble(teclado.nextLine());
				hayError = false;
			} catch (NumberFormatException ex) {
				System.out.println("Error. No es un numero");
				hayError = true;
			}
		} while (hayError || numero < 0);

		return numero;
	}

	private static int menu() throws CuentaException {
		int op = 0;

		do {
			try {
				System.out.println("Elige una opción:");
				System.out.println("1. Hacer un ingreso.");
				System.out.println("2. Hacer un reintegro.");
				System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
				System.out.println("4. Finalizar las operaciones.");
				op = Integer.parseInt(teclado.nextLine());

				if (op < 1 || op > 5)
					throw new CuentaException("Error. Opcion incorrecta");

			} catch (NumberFormatException e) {
				throw new CuentaException("Error. Opcion incorrecta");
			}
		} while (op < 1 || op > 5);

		return op;
	}

	private static char tratarMenu(int op, Cuenta cuenta) {
		double cantidad;
		char salir = 'n';

		switch (op) {
		case 1: { 
			cantidad = solicitarDoublePositivo("introduce la cantidad a ingresar:");
			try {
				cuenta.ingreso(cantidad);
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 2: {
			cantidad = solicitarDoublePositivo("introduce la cantidad a retirar:");
			try {
				cuenta.reintegro(cantidad);
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 3: {
			System.out.println(cuenta);
			break;
		}

		case 4: {
			do {
				System.out.println("¿Estas seguro (s/n)?");
				salir = teclado.nextLine().charAt(0);
				salir = Character.toLowerCase(salir);
			} while (salir != 's' && salir != 'n');

			if (salir == 's') {
				System.out.println("Dispones de " + cuenta.getSaldo() + "€ de saldo.");

			}

			break;
		}
		}

		return salir;
	}

}
