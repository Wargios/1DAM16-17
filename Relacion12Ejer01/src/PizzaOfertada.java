
public class PizzaOfertada extends Pizza {
	private int numeroEspecialidad;

	public PizzaOfertada(TipoTamanno tamanno, int num) {
		super(tamanno);
		numeroEspecialidad = num;
	}

	public int getNumeroEspecialidad() {
		return numeroEspecialidad;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " Especialidad: " + numeroEspecialidad);
	}
}
