import java.util.Scanner;

/**
 * 4. Realizar un programa que solicite dos números enteros y muestre por
 * pantalla el máximo común divisor de los dos números.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer04Metodo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b, mcd = 0;

		System.out.println("Introduce dos números");
		a = solicitarNum(1);
		b = solicitarNum(2);

		mcd = calcularMcd(a, b, mcd);

		System.out.println(mcd);
	}

	private static int solicitarNum(int pos) {
		int num;
		System.out.println("("+pos+")");
		num= Integer.parseInt(teclado.nextLine());
		return num;
	}

	private static int calcularMcd(int a, int b, int mcd) {
		int limite;
		
		if (a < b)
			limite = b / 2 ;
		else
			limite = a / 2;

		for (int i = 1; i <= limite; i++) {
			if (a % i == 0 && b % i == 0)
				mcd = i;
		}
		return mcd;
	}

}
