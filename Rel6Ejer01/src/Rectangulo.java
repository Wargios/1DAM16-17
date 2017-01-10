
public class Rectangulo {

	private int ancho;
	private int longitud;

	// Constructores
	// este contructor no lo pide
	public Rectangulo(int ancho, int longitud) {
		setAncho(ancho);
		setLongitud(longitud);
	}

	public Rectangulo() {
		ancho = 1;
		longitud = 1;
	}

	// Gets y sets
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho < 0 || ancho > 20) {
			// excepcion
			System.out.println("Valor introducido incorrecto");
		} else
			this.ancho = ancho;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		if (longitud < 0 || longitud > 20) {
			// excepcion
			System.out.println("Valor introducido incorrecto");
		} else
			this.longitud = longitud;
	}

	// Metodos
	public int calcularPerimetro() {
		int perimetro = longitud * 2 + ancho * 2;
		return perimetro;
	}

	public int calcularArea() {
		int area = ancho * longitud;
		return area;
	}

}
