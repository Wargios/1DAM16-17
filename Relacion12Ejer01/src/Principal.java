import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ColaPedidos colaPedidos = new ColaPedidos();
		int opcion;

		do {
			mostrarMenu();
			opcion = solicitarInt("Introduce una opcion");
			tratarMenu(opcion, colaPedidos);

		} while (opcion != 4);

	}

	private static int solicitarInt(String string) {
		int num = Integer.parseInt(teclado.nextLine());
		return num;
	}

	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Nuevo pedido");
		System.out.println("2. Atender pedido");
		System.out.println("3. Mostrar el número de pedidos pendientes");
		System.out.println("4. Salir");
	}

	private static void mostrarMenuPedidos() {
		System.out.println("MENU > NUEVO PEDIDO");
		System.out.println("1. Pizza Ofertada");
		System.out.println("2. Pizza Personalizada");
		System.out.println("3. Salir");
	}

	private static void tratarMenu(int op, ColaPedidos cola) {

		switch (op) {

		case 1:
			do {
				mostrarMenuPedidos();
				op = solicitarInt("Introduce una opcion");
				tratarMenuPedido(op, cola);
			} while (op != 3);

			break;

		case 2:
			System.out.println("Atendiendo: " + cola.atenderPedido());
			break;

		case 3:
			System.out.println(cola.toString());
			break;

		case 4:
			System.out.println("Adiós");
			break;

		default:
			System.out.println("Opcion Incorrecta");
			break;
		}
	}

	private static void tratarMenuPedido(int op, ColaPedidos cola) {
		Pizza pizza;
		Pedido pedido = new Pedido(solicitarString("Introduce la direccion"));
		cola.annadirPedido(pedido);

		switch (op) {

		case 1:
			pizza = new PizzaOfertada(solicitarTamanno(), solicitarInt("Introduce el numero de la pizza: "));
			pedido.annadirPizza(pizza);
			break;

		case 2:
			pizza = tratarMenuPizzaPersonalizada();
			pedido.annadirPizza(pizza);

			break;

		case 3:
			System.out.println("Volviendo");
			break;

		default:
			System.out.println("Opcion Incorrecta");
			break;
		}

	}

	private static void mostrarMenuPizzaPersonalizada() {
		System.out.println("MENU > NUEVO PEDIDO > PIZZA PERSONALIZADA");
		System.out.println("1. Añadir ingrediente");
		System.out.println("2. Parar de añadir");
	}

	private static Pizza tratarMenuPizzaPersonalizada() {
		int op;
		PizzaPersonalizada pizza = new PizzaPersonalizada(solicitarTamanno());
		String ingrediente;

		do {

			mostrarMenuPizzaPersonalizada();
			System.out.println(pizza);
			
			op = solicitarInt("Introduce una opción:");

			switch (op) {

			case 1:
				System.out.println("Lista de ingredientes:");
				System.out.println(Ingrediente.values());

				ingrediente = solicitarString("Introduce el ingrediente: ");

				if (Ingrediente.valueOf(ingrediente) instanceof Ingrediente)
					pizza.annadirIngrediente(Ingrediente.valueOf(ingrediente));

				else
					System.out.println("Ingrediente incorrecto");

				break;

			case 2:
				System.out.println("Volviendo");
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
			}

		} while (op != 2);

		return pizza;
	}

	private static TipoTamanno solicitarTamanno() {
		TipoTamanno tamano;
		String str = solicitarString("Introduce el tamaño de la pizza: " + Arrays.toString(TipoTamanno.values()));

		switch (TipoTamanno.valueOf(str.toUpperCase())) {

		case GRANDE:
			tamano = TipoTamanno.GRANDE;
			break;

		case MEDIANA:
			tamano = TipoTamanno.MEDIANA;
			break;

		case PEQUENNA:
			tamano = TipoTamanno.PEQUENNA;
			break;

		default:
			System.out.println("Tamaño incorrecto");
			tamano = solicitarTamanno();
		}
		return tamano;
	}

	private static String solicitarString(String string) {
		System.out.println(string);
		return teclado.nextLine();
	}

}
