import java.util.Scanner;

/**
 * 13. Realizar un programa que solicita 10 direcciones web y para cada una de
 * ellas informe si es o no válida. Las direcciones validas deben tener el
 * formato http:// www.direccion.com
 * 
 * ó
 * 
 * http://www.direccion.es
 * 
 * Donde dirección puede contener letras o números, al menos 1, la primera una
 * letra .
 * 
 * Ejemplo direcciones válidas:
 * 
 * http://www.elmundo.es
 * 
 * http://www.a.com
 * 
 * http://www.marca2.com
 * 
 * Ejemplo direcciones inválidas
 * 
 * http://www.2a.es
 * 
 * http://www.el mundo.es
 * 
 * http://www.com
 * 
 * h://www.elmundo.es
 * 
 * @author alumnodiurno
 *
 */
public class Ejer13 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		String direccion = solicitarDirecccion();
		
		if (comprobarDireccion(direccion)) 
			System.out.println("La direccion es válida.");
		else
			System.out.println("La direccion no es válida.");
			
		
		
	}
	
	private static String solicitarDirecccion(){
		
		System.out.println("Introduce una dirección web:");
		
		return teclado.nextLine();
		
	}
	
	private static boolean comprobarDireccion(String direccion){
		
		String inicio = "http://www.";
		String fin1 = ".es";
		String fin2 = ".com";
		String parteIntermedia;
		
		boolean esCorrecta = false;
		
		if(direccion.indexOf(inicio) == 0){
			
		
			
		}
		
		
		
		
		
		
		
		
		return esCorrecta;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
