/**
 * 10. Realizar un programa utilizando bucles, que muestre la siguiente figura
 * por pantalla:
 *
 * // *
 * 
 * // * *
 * 
 * // * * *
 * 
 * // * * * *
 * 
 * @author alumnodiurno
 *
 */
public class Ejer10 {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
