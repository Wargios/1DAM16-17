import java.util.Scanner;

/**
 * 6. Realizar un programa que lea el número de alumnos que hay en una clase. A
 * continuación debe leer la nota de cada uno de ellos en un examen y nos debe
 * informar del número de suspensos y aprobados, así como los porcentajes.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer06Metodo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numAlumnos;
		
		numAlumnos = solicitarNumeroAlumnos();

		estadisticasNotas(numAlumnos);
	}

	private static int solicitarNumeroAlumnos() {
		int numAlumnos;
		
		do {
			System.out.println("Introduce el número de alumnos:");
			numAlumnos = Integer.parseInt(teclado.nextLine());
		} while (numAlumnos <= 0);
		
		return numAlumnos;
	}

	private static void estadisticasNotas(int numAlumnos) {
		int suspensos = 0, aprobados = 0;
		double nota;

		for (int i = 0; i < numAlumnos; i++) {

			nota = solicitarNota(numAlumnos, i);

			if (nota < 5)
				suspensos++;
			else
				aprobados++;
		}

		System.out.println("Suspensos: " + suspensos + "(" + suspensos * 100 / numAlumnos + "%)");
		System.out.println("Aprovados: " + aprobados + "(" + aprobados * 100 / numAlumnos + "%)");
	}

	private static double solicitarNota(int numAlumnos, int i) {
		double nota;
		
		do {
			System.out.println("Introduce una nota: (" + i + "/" + numAlumnos + ")");
			nota = Integer.parseInt(teclado.nextLine());
		} while (nota < 0 || nota > 10);
		
		return nota;
	}
}
