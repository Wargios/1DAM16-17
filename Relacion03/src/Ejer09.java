/**
 * 9. Realizar un programa que muestre todas las tablas de multiplicar (del 0 al
 * 10).
 * 
 * @author alumnodiurno
 *
 */
public class Ejer09 {
	public static void main(String[] args) {
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("\nTabla del " + numero);
			for (int contador = 0; contador <= 10; contador++) {
				System.out.println(numero + "*"+ contador +"="+numero*contador );
			}
			
		}
	}
}
