import java.util.Scanner;


public class PrincipalEjercicio4 {
	static Scanner teclado=new Scanner (System.in);

	public static void main(String[] args) {
		
		double parteReal, parteImaginaria;
		Complejo c1, c2;
		Complejo complejoSuma;
		
		System.out.println("Introduce los datos del primer complejo");
		
		parteReal=solicitarNum("Parte real:");
		parteImaginaria=solicitarNum("Parte imaginaria:");
		c1= new Complejo (parteReal, parteImaginaria);
		
		System.out.println("Introduce los datos del segundo complejo");
		parteReal=solicitarNum("Parte real:");
		parteImaginaria=solicitarNum("Parte imaginaria:");
		c2= new Complejo (parteReal, parteImaginaria);
		
		
		complejoSuma= c1.sumar(c2);
		
		System.out.println("El resultado de la suma es el complejo " + complejoSuma);
		System.out.println("El resultado de la resta es el complejo" + c1.restar(c2));
		
		
	}

	private static double solicitarNum(String texto) {
		double num;
		System.out.println(texto);
		num= Double.parseDouble(teclado.nextLine());
		return num;
	}
}
	