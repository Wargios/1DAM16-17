/**
 * 7. Crear un método que, tomando una cadena de texto como entrada, construya y
 * devuelva otra cadena formada de la siguiente manera: el método debe colocar
 * todas las consonantes al principio y todas las vocales al final de la misma,
 * eliminando los blancos. Por ejemplo, pasándole la cadena "curso de
 * programacion", una posible solución sería "crsdprgrmcnuoeoaaio".
 * 
 * @author alumnodiurno
 *
 */
public class Ejer07 {
	public static void main(String[] args) {
		System.out.println(mostrarVocalesYConsonantes("Hola mundo"));
	}

	private static String mostrarVocalesYConsonantes(String cadena) {
		StringBuilder sbVocales = new StringBuilder();
		StringBuilder sbConsonantes = new StringBuilder();
		char c;
		String resultado;

		for (int i = 0; i < cadena.length(); i++) {

			c = cadena.charAt(i);

			if (Character.isLetter(c)) {
				if (esVocal(c))
					sbVocales.append(c);
				else
					sbConsonantes.append(c);

			}
		}

		resultado = sbConsonantes.toString() + sbVocales.toString();

		return resultado;
	}

	private static boolean esVocal(char c) {
		String vocales = "aeiou";
		boolean resul = false;

		if (vocales.indexOf(Character.toLowerCase(c)) != -1)
			resul = true;

		return resul;
	}

}
