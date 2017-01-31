
public class Jarra {
	private int capacidad;
	private int cantidadAgua;
	private static int totalAguaConsumida;

	public Jarra(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getCantidadAgua() {
		return cantidadAgua;
	}

	public static int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}

	public void llenar() {

	}

	public void vaciar() {

	}

	public void volcar(Jarra otra) {

	}

	public boolean equals(Jarra otra) {
		boolean resul = false;

		if (capacidad == otra.capacidad)
			resul = true;

		return resul;
	}

	public String toString() {
		return ("La jarra tiene "+ cantidadAgua+"/"+capacidad) ;
	}
}
