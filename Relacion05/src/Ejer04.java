/**
 * Realizar un programa que busque una palabra escondida dentro de un texto. Por
 * ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es
 * “hola”, entonces si se encontrará.
 * 
 * @author Francisco José González Jiménez
 *
 */
public class Ejer04 {
	public static void main(String[] args) {
		String texto = "sdfhiuhyejkio";
		String palabra = "feo";

		if (buscarPalabraEscondida(texto, palabra))
			System.out.println("La palabra " + palabra + " ha sido encontrada.");
		else
			System.out.println("La palabra " + palabra + " no ha sido encontrada.");
	}

	private static boolean buscarPalabraEscondida(String texto, String palabraABuscar) {
		StringBuilder palabra = new StringBuilder(palabraABuscar.length());
		char c;
		boolean resul = false;
		int pos = 0;
		int i = 0;

		while (i < palabraABuscar.length() && pos >= 0) {

			c = palabraABuscar.charAt(i);
			pos = texto.indexOf(c, pos);

			if (pos != -1)
				palabra.append(c);

			i++;
		}

		if (palabra.toString().equals(palabraABuscar))
			resul = true;

		return resul;
	}
}
