import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ◦ Se mostrará un menú con estas opciones:
 * 
 * 1. Enviar un mensaje a una persona : Se solicitará el DNI de la persona que
 * envía y el DNI de la persona destinataria. Si existen se solicitará el texto
 * del mensaje y se procederá al envío.
 * 
 * 2. Leer correos : Se solicitará el DNI de la persona que quiere leer su
 * correo y se mostrarán por pantalla sus correos de más a menos reciente.
 * 
 * 3. Leer correos ordenados por remitente : Se solicitará el DNI de la persona
 * que quiere leer su correo y se mostrarán por pantalla.
 * 
 * 4. Borrar correo : Se solicitará el DNI de la persona . A continuación se
 * mostrarán todos su correos de más a menos reciente y se solicitará el el
 * número de correo que se quiere borrar. Si existe se borrará.
 * 
 * 5. Buscar correos : Se solicitará el DNI de la persona y la frase que se
 * desea buscar en su correo y se mostrarán por pantalla los mensajes que
 * contienen esa frase.
 * 
 * 
 * 6. Salir .
 * 
 * @author alumnodiurno
 *
 */
public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		ArrayList<Persona> instituto = new ArrayList<Persona>();

		try {
			instituto.add(new Profesor("1", "profe1", 30));
			instituto.add(new Profesor("2", "profe2", 30));
			

		} catch (IESException e) {
			System.out.println(e.getMessage());
		}

		
		do {
			opcion = Integer.parseInt(teclado.nextLine());
			try {
				mostrarMenu();
				tratarMenu(opcion, instituto);
			} catch (IESException e) {
				System.out.println(e.getMessage());
			}
		} while (opcion != 6);

	}

	private static void mostrarMenu() {
		System.out.println("Menu:");
		System.out.println("1. Enviar un mensaje a una persona");
		System.out.println("2. Leer correos");
		System.out.println("3. Leer correos ordenados por remitente");
		System.out.println("4. Borrar correo");
		System.out.println("5. Buscar correos");
		System.out.println("6. Salir");
	}

	private static void tratarMenu(int opcion, ArrayList<Persona> instituto) throws IESException {
		String dniRemitente, dniDestinatario, texto;
		Persona persona;

		switch (opcion) {
		case 1:
			dniRemitente = solicitarString("Introduce el DNI del remitente:");
			dniDestinatario = solicitarString("Introduce el DNI del destinatario:");
			texto = solicitarString("Introduce el texto:");
			buscarPersona(dniRemitente, instituto).enviarMensaje(buscarPersona(dniDestinatario, instituto), texto);
			break;

		case 2:
			dniDestinatario = solicitarString("DNI de la persona:");
			persona = buscarPersona(dniDestinatario, instituto);
			System.out.println(persona.mostrarCorreos());
			break;

		case 3:
			dniDestinatario = solicitarString("DNI de la persona:");
			persona = buscarPersona(dniDestinatario, instituto);
			System.out.println(persona.mostrarCorreosPorRemitente());
			break;

		case 4:
			dniDestinatario = solicitarString("DNI de la persona:");
			persona = buscarPersona(dniDestinatario, instituto);
			System.out.println(persona.mostrarCorreos());
			persona.borrarMensaje(solicitarInt("Número del mensaje a borrar:"));
			
			break;

		case 5:
			dniDestinatario = solicitarString("DNI de la persona:");
			persona = buscarPersona(dniDestinatario, instituto);
			persona.buscarMensajes(solicitarString("Texto a buscar: "));
			break;

		case 6:
			System.out.println("Adiós");
			break;

		default:
			System.out.println("Opcion no válida");
			break;
		}
	}

	private static int solicitarInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}

	private static String solicitarString(String msg) {
		System.out.println(msg);
		return teclado.nextLine();

	}

	private static Persona buscarPersona(String dni, ArrayList<Persona> instituto) throws IESException {
		Persona persona = null;
		boolean encontrado = false;
		Iterator<Persona> it = instituto.iterator();

		while (it.hasNext() && !encontrado) {
			persona = (Persona) it.next();
			if (persona.getDni().equals(dni))
				encontrado = true;
		}

		if (!encontrado)
			throw new IESException("Persona no encontrada");

		return persona;
	}

}
