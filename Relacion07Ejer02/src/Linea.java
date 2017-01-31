
public class Linea {
	private Punto puntoInicial;
	private Punto puntoFinal;

	public Linea() {
		this.puntoFinal = new Punto(0, 0);
		this.puntoInicial = new Punto(0, 0);
	}

	public Linea(Punto puntoInicial, Punto puntoFinal) {
		setPuntoFinal(puntoFinal);
		setPuntoInicial(puntoInicial);
	}

	public Punto getPuntoInicial() {
		return puntoInicial;
	}

	public void setPuntoInicial(Punto puntoInicial) {
		this.puntoInicial = puntoInicial;
	}

	public Punto getPuntoFinal() {
		return puntoFinal;
	}

	public void setPuntoFinal(Punto puntoFinal) {
		this.puntoFinal = puntoFinal;
	}

	public boolean equals(Linea otro) {
		boolean resul = false;

		if (puntoInicial.equals(otro.puntoInicial) && puntoFinal.equals(otro.puntoFinal))
			resul = true;

		return resul;
	}
	
	public void mueveDerecha(double cantidad) {
		puntoInicial.setCoorX(puntoInicial.getCoorX()+cantidad);
		puntoFinal.setCoorX(puntoFinal.getCoorX()+cantidad);
	}
	
	public void mueveIzquierda(double cantidad) {
		puntoInicial.setCoorX(puntoInicial.getCoorX()-cantidad);
		puntoFinal.setCoorX(puntoFinal.getCoorX()-cantidad);
	}
	
	public void mueveArriba(double cantidad) {
		puntoInicial.setCoorY(puntoInicial.getCoorY()+cantidad);
		puntoFinal.setCoorY(puntoFinal.getCoorY()+cantidad);
	}
	
	public void mueveAbajo(double cantidad) {
		puntoInicial.setCoorY(puntoInicial.getCoorY()-cantidad);
		puntoFinal.setCoorY(puntoFinal.getCoorY()-cantidad);
	}
	
	
}
