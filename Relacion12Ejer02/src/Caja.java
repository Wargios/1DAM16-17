import java.util.LinkedList;

public class Caja {
	private int numeroCaja;
	private boolean abierta;
	private LinkedList<Integer> colaCliente;

	public Caja(int numero) {
		numeroCaja = numero;
		colaCliente = new LinkedList<Integer>();
		abierta = false;
	}

	public LinkedList<Integer> getColaCliente() {
		return colaCliente;
	}

	public int getNumeroCaja() {
		return numeroCaja;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public void setNumeroCaja(int numeroCaja) {
		this.numeroCaja = numeroCaja;
	}
}
