
public abstract class Pizza {
	private TipoTamanno tamanno;

	public Pizza(TipoTamanno tamanno) {
		this.tamanno = tamanno;
	}

	public TipoTamanno getTamanno() {
		return tamanno;
	}

	@Override
	public String toString() {
		return ("Pizza " + tamanno);
	}
}
