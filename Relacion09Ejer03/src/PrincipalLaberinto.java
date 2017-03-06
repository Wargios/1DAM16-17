import java.util.Scanner;

public class PrincipalLaberinto {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		JuegoLaberinto laberinto = new JuegoLaberinto();
		boolean ganaste = false;
		
		do {
			System.out.println(laberinto);
			try {
				ganaste = laberinto.moverJugador(teclado.nextLine().charAt(0));
			} catch (JuegoException e) {
				System.out.println(e.getMessage());
			}
		} while (!ganaste);
		System.out.println("HAS GANADO!!");

	}

}
