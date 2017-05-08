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
	private static void mostrarMenuPedidos(){
		System.out.println("MENU > NUEVO PEDIDO");
		System.out.println("1. Pizza Ofertada");
		System.out.println("2. Pizza Personalizada");
		System.out.println("3. Salir");
	}

	private static void tratarMenu(int op, ColaPedidos cola) {
		
		switch (op) {
		
		case 1:
			mostrarMenuPedidos();
			op = solicitarInt("Introduce una opcion");
			tratarMenuPedido(op, cola);

			break;
			
		case 2:
			System.out.println("Atendiendo: "+ cola.atenderPedido());

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
		// TODO Auto-generated method stub
		
	}

}
