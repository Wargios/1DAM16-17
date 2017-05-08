import java.util.HashSet;

public class Pedido {
	private HashSet<Pizza> pizzas;
	private String direccion;

	public Pedido(String direccion) {
		pizzas = new HashSet<Pizza>();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void annadirPizza(Pizza pizza) {
		pizzas.add(pizza);
	}

	@Override
	public String toString() {
		return "Pedido [Pizzas=" + pizzas + ", Direccion=" + direccion + "]";
	}
	
	
}
