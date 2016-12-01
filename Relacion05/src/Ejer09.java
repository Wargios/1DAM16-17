/**
 * 9. Realizar un programa que pida al usuario que introduzca un número y diga
 * si es capicúa (si se lee igual de derecha a izquierda que de izquierda a
 * derecha, como el 12321). Leer el número como cadena de texto.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer09 {
	
	public static void main(String[] args) {
		
	}
	
	private static boolean esCapicuo(String num){
		StringBuilder sbNum = new StringBuilder(num.length());
		sbNum.append(num);
		
		if (num.equals(sbNum)) {
			
		}
		
		return true;
	}
}
