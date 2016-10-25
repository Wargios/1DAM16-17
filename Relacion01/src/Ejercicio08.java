import java.util.Scanner;

/**
 * Realizar un programa que lea por teclado dos marcaciones de un reloj digital
 * (horas, minutos, segundos) comprendidas entre las 0:0:0 y las 23:59:59 e
 * informe cual de ellas es mayor. Ejemplo:
 * 
 * Hora 1: 12:35:37
 * 
 * Hora 2: 12:38:36
 * 
 * Hora 2 es mayor
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio08 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int horas1, horas2, minutos1, minutos2, segundos1, segundos2;
		int totalsegundos1, totalsegundos2;

		System.out.println("Introduce la primera marcación");

		System.out.println("Horas:");
		horas1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Minutos:");
		minutos1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Segundos:");
		segundos1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce la segunda marcación");

		System.out.println("Horas:");
		horas2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Minutos:");
		minutos2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Segundos:");
		segundos2 = Integer.parseInt(teclado.nextLine());

		totalsegundos1 = horas1 * 360 + minutos1 * 60 + segundos1;
		totalsegundos2 = horas2 * 360 + minutos2 * 60 + segundos2;
		if (totalsegundos1 == totalsegundos2) {
			System.out.println("Son iguales");
		} else {
			if (totalsegundos1 > totalsegundos2) {
				System.out.println("Hora 1 es mayor");
			} else
				System.out.println("Hora 2 es mayor");
		}
	}
}
