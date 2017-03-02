import java.util.Random;

public class MatrizMatematica {
	private int[][] matriz;

	public MatrizMatematica(int filas, int columnas) {
		matriz = new int[filas][columnas];
		cargarMatriz();
	}

	private void cargarMatriz() {
		Random rnd = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = rnd.nextInt(100);

			}
		}
	}
	
	

	@Override
	public String toString() {
		StringBuilder sbCadena = new StringBuilder();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				sbCadena.append(matriz[i][j]);
				if (j != matriz.length - 1)
					sbCadena.append("\t");
			}
			if (i != matriz.length - 1)
				sbCadena.append("\n");

		}
		return sbCadena.toString();
	}

}
