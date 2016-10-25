import java.util.Scanner;

/**
 * 9. En un establecimiento en rebajas, hay 3 tipos de productos (A, B y C). El
 * porcentaje de rebaja que se aplicará sobre el precio original del producto se
 * calcula de la siguiente forma:
 * 
 * Si el producto es de tipo A, independientemente de su precio se aplica un 7%
 * de descuento.
 * 
 * Si el producto es de tipo C o bien el precio es inferior a 500€ se aplicará
 * un porcentaje del 12% de descuento.
 * 
 * En el resto de casos se aplica un 9% de descuento. Realizar un programa que
 * solicite los datos necesarios (tipo de producto y precio original) y calcule
 * el precio rebajado. Debe comprobarse que los datos de entrada son correctos,
 * y si no lo son mostrar un mensaje de error.
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio09 {
	private static Scanner teclado = new Scanner(System.in);

	private static final double DESCUENTO_1 = 7 / 100;
	private static final double DESCUENTO_2 = 12 / 100;
	private static final double DESCUENTO_3 = 9 / 100;
	private static final double LIMITE_PRECIO = 500;

	public static void main(String[] args) {
		double precio, descuento;
		char tipoProducto;
		
		do {
			System.out.println("Precio del producto:");
			precio = Integer.parseInt(teclado.nextLine());
		} while (precio <= 0);
		
		do {
			System.out.println("Inroduce el tipo del producto");
			tipoProducto = teclado.nextLine().toUpperCase().charAt(0);
		} while (tipoProducto != 'A' && tipoProducto != 'B' && tipoProducto!='C');

	}

}
