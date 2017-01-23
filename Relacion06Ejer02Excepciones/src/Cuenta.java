
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

	private void setSaldo(double saldo) throws CuentaException {
		if (saldo < 0) {
			throw new CuentaException("Error");
		} else
			this.saldo = saldo;
	}

	public void ingreso(double cantidad) throws CuentaException {
		if (cantidad <= 0) {
			throw new CuentaException("Error");
		} else {
			saldo += cantidad;
			numeroIngresos++;
		}
	}

	public void reintegro(double cantidad) throws CuentaException {
		if (cantidad > saldo) {
			throw new CuentaException("Error");
		} else {
			saldo -= cantidad;
			numeroReintegros++;
		}
	}
}
