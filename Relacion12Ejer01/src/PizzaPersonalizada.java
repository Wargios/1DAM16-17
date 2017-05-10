import java.util.ArrayList;

public class PizzaPersonalizada extends Pizza {
	private ArrayList<Ingrediente> ingrediente;

	public PizzaPersonalizada(TipoTamanno tamanno) {
		super(tamanno);
		ingrediente = new ArrayList<Ingrediente>();
	}

	public void annadirIngrediente(Ingrediente ingrediente) {
		this.ingrediente.add(ingrediente);
//		 switch (ingrediente) {
//		 case 1:
//		 ingredientes.add(Ingrediente.BACON);
//		 break;
//		
//		 case 2:
//		 ingredientes.add(Ingredientes.CEBOLLA);
//		 break;
//		
//		 case 3:
//		 ingredientes.add(Ingrediente.CHAMPINNONES);
//		 break;
//		
//		 case 4:
//		 ingrediente.add(Ingrediente.CHORIZO);
//		 break;
//		
//		 case 5:
//		 ingrediente.add(Ingredientes.HUEVO);
//		 break;
//		
//		 case 6:
//		 ingrediente.add(Ingrediente.PIMIENTO);
//		 break;
//		
//		 case 7:
//		 ingrediente.add(Ingrediente.ROQUEFORT);
//		 break;
//		
//		 case 8:
//		 ingredientes.add(Ingredientes.SALCHICHAS);
//		 break;
//		
//		 default:
//		
//		 break;
//		 }
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " Ingredientes: " + ingrediente.toString());
	}

}
