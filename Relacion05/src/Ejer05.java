import java.util.Scanner;

/**
 * 5. Realizar un programa que dada una cadena de texto introducida por teclado,
 * diseñe un método que devuelva el número de ocurrencias del penúltimo carácter
 * de la cadena.
 * 
 * Por ejemplo, la cadena “Me gusta programar”, devolvería 3, que sería el
 * número de veces que aparece la letra “a” en la cadena.
 * 
 * @author Francisco José González Jiménez
 *
 */

public class Ejer05 {
	private static Scanner teclado =  new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce una frase para saber cuantas veces se repite el penúltimo carácter:");
		System.out.println("El texto contiene "+ocurrenciasPenultimoCaracter(teclado.nextLine())+" ocurrencias del penúltimo carácter.");
	}

	private static int ocurrenciasPenultimoCaracter(String cad) {
		int contadorCaracter=0;
		cad = cad.toLowerCase();
		char penultimoCaracter = cad.charAt(cad.length()-2);
		
		
		
		for (int i = 0; i < cad.length(); i++) {
			
			if (cad.charAt(i) == penultimoCaracter) 
				contadorCaracter++;
		}
		
		return contadorCaracter;
	}
}
