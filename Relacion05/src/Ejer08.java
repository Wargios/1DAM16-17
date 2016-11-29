/**
 * 8. Desarrollar un método que tenga como entrada una cadena de caracteres y
 * devuelva otra cadena donde se elimine los caracteres repetidos de la cadena
 * original, incluidos los blancos. Por ejemplo, pasándole la cadena "curso de
 * programacion" nos devolverá "curso depgamin".
 * 
 * @author alumnodiurno
 *
 */
public class Ejer08 {
	public static void main(String[] args) {
		System.out.println(devolverCadenaSinCaracteresRepetidos("curso de programacion"));
	}

	private static String devolverCadenaSinCaracteresRepetidos(String cad) {
		StringBuilder sbCadenaDevuelta = new StringBuilder();
		char c;

		for (int i = 0; i < cad.length(); i++) {
			c = cad.charAt(i);

			if (sbCadenaDevuelta.toString().indexOf(c) == -1)
				sbCadenaDevuelta.append(c);
		}

		return sbCadenaDevuelta.toString();
	}
}
