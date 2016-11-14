import java.util.Scanner;

/**
 * 5. Realizar un programa que solicite un número e informe de si es o no primo.
 * Un número es primo si entre sus divisores sólo está él mismo y el número 1.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer05Metodo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(teclado.nextLine());
		
		if (esPrimo(num))
			System.out.println("El numero " + num + " es primo");
		else
			System.out.println("El numero " + num + " no es primo");
	}

	private static boolean esPrimo(int num) {
		int contador;
		boolean esprimo = true;
		
		contador = num / 2;

		while (esprimo && contador > 2) {
			contador--;
			if (num % contador == 0) {
				esprimo = false;
			}
		}
		return esprimo;
	}
	
	

}
