import java.time.LocalDateTime;

public class Mensaje {
	private String texto;
	private LocalDateTime hora;
	private Persona remitente;

	public Mensaje(String texto, Persona remitente) {
		this.texto = texto;
		this.remitente = remitente;
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
}
