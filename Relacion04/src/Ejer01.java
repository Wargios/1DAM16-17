import java.util.Scanner;

public class Ejer01 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	private static int solicitarNumeroEnRango(int limiteInferior, int limiteSuperor){
		int num = 0;
		do {
			num = solicitarNum();
		} while (num < limiteInferior || num > limiteInferior);
		
		return num;
	}
	
	private static int solicitarNum(){
		return Integer.parseInt(teclado.nextLine());
	}
}
