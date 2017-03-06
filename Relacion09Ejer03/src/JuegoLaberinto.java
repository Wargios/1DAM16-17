/**
 * FALTA CONTROLAR QUE NO ATRAVIESE PAREDES
 * @author Wargios
 *
 */
public class JuegoLaberinto {
	private char[][] laberinto;
	private int jugador[];
	private static final int[] META = new int[] { 10, 8 };

	public JuegoLaberinto() {
		jugador = new int[] { 0, 1 };
		laberinto = new char[][] { //
				{ 'X', 'J', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, // 0
				{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, // 1
				{ 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X' }, // 2
				{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X' }, // 3
				{ 'X', 'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X', 'X', 'X' }, // 4
				{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X' }, // 5
				{ 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X' }, // 6
				{ 'X', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, // 7
				{ 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, // 8
				{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, // 9
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', 'X' } }; // 10
	}

	/**
	 * Devuelve verdadero si alcanzas la meta
	 * 
	 * @param tecla
	 * @return
	 * @throws JuegoException
	 */
	public boolean moverJugador(char tecla) throws JuegoException {
		boolean hasGanado = false;
		int[] anteriorPos;
		tecla = Character.toUpperCase(tecla);

		if (!(tecla == 'W' || tecla == 'A' || tecla == 'S' || tecla == 'D'))
			throw new JuegoException("Tecla de movimiento incorrecta");

		anteriorPos = jugador.clone();

		if (tecla == 'W') {
			if (jugador[0] - 1 < 0)
				throw new JuegoException("Esa posicion está fuera del laberinto");

			jugador[0] = jugador[0] - 1;

		} else if (tecla == 'A') {
			if (jugador[1] - 1 < 0)
				throw new JuegoException("Esa posicion está fuera del laberinto");

			jugador[1] = jugador[1] - 1;

		} else if (tecla == 'S') {
			if (jugador[0] + 1 >= laberinto.length)
				throw new JuegoException("Esa posicion está fuera del laberinto");

			jugador[0] = jugador[0] + 1;

		} else { // 'D'
			if (jugador[1] + 1 >= laberinto[0].length)
				throw new JuegoException("Esa posicion está fuera del laberinto");

			jugador[1] = jugador[1] + 1;

		}

		actualizarActualPos(anteriorPos);

		if (jugador[0] == META[0] && jugador[1] == META[1])
			hasGanado = true;
		return hasGanado;

	}

	private void actualizarActualPos(int[] anteriorPos) {
		laberinto[anteriorPos[0]][anteriorPos[1]] = ' ';
		laberinto[jugador[0]][jugador[1]] = 'J';

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				sb.append(laberinto[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
