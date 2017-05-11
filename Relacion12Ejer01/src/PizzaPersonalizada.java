import java.util.HashSet;

public class PizzaPersonalizada extends Pizza {
	private HashSet<Ingrediente> ingrediente;

	public PizzaPersonalizada(TipoTamanno tamanno) {
		super(tamanno);
		ingrediente = new HashSet<Ingrediente>();
	}

	public void annadirIngrediente(Ingrediente ingrediente) throws PizzaException {
		if(!this.ingrediente.add(ingrediente))
			throw new PizzaException("Ya se encuentra el ingrediente");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " Ingredientes: " + ingrediente.toString());
	}

}
