import java.util.Scanner;

/**
 * 6. Realizar un programa que lea el número de alumnos que hay en una clase. A
 * continuación debe leer la nota de cada uno de ellos en un examen y nos debe
 * informar del número de suspensos y aprobados, así como los porcentajes.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer06 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numAlumnos, suspensos = 0, aprobados = 0;
		double nota;

		do {
			System.out.println("Introduce el número de alumnos:");
			numAlumnos = Integer.parseInt(teclado.nextLine());
		} while (numAlumnos <= 0);

		for (int i = 0; i < numAlumnos; i++) {

			do {
				System.out.println("Introduce una nota: (" + i + "/" + numAlumnos + ")");
				nota = Integer.parseInt(teclado.nextLine());
			} while (nota < 0 || nota > 10);

			if (nota < 5)
				suspensos++;
			else
				aprobados++;
		}

		System.out.println("Suspensos: " + suspensos + "(" + suspensos * 100 / numAlumnos + "%)");
		System.out.println("Aprovados: " + aprobados + "(" + aprobados * 100 / numAlumnos + "%)");

	}
}
