import java.time.LocalDateTime;

public class EntradaHistorial {
	private String url;
	private LocalDateTime fechaHora;

	public EntradaHistorial(String url) {
		this.url = url;

	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaHora == null) ? 0 : fechaHora.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		EntradaHistorial other = (EntradaHistorial) obj;
		if (fechaHora == null) {
			if (other.fechaHora != null)
				return false;
		} else if (!fechaHora.equals(other.fechaHora))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EntradaHistorial [url=" + url + ", fechaHora=" + fechaHora + "]";
	}

	
}
