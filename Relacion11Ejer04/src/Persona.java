import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Persona {

	private static final int EDAD_MINIMA = 12;

	// Atributos
	private String dni;
	private String nombre;
	private int edad;
	private LinkedList<Mensaje> buzon;

	// Constructor
	public Persona(String dni, String nombre, int edad) throws IESException {
		this.dni = dni;
		this.nombre = nombre;
		setEdad(edad);
	}

	// Métodos get y set
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	private void setEdad(int edad) throws IESException {
		if (edad < EDAD_MINIMA)
			throw new IESException("La edad minima es de" + EDAD_MINIMA);
		this.edad = edad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void enviarMensaje(Persona persona, String texto) {
		persona.buzon.add(new Mensaje(texto, this));

	}

	public String mostrarCorreos() throws IESException {
		StringBuilder sb = new StringBuilder();
		int contador = 1;

		if (buzon.size() == 0)
			throw new IESException("No hay mensajes");

		for (Mensaje mensaje : buzon) {
			sb.append("Mensaje " + contador + ": " + mensaje + "\n");
			contador++;
		}
		return sb.toString();

	}

	public String mostrarCorreosPorRemitente() throws IESException {
		ArrayList<Mensaje> mensajesOrdenados = obtenerListaOrdenada();
		StringBuilder sb = new StringBuilder();

		for (Mensaje mensaje : mensajesOrdenados) {
			sb.append("Mensaje: " + mensaje + "\n");

		}
		return sb.toString();
	}

	private ArrayList<Mensaje> obtenerListaOrdenada() throws IESException {
		if (buzon.size() == 0)
			throw new IESException("No hay mensajes");

		ArrayList<Mensaje> mensajesOrdenados;
		mensajesOrdenados = new ArrayList<>(buzon);

		Collections.sort(mensajesOrdenados);
		return mensajesOrdenados;
	}

	public void borrarMensaje(int numero) throws IESException {
		if (numero < 1 || numero > buzon.size())
			throw new IESException("Numero incorrecto.");
		buzon.remove(numero - 1);
	}

	public String buscarMensajes(String texto) {
		StringBuilder sb = new StringBuilder();
		int contador = 1;

		for (Mensaje mensaje : buzon) {
			if (mensaje.getTexto().contains(texto))
				sb.append("Mensaje " + contador + ": " + mensaje);
			contador++;
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

}