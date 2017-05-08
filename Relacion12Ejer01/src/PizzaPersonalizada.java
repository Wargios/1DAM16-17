import java.util.ArrayList;

public class PizzaPersonalizada extends Pizza {
	private ArrayList<Ingredientes> ingredientes;

	public PizzaPersonalizada(TipoTamanno tamanno) {
		super(tamanno);
		ingredientes = new ArrayList<Ingredientes>();
	}

	public void annadirIngrediente(int num) {
		switch (num) {
		case 1:
			ingredientes.add(Ingredientes.BACON);
			break;
			
		case 2:
			ingredientes.add(Ingredientes.CEBOLLA);
			break;
			
		case 3:
			ingredientes.add(Ingredientes.CHAMPINNONES);
			break;
			
		case 4:
			ingredientes.add(Ingredientes.CHORIZO);
			break;
			
		case 5:
			ingredientes.add(Ingredientes.HUEVO);
			break;
			
		case 6:
			ingredientes.add(Ingredientes.PIMIENTO);
			break;
			
		case 7:
			ingredientes.add(Ingredientes.ROQUEFORT);
			break;
			
		case 8:
			ingredientes.add(Ingredientes.SALCHICHAS);
			break;

		default:
			
			break;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " Ingredientes: " + ingredientes.toString());
	}
}
