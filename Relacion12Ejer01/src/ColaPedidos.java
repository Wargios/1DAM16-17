import java.util.LinkedList;

public class ColaPedidos {
	private LinkedList<Pedido> cola;

	public ColaPedidos() {
		cola = new LinkedList<Pedido>();
	}

	public void annadirPedido(Pedido pedido) {
		cola.add(pedido);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Total pedidos pendientes: " + cola.size());
	}

	public Pedido atenderPedido() {
		return cola.poll();
		
	}
}
