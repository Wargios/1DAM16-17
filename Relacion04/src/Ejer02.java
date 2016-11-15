import java.util.Scanner;

/**
 * 2. Realizar un método que dado un numero positivo devuelva su factorial. Si
 * el número es negativo se mostrará un mensaje de error y se devolverá un -1.
 * Utilizar este método desde el main para escribir los factoriales desde 0
 * hasta un número límite que se pida por teclado
 * 
 * La salida en pantalla será de esta forma:
 * 
 * Introduce un numero límite para calcular factoriales : 4
 * 
 * 0!= 1
 * 
 * 1!= 1
 * 
 * 2!= 2
 * 
 * 3!= 6
 * 
 * 4!= 24
 * 
 * @author alumnodiurno
 *
 */
public class Ejer02 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un nñumero para calcular el factorial:");
		System.out.println("El factorial es " + calcularFactorial(Integer.parseInt(teclado.nextLine())));
	}

	/**
	 * Calcula el factorial de un número introducido. Si el número es negativo
	 * el resultado será -1.
	 * 
	 * @param num
	 *            Numero introducido.
	 * @return Factorial del numero o -1 si es negativo.
	 */
	private static long calcularFactorial(int num) {
		long factorial = 1;

		if (num >= 0)

			for (int numActual = num; numActual >= 1; numActual--) {
				factorial = factorial * numActual;
			}

		else
			factorial = -1;

		return factorial;
	}
}
