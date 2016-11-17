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
public class Ejer10Metodo {
	public static void main(String[] args) {
		int num = 4;
		
		pintaTriangulo(num);
	}

	private static void pintaTriangulo(int num) {
		for (int i = 1; i <= num; i++) {

			pintarAsteriscos(i, '*');
			
			System.out.println();
		}
	}
	private static void pintarAsteriscos(int cantidad, char caracter){
		for (int j = 0; j < cantidad; j++) {
			System.out.print(caracter);
		}
	}
}
