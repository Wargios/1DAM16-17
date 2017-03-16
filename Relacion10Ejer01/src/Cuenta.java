
public class Cuenta {
	protected double saldo;

	public Cuenta() {
		saldo = 0;
	}

	public Cuenta(double saldoInicial) throws CuentaException {
		if (saldoInicial < 0)
			throw new CuentaException("Error. El saldo no puede empezar con una cantidad negativa.");
		saldo = saldoInicial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void retirar(double dineroSacar) throws CuentaException {
		if (dineroSacar > saldo || dineroSacar < 0)
			throw new CuentaException("Error. No se puede sacar esa cantidad.");
		saldo -= dineroSacar;
	}

	public void ingresar(double dineroIngresar) throws CuentaException {
		if (dineroIngresar < 0)
			throw new CuentaException("Error. No puede ser negativo.");
		saldo += dineroIngresar;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}

}
