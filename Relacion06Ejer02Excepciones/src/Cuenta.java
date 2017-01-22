
public class Cuenta {
	private double saldo;
	private int numeroReintegros;
	private int numeroIngresos;

	public Cuenta(double saldo) throws CuentaException {
		setSaldo(saldo);
	}

	public Cuenta() {
		saldo = 0;
	}

	public int getNumeroReintegros() {
		return numeroReintegros;
	}

	public int getNumeroIngreso() {
		return numeroIngresos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws CuentaException {
		if (saldo < 0) {
			throw new CuentaException("Error");
		} else
			this.saldo = saldo;
	}

	public void ingreso(double cantidad) {
		if (cantidad <= 0) {
			// Excepcion
			System.out.println("Error");
		} else {
			saldo += cantidad;
			numeroIngresos++;
		}
	}

	public void reintegro(double cantidad) {
		if (cantidad > saldo) {
			// Excepcion
			System.out.println("Error");
		} else {
			saldo -= cantidad;
			numeroReintegros++;
		}
	}
}
