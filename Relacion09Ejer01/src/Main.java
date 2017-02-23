import java.util.Random;

/**
 * 1. Realizar un programa que lea las calificaciones obtenidas por los alumnos
 * de 1º de DAM (30 alumnos) en las 5 asignaturas y saque por pantalla lla
 * siguiente estadística:
 * 
 * ◦ Número de alumnos con 5 asignaturas suspensas, con 4, con 3, con 2, con 1 y
 * con 0.
 * 
 * ◦ Nota media de cada una de las asignaturas con el siguiente formato:
 * 
 * - La nota media de PROGRAMACION es XX
 * 
 * - La nota media de BD es XX…..
 * 
 * NOTAS:
 * 
 * ◦ Para simplificar el ejercicio cargar las notas aleatoriamente.
 * 
 * ◦ Guardar las nombres de las asignaturas en un vector de String
 * 
 * @author Wargios
 *
 */
public class Main {
	// private Scanner teclado = new Scanner(System.in);
	private static final int NUM_ALUMNOS = 30;
	// private static final int NUM_ASIGNATURAS = 5;
	private static final String[] ASIGNATURAS = { "BADAT", "PROGR", "SIINF", "LMSGI", "ENDES" };

	public static void main(String[] args) {
		int[][] notas = new int[NUM_ALUMNOS][ASIGNATURAS.length];
		int[] suspensos = new int[ASIGNATURAS.length + 1];
		double[] medias = new double[ASIGNATURAS.length];

		introducirNotasAleatorias(notas);
		cuentaSuspendosArray(suspensos, notas);
		calcularMedias(medias, notas);

	}

	private static void calcularMedias(double[] medias, int[][] notas) {

		for (int posMedia = 0; posMedia < medias.length; posMedia++) {
			medias[posMedia] = 0;

			for (int i = 0; i < notas[0].length; i++) {

				for (int j = 0; j < notas.length; j++) {
					medias[i] += notas[j][i];
				}
				medias[i] = medias[i]/NUM_ALUMNOS ;
			}
		}
		
		for (int i = 0; i < medias.length; i++) {
			System.out.println("La media de "+ASIGNATURAS[i]+" es "+medias[i]);
		}
	}

	private static void introducirNotasAleatorias(int[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				notas[i][j] = introducirNotaAleatoria();
			}
		}
	}

	private static void cuentaSuspendosArray(int[] suspensos, int[][] notas) {
		int contadorSuspensos;

		for (int j = 0; j < notas.length; j++) {
			contadorSuspensos = 0;

			for (int j2 = 0; j2 < notas[0].length; j2++) {
				if (notas[j][j2] < 5)
					contadorSuspensos++;
			}

			suspensos[contadorSuspensos]++;
		}

		for (int i = suspensos.length; i > 0; i--) {
			System.out.println("Alumnos con " + (i - 1) + " asignaturas suspensas: " + suspensos[i - 1]);
		}
	}

	private static int introducirNotaAleatoria() {
		Random aleatorio = new Random();
		int nota = aleatorio.nextInt(10)+1;
		return nota;
	}
}
