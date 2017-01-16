import java.util.Scanner;

public class PrincipalEjer05 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;

		do {
			mostrarMenu();
			opcion = elegirOpcion();

			tratarMenu(opcion);

		} while (opcion != 3);

	}


	private static int elegirOpcion() {
		int opcion;
		System.out.println("Introduce una opción:");
		opcion = Integer.parseInt(teclado.nextLine());
		return opcion;
	}

	
	private static void tratarMenu(int opcion) {
		Complejo c1, c2, cResultado;
		
		
		switch (opcion) {
		
		case 1:
			
			System.out.println("Introduce los datos del primer complejo");
			c1 = crearComplejo();

			System.out.println("Introduce los datos del segundo complejo");
			c2 = crearComplejo();
			
			cResultado = c1.sumar(c2);
			
			System.out.println("La suma es "+cResultado);
			
			break;

		case 2:
			
			System.out.println("Introduce los datos del primer complejo");
			c1 = crearComplejo();

			System.out.println("Introduce los datos del segundo complejo");
			c2 = crearComplejo();
			
			cResultado = c1.restar(c2);
			
			System.out.println("La resta es "+cResultado);
			
			break;

		case 3:
			System.out.println("Adiós");
			break;

		default:
			System.out.println("Opción no válida.");
			break;
		}
	}
	private static Complejo crearComplejo() {
		double parteReal;
		double parteImaginaria;
		Complejo c;
		parteReal = solicitarDouble("Parte real:");
		parteImaginaria = solicitarDouble("Parte imaginaria:");
		c = new Complejo(parteReal, parteImaginaria);
		return c;
	}


	private static void mostrarMenu() {
		System.out.println("Menu:");
		System.out.println("1- Sumar complejos");
		System.out.println("2- Restar compleos");
		System.out.println("3- Salir");

	}

	private static double solicitarDouble(String texto) {
		double num;
		System.out.println(texto);
		num = Double.parseDouble(teclado.nextLine());
		return num;
	}
}
