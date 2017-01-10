import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo();

		System.out.println("Introduce el ancho:");
		rectangulo1.setAncho(Integer.parseInt(teclado.nextLine()));

		System.out.println("Introduce el largo:");
		rectangulo1.setLongitud(Integer.parseInt(teclado.nextLine()));

		System.out.println("Area = " + rectangulo1.calcularArea());
		System.out.println("Perimetro = " + rectangulo1.calcularPerimetro());
	}
}
