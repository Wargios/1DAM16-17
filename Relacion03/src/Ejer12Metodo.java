import java.util.Scanner;

/**
 * 12.Repetir el ejercicio anterior, pero repitiendo un número de veces la
 * figura del triángulo, una al lado de la otra, tal que así:
 * 
 * // *__________*
 * 
 * // * *________* *
 * 
 * // * * *______* * *
 * 
 * // * * * *____* * * *
 * 
 * // * * * * *__* * * * * . . . etc
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer12Metodo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int base, numTriangulos;

		do {

			System.out.println("Base del triangulo");
			base = Integer.parseInt(teclado.nextLine());
			System.out.println("Número de trinagulos");
			numTriangulos = Integer.parseInt(teclado.nextLine());

		} while (base <= 0);

		pintarTriangulos(base, numTriangulos);
	}

	private static void pintarTriangulos(int base, int numTriangulos) {
		int contadorAsteriscos, contadorTriangulos, contadorSaltos, contadorEspacios;

		for (contadorSaltos = 1; contadorSaltos <= base; contadorSaltos++) {

			for (contadorTriangulos = 0; contadorTriangulos < numTriangulos; contadorTriangulos++) {

				for (contadorAsteriscos = 0; contadorAsteriscos < contadorSaltos; contadorAsteriscos++) {
					System.out.print("* ");
				}

				for (contadorEspacios = base - contadorAsteriscos; contadorEspacios >= 0; contadorEspacios--) {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}