/**
 * 
 * @author alumnodiurno
 *
 */
public class Complejo {

	private double parteReal, parteImaginaria;

	Complejo(double real, double img) {
		setReal(real); // parteReal= real
		setImaginario(img);
	}

	public void setReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public void setImaginario(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public double getReal() {
		return parteReal;
	}

	public double getImaginaria() {
		return parteImaginaria;
	}

	public Complejo sumar(Complejo otro) {
		double resReal, resImg;

		resReal = this.parteReal + otro.parteReal;
		resImg = this.parteImaginaria + otro.parteImaginaria;

		return new Complejo(resReal, resImg);
	}

	public Complejo restar(Complejo otro) {
		double resReal, resImg;

		resReal = this.parteReal - otro.parteImaginaria;
		resImg = this.parteReal - otro.parteImaginaria;

		return new Complejo(resReal, resImg);
	}

	public String toString() {
		return ("(" + parteReal + "," + parteImaginaria + "i)");

	}

}
