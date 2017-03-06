
public class Main {

	public static void main(String[] args) {
		MatrizMatematica matrizMatematica = new MatrizMatematica(5, 5);
		MatrizMatematica matrizMatematica1 = new MatrizMatematica(5, 5);
		MatrizMatematica matrizMatematica2 = new MatrizMatematica(4, 2);

		System.out.println(matrizMatematica);

		if (matrizMatematica.buscarelemento(7))
			System.out.println("7 encontrado");
		else {
			System.out.println("7 no encontrado");
			matrizMatematica.setElemento(0, 0, 7);
			System.out.println("7 insertado en [0,0]");

			System.out.println(matrizMatematica);
		}
		if (matrizMatematica.equals(matrizMatematica1))
			System.out.println("son iguales");
		else
			System.out.println("no son iguales");

		try {
			System.out.println(matrizMatematica.getElemento(1, 1));
		} catch (MatrizException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nVAMOS A SUMAR");
		try {
			MatrizMatematica sumada = matrizMatematica.sumaMatrizes(matrizMatematica1);
			System.out.println(sumada);
			try {
				MatrizMatematica sumada2 = matrizMatematica.sumaMatrizes(matrizMatematica2);
				System.out.println(sumada2);
			} catch (MatrizException e) {
				System.out.println(e.getMessage());
			}

		} catch (MatrizException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nVAMOS A RESTAR");
		try {
			MatrizMatematica restada = matrizMatematica.restaMatrizes(matrizMatematica1);
			System.out.println(restada);
			try {
				MatrizMatematica restada2 = matrizMatematica.restaMatrizes(matrizMatematica2);
				System.out.println(restada2);
			} catch (MatrizException e) {
				System.out.println(e.getMessage());
			}

		} catch (MatrizException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Producto diagonal " + matrizMatematica.productoElementosDiagonalPpal());

	}

}
