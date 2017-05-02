import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{
	private String texto;
	private LocalDateTime hora;
	private Persona remitente;

	public Mensaje(String texto, Persona remitente) {
		this.texto = texto;
		this.remitente = remitente;
		hora = LocalDateTime.now();
	}

	public Persona getRemitente() {
		return remitente;
	}

	public String getTexto() {
		return texto;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("De: " + getRemitente() + " Texto: " + getTexto() + " Fecha y hora: " + hora);
	}

	@Override
	public int compareTo(Mensaje otro) {
		return getRemitente().getNombre().compareTo(otro.getRemitente().getNombre());
	}
}
