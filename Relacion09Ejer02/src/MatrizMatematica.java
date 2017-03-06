import java.util.Random;

/**
 * 2. Realizar una Clase MatrizMatematica con al menos los métodos que se
 * indican. Se debe incluir una excepción propia para las condiciones de error:
 * 
 *  Constructor donde se indique el número de filas y columnas de la matriz. La
 * matriz se cargará con datos aleatorios
 * 
 *  Método toString
 * 
 *  Método equals (dos matrices son iguales si todos sus elementos son iguales)
 * 
 *  Método para cambiar un elemento de la matriz a través de su fila y columna
 * 
 *  Método para recuperar un elemento de una matriz a través de su fila y
 * columna.
 * 
 *  Método para sumar una matriz con otra. Debe devolver la matriz resultado de
 * la suma. Tener en cuenta que sólo se puede sumar dos matrices si tienen las
 * mismas dimensiones
 * 
 *  Idem para la resta de matrices
 * 
 *  Método para multiplicar un número por una matriz. La matriz original debe
 * modificarse multiplicando todos los elementos por ese número
 * 
 *  Método que busque un elemento en una matriz. Debe devolver un boolean
 * 
 *  Método que calcule el producto de todos los elementos de la diagonal
 * principal de la matriz
 * 
 *  Método que calcule el máximo elemento de una fila de una matriz
 * 
 * Realizar también el programa principal que pruebe estos métodos
 * 
 * @author Wargios
 *
 */
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

	public void setElemento(int fila, int columna, int valor) {
		matriz[fila][columna] = valor;
	}

	public int getElemento(int fila, int columna) {
		return matriz[fila][columna];
	}

	public MatrizMatematica sumaMatrizes(MatrizMatematica otra) throws MatrizException {
		if (!(matriz.length == otra.matriz.length && matriz[0].length == otra.matriz[0].length))
			throw new MatrizException("Error. Las matrices no tienen la misma longitud.");

		MatrizMatematica matrizSumada = new MatrizMatematica(matriz.length, matriz[0].length);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizSumada.matriz[i][j] = this.matriz[i][j] + otra.matriz[i][j];
			}
		}

		return matrizSumada;
	}

	public MatrizMatematica restaMatrizes(MatrizMatematica otra) throws MatrizException {
		if (!(matriz.length == otra.matriz.length && matriz[0].length == otra.matriz[0].length))
			throw new MatrizException("Error. Las matrices no tienen la misma longitud.");

		MatrizMatematica matrizRestada = new MatrizMatematica(matriz.length, matriz[0].length);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizRestada.matriz[i][j] = this.matriz[i][j] - otra.matriz[i][j];
			}
		}

		return matrizRestada;
	}

	public void multiplicarMatrizPorNumero(int num) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = matriz[i][j] * num;
			}
		}
	}

	public boolean buscarelemento(int num) {
		boolean resul = false;
		int i = 0;
		int j = 0;

		while (i < matriz.length && !resul) {
			while (j < matriz[0].length && !resul) {
				if (matriz[i][j] == num)
					resul = true;
				j++;
			}
			i++;
		}
		return resul;
	}
	
	public int productoElementosDiagonalPpal() {
		int longitudMinima = matriz.length; // entre filas y columnas
		int productoTotal = 1;
		
		if (longitudMinima > matriz[0].length)
			longitudMinima = matriz[0].length;

		for (int i = 0; i < longitudMinima; i++) {
			productoTotal = productoTotal*matriz[i][i];
		}
		return productoTotal;
	}

	public int calcularmMaximoElemento() {
		int max = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (max < matriz[i][j])
					max = matriz[i][j];
			}
		}
		return max;
	}

	public boolean equals(MatrizMatematica otra) {
		boolean resul = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] != otra.matriz[i][j])
					resul = false;
			}
		}
		return resul;
	}

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
