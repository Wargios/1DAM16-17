import java.util.Scanner;

/**
 * 1. Realizar un método llamado solicitarNumeroEnRango. El método devuelve un
 * entero y tendrá como parámetros de entrada
 * 
 * • Límite inferior
 * 
 * • Límite superior
 * 
 * El método solicitará un número comprendido entre esos dos valores y lo
 * devolverá. Si el límite inferior es mayor al limite superior los intercambia.
 * Probarlo desde el main
 * 
 * @author Francisco José González Jiménez
 *
 */

public class Ejer01 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int LIMITE_SUPERIOR = 100;
	private static final int LIMITE_INFERIOR = 0;

	public static void main(String[] args) {

		solicitarNumeroEnRango(LIMITE_INFERIOR, LIMITE_SUPERIOR);
	}

	/**
	 * Solicita un número en el rango de número introducido. No importa si los
	 * limites se introdujeron al revés, se les intercambiará el valor
	 * automáticamente.
	 * 
	 * @param limiteInferior
	 *            Primer límite del intervalo
	 * @param limiteSuperor
	 *            Segundo límite del intervalo
	 * @return Devuelve el número si está en el intervalo
	 */

	private static int solicitarNumeroEnRango(int limiteInferior, int limiteSuperor) {
		int num = 0;

		if (limiteInferior > limiteInferior) {
			int aux = limiteInferior;
			limiteInferior = limiteSuperor;
			limiteSuperor = aux;
		}

		do {
			System.out.println("Introduza un numero comprendido entre" + limiteInferior + " y " + limiteSuperor + ":");
			num = solicitarNum();
		} while (num < limiteInferior || num > limiteInferior);

		return num;
	}

	private static int solicitarNum() {
		return Integer.parseInt(teclado.nextLine());
	}
}
